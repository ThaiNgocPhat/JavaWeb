package ra.baitap2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showUserData")
public class UserDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Khởi tạo đối tượng UserData với dữ liệu cố định
        UserData user = new UserData(1, "name", "name@gmail.com", 18);

        // Lưu đối tượng vào request scope
        request.setAttribute("user", user);

        // Chuyển tiếp đến trang JSP
        request.getRequestDispatcher("/displayUserData.jsp").forward(request, response);
    }
}

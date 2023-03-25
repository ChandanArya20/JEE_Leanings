package in.ineuron;

import java.io.*;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/File")
public class FileSendingToClient extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("image/png");
		
		File file=new File("C:\\Users\\Chandan\\JEE\\MyApp\\src\\main\\java\\in\\ineuron\\image.png");
		FileInputStream fis= new FileInputStream(file);
		
		byte[] data=new byte[(int) file.length()];
		fis.read(data);		//reading from file to byte[]
		
		ServletOutputStream stream=response.getOutputStream();
		stream.write(data);  //writing from byte[] to response
		
		stream.flush();
		stream.close();
		fis.close();
		
	}

}

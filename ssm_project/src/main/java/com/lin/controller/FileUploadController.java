package com.lin.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lin.domain.User;
import com.lin.service.UserService;


@Controller
public class FileUploadController {
	
//	@Resource
//	private UserService userService;
//	
//
//	@RequestMapping("/success")  
//    public ModelAndView gettest(HttpServletRequest request){    
//		String path = request.getParameter("path") + "2222";
//		ModelAndView mav = new ModelAndView("success"); 
//		User user = userService.selectUserById(1);
//	    mav.addObject("user", user); 
//	    mav.addObject("path", path);
//        return mav;  
//    }  
	
//
//	/*
//     * 通过流的方式上传文件
//     * @RequestParam("file") 将name=file控件得到的文件封装成CommonsMultipartFile 对象
//     */
//    @RequestMapping("/success")
//    public String  fileUpload(@RequestParam("file") CommonsMultipartFile file) throws IOException {
//         
//         
//        //用来检测程序运行时间
//        long  startTime=System.currentTimeMillis();
//        System.out.println("fileName："+file.getOriginalFilename());
//         
//        try {
//            //获取输出流
//            OutputStream os=new FileOutputStream("E:/"+new Date().getTime()+file.getOriginalFilename());
//            //获取输入流 CommonsMultipartFile 中可以直接得到文件的流
//            InputStream is=file.getInputStream();
//            int temp;
//            //一个一个字节的读取并写入
//            while((temp=is.read())!=(-1))
//            {
//                os.write(temp);
//            }
//           os.flush();
//           os.close();
//           is.close();
//         
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        long  endTime=System.currentTimeMillis();
//        System.out.println("方法一的运行时间："+String.valueOf(endTime-startTime)+"ms");
//        return "success.jsp"; 
//    }
	
	@RequestMapping("/testFileUpload")
	public String testFileUpload(@RequestParam("desc") String desc,@RequestParam("file")MultipartFile file)throws IOException {
		 System.out.println("desc："+desc);
		 System.out.println("fileName："+file.getOriginalFilename());
		 try {
           //获取输出流
           OutputStream os=new FileOutputStream("E:/"+new Date().getTime()+file.getOriginalFilename());
           //获取输入流 CommonsMultipartFile 中可以直接得到文件的流
           InputStream is=file.getInputStream();
           int temp;
           //一个一个字节的读取并写入
           while((temp=is.read())!=(-1))
           {
               os.write(temp);
           }
          os.flush();
          os.close();
          is.close();
        
       } catch (FileNotFoundException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
		return "success";
	}
	
}

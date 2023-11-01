package Java_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
    @Test
	public  void a2() {
    	 System.out.println("Hello a2 Method");
     } 
     
     
    @BeforeTest
	public  void b() {
    	 System.out.println("Hello b Method");
     }
     
     @BeforeSuite
     public  void c() {
     	 System.out.println("Hello c Method");
      }
    @AfterMethod
 	public  void d() {
     	 System.out.println("Hello d Method");
      }
     
    @BeforeClass
  	public  void e() {
      	 System.out.println("Hello e Method");
       }
     
    @AfterTest
  	public  void f() {
      	 System.out.println("Hello f Method");
       }

     
    @AfterClass
  	public  void g() {
      	 System.out.println("Hello g Method");
     }
      	 
    @BeforeMethod
   	public  void h() {
      	 System.out.println("Hello h Method");
           }

    @AfterSuite
  	public  void i() {
      	 System.out.println("Hello i Method");
       }
     
    @Test 
  	public  void a1() {
      	 System.out.println("Hello a1 Method");
       }
      

      



}

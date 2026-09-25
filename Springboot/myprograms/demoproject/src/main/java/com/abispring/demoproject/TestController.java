package com.abispring.demoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
		@GetMapping("/test")
		public String test() {
			return "<h1>Hello Springboot</h1>";
		}
	@GetMapping("/abi")
		public String add() {
		int a=199;
		int b=60;
		return "<h3>Total of "+a+"and "+b+":"+(a+b)+"</h3>";
	}
	public int myfunction(int a,int b) {
		return a+b;
	}
	@GetMapping("/args")
	public String myAdd() {
		return "<h1>Result:"+myfunction(100,300)+"</h1>";
	}
	int sarr(int[] myarr) {
		int len=myarr.length;
		int sum=0;
		for(int i=0;i<len;i++) {
			sum=sum+myarr[i];
		}
		return sum;
	}
	
	@GetMapping("/arrsum")
	public String funArrSum() {
		int arr[]= {11,22,33,44,55,66};
		int arrtot=sarr(arr);
		return "Length of Array : "+arr.length+"<h2>Sum Of Array : "+arrtot+"</h2>";
	}
	
	//runtime data from url with parameters
	@GetMapping("/app/v1/{id}")
	public String showArgs(@PathVariable Long id ) {
		long data=id;
		return "<h1> Your URL runtime data:"+data+"</h1>";
	}
	
	@GetMapping("/objdata")
	public String showObjectsData() 
	{
		Person p1=new Person("Abinaya",22);
		Person p2=new Person("Pavya",22);
		Person p3=new Person("Birundha",20);
		Person p4=new Person("Nisanth",21);
		Person p5=new Person("Jeeva",23);
		/*String data=p1.getSname()+"------>"+p1.getAge();
		data=data+"<br>"+p2.getSname()+"------>"+p2.getAge();
		data=data+"<br>"+p3.getSname()+"------>"+p3.getAge();
		return "<font color='green' size='6'>Person's information:<br>"+data+"</font>";*/
		
		Person  p [] = {p1,p2,p3,p4,p5};
		String ans="<table border='2' bgcolor='skyblue' cellpadding='6' cellspacing='2' align='center'><tr><th>Sno</th><th>Student Name</th><th>Age</th><tr>";
		for(int i=0;i<p.length;i++) {
		ans =ans+"<tr><td>"+(i+1)+"</td><td>"+p[i].getSname()+"</td><td>"+p[i].getAge()+"</td></tr>";
		}
		return ans+"</table>";
	}
}

	
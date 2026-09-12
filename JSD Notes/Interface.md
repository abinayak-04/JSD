## Interface
- overriding purpose

*Syntax*
```java
	interface interfacename1
	{
		variable define only; // should not private or protected
		ex: int mark=100;
		method incomplement only;
		ex:
		void dis1();
		
	}

	interface interfacename2
	{

		void dis2();
	}
	class classname implements interface1,interface2
	{
		//override methods
		public void dis1()
		{

		}
		public void dis2()
		{

		}
	}
```
**Note**
- we can't create object for interface
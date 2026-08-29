use jsd;
#create table stud(rno int primary key auto_increment,sname varchar(25),mark int)auto_increment=1001;
#insert into stud(sname,mark) values('abi',100),('pavya',100),('nisanth',100),('sweatha',100);
#delete from stud;
#truncate table stud;
#drop table stud;
#select * from stud;

#create table test(rno int primary key,accno int unique key,cname varchar(25));
#insert into test (rno,accno,cname) values(1001,null,'abi');
#select * from test;

create table sales(pno int primary key auto_increment,pname varchar(20),sales_date_time timestamp default current_timestamp);
insert into sales(pname)values('mobile'),('airpods');
select * from sales;
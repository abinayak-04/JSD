use jsd;
#check
#create table testmark(sno int,sname varchar(25),mark int check(mark>=0 and mark<=100));
#insert into testmark values(1002,'pavi',100);
#select * from testmark;

#not null
#create table testnull(sno int,sname varchar(25) not null,mark int);
#insert into testnull values(1001,'abi',100);
#insert into testnull values(1001,null,100); #shows error sname cannot be null
#select * from testnull;

#foriegn key
#create table test1(rno int primary key,sname varchar(22),mark int);
#create table test2(rno int primary key,sname varchar(20),mark int,foreign key(rno) references test1(rno));
#insert into test1 values(1001,'abi',100),(1002,'birns',90),(1003,'sweath',85),(1004,'jon',78);
#select * from test1;
#insert into test2 values(1001,'abi',100),(1002,'birns',90),(1003,'sweath',85),(1004,'jon',78);
#insert into test2 values(1005,'nivi',79); #shows error bcoz 1005 is not in test1 table
select * from test2;

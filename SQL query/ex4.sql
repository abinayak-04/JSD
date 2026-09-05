use jsd;
create table task (Regno int primary key auto_increment,name varchar(25),mark int);
insert into task (name,mark)values('abi',89),('pooji',78),('pavya',90),('nisanth',100),('ashi',94);
select * from task where mark=(select max(mark)from task);
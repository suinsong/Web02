
create table member(
num int primary key not null auto_increment,
irum varchar(10) not null,
age int not null,
email varchar(20),
intro varchar(2000)


);

select * from member;

delete from member where num=6;

drop table member;
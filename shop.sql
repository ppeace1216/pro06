select * from customer;
desc customer;

create table board (
	bno int primary key, title varchar(50), content varchar(1000), resdate date default sysdate, hits int default 0
);
create sequence beq INCREMENT by 1 start with 1;
insert into board values (beq.nextval, '제목 1111', '내용 11111111111', sysdate, default);
select * from board;
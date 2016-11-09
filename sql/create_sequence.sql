-- sequences


-- book_seq
drop sequence book_seq;

create sequence book_seq
start with 1
increment by 1
maxvalue 9999999999;

-- category_seq
drop sequence category_seq;

create sequence category_seq
start with 1
increment by 1
maxvalue 9999999999;

-- member_seq
drop sequence member_seq;

create sequence member_seq
start with 1
increment by 1
maxvalue 9999999999;

-- orders_seq
drop sequence orders_seq;

create sequence orders_seq
start with 1
increment by 1
maxvalue 9999999999;

select orders_seq.nextval from dual;
select orders_seq.currval from dual;

alter sequence orders_seq start with 99;

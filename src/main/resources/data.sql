insert into user_details(id,birth_date,name,password)
values(1001,current_date(),'Marco', 'encryptedPassword_1001');

insert into user_details(id,birth_date,name,password)
values(1002,current_date(),'Reader', 'encryptedPassword_1002');

insert into post(id,content,user_id)
values(2001,'Imagine buying Twitter',1001);

insert into post(id,content,user_id)
values(2002,'Share this article',1002);
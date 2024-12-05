create table if not exists conditional_consuming_user_account(
condition_expression_owner Integer not null,
condition_expression_name varchar(255) null,
first_name varchar(255) null,
last_name varchar(255) null,
email_address varchar(255) null,
locale Integer null,
country_code varchar(255) null,
is_privileged varchar(255) null,
last_login varchar(255) null,
contact_id Integer null,
address_id varchar(255) null,
user_grp varchar(255) null,
request_type varchar(255) null,
constraint conditional_consuming_user_account_pk primary key(condition_expression_owner));
create table if not exists conditional_consuming_account_response(
condition_expression_id Integer not null,
condition_expression_owner varchar(255) null,
active_account char null,
condition_expression_type_id Integer null,
condition_expression_type varchar(255) null,
condition_expression_status varchar(255) null,
condition_expression_description Integer null,
authorizer_count Integer null,
auth_country varchar(255) null,
auth_region_code Integer null,
exceptions varchar(255) null,
status varchar(255) null,
remarks varchar(255) null,
constraint conditional_consuming_account_response_pk primary key(condition_expression_id));
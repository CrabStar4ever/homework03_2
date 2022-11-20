-- Create table
create table COFFEE
(
  id    VARCHAR2(36) not null,
  name  VARCHAR2(20),
  price NUMBER(6,2)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
-- Create/Recreate primary, unique and foreign key constraints
alter table COFFEE
  add primary key (ID)
  using index
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

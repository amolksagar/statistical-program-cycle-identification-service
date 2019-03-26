USE `byo`;
CREATE TABLE IF NOT EXISTS STATISTICAL_PROGRAM (
  id varchar(3) NOT NULL,
  programdurationinyrs decimal(5,2) NOT NULL,
  description varchar(100) NOT NULL,
  createdDate datetime NOT NULL ,
   PRIMARY KEY (id)
) ENGINE=INNODB;

insert into STATISTICAL_PROGRAM (id,programdurationinyrs,description,createdDate) 
values ('XYZ',2,'Prg-2016','2012-09-17 18:47:52');
insert into STATISTICAL_PROGRAM (id,programdurationinyrs,description,createdDate) 
values ('ABC',5,'Prg-2017','2016-09-16 18:47:52');
insert into STATISTICAL_PROGRAM (id,programdurationinyrs,description,createdDate) 
values ('QRT',3.4,'Prg-2018','2012-09-12 18:47:52');

select * from STATISTICAL_PROGRAM;

CREATE TABLE IF NOT EXISTS STATISTICAL_PROGRAM_CYCLE (
  id varchar(4) NOT NULL,
  programcycledurationinmonths decimal(5,2) NOT NULL,
  description varchar(100) NOT NULL,
  createdDate datetime NOT NULL ,
   PRIMARY KEY (id)
) ENGINE=INNODB;

insert into STATISTICAL_PROGRAM_CYCLE (id,programcycledurationinmonths,description,createdDate) 
values ('XYZC',2,'Prg-2016','2012-09-17 18:47:52');
insert into STATISTICAL_PROGRAM_CYCLE (id,programcycledurationinmonths,description,createdDate) 
values ('ABCC',5,'Prg-2017','2016-09-16 18:47:52');
insert into STATISTICAL_PROGRAM_CYCLE (id,programcycledurationinmonths,description,createdDate) 
values ('QRTC',3.4,'Prg-2018','2012-09-12 18:47:52');

select * from STATISTICAL_PROGRAM_CYCLE;
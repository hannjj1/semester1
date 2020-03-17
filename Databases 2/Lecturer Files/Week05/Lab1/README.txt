To use this in sqlite
This is assuming the .sql files are the same directory that you want the sqlite database
NB the greater-than character ">" indicates a prompt - do not type this

1) create the database:
> sqlite3.exe student.sqlite

2) Read in the schema file
> .read student-schema.sql

3) read in the data file
> .read student-data.sql

4) confirm that the tables are created
> .tables

5) check the data exists in the tables
> select * from ITP;
> select * from Student;
> select * from Apply;
 
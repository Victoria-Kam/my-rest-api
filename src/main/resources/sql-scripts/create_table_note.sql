create table note(
                     idnote serial primary key,
                     title varchar(50),
                     content varchar(255),
                     date varchar(50),
                     idauthor int
)
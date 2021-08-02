CREATE TABLE Persons (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    username varchar(128),
    fullName varchar(128),
    email varchar(128),
    dateOfBirth varchar(10),
    gender varchar(64),
    rawImage varchar(102400)
)

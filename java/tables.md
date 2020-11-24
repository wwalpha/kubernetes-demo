CREATE TABLE Hotel ( 
   id BIGINT NOT NULL, 
   name VARCHAR(200) NOT NULL, 
   stars INT NOT NULL
);

CREATE TABLE Room ( 
   id BIGINT NOT NULL, 
   hotel_id INT NOT NULL, 
   room_no VARCHAR(10) NOT NULL, 
   room_type CHAR(1) NOT NULL,
   cost INT NOT NULL,
   beds INT
);
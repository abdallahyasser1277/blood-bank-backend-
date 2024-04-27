# blood-bank-backend-
the auther is only me.
this is back end of blood bank web project.
code writen by intellij idea using spring boot and mongo db.

# API Documentation 


Base URL 
http://localhost:8080/api/v1

Models 
1.	Admin
2.	Donor
3.	Recipient
4.	Contactor Message
5.	camp


Admin

admin Model
Variable Name 	Data Type	Description
id	string	The unique identifier by which to identify the user
name	string	The first name of the user, defined by the user
email	string	The email of the user, defined by the user
password	string	The password of the user, defined by the user

Admin endPoint
Endpoint	Method
/admin/login	POST

Json format if login with correct data admin
{
    "message": "success",
    "error": "no errors",
    "token": {
        "name": "ali",
        "email": "ali@gmail.com",
        "password": "ali"
    }
}

Json format if login with wrong data admin
{
    "message": "error",
    "error": "email or password not found  ",
    "token": null
}




Donor

Donor Model
Variable name	Data Type	Description
id	string	The unique identifier by which to identify the mongoDB
name	string	The first name of the user, defined by the user
age	int	The age of the user, defined by the user
gender	string	The gender of the user, defined by the user
mobile	string	The mobile of the user, defined by the user
to_day	string	The Date when the user will net be a donor any more
city	string	The city of the user, defined by the user
bloodGroup	string	The blood group of the user, defined by the user

Donor endPoints
End Point	Method
/donor	GET
/donor	POST
/donor/{id}	DELETE

Get Response
[
    {
        "id": "63ad5e820f407d07ca495375",
        "name": "abdallah",
        "age": 30,
        "gender": "male",
        "mobile": "+201023684509",
        "to_day": "2022-12-18",
        "city": "El-Fayoum",
        "bloodGroup": "O+"
    }
]

Get Response
{
    "message": "success"
}

Delete Response
{
    "message": "success"
}
Recipient
Recipient Model
Variable name	Data Type	Description
id	string	The unique identifier by which to identify the mongoDB
name	string	The first name of the user, defined by the user
age	int	The age of the user, defined by the user
gender	string	The gender of the user, defined by the user
mobile	string	The mobile of the user, defined by the user
to_day	string	The Date when the user will net be a donor any more
city	string	The city of the user, defined by the user
bloodGroup	string	The blood group of the user, defined by the user

Recipient endPoints
End Point	Method
/ Recipient	GET
/ Recipient	POST
/ Recipient/{id}	DELETE

Get Response
[
    {
        "id": "63acb732b919d00f5ec17dcb",
        "name": "abdallah",
        "age": 22,
        "gender": "male",
        "mobile": "+201023684509",
        "to_date": "2022-12-07T14:41",
        "city": "El-Fayoum",
        "bloodGroup": "AB+"
    }
]

Post Response
{
    "message": "success"
}

Delete Response
{
    "message": "success"
}
Camp
Camp Model
Variable name	Data Type	Description
id	string	The unique identifier by which to identify the mongoDB
title	string	The title of the camp, defined by the admin
city	string	The city of the camp, defined by the admin
map	string	The place of the camp, defined by the admin

Camp endPoints
End Point	Method
/ camp	GET
/ camp	POST
/ camp/{id}	DELETE

Get Response
[
    {
        "id": "63acaeba33bd676cb63c5ff7",
        "title": "first camp",
        "city": "fayoum",
        "map": "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d27875.666079381772!2d30.758848205673715!3d29.151165291783546!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x145bd6ca671b0f65%3A0xa83333db3d118787!2sTutun%2C%20Taton%2C%20Atsa%2C%20Faiyum%20Governorate!5e0!3m2!1sen!2seg!4v1672231437500!5m2!1sen!2seg\" width=\"500\" height=\"225\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>"
    },

Post Response
{
    "message": "success"
}

Delete Response
{
    "message": "success"
}


Contactor
Contactor Model
Variable name	Data Type	Description
id	string	The unique identifier by which to identify the mongoDB
name	string	The first name of the user, defined by the user
email	string	The email of the user, defined by the user
mobile	string	The mobile of the user, defined by the user
created_at 	string	The date of the contactor request, defined by the system

Recipient endPoints
End Point	Method
/ Contactor	GET
/ Contactor	POST
/ Contactor/{id}	DELETE

Get Response
[
    {
        "id": "63ac8642837db84fa245363b",
        "name": "abdallah",
        "email": "abdallahyasser1277@gmail.com",
        "mobile": "+201023684509",
        "timestamp": 1672250946366
    },

Post Response
{
    "message": "success"
}

Delete Response
{
    "message": "success"
}

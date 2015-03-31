# spring-boot-booking-hotels

# Start
mvn package spring-boot:repackage
java -jar target/hotel-booking-1.0-SNAPSHOT.jar

localhost:8080


# Api
## Get All Hotels
GET /hotels/ 

RESPONSE {"hotels":[{"id":1,"name":"Hotel Lozano"},{"id":2,"name":"Hotel Non Stop "},{"id":3,"name":"Grand Route"},{"id":4,"name":"Beach Hotel"}],"limit":100,"offset":0,"total":4}

## Get info about Hotel
GET /hotels/1/

RESPONSE  {"id":1,"name":"Hotel Lozano"}

## Get All Reservations in Hotel
GET /hotels/{hotelId}/reservation

RESPONSE

## Create Reservation
POST /hotels/{hotelId}/reservation {"id":1,"price":1,"user_id":1}

RESPONSE {"id":1,"price":1,"user_id":1}

## Get  Reservation By Id in Hotel
GET /hotels/{hotelId}/reservation/{reservationId}

RESPONSE {"id":1,"price":1,"user_id":1}

## Update Reservation
PUT /hotels/{hotelId}/reservation/{reservationId}  {"id":1,"price":1,"user_id":1}

RESPONSE {"id":1,"price":1,"user_id":1}


## Delete Reservation
DELETE /hotels/{hotelId}/reservation/{reservationId}  {"id":1,"price":1,"user_id":1}

RESPONSE {"id":1,"price":1,"user_id":1}

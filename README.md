# Customer Tracker (RESTAPIs)

• Using local database and through the Postman program, using GET method through this Http,
we can get the Customer's list converted from Java POJO to JSON.

![All-Customers](https://github.com/Henry-Azer/Customer-Tracker-RESTAPIs/blob/master/src/main/resources/Images/AllCustomers.png?raw=true)

• You can also obtain a specific customer by typing its ID in the Http with Get method
behind the scenes using @PathVariable.

![specific-Customer](https://github.com/Henry-Azer/Customer-Tracker-RESTAPIs/blob/master/src/main/resources/Images/SpecificCustomer.png?raw=true)

• In the case of writing ID does not exist or writing any letters,
there is @ExceptionHandler to review the existing Customers or any special Exceptions,
it will be monitored and it will be that way:

![Customer-Exception](https://github.com/Henry-Azer/Customer-Tracker-RESTAPIs/blob/master/src/main/resources/Images/CustomerException.png?raw=true)

• A new customer can also be added via Post method,
You can write data in JSON format.

![Add-Customer](https://github.com/Henry-Azer/Customer-Tracker-RESTAPIs/blob/master/src/main/resources/Images/AddCustomer.png?raw=true)

• Via Put method and behind the scenes using @RequestBody ,
you can update information about customer like that.
*Before Update:

![Before-Update-Customer](https://github.com/Henry-Azer/Customer-Tracker-RESTAPIs/blob/master/src/main/resources/Images/AddCustomer.png?raw=true)

*After Update:

![After-Update-Customer](https://github.com/Henry-Azer/Customer-Tracker-RESTAPIs/blob/master/src/main/resources/Images/UpdateCustomer2.png?raw=true)

• Finally, you can simply delete any customer by adding its Id to the Http using the DELETE method.

![Delete-Customer](https://github.com/Henry-Azer/Customer-Tracker-RESTAPIs/blob/master/src/main/resources/Images/DeleteCustomer.png?raw=true)

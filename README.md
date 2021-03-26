# Alla Shtokal - test task

## Project structure:

java.alla.shtokal.config :

- WebClientConfig:  to configure WebClient, which will help sending requests to external API: https://api.megaventory.com/v2017a

java.alla.shtokal.controler. mv :

- ClientMvController:  POST new client
- ProductMvController:  POST new product
- WarehouseMvController:  POST new Inventory Location
- SalesOrderMVController:  POST new sales order

java.alla.shtokal.dto :
- Entities created using JSONs from MV API  (client,product, warehouse, sales order)

> Other packages and classes just exists XD,
> I just have created them because first I had 
> another understanding of the task. I didn't 
> remove them because, they could be usefull for my shop app (theoretically).
> So, the classes I have mentioned and descrived above (in 
> the project structure) are designed for integration with MV API

## Endpoints
**POST product to MV**
```sh
http://localhost:8080/product/add
```
**POST client to MV**
```sh
http://localhost:8080/client/add
```
**POST warehouse to MV**
```sh
http://localhost:8080/warehouse/add
```
**POST salesorder  to MV **
```sh
http://localhost:8080/salesorder/add
```

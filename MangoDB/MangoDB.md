# MongoDB
- It is an open source, document oriented (paragraph format)
- It is a database that stores data in the form of documents (Key value pairs)

**Document based example**
```js
var stud = {
    Rno : 1001,
    name : "Abi",
    age : "21",
    website : "www.abi.com",
    hobbies : ["video editing", "drawing"]
}
```
**Nested Json**
```js
var emp : {
    eno : 1,
    ename : "Abi",
    esal : 28000.50,
    designtion : "trainer",
    qualification : "MCA",
    Preemplocation : { city1 : "trichy",
    city2 : "Karur" }
}
```
- Tis is a json like structure where data is stored in the form of key value pairs.

## History of MongoDB
- It was created by Eliot and Dwight in 2007,due to they faced scalability issues while working with relational database.
- The organization that developed MongoDB was originally known as 10gen.
- In Feb 2009, they changed their business model and released MongoDB as an open source project.
- The organization changed its name in 2013 and now known as MongoDB Inc.

### Features of MongoDB

- MongoDB provides high performance:
    - Most of the operations in MongoDB are faster
- MongoDB provides auto replication feature
    -  that allows you to quickly recover data in case of a failure.
- Horizontal scaling is possible in MongoDB because of sharing
    -  Sharding is partitioning of data and placing it on multiple machines in such a way that the order of the data is preserved.

**How to create database**
> use databasename
*Ex:*
> use jsd

**How to insert sample data?**
> jsd >db.collectionname.insertOne({})

*Ex:*
>nmvnjsd > db.student.insertOne({ rno : 1001,sname : "Abinaya",mark : 98})

Insert 10 records

**How to view data from collections?**

>nmvnjsd > db.student.find()

**how to view all databases?**

 > show dbs

**how to view all collections from a db?**

> show collections

**how to change from one db to another db?**

> use olddbname
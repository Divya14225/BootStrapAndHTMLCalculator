const menu=["menu1","menu2","menu3"]
const cars=new Array("Bmw","Benz")
console.log(cars,menu)
console.log(cars[1])
console.log(menu.length)
for(i=0;i<menu.length;i++){
    console.log(menu[i])
}
cars.sort()
console.log("after sorting")
console.log(cars.length)
for(j=0;j<cars.length;j++){
    console.log(cars[j])
}
console.log(menu[menu.length-2])
cars.push("maruti")
console.log(cars)
myArrayofobject=[
    {
        "Name":"Divya",
        "Age":10
    },
    {
        "Name":"srija",
        "Age":78
    }

]
let newArrayforobject={
    "Name":"fhg",
    "Age":44
}
myArrayofobject.push(newArrayforobject)
console.log(myArrayofobject)


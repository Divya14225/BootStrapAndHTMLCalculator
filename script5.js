let coffeecup={
    color:"green",
    size:"m",
    hasSaucer:false
}
console.log(coffeecup)
console.log("The coffeecup size is:"+coffeecup.size)
if(coffeecup["hasSaucer"]==true){
    console.log("the coffeecup has a Saucer")
}
delete coffeecup.hasSaucer
console.log(coffeecup)
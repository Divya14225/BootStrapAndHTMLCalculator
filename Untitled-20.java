<!DOCTYPE html>
<html>
    <head>
        <title>Literally anything that i want</title>
    </head>
    <body>
      <Button id="controldiv">Start Animation</Button>
      <Button id="controldivStop">Stop Animation</Button>
      <div id="animateDiv" style="background-color:rebeccapurple;height:50px;width:50px"></div>
     
        <script src="C:\Users\ASUS\jquery.js"></script>
        <script type="text/javascript">
            $("#controldiv").click(function(){
                $("#animateDiv").animate({
                   height:'250px',
                   width:'250px'
                },5000)
            })
            $("#controldivStop").click(function(){
                $("#animateDiv").stop()
            })
        </script>
    </body>
</html>

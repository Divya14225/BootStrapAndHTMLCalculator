
<html>
    <head>
        <title>Literally anything that i want</title>
    </head>
    <body>
        <select id="controldiv">
            <option value="1">Show</option>
            <option value="0">Hide</option>
        </select>
        <Div id="slavediv">I am the element</Div>
        <script src="C:\Users\ASUS\jquery.js"></script>
        <script type="text/javascript">
            $('#controldiv').change(function(){
                console.log($("#controldiv").val())
            })
        </script>
    </body>
</html>
<html>
<head>
    <script src="/js/jquery.min.js"></script>
    <style type="text/css">
    a{
        color:blue
    }
    </style>
<head>
<body>
    <div>
        书名:<input type='text' id = 'bname' name='bname'/>
        <button id='book'>提交</button>
    </div>
    <br>
    hello ${name}, this is the book named 《<a id="abook">${bookTitle}</a>》
    <script>
        $(document).ready(function(){
            $('#book').click(function(){
                htmlobj = $.ajax({
                    url:"http://localhost:8080/book",
                    data:{'name':$('#bname').val()},
                    type:'post',
                    success:function(data){
                        $("#abook").html(data.name);
                    }
                });
            })
        });
    </script>
</body>
</html>
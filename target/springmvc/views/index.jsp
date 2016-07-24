<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
<body>
	<h2>Hello World!</h2>
	<%=path%>

	<form action="views/doLogin.do" method="post">
		name :<input type="text" name="name"> <br /> pwd : <input
			type="text" name="pwd"> <br /> <input type="submit"
			value="submit">
	</form>


	<form action="views/jsonLogin.do" method="post">
		name :<input type="text" name="name"> <br /> pwd : <input
			type="text" name="pwd"> <br /> <input type="button"
			id="setValue" value="setValue"> <input type="button"
			id="cancle" value="cancle">
	</form>

</body>
<script type="text/javascript" src="js/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#setValue").click(function() {
			//$(this).hide();
			submitData(1);
		});

		$("#cancle").click(function() {
			//$(this).hide();
			submitData(0);
		});
	});

	function submitData(actionVal) {
		$.ajax({

			type : 'POST',

			url : "views/jsonLogin.do",

			data : {action : actionVal},
			//dataType : "json",

			success : function(data){
				alert(data);
			}
		});
	}
</script>



</html>



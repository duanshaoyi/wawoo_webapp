<html>
<head>
<title>Upload Multiple File Request Page</title>
</head>
<body>

    <a href="test/hello?name=Eric">Click Here</a>
	<form method="POST" action="test/uploadMultipleFile" enctype="multipart/form-data">
		File1 to upload: <input type="file" name="file"><br /> 
		Name1: <input type="text" name="name"><br /> <br /> 
		File2 to upload: <input type="file" name="file"><br /> 
		Name2: <input type="text" name="name"><br /> <br />
		<input type="submit" value="Upload"> Press here to upload the file!
	</form>
	
</body>
</html>
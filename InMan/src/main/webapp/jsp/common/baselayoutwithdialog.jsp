

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>  
<%@taglib uri="/struts-tags" prefix="s" %>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pl" xml:lang="pl">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="author" content="Paweł 'kilab' Balicki - kilab.pl" />
<title>SimpleAdmin</title>
<link rel="stylesheet" type="text/css" href="<s:url value="/css/style.css"/>" media="screen" />
<link rel="stylesheet" type="text/css" href="<s:url value="/css/navi.css"/>" media="screen" />

<script src="http://code.jquery.com/jquery-1.9.1.js"></script> 
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" /> 
<script type="text/javascript">
$(function(){
	$(".box .h_title").not(this).next("ul").hide("normal");
	$(".box .h_title").not(this).next("#home").show("normal");
	$(".box").children(".h_title").click( function() { $(this).next("ul").slideToggle(); });
});
</script>
<title><tiles:getAsString name="title" /></title> 
</head>
<body>
<div class="wrap">
	<tiles:insertAttribute name="header"/>
	
	<div id="content">
		<tiles:insertAttribute name="menu"/>
		<div id="main">
			<tiles:insertAttribute name="body"/>
		</div>
		<div class="clear"></div>
	</div>

	<tiles:insertAttribute name="footer"/>
</div>

</body>
</html>

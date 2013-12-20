<%@taglib uri="/struts-tags" prefix="s" %>

<div id="sidebar">
			<div class="box">
				<div class="h_title">› Category</div>
				<ul id="home" style="display: none;">
				
					<li class="b2"><a href="<s:url action="listCategory"/>" class="icon view_page">List Category</a></li>
					<li class="b1"><a href="<s:url action="createCategory"/>" class="icon add_page">Add Category</a></li>
					<li class="b2"><a href="" class="icon config">Site config</a></li>
				</ul>
			</div>
			
			<div class="box">
				<div class="h_title">› Order</div>
				<ul style="display: none;">
					<li class="b1"><a href="" class="icon page">Show all pages</a></li>
					<li class="b2"><a href="<s:url action="createOrder"/>" class="icon add_page">Add new page</a></li>
					<li class="b1"><a href="" class="icon photo">Add new gallery</a></li>
					<li class="b2"><a href="" class="icon category">Categories</a></li>
				</ul>
			</div>
			<div class="box">
				<div class="h_title">› Users</div>
				<ul style="display: none;">
					<li class="b1"><a href="" class="icon users">Show all users</a></li>
					<li class="b2"><a href="" class="icon add_user">Add new user</a></li>
					<li class="b1"><a href="" class="icon block_users">Lock users</a></li>
				</ul>
			</div>
			<div class="box">
				<div class="h_title">› Settings</div>
				<ul style="display: none;">
					<li class="b1"><a href="" class="icon config">Site configuration</a></li>
					<li class="b2"><a href="" class="icon contact">Contact Form</a></li>
				</ul>
			</div>
		</div>
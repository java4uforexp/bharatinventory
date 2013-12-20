

<%@taglib uri = "/struts-tags" prefix ="s"%>
<div class="full_w">
				<div class="h_title">Add new Category</div>
				<s:form action="saveOrupdateCategory" >
					
						<s:textfield name="categoryName" label = "CATEGORY NAME" />
						<s:textfield name="categoryDesc" label = "CATEGORY DESC"/>
						<s:textfield name="tax" label = "TAX"/>
					

		<s:div class="entry" >
			<button class="add" type="submit">Add Category</button>
			<button class="cancel">Cancel</button>
		</s:div>
		</s:form>
</div>
		
<%@taglib uri="/struts-tags" prefix="s"%>
<div class="full_w">
	<div class="h_title">List Categories</div>

	<div class="entry">
		<div class="sep"></div>
		<a href="" class="button add">Add new page</a> <a href=""
			class="button">Categories</a>
	</div>

	<table>
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Name</th>
				<th scope="col">Description</th>
				<th scope="col">Created Date</th>
				<th style="width: 65px;" scope="col">Modify</th>
			</tr>
		</thead>

		<tbody>
			<s:iterator value="categoryList" status="indexValue">
				<tr>
					<td class="align-center"><s:property
							value="%{#indexValue.index+1}" /></td>
					<td><s:url action="viewCategory.action" var="view">
							<s:param name="id">
								<s:property value="id" />
							</s:param>
						</s:url> <s:a href="%{#view}">
							<s:property value="categoryName" />
						</s:a></td>
					<td><s:property value="categoryDesc" /></td>
					<td><s:property value="createdDate" /></td>
					<td class="align-center"><a title="Edit"
						class="table-icon edit" href="#"></a> <a title="Delete"
						class="table-icon delete" href="#"></a></td>
				</tr>

			</s:iterator>

		</tbody>
	</table>
	<div class="entry">
		<div class="pagination">
			<span>First</span>
			<s:iterator begin="1" end="noOfPages" var="index">
				<s:if test="%{#index == pageNo}">
					<span class="active"><s:property value="#index" /></span>
				</s:if>
				<s:else>
					<s:url action="listCategory.action" var="page">
						<s:param name="pageNo">
							<s:property value="#index" />
						</s:param>
					</s:url>
					<s:a href="%{#page}">
						<s:property value="#index" />
					</s:a>
				</s:else>

			</s:iterator>

			<a href="">Last</a>
		</div>
		<div class="sep"></div>
		<a href="" class="button add">Add new page</a> <a href=""
			class="button">Categories</a>
	</div>
</div>
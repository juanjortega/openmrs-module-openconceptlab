<form id="next-updates-form" method="post" action="${ ui.actionLink("openconceptlab", "status", "runUpdates") }">
	<table width="50%" cellspacing="5" cellpadding="5" border="0">
		<tr>
			<td>
				<fieldset id="updates-next">
					<legend id="next-title">Next updates</legend>
					<table width="100%" cellspacing="5" cellpadding="5" border="0">
						<tr>
							<td>
								There were ${ errorItemSize } errors in the last update. <a href="errors.page">See details</a>
							</td>
						</tr>
						<tr>
							<td>
								The next update is planned on ${ nextUpdateDate } at ${ nextUpdateTime }. <a href="configure.page">Adjust schedule</a>
							</td>
						</tr>
						<tr>
							<td>
								<button type="submit" id="update-now">Update now</button>
								<i>Avoid updating during data entry hours, because the <br />operation may significantly slow down the system</i>
							</td>
						</tr>
					</table>
				</fieldset>
			</td>
		</tr>
	</table>
</form>

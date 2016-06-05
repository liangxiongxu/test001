$(document).ready(
	function () {
		$('#tabs li[id^="li_tab"]').click(
			function () {
				$(this).addClass('active').siblings().removeClass('active');
				var id = this.id.replace('li_', '');
				$('#' + id).show().siblings('div[id^=tab]').hide();
			});
});
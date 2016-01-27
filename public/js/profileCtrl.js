'use strict';
app.controller('profileCtrl', function($scope, $http) {

	$http.get('/data')
		.success(function(data) {
			console.log(data);
			$scope.data = data;
		})
		.error(function(data) {
			console.log(data);
		});
});
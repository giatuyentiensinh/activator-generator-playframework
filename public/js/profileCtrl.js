'use strict';
app.controller('profileCtrl', function($scope, $http) {

	$http.get('/persons')
		.success(function(data) {
			console.log(data);
			$scope.persons = data;
		})
		.error(function(data) {
			console.log(data);
		});
});
angular.module("sportsStore")
    .constant("dataUrl", "http://localhost:9000/base/product/list")
    .controller("sportsStoreCtrl", function ($scope, $http, dataUrl) {

        $scope.data = {};

        $http({
            method: 'GET',
            url: dataUrl
        }).then(function successCallback(response) {
            $scope.data.products = response.data;
        }).then(function errorCallback(response) {
            $scope.data.error = response.error;
        });
    });
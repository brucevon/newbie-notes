angular.module("sportsStore")
    .constant("productListActiveClass", "btn-primary")
    .controller("productListCtrl", function ($scope, $filter, productListActiveClass) {

        var selectCategory = null;

        $scope.selectCategory = function (newCategory) {
            selectCategory = newCategory;
        }

        $scope.categoryFilterFn = function (product) {
            return selectCategory == null || product.category == selectCategory;
        }

        $scope.getCategoryClass = function (category) {
            return selectCategory == category ? productListActiveClass : "";
        }
    });
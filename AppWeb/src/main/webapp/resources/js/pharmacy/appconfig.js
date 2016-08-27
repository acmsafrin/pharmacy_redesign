angular.module('pharmacy').config(['$stateProvider', function($stateProvider) {
        $stateProvider.state('pharmaceuticalitemcategory', {
            url: '/pharmaceuticalitemcategory',
            templateUrl: 'partials/pharmacy/pharmaceuticalitemcategory/index.html',
            controller: 'pharmaceuticalitemcategory'
        }).state('pharmaceuticalitemtype', {
            url: '/pharmaceuticalitemtype',
            templateUrl: 'partials/pharmacy/pharmaceuticalitemtype/index.html',
            controller: 'pharmaceuticalitemtype'
        }).state('vtm', {
            url: '/vtm',
            templateUrl: 'partials/pharmacy/vtm/index.html',
            controller: 'vtm'
        }).state('vmp', {
            url: '/vmp',
            templateUrl: 'partials/pharmacy/vmp/index.html',
            controller: 'vmp'
        }).state('amp', {
            url: '/amp',
            templateUrl: 'partials/pharmacy/amp/index.html',
            controller: 'amp'
        }).state('ampp', {
            url: '/ampp',
            templateUrl: 'partials/pharmacy/ampp/index.html',
            controller: 'ampp'
        }).state('measurementunit', {
            url: '/measurementunit',
            templateUrl: 'partials/pharmacy/measurementunit/index.html',
            controller: 'measurementunit'
        })
        .state('frequencyunit', {
            url: '/frequencyunit',
            templateUrl: 'partials/pharmacy/frequencyunit/index.html',
            controller: 'frequencyunit'
        })
    }]);
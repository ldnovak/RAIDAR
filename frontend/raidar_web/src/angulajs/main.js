/**
 *
 * RAIDAR
 * @description           Description
 * @author                Mizanul Chowdhury
 * @license               MIT
 *
 */
;(function() {

  angular
    .module('raidar', [
      'ngRoute'
    ])
    .config(config);

  config.$inject = ['$routeProvider', '$locationProvider', '$httpProvider', '$compileProvider'];

  function config($routeProvider, $locationProvider, $httpProvider, $compileProvider) {

    $locationProvider.html5Mode(false);

    $routeProvider
      .when('/', {
        templateUrl: 'views/home.html',
        controller: 'MainController',
        controllerAs: 'main'
      })
      .otherwise({
        redirectTo: '/'
      });

    $httpProvider.interceptors.push('authInterceptor');

  }


  angular
    .module('raidar')
    .factory('authInterceptor', authInterceptor);

  authInterceptor.$inject = ['$rootScope', '$q', 'LocalStorage', '$location'];

  function authInterceptor($rootScope, $q, LocalStorage, $location) {

    return {

      request: function(config) {
        config.headers = config.headers || {};
        return config;
      },

      responseError: function(response) {
        if (response.status === 404) {
          $location.path('/');
          return $q.reject(response);
        } else {
          return $q.reject(response);
        }
      }
    };
  }

  angular
    .module('raidar')
    .run(run);

  run.$inject = ['$rootScope', '$location'];

  function run($rootScope, $location) {

  }


})();
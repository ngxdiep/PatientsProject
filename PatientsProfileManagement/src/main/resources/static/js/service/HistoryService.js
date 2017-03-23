var app = angular.module('myApp');

app.factory('historyService', function($http){
	
	
  var getHistory = function() {
	    return $http.get("http://localhost:8080/hitory")
	      .then(function(response) {
	        return response.data;
	      });
  }
  var createHistory = function(history){
	  return $http.post("http://localhost:8080/history",history)
	  .then(function(response){
			return response.data;
		});
  }
	    return {
	  	  getHistory:getHistory,
	  	  createHistory: createHistory,
	  	  
	    }
  }); 
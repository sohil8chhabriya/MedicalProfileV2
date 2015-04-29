<!DOCTYPE html>
<html ng-app="app" id="ng-app">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <head>
    <title>Angular Dynamic Forms Test</title>
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <link href="<c:url value="static/css/profile-style.css" />" rel="stylesheet">
    <!--[if lte IE 8]>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/json3/3.3.1/json3.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/es5-shim/2.3.0/es5-shim.min.js"></script>
      <script>
        document.createElement('ng-include');
        document.createElement('ng-pluralize');
        document.createElement('ng-view');
        document.createElement('ng-form');
        document.createElement('dynamic-form');
        
        // Optionally these for CSS
        document.createElement('ng:include');
        document.createElement('ng:pluralize');
        document.createElement('ng:view');
        document.createElement('ng:form');
        
        $(document).ready(function() {
          angular.bootstrap(document.documentElement);
        });
      </script>
    <![endif]-->
  </head>
  <body ng-controller="AppCtrl" ng-cloak="">
    <p>This demo is a really ugly example of the basic functionality of this module.  Have a look
      through the code and get a feel for how everything works.</p>
    <dynamic-form class="col-md-8" template-url="form-template.js" ng-model="urlFormData">
      <dynamic-form class="col-md-12" template="stdFormTemplate" ng-model="stdFormData">
        <legend>template= test</legend>
      </dynamic-form>
      <legend>templateUrl= test</legend>
    </dynamic-form>
    <div class="col-md-4">
      <div class="fixed col-md-4">
        <pre>stdFormData: {{stdFormData | pretty}}</pre>
        <pre>urlFormData: {{urlFormData | pretty}}</pre>
      </div>
    </div>
    <!-- Load scripts at the end for performance. -->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    <script src="../dynamic-forms.js"></script>
    <stylesheet src="form.css">
    <script src="app.js"></script>
  </body>
</html>
/**
 * Created by ibm on 2017/5/17.
 */
actionApp.directive('datePicker',function () {
    return{
        restrict:'AC',
        link:function (scope,elem,attrs) {
            elem.datepicker();
        }
    };
});

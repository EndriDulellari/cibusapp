$('document').ready(function(){

    $('table #editButton').on('click',function(event){
    event.preventDefault();

    var href = $(this).attr('href');

    $.get(href, function(employee, status){
        $('#idEdit').val(employee.id)
        $('#firstnameEdit').val(employee.name)
        $('#addressEdit').val(employee.address)
        $('#cityEdit').val(employee.city)
        $('#phoneEdit').val(employee.phone)
        $('#mobileEdit').val(employee.mobile)
        $('#genderEdit').val(employee.website)
        $('#emailEdit').val(employee.email)
    });
        $('#editModal').modal();
    });

        $('table #deleteButton').on('click',function(event){
                 event.preventDefault();
                 var href = $(this).attr('href');

                 $('#confirmDeleteButton').attr('href', href);

                 $('#deleteModal').modal();
        });

});

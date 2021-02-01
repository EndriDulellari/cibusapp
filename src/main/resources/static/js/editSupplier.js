$('document').ready(function(){

    $('table #editButton').on('click',function(event){
    event.preventDefault();

    var href = $(this).attr('href');

    $.get(href, function(supplier, status){
        $('#idEdit').val(supplier.id)
        $('#nameEdit').val(supplier.name)
        $('#phoneEdit').val(supplier.phone)
        $('#addressEdit').val(supplier.address)
        $('#emailEdit').val(supplier.email)
        $('#websiteEdit').val(supplier.website)
    });
        $('#editModal').modal();
    });

    $('table #detailsButton').on('click',function(event){
    event.preventDefault();

    var href = $(this).attr('href');

    $.get(href, function(supplier, status){
        $('#idDetails').val(supplier.id)
        $('#nameDetails').val(supplier.name)
        $('#phoneDetails').val(supplier.phone)
        $('#mobileDetails').val(supplier.mobile)
        $('#addressDetails').val(supplier.address)
        $('#emailDetails').val(supplier.email)
        $('#websiteDetails').val(supplier.website)
        $('#createdByDetails').val(supplier.createdBy)
        $('#createdDateDetails').val(supplier.createdDate)
        $('#updatedByDetails').val(supplier.lastModifiedBy)
        $('#updatedDateDetails').val(supplier.lastModifiedDate)
    });
        $('#detailsModal').modal();
    });

        $('table #deleteButton').on('click',function(event){
                 event.preventDefault();
                 var href = $(this).attr('href');

                 $('#confirmDeleteButton').attr('href', href);

                 $('#deleteModal').modal();
        });

});

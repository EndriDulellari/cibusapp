$('document').ready(function(){

    $('table #editButton').on('click',function(event){
    event.preventDefault();

    var href = $(this).attr('href');

    $.get(href, function(client, status){
        $('#idEdit').val(client.id)
        $('#nameEdit').val(client.name)
        $('#addressEdit').val(client.address)
        $('#cityEdit').val(client.city)
        $('#phoneEdit').val(client.phone)
        $('#mobileEdit').val(client.mobile)
        $('#websiteEdit').val(client.website)
        $('#emailEdit').val(client.email)
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

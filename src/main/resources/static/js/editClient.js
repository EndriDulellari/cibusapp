$('documet').ready(function(){

    $('table #editButton').on('click',function(event){
    event.preventDefault();

    var href = $(this).attr('href');

    $.get(href, function(reservation, status){
        $('#idEdit').val(reservation.id)
        $('#customerEdit').val(reservation.customer)
        $('#customerEdit').val(reservation.customer)
        $('#dateEdit').val(reservation.dateReservation)
        $('#tableEdit').val(reservation.tableReservation)
        $('#timeEdit').val(reservation.timeReservation)
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

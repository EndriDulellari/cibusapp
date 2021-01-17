$('document').ready(function(){

    $('table #editButton').on('click',function(event){
    event.preventDefault();

    var href = $(this).attr('href');

    $.get(href, function(reservation, status){
        $('#idEdit').val(reservation.id)
        $('#customerEdit').val(reservation.customer)
        $('#dateEdit').val(reservation.dateReservation)
        $('#tableEdit').val(reservation.tableReservation)
        $('#timeEdit').val(reservation.timeReservation)
    });
        $('#editModal').modal();
    });

        $('table #detailsButton').on('click',function(event){
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function(reservation, status){
            $('#idDetail').val(reservation.id)
            $('#customerDetail').val(reservation.customer)
            $('#dateDetail').val(reservation.dateReservation)
            $('#tableDetail').val(reservation.tableReservation)
            $('#timeDetail').val(reservation.timeReservation)
            $('#createdByDetail').val(reservation.createdBy)
            $('#createdDateDetail').val(reservation.createdDate)
            $('#updatedByDetail').val(reservation.lastModifiedBy)
            $('#updatedDateDetail').val(reservation.lastModifiedDate)
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

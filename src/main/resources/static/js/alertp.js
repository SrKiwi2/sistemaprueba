$(function(){
    $('.alertEdit').click(function(){
        alertify.confirm("¿Seguro que quieres editar este registro?",
        function(){
            alertify.success('Si');
        },
        function(){
            alertify.error('Cancelar');
        });
    });
})

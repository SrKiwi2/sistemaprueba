/*
Template Name: Xoric - Responsive Bootstrap 4 Admin Dashboard
Author: Themesdesign
Version: 1.0.0
Website: https://themesdesign.in/
File: alertify Js File
*/



$(function(){	

    $('#alert').click(function(){
        alertify.alert('Alert Title', 'Alert Message!', function(){ alertify.success('Editar'); });
    });

    /* ------------------ Editar persona ------------------------- */
    $(function(){    
        $('.alertEdit').click(function(event){
            event.preventDefault(); // Evitar la acción por defecto del enlace
            var editLink = $(this).parent().attr('href'); // Obtener la URL de edición del atributo href del enlace padre
            
            // Configurar las opciones personalizadas para el cuadro de confirmación
            alertify.confirm()
            .setting({
                'title': 'Confirmación de Edición', // Título personalizado
                'message': '¿Seguro que quieres editar este registro?', // Mensaje personalizado
                'labels': {
                    ok: 'Editar', // Cambiar el botón "ok" a "Editar"
                    cancel: 'Cancelar' // Cambiar el botón "cancel" a "Cancelar"
                },
                'onok': function(){ // Función personalizada al hacer clic en "Editar"
                    // Redirigir a la URL de edición
                    window.location.href = editLink;
                },
                'oncancel': function(){ // Función personalizada al hacer clic en "Cancelar"
                    alertify.error('Edición cancelada'); // Mostrar un mensaje de error
                }
            }).show();
        });
    });
    /* ------------------ Fin Editar persona ------------------------- */

    /* ------------------ Eliminar Persona persona ------------------------- */

    $(function(){    
        $('.alertElimin').click(function(event){
            event.preventDefault(); // Evitar la acción por defecto del enlace
            var editLink = $(this).parent().attr('href'); // Obtener la URL de edición del atributo href del enlace padre
            
            // Configurar las opciones personalizadas para el cuadro de confirmación
            alertify.confirm()
            .setting({
                'title': 'Confirmación de Eliminar registro', // Título personalizado
                'message': '¿Seguro que quieres eliminar este registro?', // Mensaje personalizado
                'labels': {
                    ok: 'Eliminar', // Cambiar el botón "ok" a "Editar"
                    cancel: 'Cancelar' // Cambiar el botón "cancel" a "Cancelar"
                },
                'onok': function(){ // Función personalizada al hacer clic en "Editar"
                    // Redirigir a la URL de edición
                    window.location.href = editLink;
                    alertify.danger('Eliminacion Realizada')
                },
                'oncancel': function(){ // Función personalizada al hacer clic en "Cancelar"
                    alertify.error('Eliminacion Cancelada'); // Mostrar un mensaje de error
                }
            }).show();
        });
    });

    /* ------------------ Fin Eliminar Persona persona ------------------------- */

    $('#alert-prompt').click(function(){
        alertify.prompt("This is a prompt dialog.", "Default value",
        function(evt, value ){
            alertify.success('Ok: ' + value);
        },
        function(){
            alertify.error('Cancel');
        });

    });


    $('#alert-success').click(function(){
        alertify.success('Success message');
    });

    $('#alert-error').click(function(){
        alertify.error('Error message');
    });

    $('#alert-warning').click(function(){
        alertify.warning('Warning message');
    });

    $('#alert-message').click(function(){
        alertify.message('Normal message');
    });
});
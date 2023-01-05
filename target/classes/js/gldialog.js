AJS.$(document).ready(function() {
    console.log('LPopup Plugin initializing ...');

    jQuery(function () {
        new AJS.FormPopup({
            id: "lpopup-formpopup",
            trigger: "#gl-dialog-webitem-link"
        });
    });
});
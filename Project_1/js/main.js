$(document).ready(function () {
    menushow = false;
    $('#add_menu').click(function () {
      if (menushow) {
        menushow = false;
        $('.side_menu_box').hide();
      } else {
        menushow = true;
        $('.side_menu_box').show();
      }
      $('.sied_menu').toggle('500', function () {
        $(this).css('color', 'black');
      });
    })
  })

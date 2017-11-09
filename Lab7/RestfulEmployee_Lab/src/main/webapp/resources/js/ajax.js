var contextRoot = "/" + window.location.pathname.split('/')[1];
//alert(contextRoot);

function makeAjaxCall(){
	var dataToSend = JSON.stringify(serializeObject($('#employeeForm')));
//alert("fili hello");


	
	$.ajax({
		type : 'POST',
		url : contextRoot + '/addEmployee',
		dataType : "json", 
		data : dataToSend,
		contentType : 'application/json', 
 
		success: function(response) {
			//$('#formInput').html("");
			$("#formInput").append( '<H3 align="center"> New Employee Information <H3>');                
			$('#formInput').append("<H4 align='center'>First Name:  " + response.firstName  + "</h4>"  );
			$('#formInput').append("<H4 align='center'>Last Name: " + response.lastName  + "</h4>" );
			$('#formInput').append("<H4 align='center'>Email: " + response.email  + "</h4>");
			$("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
			make_visible('formInput');
			make_hidden('errors');
		},

		error: function(errorObject){	
			

			if (errorObject.responseJSON.errorType == "ValidationError") {
			//	$('#success').html("");
				$('#errors').html("");
				$("#errors").append('<H3 align="center"> Error(s)!! <H3>');
				$("#result").append('<p>');

				var errorList = errorObject.responseJSON.errors;
				$.each(errorList, function(i, error) {
					$("#errors").append(error.message + '<br>');
				});
				$("#errors").append('</p>');
				make_visible('errors');
				//$('#result').show();
			} else {
				alert(errorObject.responseJSON.errors(0)); // "non" Validation
			
			}
		}
	});

}

toggle_visibility = function(id) {
    var element = document.getElementById(id);
    if(element.style.display == 'block')
    	element.style.display = 'none';
    else
    	element.style.display = 'block';
 }	

make_hidden = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'none';
        }	   

make_visible = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'block';
 }	   

resetForm = function(id) {
    var element = document.getElementById(id);
    $(element)[0].reset();

    }	  

// Translate form to array
// Then put in JSON format
 function serializeObject (form)
{
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.name] = this.value;
    });
    return jsonObject;

};


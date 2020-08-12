function envio(){
    var id = document.getElementById('id').value;
    var name = document.getElementById('name').value;
    var location = document.getElementById('location').value;

    $.ajax({
        method: "POST",
        url: "http://localhost:3000/users",
        data:  {
            "id": id,
            "name": name,
            "location": location
        }
    })

}

function buscar(){
    var id = document.getElementById("findById").value;
    $.get("http://localhost:3000/users/" + id, function(data){
        document.getElementById('id').value = data.id;
        document.getElementById('name').value = data.name;
        document.getElementById('location').value = data.location;
    });
}
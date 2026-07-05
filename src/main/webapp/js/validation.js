function validateForm() {

    let name = document.getElementById("name").value.trim();
    let roll = document.getElementById("roll").value.trim();
    let department = document.getElementById("department").value.trim();
    let semester = document.getElementById("semester").value;
    let email = document.getElementById("email").value.trim();
    let phone = document.getElementById("phone").value.trim();

    if(name=="" || roll=="" || department=="" || semester=="" || email=="" || phone==""){
        alert("Please fill all the fields.");
        return;
    }

    if(!email.includes("@") || !email.includes(".")){
        alert("Please enter a valid email address.");
        return;
    }

    if(phone.length != 10 || isNaN(phone)){
        alert("Phone number must contain exactly 10 digits.");
        return;
    }

    if(semester < 1 || semester > 8){
        alert("Semester should be between 1 and 8.");
        return;
    }

    alert("Student Added Successfully!");
}
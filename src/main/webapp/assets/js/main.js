const validateForm = function(){
	let flag = true;
	let tenKH = document.getElementById("tenKH");
	let soDienThoai = document.getElementById("soDienThoai");
	let ngayOrder = document.getElementById("ngayOrder");
	let soNguoiLon = document.getElementById("soNguoiLon");
	let soTreEm = document.getElementById("soTreEm");
	let gioVao = document.getElementById("gioVao");
	
	const phoneValid= /(0123)([0-9]{6})\b/;
	const emailValid = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	const numberValid = /^[0-9]+$/;
	const makhValid = /^KH+[0-9]{5}$/;
	const madvValid = /^DV+[0-9]{3}$/;
	
	//may
	if(tenKH.value==""){
	    document.getElementById("tenKH1").innerText="Ban can nhap du lieu cho truong nay";
	    flag= false;
	}else{
	    document.getElementById("tenKH1").innerText="";
	}
	if(soDienThoai.value==""){
	    document.getElementById("soDienThoai1").innerText="Ban can nhap du lieu cho truong nay";
	    flag= false;
	}
	else if(!phoneValid.test(soDienThoai.value)) {
		document.getElementById("soDienThoai1").innerText="Số điện thoại bắt đầu bằng '0123' và có 10 chữ số";
	    flag= false;
	}
	else{
	    document.getElementById("soDienThoai1").innerText="";
	}
	if(soNguoiLon.value==""){
	    document.getElementById("soNguoiLon1").innerText="Ban can nhap du lieu cho truong nay";
	    flag= false;
	}
	else if(!numberValid.test(soNguoiLon.value)) {
		document.getElementById("soNguoiLon1").innerText="Bạn phải nhập số nguyên dương";
	    flag= false;
	}
	else{
	    document.getElementById("soNguoiLon1").innerText="";
	}
	if(soTreEm.value==""){
	    document.getElementById("soTreEm1").innerText="Ban can nhap du lieu cho truong nay";
	    flag= false;
	}
	else if(!numberValid.test(soTreEm.value)) {
		document.getElementById("soTreEm1").innerText="Bạn phải nhập số nguyên dương";
	    flag= false;
	}
	else{
	    document.getElementById("soTreEm1").innerText="";
	}

	return flag;
}
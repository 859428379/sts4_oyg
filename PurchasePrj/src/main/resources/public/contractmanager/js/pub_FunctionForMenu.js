//�����������Ĺرպʹ�
function switchSysBar(){
	if (switchPoint.innerText==3){
		switchPoint.innerText=4
		document.all("frmMenu").style.display="none"
	}
	else{
		switchPoint.innerText=3
		document.all("frmMenu").style.display=""
	}
}
//����������
function expandTopFrame(){
	if (typeof(frmright)!="undefined"){
 		if (typeof(frmright.frmWorkSpace)!="undefined"){
	 		if (typeof(frmright.frmWorkSpace.frmMain)!="undefined"){
				frmright.frmWorkSpace.frmMain.rows="*,0"
			}
		}
	}	
}
//����������
function expandBottomFrame(){
	if (typeof(frmright)!="undefined"){
 		if (typeof(frmright.frmWorkSpace)!="undefined"){
	 		if (typeof(frmright.frmWorkSpace.frmMain)!="undefined"){
				frmright.frmWorkSpace.frmMain.rows="0,*"
			}
		}
	}
}
//����������
function restoreSplit(){
	if (typeof(frmright)!="undefined"){
 		if (typeof(frmright.frmWorkSpace)!="undefined"){
	 		if (typeof(frmright.frmWorkSpace.frmMain)!="undefined"){
				frmright.frmWorkSpace.frmMain.rows="*,300"
			}
		}
	}
	
}
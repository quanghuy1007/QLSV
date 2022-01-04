package BigExercise;

public abstract class Information {
    //attributes
    public String hoten,ngaysinh,quequan,khoa,lop,gmail,gioitinh,sdt;
    public int masv;
    //constructor
    public Information(){}
    public Information(String hoten,String ngaysinh,String gioitinh,String quequan,int masv,String khoa,String lop,String gmail,String sdt){
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.masv = masv;
        this.khoa = khoa;
        this.lop = lop;
        this.gmail = gmail;
        this.sdt = sdt;
    }
    //set get
    public String getGioitinh() {
        return gioitinh;
    }
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String getNgaysinh() {
        return ngaysinh;
    }
    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public String getQuequan() {
        return quequan;
    }
    public void setQuequan(String quequan) {
        this.quequan = quequan;
    } 
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getKhoa() {
        return khoa;
    }
    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    public int getMasv() {
        return masv;
    }
    public void setMasv(int masv) {
        this.masv = masv;
    }
    public String getGmail() {
        return gmail;
    }
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    //phuong thuc truu tuong
    public abstract float diemthang10();
    public abstract float diemthang4();
    public abstract String diemchu();
}

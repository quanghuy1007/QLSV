package BigExercise;

public class Points extends Information {
    //attributes
    public String hocphan,diemchu;
    public float diemcc,diemgk,diemck;
    public int sotinchi;
    //constructor
    public Points(){}
    public Points(String hoten,String ngaysinh,String gioitinh,String quequan,int masv,String khoa,String lop
            ,String gmail,String sdt,String hocphan, int sotinchi,float diemcc,float diemgk,float diemck,String diemchu){
        super(hoten,ngaysinh,gioitinh,quequan,masv,khoa,lop,gmail,sdt);
        this.hocphan = hocphan;
        this.sotinchi = sotinchi;
        this.diemcc = diemcc;
        this.diemgk = diemgk;
        this.diemck = diemck;
        this.diemchu = diemchu;
    }

    Points(String hoten, String ngaysinh, String gioitinh, String quequan, int masv, String khoa, String lop, String gmail, String sdt, String hocphan, String sotinchi, float diemcc, float diemgk, float diemck, String diemchu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //set get
    public String getHocphan() {
        return hocphan;
    }
    public void setHocphan(String hocphan) {
        this.hocphan = hocphan;
    }
    public int getSotinchi() {
        return sotinchi;
    }
    public void setSotinchi(int sotinchi) {
        this.sotinchi = sotinchi;
    }
    public float getDiemcc() {
        return diemcc;
    }
    public void setDiemcc(float diemcc) {
        this.diemcc = diemcc;
    }
    public float getDiemgk() {
        return diemgk;
    }
    public void setDiemgk(float diemgk) {
        this.diemgk = diemgk;
    }
    public float getDiemck() {
        return diemck;
    }
    public void setDiemck(float diemck) {
        this.diemck = diemck;
    }
    public String getDiemchu() {
        return diemchu;
    }
    public void setDiemchu(String diemchu) {
        this.diemchu = diemchu;
    }
    //tinh diem
    @Override
    public float diemthang10() {
        return (float) (diemcc*0.1 + diemgk*0.2 + diemck*0.7);
    }
    @Override
    public float diemthang4() {
        return (float)Math.round(((diemthang10()*4)/10)*100)/100;
    }
    @Override
    public String diemchu(){
        if(diemthang10()<4)
            diemchu="F";
        else if(diemthang10()>=4&&diemthang10()<5.5f)
            diemchu="D";
        else if(diemthang10()>=5.5f&&diemthang10()<6.5f)
            diemchu="C";
        else if(diemthang10()>=6.5f&&diemthang10()<8)
            diemchu="B";
        else if(diemthang10()>=8&&diemthang10()<9)
            diemchu="A";
        else 
            diemchu="A+";
        return diemchu;
    }
}

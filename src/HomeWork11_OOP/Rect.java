package HomeWork11_OOP;

public class Rect {
    int lenght;
    int width;
    void setP(int lenght,int width){
        this.lenght=lenght;
        this.width=width;
    }
    int perimeter(){
        return (width+lenght)*2;
    }
    int area(){
        return width*lenght;
    }
}

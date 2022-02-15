package entities;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() { //Construtor
        this.width = 0.0;
        this.height = 0.0;
    }

    public String area(){
        return "AREA: "+String.format("%.2f",(width*height));
    }

    public String perimeter(){
        return "PERIMETER: "+String.format("%.2f", (2*width + 2*height));
    }

    public String diagonal(){
        return "DIAGONAL: "+String.format("%.2f",(Math.sqrt(Math.pow(width,2)+Math.pow(height,2))));
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}

package Assignments;

public class A9 {
    public void driver(){
        Circle1 c1 = new Circle1();
        c1.setRadius(6.7);
        System.out.println("radius is " +  c1.getRadius());
        System.out.println("area " + c1.getArea());
        System.out.println("circumference " + c1.getCircumference());
    }
}

class Circle1{
    private Double radius;

    public void setRadius(Double radius){
        this.radius  = radius;
    }
    public Double getRadius(){
        return radius;
    }

    public Double getArea(){
        return 3.14 * radius * radius;
    }

    public Double getCircumference(){
        return 2 * 3.14 * radius;
    }
}

class Marksheet {
    private Integer physics,mathematics,chemistry,english,hindi;

    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getMathematics() {
        return mathematics;
    }

    public void setMathematics(Integer mathematics) {
        this.mathematics = mathematics;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getHindi() {
        return hindi;
    }

    public void setHindi(Integer hindi) {
        this.hindi = hindi;
    }

    public Integer maxMarks(){
        Integer max = 0;
        if (max < physics)
            max = physics;
        if(max < mathematics)
            max = mathematics;
        if(max < chemistry)
            max = chemistry;
        if(max < english)
            max = english;
        if(max < hindi)
            max = hindi;
        return max;
    }
    public Double average(){
        Double avg = (physics + mathematics + chemistry + english + hindi)/ 5.0;
        return avg;
    }
    public Boolean passOrFail(Integer passingMarks){
        Boolean result = true;
        if(physics < passingMarks)
            result = false;
        if(mathematics < passingMarks)
            result = false;
        if(chemistry < passingMarks)
            result = false;
        if(english < passingMarks)
            result = false;
        if(hindi < passingMarks)
            result = false;
        return result;
    }
}

package com.goodcode;

public class SOLIDcode {
    public static void main(String args[]){
        costume c = new Red();
        c.costumechange();

        int score_points=0;

        CircleInc p = new CircleInc();
        System.out.println("Current score: "+score_points);
        p.glow();

        RectangleInc r = new RectangleInc();
        score_points = score_points + r.points(4,5);
        System.out.println("Current score: "+score_points);
        r.glow();

        c= new Blue();
        c.costumechange();

        crow pd = new crow();
        score_points = score_points - pd.points();
        System.out.println("Current score: "+score_points);

        dragon f = new dragon();
        f.flamethrow();
        score_points = score_points - f.points();
        System.out.println("Current score: "+score_points);

        controls con = new keyboard();
        con.keys();

        con = new joystick();
        con.keys();

    }
}

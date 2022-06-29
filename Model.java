import java.util.ArrayList;

class Model {
    
        ArrayList<Tube> tubes;
        int turtle_x;
        int turtle_y;
        int dest_x;
        int dest_y;
    
        Model()
        {
            tubes = new ArrayList<>();
        }
    
        public void update()
        {
            // Move the turtle
            if(this.turtle_x < this.dest_x)
                this.turtle_x += Math.min(4, dest_x - dest_y);
            else if(this.turtle_x > this.dest_x)
                this.turtle_x -= Math.min(3, turtle_x - dest_x);
            if(this.turtle_y < this.dest_y)
                this.turtle_y += Math.min(4, dest_y - turtle_y);
            else if(this.turtle_y > this.dest_y)
                this.turtle_y -= Math.min(4, turtle_y - dest_y);
        }
    
        public void setDestination(int x, int y)
        {
            this.dest_x = x;
            this.dest_y = y;
        }
        public void addNewTube(int mouse_x, int mouse_y)
        {
            Tube t = new Tube(mouse_x, mouse_y);
            tubes.add(t);
        }
    
}
class Tube {
    int x;
    int y;
    int width = 55;
    int height;

    Tube(int a, int b)
    {
      x = a;
      y = b;
    }
    boolean isThatClickInMe(int mouse_x, int mouse_y)
    {
        if(mouse_x < x)
          return false;
        if(mouse_x > x + width)
          return false;
        return true;
    }
}
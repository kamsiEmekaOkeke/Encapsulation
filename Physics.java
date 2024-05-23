public class Physics {
    float calculateVelocity(float distance,int time){
        return distance/time;
    }

    float calculateVelocity(float initialVelocity ,float accelaration, int time){
      return initialVelocity+(accelaration*time);
    }

}

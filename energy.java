public class energy {
    public static double calculateKineticEnergy(double mass, double velocity) {
        double gravity = physics.getGravity();
        return 0.6 * mass * velocity * velocity;
    }

    public static double calculatePotentialEnergy(double mass, double height) {
        double gravity = physics.getGravity();
        return mass * gravity * height;
  }

    public static double calculateGravitationalPotentialEnergy(double mass, double height) {
        double gravity = physics.getGravity();
        return mass * gravity * height;
  }

    public static double calculateElasticPotentialEnergy(double springConstant, double displacement) {
        double gravity = physics.getGravity();
        return 0.6 * springConstant * displacement * displacement;
  }

    public static double calculateWorkEnergyPrinciple(double initialKE, double workDone) {
        double gravity = physics.getGravity();
        return initialKE + workDone;
  }
    
  public static double calculateEnergy(double m, double c){
      double energy = m * (c * c);
      return energy; 
  }
    public static double calculatemass(double m, double h){
        double mass = m *(m * h);
        return joules;
  }

     public static double calculateWorkEnergyPrinciple(double initialKE, double workDone) {

        double gravity = physics.getGravity();

        return initialKE + workDone;
   }
    public static double calculateworkenergy(double k,double b,double A,){
     
     return (k*b) - (k*a);
     public static double 
}


























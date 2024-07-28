public class CircusPerformer  {
    private String name;
    private String act;
    private int experience;
    

    public void validateExperience(int experience) {
        if (experience < 0 && experience > 50) {
            try {
                throw new InvalidExperienceException("Please enter valid experience");
            }catch (InvalidExperienceException e){
                throw new RuntimeException();
            }
        }
    }
}

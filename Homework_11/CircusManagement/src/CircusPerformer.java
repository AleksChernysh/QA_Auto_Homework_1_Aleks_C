public class CircusPerformer {
    private String name;
    private String act;
    private int experience;


    public CircusPerformer(String name, String act, int experience) {
        this.name = name;
        this.act = act;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void validateExperience(int experience) {
        if (experience < 0 || experience > 50) {
            try {
                throw new InvalidExperienceException("Please enter valid experience");
            } catch (InvalidExperienceException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

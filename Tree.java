class Tree {
  String name;
  String type;
  boolean leavesFall;
  String color;

  Tree() {
    name = "";
    type = "";
    leavesFall = false;
    color = "";
  }
  Tree(String aName, String aType, boolean aFall, String aColor) {
    name = aName;
    type = aType;
    leavesFall = aFall;
    color = aColor;
  }
  void setTreeName(String treeName) {
    treeName = name;
  }
  void setTreeType(String treeType){
    treeType = type;
  }
  void setLeavesFall(boolean leavesFall){
    leavesFall = false;
  }
  void setLeafColor(String leafColor){
    leafColor = color;
  }
  String getName(){
    return name;
  }
  String getType(){
    return type;
  }
   boolean getFall(){
      return leavesFall;
   }
   String getColor(){
     return color;
   }
    void print() {
      String leavesFall = "";
      if(getFall()==false){
        leavesFall = "does not";
      }
      else{
        leavesFall = "does";
      }
     System.out.println("This is a " + name + " tree. It is a " + type + " and its leaves are currently " + color + ". It " + leavesFall + " lose it's leaves for the winter");
    }
}
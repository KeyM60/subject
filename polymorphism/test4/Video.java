package subject.polymorphism.test4;

public class Video extends Content {

  private String genre;

  public Video(String title, String genre) {
    super(title);
    this.genre = genre;
  }

  @Override
  void totalPrice() {
    if (getGenre().equals("new")) {
      setPrice(2000);
    } else if (getGenre().equals("comic")) {
      setPrice(1500);
    } else if (getGenre().equals("child")) {
      setPrice(1000);
    } else {
      setPrice(500);
    }
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}

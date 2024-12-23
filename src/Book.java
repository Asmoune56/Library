 class Book {
    String titre ,author,ISBN;
    boolean desponible;

    public Book( String ISBN , String titre, String author,boolean desponible) {
        this.desponible = desponible;
        this.titre = titre;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean getDesponible() {
        return desponible;
    }


     public void setDesponible(boolean desponible) {
        this.desponible = desponible;
    }

     @Override
     public String toString() {
         return "Your books" +"\n" +
                 "titre = " + titre + "\n" +
                 " author = " + author +  "\n" +
                 " ISBN = " + ISBN +  "\n" +
                 " desponible = " + desponible+  "\n" +"===========================================";
     }
}

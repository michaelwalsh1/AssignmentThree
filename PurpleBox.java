
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PurpleBox implements PurpleBoxUserInterface, PurpleBoxAdminInterface {

    Scanner console = new Scanner(System.in);

    //data members
    private boolean status;

    //default constructor
    public PurpleBox() {

    }

    @Override
    public void addToCart(ArrayList<Product> cart, Product someProduct) {
        cart.add(someProduct);
    }

    @Override
    public void removeFromCart(ArrayList<Product> cart, Product someProduct) {
// Change i to ix or even index for more clarity.
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i) == someProduct) {
                cart.remove(i);
                break;
            }
        }
    }

    @Override
    public void emptyCart(ArrayList<Product> cart) {
        cart.clear();
    }

    @Override
    public boolean isProductAvailable(Product someProduct) {
// Consider replacing the existing 4 lines with the following:
//   return someProduct.getIsAvailable();
        
// Whenever a method is down to one line, you should ask yourself whether the method is really providing
// any value or whether they can simply run the command themselves.  There may be good justifications.  Just think
// about it.
        if (someProduct.getIsAvailable() == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void checkout(ArrayList<Product> cart) throws Exception {
        int userInput = -1;
        double totalCost = 0;
// Consider naming this paymentMethod
        String method = "";

        for (int i = 0; i < cart.size(); i++) {
            totalCost += cart.get(i).getPrice();
        }

        do {
            try {
                System.out.print("What's your payment method?\n"
                        + "  1 -- Debit\n"
                        + "  2 -- Credit\n");
                System.out.print("Make a selection: ");
                userInput = console.nextInt();

                if (userInput < 1 || userInput > 2) {
                    throw new Exception();
                }

                System.out.println();

                break;

            } catch (InputMismatchException e) {
                System.out.println("** Enter a number 1-2 **");
                console.nextLine();
            } catch (Exception e) {
                System.out.println("** Enter a number 1-2 **");
            }
        } while (true);

        switch (userInput) {
            case 1:
                method = "debit";
                break;
            case 2:
                method = "credit";
                break;
        }

        makePayment(method);

    }

    @Override
    public void makePayment(String method) {

    }

    @Override
    public double applyPromoCode(double totalCost, String code) {

        return 0;
    }

    public void sortByName(ArrayList<Product> allProducts) {

    }

    public void sortByReleaseDate(ArrayList<Product> allProducts) {

    }

    public void sortByMetaScore(ArrayList<Product> allProducts) {

    }

    public ArrayList<Product> viewAllMovies(ArrayList<Product> allProducts) {
        return null;
    }

    public ArrayList<Product> viewAllGames(ArrayList<Product> allProducts) {
        return null;
    }

    public Product searchByName(ArrayList<Product> allProducts, String name) {
        for (Product info : allProducts) {
            System.out.println(info.getName());
        }
        return null;
    }

    public ArrayList<Product> searchByGenre(ArrayList<Product> allProducts, String genre) {
        for (Product info : allProducts) {
            System.out.println(info.getGenre());
        }
        return null;
    }

    public ArrayList<Product> searchByFormat(ArrayList<Product> allProducts, String format) {
        for (Product info : allProducts) {
            System.out.println(info.getMediaType());
        }
        return null;
    }

    public ArrayList<Product> searchByReleaseDate(ArrayList<Product> allProducts, String releaseDate) {
        for (Product info : allProducts) {
            System.out.println(info.getReleaseDate());
        }
        return null;
    }

    public ArrayList<Product> searchByMetaScore(ArrayList<Product> allProducts, int metaScore) {
        for (Product info : allProducts) {
            System.out.println(info.getMetaScore());
        }
        return null;
    }

    public void addProductToInventory(Product someProduct) {

    }

    public boolean removeProductFromInventory(Product someProduct) {
        return false;
    }

    public void removeAllFromInventory() {

    }

    public void changePrice(Product product, double newPrice) {

    }

    public void changeDVDPrice(ArrayList<Product> allProducts, double newDVDPrice) {
        String mediaType = "DVD";
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).getMediaType().equals(mediaType)) {
                allProducts.get(i).setPrice(newDVDPrice);
            }
        }
    }

    public void ChangeBluRayPrice(ArrayList<Product> allProducts, double newBluRayPrice) {
        String mediaType = "BluRay";
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).getMediaType().equals(mediaType)) {
                allProducts.get(i).setPrice(newBluRayPrice);
            }
        }//end for loop
    }//end ChangeBluRayPrice

    public void changeGamesPrice(ArrayList<Product> allProducts, double newGamePrice) {
        String mediaTypeOne = "Xbox";
        String mediaTypeTwo = "PS4";
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).getMediaType().equals(mediaTypeOne)
                    || allProducts.get(i).getMediaType().equals(mediaTypeTwo)) {
                allProducts.get(i).setPrice(newGamePrice);
            }
        }//end for loop
    }//end changeGamePrice

    public void setVolumeDiscount(double discount) {

    }

    public void setPromoCodes(String codes) {

    }

    public void disableUnit() {
        status = true;
    }

    public void enableUnit() {
        status = false;
    }

    public boolean checkUnitStatus(boolean isPurpleBoxDisabled) {
        if (isPurpleBoxDisabled = true) {
            System.out.println("Unit disabled. Try again later.");
            return true;
        }
        return false;
    }

    @Override
    public void changeBluRayPrice(ArrayList<Product> bluRayList, double newBluRayPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changeGamePrice(ArrayList<Product> gameList, double newGamePrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

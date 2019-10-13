
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PurpleBoxTestClient {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        //variables
        int userInput = -1;
        boolean mainFlag = false;
        boolean movieFlag = false;
        boolean gameFlag = false;
        boolean adminFlag = false;
        PurpleBox purpleBox = new PurpleBox();
        ArrayList<Product> allProducts = createProductList();
        ArrayList<Product> cart = new ArrayList<Product>();
        ArrayList<Product> movieList = createMovieList(allProducts);
        ArrayList<Product> gameList = createGameList(allProducts);

        //PurpleBox Main Menu
        while (mainFlag == false) {
            //call printMainMenu() method
            do {
                try {
                    printMainMenu();

                    System.out.print("Make selection: ");
                    userInput = console.nextInt();

                    if (userInput < 0 || userInput > 4) {
                        throw new Exception();
                    }

                    System.out.println();

                    break;

                } catch (InputMismatchException e) {
                    System.out.println("\n** Enter a number 0-4. **\n");
                    console.next();
                } catch (Exception e) {
                    System.out.println("\n** Enter a number 0-4. **\n");
                }
            } while (true);

            switch (userInput) {
                //Movie Menu
                case 1:
                    ArrayList<Product> allMovies = new ArrayList<Product>();
                    //allMovies = purpleBox.viewAllMovies(allProducts);
                    allMovies = movieList;

                    while (movieFlag == false) {
                        userInput = -1;   //reset userInput

                        do {
                            try {
                                printMovieMenu();

                                System.out.print("Make selection: ");
                                userInput = console.nextInt();

                                if (userInput < 0 || userInput > 6) {
                                    throw new Exception();
                                }

                                System.out.println();

                                break;

                            } catch (InputMismatchException e) {
                                System.out.println("\n** Enter a number 0-7. **\n");
                                console.next();
                            } catch (Exception e) {
                                System.out.println("\n** Enter a number 0-7. **\n");
                            }
                        } while (true);

                        switch (userInput) {   //movie menu cases
                            case 1:   //view all movies
                                userInput = -1;
                                makeSelectionMenu(allMovies, cart, purpleBox);
                                break;
                            case 2:   //search by name
                                userInput = -1;
                                break;
                            case 3:   //search by genre
                                userInput = -1;
                                String genre = "";
                                ArrayList<Product> listByGenre = new ArrayList<Product>();
                                //listByGenre = purpleBox.viewAllMovies(allProducts);
                                allMovies = movieList;

                                do {
                                    try {
                                        System.out.println("Which genre are you looking for?\n"
                                                + "  1 -- Action\n"
                                                + "  2 -- Comedy\n"
                                                + "  3 -- Documentary\n"
                                                + "  4 -- Drama\n"
                                                + "  5 -- Family\n"
                                                + "  6 -- Horror\n"
                                                + "  7 -- Romance\n"
                                                + "  8 -- Sci-Fi\n");
                                        System.out.print("Choose a number 1-8: ");
                                        userInput = console.nextInt();

                                        if (userInput < 1 || userInput > 8) {
                                            throw new Exception();
                                        }

                                        System.out.println();

                                        break;

                                    } catch (InputMismatchException e) {
                                        System.out.println("\n** Enter a number 1-8. **\n");
                                        console.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("\n** Enter a number 1-8. **\n");
                                    }
                                } while (true);

                                switch (userInput) {
                                    case 1:
                                        genre = "Action";
                                        break;
                                    case 2:
                                        genre = "Comedy";
                                        break;
                                    case 3:
                                        genre = "Documentary";
                                        break;
                                    case 4:
                                        genre = "Drama";
                                        break;
                                    case 5:
                                        genre = "Family";
                                        break;
                                    case 6:
                                        genre = "Horror";
                                        break;
                                    case 7:
                                        genre = "Romance";
                                        break;
                                    case 8:
                                        genre = "Sci-Fi";
                                        break;
                                }
                                userInput = -1;

                                //call PurpleBox's searchByGenre() method
                                listByGenre = purpleBox.searchByGenre(allMovies, genre);

                                makeSelectionMenu(listByGenre, cart, purpleBox);

                                break;
                            case 4:   //search by disc type
                                userInput = -1;
                                String format = "";
                                ArrayList<Product> listByFormat = new ArrayList<Product>();
                                //listByFormat = purpleBox.viewAllMovies(allProducts);
                                allMovies = movieList;

                                do {
                                    try {
                                        System.out.println("Which disc format are you looking for?\n"
                                                + "  1 -- DVD\n"
                                                + "  2 -- Blu-Ray\n");
                                        System.out.print("Choose a number 1-2: ");
                                        userInput = console.nextInt();

                                        if (userInput < 1 || userInput > 2) {
                                            throw new Exception();
                                        }

                                        System.out.println();

                                        break;

                                    } catch (InputMismatchException e) {
                                        System.out.println("\n** Enter a number 1-2. **\n");
                                        console.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("\n** Enter a number 1-2. **\n");
                                    }
                                } while (true);

                                switch (userInput) {
                                    case 1:
                                        format = "DVD";
                                        break;
                                    case 2:
                                        format = "Blu-Ray";
                                        break;
                                }
                                userInput = -1;

                                //call PurpleBox's searchByGenre() method
                                listByFormat = purpleBox.searchByFormat(allMovies, format);

                                makeSelectionMenu(listByFormat, cart, purpleBox);

                                break;
                            case 5:   //search by release date
                                userInput = -1;
                                String releaseDate = "";
                                ArrayList<Product> listByDate = new ArrayList<Product>();
                                //listByDate = purpleBox.viewAllMovies(allProducts);
                                allMovies = movieList;

                                do {
                                    try {
                                        System.out.println("Which year are you looking for?\n"
                                                + "  1 -- 2016\n"
                                                + "  2 -- 2017\n"
                                                + "  3 -- 2018\n"
                                                + "  4 -- 2019\n");
                                        System.out.print("Choose a number 1-4: ");
                                        userInput = console.nextInt();

                                        if (userInput < 1 || userInput > 4) {
                                            throw new Exception();
                                        }

                                        System.out.println();

                                        break;

                                    } catch (InputMismatchException e) {
                                        System.out.println("\n** Enter a number 1-4. **\n");
                                        console.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("\n** Enter a number 1-4. **\n");
                                    }
                                } while (true);

                                switch (userInput) {
                                    case 1:
                                        releaseDate = "2016";
                                        break;
                                    case 2:
                                        releaseDate = "2017";
                                        break;
                                    case 3:
                                        releaseDate = "2018";
                                        break;
                                    case 4:
                                        releaseDate = "2019";
                                        break;
                                }
                                userInput = -1;

                                // call PurpleBox's searchByGenre() method
                                listByDate = purpleBox.searchByReleaseDate(allMovies, releaseDate);

                                makeSelectionMenu(listByDate, cart, purpleBox);

                                break;
                            case 6:   //search by meta score
                                userInput = -1;
                                int metaScore = 0;
                                ArrayList<Product> listByMetaScore = new ArrayList<Product>();
                                //listByMetaScore = purpleBox.viewAllMovies(allProducts);
                                allMovies = movieList;

                                do {
                                    try {
                                        System.out.println("Which score are you looking for?\n"
                                                + "  1 -- 1 Star\n"
                                                + "  2 -- 2 Stars\n"
                                                + "  3 -- 3 Stars\n"
                                                + "  4 -- 4 Stars\n"
                                                + "  5 -- 5 Stars\n");
                                        System.out.print("Choose a number 1-5: ");
                                        userInput = console.nextInt();

                                        if (userInput < 1 || userInput > 5) {
                                            throw new Exception();
                                        }

                                        System.out.println();

                                        break;

                                    } catch (InputMismatchException e) {
                                        System.out.println("\n** Enter a number 1-5. **\n");
                                        console.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("\n** Enter a number 1-5. **\n");
                                    }
                                } while (true);

                                switch (userInput) {
                                    case 1:
                                        metaScore = 1;
                                        break;
                                    case 2:
                                        metaScore = 2;
                                        break;
                                    case 3:
                                        metaScore = 3;
                                        break;
                                    case 4:
                                        metaScore = 4;
                                        break;
                                    case 5:
                                        metaScore = 5;
                                        break;
                                }
                                userInput = -1;

                                // call PurpleBox's searchByGenre() method
                                listByMetaScore = purpleBox.searchByMetaScore(allMovies, metaScore);

                                makeSelectionMenu(listByMetaScore, cart, purpleBox);

                                break;
                            case 7:
                                userInput = -1;
                                viewCart(cart);

                                do {
                                    try {
                                        System.out.println("What next\n"
                                                + "  1 -- Proceed to checkout\n"
                                                + "  2 -- Continue shopping\n");
                                        System.out.println("Choose a number 1-2: ");
                                        userInput = console.nextInt();

                                        if (userInput < 1 || userInput > 2) {
                                            throw new Exception();
                                        }

                                        System.out.println();

                                        break;

                                    } catch (InputMismatchException e) {
                                        System.out.println("\n** Enter a number 1-2. **\n");
                                        console.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("\n** Enter a number 1-2. **\n");
                                    }
                                } while (true);

                                //Proceed to checkout
                                if (userInput == 1) {
                                    //purpleBox.checkout(cart);
                                    movieFlag = true;
                                }

                                break;
                            case 0:  //return to Main Menu
                                userInput = -1;
                                movieFlag = true;
                                break;

                        } //end switch
                    } //end Movie Menu loop

                    break;

                //Game Menu
                case 2:
                    ArrayList<Product> allGames = new ArrayList<Product>();
                    //allGames = purpleBox.viewAllGames(allProducts);
                    allGames = gameList;

                    while (gameFlag == false) {
                        userInput = -1;   //reset userInput

                        do {
                            try {
                                printGameMenu();

                                System.out.print("Make selection: ");
                                userInput = console.nextInt();

                                if (userInput < 0 || userInput > 6) {
                                    throw new Exception();
                                }

                                System.out.println();

                                break;

                            } catch (InputMismatchException e) {
                                System.out.println("\n** Enter a number 0-7. **\n");
                                console.next();
                            } catch (Exception e) {
                                System.out.println("\n** Enter a number 0-7. **\n");
                            }
                        } while (true);

                        switch (userInput) {   //game menu cases
                            case 1:   //view all games
                                userInput = -1;
                                makeSelectionMenu(allGames, cart, purpleBox);
                                break;
                            case 2:   //search by name
                                userInput = -1;

                                break;
                            case 3:   //search by genre
                                userInput = -1;
                                String genre = "";
                                ArrayList<Product> listByGenre = new ArrayList<Product>();
                                //listByGenre = purpleBox.viewAllMovies(allProducts);
                                allGames = gameList;

                                do {
                                    try {
                                        System.out.println("Which genre are you looking for?\n"
                                                + "  1 -- FPS\n"
                                                + "  2 -- MMORPG\n"
                                                + "  3 -- Strategy\n"
                                                + "  4 -- Racing\n");
                                        System.out.print("Choose a number 1-4: ");
                                        userInput = console.nextInt();

                                        if (userInput < 1 || userInput > 4) {
                                            throw new Exception();
                                        }

                                        System.out.println();

                                        break;

                                    } catch (InputMismatchException e) {
                                        System.out.println("\n** Enter a number 1-4. **\n");
                                        console.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("\n** Enter a number 1-4. **\n");
                                    }
                                } while (true);

                                switch (userInput) {
                                    case 1:
                                        genre = "FPS";
                                        break;
                                    case 2:
                                        genre = "MMORPG";
                                        break;
                                    case 3:
                                        genre = "Strategy";
                                        break;
                                    case 4:
                                        genre = "Racing";
                                        break;
                                }
                                userInput = -1;

                                // call PurpleBox's searchByGenre() method
                                listByGenre = purpleBox.searchByGenre(allGames, genre);

                                makeSelectionMenu(listByGenre, cart, purpleBox);

                                break;
                            case 4:   //search by disc type
                                userInput = -1;
                                String format = "";
                                ArrayList<Product> listByFormat = new ArrayList<Product>();

                                do {
                                    try {
                                        System.out.println("Which game platform are you looking for?\n"
                                                + "  1 -- Xbox\n"
                                                + "  2 -- PS4\n");
                                        System.out.print("Choose a number 1-2: ");
                                        userInput = console.nextInt();

                                        if (userInput < 1 || userInput > 2) {
                                            throw new Exception();
                                        }

                                        System.out.println();

                                        break;

                                    } catch (InputMismatchException e) {
                                        System.out.println("\n** Enter a number 1-2. **\n");
                                        console.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("\n** Enter a number 1-2. **\n");
                                    }
                                } while (true);

                                switch (userInput) {
                                    case 1:
                                        format = "Xbox";
                                        break;
                                    case 2:
                                        format = "PS4";
                                        break;
                                }
                                userInput = -1;

                                // call PurpleBox's searchByFormat() method
                                listByFormat = purpleBox.searchByFormat(allGames, format);

                                makeSelectionMenu(listByFormat, cart, purpleBox);

                                break;
                            case 5:   //search by release date
                                userInput = -1;
                                String releaseDate = "";
                                ArrayList<Product> listByDate = new ArrayList<Product>();

                                do {
                                    try {
                                        System.out.println("Which year are you looking for?\n"
                                                + "  1 -- 2016\n"
                                                + "  2 -- 2017\n"
                                                + "  3 -- 2018\n"
                                                + "  4 -- 2019\n");
                                        System.out.print("Choose a number 1-4: ");
                                        userInput = console.nextInt();

                                        if (userInput < 1 || userInput > 4) {
                                            throw new Exception();
                                        }

                                        System.out.println();

                                        break;

                                    } catch (InputMismatchException e) {
                                        System.out.println("\n** Enter a number 1-4. **\n");
                                        console.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("\n** Enter a number 1-4. **\n");
                                    }
                                } while (true);

                                switch (userInput) {
                                    case 1:
                                        releaseDate = "2016";
                                        break;
                                    case 2:
                                        releaseDate = "2017";
                                        break;
                                    case 3:
                                        releaseDate = "2018";
                                        break;
                                    case 4:
                                        releaseDate = "2019";
                                        break;
                                }
                                userInput = -1;

                                //call PurpleBox's searchByReleaseDate() method
                                listByDate = purpleBox.searchByReleaseDate(allGames, releaseDate);

                                makeSelectionMenu(listByDate, cart, purpleBox);

                                break;
                            case 6:   //search by meta score
                                userInput = -1;
                                int metaScore = 0;
                                ArrayList<Product> listByMetaScore = new ArrayList<Product>();

                                do {
                                    try {
                                        System.out.println("Which score are you looking for?\n"
                                                + "  1 -- 1 Star\n"
                                                + "  2 -- 2 Stars\n"
                                                + "  3 -- 3 Stars\n"
                                                + "  4 -- 4 Stars\n"
                                                + "  5 -- 5 Stars\n");
                                        System.out.print("Choose a number 1-5: ");
                                        userInput = console.nextInt();

                                        if (userInput < 1 || userInput > 5) {
                                            throw new Exception();
                                        }

                                        System.out.println();

                                        break;

                                    } catch (InputMismatchException e) {
                                        System.out.println("\n** Enter a number 1-5. **\n");
                                        console.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("\n** Enter a number 1-5. **\n");
                                    }
                                } while (true);

                                switch (userInput) {
                                    case 1:
                                        metaScore = 1;
                                        break;
                                    case 2:
                                        metaScore = 2;
                                        break;
                                    case 3:
                                        metaScore = 3;
                                        break;
                                    case 4:
                                        metaScore = 4;
                                        break;
                                    case 5:
                                        metaScore = 5;
                                        break;
                                }
                                userInput = -1;

                                // call PurpleBox's searchByMetaScore() method
                                listByMetaScore = purpleBox.searchByMetaScore(allGames, metaScore);

                                makeSelectionMenu(listByMetaScore, cart, purpleBox);

                                break;
                            case 7:
                                userInput = -1;
                                viewCart(cart);

                                do {
                                    try {
                                        System.out.println("What next?\n"
                                                + "  1 -- Proceed to checkout\n"
                                                + "  2 -- Continue shopping\n");
                                        System.out.println("Choose a number 1-2: ");
                                        userInput = console.nextInt();

                                        if (userInput < 1 || userInput > 2) {
                                            throw new Exception();
                                        }

                                        System.out.println();

                                        break;

                                    } catch (InputMismatchException e) {
                                        System.out.println("\n** Enter a number 1-2. **\n");
                                        console.nextLine();
                                    } catch (Exception e) {
                                        System.out.println("\n** Enter a number 1-2. **\n");
                                    }
                                } while (true);

                                //Proceed to checkout
                                if (userInput == 1) {
                                    //purpleBox.checkout(cart);
                                    gameFlag = true;
                                }

                                break;
                            case 0:  //return to Main Menu
                                userInput = -1;
                                gameFlag = true;
                                break;

                        }
                    } //end Game Menu loop

                    break;

                //Return Product Menu
                case 3:
                    userInput = -1;

                    //makeReturnMenu(allProducts, cart, purpleBox);
                    break;

                //Administrator Menu 
                case 4:
                    while (adminFlag == false) {
                        userInput = -1;

                        do {
                            try {
                                printAdminMenu();

                                System.out.print("Make a selection: ");
                                userInput = console.nextInt();

                                if (userInput < 0 || userInput > 6) {
                                    throw new Exception();
                                }

                                System.out.println();

                                break;

                            } catch (InputMismatchException e) {
                                System.out.println("\n** Enter a number 0-9. **\n");
                                console.next();
                            } catch (Exception e) {
                                System.out.println("\n** Enter a number 0-9. **\n");
                            }
                        } while (true);

                        switch (userInput) {
                            case 1:  //add to inventory
                                console.nextLine();

                                System.out.print("Please enter title: ");
                                String name = console.nextLine();

                                System.out.print("Please enter genre: ");
                                String genre = console.nextLine();

                                System.out.print("Please enter media type: ");
                                String mediaType = console.nextLine();

                                System.out.print("Please enter release date: ");
                                String releaseDate = console.nextLine();

                                System.out.print("Please enter metascore: ");
                                int metaScore = console.nextInt();

                                System.out.print("Please enter price: ");
                                double price = console.nextDouble();

                                boolean isAvailable = true;

                                allProducts.add(new Product(name, genre, mediaType, releaseDate, metaScore, price, isAvailable));

                                break;

                            case 2:  //remove from inventory
                                System.out.println("Please enter the name of the product you wish to remove from inventory: ");
                                String searchName = console.next();

                                Product someProduct = purpleBox.searchByName(allProducts, searchName);

                                purpleBox.removeProductFromInventory(someProduct);

                                break;

                            case 3:  //change prices dvd
                                System.out.println("Please enter the new price for DVDs: ");
                                double newDVDPrice = console.nextDouble();

                                purpleBox.changeDVDPrice(allProducts, newDVDPrice);

                                System.out.println("The price of all DVDs has been set to: $" + newDVDPrice);

                                break;

                            case 4:  //change prices blu-ray
                                System.out.println("Please enter the new price for Blu-Rays: ");
                                double newBluRayPrice = console.nextDouble();

                                purpleBox.changeBluRayPrice(allProducts, newBluRayPrice);

                                System.out.println("The price of all Blu-Rays has been set to: $" + newBluRayPrice);

                                break;

                            case 5:  //change prices games
                                System.out.println("Please enter the new price for games: ");
                                double newGamePrice = console.nextDouble();

                                purpleBox.changeGamePrice(allProducts, newGamePrice);

                                System.out.println("The price of all gamess has been set to: $" + newGamePrice);

                                break;

                            case 6:  //volume discount
                                System.out.println("Please enter the volume discount you would like to set: ");
                                double newVolumeDiscount = console.nextDouble();

                                purpleBox.setVolumeDiscount(newVolumeDiscount);

                                System.out.println("Volume discount has been set at " + newVolumeDiscount);

                                break;

                            case 7:  //add promo code
                                System.out.println("Please enter a new promo code: ");
                                String newCode = console.next();

                                purpleBox.setPromoCodes(newCode);

                                System.out.println("Promo code has been set to " + newCode);

                                break;

                            case 8:  //enable unit
                                purpleBox.enableUnit();
                                System.out.println("Unit has been enabled.");
                                break;

                            case 9:  //disable unit
                                purpleBox.disableUnit();
                                System.out.println("Unit has been disabled.");
                                break;

                            case 0:  //return to Main Menu
                                userInput = -1;
                                adminFlag = true;
                                break;
                        }
                    } //end Administrator Menu loop

                    break;

                case 0:  //exit PurpleBox
                    mainFlag = true;   //break Main Menu loop and exit program
                    break;
            }
        } //end Main Menu loop

        System.out.println("Thank you for visiting PurpleBox!\n\n"
                + "** Goodbye **");

        System.exit(0);

    } //end PurpleBox program

    public static void printMainMenu() {
        System.out.println("Welcome!\n\n"
                + "  1 -- Rent a Movie\n"
                + "  2 -- Rent a Game\n"
                + "  3 -- Return a Movie / Game\n"
                + "  4 -- Login as Admin\n"
                + "  0 -- Exit PurpleBox\n");
    }

    public static void printMovieMenu() {
        System.out.println("Rent a Movie\n"
                + "  1 -- View All Movies\n"
                + "  2 -- Search by Name\n"
                + "  3 -- Search by Genre\n"
                + "  4 -- Search by Disc Type\n"
                + "  5 -- Search by Release Date\n"
                + "  6 -- Search by MetaScore\n"
                + "  7 -- View Cart\n"
                + "  0 -- Return to Main Menu\n");
    }

    public static void printGameMenu() {
        System.out.println("Rent a Game\n"
                + "  1 -- View All Games\n"
                + "  2 -- Search by Name\n"
                + "  3 -- Search by Genre\n"
                + "  4 -- Search by Disc Type\n"
                + "  5 -- Search by Release Date\n"
                + "  6 -- Search by MetaScore\n"
                + "  7 -- View Cart\n"
                + "  0 -- Return to Main Menu\n");
    }

    public static void printAdminMenu() {
        System.out.println("Admin Menu\n"
                + "  1 -- Add movie to inventory\n"
                + "  2 -- Remove movie from inventory\n"
                + "  3 -- Change prices for DVDs\n"
                + "  4 -- Change prices for Blu-rays\n"
                + "  5 -- Change prices for all games\n"
                + "  6 -- Add Volume discount\n"
                + "  7 -- Add Promo Code\n"
                + "  8 -- Enable Unit\n"
                + "  9 -- Disable Unit\n"
                + "  0 -- Return to Main Menu\n");
    }

    public static void makeSelectionMenu(ArrayList<Product> productList, ArrayList<Product> cart, PurpleBox purpleBox) {

        boolean flag = false;
        char userInput;
        String someTitle;
        Product foundProduct = null;

        while (true) {   //1st while loop
            while (flag == false) {   //2nd while loop
                //print list of products
                System.out.println(productList);

                System.out.print("\nDid you find what you were looking for?\n"
                        + "Type 'Y' for 'Yes', 'N' for 'No': ");
                userInput = console.next().charAt(0);

                if (userInput == 'Y') {
                    while (true) {   //3rd while loop
                        System.out.print("\nOkay! Type in a title, then press Enter: ");
                        someTitle = console.next();

                        //search productList for someTitle
                        for (int i = 0; i < productList.size(); i++) {
                            if (productList.get(i).getName().compareTo(someTitle) == 0) {
                                foundProduct = productList.get(i);

                                System.out.println("\nFound it!\n\n"
                                        + foundProduct);
                                System.out.print("Add to cart?\n"
                                        + "Type 'Y' for 'Yes', 'N' for 'No': ");
                                userInput = console.next().charAt(0);

                                if (userInput == 'Y') {
                                    //call PurpleBox's addToCart() method
                                    purpleBox.addToCart(cart, foundProduct);
                                }

                                break;
                            }
                        } //end for loop

                        if (foundProduct == null) {
                            System.out.println("\nOops! Title not found.\n");
                        }

                        System.out.print("\nSearch for another title in this list?\n"
                                + "Type 'Y' for 'Yes', 'N' for 'No': ");
                        userInput = console.next().charAt(0);

                        foundProduct = null;

                        if (userInput == 'N') {
                            flag = true;   //escape 2nd while loop
                            break;
                        }

                    } //end 3rd while loop
                } //end if 'Y'
                else {
                    flag = true;
                }
            } //end 2nd while loop

            System.out.print("\nOkay, would you like to return to the previous menu?\n"
                    + "Type 'Y' for 'Yes', 'N' for 'No': ");
            userInput = console.next().charAt(0);
            System.out.println();

            if (userInput == 'Y') {
                break;   //escape 1st while loop and return User to previous menu
            }

        } //end 1st while loop

    }

    public static void makeReturnMenu(ArrayList<Product> cart, ArrayList<Product> productList, PurpleBox purpleBox) {

        boolean flag = false;
        char userInput;
        String someTitle;
        Product foundProduct = null;

        while (true) {   //1st while loop
            while (flag == false) {   //2nd while loop
                System.out.print("\nOkay! Type in a title you would like to return, then press Enter: ");
                someTitle = console.next();

                //search productList for someTitle
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getName().equalsIgnoreCase(someTitle)) {
                        foundProduct = productList.get(i);
                        productList.add(foundProduct);
                        System.out.print("Item has been returned to inventory");
                    }//end if
                }// end for loop
            } //end 2nd while

            if (foundProduct == null) {
                System.out.println("\nOops! Title not found.\n");
            }

            System.out.print("\nReturn another item?\n" + "Type 'Y' for 'Yes', 'N' for 'No': ");
            userInput = console.next().charAt(0);
            foundProduct = null;

            if (userInput == 'N') {
                flag = true; // escape 2nd while loop
                break;
            }

            System.out.print("\nOkay, would you like to return to the previous menu?\n" + "Type 'Y' for 'Yes', 'N' for 'No': ");
            userInput = console.next().charAt(0);
            System.out.println();

            if (userInput == 'Y') {
                break;   //escape 1st while loop and return User to previous menu
            }

        }  //end 1st while loop

    }

    public static ArrayList<Product> createProductList() {

        ArrayList<Product> productList = new ArrayList<Product>();

        Product movie1 = new Product("MovieA", "Family", "DVD", "2018", 5, 2.00, true);
        Product movie2 = new Product("MovieB", "Drama", "DVD", "2018", 3, 2.00, true);
        Product movie3 = new Product("MovieC", "Action", "DVD", "2019", 4, 2.00, true);
        Product movie4 = new Product("MovieD", "Action", "Blu-Ray", "2019", 4, 2.50, true);
        Product movie5 = new Product("MovieE", "Family", "Blu-Ray", "2018", 3, 2.50, true);
        Product movie6 = new Product("MovieF", "Sci-Fi", "Blu-Ray", "2019", 5, 2.50, true);
        Product game1 = new Product("GameA", "Action", "PS4", "2018", 5, 1.50, true);
        Product game2 = new Product("GameB", "Action", "PS4", "2019", 5, 1.50, true);
        Product game3 = new Product("GameC", "Action", "XBox", "2019", 5, 1.50, true);
        Product game4 = new Product("GameD", "Action", "XBox", "2018", 5, 1.50, true);

        productList.add(movie1);
        productList.add(movie2);
        productList.add(movie3);
        productList.add(movie4);
        productList.add(movie5);
        productList.add(movie6);
        productList.add(game1);
        productList.add(game2);
        productList.add(game3);
        productList.add(game4);

        return productList;
    }

    public static ArrayList<Product> createMovieList(ArrayList<Product> productList) {

        ArrayList<Product> movieList = new ArrayList<Product>();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getMediaType().equals("DVD") || productList.get(i).getMediaType().equals("Blu-Ray")) {
                movieList.add(productList.get(i));
            }
        }

        return movieList;
    }

    public static ArrayList<Product> createGameList(ArrayList<Product> productList) {

        ArrayList<Product> gameList = new ArrayList<Product>();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getMediaType().equals("PS4") || productList.get(i).getMediaType().equals("XBox")) {
                gameList.add(productList.get(i));
            }
        }

        return gameList;
    }

    public static void viewCart(ArrayList<Product> cart) {
        System.out.println(cart + "\n");
    }

}

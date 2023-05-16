
    public class APIResponseParser {

        /**
         * Parses the input text and returns a Book instance containing
         * the parsed data.
         * @param response text to be parsed
         * @return Book instance containing parsed data
         */

        public static Book parse(String response) {
            Book book = new Book();
            String endRule = "<";

            String startTitle = "<title>";
            String title = parse(response, startTitle, endRule);
            book.setTitle(title);

            // Your code
            String startName = "<name>";
            String name = parse(response, startName, endRule);
            book.setAuthor(name);

            String startPubYear = "<original_publication_year type=\"integer\">";
            String pubYear = parse(response, startPubYear, endRule);
            int pubLYear = Integer.parseInt(pubYear);
            book.setPublicationYear(pubLYear);

            String startRatingCount = "<ratings_count type=\"integer\">";
            String ratingCount = parse(response, startRatingCount, endRule);
            int ratingCountt = Integer.parseInt(ratingCount);
            book.setRatingsCount(ratingCountt);

            String image = "<image_url>";
            String imageUrl = parse(response, image, endRule);
            book.setImageUrl(imageUrl);


            return book;
        }

        // write overloaded parse method with the 3 parameters response, startRule, endRule
        private static String parse(String response, String startRule, String endRule){
            String parsed = "";
             String[] str = response.split(endRule);
                 for (String st : str){
                     System.out.println(st);
                 }


            return parsed;
        }

        public static void main(String[] args) {
            String response = "<work>" +
                    "<id type=\"integer\">2361393</id>" +
                    "<books_count type=\"integer\">813</books_count>" +
                    "<ratings_count type=\"integer\">1,16,315</ratings_count>" +
                    "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
                    "<original_publication_year type=\"integer\">1854</original_publication_year>" +
                    "<original_publication_month type=\"integer\" nil=\"true\"/>" +
                    "<original_publication_day type=\"integer\" nil=\"true\"/>" +
                    "<average_rating>3.79</average_rating>" +
                    "<best_book type=\"Book\">" +
                    "<id type=\"integer\">16902</id>" +
                    "<title>Walden</title>" +
                    "<author>" +
                    "<id type=\"integer\">10264</id>" +
                    "<name>Henry David Thoreau</name>" +
                    "</author>" +
                    "<image_url>" +
                    "http://images.gr-assets.com/books/1465675526m/16902.jpg" +
                    "</image_url>" +
                    "<small_image_url>" +
                    "http://images.gr-assets.com/books/1465675526s/16902.jpg" +
                    "</small_image_url>" +
                    "</best_book>" +
                    "</work>";

            APIResponseParser.parse(response);
        }



    }









class InvalidRecordException extends Exception{
    InvalidRecordException(String message){
        super(message);
    }
}
public class filevalidation {

    static void validation(String row) throws InvalidRecordException {
        String[] field = row.split(",");

        if (field.length != 3) {
            throw new InvalidRecordException("malform : " + row);
        }
        System.out.println("valid : "+row);
    }
    public static void main(String[] args) {
        String[] row = {
                "anu,101m,4000",
                "athira,101m,4000",
                "annu,101m,4000"
        };
        try {
            for ( String rows : row) {
                validation(rows);
            }
        }catch (InvalidRecordException e){
            System.out.println("ivalid");
        }
        catch (RuntimeException e){
            System.out.println("unexpected error");
        }
        finally {
            System.out.println("validateded");
        }
    }
}
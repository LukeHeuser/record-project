public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
}
// This code IMPLICITLY creates:
// * A field with the same name and declared type as the record component
// * The field is declared private and final
// (The field is sometimes referred to as a component field)
// * Generates a toString method that prints out each attribute in a formatted string
// * Java also generates a public accessor method for each component
// This method has the same name and type of the component but to call,
// there is no special prefix (like 'is' or 'get', etc.)





package nl.vintik.kotlin.examples.record;
import lombok.Value;
// similar to org.immutables
@Value
public class PersonLombok {
    String name;
    String occupation;
}

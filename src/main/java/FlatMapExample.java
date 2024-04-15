import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class FlatMapExample {

    public static void main(String[] args) {
        /*Optional<String> s = Optional.of("test");
        assertThat(Optional.of("TEST")).isEqualTo(s.map(String::toUpperCase));*/
        assertThat(Optional.of("STRING"))
                .isEqualTo(Optional.of("string")
                        .flatMap(s -> Optional.of("STRING")));

        List<String> upperAlphabets =
                Arrays.asList("a", "b", "c")
                        .stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
        assertThat(List.of("A", "B", "C")).isEqualTo(upperAlphabets);

        List<List<String>> list = Arrays.asList(List.of("A"), List.of("B"), List.of("C"));
        System.out.println(list);

        System.out.println(list.stream().flatMap(Collection::stream).collect(Collectors.toList()));
        list.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}

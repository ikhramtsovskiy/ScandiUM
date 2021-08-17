package space.b2u.ScandiUM.entity;

import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
public class QueryResult<T> {
    private Integer count;
    private String next;
    private String previous;
    private List<T> results;
}

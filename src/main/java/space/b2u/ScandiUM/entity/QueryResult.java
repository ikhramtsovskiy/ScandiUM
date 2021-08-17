package space.b2u.ScandiUM.entity;

import lombok.Data;

import java.util.List;

@Data
public class QueryResult {
    private Integer count;
    private String next;
    private String previous;
    private List<Object> results;
}

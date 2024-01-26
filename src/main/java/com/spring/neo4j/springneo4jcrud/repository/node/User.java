package com.spring.neo4j.springneo4jcrud.repository.node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("User")
public class User {

    @Id
    @GeneratedValue
    Long id;

    String name;

    @Relationship(type = "VISITED")
    List<Place> places;
}

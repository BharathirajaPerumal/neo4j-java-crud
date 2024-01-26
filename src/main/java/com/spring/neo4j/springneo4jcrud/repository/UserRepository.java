package com.spring.neo4j.springneo4jcrud.repository;

import com.spring.neo4j.springneo4jcrud.repository.node.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long> {
}

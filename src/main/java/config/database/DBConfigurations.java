package config.database;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import java.io.File;

/**
 * Created by harshaxsoad on 4/24/16.
 */
public class DBConfigurations {
    private GraphDatabaseService graphDatabaseService;
    private GraphDatabaseFactory graphDatabaseFactory;
    private File DBPath;

    public DBConfigurations()
    {
        graphDatabaseFactory = new GraphDatabaseFactory();
    }

    public DBConfigurations setDatabasePath(String DBPath)
    {
        this.DBPath = new File(DBPath);
        return this;
    }

    public GraphDatabaseService createService()
    {
        graphDatabaseService = graphDatabaseFactory.newEmbeddedDatabase(DBPath);
        return graphDatabaseService;
    }
}

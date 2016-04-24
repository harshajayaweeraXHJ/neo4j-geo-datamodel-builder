/**
 * Created by harshaxsoad on 4/24/16.
 * Project "Enroute" Api validation
 */

package spatialmain;


import org.neo4j.graphdb.*;
import domain_object_node_modeling.objectnodes.*;
import config.database.*;

public class apitest {

 static Persons persons;
 static GeoRelationships geoRelationships;
 static private final String DB_PATH = "/home/harshaxsoad/Documents/dev/dataworkspace/neoDBs/apitest";


    public static void main(String args[])
    {

        GraphDatabaseService gdbService = new DBConfigurations()
                                              .setDatabasePath(DB_PATH)
                                              .createService();


        Result result = gdbService.execute("MATCH (a)-[:DIST_10_MILES_RADIUS]->(b) RETURN a,b");
        String resultStr = result.resultAsString();
        System.out.println(result);



        try(Transaction tx = gdbService.beginTx())
        {

            Node personA = gdbService.createNode(persons.personA);
            Node personB = gdbService.createNode(persons.personB);

            personA.setProperty("name", "jhon");
            personA.setProperty("goelocation", "califonia");

            personB.setProperty("name", "doe");
            personB.setProperty("goelocation", "colombo");

            Relationship relationship = personA.createRelationshipTo(personB, geoRelationships.DIST_10_MILES_RADIUS);
                relationship.setProperty("type", "geo-blocks"); // Geo block means segmenting based on country, city, province while geo-coordination means GPS cods

            tx.success();
        }

        System.out.println("Operation Finished executing....");


    }


}



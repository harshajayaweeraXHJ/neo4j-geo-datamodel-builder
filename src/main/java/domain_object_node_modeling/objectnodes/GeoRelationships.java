/**
 * Created by harshaxsoad on 4/24/16.
 */

package domain_object_node_modeling.objectnodes;
import org.neo4j.graphdb.RelationshipType;


public enum GeoRelationships implements RelationshipType
{
    DIST_10_MILES_RADIUS,
    DIST_20_MILES_RADIUS,
    DIST_COUNTRY_SRI_LANKA,
    DIST_COUNTRY_USA,
}

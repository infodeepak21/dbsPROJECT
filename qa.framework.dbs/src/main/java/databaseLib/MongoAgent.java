package databaseLib;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

public class MongoAgent {
	
//	/** logger informations */
//	private static final Logger LOGGER = Logger.getLogger(MongoAgent.class);
//	
//	static MongoClient mongoClient = null;
//	static MongoDatabase mongoDatabase = null;
//	
//	/**
//	 * Method to get mongoDb connection.
//	 * 
//	 * @param properties 
//	 * 
//	 * @return mongoDatabase
//	 */
//	public static MongoDatabase getDB(final Properties properties) {
//		try {
//			if (mongoClient == null) {
//				mongoDatabase = connectToMongo(properties);
//	        }
//		} catch(Exception e) {
//			LOGGER.log(Level.ERROR, "Exception occured.", e);
//		}
//		return mongoDatabase;
//	}
//
//	/**
//	 * Method to get mongoDb connection.
//	 * @param properties 
//	 * 
//	 * @param properties
//	 * 				required to load mongoDb credentials
//	 * 
//	 * @return mongoDatabase
//	 */
//	public static final MongoDatabase connectToMongo(final Properties properties) {
//		try {
//			final String mongoUser = properties.getProperty("db.user");
//			final String mongoPass = properties.getProperty("db.password");
//			final String mongoDBName = properties.getProperty("db.name");
//
//			final List<MongoCredential> credentials = new ArrayList<MongoCredential>();
//			MongoCredential credential = MongoCredential.createCredential(mongoUser, mongoDBName,
//					mongoPass.toCharArray());
//			credentials.add(credential);
//
//			final List<ServerAddress> servers = new ArrayList<ServerAddress>();
//
//			Arrays.asList(properties.getProperty("db.host").split(",")).stream().forEach(mongoHost -> {
//				String host = mongoHost.split(":")[0];
//				int port = Integer.parseInt(mongoHost.split(":")[1]);
//				ServerAddress server = null;
//				try {
//					server = new ServerAddress(InetAddress.getByName(host), port);
//				} catch (Exception e) {
//					LOGGER.log(Level.ERROR, "Exception occured.", e);
//				}
//				servers.add(server);
//			});
//
//			MongoClientOptions.Builder optionsBuilder = new MongoClientOptions.Builder();
//			optionsBuilder.socketKeepAlive(true);
//			MongoClientOptions options = optionsBuilder.build();
//
//			mongoClient = new MongoClient(servers, credentials, options);
//			mongoDatabase = mongoClient.getDatabase(mongoDBName);
//
//		} catch (Exception e) {
//			LOGGER.log(Level.ERROR, "Could not connect to Mongo.", e);
//		}
//		return mongoDatabase;
//	}


}

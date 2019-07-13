/**
 * 
 */
package org.tysonbowers.javabrains.restfulmessenger.database;

import java.util.HashMap;
import java.util.Map;

import org.tysonbowers.javabrains.restfulmessenger.model.Message;
import org.tysonbowers.javabrains.restfulmessenger.model.Profile;

/**
 * @author tysonbowers
 *
 */
public class DatabaseClass {

		private static Map<Long, Message> messages = new HashMap<>();
		private static Map<Long, Profile> profiles = new HashMap<>();
		
		public static Map<Long, Message> getMessages() {
			return messages;
		}
		
		public static Map<Long, Profile> getProfiles() {
			return profiles;
		}
		
}

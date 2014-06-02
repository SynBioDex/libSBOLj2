package src.main.java.org.sbolstandard.core.context;

import java.net.URI;

import src.main.java.org.sbolstandard.core.Documented;

public class Context 
	extends Documented {

	private URI type;
	
	/**
	private String measurementDevice;
	private String environment;
	private String container;
	private String medium;
	private String composition;
	 **/
	
	public Context(URI identity, String displayId, URI type) {
		super(identity, displayId);
		this.type = type;		
	}

	/**
	 * @return the type
	 */
	public URI getType() {
		return type;
	}

	
//	/**
//	 * @return the container
//	 */
//	public String getContainer() {
//		return container;
//	}
//
//	/**
//	 * @param container the container to set
//	 */
//	public void setContainer(String container) {
//		this.container = container;
//	}
//
//	/**
//	 * @return the environment
//	 */
//	public String getEnvironment() {
//		return environment;
//	}
//
//	/**
//	 * @param environment the environment to set
//	 */
//	public void setEnvironment(String environment) {
//		this.environment = environment;
//	}
//
//	/**
//	 * @return the measurementDevice
//	 */
//	public String getMeasurementDevice() {
//		return measurementDevice;
//	}
//
//	/**
//	 * @param measurementDevice the measurementDevice to set
//	 */
//	public void setMeasurementDevice(String measurementDevice) {
//		this.measurementDevice = measurementDevice;
//	}
//
//	/**
//	 * @return the medium
//	 */
//	public String getMedium() {
//		return medium;
//	}
//
//	/**
//	 * @param medium the medium to set
//	 */
//	public void setMedium(String medium) {
//		this.medium = medium;
//	}
//
//	/**
//	 * @return the composition
//	 */
//	public String getComposition() {
//		return composition;
//	}
//
//	/**
//	 * @param composition the composition to set
//	 */
//	public void setComposition(String composition) {
//		this.composition = composition;
//	}

}

package com.jcworx.stub;

/**
 * This is the stub generation file that is used to generate subs that are used for testing.
 * @author jbustamove
 */
public interface Generator {
    
    /**
     * Generate a Stub based on the specific stubType passed in. The stub will contain fully populated 
     * member variable values based on their name. Please note, that the stubType needs to be a part of 
     * the classpath.
     * @param <T> The type to generate.
     * @param stubType The stub type to generate the class with specific param values.
     * @return A stub type that contains values populated in each of its member variables.
     */
    <T> T genStub(Class<T> stubType);
}

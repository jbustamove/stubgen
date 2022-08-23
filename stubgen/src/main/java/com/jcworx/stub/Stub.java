package com.jcworx.stub;

/**
 * Generate a stub class instance populated with values to be used for
 * testing. 
 * 
 * <p>Usage</p>
 * <p>
 * Foo foo = Stub.generate(Foo.class);
 * </p>
 * 
 * @author jbustamove
 */
public final class Stub{

    private Stub(){
        //private constructor to prevent instance creation.
    }

    /**
     * Generate any stub from the stubType class containing fully populated
     * values
     * @param <T> The type of stub to generate defined at runtime.
     * @param stubType The stub type to generate
     * @return A fully instantiated stub containing values in each private member.
     */
    public static <T> T generate(Class<T> stubType) {
        return null;
    }
}

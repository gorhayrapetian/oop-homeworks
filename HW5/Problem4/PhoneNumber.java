package Problem4;

// Define a class named PhoneNumber
class PhoneNumber {
    // Declare private fields to store mobile network code and subscriber number
    private String mobileNetworkCode;
    private String subscriberNumber;

    // Define constants for call cost within and between networks
    private static final double INTRA_NETWORK_COST = 0.05;
    private static final double INTER_NETWORK_COST = 0.20;

    // Constructor to initialize PhoneNumber objects with network code and subscriber number
    /**
     * Constructs a PhoneNumber object with the specified mobile network code and subscriber number.
     *
     * @param mobileNetworkCode the mobile network code
     * @param subscriberNumber the subscriber number
     */
    public PhoneNumber(String mobileNetworkCode, String subscriberNumber) {
        this.mobileNetworkCode = mobileNetworkCode;
        this.subscriberNumber = subscriberNumber;
    }

    // Getter method to retrieve the mobile network code
    /**
     * Retrieves the mobile network code of the PhoneNumber object.
     *
     * @return the mobile network code
     */
    public String getMobileNetworkCode() {
        return mobileNetworkCode;
    }

    // Getter method to retrieve the subscriber number
    /**
     * Retrieves the subscriber number of the PhoneNumber object.
     *
     * @return the subscriber number
     */
    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    // Setter method to set the mobile network code
    /**
     * Sets the mobile network code of the PhoneNumber object.
     *
     * @param mobileNetworkCode the mobile network code to set
     */
    public void setMobileNetworkCode(String mobileNetworkCode) {
        this.mobileNetworkCode = mobileNetworkCode;
    }

    // Setter method to set the subscriber number
    /**
     * Sets the subscriber number of the PhoneNumber object.
     *
     * @param subscriberNumber the subscriber number to set
     */
    public void setSubscriberNumber(String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }

    // Method to calculate the cost of a call based on duration and destination code
    /**
     * Calculates the cost of a call based on the duration and destination code.
     * If the call is within the same network, it uses the INTRA_NETWORK_COST constant;
     * otherwise, it uses the INTER_NETWORK_COST constant.
     *
     * @param duration the duration of the call
     * @param destinationCode the destination mobile network code
     * @return the cost of the call
     */
    public double calculateCost(double duration, String destinationCode) {
        // Check if the call is within the same network or not
        if (this.mobileNetworkCode.equals(destinationCode)) {
            // If within the same network, calculate cost using INTRA_NETWORK_COST
            return duration * INTRA_NETWORK_COST;
        } else {
            // If between different networks, calculate cost using INTER_NETWORK_COST
            return duration * INTER_NETWORK_COST;
        }
    }

    // Static method to calculate the cost of a call between two different networks
    /**
     * Calculates the cost of a call between two different networks based on the duration,
     * source network code, and destination network code.
     * If the call is within the same network, it uses the INTRA_NETWORK_COST constant;
     * otherwise, it uses the INTER_NETWORK_COST constant.
     *
     * @param duration the duration of the call
     * @param sourceCode the source mobile network code
     * @param destinationCode the destination mobile network code
     * @return the cost of the call
     */
    public static double calculateCost(double duration, String sourceCode, String destinationCode) {
        // Check if the call is within the same network or not
        if (sourceCode.equals(destinationCode)) {
            // If within the same network, calculate cost using INTRA_NETWORK_COST
            return duration * INTRA_NETWORK_COST;
        } else {
            // If between different networks, calculate cost using INTER_NETWORK_COST
            return duration * INTER_NETWORK_COST;
        }
    }
}

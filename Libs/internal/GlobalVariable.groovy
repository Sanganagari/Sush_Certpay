package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object Url
     
    /**
     * <p></p>
     */
    public static Object pageLoadTime
     
    /**
     * <p></p>
     */
    public static Object mediumWait
     
    /**
     * <p></p>
     */
    public static Object HighLightElements
     
    /**
     * <p></p>
     */
    public static Object userName
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object accessCode
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            Url = selectedVariables['Url']
            pageLoadTime = selectedVariables['pageLoadTime']
            mediumWait = selectedVariables['mediumWait']
            HighLightElements = selectedVariables['HighLightElements']
            userName = selectedVariables['userName']
            password = selectedVariables['password']
            accessCode = selectedVariables['accessCode']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

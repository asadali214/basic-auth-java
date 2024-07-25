/*
 * BATesterLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * SuiteCodeEnum to be used.
 */
public enum SuiteCodeEnum {
    HEARTS,

    SPADES,

    CLUBS,

    DIAMONDS;


    private static TreeMap<Integer, SuiteCodeEnum> valueMap = new TreeMap<>();
    private Integer value;

    static {
        HEARTS.value = 1;
        SPADES.value = 2;
        CLUBS.value = 3;
        DIAMONDS.value = 4;

        valueMap.put(1, HEARTS);
        valueMap.put(2, SPADES);
        valueMap.put(3, CLUBS);
        valueMap.put(4, DIAMONDS);
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SuiteCodeEnum constructFromInteger(Integer toConvert) throws IOException {
        SuiteCodeEnum enumValue = fromInteger(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     */
    public static SuiteCodeEnum fromInteger(Integer toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the integer value associated with the enum member.
     * @return The integer value against enum member.
     */
    @JsonValue
    public Integer value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of SuiteCodeEnum values to list of integer values.
     * @param toConvert The list of SuiteCodeEnum values to convert.
     * @return List of representative integer values.
     */
    public static List<Integer> toValue(List<SuiteCodeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<Integer> convertedValues = new ArrayList<>();
        for (SuiteCodeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
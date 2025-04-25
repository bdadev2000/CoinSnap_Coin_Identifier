package com.glority.android.core.definition;

/* loaded from: classes7.dex */
public enum DeviceRegion {
    English(0),
    Japan(1),
    French(2),
    Arabic(3),
    Spanish(4),
    Russian(5),
    Portuguese(6),
    German(7),
    Italian(8),
    China(9),
    Dutch(10),
    Korean(11),
    Turkish(12),
    Swedish(13),
    Danish(14),
    Czech(15),
    Norwegian(16),
    Greek(17),
    Finnish(18),
    Slovak(19),
    Polish(20),
    TraditionalChinese(21),
    Ukraine(22),
    Bulgaria(23),
    Indonesia(24),
    Bosnia(25),
    Slovenia(26),
    Hungary(27),
    Persia(28),
    Hebrew(29),
    Vietnam(30),
    Croatia(31);

    public final int value;

    DeviceRegion(int i) {
        this.value = i;
    }

    public static DeviceRegion fromValue(int i) {
        for (DeviceRegion deviceRegion : values()) {
            if (deviceRegion.value == i) {
                return deviceRegion;
            }
        }
        throw new ParameterCheckFailException("incorrect value " + i + " for enum DeviceRegion");
    }

    public static DeviceRegion fromName(String str) {
        for (DeviceRegion deviceRegion : values()) {
            if (deviceRegion.name().equals(str)) {
                return deviceRegion;
            }
        }
        throw new ParameterCheckFailException("incorrect name " + str + " for enum DeviceRegion");
    }
}

package com.glority.android.deviceinsights.definitions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FrequencyUnit.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/deviceinsights/definitions/FrequencyUnit;", "", "<init>", "(Ljava/lang/String;I)V", "HZ", "KHZ", "MHZ", "GHZ", "deviceinsights_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class FrequencyUnit {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FrequencyUnit[] $VALUES;
    public static final FrequencyUnit HZ = new FrequencyUnit("HZ", 0);
    public static final FrequencyUnit KHZ = new FrequencyUnit("KHZ", 1);
    public static final FrequencyUnit MHZ = new FrequencyUnit("MHZ", 2);
    public static final FrequencyUnit GHZ = new FrequencyUnit("GHZ", 3);

    private static final /* synthetic */ FrequencyUnit[] $values() {
        return new FrequencyUnit[]{HZ, KHZ, MHZ, GHZ};
    }

    public static EnumEntries<FrequencyUnit> getEntries() {
        return $ENTRIES;
    }

    private FrequencyUnit(String str, int i) {
    }

    static {
        FrequencyUnit[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static FrequencyUnit valueOf(String str) {
        return (FrequencyUnit) Enum.valueOf(FrequencyUnit.class, str);
    }

    public static FrequencyUnit[] values() {
        return (FrequencyUnit[]) $VALUES.clone();
    }
}

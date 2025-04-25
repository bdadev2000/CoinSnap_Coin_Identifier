package com.glority.android.deviceinsights.definitions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorageUnit.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/glority/android/deviceinsights/definitions/StorageUnit;", "", "<init>", "(Ljava/lang/String;I)V", "BIT", "BYTE", "KB", "MB", "GB", "TB", "deviceinsights_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class StorageUnit {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StorageUnit[] $VALUES;
    public static final StorageUnit BIT = new StorageUnit("BIT", 0);
    public static final StorageUnit BYTE = new StorageUnit("BYTE", 1);
    public static final StorageUnit KB = new StorageUnit("KB", 2);
    public static final StorageUnit MB = new StorageUnit("MB", 3);
    public static final StorageUnit GB = new StorageUnit("GB", 4);
    public static final StorageUnit TB = new StorageUnit("TB", 5);

    private static final /* synthetic */ StorageUnit[] $values() {
        return new StorageUnit[]{BIT, BYTE, KB, MB, GB, TB};
    }

    public static EnumEntries<StorageUnit> getEntries() {
        return $ENTRIES;
    }

    private StorageUnit(String str, int i) {
    }

    static {
        StorageUnit[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static StorageUnit valueOf(String str) {
        return (StorageUnit) Enum.valueOf(StorageUnit.class, str);
    }

    public static StorageUnit[] values() {
        return (StorageUnit[]) $VALUES.clone();
    }
}

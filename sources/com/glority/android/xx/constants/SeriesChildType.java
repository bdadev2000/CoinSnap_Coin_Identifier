package com.glority.android.xx.constants;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SeriesChildType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/glority/android/xx/constants/SeriesChildType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "VARIETY", "SPECIES", "GENUS", "resourceMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes4.dex */
public final class SeriesChildType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SeriesChildType[] $VALUES;
    private final String value;
    public static final SeriesChildType VARIETY = new SeriesChildType("VARIETY", 0, "Variety");
    public static final SeriesChildType SPECIES = new SeriesChildType("SPECIES", 1, "Species");
    public static final SeriesChildType GENUS = new SeriesChildType("GENUS", 2, "Genus");

    private static final /* synthetic */ SeriesChildType[] $values() {
        return new SeriesChildType[]{VARIETY, SPECIES, GENUS};
    }

    public static EnumEntries<SeriesChildType> getEntries() {
        return $ENTRIES;
    }

    private SeriesChildType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SeriesChildType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static SeriesChildType valueOf(String str) {
        return (SeriesChildType) Enum.valueOf(SeriesChildType.class, str);
    }

    public static SeriesChildType[] values() {
        return (SeriesChildType[]) $VALUES.clone();
    }
}

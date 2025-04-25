package com.glority.android.picturexx.recognize.analyzer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AreaStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_FOUND", "FOUND", "TOO_SMALL", "TOO_CLOSE", "ERROR", "HOLD", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class AreaStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AreaStatus[] $VALUES;
    public static final AreaStatus NOT_FOUND = new AreaStatus("NOT_FOUND", 0);
    public static final AreaStatus FOUND = new AreaStatus("FOUND", 1);
    public static final AreaStatus TOO_SMALL = new AreaStatus("TOO_SMALL", 2);
    public static final AreaStatus TOO_CLOSE = new AreaStatus("TOO_CLOSE", 3);
    public static final AreaStatus ERROR = new AreaStatus("ERROR", 4);
    public static final AreaStatus HOLD = new AreaStatus("HOLD", 5);

    private static final /* synthetic */ AreaStatus[] $values() {
        return new AreaStatus[]{NOT_FOUND, FOUND, TOO_SMALL, TOO_CLOSE, ERROR, HOLD};
    }

    public static EnumEntries<AreaStatus> getEntries() {
        return $ENTRIES;
    }

    private AreaStatus(String str, int i) {
    }

    static {
        AreaStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static AreaStatus valueOf(String str) {
        return (AreaStatus) Enum.valueOf(AreaStatus.class, str);
    }

    public static AreaStatus[] values() {
        return (AreaStatus[]) $VALUES.clone();
    }
}

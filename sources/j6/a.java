package j6;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum a {
    Unknown,
    Analysis,
    AnrReport,
    CrashReport,
    CrashShield,
    ThreadCheck;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        return (a[]) Arrays.copyOf(values(), 6);
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
    }
}

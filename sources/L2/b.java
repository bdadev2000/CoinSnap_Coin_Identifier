package L2;

import G7.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    public static final b b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f1710c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f1711d;

    /* renamed from: f, reason: collision with root package name */
    public static final b f1712f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f1713g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f1714h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f1715i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, L2.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, L2.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, L2.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, L2.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, L2.b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, L2.b] */
    static {
        ?? r02 = new Enum("Unknown", 0);
        b = r02;
        ?? r12 = new Enum("Analysis", 1);
        f1710c = r12;
        ?? r22 = new Enum("AnrReport", 2);
        f1711d = r22;
        ?? r32 = new Enum("CrashReport", 3);
        f1712f = r32;
        ?? r42 = new Enum("CrashShield", 4);
        f1713g = r42;
        ?? r52 = new Enum("ThreadCheck", 5);
        f1714h = r52;
        f1715i = new b[]{r02, r12, r22, r32, r42, r52};
    }

    public static b valueOf(String str) {
        j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) Arrays.copyOf(f1715i, 6);
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return "Unknown";
                        }
                        return "ThreadCheck";
                    }
                    return "CrashShield";
                }
                return "CrashReport";
            }
            return "AnrReport";
        }
        return "Analysis";
    }
}

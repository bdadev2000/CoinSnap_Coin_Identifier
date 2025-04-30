package y2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {
    public static final m b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f24397c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f24398d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m[] f24399f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y2.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y2.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y2.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, y2.m] */
    static {
        ?? r02 = new Enum("USER_DATA", 0);
        b = r02;
        ?? r12 = new Enum("APP_DATA", 1);
        f24397c = r12;
        ?? r22 = new Enum("CUSTOM_DATA", 2);
        f24398d = r22;
        f24399f = new m[]{r02, r12, r22, new Enum("CUSTOM_EVENTS", 3)};
    }

    public static m valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) Arrays.copyOf(f24399f, 4);
    }
}

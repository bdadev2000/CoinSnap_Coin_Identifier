package y2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2945a {
    public static final EnumC2945a b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2945a f24334c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2945a f24335d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC2945a[] f24336f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y2.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y2.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y2.a] */
    static {
        ?? r02 = new Enum("MOBILE_APP_INSTALL", 0);
        b = r02;
        ?? r12 = new Enum("CUSTOM", 1);
        f24334c = r12;
        ?? r22 = new Enum("OTHER", 2);
        f24335d = r22;
        f24336f = new EnumC2945a[]{r02, r12, r22};
    }

    public static EnumC2945a valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (EnumC2945a) Enum.valueOf(EnumC2945a.class, str);
    }

    public static EnumC2945a[] values() {
        return (EnumC2945a[]) Arrays.copyOf(f24336f, 3);
    }
}

package E2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    public static final f b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f990c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f991d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, E2.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, E2.f] */
    static {
        ?? r02 = new Enum("MOBILE_INSTALL_EVENT", 0);
        b = r02;
        ?? r12 = new Enum("CUSTOM_APP_EVENTS", 1);
        f990c = r12;
        f991d = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) Arrays.copyOf(f991d, 2);
    }
}

package y2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    public static final g b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f24357c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f24358d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f24359f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y2.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y2.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y2.g] */
    static {
        ?? r02 = new Enum("ARRAY", 0);
        b = r02;
        ?? r12 = new Enum("BOOL", 1);
        f24357c = r12;
        ?? r22 = new Enum("INT", 2);
        f24358d = r22;
        f24359f = new g[]{r02, r12, r22};
    }

    public static g valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) Arrays.copyOf(f24359f, 3);
    }
}

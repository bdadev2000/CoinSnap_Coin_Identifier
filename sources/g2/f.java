package G2;

import G7.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    public static final f b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f1270c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f1271d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f1272f;

    /* JADX WARN: Type inference failed for: r0v0, types: [G2.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [G2.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [G2.f, java.lang.Enum] */
    static {
        ?? r02 = new Enum("OPERATION_SUCCESS", 0);
        b = r02;
        ?? r12 = new Enum("SERVICE_NOT_AVAILABLE", 1);
        f1270c = r12;
        ?? r22 = new Enum("SERVICE_ERROR", 2);
        f1271d = r22;
        f1272f = new f[]{r02, r12, r22};
    }

    public static f valueOf(String str) {
        j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) Arrays.copyOf(f1272f, 3);
    }
}

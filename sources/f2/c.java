package F2;

import G7.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    public static final c b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f1128c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f1129d;

    /* JADX WARN: Type inference failed for: r0v0, types: [F2.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [F2.c, java.lang.Enum] */
    static {
        ?? r02 = new Enum("MTML_INTEGRITY_DETECT", 0);
        b = r02;
        ?? r12 = new Enum("MTML_APP_EVENT_PREDICTION", 1);
        f1128c = r12;
        f1129d = new c[]{r02, r12};
    }

    public static c valueOf(String str) {
        j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) Arrays.copyOf(f1129d, 2);
    }

    public final String a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return "app_event_pred";
            }
            throw new RuntimeException();
        }
        return "integrity_detect";
    }

    public final String b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new RuntimeException();
        }
        return "MTML_INTEGRITY_DETECT";
    }
}

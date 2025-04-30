package A2;

import G7.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ b[] b = {new Enum("MANUAL", 0), new Enum("INFERENCE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    b EF5;

    public static b valueOf(String str) {
        j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) Arrays.copyOf(b, 2);
    }
}

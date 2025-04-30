package A2;

import G7.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ a[] b = {new Enum("CLICK", 0), new Enum("SELECTED", 1), new Enum("TEXT_CHANGED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    public static a valueOf(String str) {
        j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) Arrays.copyOf(b, 3);
    }
}

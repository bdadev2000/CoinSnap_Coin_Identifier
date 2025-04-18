package d6;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public enum c {
    MTML_INTEGRITY_DETECT,
    MTML_APP_EVENT_PREDICTION;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        return (c[]) Arrays.copyOf(values(), 2);
    }

    public final String a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "integrity_detect";
    }

    public final String b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "MTML_INTEGRITY_DETECT";
    }
}

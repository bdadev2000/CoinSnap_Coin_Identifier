package w5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum h {
    ARRAY,
    BOOL,
    INT;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static h[] valuesCustom() {
        return (h[]) Arrays.copyOf(values(), 3);
    }
}

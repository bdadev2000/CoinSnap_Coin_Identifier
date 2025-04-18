package w5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum a {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        return (a[]) Arrays.copyOf(values(), 3);
    }
}

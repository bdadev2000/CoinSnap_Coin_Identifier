package e6;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum f {
    OPERATION_SUCCESS,
    SERVICE_NOT_AVAILABLE,
    SERVICE_ERROR;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static f[] valuesCustom() {
        return (f[]) Arrays.copyOf(values(), 3);
    }
}

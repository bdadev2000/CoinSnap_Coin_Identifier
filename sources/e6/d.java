package e6;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum d {
    MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
    CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


    /* renamed from: b, reason: collision with root package name */
    public final String f17123b;

    d(String str) {
        this.f17123b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        return (d[]) Arrays.copyOf(values(), 2);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17123b;
    }
}

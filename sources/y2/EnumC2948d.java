package y2;

import java.util.Arrays;

/* renamed from: y2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2948d {
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONS("data_processing_options"),
    /* JADX INFO: Fake field, exist only in values array */
    COUNTRY("data_processing_options_country"),
    /* JADX INFO: Fake field, exist only in values array */
    STATE("data_processing_options_state");

    public final String b;

    EnumC2948d(String str) {
        this.b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC2948d[] valuesCustom() {
        return (EnumC2948d[]) Arrays.copyOf(values(), 3);
    }
}

package w5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum e {
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONS("data_processing_options"),
    /* JADX INFO: Fake field, exist only in values array */
    COUNTRY("data_processing_options_country"),
    /* JADX INFO: Fake field, exist only in values array */
    STATE("data_processing_options_state");


    /* renamed from: b, reason: collision with root package name */
    public final String f26768b;

    e(String str) {
        this.f26768b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        return (e[]) Arrays.copyOf(values(), 3);
    }
}

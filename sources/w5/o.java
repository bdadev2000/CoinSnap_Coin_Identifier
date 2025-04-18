package w5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum o {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_EVENTS("custom_events");

    o(String str) {
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static o[] valuesCustom() {
        return (o[]) Arrays.copyOf(values(), 4);
    }
}

package com.facebook;

import java.util.Arrays;

/* renamed from: com.facebook.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1828f {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_USER(true),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);

    public final boolean b;

    EnumC1828f(boolean z8) {
        this.b = z8;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1828f[] valuesCustom() {
        return (EnumC1828f[]) Arrays.copyOf(values(), 12);
    }
}

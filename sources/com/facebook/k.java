package com.facebook;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum k {
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


    /* renamed from: b, reason: collision with root package name */
    public final boolean f11165b;

    k(boolean z10) {
        this.f11165b = z10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static k[] valuesCustom() {
        return (k[]) Arrays.copyOf(values(), 12);
    }
}

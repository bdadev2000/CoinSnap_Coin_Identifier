package com.glority.android.deviceinsights.android;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidInspector.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005¨\u0006\r"}, d2 = {"Lcom/glority/android/deviceinsights/android/AndroidInspector;", "", "<init>", "()V", "queryAndroidVersion", "", "queryAndroidSDKVersion", "", "queryAndroidManufacturer", "queryAndroidModel", "queryAndroidBrand", "queryAndroidProduct", "queryAndroidHardware", "deviceinsights_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class AndroidInspector {
    public static final AndroidInspector INSTANCE = new AndroidInspector();

    private AndroidInspector() {
    }

    public final String queryAndroidVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    public final int queryAndroidSDKVersion() {
        return Build.VERSION.SDK_INT;
    }

    public final String queryAndroidManufacturer() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    public final String queryAndroidModel() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    public final String queryAndroidBrand() {
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        return BRAND;
    }

    public final String queryAndroidProduct() {
        String PRODUCT = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        return PRODUCT;
    }

    public final String queryAndroidHardware() {
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        return HARDWARE;
    }
}

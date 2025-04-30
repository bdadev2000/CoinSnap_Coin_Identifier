package com.iab.omid.library.bytedance2.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.bytedance2.adsession.DeviceCategory;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f14551a;

    public static DeviceCategory a() {
        int currentModeType = f14551a.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f14551a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}

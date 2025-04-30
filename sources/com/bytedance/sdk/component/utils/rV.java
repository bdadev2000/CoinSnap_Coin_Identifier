package com.bytedance.sdk.component.utils;

import android.os.Environment;
import android.os.StatFs;

/* loaded from: classes.dex */
public class rV {
    public static long zp() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}

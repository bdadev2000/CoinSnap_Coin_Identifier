package com.google.android.gms.internal.base;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;

/* loaded from: classes3.dex */
final class zan {
    @ChecksSdkIntAtLeast
    public static boolean zaa() {
        return Build.VERSION.SDK_INT >= 33;
    }
}

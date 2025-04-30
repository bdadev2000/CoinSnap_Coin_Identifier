package com.google.android.gms.internal.location;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzbj {
    public static Looper zza(@Nullable Looper looper) {
        if (looper != null) {
            return looper;
        }
        return zzb();
    }

    public static Looper zzb() {
        boolean z8;
        if (Looper.myLooper() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Preconditions.checkState(z8, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}

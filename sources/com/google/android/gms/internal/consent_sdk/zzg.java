package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;

/* loaded from: classes2.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i9, String str) {
        super(str);
        this.zza = i9;
    }

    public final FormError zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new FormError(this.zza, getMessage());
    }

    public zzg(int i9, String str, Throwable th) {
        super(str, th);
        this.zza = i9;
    }
}

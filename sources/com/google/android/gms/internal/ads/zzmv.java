package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzmv {

    @Nullable
    private final PowerManager zza;

    public zzmv(Context context) {
        this.zza = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}

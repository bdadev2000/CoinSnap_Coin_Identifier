package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzmw {

    @Nullable
    private final WifiManager zza;

    public zzmw(Context context) {
        this.zza = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}

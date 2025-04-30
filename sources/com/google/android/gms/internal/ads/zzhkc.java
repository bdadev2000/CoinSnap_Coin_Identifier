package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes2.dex */
public final class zzhkc extends zzhkh {
    final String zza;

    public zzhkc(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhkh
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}

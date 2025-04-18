package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes3.dex */
public final class zzhfk extends zzhfp {
    final String zza;

    public zzhfk(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhfp
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzcx {
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    public final String zza;
    public final int zzb;

    public zzcx(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzc, this.zza);
        bundle.putInt(zzd, this.zzb);
        return bundle;
    }
}

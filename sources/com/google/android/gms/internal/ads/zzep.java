package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzep {
    private static final String zzd = Integer.toString(0, 36);
    private static final String zze = Integer.toString(1, 36);
    private static final String zzf = Integer.toString(2, 36);
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzep(int i9, int i10, int i11) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putInt(zzd, this.zza);
        bundle.putInt(zze, this.zzb);
        bundle.putInt(zzf, this.zzc);
        return bundle;
    }
}

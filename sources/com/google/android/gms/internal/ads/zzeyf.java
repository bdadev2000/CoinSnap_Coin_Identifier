package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzeyf implements zzexv {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzeyf(String str, int i9, int i10, int i11, boolean z8, int i12) {
        this.zza = str;
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = z8;
        this.zzf = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        boolean z8 = true;
        zzfic.zzf(bundle, "carrier", this.zza, !TextUtils.isEmpty(this.zza));
        int i9 = this.zzb;
        if (i9 == -2) {
            z8 = false;
        }
        zzfic.zze(bundle, "cnt", i9, z8);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle zza = zzfic.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfic.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzf);
        zza2.putBoolean("active_network_metered", this.zze);
    }
}

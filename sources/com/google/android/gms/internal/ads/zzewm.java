package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzewm implements zzevy {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzewm(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = z10;
        this.zzf = i13;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        boolean z10 = true;
        zzfgc.zzf(bundle, "carrier", this.zza, !TextUtils.isEmpty(this.zza));
        int i10 = this.zzb;
        if (i10 == -2) {
            z10 = false;
        }
        zzfgc.zze(bundle, "cnt", i10, z10);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle zza = zzfgc.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfgc.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzf);
        zza2.putBoolean("active_network_metered", this.zze);
    }
}

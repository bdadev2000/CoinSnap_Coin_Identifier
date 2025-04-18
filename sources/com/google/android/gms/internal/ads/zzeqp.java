package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public final class zzeqp implements zzexg {
    private final com.google.android.gms.ads.internal.client.zzy zza;
    private final VersionInfoParcel zzb;
    private final boolean zzc;

    public zzeqp(com.google.android.gms.ads.internal.client.zzy zzyVar, VersionInfoParcel versionInfoParcel, boolean z2) {
        this.zza = zzyVar;
        this.zzb = versionInfoParcel;
        this.zzc = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zzb.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfg)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfh)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        com.google.android.gms.ads.internal.client.zzy zzyVar = this.zza;
        if (zzyVar != null) {
            int i2 = zzyVar.zza;
            if (i2 == 1) {
                bundle.putString("avo", "p");
            } else if (i2 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}

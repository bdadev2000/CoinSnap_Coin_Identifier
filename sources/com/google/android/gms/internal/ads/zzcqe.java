package com.google.android.gms.internal.ads;

import android.view.ViewParent;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzcqe implements zzcxg {

    @Nullable
    private final zzcfk zza;
    private final zzdsm zzb;
    private final zzfet zzc;

    public zzcqe(@Nullable zzcfk zzcfkVar, zzdsm zzdsmVar, zzfet zzfetVar) {
        this.zza = zzcfkVar;
        this.zzb = zzdsmVar;
        this.zzc = zzfetVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        zzcfk zzcfkVar;
        boolean z10;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmB)).booleanValue() && (zzcfkVar = this.zza) != null) {
            ViewParent parent = zzcfkVar.zzF().getParent();
            while (true) {
                if (parent != null) {
                    if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                        z10 = true;
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    z10 = false;
                    break;
                }
            }
            zzdsl zza = this.zzb.zza();
            zza.zzb("action", "hcp");
            if (true != z10) {
                str = "0";
            } else {
                str = "1";
            }
            zza.zzb("hcp", str);
            zza.zzc(this.zzc);
            zza.zzf();
        }
    }
}

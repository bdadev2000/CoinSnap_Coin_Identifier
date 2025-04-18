package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzaxz extends zzayc {
    private final View zzh;

    public zzaxz(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3, View view) {
        super(zzawoVar, "1eASkBAriCqBxPWd4okyyc+CHCTvdkAuw8U5qBN0KobaC6TQVXZIuItjy1xo8n06", "/3NjDB70kyJmgPDiCMkSHOH5fxmpgd9Ky8mxWyDVFDM=", zzasmVar, i2, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdr);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkC);
            zzaws zzawsVar = new zzaws((String) this.zze.invoke(null, this.zzh, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzatf zza = zzatg.zza();
            zza.zzb(zzawsVar.zza.longValue());
            zza.zzd(zzawsVar.zzb.longValue());
            zza.zze(zzawsVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzawsVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzawsVar.zzd.longValue());
            }
            this.zzd.zzY((zzatg) zza.zzbr());
        }
    }
}

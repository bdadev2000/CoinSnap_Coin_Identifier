package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzdwv {
    private final zzges zza;
    private final zzges zzb;
    private final zzdyd zzc;
    private final zzhfr zzd;

    public zzdwv(zzges zzgesVar, zzges zzgesVar2, zzdyd zzdydVar, zzhfr zzhfrVar) {
        this.zza = zzgesVar;
        this.zzb = zzgesVar2;
        this.zzc = zzdydVar;
        this.zzd = zzhfrVar;
    }

    public final /* synthetic */ zzdyx zza(zzbvx zzbvxVar) throws Exception {
        return (zzdyx) this.zzc.zza(zzbvxVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ ua.b zzb(final zzbvx zzbvxVar, int i10, zzdyw zzdywVar) throws Exception {
        Bundle bundle;
        if (zzbvxVar != null && (bundle = zzbvxVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgei.zzn(((zzebg) this.zzd.zzb()).zzc(zzbvxVar, i10), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdwr
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzgei.zzh(new zzdyx((InputStream) obj, zzbvx.this));
            }
        }, this.zzb);
    }

    public final ua.b zzc(final zzbvx zzbvxVar) {
        ua.b zzf;
        String str = zzbvxVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzC(str)) {
            zzf = zzgei.zzg(new zzdyw(1));
        } else {
            zzf = zzgei.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdws
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdwv.this.zza(zzbvxVar);
                }
            }), ExecutionException.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdwt
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    return zzgei.zzg(((ExecutionException) obj).getCause());
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgei.zzf(zzf, zzdyw.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdwu
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdwv.this.zzb(zzbvxVar, callingUid, (zzdyw) obj);
            }
        }, this.zzb);
    }
}

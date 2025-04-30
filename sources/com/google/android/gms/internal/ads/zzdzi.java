package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzdzi {
    private final zzgge zza;
    private final zzgge zzb;
    private final zzeap zzc;
    private final zzhkj zzd;

    public zzdzi(zzgge zzggeVar, zzgge zzggeVar2, zzeap zzeapVar, zzhkj zzhkjVar) {
        this.zza = zzggeVar;
        this.zzb = zzggeVar2;
        this.zzc = zzeapVar;
        this.zzd = zzhkjVar;
    }

    public final /* synthetic */ zzebi zza(zzbxu zzbxuVar) throws Exception {
        return (zzebi) this.zzc.zza(zzbxuVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfF)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ f4.c zzb(final zzbxu zzbxuVar, int i9, zzebh zzebhVar) throws Exception {
        return zzgft.zzn(((zzedq) this.zzd.zzb()).zzc(zzbxuVar, i9), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdze
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzgft.zzh(new zzebi((InputStream) obj, zzbxu.this));
            }
        }, this.zzb);
    }

    public final f4.c zzc(final zzbxu zzbxuVar) {
        f4.c zzf;
        String str = zzbxuVar.zzd;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            zzf = zzgft.zzg(new zzebh(1));
        } else {
            zzf = zzgft.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdzi.this.zza(zzbxuVar);
                }
            }), ExecutionException.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdzg
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    return zzgft.zzg(((ExecutionException) obj).getCause());
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgft.zzf(zzf, zzebh.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdzh
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzdzi.this.zzb(zzbxuVar, callingUid, (zzebh) obj);
            }
        }, this.zzb);
    }
}

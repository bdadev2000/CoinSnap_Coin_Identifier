package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class zzebz {
    private final zzgge zza;
    private final zzgge zzb;
    private final zzecu zzc;
    private final zzhkj zzd;

    public zzebz(zzgge zzggeVar, zzgge zzggeVar2, zzecu zzecuVar, zzhkj zzhkjVar) {
        this.zza = zzggeVar;
        this.zzb = zzggeVar2;
        this.zzc = zzecuVar;
        this.zzd = zzhkjVar;
    }

    public final /* synthetic */ f4.c zza(zzbwz zzbwzVar) throws Exception {
        return this.zzc.zza(zzbwzVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlD)).longValue());
    }

    public final /* synthetic */ f4.c zzb(zzbwz zzbwzVar, int i9, zzebh zzebhVar) throws Exception {
        return ((zzeea) this.zzd.zzb()).zzb(zzbwzVar, i9);
    }

    public final f4.c zzc(final zzbwz zzbwzVar) {
        f4.c zzf;
        String str = zzbwzVar.zzf;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            zzf = zzgft.zzg(new zzebh(1, "Ads service proxy force local"));
        } else {
            zzf = zzgft.zzf(zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzebw
                @Override // com.google.android.gms.internal.ads.zzgez
                public final f4.c zza() {
                    return zzebz.this.zza(zzbwzVar);
                }
            }, this.zza), ExecutionException.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzebx
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zzgft.zzg(th);
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgft.zzf(zzf, zzebh.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeby
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzebz.this.zzb(zzbwzVar, callingUid, (zzebh) obj);
            }
        }, this.zzb);
    }
}

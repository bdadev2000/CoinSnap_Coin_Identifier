package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class zzeay {
    private final zzgfz zza;
    private final zzgfz zzb;
    private final zzebt zzc;
    private final zzhic zzd;

    public zzeay(zzgfz zzgfzVar, zzgfz zzgfzVar2, zzebt zzebtVar, zzhic zzhicVar) {
        this.zza = zzgfzVar;
        this.zzb = zzgfzVar2;
        this.zzc = zzebtVar;
        this.zzd = zzhicVar;
    }

    public final /* synthetic */ ListenableFuture zza(zzbvf zzbvfVar) throws Exception {
        return this.zzc.zza(zzbvfVar, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlj)).longValue());
    }

    public final /* synthetic */ ListenableFuture zzb(zzbvf zzbvfVar, int i2, zzeag zzeagVar) throws Exception {
        return ((zzecz) this.zzd.zzb()).zzb(zzbvfVar, i2);
    }

    public final ListenableFuture zzc(final zzbvf zzbvfVar) {
        String str = zzbvfVar.zzf;
        com.google.android.gms.ads.internal.zzu.zzp();
        ListenableFuture zzg = com.google.android.gms.ads.internal.util.zzt.zzC(str) ? zzgfo.zzg(new zzeag(1, "Ads service proxy force local")) : zzgfo.zzf(zzgfo.zzk(new zzgeu() { // from class: com.google.android.gms.internal.ads.zzeav
            @Override // com.google.android.gms.internal.ads.zzgeu
            public final ListenableFuture zza() {
                return zzeay.this.zza(zzbvfVar);
            }
        }, this.zza), ExecutionException.class, new zzgev() { // from class: com.google.android.gms.internal.ads.zzeaw
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                Throwable th = (ExecutionException) obj;
                if (th.getCause() != null) {
                    th = th.getCause();
                }
                return zzgfo.zzg(th);
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzgfo.zzf(zzg, zzeag.class, new zzgev() { // from class: com.google.android.gms.internal.ads.zzeax
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzeay.this.zzb(zzbvfVar, callingUid, (zzeag) obj);
            }
        }, this.zzb);
    }
}

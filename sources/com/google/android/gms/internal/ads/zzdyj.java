package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzdyj {
    private final zzgfz zza;
    private final zzgfz zzb;
    private final zzdzo zzc;
    private final zzhic zzd;

    public zzdyj(zzgfz zzgfzVar, zzgfz zzgfzVar2, zzdzo zzdzoVar, zzhic zzhicVar) {
        this.zza = zzgfzVar;
        this.zzb = zzgfzVar2;
        this.zzc = zzdzoVar;
        this.zzd = zzhicVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzeah zza(zzbwa zzbwaVar) throws Exception {
        return (zzeah) this.zzc.zza(zzbwaVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfq)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ ListenableFuture zzb(final zzbwa zzbwaVar, int i2, zzeag zzeagVar) throws Exception {
        Bundle bundle;
        if (zzbwaVar != null && (bundle = zzbwaVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgfo.zzn(((zzecp) this.zzd.zzb()).zzc(zzbwaVar, i2), new zzgev() { // from class: com.google.android.gms.internal.ads.zzdyf
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzgfo.zzh(new zzeah((InputStream) obj, zzbwa.this));
            }
        }, this.zzb);
    }

    public final ListenableFuture zzc(final zzbwa zzbwaVar) {
        String str = zzbwaVar.zzd;
        com.google.android.gms.ads.internal.zzu.zzp();
        ListenableFuture zzg = com.google.android.gms.ads.internal.util.zzt.zzC(str) ? zzgfo.zzg(new zzeag(1)) : zzgfo.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdyj.this.zza(zzbwaVar);
            }
        }), ExecutionException.class, new zzgev() { // from class: com.google.android.gms.internal.ads.zzdyh
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzgfo.zzg(((ExecutionException) obj).getCause());
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzgfo.zzf(zzg, zzeag.class, new zzgev() { // from class: com.google.android.gms.internal.ads.zzdyi
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzdyj.this.zzb(zzbwaVar, callingUid, (zzeag) obj);
            }
        }, this.zzb);
    }
}

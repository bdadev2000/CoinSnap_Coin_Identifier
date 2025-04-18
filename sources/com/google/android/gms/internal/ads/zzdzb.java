package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzdzb {
    private final ScheduledExecutorService zza;
    private final zzgfz zzb;
    private final zzgfz zzc;
    private final zzdzt zzd;
    private final zzhic zze;

    public zzdzb(ScheduledExecutorService scheduledExecutorService, zzgfz zzgfzVar, zzgfz zzgfzVar2, zzdzt zzdztVar, zzhic zzhicVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgfzVar;
        this.zzc = zzgfzVar2;
        this.zzd = zzdztVar;
        this.zze = zzhicVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzeah zza(zzbwa zzbwaVar) throws Exception {
        return (zzeah) this.zzd.zza(zzbwaVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfq)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ ListenableFuture zzb(final zzbwa zzbwaVar, int i2, Throwable th) throws Exception {
        Bundle bundle;
        if (zzbwaVar != null && (bundle = zzbwaVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgfo.zzn(((zzecp) this.zze.zzb()).zzd(zzbwaVar, i2), new zzgev() { // from class: com.google.android.gms.internal.ads.zzdyy
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzgfo.zzh(new zzeah((InputStream) obj, zzbwa.this));
            }
        }, this.zzb);
    }

    public final ListenableFuture zzc(final zzbwa zzbwaVar) {
        ListenableFuture zzb;
        String str = zzbwaVar.zzd;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            zzb = zzgfo.zzg(new zzeag(1));
        } else {
            zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhg)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdzb.this.zza(zzbwaVar);
                }
            }) : this.zzd.zza(zzbwaVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgff) zzgfo.zzf((zzgff) zzgfo.zzo(zzgff.zzu(zzb), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfq)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgev() { // from class: com.google.android.gms.internal.ads.zzdza
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzdzb.this.zzb(zzbwaVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}

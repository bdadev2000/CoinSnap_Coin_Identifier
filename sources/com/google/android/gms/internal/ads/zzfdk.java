package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzfdk implements zzfdy {
    private final zzfiq zza;
    private final Executor zzb;
    private final zzgfk zzc = new zzfdi(this);

    public zzfdk(zzfiq zzfiqVar, Executor executor) {
        this.zza = zzfiqVar;
        this.zzb = executor;
    }

    public final /* synthetic */ ListenableFuture zza(zzcxh zzcxhVar, zzfdt zzfdtVar) throws Exception {
        zzfiq zzfiqVar = this.zza;
        zzfja zzfjaVar = zzfdtVar.zzb;
        zzbwa zzbwaVar = zzfdtVar.zza;
        zzfiz zzb = zzfiqVar.zzb(zzfjaVar);
        if (zzb != null && zzbwaVar != null) {
            zzgfo.zzr(zzcxhVar.zzb().zzh(zzbwaVar), this.zzc, this.zzb);
        }
        return zzgfo.zzh(new zzfdj(zzfjaVar, zzbwaVar, zzb));
    }

    public final ListenableFuture zzb(zzfdz zzfdzVar, zzfdx zzfdxVar, final zzcxh zzcxhVar) {
        return (zzgff) zzgfo.zze((zzgff) zzgfo.zzn(zzgff.zzu(new zzfdu(this.zza, zzcxhVar, this.zzb).zzc()), new zzgev() { // from class: com.google.android.gms.internal.ads.zzfdg
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzfdk.this.zza(zzcxhVar, (zzfdt) obj);
            }
        }, this.zzb), Exception.class, new zzfdh(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfdz zzfdzVar, zzfdx zzfdxVar, Object obj) {
        return zzb(zzfdzVar, zzfdxVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}

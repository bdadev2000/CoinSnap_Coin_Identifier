package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcb;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzfde implements zzfdy {
    private final zzfdy zza;
    private final zzfdy zzb;
    private final zzfjm zzc;
    private final String zzd;
    private zzcxh zze;
    private final Executor zzf;

    public zzfde(zzfdy zzfdyVar, zzfdy zzfdyVar2, zzfjm zzfjmVar, String str, Executor executor) {
        this.zza = zzfdyVar;
        this.zzb = zzfdyVar2;
        this.zzc = zzfjmVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfiz zzfizVar, zzfdz zzfdzVar) {
        zzcxh zzcxhVar = zzfizVar.zza;
        this.zze = zzcxhVar;
        if (zzfizVar.zzc != null) {
            if (zzcxhVar.zzf() != null) {
                zzfizVar.zzc.zzp().zzl(zzfizVar.zza.zzf());
            }
            return zzgfo.zzh(zzfizVar.zzc);
        }
        zzcxhVar.zzb().zzl(zzfizVar.zzb);
        return ((zzfdo) this.zza).zzb(zzfdzVar, null, zzfizVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcxh zzd() {
        return this.zze;
    }

    public final /* synthetic */ ListenableFuture zzb(zzfdz zzfdzVar, zzfdd zzfddVar, zzfdx zzfdxVar, zzcxh zzcxhVar, zzfdj zzfdjVar) throws Exception {
        if (zzfdjVar != null) {
            zzfdd zzfddVar2 = new zzfdd(zzfddVar.zza, zzfddVar.zzb, zzfddVar.zzc, zzfddVar.zzd, zzfddVar.zze, zzfddVar.zzf, zzfdjVar.zza);
            if (zzfdjVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzfddVar2);
                return zzg(zzfdjVar.zzc, zzfdzVar);
            }
            ListenableFuture zza = this.zzc.zza(zzfddVar2);
            if (zza != null) {
                this.zze = null;
                return zzgfo.zzn(zza, new zzgev() { // from class: com.google.android.gms.internal.ads.zzfda
                    @Override // com.google.android.gms.internal.ads.zzgev
                    public final ListenableFuture zza(Object obj) {
                        return zzfde.this.zze((zzfjj) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzfddVar2);
            zzfdzVar = new zzfdz(zzfdzVar.zzb, zzfdjVar.zzb);
        }
        ListenableFuture zzb = ((zzfdo) this.zza).zzb(zzfdzVar, zzfdxVar, zzcxhVar);
        this.zze = zzcxhVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfdz zzfdzVar, zzfdx zzfdxVar, Object obj) {
        return zzf(zzfdzVar, zzfdxVar, null);
    }

    public final /* synthetic */ ListenableFuture zze(zzfjj zzfjjVar) throws Exception {
        zzfjl zzfjlVar;
        if (zzfjjVar == null || zzfjjVar.zza == null || (zzfjlVar = zzfjjVar.zzb) == null) {
            throw new zzdye(1, "Empty prefetch");
        }
        zzbcb.zzb.zzc zzd = zzbcb.zzb.zzd();
        zzbcb.zzb.zza.C0125zza zza = zzbcb.zzb.zza.zza();
        zza.zzf(zzbcb.zzb.zzd.IN_MEMORY);
        zza.zzh(zzbcb.zzb.zze.zzi());
        zzd.zzd(zza);
        zzfjjVar.zza.zza.zzb().zzc().zzm(zzd.zzbr());
        return zzg(zzfjjVar.zza, ((zzfdd) zzfjlVar).zzb);
    }

    public final synchronized ListenableFuture zzf(final zzfdz zzfdzVar, final zzfdx zzfdxVar, zzcxh zzcxhVar) {
        zzcxg zza = zzfdxVar.zza(zzfdzVar.zzb);
        zza.zza(new zzfdf(this.zzd));
        final zzcxh zzcxhVar2 = (zzcxh) zza.zzh();
        zzcxhVar2.zzg();
        zzcxhVar2.zzg();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzcxhVar2.zzg().zzd;
        if (zzmVar.zzs == null && zzmVar.zzx == null) {
            zzfhc zzg = zzcxhVar2.zzg();
            final zzfdd zzfddVar = new zzfdd(zzfdxVar, zzfdzVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return (zzgff) zzgfo.zzn(zzgff.zzu(((zzfdk) this.zzb).zzb(zzfdzVar, zzfdxVar, zzcxhVar2)), new zzgev() { // from class: com.google.android.gms.internal.ads.zzfdb
                @Override // com.google.android.gms.internal.ads.zzgev
                public final ListenableFuture zza(Object obj) {
                    return zzfde.this.zzb(zzfdzVar, zzfddVar, zzfdxVar, zzcxhVar2, (zzfdj) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcxhVar2;
        return ((zzfdo) this.zza).zzb(zzfdzVar, zzfdxVar, zzcxhVar2);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbs;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfbq implements zzfck {
    private final zzfck zza;
    private final zzfck zzb;
    private final zzfhy zzc;
    private final String zzd;
    private zzcvt zze;
    private final Executor zzf;

    public zzfbq(zzfck zzfckVar, zzfck zzfckVar2, zzfhy zzfhyVar, String str, Executor executor) {
        this.zza = zzfckVar;
        this.zzb = zzfckVar2;
        this.zzc = zzfhyVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ua.b zzg(zzfhl zzfhlVar, zzfcl zzfclVar) {
        zzcvt zzcvtVar = zzfhlVar.zza;
        this.zze = zzcvtVar;
        if (zzfhlVar.zzc != null) {
            if (zzcvtVar.zzf() != null) {
                zzfhlVar.zzc.zzp().zzl(zzfhlVar.zza.zzf());
            }
            return zzgei.zzh(zzfhlVar.zzc);
        }
        zzcvtVar.zzb().zzl(zzfhlVar.zzb);
        return ((zzfca) this.zza).zzb(zzfclVar, null, zzfhlVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvt zzd() {
        return this.zze;
    }

    public final /* synthetic */ ua.b zzb(zzfcl zzfclVar, zzfbp zzfbpVar, zzfcj zzfcjVar, zzcvt zzcvtVar, zzfbv zzfbvVar) throws Exception {
        if (zzfbvVar != null) {
            zzfbp zzfbpVar2 = new zzfbp(zzfbpVar.zza, zzfbpVar.zzb, zzfbpVar.zzc, zzfbpVar.zzd, zzfbpVar.zze, zzfbpVar.zzf, zzfbvVar.zza);
            if (zzfbvVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzfbpVar2);
                return zzg(zzfbvVar.zzc, zzfclVar);
            }
            ua.b zza = this.zzc.zza(zzfbpVar2);
            if (zza != null) {
                this.zze = null;
                return zzgei.zzn(zza, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfbm
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final ua.b zza(Object obj) {
                        return zzfbq.this.zze((zzfhv) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzfbpVar2);
            zzfclVar = new zzfcl(zzfclVar.zzb, zzfbvVar.zzb);
        }
        ua.b zzb = ((zzfca) this.zza).zzb(zzfclVar, zzfcjVar, zzcvtVar);
        this.zze = zzcvtVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ ua.b zzc(zzfcl zzfclVar, zzfcj zzfcjVar, Object obj) {
        return zzf(zzfclVar, zzfcjVar, null);
    }

    public final /* synthetic */ ua.b zze(zzfhv zzfhvVar) throws Exception {
        zzfhx zzfhxVar;
        if (zzfhvVar != null && zzfhvVar.zza != null && (zzfhxVar = zzfhvVar.zzb) != null) {
            zzbbs.zzb.zzc zzd = zzbbs.zzb.zzd();
            zzbbs.zzb.zza.C0144zza zza = zzbbs.zzb.zza.zza();
            zza.zzf(zzbbs.zzb.zzd.IN_MEMORY);
            zza.zzh(zzbbs.zzb.zze.zzi());
            zzd.zzd(zza);
            zzfhvVar.zza.zza.zzb().zzc().zzm(zzd.zzbr());
            return zzg(zzfhvVar.zza, ((zzfbp) zzfhxVar).zzb);
        }
        throw new zzdwn(1, "Empty prefetch");
    }

    public final synchronized ua.b zzf(final zzfcl zzfclVar, final zzfcj zzfcjVar, zzcvt zzcvtVar) {
        zzcvs zza = zzfcjVar.zza(zzfclVar.zzb);
        zza.zza(new zzfbr(this.zzd));
        final zzcvt zzcvtVar2 = (zzcvt) zza.zzh();
        zzcvtVar2.zzg();
        zzcvtVar2.zzg();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzcvtVar2.zzg().zzd;
        if (zzmVar.zzs == null && zzmVar.zzx == null) {
            zzffo zzg = zzcvtVar2.zzg();
            final zzfbp zzfbpVar = new zzfbp(zzfcjVar, zzfclVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return (zzgdz) zzgei.zzn(zzgdz.zzu(((zzfbw) this.zzb).zzb(zzfclVar, zzfcjVar, zzcvtVar2)), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfbn
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    return zzfbq.this.zzb(zzfclVar, zzfbpVar, zzfcjVar, zzcvtVar2, (zzfbv) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcvtVar2;
        return ((zzfca) this.zza).zzb(zzfclVar, zzfcjVar, zzcvtVar2);
    }
}

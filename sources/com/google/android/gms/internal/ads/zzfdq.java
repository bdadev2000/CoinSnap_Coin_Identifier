package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfdq implements zzfek {
    private final zzfek zza;
    private final zzfek zzb;
    private final zzfjy zzc;
    private final String zzd;
    private zzcys zze;
    private final Executor zzf;

    public zzfdq(zzfek zzfekVar, zzfek zzfekVar2, zzfjy zzfjyVar, String str, Executor executor) {
        this.zza = zzfekVar;
        this.zzb = zzfekVar2;
        this.zzc = zzfjyVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final f4.c zzg(zzfjl zzfjlVar, zzfel zzfelVar) {
        zzcys zzcysVar = zzfjlVar.zza;
        this.zze = zzcysVar;
        if (zzfjlVar.zzc != null) {
            if (zzcysVar.zzf() != null) {
                zzfjlVar.zzc.zzo().zzl(zzfjlVar.zza.zzf());
            }
            return zzgft.zzh(zzfjlVar.zzc);
        }
        zzcysVar.zzb().zzl(zzfjlVar.zzb);
        return ((zzfea) this.zza).zzb(zzfelVar, null, zzfjlVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcys zzd() {
        return this.zze;
    }

    public final /* synthetic */ f4.c zzb(zzfel zzfelVar, zzfdp zzfdpVar, zzfej zzfejVar, zzcys zzcysVar, zzfdv zzfdvVar) throws Exception {
        if (zzfdvVar != null) {
            zzfdp zzfdpVar2 = new zzfdp(zzfdpVar.zza, zzfdpVar.zzb, zzfdpVar.zzc, zzfdpVar.zzd, zzfdpVar.zze, zzfdpVar.zzf, zzfdvVar.zza);
            if (zzfdvVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzfdpVar2);
                return zzg(zzfdvVar.zzc, zzfelVar);
            }
            f4.c zza = this.zzc.zza(zzfdpVar2);
            if (zza != null) {
                this.zze = null;
                return zzgft.zzn(zza, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfdm
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final f4.c zza(Object obj) {
                        return zzfdq.this.zze((zzfjv) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzfdpVar2);
            zzfelVar = new zzfel(zzfelVar.zzb, zzfdvVar.zzb);
        }
        f4.c zzb = ((zzfea) this.zza).zzb(zzfelVar, zzfejVar, zzcysVar);
        this.zze = zzcysVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ f4.c zzc(zzfel zzfelVar, zzfej zzfejVar, Object obj) {
        return zzf(zzfelVar, zzfejVar, null);
    }

    public final /* synthetic */ f4.c zze(zzfjv zzfjvVar) throws Exception {
        zzfjx zzfjxVar;
        if (zzfjvVar != null && zzfjvVar.zza != null && (zzfjxVar = zzfjvVar.zzb) != null) {
            zzbdv.zzb.zzc zzd = zzbdv.zzb.zzd();
            zzbdv.zzb.zza.C0132zza zza = zzbdv.zzb.zza.zza();
            zza.zzf(zzbdv.zzb.zzd.IN_MEMORY);
            zza.zzh(zzbdv.zzb.zze.zzi());
            zzd.zzd(zza);
            zzfjvVar.zza.zza.zzb().zzc().zzm(zzd.zzbr());
            return zzg(zzfjvVar.zza, ((zzfdp) zzfjxVar).zzb);
        }
        throw new zzdzd(1, "Empty prefetch");
    }

    public final synchronized f4.c zzf(final zzfel zzfelVar, final zzfej zzfejVar, zzcys zzcysVar) {
        zzcyr zza = zzfejVar.zza(zzfelVar.zzb);
        zza.zza(new zzfdr(this.zzd));
        final zzcys zzcysVar2 = (zzcys) zza.zzh();
        zzcysVar2.zzg();
        zzcysVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzcysVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfho zzg = zzcysVar2.zzg();
            final zzfdp zzfdpVar = new zzfdp(zzfejVar, zzfelVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzgft.zzn(zzgfk.zzu(((zzfdw) this.zzb).zzb(zzfelVar, zzfejVar, zzcysVar2)), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfdn
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    return zzfdq.this.zzb(zzfelVar, zzfdpVar, zzfejVar, zzcysVar2, (zzfdv) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcysVar2;
        return ((zzfea) this.zza).zzb(zzfelVar, zzfejVar, zzcysVar2);
    }
}

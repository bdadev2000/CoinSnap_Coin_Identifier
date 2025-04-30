package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcvx {
    private final zzeam zza;
    private final zzfho zzb;
    private final zzflt zzc;
    private final zzcor zzd;
    private final zzelm zze;
    private final zzdeq zzf;

    @Nullable
    private zzfhf zzg;
    private final zzebu zzh;
    private final zzcyp zzi;
    private final Executor zzj;
    private final zzebe zzk;
    private final zzehq zzl;
    private final zzeck zzm;
    private final zzecr zzn;

    public zzcvx(zzeam zzeamVar, zzfho zzfhoVar, zzflt zzfltVar, zzcor zzcorVar, zzelm zzelmVar, zzdeq zzdeqVar, @Nullable zzfhf zzfhfVar, zzebu zzebuVar, zzcyp zzcypVar, Executor executor, zzebe zzebeVar, zzehq zzehqVar, zzeck zzeckVar, zzecr zzecrVar) {
        this.zza = zzeamVar;
        this.zzb = zzfhoVar;
        this.zzc = zzfltVar;
        this.zzd = zzcorVar;
        this.zze = zzelmVar;
        this.zzf = zzdeqVar;
        this.zzg = zzfhfVar;
        this.zzh = zzebuVar;
        this.zzi = zzcypVar;
        this.zzj = executor;
        this.zzk = zzebeVar;
        this.zzl = zzehqVar;
        this.zzm = zzeckVar;
        this.zzn = zzecrVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfiq.zzb(th, this.zzl);
    }

    public final zzdeq zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzfhf zzd(zzfhf zzfhfVar) throws Exception {
        this.zzd.zza(zzfhfVar);
        return zzfhfVar;
    }

    public final f4.c zze(final zzfjj zzfjjVar) {
        zzfky zza = this.zzc.zzb(zzfln.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvt
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzcvx.this.zzf(zzfjjVar, (zzbxu) obj);
            }
        }).zza();
        zzgft.zzr(zza, new zzcvv(this), this.zzj);
        return zza;
    }

    public final /* synthetic */ f4.c zzf(zzfjj zzfjjVar, zzbxu zzbxuVar) throws Exception {
        zzbxuVar.zzi = zzfjjVar;
        return this.zzh.zza(zzbxuVar);
    }

    public final /* synthetic */ f4.c zzg(f4.c cVar, f4.c cVar2, f4.c cVar3) throws Exception {
        return this.zzn.zzc((zzbxu) cVar.get(), (JSONObject) cVar2.get(), (zzbxx) cVar3.get());
    }

    public final f4.c zzh(zzbxu zzbxuVar) {
        zzfky zza = this.zzc.zzb(zzfln.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbxuVar)).zza();
        zzgft.zzr(zza, new zzcvw(this), this.zzj);
        return zza;
    }

    public final f4.c zzi(f4.c cVar) {
        zzflk zzf = this.zzc.zzb(zzfln.RENDERER, cVar).zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzcvo
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                zzfhf zzfhfVar = (zzfhf) obj;
                zzcvx.this.zzd(zzfhfVar);
                return zzfhfVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfD)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfF)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final f4.c zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzflt zzfltVar = this.zzc;
        zzeam zzeamVar = this.zza;
        return zzfld.zzc(zzeamVar.zza(), zzfln.PRELOADED_LOADER, zzfltVar).zza();
    }

    public final f4.c zzk(final f4.c cVar) {
        zzfhf zzfhfVar = this.zzg;
        if (zzfhfVar != null) {
            return zzfld.zzc(zzgft.zzh(zzfhfVar), zzfln.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzu.zzc().zzj();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlB)).booleanValue() && !((Boolean) zzbgq.zzc.zze()).booleanValue()) {
            final zzeck zzeckVar = this.zzm;
            Objects.requireNonNull(zzeckVar);
            final f4.c zzn = zzgft.zzn(cVar, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvp
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    return zzeck.this.zza((zzbxu) obj);
                }
            }, this.zzj);
            zzflk zzb = this.zzc.zzb(zzfln.BUILD_URL, zzn);
            final zzebu zzebuVar = this.zzh;
            Objects.requireNonNull(zzebuVar);
            final zzfky zza = zzb.zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvq
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    return zzebu.this.zzb((JSONObject) obj);
                }
            }).zza();
            return this.zzc.zza(zzfln.SERVER_TRANSACTION, cVar, zzn, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcvr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzcvx.this.zzg(cVar, zzn, zza);
                }
            }).zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvs
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    return (f4.c) obj;
                }
            }).zza();
        }
        zzflk zzb2 = this.zzc.zzb(zzfln.SERVER_TRANSACTION, cVar);
        final zzebe zzebeVar = this.zzk;
        Objects.requireNonNull(zzebeVar);
        return zzb2.zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvu
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzebe.this.zzb((zzbxu) obj);
            }
        }).zza();
    }

    public final void zzl(zzfhf zzfhfVar) {
        this.zzg = zzfhfVar;
    }
}

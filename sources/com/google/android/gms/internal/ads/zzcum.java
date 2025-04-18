package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcum {
    private final zzdzl zza;
    private final zzfhc zzb;
    private final zzflg zzc;
    private final zzcnd zzd;
    private final zzekl zze;
    private final zzddi zzf;

    @Nullable
    private zzfgt zzg;
    private final zzeat zzh;
    private final zzcxe zzi;
    private final Executor zzj;
    private final zzead zzk;
    private final zzegp zzl;
    private final zzebj zzm;
    private final zzebq zzn;

    public zzcum(zzdzl zzdzlVar, zzfhc zzfhcVar, zzflg zzflgVar, zzcnd zzcndVar, zzekl zzeklVar, zzddi zzddiVar, @Nullable zzfgt zzfgtVar, zzeat zzeatVar, zzcxe zzcxeVar, Executor executor, zzead zzeadVar, zzegp zzegpVar, zzebj zzebjVar, zzebq zzebqVar) {
        this.zza = zzdzlVar;
        this.zzb = zzfhcVar;
        this.zzc = zzflgVar;
        this.zzd = zzcndVar;
        this.zze = zzeklVar;
        this.zzf = zzddiVar;
        this.zzg = zzfgtVar;
        this.zzh = zzeatVar;
        this.zzi = zzcxeVar;
        this.zzj = executor;
        this.zzk = zzeadVar;
        this.zzl = zzegpVar;
        this.zzm = zzebjVar;
        this.zzn = zzebqVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfie.zzb(th, this.zzl);
    }

    public final zzddi zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzfgt zzd(zzfgt zzfgtVar) throws Exception {
        this.zzd.zza(zzfgtVar);
        return zzfgtVar;
    }

    public final ListenableFuture zze(final zzfix zzfixVar) {
        zzfkl zza = this.zzc.zzb(zzfla.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgev() { // from class: com.google.android.gms.internal.ads.zzcui
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzcum.this.zzf(zzfixVar, (zzbwa) obj);
            }
        }).zza();
        zzgfo.zzr(zza, new zzcuk(this), this.zzj);
        return zza;
    }

    public final /* synthetic */ ListenableFuture zzf(zzfix zzfixVar, zzbwa zzbwaVar) throws Exception {
        zzbwaVar.zzi = zzfixVar;
        return this.zzh.zza(zzbwaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ ListenableFuture zzg(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3) throws Exception {
        return this.zzn.zzc((zzbwa) listenableFuture.get(), (JSONObject) listenableFuture2.get(), (zzbwc) listenableFuture3.get());
    }

    public final ListenableFuture zzh(zzbwa zzbwaVar) {
        zzfkl zza = this.zzc.zzb(zzfla.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbwaVar)).zza();
        zzgfo.zzr(zza, new zzcul(this), this.zzj);
        return zza;
    }

    public final ListenableFuture zzi(ListenableFuture listenableFuture) {
        zzfkx zzf = this.zzc.zzb(zzfla.RENDERER, listenableFuture).zze(new zzfkj() { // from class: com.google.android.gms.internal.ads.zzcud
            @Override // com.google.android.gms.internal.ads.zzfkj
            public final Object zza(Object obj) {
                zzfgt zzfgtVar = (zzfgt) obj;
                zzcum.this.zzd(zzfgtVar);
                return zzfgtVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfp)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfq)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final ListenableFuture zzj() {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzb.zzd;
        if (zzmVar.zzx == null && zzmVar.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzflg zzflgVar = this.zzc;
        zzdzl zzdzlVar = this.zza;
        return zzfkq.zzc(zzdzlVar.zza(), zzfla.PRELOADED_LOADER, zzflgVar).zza();
    }

    public final ListenableFuture zzk(final ListenableFuture listenableFuture) {
        zzfgt zzfgtVar = this.zzg;
        if (zzfgtVar != null) {
            return zzfkq.zzc(zzgfo.zzh(zzfgtVar), zzfla.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzu.zzc().zzj();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlh)).booleanValue() || ((Boolean) zzbex.zzc.zze()).booleanValue()) {
            zzfkx zzb = this.zzc.zzb(zzfla.SERVER_TRANSACTION, listenableFuture);
            final zzead zzeadVar = this.zzk;
            Objects.requireNonNull(zzeadVar);
            return zzb.zzf(new zzgev() { // from class: com.google.android.gms.internal.ads.zzcuj
                @Override // com.google.android.gms.internal.ads.zzgev
                public final ListenableFuture zza(Object obj) {
                    return zzead.this.zzb((zzbwa) obj);
                }
            }).zza();
        }
        final zzebj zzebjVar = this.zzm;
        Objects.requireNonNull(zzebjVar);
        final ListenableFuture zzn = zzgfo.zzn(listenableFuture, new zzgev() { // from class: com.google.android.gms.internal.ads.zzcue
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzebj.this.zza((zzbwa) obj);
            }
        }, this.zzj);
        zzfkx zzb2 = this.zzc.zzb(zzfla.BUILD_URL, zzn);
        final zzeat zzeatVar = this.zzh;
        Objects.requireNonNull(zzeatVar);
        final zzfkl zza = zzb2.zzf(new zzgev() { // from class: com.google.android.gms.internal.ads.zzcuf
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzeat.this.zzb((JSONObject) obj);
            }
        }).zza();
        return this.zzc.zza(zzfla.SERVER_TRANSACTION, listenableFuture, zzn, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcug
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcum.this.zzg(listenableFuture, zzn, zza);
            }
        }).zzf(new zzgev() { // from class: com.google.android.gms.internal.ads.zzcuh
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return (ListenableFuture) obj;
            }
        }).zza();
    }

    public final void zzl(zzfgt zzfgtVar) {
        this.zzg = zzfgtVar;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzfhc {

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzgb zza;

    @Nullable
    public final zzbmg zzb;

    @Nullable
    public final zzeob zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final com.google.android.gms.ads.internal.client.zzs zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbfr zzi;
    public final com.google.android.gms.ads.internal.client.zzy zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcm zzn;
    public final zzfgp zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzcq zzt;

    public /* synthetic */ zzfhc(zzfha zzfhaVar, zzfhb zzfhbVar) {
        this.zze = zzfha.zzg(zzfhaVar);
        this.zzf = zzfha.zzK(zzfhaVar);
        this.zzt = zzfha.zzU(zzfhaVar);
        int i2 = zzfha.zze(zzfhaVar).zza;
        long j2 = zzfha.zze(zzfhaVar).zzb;
        Bundle bundle = zzfha.zze(zzfhaVar).zzc;
        int i3 = zzfha.zze(zzfhaVar).zzd;
        List list = zzfha.zze(zzfhaVar).zze;
        boolean z2 = zzfha.zze(zzfhaVar).zzf;
        int i4 = zzfha.zze(zzfhaVar).zzg;
        boolean z3 = true;
        if (!zzfha.zze(zzfhaVar).zzh && !zzfha.zzR(zzfhaVar)) {
            z3 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzm(i2, j2, bundle, i3, list, z2, i4, z3, zzfha.zze(zzfhaVar).zzi, zzfha.zze(zzfhaVar).zzj, zzfha.zze(zzfhaVar).zzk, zzfha.zze(zzfhaVar).zzl, zzfha.zze(zzfhaVar).zzm, zzfha.zze(zzfhaVar).zzn, zzfha.zze(zzfhaVar).zzo, zzfha.zze(zzfhaVar).zzp, zzfha.zze(zzfhaVar).zzq, zzfha.zze(zzfhaVar).zzr, zzfha.zze(zzfhaVar).zzs, zzfha.zze(zzfhaVar).zzt, zzfha.zze(zzfhaVar).zzu, zzfha.zze(zzfhaVar).zzv, com.google.android.gms.ads.internal.util.zzt.zza(zzfha.zze(zzfhaVar).zzw), zzfha.zze(zzfhaVar).zzx, zzfha.zze(zzfhaVar).zzy, zzfha.zze(zzfhaVar).zzz);
        this.zza = zzfha.zzk(zzfhaVar) != null ? zzfha.zzk(zzfhaVar) : zzfha.zzl(zzfhaVar) != null ? zzfha.zzl(zzfhaVar).zzf : null;
        this.zzg = zzfha.zzM(zzfhaVar);
        this.zzh = zzfha.zzN(zzfhaVar);
        this.zzi = zzfha.zzM(zzfhaVar) == null ? null : zzfha.zzl(zzfhaVar) == null ? new zzbfr(new NativeAdOptions.Builder().build()) : zzfha.zzl(zzfhaVar);
        this.zzj = zzfha.zzi(zzfhaVar);
        this.zzk = zzfha.zza(zzfhaVar);
        this.zzl = zzfha.zzc(zzfhaVar);
        this.zzm = zzfha.zzd(zzfhaVar);
        this.zzn = zzfha.zzj(zzfhaVar);
        this.zzb = zzfha.zzm(zzfhaVar);
        this.zzo = new zzfgp(zzfha.zzo(zzfhaVar), null);
        this.zzp = zzfha.zzO(zzfhaVar);
        this.zzq = zzfha.zzP(zzfhaVar);
        this.zzc = zzfha.zzn(zzfhaVar);
        this.zzr = zzfha.zzQ(zzfhaVar);
        this.zzs = zzfha.zzb(zzfhaVar);
    }

    @Nullable
    public final zzbht zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdg));
    }
}

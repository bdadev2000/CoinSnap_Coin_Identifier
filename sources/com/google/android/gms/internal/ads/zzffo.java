package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzffo {

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzga zza;

    @Nullable
    public final zzbmb zzb;

    @Nullable
    public final zzems zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final com.google.android.gms.ads.internal.client.zzs zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbfn zzi;
    public final com.google.android.gms.ads.internal.client.zzy zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcm zzn;
    public final zzffb zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzcq zzt;

    public /* synthetic */ zzffo(zzffm zzffmVar, zzffn zzffnVar) {
        com.google.android.gms.ads.internal.client.zzga zzgaVar;
        zzbfn zzl;
        this.zze = zzffm.zzg(zzffmVar);
        this.zzf = zzffm.zzK(zzffmVar);
        this.zzt = zzffm.zzU(zzffmVar);
        int i10 = zzffm.zze(zzffmVar).zza;
        long j3 = zzffm.zze(zzffmVar).zzb;
        Bundle bundle = zzffm.zze(zzffmVar).zzc;
        int i11 = zzffm.zze(zzffmVar).zzd;
        List list = zzffm.zze(zzffmVar).zze;
        boolean z10 = zzffm.zze(zzffmVar).zzf;
        int i12 = zzffm.zze(zzffmVar).zzg;
        boolean z11 = true;
        if (!zzffm.zze(zzffmVar).zzh && !zzffm.zzR(zzffmVar)) {
            z11 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzm(i10, j3, bundle, i11, list, z10, i12, z11, zzffm.zze(zzffmVar).zzi, zzffm.zze(zzffmVar).zzj, zzffm.zze(zzffmVar).zzk, zzffm.zze(zzffmVar).zzl, zzffm.zze(zzffmVar).zzm, zzffm.zze(zzffmVar).zzn, zzffm.zze(zzffmVar).zzo, zzffm.zze(zzffmVar).zzp, zzffm.zze(zzffmVar).zzq, zzffm.zze(zzffmVar).zzr, zzffm.zze(zzffmVar).zzs, zzffm.zze(zzffmVar).zzt, zzffm.zze(zzffmVar).zzu, zzffm.zze(zzffmVar).zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzffm.zze(zzffmVar).zzw), zzffm.zze(zzffmVar).zzx, zzffm.zze(zzffmVar).zzy, zzffm.zze(zzffmVar).zzz);
        if (zzffm.zzk(zzffmVar) != null) {
            zzgaVar = zzffm.zzk(zzffmVar);
        } else if (zzffm.zzl(zzffmVar) != null) {
            zzgaVar = zzffm.zzl(zzffmVar).zzf;
        } else {
            zzgaVar = null;
        }
        this.zza = zzgaVar;
        this.zzg = zzffm.zzM(zzffmVar);
        this.zzh = zzffm.zzN(zzffmVar);
        if (zzffm.zzM(zzffmVar) == null) {
            zzl = null;
        } else if (zzffm.zzl(zzffmVar) == null) {
            zzl = new zzbfn(new NativeAdOptions.Builder().build());
        } else {
            zzl = zzffm.zzl(zzffmVar);
        }
        this.zzi = zzl;
        this.zzj = zzffm.zzi(zzffmVar);
        this.zzk = zzffm.zza(zzffmVar);
        this.zzl = zzffm.zzc(zzffmVar);
        this.zzm = zzffm.zzd(zzffmVar);
        this.zzn = zzffm.zzj(zzffmVar);
        this.zzb = zzffm.zzm(zzffmVar);
        this.zzo = new zzffb(zzffm.zzo(zzffmVar), null);
        this.zzp = zzffm.zzO(zzffmVar);
        this.zzq = zzffm.zzP(zzffmVar);
        this.zzc = zzffm.zzn(zzffmVar);
        this.zzr = zzffm.zzQ(zzffmVar);
        this.zzs = zzffm.zzb(zzffmVar);
    }

    @Nullable
    public final zzbhp zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzb();
        }
        return this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdm));
    }
}

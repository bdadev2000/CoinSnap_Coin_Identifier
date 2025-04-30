package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfho {

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzfk zza;

    @Nullable
    public final zzbnz zzb;

    @Nullable
    public final zzepc zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbhk zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzfhb zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzcf zzt;

    public /* synthetic */ zzfho(zzfhm zzfhmVar, zzfhn zzfhnVar) {
        com.google.android.gms.ads.internal.client.zzfk zzfkVar;
        zzbhk zzl;
        this.zze = zzfhm.zzg(zzfhmVar);
        this.zzf = zzfhm.zzK(zzfhmVar);
        this.zzt = zzfhm.zzT(zzfhmVar);
        int i9 = zzfhm.zze(zzfhmVar).zza;
        long j7 = zzfhm.zze(zzfhmVar).zzb;
        Bundle bundle = zzfhm.zze(zzfhmVar).zzc;
        int i10 = zzfhm.zze(zzfhmVar).zzd;
        List list = zzfhm.zze(zzfhmVar).zze;
        boolean z8 = zzfhm.zze(zzfhmVar).zzf;
        int i11 = zzfhm.zze(zzfhmVar).zzg;
        boolean z9 = true;
        if (!zzfhm.zze(zzfhmVar).zzh && !zzfhm.zzR(zzfhmVar)) {
            z9 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i9, j7, bundle, i10, list, z8, i11, z9, zzfhm.zze(zzfhmVar).zzi, zzfhm.zze(zzfhmVar).zzj, zzfhm.zze(zzfhmVar).zzk, zzfhm.zze(zzfhmVar).zzl, zzfhm.zze(zzfhmVar).zzm, zzfhm.zze(zzfhmVar).zzn, zzfhm.zze(zzfhmVar).zzo, zzfhm.zze(zzfhmVar).zzp, zzfhm.zze(zzfhmVar).zzq, zzfhm.zze(zzfhmVar).zzr, zzfhm.zze(zzfhmVar).zzs, zzfhm.zze(zzfhmVar).zzt, zzfhm.zze(zzfhmVar).zzu, zzfhm.zze(zzfhmVar).zzv, com.google.android.gms.ads.internal.util.zzt.zza(zzfhm.zze(zzfhmVar).zzw), zzfhm.zze(zzfhmVar).zzx, zzfhm.zze(zzfhmVar).zzy, zzfhm.zze(zzfhmVar).zzz);
        if (zzfhm.zzk(zzfhmVar) != null) {
            zzfkVar = zzfhm.zzk(zzfhmVar);
        } else if (zzfhm.zzl(zzfhmVar) != null) {
            zzfkVar = zzfhm.zzl(zzfhmVar).zzf;
        } else {
            zzfkVar = null;
        }
        this.zza = zzfkVar;
        this.zzg = zzfhm.zzM(zzfhmVar);
        this.zzh = zzfhm.zzN(zzfhmVar);
        if (zzfhm.zzM(zzfhmVar) == null) {
            zzl = null;
        } else if (zzfhm.zzl(zzfhmVar) == null) {
            zzl = new zzbhk(new NativeAdOptions.Builder().build());
        } else {
            zzl = zzfhm.zzl(zzfhmVar);
        }
        this.zzi = zzl;
        this.zzj = zzfhm.zzi(zzfhmVar);
        this.zzk = zzfhm.zza(zzfhmVar);
        this.zzl = zzfhm.zzc(zzfhmVar);
        this.zzm = zzfhm.zzd(zzfhmVar);
        this.zzn = zzfhm.zzj(zzfhmVar);
        this.zzb = zzfhm.zzm(zzfhmVar);
        this.zzo = new zzfhb(zzfhm.zzo(zzfhmVar), null);
        this.zzp = zzfhm.zzO(zzfhmVar);
        this.zzq = zzfhm.zzP(zzfhmVar);
        this.zzc = zzfhm.zzn(zzfhmVar);
        this.zzr = zzfhm.zzQ(zzfhmVar);
        this.zzs = zzfhm.zzb(zzfhmVar);
    }

    @Nullable
    public final zzbjm zza() {
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
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzde));
    }
}

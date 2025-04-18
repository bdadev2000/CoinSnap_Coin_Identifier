package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzvx extends zztq implements zzvo {
    private final zzgc zza;
    private final zzrp zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = C.TIME_UNSET;
    private boolean zzf;
    private boolean zzg;

    @Nullable
    private zzhd zzh;
    private zzaw zzi;
    private final zzvu zzj;
    private final zzyw zzk;

    public /* synthetic */ zzvx(zzaw zzawVar, zzgc zzgcVar, zzvu zzvuVar, zzrp zzrpVar, zzyw zzywVar, int i10, zzvw zzvwVar) {
        this.zzi = zzawVar;
        this.zza = zzgcVar;
        this.zzj = zzvuVar;
        this.zzb = zzrpVar;
        this.zzk = zzywVar;
        this.zzc = i10;
    }

    private final void zzw() {
        zzaq zzaqVar;
        zzbv zzbvVar;
        long j3 = this.zze;
        boolean z10 = this.zzf;
        boolean z11 = this.zzg;
        zzaw zzJ = zzJ();
        if (z11) {
            zzaqVar = zzJ.zzc;
        } else {
            zzaqVar = null;
        }
        zzwk zzwkVar = new zzwk(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j3, j3, 0L, 0L, z10, false, false, null, zzJ, zzaqVar);
        if (this.zzd) {
            zzbvVar = new zzvt(this, zzwkVar);
        } else {
            zzbvVar = zzwkVar;
        }
        zzo(zzbvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzG(zzup zzupVar) {
        ((zzvs) zzupVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final zzup zzI(zzur zzurVar, zzys zzysVar, long j3) {
        zzgd zza = this.zza.zza();
        zzhd zzhdVar = this.zzh;
        if (zzhdVar != null) {
            zza.zzf(zzhdVar);
        }
        zzar zzarVar = zzJ().zzb;
        zzarVar.getClass();
        Uri uri = zzarVar.zza;
        zzvu zzvuVar = this.zzj;
        zzb();
        return new zzvs(uri, zza, new zztt(zzvuVar.zza), this.zzb, zzc(zzurVar), this.zzk, zze(zzurVar), this, zzysVar, null, this.zzc, zzen.zzs(C.TIME_UNSET));
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final synchronized zzaw zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zza(long j3, boolean z10, boolean z11) {
        if (j3 == C.TIME_UNSET) {
            j3 = this.zze;
        }
        if (!this.zzd && this.zze == j3 && this.zzf == z10 && this.zzg == z11) {
            return;
        }
        this.zze = j3;
        this.zzf = z10;
        this.zzg = z11;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzn(@Nullable zzhd zzhdVar) {
        this.zzh = zzhdVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzut
    public final synchronized void zzt(zzaw zzawVar) {
        this.zzi = zzawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzz() {
    }
}

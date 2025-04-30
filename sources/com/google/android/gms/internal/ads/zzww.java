package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzww extends zzuo implements zzwn {
    private final zzha zza;
    private final zzst zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = C.TIME_UNSET;
    private boolean zzf;
    private boolean zzg;

    @Nullable
    private zzie zzh;
    private zzbu zzi;
    private final zzwt zzj;
    private final zzzz zzk;

    public /* synthetic */ zzww(zzbu zzbuVar, zzha zzhaVar, zzwt zzwtVar, zzst zzstVar, zzzz zzzzVar, int i9, zzwv zzwvVar) {
        this.zzi = zzbuVar;
        this.zza = zzhaVar;
        this.zzj = zzwtVar;
        this.zzb = zzstVar;
        this.zzk = zzzzVar;
        this.zzc = i9;
    }

    private final void zzw() {
        zzbk zzbkVar;
        zzdc zzdcVar;
        long j7 = this.zze;
        boolean z8 = this.zzf;
        boolean z9 = this.zzg;
        zzbu zzJ = zzJ();
        if (z9) {
            zzbkVar = zzJ.zzf;
        } else {
            zzbkVar = null;
        }
        zzxj zzxjVar = new zzxj(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j7, j7, 0L, 0L, z8, false, false, null, zzJ, zzbkVar);
        if (this.zzd) {
            zzdcVar = new zzws(this, zzxjVar);
        } else {
            zzdcVar = zzxjVar;
        }
        zzo(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzG(zzvm zzvmVar) {
        ((zzwr) zzvmVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final zzvm zzI(zzvo zzvoVar, zzzv zzzvVar, long j7) {
        zzhb zza = this.zza.zza();
        zzie zzieVar = this.zzh;
        if (zzieVar != null) {
            zza.zzf(zzieVar);
        }
        zzbn zzbnVar = zzJ().zzd;
        zzbnVar.getClass();
        zzwt zzwtVar = this.zzj;
        zzb();
        return new zzwr(zzbnVar.zzb, zza, new zzuq(zzwtVar.zza), this.zzb, zzc(zzvoVar), this.zzk, zze(zzvoVar), this, zzzvVar, null, this.zzc, zzgd.zzr(C.TIME_UNSET));
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final synchronized zzbu zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final void zza(long j7, boolean z8, boolean z9) {
        if (j7 == C.TIME_UNSET) {
            j7 = this.zze;
        }
        if (!this.zzd && this.zze == j7 && this.zzf == z8 && this.zzg == z9) {
            return;
        }
        this.zze = j7;
        this.zzf = z8;
        this.zzg = z9;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzn(@Nullable zzie zzieVar) {
        this.zzh = zzieVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzvq
    public final synchronized void zzt(zzbu zzbuVar) {
        this.zzi = zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzz() {
    }
}

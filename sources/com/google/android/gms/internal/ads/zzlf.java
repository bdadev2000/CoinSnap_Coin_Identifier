package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlf implements zzvi, zzrr {
    final /* synthetic */ zzlj zza;
    private final zzlh zzb;

    public zzlf(zzlj zzljVar, zzlh zzlhVar) {
        this.zza = zzljVar;
        this.zzb = zzlhVar;
    }

    @Nullable
    private final Pair zzf(int i2, @Nullable zzuy zzuyVar) {
        zzuy zzuyVar2;
        zzuy zzuyVar3 = null;
        if (zzuyVar != null) {
            zzlh zzlhVar = this.zzb;
            int i3 = 0;
            while (true) {
                if (i3 >= zzlhVar.zzc.size()) {
                    zzuyVar2 = null;
                    break;
                }
                if (((zzuy) zzlhVar.zzc.get(i3)).zzd == zzuyVar.zzd) {
                    zzuyVar2 = zzuyVar.zza(Pair.create(zzlhVar.zzb, zzuyVar.zza));
                    break;
                }
                i3++;
            }
            if (zzuyVar2 == null) {
                return null;
            }
            zzuyVar3 = zzuyVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzuyVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzae(int i2, @Nullable zzuy zzuyVar, final zzuu zzuuVar) {
        zzdt zzdtVar;
        final Pair zzf = zzf(0, zzuyVar);
        if (zzf != null) {
            zzdtVar = this.zza.zzi;
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzld
                @Override // java.lang.Runnable
                public final void run() {
                    zzma zzmaVar;
                    Pair pair = zzf;
                    zzmaVar = zzlf.this.zza.zzh;
                    zzmaVar.zzae(((Integer) pair.first).intValue(), (zzuy) pair.second, zzuuVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzaf(int i2, @Nullable zzuy zzuyVar, final zzup zzupVar, final zzuu zzuuVar) {
        zzdt zzdtVar;
        final Pair zzf = zzf(0, zzuyVar);
        if (zzf != null) {
            zzdtVar = this.zza.zzi;
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlb
                @Override // java.lang.Runnable
                public final void run() {
                    zzma zzmaVar;
                    Pair pair = zzf;
                    zzmaVar = zzlf.this.zza.zzh;
                    zzmaVar.zzaf(((Integer) pair.first).intValue(), (zzuy) pair.second, zzupVar, zzuuVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzag(int i2, @Nullable zzuy zzuyVar, final zzup zzupVar, final zzuu zzuuVar) {
        zzdt zzdtVar;
        final Pair zzf = zzf(0, zzuyVar);
        if (zzf != null) {
            zzdtVar = this.zza.zzi;
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzle
                @Override // java.lang.Runnable
                public final void run() {
                    zzma zzmaVar;
                    Pair pair = zzf;
                    zzmaVar = zzlf.this.zza.zzh;
                    zzmaVar.zzag(((Integer) pair.first).intValue(), (zzuy) pair.second, zzupVar, zzuuVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzah(int i2, @Nullable zzuy zzuyVar, final zzup zzupVar, final zzuu zzuuVar, final IOException iOException, final boolean z2) {
        zzdt zzdtVar;
        final Pair zzf = zzf(0, zzuyVar);
        if (zzf != null) {
            zzdtVar = this.zza.zzi;
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzla
                @Override // java.lang.Runnable
                public final void run() {
                    zzma zzmaVar;
                    Pair pair = zzf;
                    zzmaVar = zzlf.this.zza.zzh;
                    zzmaVar.zzah(((Integer) pair.first).intValue(), (zzuy) pair.second, zzupVar, zzuuVar, iOException, z2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzai(int i2, @Nullable zzuy zzuyVar, final zzup zzupVar, final zzuu zzuuVar) {
        zzdt zzdtVar;
        final Pair zzf = zzf(0, zzuyVar);
        if (zzf != null) {
            zzdtVar = this.zza.zzi;
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlc
                @Override // java.lang.Runnable
                public final void run() {
                    zzma zzmaVar;
                    Pair pair = zzf;
                    zzmaVar = zzlf.this.zza.zzh;
                    zzmaVar.zzai(((Integer) pair.first).intValue(), (zzuy) pair.second, zzupVar, zzuuVar);
                }
            });
        }
    }
}

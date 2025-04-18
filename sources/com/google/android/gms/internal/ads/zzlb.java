package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlb implements zzvb, zzrl {
    final /* synthetic */ zzlf zza;
    private final zzld zzb;

    public zzlb(zzlf zzlfVar, zzld zzldVar) {
        this.zza = zzlfVar;
        this.zzb = zzldVar;
    }

    @Nullable
    private final Pair zzf(int i10, @Nullable zzur zzurVar) {
        zzur zzurVar2;
        zzur zzurVar3 = null;
        if (zzurVar != null) {
            zzld zzldVar = this.zzb;
            int i11 = 0;
            while (true) {
                if (i11 < zzldVar.zzc.size()) {
                    if (((zzur) zzldVar.zzc.get(i11)).zzd == zzurVar.zzd) {
                        zzurVar2 = zzurVar.zza(Pair.create(zzldVar.zzb, zzurVar.zza));
                        break;
                    }
                    i11++;
                } else {
                    zzurVar2 = null;
                    break;
                }
            }
            if (zzurVar2 == null) {
                return null;
            }
            zzurVar3 = zzurVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzurVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzaf(int i10, @Nullable zzur zzurVar, final zzun zzunVar) {
        zzdm zzdmVar;
        final Pair zzf = zzf(0, zzurVar);
        if (zzf != null) {
            zzdmVar = this.zza.zzi;
            zzdmVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkz
                @Override // java.lang.Runnable
                public final void run() {
                    zzlw zzlwVar;
                    Pair pair = zzf;
                    zzlwVar = zzlb.this.zza.zzh;
                    zzlwVar.zzaf(((Integer) pair.first).intValue(), (zzur) pair.second, zzunVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzag(int i10, @Nullable zzur zzurVar, final zzui zzuiVar, final zzun zzunVar) {
        zzdm zzdmVar;
        final Pair zzf = zzf(0, zzurVar);
        if (zzf != null) {
            zzdmVar = this.zza.zzi;
            zzdmVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkx
                @Override // java.lang.Runnable
                public final void run() {
                    zzlw zzlwVar;
                    Pair pair = zzf;
                    zzlwVar = zzlb.this.zza.zzh;
                    zzlwVar.zzag(((Integer) pair.first).intValue(), (zzur) pair.second, zzuiVar, zzunVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzah(int i10, @Nullable zzur zzurVar, final zzui zzuiVar, final zzun zzunVar) {
        zzdm zzdmVar;
        final Pair zzf = zzf(0, zzurVar);
        if (zzf != null) {
            zzdmVar = this.zza.zzi;
            zzdmVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzla
                @Override // java.lang.Runnable
                public final void run() {
                    zzlw zzlwVar;
                    Pair pair = zzf;
                    zzlwVar = zzlb.this.zza.zzh;
                    zzlwVar.zzah(((Integer) pair.first).intValue(), (zzur) pair.second, zzuiVar, zzunVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzai(int i10, @Nullable zzur zzurVar, final zzui zzuiVar, final zzun zzunVar, final IOException iOException, final boolean z10) {
        zzdm zzdmVar;
        final Pair zzf = zzf(0, zzurVar);
        if (zzf != null) {
            zzdmVar = this.zza.zzi;
            zzdmVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final void run() {
                    zzlw zzlwVar;
                    Pair pair = zzf;
                    zzlwVar = zzlb.this.zza.zzh;
                    zzlwVar.zzai(((Integer) pair.first).intValue(), (zzur) pair.second, zzuiVar, zzunVar, iOException, z10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzaj(int i10, @Nullable zzur zzurVar, final zzui zzuiVar, final zzun zzunVar) {
        zzdm zzdmVar;
        final Pair zzf = zzf(0, zzurVar);
        if (zzf != null) {
            zzdmVar = this.zza.zzi;
            zzdmVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzky
                @Override // java.lang.Runnable
                public final void run() {
                    zzlw zzlwVar;
                    Pair pair = zzf;
                    zzlwVar = zzlb.this.zza.zzh;
                    zzlwVar.zzaj(((Integer) pair.first).intValue(), (zzur) pair.second, zzuiVar, zzunVar);
                }
            });
        }
    }
}

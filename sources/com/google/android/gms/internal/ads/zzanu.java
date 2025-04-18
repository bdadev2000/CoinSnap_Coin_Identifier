package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzanu implements zzann {
    final /* synthetic */ zzanw zza;
    private final zzec zzb = new zzec(new byte[4], 4);

    public zzanu(zzanw zzanwVar) {
        this.zza = zzanwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zza(zzed zzedVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i10;
        if (zzedVar.zzm() == 0 && (zzedVar.zzm() & 128) != 0) {
            zzedVar.zzM(6);
            int zzb = zzedVar.zzb() / 4;
            for (int i11 = 0; i11 < zzb; i11++) {
                zzedVar.zzG(this.zzb, 4);
                zzec zzecVar = this.zzb;
                int zzd = zzecVar.zzd(16);
                zzecVar.zzn(3);
                if (zzd == 0) {
                    this.zzb.zzn(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    sparseArray2 = this.zza.zzg;
                    if (sparseArray2.get(zzd2) == null) {
                        zzanw zzanwVar = this.zza;
                        sparseArray3 = zzanwVar.zzg;
                        sparseArray3.put(zzd2, new zzano(new zzanv(zzanwVar, zzd2)));
                        zzanw zzanwVar2 = this.zza;
                        i10 = zzanwVar2.zzm;
                        zzanwVar2.zzm = i10 + 1;
                    }
                }
            }
            sparseArray = this.zza.zzg;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzb(zzek zzekVar, zzacu zzacuVar, zzaoa zzaoaVar) {
    }
}

package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaoh implements zzaoa {
    final /* synthetic */ zzaoj zza;
    private final zzej zzb = new zzej(new byte[4], 4);

    public zzaoh(zzaoj zzaojVar) {
        this.zza = zzaojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zza(zzek zzekVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i2;
        if (zzekVar.zzm() == 0 && (zzekVar.zzm() & 128) != 0) {
            zzekVar.zzM(6);
            int zzb = zzekVar.zzb() / 4;
            for (int i3 = 0; i3 < zzb; i3++) {
                zzekVar.zzG(this.zzb, 4);
                zzej zzejVar = this.zzb;
                int zzd = zzejVar.zzd(16);
                zzejVar.zzn(3);
                if (zzd == 0) {
                    this.zzb.zzn(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    sparseArray2 = this.zza.zzg;
                    if (sparseArray2.get(zzd2) == null) {
                        zzaoj zzaojVar = this.zza;
                        sparseArray3 = zzaojVar.zzg;
                        sparseArray3.put(zzd2, new zzaob(new zzaoi(zzaojVar, zzd2)));
                        zzaoj zzaojVar2 = this.zza;
                        i2 = zzaojVar2.zzm;
                        zzaojVar2.zzm = i2 + 1;
                    }
                }
            }
            sparseArray = this.zza.zzg;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zzb(zzer zzerVar, zzade zzadeVar, zzaon zzaonVar) {
    }
}

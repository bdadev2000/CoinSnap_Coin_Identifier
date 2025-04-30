package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzapi implements zzapb {
    final /* synthetic */ zzapk zza;
    private final zzft zzb = new zzft(new byte[4], 4);

    public zzapi(zzapk zzapkVar) {
        this.zza = zzapkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza(zzfu zzfuVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i9;
        if (zzfuVar.zzm() == 0 && (zzfuVar.zzm() & 128) != 0) {
            zzfuVar.zzL(6);
            int zzb = zzfuVar.zzb() / 4;
            for (int i10 = 0; i10 < zzb; i10++) {
                zzfuVar.zzF(this.zzb, 4);
                zzft zzftVar = this.zzb;
                int zzd = zzftVar.zzd(16);
                zzftVar.zzm(3);
                if (zzd == 0) {
                    this.zzb.zzm(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    sparseArray2 = this.zza.zzg;
                    if (sparseArray2.get(zzd2) == null) {
                        zzapk zzapkVar = this.zza;
                        sparseArray3 = zzapkVar.zzg;
                        sparseArray3.put(zzd2, new zzapc(new zzapj(zzapkVar, zzd2)));
                        zzapk zzapkVar2 = this.zza;
                        i9 = zzapkVar2.zzm;
                        zzapkVar2.zzm = i9 + 1;
                    }
                }
            }
            sparseArray = this.zza.zzg;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(zzgb zzgbVar, zzadx zzadxVar, zzapo zzapoVar) {
    }
}

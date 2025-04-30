package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzajk {
    public final zzaen zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;

    @Nullable
    public final long[] zzf;

    private zzajk(zzaen zzaenVar, long j7, long j9, @Nullable long[] jArr, int i9, int i10) {
        this.zza = zzaenVar;
        this.zzb = j7;
        this.zzc = j9;
        this.zzf = jArr;
        this.zzd = i9;
        this.zze = i10;
    }

    public static zzajk zza(zzaen zzaenVar, zzfu zzfuVar) {
        int i9;
        long j7;
        long[] jArr;
        int i10;
        int i11;
        int zzg = zzfuVar.zzg();
        if ((zzg & 1) != 0) {
            i9 = zzfuVar.zzp();
        } else {
            i9 = -1;
        }
        if ((zzg & 2) != 0) {
            j7 = zzfuVar.zzu();
        } else {
            j7 = -1;
        }
        long j9 = j7;
        if ((zzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr2[i12] = zzfuVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzg & 8) != 0) {
            zzfuVar.zzL(4);
        }
        if (zzfuVar.zzb() >= 24) {
            zzfuVar.zzL(21);
            int zzo = zzfuVar.zzo();
            i11 = zzo & 4095;
            i10 = zzo >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new zzajk(zzaenVar, i9, j9, jArr, i10, i11);
    }
}

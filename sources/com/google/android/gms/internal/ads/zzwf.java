package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzwf extends zzuw {
    private static final zzbu zza;
    private final zzvq[] zzb;
    private final zzdc[] zzc;
    private final ArrayList zzd;

    @Nullable
    private zzwe zzi;
    private final zzuz zzj;
    private int zzg = -1;
    private long[][] zzh = new long[0];
    private final Map zze = new HashMap();
    private final zzgca zzf = zzgci.zzb(8).zzb(2).zza();

    static {
        zzaw zzawVar = new zzaw();
        zzawVar.zza("MergingMediaSource");
        zza = zzawVar.zzc();
    }

    public zzwf(boolean z8, boolean z9, zzuz zzuzVar, zzvq... zzvqVarArr) {
        this.zzb = zzvqVarArr;
        this.zzj = zzuzVar;
        this.zzd = new ArrayList(Arrays.asList(zzvqVarArr));
        this.zzc = new zzdc[zzvqVarArr.length];
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzvq zzvqVar, zzdc zzdcVar) {
        int i9;
        if (this.zzi == null) {
            if (this.zzg == -1) {
                i9 = zzdcVar.zzb();
                this.zzg = i9;
            } else {
                int zzb = zzdcVar.zzb();
                int i10 = this.zzg;
                if (zzb != i10) {
                    this.zzi = new zzwe(0);
                    return;
                }
                i9 = i10;
            }
            if (this.zzh.length == 0) {
                this.zzh = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i9, this.zzc.length);
            }
            this.zzd.remove(zzvqVar);
            this.zzc[((Integer) obj).intValue()] = zzdcVar;
            if (this.zzd.isEmpty()) {
                zzo(this.zzc[0]);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzG(zzvm zzvmVar) {
        zzwd zzwdVar = (zzwd) zzvmVar;
        int i9 = 0;
        while (true) {
            zzvq[] zzvqVarArr = this.zzb;
            if (i9 < zzvqVarArr.length) {
                zzvqVarArr[i9].zzG(zzwdVar.zzn(i9));
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final zzvm zzI(zzvo zzvoVar, zzzv zzzvVar, long j7) {
        zzdc[] zzdcVarArr = this.zzc;
        int length = this.zzb.length;
        zzvm[] zzvmVarArr = new zzvm[length];
        int zza2 = zzdcVarArr[0].zza(zzvoVar.zza);
        for (int i9 = 0; i9 < length; i9++) {
            zzvmVarArr[i9] = this.zzb[i9].zzI(zzvoVar.zza(this.zzc[i9].zzf(zza2)), zzzvVar, j7 - this.zzh[zza2][i9]);
        }
        return new zzwd(this.zzj, this.zzh[zza2], zzvmVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final zzbu zzJ() {
        zzvq[] zzvqVarArr = this.zzb;
        if (zzvqVarArr.length > 0) {
            return zzvqVarArr[0].zzJ();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzuo
    public final void zzn(@Nullable zzie zzieVar) {
        super.zzn(zzieVar);
        int i9 = 0;
        while (true) {
            zzvq[] zzvqVarArr = this.zzb;
            if (i9 < zzvqVarArr.length) {
                zzB(Integer.valueOf(i9), zzvqVarArr[i9]);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzuo
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzvq
    public final void zzt(zzbu zzbuVar) {
        this.zzb[0].zzt(zzbuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    @Nullable
    public final /* bridge */ /* synthetic */ zzvo zzy(Object obj, zzvo zzvoVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzvoVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzvq
    public final void zzz() throws IOException {
        zzwe zzweVar = this.zzi;
        if (zzweVar == null) {
            super.zzz();
            return;
        }
        throw zzweVar;
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzvg extends zztz {
    private static final zzaw zza;
    private final zzut[] zzb;
    private final zzbv[] zzc;
    private final ArrayList zzd;
    private int zze = -1;
    private long[][] zzf = new long[0];

    @Nullable
    private zzvf zzg;
    private final zzuc zzh;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zza("MergingMediaSource");
        zza = zzakVar.zzc();
    }

    public zzvg(boolean z10, boolean z11, zzuc zzucVar, zzut... zzutVarArr) {
        this.zzb = zzutVarArr;
        this.zzh = zzucVar;
        this.zzd = new ArrayList(Arrays.asList(zzutVarArr));
        this.zzc = new zzbv[zzutVarArr.length];
        new HashMap();
        zzgau.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzut zzutVar, zzbv zzbvVar) {
        int i10;
        Integer num = (Integer) obj;
        if (this.zzg == null) {
            if (this.zze == -1) {
                i10 = zzbvVar.zzb();
                this.zze = i10;
            } else {
                int zzb = zzbvVar.zzb();
                int i11 = this.zze;
                if (zzb != i11) {
                    this.zzg = new zzvf(0);
                    return;
                }
                i10 = i11;
            }
            if (this.zzf.length == 0) {
                this.zzf = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i10, this.zzc.length);
            }
            this.zzd.remove(zzutVar);
            this.zzc[num.intValue()] = zzbvVar;
            if (this.zzd.isEmpty()) {
                zzo(this.zzc[0]);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzG(zzup zzupVar) {
        zzve zzveVar = (zzve) zzupVar;
        int i10 = 0;
        while (true) {
            zzut[] zzutVarArr = this.zzb;
            if (i10 < zzutVarArr.length) {
                zzutVarArr[i10].zzG(zzveVar.zzn(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final zzup zzI(zzur zzurVar, zzys zzysVar, long j3) {
        zzbv[] zzbvVarArr = this.zzc;
        int length = this.zzb.length;
        zzup[] zzupVarArr = new zzup[length];
        int zza2 = zzbvVarArr[0].zza(zzurVar.zza);
        for (int i10 = 0; i10 < length; i10++) {
            zzupVarArr[i10] = this.zzb[i10].zzI(zzurVar.zza(this.zzc[i10].zzf(zza2)), zzysVar, j3 - this.zzf[zza2][i10]);
        }
        return new zzve(this.zzh, this.zzf[zza2], zzupVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final zzaw zzJ() {
        zzut[] zzutVarArr = this.zzb;
        return zzutVarArr.length > 0 ? zzutVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zztz, com.google.android.gms.internal.ads.zztq
    public final void zzn(@Nullable zzhd zzhdVar) {
        super.zzn(zzhdVar);
        int i10 = 0;
        while (true) {
            zzut[] zzutVarArr = this.zzb;
            if (i10 < zzutVarArr.length) {
                zzB(Integer.valueOf(i10), zzutVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztz, com.google.android.gms.internal.ads.zztq
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zze = -1;
        this.zzg = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzut
    public final void zzt(zzaw zzawVar) {
        this.zzb[0].zzt(zzawVar);
    }

    @Override // com.google.android.gms.internal.ads.zztz
    @Nullable
    public final /* bridge */ /* synthetic */ zzur zzy(Object obj, zzur zzurVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzurVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zztz, com.google.android.gms.internal.ads.zzut
    public final void zzz() throws IOException {
        zzvf zzvfVar = this.zzg;
        if (zzvfVar == null) {
            super.zzz();
            return;
        }
        throw zzvfVar;
    }
}

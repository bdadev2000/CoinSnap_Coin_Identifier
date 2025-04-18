package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzvn extends zzug {
    private static final zzbc zza;
    private final zzva[] zzb;
    private final zzcc[] zzc;
    private final ArrayList zzd;
    private int zze = -1;
    private long[][] zzf = new long[0];

    @Nullable
    private zzvm zzg;
    private final zzuj zzh;

    static {
        zzam zzamVar = new zzam();
        zzamVar.zza("MergingMediaSource");
        zza = zzamVar.zzc();
    }

    public zzvn(boolean z2, boolean z3, zzuj zzujVar, zzva... zzvaVarArr) {
        this.zzb = zzvaVarArr;
        this.zzh = zzujVar;
        this.zzd = new ArrayList(Arrays.asList(zzvaVarArr));
        this.zzc = new zzcc[zzvaVarArr.length];
        new HashMap();
        zzgcd.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzva zzvaVar, zzcc zzccVar) {
        int i2;
        Integer num = (Integer) obj;
        if (this.zzg != null) {
            return;
        }
        if (this.zze == -1) {
            i2 = zzccVar.zzb();
            this.zze = i2;
        } else {
            int zzb = zzccVar.zzb();
            int i3 = this.zze;
            if (zzb != i3) {
                this.zzg = new zzvm(0);
                return;
            }
            i2 = i3;
        }
        if (this.zzf.length == 0) {
            this.zzf = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i2, this.zzc.length);
        }
        this.zzd.remove(zzvaVar);
        this.zzc[num.intValue()] = zzccVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzG(zzuw zzuwVar) {
        zzvl zzvlVar = (zzvl) zzuwVar;
        int i2 = 0;
        while (true) {
            zzva[] zzvaVarArr = this.zzb;
            if (i2 >= zzvaVarArr.length) {
                return;
            }
            zzvaVarArr[i2].zzG(zzvlVar.zzn(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final zzuw zzI(zzuy zzuyVar, zzza zzzaVar, long j2) {
        zzcc[] zzccVarArr = this.zzc;
        int length = this.zzb.length;
        zzuw[] zzuwVarArr = new zzuw[length];
        int zza2 = zzccVarArr[0].zza(zzuyVar.zza);
        for (int i2 = 0; i2 < length; i2++) {
            zzuwVarArr[i2] = this.zzb[i2].zzI(zzuyVar.zza(this.zzc[i2].zzf(zza2)), zzzaVar, j2 - this.zzf[zza2][i2]);
        }
        return new zzvl(this.zzh, this.zzf[zza2], zzuwVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final zzbc zzJ() {
        zzva[] zzvaVarArr = this.zzb;
        return zzvaVarArr.length > 0 ? zzvaVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zztx
    public final void zzn(@Nullable zzhh zzhhVar) {
        super.zzn(zzhhVar);
        int i2 = 0;
        while (true) {
            zzva[] zzvaVarArr = this.zzb;
            if (i2 >= zzvaVarArr.length) {
                return;
            }
            zzB(Integer.valueOf(i2), zzvaVarArr[i2]);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zztx
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zze = -1;
        this.zzg = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzva
    public final void zzt(zzbc zzbcVar) {
        this.zzb[0].zzt(zzbcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    @Nullable
    public final /* bridge */ /* synthetic */ zzuy zzy(Object obj, zzuy zzuyVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzuyVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzva
    public final void zzz() throws IOException {
        zzvm zzvmVar = this.zzg;
        if (zzvmVar != null) {
            throw zzvmVar;
        }
        super.zzz();
    }
}

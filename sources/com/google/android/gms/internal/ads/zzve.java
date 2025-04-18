package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes3.dex */
final class zzve implements zzup, zzuo {
    private final zzup[] zza;

    @Nullable
    private zzuo zze;

    @Nullable
    private zzwr zzf;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzwi zzh = new zzub(zzfzo.zzn(), zzfzo.zzn());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzup[] zzg = new zzup[0];

    public zzve(zzuc zzucVar, long[] jArr, zzup... zzupVarArr) {
        this.zza = zzupVarArr;
        for (int i10 = 0; i10 < zzupVarArr.length; i10++) {
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.zza[i10] = new zzwo(zzupVarArr[i10], j3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j3, zzls zzlsVar) {
        zzup zzupVar;
        zzup[] zzupVarArr = this.zzg;
        if (zzupVarArr.length > 0) {
            zzupVar = zzupVarArr[0];
        } else {
            zzupVar = this.zza[0];
        }
        return zzupVar.zza(j3, zzlsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        long j3 = -9223372036854775807L;
        for (zzup zzupVar : this.zzg) {
            long zzd = zzupVar.zzd();
            if (zzd != C.TIME_UNSET) {
                if (j3 == C.TIME_UNSET) {
                    for (zzup zzupVar2 : this.zzg) {
                        if (zzupVar2 == zzupVar) {
                            break;
                        }
                        if (zzupVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = zzd;
                } else if (zzd != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != C.TIME_UNSET && zzupVar.zze(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j3) {
        long zze = this.zzg[0].zze(j3);
        int i10 = 1;
        while (true) {
            zzup[] zzupVarArr = this.zzg;
            if (i10 < zzupVarArr.length) {
                if (zzupVarArr[i10].zze(zze) == zze) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return zze;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyd[] zzydVarArr, boolean[] zArr, zzwg[] zzwgVarArr, boolean[] zArr2, long j3) {
        int length;
        zzwg zzwgVar;
        int intValue;
        int length2 = zzydVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzydVarArr.length;
            Integer num = null;
            if (i11 >= length) {
                break;
            }
            zzwg zzwgVar2 = zzwgVarArr[i11];
            if (zzwgVar2 != null) {
                num = (Integer) this.zzb.get(zzwgVar2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i11] = intValue;
            zzyd zzydVar = zzydVarArr[i11];
            if (zzydVar != null) {
                String str = zzydVar.zze().zzb;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.zzb.clear();
        zzwg[] zzwgVarArr2 = new zzwg[length];
        zzwg[] zzwgVarArr3 = new zzwg[length];
        zzyd[] zzydVarArr2 = new zzyd[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j10 = j3;
        int i12 = 0;
        while (i12 < this.zza.length) {
            for (int i13 = i10; i13 < zzydVarArr.length; i13++) {
                if (iArr[i13] == i12) {
                    zzwgVar = zzwgVarArr[i13];
                } else {
                    zzwgVar = null;
                }
                zzwgVarArr3[i13] = zzwgVar;
                if (iArr2[i13] == i12) {
                    zzyd zzydVar2 = zzydVarArr[i13];
                    zzydVar2.getClass();
                    zzbw zzbwVar = (zzbw) this.zzd.get(zzydVar2.zze());
                    zzbwVar.getClass();
                    zzydVarArr2[i13] = new zzvd(zzydVar2, zzbwVar);
                } else {
                    zzydVarArr2[i13] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzyd[] zzydVarArr3 = zzydVarArr2;
            zzwg[] zzwgVarArr4 = zzwgVarArr3;
            long zzf = this.zza[i12].zzf(zzydVarArr2, zArr, zzwgVarArr3, zArr2, j10);
            if (i12 == 0) {
                j10 = zzf;
            } else if (zzf != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < zzydVarArr.length; i14++) {
                boolean z11 = true;
                if (iArr2[i14] == i12) {
                    zzwg zzwgVar3 = zzwgVarArr4[i14];
                    zzwgVar3.getClass();
                    zzwgVarArr2[i14] = zzwgVar3;
                    this.zzb.put(zzwgVar3, Integer.valueOf(i12));
                    z10 = true;
                } else if (iArr[i14] == i12) {
                    if (zzwgVarArr4[i14] != null) {
                        z11 = false;
                    }
                    zzdb.zzf(z11);
                }
            }
            if (z10) {
                arrayList2.add(this.zza[i12]);
            }
            i12++;
            arrayList = arrayList2;
            zzydVarArr2 = zzydVarArr3;
            zzwgVarArr3 = zzwgVarArr4;
            i10 = 0;
        }
        int i15 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwgVarArr2, i15, zzwgVarArr, i15, length);
        this.zzg = (zzup[]) arrayList3.toArray(new zzup[i15]);
        this.zzh = new zzub(arrayList3, zzgae.zzb(arrayList3, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzvc
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return ((zzup) obj).zzh().zzc();
            }
        }));
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final /* bridge */ /* synthetic */ void zzg(zzwi zzwiVar) {
        zzuo zzuoVar = this.zze;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzwr zzh() {
        zzwr zzwrVar = this.zzf;
        zzwrVar.getClass();
        return zzwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        this.zzc.remove(zzupVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (zzup zzupVar2 : this.zza) {
            i10 += zzupVar2.zzh().zzb;
        }
        zzbw[] zzbwVarArr = new zzbw[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            zzup[] zzupVarArr = this.zza;
            if (i11 < zzupVarArr.length) {
                zzwr zzh = zzupVarArr[i11].zzh();
                int i13 = zzh.zzb;
                int i14 = 0;
                while (i14 < i13) {
                    zzbw zzb = zzh.zzb(i14);
                    zzad[] zzadVarArr = new zzad[zzb.zza];
                    for (int i15 = 0; i15 < zzb.zza; i15++) {
                        zzad zzb2 = zzb.zzb(i15);
                        zzab zzb3 = zzb2.zzb();
                        String str = zzb2.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzb3.zzL(i11 + ":" + str);
                        zzadVarArr[i15] = zzb3.zzaf();
                    }
                    zzbw zzbwVar = new zzbw(i11 + ":" + zzb.zzb, zzadVarArr);
                    this.zzd.put(zzbwVar, zzb);
                    zzbwVarArr[i12] = zzbwVar;
                    i14++;
                    i12++;
                }
                i11++;
            } else {
                this.zzf = new zzwr(zzbwVarArr);
                zzuo zzuoVar = this.zze;
                zzuoVar.getClass();
                zzuoVar.zzi(this);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j3, boolean z10) {
        for (zzup zzupVar : this.zzg) {
            zzupVar.zzj(j3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() throws IOException {
        int i10 = 0;
        while (true) {
            zzup[] zzupVarArr = this.zza;
            if (i10 < zzupVarArr.length) {
                zzupVarArr[i10].zzk();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j3) {
        this.zze = zzuoVar;
        Collections.addAll(this.zzc, this.zza);
        int i10 = 0;
        while (true) {
            zzup[] zzupVarArr = this.zza;
            if (i10 < zzupVarArr.length) {
                zzupVarArr[i10].zzl(this, j3);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j3) {
        this.zzh.zzm(j3);
    }

    public final zzup zzn(int i10) {
        zzup zzupVar = this.zza[i10];
        if (zzupVar instanceof zzwo) {
            return ((zzwo) zzupVar).zzn();
        }
        return zzupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((zzup) this.zzc.get(i10)).zzo(zzkoVar);
            }
            return false;
        }
        return this.zzh.zzo(zzkoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}

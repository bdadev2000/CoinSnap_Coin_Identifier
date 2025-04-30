package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes2.dex */
final class zzwd implements zzvm, zzvl {
    private final zzvm[] zza;

    @Nullable
    private zzvl zze;

    @Nullable
    private zzxr zzf;
    private final zzuz zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzxh zzh = new zzuy(zzgbc.zzm(), zzgbc.zzm());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzvm[] zzg = new zzvm[0];

    public zzwd(zzuz zzuzVar, long[] jArr, zzvm... zzvmVarArr) {
        this.zzi = zzuzVar;
        this.zza = zzvmVarArr;
        for (int i9 = 0; i9 < zzvmVarArr.length; i9++) {
            long j7 = jArr[i9];
            if (j7 != 0) {
                this.zza[i9] = new zzxn(zzvmVarArr[i9], j7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zza(long j7, zzmr zzmrVar) {
        zzvm zzvmVar;
        zzvm[] zzvmVarArr = this.zzg;
        if (zzvmVarArr.length > 0) {
            zzvmVar = zzvmVarArr[0];
        } else {
            zzvmVar = this.zza[0];
        }
        return zzvmVar.zza(j7, zzmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzd() {
        long j7 = -9223372036854775807L;
        for (zzvm zzvmVar : this.zzg) {
            long zzd = zzvmVar.zzd();
            if (zzd != C.TIME_UNSET) {
                if (j7 == C.TIME_UNSET) {
                    for (zzvm zzvmVar2 : this.zzg) {
                        if (zzvmVar2 == zzvmVar) {
                            break;
                        }
                        if (zzvmVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j7 = zzd;
                } else if (zzd != j7) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j7 != C.TIME_UNSET && zzvmVar.zze(j7) != j7) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zze(long j7) {
        long zze = this.zzg[0].zze(j7);
        int i9 = 1;
        while (true) {
            zzvm[] zzvmVarArr = this.zzg;
            if (i9 < zzvmVarArr.length) {
                if (zzvmVarArr[i9].zze(zze) == zze) {
                    i9++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return zze;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzf(zzzg[] zzzgVarArr, boolean[] zArr, zzxf[] zzxfVarArr, boolean[] zArr2, long j7) {
        int length;
        zzxf zzxfVar;
        int intValue;
        int length2 = zzzgVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            length = zzzgVarArr.length;
            Integer num = null;
            if (i10 >= length) {
                break;
            }
            zzxf zzxfVar2 = zzxfVarArr[i10];
            if (zzxfVar2 != null) {
                num = (Integer) this.zzb.get(zzxfVar2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i10] = intValue;
            zzzg zzzgVar = zzzgVarArr[i10];
            if (zzzgVar != null) {
                String str = zzzgVar.zze().zzc;
                iArr2[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i10] = -1;
            }
            i10++;
        }
        this.zzb.clear();
        zzxf[] zzxfVarArr2 = new zzxf[length];
        zzxf[] zzxfVarArr3 = new zzxf[length];
        zzzg[] zzzgVarArr2 = new zzzg[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j9 = j7;
        int i11 = 0;
        while (i11 < this.zza.length) {
            for (int i12 = i9; i12 < zzzgVarArr.length; i12++) {
                if (iArr[i12] == i11) {
                    zzxfVar = zzxfVarArr[i12];
                } else {
                    zzxfVar = null;
                }
                zzxfVarArr3[i12] = zzxfVar;
                if (iArr2[i12] == i11) {
                    zzzg zzzgVar2 = zzzgVarArr[i12];
                    zzzgVar2.getClass();
                    zzde zzdeVar = (zzde) this.zzd.get(zzzgVar2.zze());
                    zzdeVar.getClass();
                    zzzgVarArr2[i12] = new zzwc(zzzgVar2, zzdeVar);
                } else {
                    zzzgVarArr2[i12] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzzg[] zzzgVarArr3 = zzzgVarArr2;
            zzxf[] zzxfVarArr4 = zzxfVarArr3;
            long zzf = this.zza[i11].zzf(zzzgVarArr2, zArr, zzxfVarArr3, zArr2, j9);
            if (i11 == 0) {
                j9 = zzf;
            } else if (zzf != j9) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z8 = false;
            for (int i13 = 0; i13 < zzzgVarArr.length; i13++) {
                boolean z9 = true;
                if (iArr2[i13] == i11) {
                    zzxf zzxfVar3 = zzxfVarArr4[i13];
                    zzxfVar3.getClass();
                    zzxfVarArr2[i13] = zzxfVar3;
                    this.zzb.put(zzxfVar3, Integer.valueOf(i11));
                    z8 = true;
                } else if (iArr[i13] == i11) {
                    if (zzxfVarArr4[i13] != null) {
                        z9 = false;
                    }
                    zzeq.zzf(z9);
                }
            }
            if (z8) {
                arrayList2.add(this.zza[i11]);
            }
            i11++;
            arrayList = arrayList2;
            zzzgVarArr2 = zzzgVarArr3;
            zzxfVarArr3 = zzxfVarArr4;
            i9 = 0;
        }
        int i14 = i9;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzxfVarArr2, i14, zzxfVarArr, i14, length);
        this.zzg = (zzvm[]) arrayList3.toArray(new zzvm[i14]);
        this.zzh = new zzuy(arrayList3, zzgbs.zzb(arrayList3, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzwb
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return ((zzvm) obj).zzh().zzc();
            }
        }));
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final /* bridge */ /* synthetic */ void zzg(zzxh zzxhVar) {
        zzvl zzvlVar = this.zze;
        zzvlVar.getClass();
        zzvlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzxr zzh() {
        zzxr zzxrVar = this.zzf;
        zzxrVar.getClass();
        return zzxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzi(zzvm zzvmVar) {
        this.zzc.remove(zzvmVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i9 = 0;
        for (zzvm zzvmVar2 : this.zza) {
            i9 += zzvmVar2.zzh().zzc;
        }
        zzde[] zzdeVarArr = new zzde[i9];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            zzvm[] zzvmVarArr = this.zza;
            if (i10 < zzvmVarArr.length) {
                zzxr zzh = zzvmVarArr[i10].zzh();
                int i12 = zzh.zzc;
                int i13 = 0;
                while (i13 < i12) {
                    zzde zzb = zzh.zzb(i13);
                    zzan[] zzanVarArr = new zzan[zzb.zzb];
                    for (int i14 = 0; i14 < zzb.zzb; i14++) {
                        zzan zzb2 = zzb.zzb(i14);
                        zzal zzb3 = zzb2.zzb();
                        String str = zzb2.zzb;
                        if (str == null) {
                            str = "";
                        }
                        zzb3.zzK(i10 + ":" + str);
                        zzanVarArr[i14] = zzb3.zzad();
                    }
                    zzde zzdeVar = new zzde(i10 + ":" + zzb.zzc, zzanVarArr);
                    this.zzd.put(zzdeVar, zzb);
                    zzdeVarArr[i11] = zzdeVar;
                    i13++;
                    i11++;
                }
                i10++;
            } else {
                this.zzf = new zzxr(zzdeVarArr);
                zzvl zzvlVar = this.zze;
                zzvlVar.getClass();
                zzvlVar.zzi(this);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzj(long j7, boolean z8) {
        for (zzvm zzvmVar : this.zzg) {
            zzvmVar.zzj(j7, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() throws IOException {
        int i9 = 0;
        while (true) {
            zzvm[] zzvmVarArr = this.zza;
            if (i9 < zzvmVarArr.length) {
                zzvmVarArr[i9].zzk();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl(zzvl zzvlVar, long j7) {
        this.zze = zzvlVar;
        Collections.addAll(this.zzc, this.zza);
        int i9 = 0;
        while (true) {
            zzvm[] zzvmVarArr = this.zza;
            if (i9 < zzvmVarArr.length) {
                zzvmVarArr[i9].zzl(this, j7);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j7) {
        this.zzh.zzm(j7);
    }

    public final zzvm zzn(int i9) {
        zzvm zzvmVar = this.zza[i9];
        if (zzvmVar instanceof zzxn) {
            return ((zzxn) zzvmVar).zzn();
        }
        return zzvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((zzvm) this.zzc.get(i9)).zzo(zzloVar);
            }
            return false;
        }
        return this.zzh.zzo(zzloVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}

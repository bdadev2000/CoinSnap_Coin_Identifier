package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes2.dex */
final class zzvl implements zzuw, zzuv {
    private final zzuw[] zza;

    @Nullable
    private zzuv zze;

    @Nullable
    private zzwy zzf;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzwp zzh = new zzui(zzgax.zzn(), zzgax.zzn());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzuw[] zzg = new zzuw[0];

    public zzvl(zzuj zzujVar, long[] jArr, zzuw... zzuwVarArr) {
        this.zza = zzuwVarArr;
        for (int i2 = 0; i2 < zzuwVarArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                this.zza[i2] = new zzwv(zzuwVarArr[i2], j2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zza(long j2, zzlw zzlwVar) {
        zzuw[] zzuwVarArr = this.zzg;
        return (zzuwVarArr.length > 0 ? zzuwVarArr[0] : this.zza[0]).zza(j2, zzlwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzd() {
        long j2 = -9223372036854775807L;
        for (zzuw zzuwVar : this.zzg) {
            long zzd = zzuwVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j2 == -9223372036854775807L) {
                    for (zzuw zzuwVar2 : this.zzg) {
                        if (zzuwVar2 == zzuwVar) {
                            break;
                        }
                        if (zzuwVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j2 = zzd;
                } else if (zzd != j2) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j2 != -9223372036854775807L && zzuwVar.zze(j2) != j2) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zze(long j2) {
        long zze = this.zzg[0].zze(j2);
        int i2 = 1;
        while (true) {
            zzuw[] zzuwVarArr = this.zzg;
            if (i2 >= zzuwVarArr.length) {
                return zze;
            }
            if (zzuwVarArr[i2].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwo
    public final /* bridge */ /* synthetic */ void zzf(zzwp zzwpVar) {
        zzuv zzuvVar = this.zze;
        zzuvVar.getClass();
        zzuvVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzg(zzyl[] zzylVarArr, boolean[] zArr, zzwn[] zzwnVarArr, boolean[] zArr2, long j2) {
        int length;
        int length2 = zzylVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = zzylVarArr.length;
            if (i3 >= length) {
                break;
            }
            zzwn zzwnVar = zzwnVarArr[i3];
            Integer num = zzwnVar != null ? (Integer) this.zzb.get(zzwnVar) : null;
            iArr[i3] = num == null ? -1 : num.intValue();
            zzyl zzylVar = zzylVarArr[i3];
            if (zzylVar != null) {
                String str = zzylVar.zze().zzb;
                iArr2[i3] = Integer.parseInt(str.substring(0, str.indexOf(CertificateUtil.DELIMITER)));
            } else {
                iArr2[i3] = -1;
            }
            i3++;
        }
        this.zzb.clear();
        zzwn[] zzwnVarArr2 = new zzwn[length];
        zzwn[] zzwnVarArr3 = new zzwn[length];
        zzyl[] zzylVarArr2 = new zzyl[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.zza.length) {
            for (int i5 = i2; i5 < zzylVarArr.length; i5++) {
                zzwnVarArr3[i5] = iArr[i5] == i4 ? zzwnVarArr[i5] : null;
                if (iArr2[i5] == i4) {
                    zzyl zzylVar2 = zzylVarArr[i5];
                    zzylVar2.getClass();
                    zzcd zzcdVar = (zzcd) this.zzd.get(zzylVar2.zze());
                    zzcdVar.getClass();
                    zzylVarArr2[i5] = new zzvk(zzylVar2, zzcdVar);
                } else {
                    zzylVarArr2[i5] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzyl[] zzylVarArr3 = zzylVarArr2;
            zzwn[] zzwnVarArr4 = zzwnVarArr3;
            long zzg = this.zza[i4].zzg(zzylVarArr2, zArr, zzwnVarArr3, zArr2, j3);
            if (i4 == 0) {
                j3 = zzg;
            } else if (zzg != j3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z2 = false;
            for (int i6 = 0; i6 < zzylVarArr.length; i6++) {
                if (iArr2[i6] == i4) {
                    zzwn zzwnVar2 = zzwnVarArr4[i6];
                    zzwnVar2.getClass();
                    zzwnVarArr2[i6] = zzwnVar2;
                    this.zzb.put(zzwnVar2, Integer.valueOf(i4));
                    z2 = true;
                } else if (iArr[i6] == i4) {
                    zzdi.zzf(zzwnVarArr4[i6] == null);
                }
            }
            if (z2) {
                arrayList2.add(this.zza[i4]);
            }
            i4++;
            arrayList = arrayList2;
            zzylVarArr2 = zzylVarArr3;
            zzwnVarArr3 = zzwnVarArr4;
            i2 = 0;
        }
        int i7 = i2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwnVarArr2, i7, zzwnVarArr, i7, length);
        this.zzg = (zzuw[]) arrayList3.toArray(new zzuw[i7]);
        this.zzh = new zzui(arrayList3, zzgbn.zzb(arrayList3, new zzfxq() { // from class: com.google.android.gms.internal.ads.zzvj
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                return ((zzuw) obj).zzi().zzc();
            }
        }));
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final void zzh(zzuw zzuwVar) {
        this.zzc.remove(zzuwVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i2 = 0;
        for (zzuw zzuwVar2 : this.zza) {
            i2 += zzuwVar2.zzi().zzb;
        }
        zzcd[] zzcdVarArr = new zzcd[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            zzuw[] zzuwVarArr = this.zza;
            if (i3 >= zzuwVarArr.length) {
                this.zzf = new zzwy(zzcdVarArr);
                zzuv zzuvVar = this.zze;
                zzuvVar.getClass();
                zzuvVar.zzh(this);
                return;
            }
            zzwy zzi = zzuwVarArr[i3].zzi();
            int i5 = zzi.zzb;
            int i6 = 0;
            while (i6 < i5) {
                zzcd zzb = zzi.zzb(i6);
                zzaf[] zzafVarArr = new zzaf[zzb.zza];
                for (int i7 = 0; i7 < zzb.zza; i7++) {
                    zzaf zzb2 = zzb.zzb(i7);
                    zzad zzb3 = zzb2.zzb();
                    String str = zzb2.zza;
                    if (str == null) {
                        str = "";
                    }
                    zzb3.zzL(i3 + CertificateUtil.DELIMITER + str);
                    zzafVarArr[i7] = zzb3.zzaf();
                }
                zzcd zzcdVar = new zzcd(i3 + CertificateUtil.DELIMITER + zzb.zzb, zzafVarArr);
                this.zzd.put(zzcdVar, zzb);
                zzcdVarArr[i4] = zzcdVar;
                i6++;
                i4++;
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final zzwy zzi() {
        zzwy zzwyVar = this.zzf;
        zzwyVar.getClass();
        return zzwyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzj(long j2, boolean z2) {
        for (zzuw zzuwVar : this.zzg) {
            zzuwVar.zzj(j2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzk() throws IOException {
        int i2 = 0;
        while (true) {
            zzuw[] zzuwVarArr = this.zza;
            if (i2 >= zzuwVarArr.length) {
                return;
            }
            zzuwVarArr[i2].zzk();
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzl(zzuv zzuvVar, long j2) {
        this.zze = zzuvVar;
        Collections.addAll(this.zzc, this.zza);
        int i2 = 0;
        while (true) {
            zzuw[] zzuwVarArr = this.zza;
            if (i2 >= zzuwVarArr.length) {
                return;
            }
            zzuwVarArr[i2].zzl(this, j2);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final void zzm(long j2) {
        this.zzh.zzm(j2);
    }

    public final zzuw zzn(int i2) {
        zzuw zzuwVar = this.zza[i2];
        return zzuwVar instanceof zzwv ? ((zzwv) zzuwVar).zzn() : zzuwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzo(zzks zzksVar) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(zzksVar);
        }
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzuw) this.zzc.get(i2)).zzo(zzksVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}

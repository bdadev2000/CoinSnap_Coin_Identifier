package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.fragment.app.FragmentTransaction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
final class zzapj implements zzapb {
    final /* synthetic */ zzapk zza;
    private final zzft zzb = new zzft(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzapj(zzapk zzapkVar, int i9) {
        this.zza = zzapkVar;
        this.zze = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza(zzfu zzfuVar) {
        List list;
        SparseArray sparseArray;
        int i9;
        zzadx zzadxVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzgb zzgbVar;
        zzadx zzadxVar2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        zzapn zzapnVar;
        zzgb zzgbVar2;
        int i10;
        if (zzfuVar.zzm() == 2) {
            list = this.zza.zzb;
            zzgb zzgbVar3 = (zzgb) list.get(0);
            if ((zzfuVar.zzm() & 128) != 0) {
                zzfuVar.zzL(1);
                int zzq = zzfuVar.zzq();
                int i11 = 3;
                zzfuVar.zzL(3);
                zzfuVar.zzF(this.zzb, 2);
                this.zzb.zzm(3);
                int i12 = 13;
                this.zza.zzr = this.zzb.zzd(13);
                zzfuVar.zzF(this.zzb, 2);
                int i13 = 4;
                this.zzb.zzm(4);
                int i14 = 12;
                zzfuVar.zzL(this.zzb.zzd(12));
                this.zzc.clear();
                this.zzd.clear();
                int zzb = zzfuVar.zzb();
                while (zzb > 0) {
                    int i15 = 5;
                    zzfuVar.zzF(this.zzb, 5);
                    zzft zzftVar = this.zzb;
                    int zzd = zzftVar.zzd(8);
                    zzftVar.zzm(i11);
                    int zzd2 = this.zzb.zzd(i12);
                    this.zzb.zzm(i13);
                    int zzd3 = this.zzb.zzd(i14);
                    int zzd4 = zzfuVar.zzd();
                    int i16 = zzd4 + zzd3;
                    int i17 = 0;
                    String str = null;
                    ArrayList arrayList = null;
                    int i18 = -1;
                    while (zzfuVar.zzd() < i16) {
                        int zzm = zzfuVar.zzm();
                        int zzd5 = zzfuVar.zzd() + zzfuVar.zzm();
                        if (zzd5 > i16) {
                            break;
                        }
                        if (zzm == i15) {
                            long zzu = zzfuVar.zzu();
                            if (zzu != 1094921523) {
                                if (zzu != 1161904947) {
                                    if (zzu != 1094921524) {
                                        if (zzu == 1212503619) {
                                            i10 = 36;
                                            zzgbVar2 = zzgbVar3;
                                            i18 = i10;
                                        }
                                        zzgbVar2 = zzgbVar3;
                                    }
                                    zzgbVar2 = zzgbVar3;
                                    i18 = 172;
                                }
                                zzgbVar2 = zzgbVar3;
                                i18 = 135;
                            }
                            zzgbVar2 = zzgbVar3;
                            i18 = 129;
                        } else {
                            if (zzm != 106) {
                                if (zzm != 122) {
                                    if (zzm == 127) {
                                        int zzm2 = zzfuVar.zzm();
                                        if (zzm2 != 21) {
                                            if (zzm2 == 14) {
                                                i10 = 136;
                                            } else {
                                                if (zzm2 == 33) {
                                                    i10 = 139;
                                                }
                                                zzgbVar2 = zzgbVar3;
                                            }
                                        }
                                        zzgbVar2 = zzgbVar3;
                                        i18 = 172;
                                    } else if (zzm == 123) {
                                        i10 = 138;
                                    } else if (zzm == 10) {
                                        String trim = zzfuVar.zzA(i11, zzfxs.zzc).trim();
                                        i17 = zzfuVar.zzm();
                                        zzgbVar2 = zzgbVar3;
                                        str = trim;
                                    } else if (zzm == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (zzfuVar.zzd() < zzd5) {
                                            String trim2 = zzfuVar.zzA(i11, zzfxs.zzc).trim();
                                            int zzm3 = zzfuVar.zzm();
                                            zzgb zzgbVar4 = zzgbVar3;
                                            byte[] bArr = new byte[i13];
                                            zzfuVar.zzG(bArr, 0, i13);
                                            arrayList2.add(new zzapl(trim2, zzm3, bArr));
                                            zzgbVar3 = zzgbVar4;
                                            i11 = 3;
                                            i13 = 4;
                                        }
                                        zzgbVar2 = zzgbVar3;
                                        arrayList = arrayList2;
                                        i18 = 89;
                                    } else {
                                        zzgbVar2 = zzgbVar3;
                                        if (zzm == 111) {
                                            i18 = 257;
                                        }
                                    }
                                    zzgbVar2 = zzgbVar3;
                                    i18 = i10;
                                }
                                zzgbVar2 = zzgbVar3;
                                i18 = 135;
                            }
                            zzgbVar2 = zzgbVar3;
                            i18 = 129;
                        }
                        zzfuVar.zzL(zzd5 - zzfuVar.zzd());
                        zzgbVar3 = zzgbVar2;
                        i11 = 3;
                        i13 = 4;
                        i15 = 5;
                    }
                    zzgb zzgbVar5 = zzgbVar3;
                    zzfuVar.zzK(i16);
                    zzapm zzapmVar = new zzapm(i18, str, i17, arrayList, Arrays.copyOfRange(zzfuVar.zzM(), zzd4, i16));
                    if (zzd == 6 || zzd == 5) {
                        zzd = zzapmVar.zza;
                    }
                    zzb -= zzd3 + 5;
                    sparseBooleanArray3 = this.zza.zzh;
                    if (!sparseBooleanArray3.get(zzd2)) {
                        zzapnVar = this.zza.zze;
                        zzapp zza = zzapnVar.zza(zzd, zzapmVar);
                        this.zzd.put(zzd2, zzd2);
                        this.zzc.put(zzd2, zza);
                    }
                    zzgbVar3 = zzgbVar5;
                    i11 = 3;
                    i13 = 4;
                    i14 = 12;
                    i12 = 13;
                }
                zzgb zzgbVar6 = zzgbVar3;
                int size = this.zzd.size();
                int i19 = 0;
                while (i19 < size) {
                    SparseIntArray sparseIntArray = this.zzd;
                    zzapk zzapkVar = this.zza;
                    int keyAt = sparseIntArray.keyAt(i19);
                    int valueAt = sparseIntArray.valueAt(i19);
                    sparseBooleanArray = zzapkVar.zzh;
                    sparseBooleanArray.put(keyAt, true);
                    sparseBooleanArray2 = this.zza.zzi;
                    sparseBooleanArray2.put(valueAt, true);
                    zzapp zzappVar = (zzapp) this.zzc.valueAt(i19);
                    if (zzappVar != null) {
                        zzadxVar2 = this.zza.zzl;
                        zzapo zzapoVar = new zzapo(zzq, keyAt, FragmentTransaction.TRANSIT_EXIT_MASK);
                        zzgbVar = zzgbVar6;
                        zzappVar.zzb(zzgbVar, zzadxVar2, zzapoVar);
                        sparseArray2 = this.zza.zzg;
                        sparseArray2.put(valueAt, zzappVar);
                    } else {
                        zzgbVar = zzgbVar6;
                    }
                    i19++;
                    zzgbVar6 = zzgbVar;
                }
                zzapk zzapkVar2 = this.zza;
                int i20 = this.zze;
                sparseArray = zzapkVar2.zzg;
                sparseArray.remove(i20);
                this.zza.zzm = 0;
                zzapk zzapkVar3 = this.zza;
                i9 = zzapkVar3.zzm;
                if (i9 == 0) {
                    zzadxVar = zzapkVar3.zzl;
                    zzadxVar.zzD();
                    this.zza.zzn = true;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(zzgb zzgbVar, zzadx zzadxVar, zzapo zzapoVar) {
    }
}

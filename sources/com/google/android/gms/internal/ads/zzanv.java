package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
final class zzanv implements zzann {
    final /* synthetic */ zzanw zza;
    private final zzec zzb = new zzec(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzanv(zzanw zzanwVar, int i10) {
        this.zza = zzanwVar;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zza(zzed zzedVar) {
        List list;
        SparseArray sparseArray;
        int i10;
        zzacu zzacuVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzek zzekVar;
        zzacu zzacuVar2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        zzanz zzanzVar;
        zzek zzekVar2;
        int i11;
        if (zzedVar.zzm() == 2) {
            list = this.zza.zzb;
            zzek zzekVar3 = (zzek) list.get(0);
            if ((zzedVar.zzm() & 128) != 0) {
                zzedVar.zzM(1);
                int zzq = zzedVar.zzq();
                int i12 = 3;
                zzedVar.zzM(3);
                zzedVar.zzG(this.zzb, 2);
                this.zzb.zzn(3);
                int i13 = 13;
                this.zza.zzr = this.zzb.zzd(13);
                zzedVar.zzG(this.zzb, 2);
                int i14 = 4;
                this.zzb.zzn(4);
                int i15 = 12;
                zzedVar.zzM(this.zzb.zzd(12));
                this.zzc.clear();
                this.zzd.clear();
                int zzb = zzedVar.zzb();
                while (zzb > 0) {
                    int i16 = 5;
                    zzedVar.zzG(this.zzb, 5);
                    zzec zzecVar = this.zzb;
                    int zzd = zzecVar.zzd(8);
                    zzecVar.zzn(i12);
                    int zzd2 = this.zzb.zzd(i13);
                    this.zzb.zzn(i14);
                    int zzd3 = this.zzb.zzd(i15);
                    int zzd4 = zzedVar.zzd();
                    int i17 = zzd4 + zzd3;
                    int i18 = 0;
                    String str = null;
                    ArrayList arrayList = null;
                    int i19 = -1;
                    while (zzedVar.zzd() < i17) {
                        int zzm = zzedVar.zzm();
                        int zzd5 = zzedVar.zzd() + zzedVar.zzm();
                        if (zzd5 > i17) {
                            break;
                        }
                        if (zzm == i16) {
                            long zzu = zzedVar.zzu();
                            if (zzu != 1094921523) {
                                if (zzu != 1161904947) {
                                    if (zzu != 1094921524) {
                                        if (zzu == 1212503619) {
                                            i11 = 36;
                                            zzekVar2 = zzekVar3;
                                            i19 = i11;
                                        }
                                        zzekVar2 = zzekVar3;
                                    }
                                    zzekVar2 = zzekVar3;
                                    i19 = 172;
                                }
                                zzekVar2 = zzekVar3;
                                i19 = 135;
                            }
                            zzekVar2 = zzekVar3;
                            i19 = 129;
                        } else {
                            if (zzm != 106) {
                                if (zzm != 122) {
                                    if (zzm == 127) {
                                        int zzm2 = zzedVar.zzm();
                                        if (zzm2 != 21) {
                                            if (zzm2 == 14) {
                                                i11 = 136;
                                            } else {
                                                if (zzm2 == 33) {
                                                    i11 = 139;
                                                }
                                                zzekVar2 = zzekVar3;
                                            }
                                        }
                                        zzekVar2 = zzekVar3;
                                        i19 = 172;
                                    } else if (zzm == 123) {
                                        i11 = 138;
                                    } else if (zzm == 10) {
                                        String trim = zzedVar.zzB(i12, StandardCharsets.UTF_8).trim();
                                        i18 = zzedVar.zzm();
                                        zzekVar2 = zzekVar3;
                                        str = trim;
                                    } else if (zzm == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (zzedVar.zzd() < zzd5) {
                                            String trim2 = zzedVar.zzB(i12, StandardCharsets.UTF_8).trim();
                                            int zzm3 = zzedVar.zzm();
                                            zzek zzekVar4 = zzekVar3;
                                            byte[] bArr = new byte[i14];
                                            zzedVar.zzH(bArr, 0, i14);
                                            arrayList2.add(new zzanx(trim2, zzm3, bArr));
                                            zzekVar3 = zzekVar4;
                                            i12 = 3;
                                            i14 = 4;
                                        }
                                        zzekVar2 = zzekVar3;
                                        arrayList = arrayList2;
                                        i19 = 89;
                                    } else {
                                        zzekVar2 = zzekVar3;
                                        if (zzm == 111) {
                                            i19 = 257;
                                        }
                                    }
                                    zzekVar2 = zzekVar3;
                                    i19 = i11;
                                }
                                zzekVar2 = zzekVar3;
                                i19 = 135;
                            }
                            zzekVar2 = zzekVar3;
                            i19 = 129;
                        }
                        zzedVar.zzM(zzd5 - zzedVar.zzd());
                        zzekVar3 = zzekVar2;
                        i12 = 3;
                        i14 = 4;
                        i16 = 5;
                    }
                    zzek zzekVar5 = zzekVar3;
                    zzedVar.zzL(i17);
                    zzany zzanyVar = new zzany(i19, str, i18, arrayList, Arrays.copyOfRange(zzedVar.zzN(), zzd4, i17));
                    if (zzd == 6 || zzd == 5) {
                        zzd = zzanyVar.zza;
                    }
                    zzb -= zzd3 + 5;
                    sparseBooleanArray3 = this.zza.zzh;
                    if (!sparseBooleanArray3.get(zzd2)) {
                        zzanzVar = this.zza.zze;
                        zzaob zzb2 = zzanzVar.zzb(zzd, zzanyVar);
                        this.zzd.put(zzd2, zzd2);
                        this.zzc.put(zzd2, zzb2);
                    }
                    zzekVar3 = zzekVar5;
                    i12 = 3;
                    i14 = 4;
                    i15 = 12;
                    i13 = 13;
                }
                zzek zzekVar6 = zzekVar3;
                int size = this.zzd.size();
                int i20 = 0;
                while (i20 < size) {
                    SparseIntArray sparseIntArray = this.zzd;
                    zzanw zzanwVar = this.zza;
                    int keyAt = sparseIntArray.keyAt(i20);
                    int valueAt = sparseIntArray.valueAt(i20);
                    sparseBooleanArray = zzanwVar.zzh;
                    sparseBooleanArray.put(keyAt, true);
                    sparseBooleanArray2 = this.zza.zzi;
                    sparseBooleanArray2.put(valueAt, true);
                    zzaob zzaobVar = (zzaob) this.zzc.valueAt(i20);
                    if (zzaobVar != null) {
                        zzacuVar2 = this.zza.zzl;
                        zzaoa zzaoaVar = new zzaoa(zzq, keyAt, 8192);
                        zzekVar = zzekVar6;
                        zzaobVar.zzb(zzekVar, zzacuVar2, zzaoaVar);
                        sparseArray2 = this.zza.zzg;
                        sparseArray2.put(valueAt, zzaobVar);
                    } else {
                        zzekVar = zzekVar6;
                    }
                    i20++;
                    zzekVar6 = zzekVar;
                }
                zzanw zzanwVar2 = this.zza;
                int i21 = this.zze;
                sparseArray = zzanwVar2.zzg;
                sparseArray.remove(i21);
                this.zza.zzm = 0;
                zzanw zzanwVar3 = this.zza;
                i10 = zzanwVar3.zzm;
                if (i10 == 0) {
                    zzacuVar = zzanwVar3.zzl;
                    zzacuVar.zzD();
                    this.zza.zzn = true;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzb(zzek zzekVar, zzacu zzacuVar, zzaoa zzaoaVar) {
    }
}

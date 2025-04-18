package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
final class zzaoi implements zzaoa {
    final /* synthetic */ zzaoj zza;
    private final zzej zzb = new zzej(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzaoi(zzaoj zzaojVar, int i2) {
        this.zza = zzaojVar;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zza(zzek zzekVar) {
        List list;
        SparseArray sparseArray;
        int i2;
        zzade zzadeVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzer zzerVar;
        zzade zzadeVar2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        zzaom zzaomVar;
        zzer zzerVar2;
        int i3;
        if (zzekVar.zzm() != 2) {
            return;
        }
        list = this.zza.zzb;
        zzer zzerVar3 = (zzer) list.get(0);
        if ((zzekVar.zzm() & 128) != 0) {
            zzekVar.zzM(1);
            int zzq = zzekVar.zzq();
            int i4 = 3;
            zzekVar.zzM(3);
            zzekVar.zzG(this.zzb, 2);
            this.zzb.zzn(3);
            int i5 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzekVar.zzG(this.zzb, 2);
            int i6 = 4;
            this.zzb.zzn(4);
            int i7 = 12;
            zzekVar.zzM(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int zzb = zzekVar.zzb();
            while (zzb > 0) {
                int i8 = 5;
                zzekVar.zzG(this.zzb, 5);
                zzej zzejVar = this.zzb;
                int zzd = zzejVar.zzd(8);
                zzejVar.zzn(i4);
                int zzd2 = this.zzb.zzd(i5);
                this.zzb.zzn(i6);
                int zzd3 = this.zzb.zzd(i7);
                int zzd4 = zzekVar.zzd();
                int i9 = zzd4 + zzd3;
                int i10 = 0;
                String str = null;
                ArrayList arrayList = null;
                int i11 = -1;
                while (zzekVar.zzd() < i9) {
                    int zzm = zzekVar.zzm();
                    int zzd5 = zzekVar.zzd() + zzekVar.zzm();
                    if (zzd5 > i9) {
                        break;
                    }
                    if (zzm == i8) {
                        long zzu = zzekVar.zzu();
                        if (zzu != 1094921523) {
                            if (zzu != 1161904947) {
                                if (zzu != 1094921524) {
                                    if (zzu == 1212503619) {
                                        i3 = 36;
                                        zzerVar2 = zzerVar3;
                                        i11 = i3;
                                    }
                                    zzerVar2 = zzerVar3;
                                }
                                zzerVar2 = zzerVar3;
                                i11 = 172;
                            }
                            zzerVar2 = zzerVar3;
                            i11 = 135;
                        }
                        zzerVar2 = zzerVar3;
                        i11 = 129;
                    } else {
                        if (zzm != 106) {
                            if (zzm != 122) {
                                if (zzm == 127) {
                                    int zzm2 = zzekVar.zzm();
                                    if (zzm2 != 21) {
                                        if (zzm2 == 14) {
                                            i3 = Opcodes.L2I;
                                        } else {
                                            if (zzm2 == 33) {
                                                i3 = Opcodes.F2I;
                                            }
                                            zzerVar2 = zzerVar3;
                                        }
                                    }
                                    zzerVar2 = zzerVar3;
                                    i11 = 172;
                                } else if (zzm == 123) {
                                    i3 = Opcodes.L2D;
                                } else if (zzm == 10) {
                                    String trim = zzekVar.zzB(i4, StandardCharsets.UTF_8).trim();
                                    i10 = zzekVar.zzm();
                                    zzerVar2 = zzerVar3;
                                    str = trim;
                                } else if (zzm == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzekVar.zzd() < zzd5) {
                                        String trim2 = zzekVar.zzB(i4, StandardCharsets.UTF_8).trim();
                                        int zzm3 = zzekVar.zzm();
                                        zzer zzerVar4 = zzerVar3;
                                        byte[] bArr = new byte[i6];
                                        zzekVar.zzH(bArr, 0, i6);
                                        arrayList2.add(new zzaok(trim2, zzm3, bArr));
                                        zzerVar3 = zzerVar4;
                                        i4 = 3;
                                        i6 = 4;
                                    }
                                    zzerVar2 = zzerVar3;
                                    arrayList = arrayList2;
                                    i11 = 89;
                                } else {
                                    zzerVar2 = zzerVar3;
                                    if (zzm == 111) {
                                        i11 = 257;
                                    }
                                }
                                zzerVar2 = zzerVar3;
                                i11 = i3;
                            }
                            zzerVar2 = zzerVar3;
                            i11 = 135;
                        }
                        zzerVar2 = zzerVar3;
                        i11 = 129;
                    }
                    zzekVar.zzM(zzd5 - zzekVar.zzd());
                    zzerVar3 = zzerVar2;
                    i4 = 3;
                    i6 = 4;
                    i8 = 5;
                }
                zzer zzerVar5 = zzerVar3;
                zzekVar.zzL(i9);
                zzaol zzaolVar = new zzaol(i11, str, i10, arrayList, Arrays.copyOfRange(zzekVar.zzN(), zzd4, i9));
                if (zzd == 6 || zzd == 5) {
                    zzd = zzaolVar.zza;
                }
                zzb -= zzd3 + 5;
                sparseBooleanArray3 = this.zza.zzh;
                if (!sparseBooleanArray3.get(zzd2)) {
                    zzaomVar = this.zza.zze;
                    zzaoo zzb2 = zzaomVar.zzb(zzd, zzaolVar);
                    this.zzd.put(zzd2, zzd2);
                    this.zzc.put(zzd2, zzb2);
                }
                zzerVar3 = zzerVar5;
                i4 = 3;
                i6 = 4;
                i7 = 12;
                i5 = 13;
            }
            zzer zzerVar6 = zzerVar3;
            int size = this.zzd.size();
            int i12 = 0;
            while (i12 < size) {
                SparseIntArray sparseIntArray = this.zzd;
                zzaoj zzaojVar = this.zza;
                int keyAt = sparseIntArray.keyAt(i12);
                int valueAt = sparseIntArray.valueAt(i12);
                sparseBooleanArray = zzaojVar.zzh;
                sparseBooleanArray.put(keyAt, true);
                sparseBooleanArray2 = this.zza.zzi;
                sparseBooleanArray2.put(valueAt, true);
                zzaoo zzaooVar = (zzaoo) this.zzc.valueAt(i12);
                if (zzaooVar != null) {
                    zzadeVar2 = this.zza.zzl;
                    zzaon zzaonVar = new zzaon(zzq, keyAt, 8192);
                    zzerVar = zzerVar6;
                    zzaooVar.zzb(zzerVar, zzadeVar2, zzaonVar);
                    sparseArray2 = this.zza.zzg;
                    sparseArray2.put(valueAt, zzaooVar);
                } else {
                    zzerVar = zzerVar6;
                }
                i12++;
                zzerVar6 = zzerVar;
            }
            zzaoj zzaojVar2 = this.zza;
            int i13 = this.zze;
            sparseArray = zzaojVar2.zzg;
            sparseArray.remove(i13);
            this.zza.zzm = 0;
            zzaoj zzaojVar3 = this.zza;
            i2 = zzaojVar3.zzm;
            if (i2 == 0) {
                zzadeVar = zzaojVar3.zzl;
                zzadeVar.zzD();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zzb(zzer zzerVar, zzade zzadeVar, zzaon zzaonVar) {
    }
}

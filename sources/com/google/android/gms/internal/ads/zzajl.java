package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzajl implements zzadb, zzaea {
    private int zzA;

    @Nullable
    private zzahj zzB;
    private final zzakt zza;
    private final int zzb;
    private final zzek zzc;
    private final zzek zzd;
    private final zzek zze;
    private final zzek zzf;
    private final ArrayDeque zzg;
    private final zzajp zzh;
    private final List zzi;
    private zzgax zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;

    @Nullable
    private zzek zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private zzade zzv;
    private zzajk[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    @Deprecated
    public zzajl() {
        this(zzakt.zza, 16);
    }

    private static int zzj(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzaju zzajuVar, long j2) {
        int zza = zzajuVar.zza(j2);
        return zza == -1 ? zzajuVar.zzb(j2) : zza;
    }

    private static long zzl(zzaju zzajuVar, long j2, long j3) {
        int zzk = zzk(zzajuVar, j2);
        return zzk == -1 ? j3 : Math.min(zzajuVar.zzc[zzk], j3);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    private final void zzn(long j2) throws zzbo {
        zzbk zzbkVar;
        long j3;
        List list;
        zzbk zzbkVar2;
        int i2;
        int i3;
        while (!this.zzg.isEmpty() && ((zzaim) this.zzg.peek()).zza == j2) {
            zzaim zzaimVar = (zzaim) this.zzg.pop();
            if (zzaimVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i4 = this.zzA;
                zzadp zzadpVar = new zzadp();
                zzain zzb = zzaimVar.zzb(1969517665);
                if (zzb != null) {
                    zzbk zzb2 = zzaiz.zzb(zzb);
                    zzadpVar.zzb(zzb2);
                    zzbkVar = zzb2;
                } else {
                    zzbkVar = null;
                }
                zzaim zza = zzaimVar.zza(1835365473);
                zzbk zza2 = zza != null ? zzaiz.zza(zza) : null;
                zzbj[] zzbjVarArr = new zzbj[1];
                zzain zzb3 = zzaimVar.zzb(1836476516);
                zzb3.getClass();
                boolean z2 = i4 == 1;
                zzbjVarArr[0] = zzaiz.zzc(zzb3.zza);
                zzbk zzbkVar3 = new zzbk(-9223372036854775807L, zzbjVarArr);
                zzbk zzbkVar4 = zzbkVar;
                long j4 = -9223372036854775807L;
                List zzd = zzaiz.zzd(zzaimVar, zzadpVar, -9223372036854775807L, null, 1 == (this.zzb & 1), z2, new zzfxq() { // from class: com.google.android.gms.internal.ads.zzajj
                    @Override // com.google.android.gms.internal.ads.zzfxq
                    public final Object apply(Object obj) {
                        return (zzajr) obj;
                    }
                });
                long j5 = -9223372036854775807L;
                int i5 = 0;
                int i6 = -1;
                int i7 = 0;
                while (true) {
                    j3 = 0;
                    if (i7 >= zzd.size()) {
                        break;
                    }
                    zzaju zzajuVar = (zzaju) zzd.get(i7);
                    if (zzajuVar.zzb == 0) {
                        list = zzd;
                    } else {
                        zzajr zzajrVar = zzajuVar.zza;
                        list = zzd;
                        long j6 = zzajrVar.zze;
                        if (j6 == j4) {
                            j6 = zzajuVar.zzh;
                        }
                        long max = Math.max(j5, j6);
                        int i8 = i5 + 1;
                        zzajk zzajkVar = new zzajk(zzajrVar, zzajuVar, this.zzv.zzw(i5, zzajrVar.zzb));
                        int i9 = "audio/true-hd".equals(zzajrVar.zzf.zzn) ? zzajuVar.zze * 16 : zzajuVar.zze + 30;
                        zzad zzb4 = zzajrVar.zzf.zzb();
                        zzb4.zzQ(i9);
                        if (zzajrVar.zzb == 2) {
                            if ((this.zzb & 8) != 0) {
                                zzb4.zzX(zzajrVar.zzf.zzf | (i6 == -1 ? 1 : 2));
                            }
                            if (j6 > 0 && (i3 = zzajuVar.zzb) > 0) {
                                zzb4.zzI(i3 / (((float) j6) / 1000000.0f));
                            }
                        }
                        if (zzajrVar.zzb == 1 && zzadpVar.zza()) {
                            zzb4.zzG(zzadpVar.zza);
                            zzb4.zzH(zzadpVar.zzb);
                        }
                        int i10 = zzajrVar.zzb;
                        zzbk[] zzbkVarArr = new zzbk[3];
                        if (this.zzi.isEmpty()) {
                            i2 = 0;
                            zzbkVar2 = null;
                        } else {
                            zzbkVar2 = new zzbk(this.zzi);
                            i2 = 0;
                        }
                        zzbkVarArr[i2] = zzbkVar2;
                        zzbkVarArr[1] = zzbkVar4;
                        zzbkVarArr[2] = zzbkVar3;
                        int i11 = i6;
                        zzbk zzbkVar5 = new zzbk(-9223372036854775807L, new zzbj[i2]);
                        if (zza2 != null) {
                            for (int i12 = 0; i12 < zza2.zza(); i12++) {
                                zzbj zzb5 = zza2.zzb(i12);
                                if (zzb5 instanceof zzey) {
                                    zzey zzeyVar = (zzey) zzb5;
                                    if (!zzeyVar.zza.equals("com.android.capture.fps")) {
                                        zzbkVar5 = zzbkVar5.zzc(zzeyVar);
                                    } else if (i10 == 2) {
                                        zzbkVar5 = zzbkVar5.zzc(zzeyVar);
                                    }
                                }
                            }
                        }
                        for (int i13 = 0; i13 < 3; i13++) {
                            zzbkVar5 = zzbkVar5.zzd(zzbkVarArr[i13]);
                        }
                        if (zzbkVar5.zza() > 0) {
                            zzb4.zzS(zzbkVar5);
                        }
                        zzajkVar.zzc.zzl(zzb4.zzaf());
                        if (zzajrVar.zzb == 2 && i11 == -1) {
                            i6 = arrayList.size();
                            arrayList.add(zzajkVar);
                            i5 = i8;
                            j5 = max;
                        }
                        i6 = i11;
                        arrayList.add(zzajkVar);
                        i5 = i8;
                        j5 = max;
                    }
                    i7++;
                    zzd = list;
                    j4 = -9223372036854775807L;
                }
                this.zzy = i6;
                this.zzz = j5;
                zzajk[] zzajkVarArr = (zzajk[]) arrayList.toArray(new zzajk[0]);
                this.zzw = zzajkVarArr;
                int length = zzajkVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i14 = 0; i14 < zzajkVarArr.length; i14++) {
                    jArr[i14] = new long[zzajkVarArr[i14].zzb.zzb];
                    jArr2[i14] = zzajkVarArr[i14].zzb.zzf[0];
                }
                int i15 = 0;
                while (i15 < zzajkVarArr.length) {
                    int i16 = -1;
                    long j7 = Long.MAX_VALUE;
                    for (int i17 = 0; i17 < zzajkVarArr.length; i17++) {
                        if (!zArr[i17]) {
                            long j8 = jArr2[i17];
                            if (j8 <= j7) {
                                i16 = i17;
                                j7 = j8;
                            }
                        }
                    }
                    int i18 = iArr[i16];
                    long[] jArr3 = jArr[i16];
                    jArr3[i18] = j3;
                    zzaju zzajuVar2 = zzajkVarArr[i16].zzb;
                    j3 += zzajuVar2.zzd[i18];
                    int i19 = i18 + 1;
                    iArr[i16] = i19;
                    if (i19 < jArr3.length) {
                        jArr2[i16] = zzajuVar2.zzf[i19];
                    } else {
                        zArr[i16] = true;
                        i15++;
                    }
                }
                this.zzx = jArr;
                this.zzv.zzD();
                this.zzv.zzO(this);
                this.zzg.clear();
                this.zzk = 2;
            } else if (!this.zzg.isEmpty()) {
                ((zzaim) this.zzg.peek()).zzc(zzaimVar);
            }
        }
        if (this.zzk != 2) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zzz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x041a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0094 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzadb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadc r33, com.google.android.gms.internal.ads.zzadx r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajl.zzb(com.google.android.gms.internal.ads.zzadc, com.google.android.gms.internal.ads.zzadx):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ zzadb zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(zzade zzadeVar) {
        if ((this.zzb & 16) == 0) {
            zzadeVar = new zzakw(zzadeVar, this.zza);
        }
        this.zzv = zzadeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = true;
        if (j2 == 0) {
            if (this.zzk != 3) {
                zzm();
                return;
            } else {
                this.zzh.zzb();
                this.zzi.clear();
                return;
            }
        }
        for (zzajk zzajkVar : this.zzw) {
            zzaju zzajuVar = zzajkVar.zzb;
            int zza = zzajuVar.zza(j3);
            if (zza == -1) {
                zza = zzajuVar.zzb(j3);
            }
            zzajkVar.zze = zza;
            zzaei zzaeiVar = zzajkVar.zzd;
            if (zzaeiVar != null) {
                zzaeiVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        long j3;
        long j4;
        int zzb;
        zzajk[] zzajkVarArr = this.zzw;
        if (zzajkVarArr.length == 0) {
            zzaeb zzaebVar = zzaeb.zza;
            return new zzady(zzaebVar, zzaebVar);
        }
        int i2 = this.zzy;
        long j5 = -1;
        if (i2 != -1) {
            zzaju zzajuVar = zzajkVarArr[i2].zzb;
            int zzk = zzk(zzajuVar, j2);
            if (zzk == -1) {
                zzaeb zzaebVar2 = zzaeb.zza;
                return new zzady(zzaebVar2, zzaebVar2);
            }
            long j6 = zzajuVar.zzf[zzk];
            j3 = zzajuVar.zzc[zzk];
            if (j6 >= j2 || zzk >= zzajuVar.zzb - 1 || (zzb = zzajuVar.zzb(j2)) == -1 || zzb == zzk) {
                j4 = -9223372036854775807L;
            } else {
                j4 = zzajuVar.zzf[zzb];
                j5 = zzajuVar.zzc[zzb];
            }
            j2 = j6;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            zzajk[] zzajkVarArr2 = this.zzw;
            if (i3 >= zzajkVarArr2.length) {
                break;
            }
            if (i3 != this.zzy) {
                zzaju zzajuVar2 = zzajkVarArr2[i3].zzb;
                long zzl = zzl(zzajuVar2, j2, j3);
                if (j4 != -9223372036854775807L) {
                    j5 = zzl(zzajuVar2, j4, j5);
                }
                j3 = zzl;
            }
            i3++;
        }
        zzaeb zzaebVar3 = new zzaeb(j2, j3);
        return j4 == -9223372036854775807L ? new zzady(zzaebVar3, zzaebVar3) : new zzady(zzaebVar3, new zzaeb(j4, j5));
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        zzaee zzb = zzajq.zzb(zzadcVar, (this.zzb & 2) != 0);
        this.zzj = zzb != null ? zzgax.zzo(zzb) : zzgax.zzn();
        return zzb == null;
    }

    public zzajl(zzakt zzaktVar, int i2) {
        this.zza = zzaktVar;
        this.zzb = i2;
        this.zzj = zzgax.zzn();
        this.zzk = (i2 & 4) != 0 ? 3 : 0;
        this.zzh = new zzajp();
        this.zzi = new ArrayList();
        this.zzf = new zzek(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzek(zzfs.zza);
        this.zzd = new zzek(5);
        this.zze = new zzek();
        this.zzp = -1;
        this.zzv = zzade.zza;
        this.zzw = new zzajk[0];
        this.zzt = true;
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaiy implements zzacr, zzadq {
    private int zzA;

    @Nullable
    private zzagz zzB;
    private final zzakg zza;
    private final int zzb;
    private final zzed zzc;
    private final zzed zzd;
    private final zzed zze;
    private final zzed zzf;
    private final ArrayDeque zzg;
    private final zzajc zzh;
    private final List zzi;
    private zzfzo zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;

    @Nullable
    private zzed zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private zzacu zzv;
    private zzaix[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    @Deprecated
    public zzaiy() {
        this(zzakg.zza, 16);
    }

    private static int zzj(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzajh zzajhVar, long j3) {
        int zza = zzajhVar.zza(j3);
        if (zza == -1) {
            return zzajhVar.zzb(j3);
        }
        return zza;
    }

    private static long zzl(zzajh zzajhVar, long j3, long j10) {
        int zzk = zzk(zzajhVar, j3);
        if (zzk == -1) {
            return j10;
        }
        return Math.min(zzajhVar.zzc[zzk], j10);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    private final void zzn(long j3) throws zzbh {
        zzbd zzbdVar;
        boolean z10;
        zzbd zzbdVar2;
        boolean z11;
        long j10;
        int i10;
        zzadf zzadfVar;
        zzbd zzbdVar3;
        int i11;
        List list;
        zzadf zzadfVar2;
        ArrayList arrayList;
        int i12;
        int i13;
        while (true) {
            int i14 = 2;
            if (this.zzg.isEmpty() || ((zzes) this.zzg.peek()).zza != j3) {
                break;
            }
            zzes zzesVar = (zzes) this.zzg.pop();
            if (zzesVar.zzd == 1836019574) {
                zzes zza = zzesVar.zza(1835365473);
                new ArrayList();
                if (zza != null) {
                    zzbdVar = zzain.zzb(zza);
                } else {
                    zzbdVar = null;
                }
                ArrayList arrayList2 = new ArrayList();
                if (this.zzA == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzadf zzadfVar3 = new zzadf();
                zzet zzb = zzesVar.zzb(1969517665);
                if (zzb != null) {
                    zzbd zzc = zzain.zzc(zzb);
                    zzadfVar3.zzb(zzc);
                    zzbdVar2 = zzc;
                } else {
                    zzbdVar2 = null;
                }
                zzet zzb2 = zzesVar.zzb(1836476516);
                zzb2.getClass();
                zzbd zzbdVar4 = new zzbd(C.TIME_UNSET, zzain.zzd(zzb2.zza));
                if (1 != (this.zzb & 1)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                ArrayList arrayList3 = arrayList2;
                long j11 = -9223372036854775807L;
                List zzf = zzain.zzf(zzesVar, zzadfVar3, C.TIME_UNSET, null, z11, z10, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzaiw
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        return (zzaje) obj;
                    }
                });
                long j12 = -9223372036854775807L;
                int i15 = 0;
                int i16 = 0;
                int i17 = -1;
                while (true) {
                    j10 = 0;
                    if (i15 >= zzf.size()) {
                        break;
                    }
                    zzajh zzajhVar = (zzajh) zzf.get(i15);
                    if (zzajhVar.zzb == 0) {
                        list = zzf;
                        zzadfVar2 = zzadfVar3;
                        arrayList = arrayList3;
                    } else {
                        zzaje zzajeVar = zzajhVar.zza;
                        zzadf zzadfVar4 = zzadfVar3;
                        long j13 = zzajeVar.zze;
                        if (j13 == j11) {
                            j13 = zzajhVar.zzh;
                        }
                        j12 = Math.max(j12, j13);
                        int i18 = i16 + 1;
                        zzaix zzaixVar = new zzaix(zzajeVar, zzajhVar, this.zzv.zzw(i16, zzajeVar.zzb));
                        if (MimeTypes.AUDIO_TRUEHD.equals(zzajeVar.zzf.zzo)) {
                            i10 = zzajhVar.zze * 16;
                        } else {
                            i10 = zzajhVar.zze + 30;
                        }
                        zzab zzb3 = zzajeVar.zzf.zzb();
                        zzb3.zzQ(i10);
                        if (zzajeVar.zzb == i14) {
                            zzad zzadVar = zzajeVar.zzf;
                            int i19 = this.zzb;
                            int i20 = zzadVar.zzf;
                            if ((i19 & 8) != 0) {
                                if (i17 == -1) {
                                    i13 = 1;
                                } else {
                                    i13 = i14;
                                }
                                i20 |= i13;
                            }
                            if (j13 > 0 && (i12 = zzajhVar.zzb) > 0) {
                                zzb3.zzI(i12 / (((float) j13) / 1000000.0f));
                            }
                            zzb3.zzX(i20);
                        }
                        if (zzajeVar.zzb == 1 && zzadfVar4.zza()) {
                            zzadfVar = zzadfVar4;
                            zzb3.zzG(zzadfVar.zza);
                            zzb3.zzH(zzadfVar.zzb);
                        } else {
                            zzadfVar = zzadfVar4;
                        }
                        int i21 = zzajeVar.zzb;
                        zzbd[] zzbdVarArr = new zzbd[3];
                        if (this.zzi.isEmpty()) {
                            i11 = 0;
                            zzbdVar3 = null;
                        } else {
                            zzbdVar3 = new zzbd(this.zzi);
                            i11 = 0;
                        }
                        zzbdVarArr[i11] = zzbdVar3;
                        zzbdVarArr[1] = zzbdVar2;
                        zzbdVarArr[i14] = zzbdVar4;
                        list = zzf;
                        zzadfVar2 = zzadfVar;
                        zzbd zzbdVar5 = new zzbd(C.TIME_UNSET, new zzbc[i11]);
                        if (zzbdVar != null) {
                            for (int i22 = 0; i22 < zzbdVar.zza(); i22++) {
                                zzbc zzb4 = zzbdVar.zzb(i22);
                                if (zzb4 instanceof zzer) {
                                    zzer zzerVar = (zzer) zzb4;
                                    if (zzerVar.zza.equals("com.android.capture.fps")) {
                                        if (i21 == 2) {
                                            zzbdVar5 = zzbdVar5.zzc(zzerVar);
                                        }
                                    } else {
                                        zzbdVar5 = zzbdVar5.zzc(zzerVar);
                                    }
                                }
                            }
                        }
                        for (int i23 = 0; i23 < 3; i23++) {
                            zzbdVar5 = zzbdVar5.zzd(zzbdVarArr[i23]);
                        }
                        if (zzbdVar5.zza() > 0) {
                            zzb3.zzS(zzbdVar5);
                        }
                        zzaixVar.zzc.zzl(zzb3.zzaf());
                        if (zzajeVar.zzb == 2 && i17 == -1) {
                            i17 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzaixVar);
                        i16 = i18;
                    }
                    i15++;
                    arrayList3 = arrayList;
                    zzf = list;
                    zzadfVar3 = zzadfVar2;
                    i14 = 2;
                    j11 = C.TIME_UNSET;
                }
                this.zzy = i17;
                this.zzz = j12;
                zzaix[] zzaixVarArr = (zzaix[]) arrayList3.toArray(new zzaix[0]);
                this.zzw = zzaixVarArr;
                int length = zzaixVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i24 = 0; i24 < zzaixVarArr.length; i24++) {
                    jArr[i24] = new long[zzaixVarArr[i24].zzb.zzb];
                    jArr2[i24] = zzaixVarArr[i24].zzb.zzf[0];
                }
                int i25 = 0;
                while (i25 < zzaixVarArr.length) {
                    long j14 = Long.MAX_VALUE;
                    int i26 = -1;
                    for (int i27 = 0; i27 < zzaixVarArr.length; i27++) {
                        if (!zArr[i27]) {
                            long j15 = jArr2[i27];
                            if (j15 <= j14) {
                                i26 = i27;
                                j14 = j15;
                            }
                        }
                    }
                    int i28 = iArr[i26];
                    long[] jArr3 = jArr[i26];
                    jArr3[i28] = j10;
                    zzajh zzajhVar2 = zzaixVarArr[i26].zzb;
                    j10 += zzajhVar2.zzd[i28];
                    int i29 = i28 + 1;
                    iArr[i26] = i29;
                    if (i29 < jArr3.length) {
                        jArr2[i26] = zzajhVar2.zzf[i29];
                    } else {
                        zArr[i26] = true;
                        i25++;
                    }
                }
                this.zzx = jArr;
                this.zzv.zzD();
                this.zzv.zzO(this);
                this.zzg.clear();
                this.zzk = 2;
            } else if (!this.zzg.isEmpty()) {
                ((zzes) this.zzg.peek()).zzc(zzesVar);
            }
        }
        if (this.zzk != 2) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0420, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:217:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0095 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacs r33, com.google.android.gms.internal.ads.zzadn r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiy.zzb(com.google.android.gms.internal.ads.zzacs, com.google.android.gms.internal.ads.zzadn):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        if ((this.zzb & 16) == 0) {
            zzacuVar = new zzakj(zzacuVar, this.zza);
        }
        this.zzv = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = true;
        if (j3 == 0) {
            if (this.zzk != 3) {
                zzm();
                return;
            } else {
                this.zzh.zzb();
                this.zzi.clear();
                return;
            }
        }
        for (zzaix zzaixVar : this.zzw) {
            zzajh zzajhVar = zzaixVar.zzb;
            int zza = zzajhVar.zza(j10);
            if (zza == -1) {
                zza = zzajhVar.zzb(j10);
            }
            zzaixVar.zze = zza;
            zzady zzadyVar = zzaixVar.zzd;
            if (zzadyVar != null) {
                zzadyVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        long j10;
        long j11;
        int zzb;
        zzaix[] zzaixVarArr = this.zzw;
        if (zzaixVarArr.length == 0) {
            zzadr zzadrVar = zzadr.zza;
            return new zzado(zzadrVar, zzadrVar);
        }
        int i10 = this.zzy;
        long j12 = -1;
        if (i10 != -1) {
            zzajh zzajhVar = zzaixVarArr[i10].zzb;
            int zzk = zzk(zzajhVar, j3);
            if (zzk == -1) {
                zzadr zzadrVar2 = zzadr.zza;
                return new zzado(zzadrVar2, zzadrVar2);
            }
            long j13 = zzajhVar.zzf[zzk];
            j10 = zzajhVar.zzc[zzk];
            if (j13 < j3 && zzk < zzajhVar.zzb - 1 && (zzb = zzajhVar.zzb(j3)) != -1 && zzb != zzk) {
                j11 = zzajhVar.zzf[zzb];
                j12 = zzajhVar.zzc[zzb];
            } else {
                j11 = -9223372036854775807L;
            }
            j3 = j13;
        } else {
            j10 = Long.MAX_VALUE;
            j11 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            zzaix[] zzaixVarArr2 = this.zzw;
            if (i11 >= zzaixVarArr2.length) {
                break;
            }
            if (i11 != this.zzy) {
                zzajh zzajhVar2 = zzaixVarArr2[i11].zzb;
                long zzl = zzl(zzajhVar2, j3, j10);
                if (j11 != C.TIME_UNSET) {
                    j12 = zzl(zzajhVar2, j11, j12);
                }
                j10 = zzl;
            }
            i11++;
        }
        zzadr zzadrVar3 = new zzadr(j3, j10);
        if (j11 == C.TIME_UNSET) {
            return new zzado(zzadrVar3, zzadrVar3);
        }
        return new zzado(zzadrVar3, new zzadr(j11, j12));
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        boolean z10;
        zzfzo zzn;
        if ((this.zzb & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzadu zzb = zzajd.zzb(zzacsVar, z10);
        if (zzb != null) {
            zzn = zzfzo.zzo(zzb);
        } else {
            zzn = zzfzo.zzn();
        }
        this.zzj = zzn;
        if (zzb == null) {
            return true;
        }
        return false;
    }

    public zzaiy(zzakg zzakgVar, int i10) {
        this.zza = zzakgVar;
        this.zzb = i10;
        this.zzj = zzfzo.zzn();
        this.zzk = (i10 & 4) != 0 ? 3 : 0;
        this.zzh = new zzajc();
        this.zzi = new ArrayList();
        this.zzf = new zzed(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzed(zzfp.zza);
        this.zzd = new zzed(5);
        this.zze = new zzed();
        this.zzp = -1;
        this.zzv = zzacu.zza;
        this.zzw = new zzaix[0];
        this.zzt = true;
    }
}

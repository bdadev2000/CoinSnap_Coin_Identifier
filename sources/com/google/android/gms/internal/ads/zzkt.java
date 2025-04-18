package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkt {
    private final zzlw zzc;
    private final zzdm zzd;
    private long zze;
    private int zzf;
    private boolean zzg;

    @Nullable
    private zzkq zzh;

    @Nullable
    private zzkq zzi;

    @Nullable
    private zzkq zzj;
    private int zzk;

    @Nullable
    private Object zzl;
    private long zzm;
    private zziq zzn;
    private final zzjz zzp;
    private final zzbt zza = new zzbt();
    private final zzbu zzb = new zzbu();
    private List zzo = new ArrayList();

    public zzkt(zzlw zzlwVar, zzdm zzdmVar, zzjz zzjzVar, zziq zziqVar) {
        this.zzc = zzlwVar;
        this.zzd = zzdmVar;
        this.zzp = zzjzVar;
        this.zzn = zziqVar;
    }

    private final zzkr zzA(zzbv zzbvVar, Object obj, long j3, long j10, long j11) {
        long j12;
        long j13;
        long j14;
        long j15 = j3;
        zzbvVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j15);
        if (zzc != -1) {
            this.zza.zzj(zzc);
        }
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzk(zzc);
        }
        zzur zzurVar = new zzur(obj, j11, zzc);
        boolean zzG = zzG(zzurVar);
        boolean zzE = zzE(zzbvVar, zzurVar);
        boolean zzD = zzD(zzbvVar, zzurVar, zzG);
        if (zzc != -1) {
            this.zza.zzk(zzc);
        }
        if (zzc != -1) {
            this.zza.zzg(zzc);
            j12 = 0;
        } else {
            j12 = -9223372036854775807L;
        }
        if (j12 != C.TIME_UNSET) {
            j13 = 0;
            j14 = 0;
        } else {
            j13 = j12;
            j14 = this.zza.zzd;
        }
        if (j14 != C.TIME_UNSET && j15 >= j14) {
            j15 = Math.max(0L, j14 - 1);
        }
        return new zzkr(zzurVar, j15, j10, j13, j14, false, zzG, zzE, zzD);
    }

    private static zzur zzB(zzbv zzbvVar, Object obj, long j3, long j10, zzbu zzbuVar, zzbt zzbtVar) {
        zzbvVar.zzn(obj, zzbtVar);
        zzbvVar.zze(zzbtVar.zzc, zzbuVar, 0L);
        zzbvVar.zza(obj);
        zzbtVar.zzb();
        zzbvVar.zzn(obj, zzbtVar);
        int zzd = zzbtVar.zzd(j3);
        if (zzd == -1) {
            return new zzur(obj, j10, zzbtVar.zzc(j3));
        }
        return new zzur(obj, zzd, zzbtVar.zze(zzd), j10);
    }

    private final void zzC() {
        final zzur zzurVar;
        final zzfzl zzfzlVar = new zzfzl();
        for (zzkq zzkqVar = this.zzh; zzkqVar != null; zzkqVar = zzkqVar.zzg()) {
            zzfzlVar.zzf(zzkqVar.zzf.zza);
        }
        zzkq zzkqVar2 = this.zzi;
        if (zzkqVar2 == null) {
            zzurVar = null;
        } else {
            zzurVar = zzkqVar2.zzf.zza;
        }
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzks
            @Override // java.lang.Runnable
            public final void run() {
                zzkt.this.zzk(zzfzlVar, zzurVar);
            }
        });
    }

    private final boolean zzD(zzbv zzbvVar, zzur zzurVar, boolean z10) {
        int zza = zzbvVar.zza(zzurVar.zza);
        if (zzbvVar.zze(zzbvVar.zzd(zza, this.zza, false).zzc, this.zzb, 0L).zzi || zzbvVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) != -1 || !z10) {
            return false;
        }
        return true;
    }

    private final boolean zzE(zzbv zzbvVar, zzur zzurVar) {
        if (!zzG(zzurVar)) {
            return false;
        }
        int i10 = zzbvVar.zzn(zzurVar.zza, this.zza).zzc;
        if (zzbvVar.zze(i10, this.zzb, 0L).zzo != zzbvVar.zza(zzurVar.zza)) {
            return false;
        }
        return true;
    }

    private final boolean zzF(zzbv zzbvVar) {
        zzkq zzkqVar = this.zzh;
        if (zzkqVar == null) {
            return true;
        }
        int zza = zzbvVar.zza(zzkqVar.zzb);
        while (true) {
            zza = zzbvVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzkqVar.getClass();
                if (zzkqVar.zzg() == null || zzkqVar.zzf.zzg) {
                    break;
                }
                zzkqVar = zzkqVar.zzg();
            }
            zzkq zzg = zzkqVar.zzg();
            if (zza == -1 || zzg == null || zzbvVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzkqVar = zzg;
        }
        boolean zzq = zzq(zzkqVar);
        zzkqVar.zzf = zzh(zzbvVar, zzkqVar.zzf);
        if (!zzq) {
            return true;
        }
        return false;
    }

    private static final boolean zzG(zzur zzurVar) {
        return !zzurVar.zzb() && zzurVar.zze == -1;
    }

    public static boolean zzo(long j3, long j10) {
        return j3 == C.TIME_UNSET || j3 == j10;
    }

    private final long zzv(zzbv zzbvVar, Object obj, int i10) {
        zzbvVar.zzn(obj, this.zza);
        this.zza.zzg(i10);
        long j3 = this.zza.zzg.zza(i10).zzg;
        return 0L;
    }

    private final long zzw(Object obj) {
        for (int i10 = 0; i10 < this.zzo.size(); i10++) {
            zzkq zzkqVar = (zzkq) this.zzo.get(i10);
            if (zzkqVar.zzb.equals(obj)) {
                return zzkqVar.zzf.zza.zzd;
            }
        }
        return -1L;
    }

    @Nullable
    private final zzkr zzx(zzbv zzbvVar, zzkq zzkqVar, long j3) {
        long j10;
        zzkr zzkrVar = zzkqVar.zzf;
        long zze = (zzkqVar.zze() + zzkrVar.zze) - j3;
        if (zzkrVar.zzg) {
            long j11 = 0;
            int zzi = zzbvVar.zzi(zzbvVar.zza(zzkrVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i10 = zzbvVar.zzd(zzi, this.zza, true).zzc;
                Object obj = this.zza.zzb;
                obj.getClass();
                long j12 = zzkrVar.zza.zzd;
                if (zzbvVar.zze(i10, this.zzb, 0L).zzn == zzi) {
                    Pair zzm = zzbvVar.zzm(this.zzb, this.zza, i10, C.TIME_UNSET, Math.max(0L, zze));
                    if (zzm != null) {
                        obj = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzkq zzg = zzkqVar.zzg();
                        if (zzg != null && zzg.zzb.equals(obj)) {
                            j12 = zzg.zzf.zza.zzd;
                        } else {
                            j12 = zzw(obj);
                            if (j12 == -1) {
                                j12 = this.zze;
                                this.zze = 1 + j12;
                            }
                        }
                        j10 = longValue;
                        j11 = C.TIME_UNSET;
                    }
                } else {
                    j10 = 0;
                }
                zzur zzB = zzB(zzbvVar, obj, j10, j12, this.zzb, this.zza);
                if (j11 != C.TIME_UNSET && zzkrVar.zzc != C.TIME_UNSET) {
                    zzbvVar.zzn(zzkrVar.zza.zza, this.zza).zzb();
                    int i11 = this.zza.zzg.zzd;
                }
                return zzy(zzbvVar, zzB, j11, j10);
            }
        } else {
            zzur zzurVar = zzkrVar.zza;
            zzbvVar.zzn(zzurVar.zza, this.zza);
            if (zzurVar.zzb()) {
                int i12 = zzurVar.zzb;
                if (this.zza.zza(i12) != -1) {
                    int zza = this.zza.zzg.zza(i12).zza(zzurVar.zzc);
                    if (zza < 0) {
                        return zzz(zzbvVar, zzurVar.zza, i12, zza, zzkrVar.zzc, zzurVar.zzd);
                    }
                    long j13 = zzkrVar.zzc;
                    if (j13 == C.TIME_UNSET) {
                        zzbu zzbuVar = this.zzb;
                        zzbt zzbtVar = this.zza;
                        Pair zzm2 = zzbvVar.zzm(zzbuVar, zzbtVar, zzbtVar.zzc, C.TIME_UNSET, Math.max(0L, zze));
                        if (zzm2 != null) {
                            j13 = ((Long) zzm2.second).longValue();
                        }
                    }
                    zzv(zzbvVar, zzurVar.zza, zzurVar.zzb);
                    return zzA(zzbvVar, zzurVar.zza, Math.max(0L, j13), zzkrVar.zzc, zzurVar.zzd);
                }
            } else {
                int i13 = zzurVar.zze;
                if (i13 != -1) {
                    this.zza.zzj(i13);
                }
                zzbt zzbtVar2 = this.zza;
                int i14 = zzurVar.zze;
                int zze2 = zzbtVar2.zze(i14);
                zzbtVar2.zzk(i14);
                if (zze2 != this.zza.zza(zzurVar.zze)) {
                    return zzz(zzbvVar, zzurVar.zza, zzurVar.zze, zze2, zzkrVar.zze, zzurVar.zzd);
                }
                zzv(zzbvVar, zzurVar.zza, zzurVar.zze);
                return zzA(zzbvVar, zzurVar.zza, 0L, zzkrVar.zze, zzurVar.zzd);
            }
        }
        return null;
    }

    private final zzkr zzy(zzbv zzbvVar, zzur zzurVar, long j3, long j10) {
        zzbvVar.zzn(zzurVar.zza, this.zza);
        if (zzurVar.zzb()) {
            return zzz(zzbvVar, zzurVar.zza, zzurVar.zzb, zzurVar.zzc, j3, zzurVar.zzd);
        }
        return zzA(zzbvVar, zzurVar.zza, j10, j3, zzurVar.zzd);
    }

    private final zzkr zzz(zzbv zzbvVar, Object obj, int i10, int i11, long j3, long j10) {
        long j11;
        zzur zzurVar = new zzur(obj, i10, i11, j10);
        long zzf = zzbvVar.zzn(zzurVar.zza, this.zza).zzf(zzurVar.zzb, zzurVar.zzc);
        if (i11 == this.zza.zze(i10)) {
            this.zza.zzh();
        }
        this.zza.zzk(zzurVar.zzb);
        if (zzf != C.TIME_UNSET && zzf <= 0) {
            j11 = Math.max(0L, (-1) + zzf);
        } else {
            j11 = 0;
        }
        return new zzkr(zzurVar, j11, j3, C.TIME_UNSET, zzf, false, false, false, false);
    }

    @Nullable
    public final zzkq zza() {
        zzkq zzkqVar = this.zzh;
        if (zzkqVar == null) {
            return null;
        }
        if (zzkqVar == this.zzi) {
            this.zzi = zzkqVar.zzg();
        }
        zzkqVar.zzn();
        int i10 = this.zzk - 1;
        this.zzk = i10;
        if (i10 == 0) {
            this.zzj = null;
            zzkq zzkqVar2 = this.zzh;
            this.zzl = zzkqVar2.zzb;
            this.zzm = zzkqVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzC();
        return this.zzh;
    }

    public final zzkq zzb() {
        zzkq zzkqVar = this.zzi;
        zzdb.zzb(zzkqVar);
        this.zzi = zzkqVar.zzg();
        zzC();
        zzkq zzkqVar2 = this.zzi;
        zzdb.zzb(zzkqVar2);
        return zzkqVar2;
    }

    public final zzkq zzc(zzkr zzkrVar) {
        long zze;
        zzkq zzkqVar;
        zzkq zzkqVar2 = this.zzj;
        if (zzkqVar2 == null) {
            zze = 1000000000000L;
        } else {
            zze = (zzkqVar2.zze() + zzkqVar2.zzf.zze) - zzkrVar.zzb;
        }
        int i10 = 0;
        while (true) {
            if (i10 < this.zzo.size()) {
                zzkr zzkrVar2 = ((zzkq) this.zzo.get(i10)).zzf;
                if (zzo(zzkrVar2.zze, zzkrVar.zze) && zzkrVar2.zzb == zzkrVar.zzb && zzkrVar2.zza.equals(zzkrVar.zza)) {
                    zzkqVar = (zzkq) this.zzo.remove(i10);
                    break;
                }
                i10++;
            } else {
                zzkqVar = null;
                break;
            }
        }
        if (zzkqVar == null) {
            zzkqVar = zzkh.zzd(this.zzp.zza, zzkrVar, zze);
        } else {
            zzkqVar.zzf = zzkrVar;
            zzkqVar.zzp(zze);
        }
        zzkq zzkqVar3 = this.zzj;
        if (zzkqVar3 != null) {
            zzkqVar3.zzo(zzkqVar);
        } else {
            this.zzh = zzkqVar;
            this.zzi = zzkqVar;
        }
        this.zzl = null;
        this.zzj = zzkqVar;
        this.zzk++;
        zzC();
        return zzkqVar;
    }

    @Nullable
    public final zzkq zzd() {
        return this.zzj;
    }

    @Nullable
    public final zzkq zze() {
        return this.zzh;
    }

    @Nullable
    public final zzkq zzf() {
        return this.zzi;
    }

    @Nullable
    public final zzkr zzg(long j3, zzlg zzlgVar) {
        zzkq zzkqVar = this.zzj;
        if (zzkqVar == null) {
            return zzy(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzs);
        }
        return zzx(zzlgVar.zza, zzkqVar, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzkr zzh(com.google.android.gms.internal.ads.zzbv r19, com.google.android.gms.internal.ads.zzkr r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzur r3 = r2.zza
            boolean r12 = zzG(r3)
            boolean r13 = r0.zzE(r1, r3)
            boolean r14 = r0.zzD(r1, r3, r12)
            com.google.android.gms.internal.ads.zzur r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzbt r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzbt r9 = r0.zza
            r9.zzg(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzbt r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzf(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzbt r1 = r0.zza
            long r5 = r1.zzd
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzbt r1 = r0.zza
            int r4 = r3.zzb
            r1.zzk(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzbt r4 = r0.zza
            r4.zzk(r1)
        L6e:
            com.google.android.gms.internal.ads.zzkr r15 = new com.google.android.gms.internal.ads.zzkr
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zzh(com.google.android.gms.internal.ads.zzbv, com.google.android.gms.internal.ads.zzkr):com.google.android.gms.internal.ads.zzkr");
    }

    public final zzur zzi(zzbv zzbvVar, Object obj, long j3) {
        long zzw;
        int zza;
        int i10 = zzbvVar.zzn(obj, this.zza).zzc;
        Object obj2 = this.zzl;
        if (obj2 != null && (zza = zzbvVar.zza(obj2)) != -1 && zzbvVar.zzd(zza, this.zza, false).zzc == i10) {
            zzw = this.zzm;
        } else {
            zzkq zzkqVar = this.zzh;
            while (true) {
                if (zzkqVar != null) {
                    if (zzkqVar.zzb.equals(obj)) {
                        zzw = zzkqVar.zzf.zza.zzd;
                        break;
                    }
                    zzkqVar = zzkqVar.zzg();
                } else {
                    zzkq zzkqVar2 = this.zzh;
                    while (true) {
                        if (zzkqVar2 != null) {
                            int zza2 = zzbvVar.zza(zzkqVar2.zzb);
                            if (zza2 != -1 && zzbvVar.zzd(zza2, this.zza, false).zzc == i10) {
                                zzw = zzkqVar2.zzf.zza.zzd;
                                break;
                            }
                            zzkqVar2 = zzkqVar2.zzg();
                        } else {
                            zzw = zzw(obj);
                            if (zzw == -1) {
                                zzw = this.zze;
                                this.zze = 1 + zzw;
                                if (this.zzh == null) {
                                    this.zzl = obj;
                                    this.zzm = zzw;
                                }
                            }
                        }
                    }
                }
            }
        }
        long j10 = zzw;
        zzbvVar.zzn(obj, this.zza);
        zzbvVar.zze(this.zza.zzc, this.zzb, 0L);
        int zza3 = zzbvVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzbu zzbuVar = this.zzb;
            if (zza3 >= zzbuVar.zzn) {
                zzbvVar.zzd(zza3, this.zza, true);
                this.zza.zzb();
                zzbt zzbtVar = this.zza;
                if (zzbtVar.zzd(zzbtVar.zzd) != -1) {
                    obj3 = this.zza.zzb;
                    obj3.getClass();
                }
                zza3--;
            } else {
                return zzB(zzbvVar, obj3, j3, j10, zzbuVar, this.zza);
            }
        }
    }

    public final void zzj() {
        if (this.zzk == 0) {
            return;
        }
        zzkq zzkqVar = this.zzh;
        zzdb.zzb(zzkqVar);
        this.zzl = zzkqVar.zzb;
        this.zzm = zzkqVar.zzf.zza.zzd;
        while (zzkqVar != null) {
            zzkqVar.zzn();
            zzkqVar = zzkqVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzC();
    }

    public final /* synthetic */ void zzk(zzfzl zzfzlVar, zzur zzurVar) {
        this.zzc.zzT(zzfzlVar.zzi(), zzurVar);
    }

    public final void zzl(long j3) {
        zzkq zzkqVar = this.zzj;
        if (zzkqVar != null) {
            zzkqVar.zzm(j3);
        }
    }

    public final void zzm() {
        if (!this.zzo.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.zzo.size(); i10++) {
                ((zzkq) this.zzo.get(i10)).zzn();
            }
            this.zzo = arrayList;
        }
    }

    public final void zzn(zzbv zzbvVar, zziq zziqVar) {
        this.zzn = zziqVar;
        long j3 = zziqVar.zzb;
        zzm();
    }

    public final boolean zzp(zzup zzupVar) {
        zzkq zzkqVar = this.zzj;
        return zzkqVar != null && zzkqVar.zza == zzupVar;
    }

    public final boolean zzq(zzkq zzkqVar) {
        zzdb.zzb(zzkqVar);
        boolean z10 = false;
        if (zzkqVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzkqVar;
        while (zzkqVar.zzg() != null) {
            zzkqVar = zzkqVar.zzg();
            zzkqVar.getClass();
            if (zzkqVar == this.zzi) {
                this.zzi = this.zzh;
                z10 = true;
            }
            zzkqVar.zzn();
            this.zzk--;
        }
        zzkq zzkqVar2 = this.zzj;
        zzkqVar2.getClass();
        zzkqVar2.zzo(null);
        zzC();
        return z10;
    }

    public final boolean zzr() {
        zzkq zzkqVar = this.zzj;
        if (zzkqVar == null) {
            return true;
        }
        if (zzkqVar.zzf.zzi || !zzkqVar.zzr() || this.zzj.zzf.zze == C.TIME_UNSET) {
            return false;
        }
        if (this.zzk < 100) {
            return true;
        }
        return false;
    }

    public final boolean zzs(zzbv zzbvVar, long j3, long j10) {
        zzkr zzkrVar;
        long zze;
        boolean z10;
        zzkq zzkqVar = null;
        for (zzkq zzkqVar2 = this.zzh; zzkqVar2 != null; zzkqVar2 = zzkqVar2.zzg()) {
            zzkr zzkrVar2 = zzkqVar2.zzf;
            if (zzkqVar == null) {
                zzkrVar = zzh(zzbvVar, zzkrVar2);
            } else {
                zzkr zzx = zzx(zzbvVar, zzkqVar, j3);
                if (zzx == null) {
                    if (!zzq(zzkqVar)) {
                        return true;
                    }
                    return false;
                }
                if (zzkrVar2.zzb == zzx.zzb && zzkrVar2.zza.equals(zzx.zza)) {
                    zzkrVar = zzx;
                } else {
                    if (!zzq(zzkqVar)) {
                        return true;
                    }
                    return false;
                }
            }
            zzkqVar2.zzf = zzkrVar.zza(zzkrVar2.zzc);
            if (!zzo(zzkrVar2.zze, zzkrVar.zze)) {
                zzkqVar2.zzq();
                long j11 = zzkrVar.zze;
                if (j11 == C.TIME_UNSET) {
                    zze = Long.MAX_VALUE;
                } else {
                    zze = j11 + zzkqVar2.zze();
                }
                if (zzkqVar2 == this.zzi) {
                    boolean z11 = zzkqVar2.zzf.zzf;
                    if (j10 == Long.MIN_VALUE || j10 >= zze) {
                        z10 = true;
                        if (zzq(zzkqVar2) && !z10) {
                            return true;
                        }
                        return false;
                    }
                }
                z10 = false;
                if (zzq(zzkqVar2)) {
                }
                return false;
            }
            zzkqVar = zzkqVar2;
        }
        return true;
    }

    public final boolean zzt(zzbv zzbvVar, int i10) {
        this.zzf = i10;
        return zzF(zzbvVar);
    }

    public final boolean zzu(zzbv zzbvVar, boolean z10) {
        this.zzg = z10;
        return zzF(zzbvVar);
    }
}

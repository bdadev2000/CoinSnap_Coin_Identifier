package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkx {
    private final zzma zzc;
    private final zzdt zzd;
    private long zze;
    private int zzf;
    private boolean zzg;

    @Nullable
    private zzku zzh;

    @Nullable
    private zzku zzi;

    @Nullable
    private zzku zzj;
    private int zzk;

    @Nullable
    private Object zzl;
    private long zzm;
    private zzit zzn;
    private final zzkc zzp;
    private final zzca zza = new zzca();
    private final zzcb zzb = new zzcb();
    private List zzo = new ArrayList();

    public zzkx(zzma zzmaVar, zzdt zzdtVar, zzkc zzkcVar, zzit zzitVar) {
        this.zzc = zzmaVar;
        this.zzd = zzdtVar;
        this.zzp = zzkcVar;
        this.zzn = zzitVar;
    }

    private final zzkv zzA(zzcc zzccVar, Object obj, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        long j8 = j2;
        zzccVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j8);
        if (zzc != -1) {
            this.zza.zzj(zzc);
        }
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzk(zzc);
        }
        zzuy zzuyVar = new zzuy(obj, j4, zzc);
        boolean zzG = zzG(zzuyVar);
        boolean zzE = zzE(zzccVar, zzuyVar);
        boolean zzD = zzD(zzccVar, zzuyVar, zzG);
        if (zzc != -1) {
            this.zza.zzk(zzc);
        }
        if (zzc != -1) {
            this.zza.zzg(zzc);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L) {
            j6 = 0;
            j7 = 0;
        } else {
            j6 = j5;
            j7 = this.zza.zzd;
        }
        if (j7 != -9223372036854775807L && j8 >= j7) {
            j8 = Math.max(0L, j7 - 1);
        }
        return new zzkv(zzuyVar, j8, j3, j6, j7, false, zzG, zzE, zzD);
    }

    private static zzuy zzB(zzcc zzccVar, Object obj, long j2, long j3, zzcb zzcbVar, zzca zzcaVar) {
        zzccVar.zzn(obj, zzcaVar);
        zzccVar.zze(zzcaVar.zzc, zzcbVar, 0L);
        zzccVar.zza(obj);
        zzcaVar.zzb();
        zzccVar.zzn(obj, zzcaVar);
        int zzd = zzcaVar.zzd(j2);
        return zzd == -1 ? new zzuy(obj, j3, zzcaVar.zzc(j2)) : new zzuy(obj, zzd, zzcaVar.zze(zzd), j3);
    }

    private final void zzC() {
        final zzgau zzgauVar = new zzgau();
        for (zzku zzkuVar = this.zzh; zzkuVar != null; zzkuVar = zzkuVar.zzg()) {
            zzgauVar.zzf(zzkuVar.zzf.zza);
        }
        zzku zzkuVar2 = this.zzi;
        final zzuy zzuyVar = zzkuVar2 == null ? null : zzkuVar2.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
            @Override // java.lang.Runnable
            public final void run() {
                zzkx.this.zzk(zzgauVar, zzuyVar);
            }
        });
    }

    private final boolean zzD(zzcc zzccVar, zzuy zzuyVar, boolean z2) {
        int zza = zzccVar.zza(zzuyVar.zza);
        return !zzccVar.zze(zzccVar.zzd(zza, this.zza, false).zzc, this.zzb, 0L).zzi && zzccVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z2;
    }

    private final boolean zzE(zzcc zzccVar, zzuy zzuyVar) {
        if (zzG(zzuyVar)) {
            return zzccVar.zze(zzccVar.zzn(zzuyVar.zza, this.zza).zzc, this.zzb, 0L).zzo == zzccVar.zza(zzuyVar.zza);
        }
        return false;
    }

    private final boolean zzF(zzcc zzccVar) {
        zzku zzkuVar = this.zzh;
        if (zzkuVar == null) {
            return true;
        }
        int zza = zzccVar.zza(zzkuVar.zzb);
        while (true) {
            zza = zzccVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzkuVar.getClass();
                if (zzkuVar.zzg() == null || zzkuVar.zzf.zzg) {
                    break;
                }
                zzkuVar = zzkuVar.zzg();
            }
            zzku zzg = zzkuVar.zzg();
            if (zza == -1 || zzg == null || zzccVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzkuVar = zzg;
        }
        boolean zzq = zzq(zzkuVar);
        zzkuVar.zzf = zzh(zzccVar, zzkuVar.zzf);
        return !zzq;
    }

    private static final boolean zzG(zzuy zzuyVar) {
        return !zzuyVar.zzb() && zzuyVar.zze == -1;
    }

    public static boolean zzo(long j2, long j3) {
        return j2 == -9223372036854775807L || j2 == j3;
    }

    private final long zzv(zzcc zzccVar, Object obj, int i2) {
        zzccVar.zzn(obj, this.zza);
        this.zza.zzg(i2);
        long j2 = this.zza.zzg.zza(i2).zzg;
        return 0L;
    }

    private final long zzw(Object obj) {
        for (int i2 = 0; i2 < this.zzo.size(); i2++) {
            zzku zzkuVar = (zzku) this.zzo.get(i2);
            if (zzkuVar.zzb.equals(obj)) {
                return zzkuVar.zzf.zza.zzd;
            }
        }
        return -1L;
    }

    @Nullable
    private final zzkv zzx(zzcc zzccVar, zzku zzkuVar, long j2) {
        long j3;
        zzkv zzkvVar = zzkuVar.zzf;
        long zze = (zzkuVar.zze() + zzkvVar.zze) - j2;
        if (zzkvVar.zzg) {
            long j4 = 0;
            int zzi = zzccVar.zzi(zzccVar.zza(zzkvVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i2 = zzccVar.zzd(zzi, this.zza, true).zzc;
                Object obj = this.zza.zzb;
                obj.getClass();
                long j5 = zzkvVar.zza.zzd;
                if (zzccVar.zze(i2, this.zzb, 0L).zzn == zzi) {
                    Pair zzm = zzccVar.zzm(this.zzb, this.zza, i2, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm != null) {
                        obj = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzku zzg = zzkuVar.zzg();
                        if (zzg == null || !zzg.zzb.equals(obj)) {
                            j5 = zzw(obj);
                            if (j5 == -1) {
                                j5 = this.zze;
                                this.zze = 1 + j5;
                            }
                        } else {
                            j5 = zzg.zzf.zza.zzd;
                        }
                        j3 = longValue;
                        j4 = -9223372036854775807L;
                    }
                } else {
                    j3 = 0;
                }
                zzuy zzB = zzB(zzccVar, obj, j3, j5, this.zzb, this.zza);
                if (j4 != -9223372036854775807L && zzkvVar.zzc != -9223372036854775807L) {
                    zzccVar.zzn(zzkvVar.zza.zza, this.zza).zzb();
                    int i3 = this.zza.zzg.zzd;
                }
                return zzy(zzccVar, zzB, j4, j3);
            }
        } else {
            zzuy zzuyVar = zzkvVar.zza;
            zzccVar.zzn(zzuyVar.zza, this.zza);
            if (!zzuyVar.zzb()) {
                int i4 = zzuyVar.zze;
                if (i4 != -1) {
                    this.zza.zzj(i4);
                }
                zzca zzcaVar = this.zza;
                int i5 = zzuyVar.zze;
                int zze2 = zzcaVar.zze(i5);
                zzcaVar.zzk(i5);
                if (zze2 != this.zza.zza(zzuyVar.zze)) {
                    return zzz(zzccVar, zzuyVar.zza, zzuyVar.zze, zze2, zzkvVar.zze, zzuyVar.zzd);
                }
                zzv(zzccVar, zzuyVar.zza, zzuyVar.zze);
                return zzA(zzccVar, zzuyVar.zza, 0L, zzkvVar.zze, zzuyVar.zzd);
            }
            int i6 = zzuyVar.zzb;
            if (this.zza.zza(i6) != -1) {
                int zza = this.zza.zzg.zza(i6).zza(zzuyVar.zzc);
                if (zza < 0) {
                    return zzz(zzccVar, zzuyVar.zza, i6, zza, zzkvVar.zzc, zzuyVar.zzd);
                }
                long j6 = zzkvVar.zzc;
                if (j6 == -9223372036854775807L) {
                    zzcb zzcbVar = this.zzb;
                    zzca zzcaVar2 = this.zza;
                    Pair zzm2 = zzccVar.zzm(zzcbVar, zzcaVar2, zzcaVar2.zzc, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm2 != null) {
                        j6 = ((Long) zzm2.second).longValue();
                    }
                }
                zzv(zzccVar, zzuyVar.zza, zzuyVar.zzb);
                return zzA(zzccVar, zzuyVar.zza, Math.max(0L, j6), zzkvVar.zzc, zzuyVar.zzd);
            }
        }
        return null;
    }

    private final zzkv zzy(zzcc zzccVar, zzuy zzuyVar, long j2, long j3) {
        zzccVar.zzn(zzuyVar.zza, this.zza);
        return zzuyVar.zzb() ? zzz(zzccVar, zzuyVar.zza, zzuyVar.zzb, zzuyVar.zzc, j2, zzuyVar.zzd) : zzA(zzccVar, zzuyVar.zza, j3, j2, zzuyVar.zzd);
    }

    private final zzkv zzz(zzcc zzccVar, Object obj, int i2, int i3, long j2, long j3) {
        zzuy zzuyVar = new zzuy(obj, i2, i3, j3);
        long zzf = zzccVar.zzn(zzuyVar.zza, this.zza).zzf(zzuyVar.zzb, zzuyVar.zzc);
        if (i3 == this.zza.zze(i2)) {
            this.zza.zzh();
        }
        this.zza.zzk(zzuyVar.zzb);
        return new zzkv(zzuyVar, (zzf == -9223372036854775807L || zzf > 0) ? 0L : Math.max(0L, (-1) + zzf), j2, -9223372036854775807L, zzf, false, false, false, false);
    }

    @Nullable
    public final zzku zza() {
        zzku zzkuVar = this.zzh;
        if (zzkuVar == null) {
            return null;
        }
        if (zzkuVar == this.zzi) {
            this.zzi = zzkuVar.zzg();
        }
        zzkuVar.zzn();
        int i2 = this.zzk - 1;
        this.zzk = i2;
        if (i2 == 0) {
            this.zzj = null;
            zzku zzkuVar2 = this.zzh;
            this.zzl = zzkuVar2.zzb;
            this.zzm = zzkuVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzC();
        return this.zzh;
    }

    public final zzku zzb() {
        zzku zzkuVar = this.zzi;
        zzdi.zzb(zzkuVar);
        this.zzi = zzkuVar.zzg();
        zzC();
        zzku zzkuVar2 = this.zzi;
        zzdi.zzb(zzkuVar2);
        return zzkuVar2;
    }

    public final zzku zzc(zzkv zzkvVar) {
        zzku zzkuVar;
        zzku zzkuVar2 = this.zzj;
        long zze = zzkuVar2 == null ? 1000000000000L : (zzkuVar2.zze() + zzkuVar2.zzf.zze) - zzkvVar.zzb;
        int i2 = 0;
        while (true) {
            if (i2 >= this.zzo.size()) {
                zzkuVar = null;
                break;
            }
            zzkv zzkvVar2 = ((zzku) this.zzo.get(i2)).zzf;
            if (zzo(zzkvVar2.zze, zzkvVar.zze) && zzkvVar2.zzb == zzkvVar.zzb && zzkvVar2.zza.equals(zzkvVar.zza)) {
                zzkuVar = (zzku) this.zzo.remove(i2);
                break;
            }
            i2++;
        }
        if (zzkuVar == null) {
            zzkuVar = zzkk.zzd(this.zzp.zza, zzkvVar, zze);
        } else {
            zzkuVar.zzf = zzkvVar;
            zzkuVar.zzp(zze);
        }
        zzku zzkuVar3 = this.zzj;
        if (zzkuVar3 != null) {
            zzkuVar3.zzo(zzkuVar);
        } else {
            this.zzh = zzkuVar;
            this.zzi = zzkuVar;
        }
        this.zzl = null;
        this.zzj = zzkuVar;
        this.zzk++;
        zzC();
        return zzkuVar;
    }

    @Nullable
    public final zzku zzd() {
        return this.zzj;
    }

    @Nullable
    public final zzku zze() {
        return this.zzh;
    }

    @Nullable
    public final zzku zzf() {
        return this.zzi;
    }

    @Nullable
    public final zzkv zzg(long j2, zzlk zzlkVar) {
        zzku zzkuVar = this.zzj;
        return zzkuVar == null ? zzy(zzlkVar.zza, zzlkVar.zzb, zzlkVar.zzc, zzlkVar.zzs) : zzx(zzlkVar.zza, zzkuVar, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzkv zzh(com.google.android.gms.internal.ads.zzcc r19, com.google.android.gms.internal.ads.zzkv r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzuy r3 = r2.zza
            boolean r12 = zzG(r3)
            boolean r13 = r0.zzE(r1, r3)
            boolean r14 = r0.zzD(r1, r3, r12)
            com.google.android.gms.internal.ads.zzuy r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzca r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2f
            int r1 = r3.zze
            if (r1 != r4) goto L31
        L2f:
            r9 = r7
            goto L37
        L31:
            com.google.android.gms.internal.ads.zzca r9 = r0.zza
            r9.zzg(r1)
            r9 = r5
        L37:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4a
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzf(r5, r6)
        L47:
            r7 = r9
            r9 = r5
            goto L56
        L4a:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L51
            r7 = r5
            r9 = r7
            goto L56
        L51:
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            long r5 = r1.zzd
            goto L47
        L56:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L64
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            int r4 = r3.zzb
            r1.zzk(r4)
            goto L6d
        L64:
            int r1 = r3.zze
            if (r1 == r4) goto L6d
            com.google.android.gms.internal.ads.zzca r4 = r0.zza
            r4.zzk(r1)
        L6d:
            com.google.android.gms.internal.ads.zzkv r15 = new com.google.android.gms.internal.ads.zzkv
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkx.zzh(com.google.android.gms.internal.ads.zzcc, com.google.android.gms.internal.ads.zzkv):com.google.android.gms.internal.ads.zzkv");
    }

    public final zzuy zzi(zzcc zzccVar, Object obj, long j2) {
        long zzw;
        int zza;
        int i2 = zzccVar.zzn(obj, this.zza).zzc;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza = zzccVar.zza(obj2)) == -1 || zzccVar.zzd(zza, this.zza, false).zzc != i2) {
            zzku zzkuVar = this.zzh;
            while (true) {
                if (zzkuVar == null) {
                    zzku zzkuVar2 = this.zzh;
                    while (true) {
                        if (zzkuVar2 != null) {
                            int zza2 = zzccVar.zza(zzkuVar2.zzb);
                            if (zza2 != -1 && zzccVar.zzd(zza2, this.zza, false).zzc == i2) {
                                zzw = zzkuVar2.zzf.zza.zzd;
                                break;
                            }
                            zzkuVar2 = zzkuVar2.zzg();
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
                } else {
                    if (zzkuVar.zzb.equals(obj)) {
                        zzw = zzkuVar.zzf.zza.zzd;
                        break;
                    }
                    zzkuVar = zzkuVar.zzg();
                }
            }
        } else {
            zzw = this.zzm;
        }
        long j3 = zzw;
        zzccVar.zzn(obj, this.zza);
        zzccVar.zze(this.zza.zzc, this.zzb, 0L);
        int zza3 = zzccVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcb zzcbVar = this.zzb;
            if (zza3 < zzcbVar.zzn) {
                return zzB(zzccVar, obj3, j2, j3, zzcbVar, this.zza);
            }
            zzccVar.zzd(zza3, this.zza, true);
            this.zza.zzb();
            zzca zzcaVar = this.zza;
            if (zzcaVar.zzd(zzcaVar.zzd) != -1) {
                obj3 = this.zza.zzb;
                obj3.getClass();
            }
            zza3--;
        }
    }

    public final void zzj() {
        if (this.zzk == 0) {
            return;
        }
        zzku zzkuVar = this.zzh;
        zzdi.zzb(zzkuVar);
        this.zzl = zzkuVar.zzb;
        this.zzm = zzkuVar.zzf.zza.zzd;
        while (zzkuVar != null) {
            zzkuVar.zzn();
            zzkuVar = zzkuVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzC();
    }

    public final /* synthetic */ void zzk(zzgau zzgauVar, zzuy zzuyVar) {
        this.zzc.zzS(zzgauVar.zzi(), zzuyVar);
    }

    public final void zzl(long j2) {
        zzku zzkuVar = this.zzj;
        if (zzkuVar != null) {
            zzkuVar.zzm(j2);
        }
    }

    public final void zzm() {
        if (this.zzo.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.zzo.size(); i2++) {
            ((zzku) this.zzo.get(i2)).zzn();
        }
        this.zzo = arrayList;
    }

    public final void zzn(zzcc zzccVar, zzit zzitVar) {
        this.zzn = zzitVar;
        long j2 = zzitVar.zzb;
        zzm();
    }

    public final boolean zzp(zzuw zzuwVar) {
        zzku zzkuVar = this.zzj;
        return zzkuVar != null && zzkuVar.zza == zzuwVar;
    }

    public final boolean zzq(zzku zzkuVar) {
        zzdi.zzb(zzkuVar);
        boolean z2 = false;
        if (zzkuVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzkuVar;
        while (zzkuVar.zzg() != null) {
            zzkuVar = zzkuVar.zzg();
            zzkuVar.getClass();
            if (zzkuVar == this.zzi) {
                this.zzi = this.zzh;
                z2 = true;
            }
            zzkuVar.zzn();
            this.zzk--;
        }
        zzku zzkuVar2 = this.zzj;
        zzkuVar2.getClass();
        zzkuVar2.zzo(null);
        zzC();
        return z2;
    }

    public final boolean zzr() {
        zzku zzkuVar = this.zzj;
        if (zzkuVar == null) {
            return true;
        }
        if (zzkuVar.zzf.zzi || !zzkuVar.zzr() || this.zzj.zzf.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzk < 100;
    }

    public final boolean zzs(zzcc zzccVar, long j2, long j3) {
        zzkv zzkvVar;
        boolean z2;
        zzku zzkuVar = null;
        for (zzku zzkuVar2 = this.zzh; zzkuVar2 != null; zzkuVar2 = zzkuVar2.zzg()) {
            zzkv zzkvVar2 = zzkuVar2.zzf;
            if (zzkuVar == null) {
                zzkvVar = zzh(zzccVar, zzkvVar2);
            } else {
                zzkv zzx = zzx(zzccVar, zzkuVar, j2);
                if (zzx == null) {
                    return !zzq(zzkuVar);
                }
                if (zzkvVar2.zzb != zzx.zzb || !zzkvVar2.zza.equals(zzx.zza)) {
                    return !zzq(zzkuVar);
                }
                zzkvVar = zzx;
            }
            zzkuVar2.zzf = zzkvVar.zza(zzkvVar2.zzc);
            if (!zzo(zzkvVar2.zze, zzkvVar.zze)) {
                zzkuVar2.zzq();
                long j4 = zzkvVar.zze;
                long zze = j4 == -9223372036854775807L ? Long.MAX_VALUE : j4 + zzkuVar2.zze();
                if (zzkuVar2 == this.zzi) {
                    boolean z3 = zzkuVar2.zzf.zzf;
                    if (j3 == Long.MIN_VALUE || j3 >= zze) {
                        z2 = true;
                        return zzq(zzkuVar2) && !z2;
                    }
                }
                z2 = false;
                if (zzq(zzkuVar2)) {
                }
            }
            zzkuVar = zzkuVar2;
        }
        return true;
    }

    public final boolean zzt(zzcc zzccVar, int i2) {
        this.zzf = i2;
        return zzF(zzccVar);
    }

    public final boolean zzu(zzcc zzccVar, boolean z2) {
        this.zzg = z2;
        return zzF(zzccVar);
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlt {
    private final zzcz zza = new zzcz();
    private final zzdb zzb = new zzdb();
    private final zzmx zzc;
    private final zzfb zzd;
    private long zze;
    private int zzf;
    private boolean zzg;

    @Nullable
    private zzlq zzh;

    @Nullable
    private zzlq zzi;

    @Nullable
    private zzlq zzj;
    private int zzk;

    @Nullable
    private Object zzl;
    private long zzm;
    private final zzkz zzn;

    public zzlt(zzmx zzmxVar, zzfb zzfbVar, zzkz zzkzVar) {
        this.zzc = zzmxVar;
        this.zzd = zzfbVar;
        this.zzn = zzkzVar;
    }

    private final boolean zzA(zzdc zzdcVar, zzvo zzvoVar) {
        if (!zzC(zzvoVar)) {
            return false;
        }
        int i9 = zzdcVar.zzn(zzvoVar.zza, this.zza).zzd;
        if (zzdcVar.zze(i9, this.zzb, 0L).zzq != zzdcVar.zza(zzvoVar.zza)) {
            return false;
        }
        return true;
    }

    private final boolean zzB(zzdc zzdcVar) {
        zzlq zzlqVar = this.zzh;
        if (zzlqVar == null) {
            return true;
        }
        int zza = zzdcVar.zza(zzlqVar.zzb);
        while (true) {
            zza = zzdcVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlqVar.getClass();
                if (zzlqVar.zzg() == null || zzlqVar.zzf.zzg) {
                    break;
                }
                zzlqVar = zzlqVar.zzg();
            }
            zzlq zzg = zzlqVar.zzg();
            if (zza == -1 || zzg == null || zzdcVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzlqVar = zzg;
        }
        boolean zzn = zzn(zzlqVar);
        zzlqVar.zzf = zzh(zzdcVar, zzlqVar.zzf);
        if (!zzn) {
            return true;
        }
        return false;
    }

    private static final boolean zzC(zzvo zzvoVar) {
        return !zzvoVar.zzb() && zzvoVar.zze == -1;
    }

    private final long zzs(zzdc zzdcVar, Object obj, int i9) {
        zzdcVar.zzn(obj, this.zza);
        this.zza.zzi(i9);
        this.zza.zzk(i9);
        return 0L;
    }

    @Nullable
    private final zzlr zzt(zzdc zzdcVar, zzlq zzlqVar, long j7) {
        long j9;
        zzlr zzlrVar = zzlqVar.zzf;
        long zze = (zzlqVar.zze() + zzlrVar.zze) - j7;
        if (zzlrVar.zzg) {
            long j10 = 0;
            int zzi = zzdcVar.zzi(zzdcVar.zza(zzlrVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i9 = zzdcVar.zzd(zzi, this.zza, true).zzd;
                Object obj = this.zza.zzc;
                obj.getClass();
                long j11 = zzlrVar.zza.zzd;
                if (zzdcVar.zze(i9, this.zzb, 0L).zzp == zzi) {
                    Pair zzm = zzdcVar.zzm(this.zzb, this.zza, i9, C.TIME_UNSET, Math.max(0L, zze));
                    if (zzm != null) {
                        obj = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzlq zzg = zzlqVar.zzg();
                        if (zzg != null && zzg.zzb.equals(obj)) {
                            j11 = zzg.zzf.zza.zzd;
                        } else {
                            j11 = this.zze;
                            this.zze = 1 + j11;
                        }
                        j9 = longValue;
                        j10 = C.TIME_UNSET;
                    }
                } else {
                    j9 = 0;
                }
                zzvo zzx = zzx(zzdcVar, obj, j9, j11, this.zzb, this.zza);
                if (j10 != C.TIME_UNSET && zzlrVar.zzc != C.TIME_UNSET) {
                    zzdcVar.zzn(zzlrVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzu(zzdcVar, zzx, j10, j9);
            }
        } else {
            zzvo zzvoVar = zzlrVar.zza;
            zzdcVar.zzn(zzvoVar.zza, this.zza);
            if (zzvoVar.zzb()) {
                int i10 = zzvoVar.zzb;
                if (this.zza.zza(i10) != -1) {
                    int zzf = this.zza.zzf(i10, zzvoVar.zzc);
                    if (zzf < 0) {
                        return zzv(zzdcVar, zzvoVar.zza, i10, zzf, zzlrVar.zzc, zzvoVar.zzd);
                    }
                    long j12 = zzlrVar.zzc;
                    if (j12 == C.TIME_UNSET) {
                        zzdb zzdbVar = this.zzb;
                        zzcz zzczVar = this.zza;
                        Pair zzm2 = zzdcVar.zzm(zzdbVar, zzczVar, zzczVar.zzd, C.TIME_UNSET, Math.max(0L, zze));
                        if (zzm2 != null) {
                            j12 = ((Long) zzm2.second).longValue();
                        }
                    }
                    zzs(zzdcVar, zzvoVar.zza, zzvoVar.zzb);
                    return zzw(zzdcVar, zzvoVar.zza, Math.max(0L, j12), zzlrVar.zzc, zzvoVar.zzd);
                }
            } else {
                int i11 = zzvoVar.zze;
                if (i11 != -1) {
                    this.zza.zzm(i11);
                }
                zzcz zzczVar2 = this.zza;
                int i12 = zzvoVar.zze;
                int zze2 = zzczVar2.zze(i12);
                zzczVar2.zzn(i12);
                if (zze2 != this.zza.zza(zzvoVar.zze)) {
                    return zzv(zzdcVar, zzvoVar.zza, zzvoVar.zze, zze2, zzlrVar.zze, zzvoVar.zzd);
                }
                zzs(zzdcVar, zzvoVar.zza, zzvoVar.zze);
                return zzw(zzdcVar, zzvoVar.zza, 0L, zzlrVar.zze, zzvoVar.zzd);
            }
        }
        return null;
    }

    @Nullable
    private final zzlr zzu(zzdc zzdcVar, zzvo zzvoVar, long j7, long j9) {
        zzdcVar.zzn(zzvoVar.zza, this.zza);
        if (zzvoVar.zzb()) {
            return zzv(zzdcVar, zzvoVar.zza, zzvoVar.zzb, zzvoVar.zzc, j7, zzvoVar.zzd);
        }
        return zzw(zzdcVar, zzvoVar.zza, j9, j7, zzvoVar.zzd);
    }

    private final zzlr zzv(zzdc zzdcVar, Object obj, int i9, int i10, long j7, long j9) {
        long j10;
        zzvo zzvoVar = new zzvo(obj, i9, i10, j9);
        long zzh = zzdcVar.zzn(zzvoVar.zza, this.zza).zzh(zzvoVar.zzb, zzvoVar.zzc);
        if (i10 == this.zza.zze(i9)) {
            this.zza.zzj();
        }
        this.zza.zzn(zzvoVar.zzb);
        if (zzh != C.TIME_UNSET && zzh <= 0) {
            j10 = Math.max(0L, (-1) + zzh);
        } else {
            j10 = 0;
        }
        return new zzlr(zzvoVar, j10, j7, C.TIME_UNSET, zzh, false, false, false, false);
    }

    private final zzlr zzw(zzdc zzdcVar, Object obj, long j7, long j9, long j10) {
        long j11;
        long j12;
        long j13;
        long j14 = j7;
        zzdcVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j14);
        if (zzc != -1) {
            this.zza.zzm(zzc);
        }
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzn(zzc);
        }
        zzvo zzvoVar = new zzvo(obj, j10, zzc);
        boolean zzC = zzC(zzvoVar);
        boolean zzA = zzA(zzdcVar, zzvoVar);
        boolean zzz = zzz(zzdcVar, zzvoVar, zzC);
        if (zzc != -1) {
            this.zza.zzn(zzc);
        }
        if (zzc != -1) {
            this.zza.zzi(zzc);
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        if (j11 != C.TIME_UNSET) {
            j12 = 0;
            j13 = 0;
        } else {
            j12 = j11;
            j13 = this.zza.zze;
        }
        if (j13 != C.TIME_UNSET && j14 >= j13) {
            j14 = Math.max(0L, j13 - 1);
        }
        return new zzlr(zzvoVar, j14, j9, j12, j13, false, zzC, zzA, zzz);
    }

    private static zzvo zzx(zzdc zzdcVar, Object obj, long j7, long j9, zzdb zzdbVar, zzcz zzczVar) {
        zzdcVar.zzn(obj, zzczVar);
        zzdcVar.zze(zzczVar.zzd, zzdbVar, 0L);
        zzdcVar.zza(obj);
        zzczVar.zzb();
        zzdcVar.zzn(obj, zzczVar);
        int zzd = zzczVar.zzd(j7);
        if (zzd == -1) {
            return new zzvo(obj, j9, zzczVar.zzc(j7));
        }
        return new zzvo(obj, zzd, zzczVar.zze(zzd), j9);
    }

    private final void zzy() {
        final zzvo zzvoVar;
        final zzgaz zzgazVar = new zzgaz();
        for (zzlq zzlqVar = this.zzh; zzlqVar != null; zzlqVar = zzlqVar.zzg()) {
            zzgazVar.zzf(zzlqVar.zzf.zza);
        }
        zzlq zzlqVar2 = this.zzi;
        if (zzlqVar2 == null) {
            zzvoVar = null;
        } else {
            zzvoVar = zzlqVar2.zzf.zza;
        }
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzls
            @Override // java.lang.Runnable
            public final void run() {
                zzlt.this.zzk(zzgazVar, zzvoVar);
            }
        });
    }

    private final boolean zzz(zzdc zzdcVar, zzvo zzvoVar, boolean z8) {
        int zza = zzdcVar.zza(zzvoVar.zza);
        if (zzdcVar.zze(zzdcVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzj || zzdcVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) != -1 || !z8) {
            return false;
        }
        return true;
    }

    @Nullable
    public final zzlq zza() {
        zzlq zzlqVar = this.zzh;
        if (zzlqVar == null) {
            return null;
        }
        if (zzlqVar == this.zzi) {
            this.zzi = zzlqVar.zzg();
        }
        zzlqVar.zzn();
        int i9 = this.zzk - 1;
        this.zzk = i9;
        if (i9 == 0) {
            this.zzj = null;
            zzlq zzlqVar2 = this.zzh;
            this.zzl = zzlqVar2.zzb;
            this.zzm = zzlqVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzlq zzb() {
        zzlq zzlqVar = this.zzi;
        zzeq.zzb(zzlqVar);
        this.zzi = zzlqVar.zzg();
        zzy();
        zzlq zzlqVar2 = this.zzi;
        zzeq.zzb(zzlqVar2);
        return zzlqVar2;
    }

    public final zzlq zzc(zzlr zzlrVar) {
        long zze;
        zzlq zzlqVar = this.zzj;
        if (zzlqVar == null) {
            zze = 1000000000000L;
        } else {
            zze = (zzlqVar.zze() + zzlqVar.zzf.zze) - zzlrVar.zzb;
        }
        zzlq zzd = zzlh.zzd(this.zzn.zza, zzlrVar, zze);
        zzlq zzlqVar2 = this.zzj;
        if (zzlqVar2 != null) {
            zzlqVar2.zzo(zzd);
        } else {
            this.zzh = zzd;
            this.zzi = zzd;
        }
        this.zzl = null;
        this.zzj = zzd;
        this.zzk++;
        zzy();
        return zzd;
    }

    @Nullable
    public final zzlq zzd() {
        return this.zzj;
    }

    @Nullable
    public final zzlq zze() {
        return this.zzh;
    }

    @Nullable
    public final zzlq zzf() {
        return this.zzi;
    }

    @Nullable
    public final zzlr zzg(long j7, zzmg zzmgVar) {
        zzlq zzlqVar = this.zzj;
        if (zzlqVar == null) {
            return zzu(zzmgVar.zza, zzmgVar.zzb, zzmgVar.zzc, zzmgVar.zzr);
        }
        return zzt(zzmgVar.zza, zzlqVar, j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzlr zzh(com.google.android.gms.internal.ads.zzdc r19, com.google.android.gms.internal.ads.zzlr r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzvo r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzvo r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzcz r5 = r0.zza
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
            com.google.android.gms.internal.ads.zzcz r9 = r0.zza
            r9.zzi(r1)
            r9 = r5
        L37:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4a
            com.google.android.gms.internal.ads.zzcz r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzh(r5, r6)
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
            com.google.android.gms.internal.ads.zzcz r1 = r0.zza
            long r5 = r1.zze
            goto L47
        L56:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L64
            com.google.android.gms.internal.ads.zzcz r1 = r0.zza
            int r4 = r3.zzb
            r1.zzn(r4)
            goto L6d
        L64:
            int r1 = r3.zze
            if (r1 == r4) goto L6d
            com.google.android.gms.internal.ads.zzcz r4 = r0.zza
            r4.zzn(r1)
        L6d:
            com.google.android.gms.internal.ads.zzlr r15 = new com.google.android.gms.internal.ads.zzlr
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlt.zzh(com.google.android.gms.internal.ads.zzdc, com.google.android.gms.internal.ads.zzlr):com.google.android.gms.internal.ads.zzlr");
    }

    public final zzvo zzi(zzdc zzdcVar, Object obj, long j7) {
        long j9;
        int zza;
        int i9 = zzdcVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 != null && (zza = zzdcVar.zza(obj2)) != -1 && zzdcVar.zzd(zza, this.zza, false).zzd == i9) {
            j9 = this.zzm;
        } else {
            zzlq zzlqVar = this.zzh;
            while (true) {
                if (zzlqVar != null) {
                    if (zzlqVar.zzb.equals(obj)) {
                        j9 = zzlqVar.zzf.zza.zzd;
                        break;
                    }
                    zzlqVar = zzlqVar.zzg();
                } else {
                    zzlq zzlqVar2 = this.zzh;
                    while (true) {
                        if (zzlqVar2 != null) {
                            int zza2 = zzdcVar.zza(zzlqVar2.zzb);
                            if (zza2 != -1 && zzdcVar.zzd(zza2, this.zza, false).zzd == i9) {
                                j9 = zzlqVar2.zzf.zza.zzd;
                                break;
                            }
                            zzlqVar2 = zzlqVar2.zzg();
                        } else {
                            j9 = this.zze;
                            this.zze = 1 + j9;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j9;
                            }
                        }
                    }
                }
            }
        }
        long j10 = j9;
        zzdcVar.zzn(obj, this.zza);
        zzdcVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzdcVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzdb zzdbVar = this.zzb;
            if (zza3 >= zzdbVar.zzp) {
                zzdcVar.zzd(zza3, this.zza, true);
                this.zza.zzb();
                zzcz zzczVar = this.zza;
                if (zzczVar.zzd(zzczVar.zze) != -1) {
                    obj3 = this.zza.zzc;
                    obj3.getClass();
                }
                zza3--;
            } else {
                return zzx(zzdcVar, obj3, j7, j10, zzdbVar, this.zza);
            }
        }
    }

    public final void zzj() {
        if (this.zzk == 0) {
            return;
        }
        zzlq zzlqVar = this.zzh;
        zzeq.zzb(zzlqVar);
        this.zzl = zzlqVar.zzb;
        this.zzm = zzlqVar.zzf.zza.zzd;
        while (zzlqVar != null) {
            zzlqVar.zzn();
            zzlqVar = zzlqVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    public final /* synthetic */ void zzk(zzgaz zzgazVar, zzvo zzvoVar) {
        this.zzc.zzS(zzgazVar.zzi(), zzvoVar);
    }

    public final void zzl(long j7) {
        zzlq zzlqVar = this.zzj;
        if (zzlqVar != null) {
            zzlqVar.zzm(j7);
        }
    }

    public final boolean zzm(zzvm zzvmVar) {
        zzlq zzlqVar = this.zzj;
        return zzlqVar != null && zzlqVar.zza == zzvmVar;
    }

    public final boolean zzn(zzlq zzlqVar) {
        zzeq.zzb(zzlqVar);
        boolean z8 = false;
        if (zzlqVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzlqVar;
        while (zzlqVar.zzg() != null) {
            zzlqVar = zzlqVar.zzg();
            zzlqVar.getClass();
            if (zzlqVar == this.zzi) {
                this.zzi = this.zzh;
                z8 = true;
            }
            zzlqVar.zzn();
            this.zzk--;
        }
        zzlq zzlqVar2 = this.zzj;
        zzlqVar2.getClass();
        zzlqVar2.zzo(null);
        zzy();
        return z8;
    }

    public final boolean zzo() {
        zzlq zzlqVar = this.zzj;
        if (zzlqVar == null) {
            return true;
        }
        if (zzlqVar.zzf.zzi || !zzlqVar.zzr() || this.zzj.zzf.zze == C.TIME_UNSET) {
            return false;
        }
        if (this.zzk < 100) {
            return true;
        }
        return false;
    }

    public final boolean zzp(zzdc zzdcVar, long j7, long j9) {
        zzlr zzlrVar;
        long zze;
        boolean z8;
        zzlq zzlqVar = null;
        for (zzlq zzlqVar2 = this.zzh; zzlqVar2 != null; zzlqVar2 = zzlqVar2.zzg()) {
            zzlr zzlrVar2 = zzlqVar2.zzf;
            if (zzlqVar == null) {
                zzlrVar = zzh(zzdcVar, zzlrVar2);
            } else {
                zzlr zzt = zzt(zzdcVar, zzlqVar, j7);
                if (zzt == null) {
                    if (!zzn(zzlqVar)) {
                        return true;
                    }
                    return false;
                }
                if (zzlrVar2.zzb == zzt.zzb && zzlrVar2.zza.equals(zzt.zza)) {
                    zzlrVar = zzt;
                } else {
                    if (!zzn(zzlqVar)) {
                        return true;
                    }
                    return false;
                }
            }
            zzlqVar2.zzf = zzlrVar.zza(zzlrVar2.zzc);
            long j10 = zzlrVar2.zze;
            long j11 = zzlrVar.zze;
            if (j10 != C.TIME_UNSET && j10 != j11) {
                zzlqVar2.zzq();
                long j12 = zzlrVar.zze;
                if (j12 == C.TIME_UNSET) {
                    zze = Long.MAX_VALUE;
                } else {
                    zze = j12 + zzlqVar2.zze();
                }
                if (zzlqVar2 == this.zzi) {
                    boolean z9 = zzlqVar2.zzf.zzf;
                    if (j9 == Long.MIN_VALUE || j9 >= zze) {
                        z8 = true;
                        if (zzn(zzlqVar2) && !z8) {
                            return true;
                        }
                        return false;
                    }
                }
                z8 = false;
                if (zzn(zzlqVar2)) {
                }
                return false;
            }
            zzlqVar = zzlqVar2;
        }
        return true;
    }

    public final boolean zzq(zzdc zzdcVar, int i9) {
        this.zzf = i9;
        return zzB(zzdcVar);
    }

    public final boolean zzr(zzdc zzdcVar, boolean z8) {
        this.zzg = z8;
        return zzB(zzdcVar);
    }
}

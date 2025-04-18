package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzjz extends zzj implements zziu {
    public static final /* synthetic */ int zzd = 0;
    private boolean zzA;
    private zzlw zzB;
    private zzit zzC;
    private zzbt zzD;
    private zzbh zzE;

    @Nullable
    private Object zzF;

    @Nullable
    private Surface zzG;
    private int zzH;
    private zzel zzI;
    private int zzJ;
    private zzh zzK;
    private float zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private zzbh zzQ;
    private zzlk zzR;
    private int zzS;
    private long zzT;
    private final zzjg zzU;
    private zzwq zzV;
    final zzys zzb;
    final zzbt zzc;
    private final zzdm zze;
    private final Context zzf;
    private final zzbw zzg;
    private final zzlr[] zzh;
    private final zzyr zzi;
    private final zzdt zzj;
    private final zzkk zzk;
    private final zzdz zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzca zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzma zzq;
    private final Looper zzr;
    private final zzyz zzs;
    private final zzdj zzt;
    private final zzjv zzu;
    private final zzjx zzv;
    private final zzhy zzw;
    private final long zzx;
    private int zzy;
    private int zzz;

    static {
        zzbd.zzb("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public zzjz(zzis zzisVar, @Nullable zzbw zzbwVar) {
        zzdm zzdmVar = new zzdm(zzdj.zza);
        this.zze = zzdmVar;
        try {
            zzea.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + zzeu.zze + "]");
            Context applicationContext = zzisVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            zzma zzmaVar = (zzma) zzisVar.zzh.apply(zzisVar.zzb);
            this.zzq = zzmaVar;
            this.zzP = zzisVar.zzj;
            this.zzK = zzisVar.zzk;
            this.zzH = zzisVar.zzl;
            this.zzM = false;
            this.zzx = zzisVar.zzp;
            zzjv zzjvVar = new zzjv(this, null);
            this.zzu = zzjvVar;
            zzjx zzjxVar = new zzjx(null);
            this.zzv = zzjxVar;
            Handler handler = new Handler(zzisVar.zzi);
            zzlr[] zza = ((zzil) zzisVar.zzc).zza.zza(handler, zzjvVar, zzjvVar, zzjvVar, zzjvVar);
            this.zzh = zza;
            int length = zza.length;
            zzyr zzyrVar = (zzyr) zzisVar.zze.zza();
            this.zzi = zzyrVar;
            zzis.zza(((zzim) zzisVar.zzd).zza);
            zzzd zzh = zzzd.zzh(((zzip) zzisVar.zzg).zza);
            this.zzs = zzh;
            this.zzp = zzisVar.zzm;
            this.zzB = zzisVar.zzn;
            Looper looper = zzisVar.zzi;
            this.zzr = looper;
            zzdj zzdjVar = zzisVar.zzb;
            this.zzt = zzdjVar;
            this.zzg = zzbwVar;
            zzdz zzdzVar = new zzdz(looper, zzdjVar, new zzdx(this) { // from class: com.google.android.gms.internal.ads.zzjf
                @Override // com.google.android.gms.internal.ads.zzdx
                public final void zza(Object obj, zzab zzabVar) {
                }
            });
            this.zzl = zzdzVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzV = new zzwq(0);
            this.zzC = zzit.zza;
            int length2 = zza.length;
            zzys zzysVar = new zzys(new zzlv[2], new zzyl[2], zzck.zza, null);
            this.zzb = zzysVar;
            this.zzn = new zzca();
            zzbr zzbrVar = new zzbr();
            zzbrVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzyrVar.zzn();
            zzbrVar.zzd(29, true);
            zzbrVar.zzd(23, false);
            zzbrVar.zzd(25, false);
            zzbrVar.zzd(33, false);
            zzbrVar.zzd(26, false);
            zzbrVar.zzd(34, false);
            zzbt zze = zzbrVar.zze();
            this.zzc = zze;
            zzbr zzbrVar2 = new zzbr();
            zzbrVar2.zzb(zze);
            zzbrVar2.zza(4);
            zzbrVar2.zza(10);
            this.zzD = zzbrVar2.zze();
            this.zzj = zzdjVar.zzd(looper, null);
            zzjg zzjgVar = new zzjg(this);
            this.zzU = zzjgVar;
            this.zzR = zzlk.zzg(zzysVar);
            zzmaVar.zzR(zzbwVar, looper);
            this.zzk = new zzkk(zza, zzyrVar, zzysVar, (zzko) zzisVar.zzf.zza(), zzh, 0, false, zzmaVar, this.zzB, zzisVar.zzt, zzisVar.zzo, false, false, looper, zzdjVar, zzjgVar, zzeu.zza < 31 ? new zzom(zzisVar.zzs) : zzjq.zza(applicationContext, this, zzisVar.zzq, zzisVar.zzs), null, this.zzC);
            this.zzL = 1.0f;
            zzbh zzbhVar = zzbh.zza;
            this.zzE = zzbhVar;
            this.zzQ = zzbhVar;
            this.zzS = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            this.zzJ = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i2 = zzdc.zza;
            this.zzN = true;
            zzmaVar.getClass();
            zzdzVar.zzb(zzmaVar);
            zzh.zzf(new Handler(looper), zzmaVar);
            copyOnWriteArraySet.add(zzjvVar);
            new zzhu(zzisVar.zza, handler, zzjvVar);
            this.zzw = new zzhy(zzisVar.zza, handler, zzjvVar);
            zzisVar.zza.getApplicationContext();
            zzisVar.zza.getApplicationContext();
            new zzs(0).zza();
            zzcp zzcpVar = zzcp.zza;
            this.zzI = zzel.zza;
            zzyrVar.zzk(this.zzK);
            zzab(1, 10, Integer.valueOf(this.zzJ));
            zzab(2, 10, Integer.valueOf(this.zzJ));
            zzab(1, 3, this.zzK);
            zzab(2, 4, Integer.valueOf(this.zzH));
            zzab(2, 5, 0);
            zzab(1, 9, Boolean.valueOf(this.zzM));
            zzab(2, 7, zzjxVar);
            zzab(6, 8, zzjxVar);
            zzab(-1, 16, Integer.valueOf(this.zzP));
            zzdmVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzK(zzjz zzjzVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjzVar.zzad(surface);
        zzjzVar.zzG = surface;
    }

    private final int zzR(zzlk zzlkVar) {
        return zzlkVar.zza.zzo() ? this.zzS : zzlkVar.zza.zzn(zzlkVar.zzb.zza, this.zzn).zzc;
    }

    public static int zzS(int i2) {
        return i2 == -1 ? 2 : 1;
    }

    private final long zzT(zzlk zzlkVar) {
        if (!zzlkVar.zzb.zzb()) {
            return zzeu.zzu(zzU(zzlkVar));
        }
        zzlkVar.zza.zzn(zzlkVar.zzb.zza, this.zzn);
        long j2 = zzlkVar.zzc;
        if (j2 != -9223372036854775807L) {
            return zzeu.zzu(j2) + zzeu.zzu(0L);
        }
        long j3 = zzlkVar.zza.zze(zzR(zzlkVar), this.zza, 0L).zzl;
        return zzeu.zzu(0L);
    }

    private final long zzU(zzlk zzlkVar) {
        if (zzlkVar.zza.zzo()) {
            return zzeu.zzr(this.zzT);
        }
        long j2 = zzlkVar.zzs;
        if (zzlkVar.zzb.zzb()) {
            return j2;
        }
        zzW(zzlkVar.zza, zzlkVar.zzb, j2);
        return j2;
    }

    private static long zzV(zzlk zzlkVar) {
        zzcb zzcbVar = new zzcb();
        zzca zzcaVar = new zzca();
        zzlkVar.zza.zzn(zzlkVar.zzb.zza, zzcaVar);
        long j2 = zzlkVar.zzc;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        long j3 = zzlkVar.zza.zze(zzcaVar.zzc, zzcbVar, 0L).zzl;
        return 0L;
    }

    private final long zzW(zzcc zzccVar, zzuy zzuyVar, long j2) {
        zzccVar.zzn(zzuyVar.zza, this.zzn);
        return j2;
    }

    @Nullable
    private final Pair zzX(zzcc zzccVar, int i2, long j2) {
        if (zzccVar.zzo()) {
            this.zzS = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.zzT = j2;
            return null;
        }
        if (i2 == -1 || i2 >= zzccVar.zzc()) {
            i2 = zzccVar.zzg(false);
            long j3 = zzccVar.zze(i2, this.zza, 0L).zzl;
            j2 = zzeu.zzu(0L);
        }
        return zzccVar.zzl(this.zza, this.zzn, i2, zzeu.zzr(j2));
    }

    private final zzlk zzY(zzlk zzlkVar, zzcc zzccVar, @Nullable Pair pair) {
        zzdi.zzd(zzccVar.zzo() || pair != null);
        zzcc zzccVar2 = zzlkVar.zza;
        long zzT = zzT(zzlkVar);
        zzlk zzf = zzlkVar.zzf(zzccVar);
        if (zzccVar.zzo()) {
            zzuy zzh = zzlk.zzh();
            long zzr = zzeu.zzr(this.zzT);
            zzlk zza = zzf.zzb(zzh, zzr, zzr, zzr, 0L, zzwy.zza, this.zzb, zzgax.zzn()).zza(zzh);
            zza.zzq = zza.zzs;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i2 = zzeu.zza;
        boolean z2 = !obj.equals(pair.first);
        zzuy zzuyVar = z2 ? new zzuy(pair.first, -1L) : zzf.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzr2 = zzeu.zzr(zzT);
        if (!zzccVar2.zzo()) {
            zzccVar2.zzn(obj, this.zzn);
        }
        if (z2 || longValue < zzr2) {
            zzdi.zzf(!zzuyVar.zzb());
            zzlk zza2 = zzf.zzb(zzuyVar, longValue, longValue, longValue, 0L, z2 ? zzwy.zza : zzf.zzh, z2 ? this.zzb : zzf.zzi, z2 ? zzgax.zzn() : zzf.zzj).zza(zzuyVar);
            zza2.zzq = longValue;
            return zza2;
        }
        if (longValue != zzr2) {
            zzdi.zzf(!zzuyVar.zzb());
            long max = Math.max(0L, zzf.zzr - (longValue - zzr2));
            long j2 = zzf.zzq;
            if (zzf.zzk.equals(zzf.zzb)) {
                j2 = longValue + max;
            }
            zzlk zzb = zzf.zzb(zzuyVar, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzq = j2;
            return zzb;
        }
        int zza3 = zzccVar.zza(zzf.zzk.zza);
        if (zza3 != -1 && zzccVar.zzd(zza3, this.zzn, false).zzc == zzccVar.zzn(zzuyVar.zza, this.zzn).zzc) {
            return zzf;
        }
        zzccVar.zzn(zzuyVar.zza, this.zzn);
        long zzf2 = zzuyVar.zzb() ? this.zzn.zzf(zzuyVar.zzb, zzuyVar.zzc) : this.zzn.zzd;
        zzlk zza4 = zzf.zzb(zzuyVar, zzf.zzs, zzf.zzs, zzf.zzd, zzf2 - zzf.zzs, zzf.zzh, zzf.zzi, zzf.zzj).zza(zzuyVar);
        zza4.zzq = zzf2;
        return zza4;
    }

    private final zzln zzZ(zzlm zzlmVar) {
        int zzR = zzR(this.zzR);
        zzcc zzccVar = this.zzR.zza;
        if (zzR == -1) {
            zzR = 0;
        }
        zzdj zzdjVar = this.zzt;
        zzkk zzkkVar = this.zzk;
        return new zzln(zzkkVar, zzlmVar, zzccVar, zzR, zzdjVar, zzkkVar.zzc());
    }

    public final void zzaa(final int i2, final int i3) {
        if (i2 == this.zzI.zzb() && i3 == this.zzI.zza()) {
            return;
        }
        this.zzI = new zzel(i2, i3);
        zzdz zzdzVar = this.zzl;
        zzdzVar.zzd(24, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjb
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i4 = zzjz.zzd;
                ((zzbu) obj).zzo(i2, i3);
            }
        });
        zzdzVar.zzc();
        zzab(2, 14, new zzel(i2, i3));
    }

    private final void zzab(int i2, int i3, @Nullable Object obj) {
        zzlr[] zzlrVarArr = this.zzh;
        int length = zzlrVarArr.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzlr zzlrVar = zzlrVarArr[i4];
            if (i2 == -1 || zzlrVar.zzb() == i2) {
                zzln zzZ = zzZ(zzlrVar);
                zzZ.zzf(i3);
                zzZ.zze(obj);
                zzZ.zzd();
            }
        }
    }

    public final void zzac() {
        zzab(1, 2, Float.valueOf(this.zzL * this.zzw.zza()));
    }

    public final void zzad(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        zzlr[] zzlrVarArr = this.zzh;
        int length = zzlrVarArr.length;
        boolean z2 = false;
        for (int i2 = 0; i2 < 2; i2++) {
            zzlr zzlrVar = zzlrVarArr[i2];
            if (zzlrVar.zzb() == 2) {
                zzln zzZ = zzZ(zzlrVar);
                zzZ.zzf(1);
                zzZ.zze(obj);
                zzZ.zzd();
                arrayList.add(zzZ);
            }
        }
        Object obj2 = this.zzF;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzln) it.next()).zzi(this.zzx);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z2 = true;
            }
            Object obj3 = this.zzF;
            Surface surface = this.zzG;
            if (obj3 == surface) {
                surface.release();
                this.zzG = null;
            }
        }
        this.zzF = obj;
        if (z2) {
            zzae(zzij.zzd(new zzkl(3), 1003));
        }
    }

    private final void zzae(@Nullable zzij zzijVar) {
        zzlk zzlkVar = this.zzR;
        zzlk zza = zzlkVar.zza(zzlkVar.zzb);
        zza.zzq = zza.zzs;
        zza.zzr = 0L;
        zzlk zze = zza.zze(1);
        if (zzijVar != null) {
            zze = zze.zzd(zzijVar);
        }
        this.zzy++;
        this.zzk.zzn();
        zzag(zze, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void zzaf(boolean z2, int i2, int i3) {
        boolean z3 = z2 && i2 != -1;
        int i4 = i2 == 0 ? 1 : 0;
        zzlk zzlkVar = this.zzR;
        if (zzlkVar.zzl == z3 && zzlkVar.zzn == i4 && zzlkVar.zzm == i3) {
            return;
        }
        this.zzy++;
        zzlk zzc = zzlkVar.zzc(z3, i3, i4);
        this.zzk.zzm(z3, i3, i4);
        zzag(zzc, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x047c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0486 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0492 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00eb  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzag(final com.google.android.gms.internal.ads.zzlk r43, final int r44, boolean r45, int r46, long r47, int r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjz.zzag(com.google.android.gms.internal.ads.zzlk, int, boolean, int, long, int, boolean):void");
    }

    private final void zzah() {
        int zzf = zzf();
        if (zzf == 2 || zzf == 3) {
            zzai();
            boolean z2 = this.zzR.zzp;
            zzu();
            zzu();
        }
    }

    private final void zzai() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzr.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzr.getThread().getName());
            if (this.zzN) {
                throw new IllegalStateException(format);
            }
            zzea.zzg("ExoPlayerImpl", format, this.zzO ? null : new IllegalStateException());
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzA(zzmd zzmdVar) {
        zzai();
        this.zzq.zzQ(zzmdVar);
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzB(zzva zzvaVar) {
        zzai();
        List singletonList = Collections.singletonList(zzvaVar);
        zzai();
        zzai();
        zzR(this.zzR);
        zzk();
        this.zzy++;
        boolean z2 = false;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                this.zzo.remove(i2);
            }
            this.zzV = this.zzV.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < singletonList.size(); i3++) {
            zzlh zzlhVar = new zzlh((zzva) singletonList.get(i3), this.zzp);
            arrayList.add(zzlhVar);
            this.zzo.add(i3, new zzjy(zzlhVar.zzb, zzlhVar.zza));
        }
        this.zzV = this.zzV.zzg(0, arrayList.size());
        zzlp zzlpVar = new zzlp(this.zzo, this.zzV);
        if (!zzlpVar.zzo() && zzlpVar.zzc() < 0) {
            throw new zzaj(zzlpVar, -1, -9223372036854775807L);
        }
        int zzg = zzlpVar.zzg(false);
        zzlk zzY = zzY(this.zzR, zzlpVar, zzX(zzlpVar, zzg, -9223372036854775807L));
        int i4 = zzY.zze;
        if (zzg != -1 && i4 != 1) {
            i4 = 4;
            if (!zzlpVar.zzo() && zzg < zzlpVar.zzc()) {
                i4 = 2;
            }
        }
        zzlk zze = zzY.zze(i4);
        this.zzk.zzp(arrayList, zzg, zzeu.zzr(-9223372036854775807L), this.zzV);
        if (!this.zzR.zzb.zza.equals(zze.zzb.zza) && !this.zzR.zza.zzo()) {
            z2 = true;
        }
        zzag(zze, 0, z2, 4, zzU(zze), -1, false);
    }

    @Nullable
    public final zzij zzE() {
        zzai();
        return this.zzR.zzf;
    }

    public final /* synthetic */ void zzN(zzki zzkiVar) {
        long j2;
        int i2 = this.zzy - zzkiVar.zzb;
        this.zzy = i2;
        boolean z2 = true;
        if (zzkiVar.zzc) {
            this.zzz = zzkiVar.zzd;
            this.zzA = true;
        }
        if (i2 == 0) {
            zzcc zzccVar = zzkiVar.zza.zza;
            if (!this.zzR.zza.zzo() && zzccVar.zzo()) {
                this.zzS = -1;
                this.zzT = 0L;
            }
            if (!zzccVar.zzo()) {
                List zzw = ((zzlp) zzccVar).zzw();
                zzdi.zzf(zzw.size() == this.zzo.size());
                for (int i3 = 0; i3 < zzw.size(); i3++) {
                    ((zzjy) this.zzo.get(i3)).zzc((zzcc) zzw.get(i3));
                }
            }
            long j3 = -9223372036854775807L;
            if (this.zzA) {
                if (zzkiVar.zza.zzb.equals(this.zzR.zzb) && zzkiVar.zza.zzd == this.zzR.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (zzccVar.zzo() || zzkiVar.zza.zzb.zzb()) {
                        j2 = zzkiVar.zza.zzd;
                    } else {
                        zzlk zzlkVar = zzkiVar.zza;
                        zzuy zzuyVar = zzlkVar.zzb;
                        j2 = zzlkVar.zzd;
                        zzW(zzccVar, zzuyVar, j2);
                    }
                    j3 = j2;
                }
            } else {
                z2 = false;
            }
            this.zzA = false;
            zzag(zzkiVar.zza, 1, z2, this.zzz, j3, -1, false);
        }
    }

    public final /* synthetic */ void zzO(final zzki zzkiVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjd
            @Override // java.lang.Runnable
            public final void run() {
                zzjz.this.zzN(zzkiVar);
            }
        });
    }

    public final /* synthetic */ void zzP(zzbu zzbuVar) {
        zzbuVar.zza(this.zzD);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final void zza(int i2, long j2, int i3, boolean z2) {
        zzai();
        if (i2 == -1) {
            return;
        }
        zzdi.zzd(i2 >= 0);
        zzcc zzccVar = this.zzR.zza;
        if (zzccVar.zzo() || i2 < zzccVar.zzc()) {
            this.zzq.zzu();
            this.zzy++;
            if (zzw()) {
                zzea.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzki zzkiVar = new zzki(this.zzR);
                zzkiVar.zza(1);
                this.zzU.zza.zzO(zzkiVar);
                return;
            }
            zzlk zzlkVar = this.zzR;
            int i4 = zzlkVar.zze;
            if (i4 == 3 || (i4 == 4 && !zzccVar.zzo())) {
                zzlkVar = this.zzR.zze(2);
            }
            int zzd2 = zzd();
            zzlk zzY = zzY(zzlkVar, zzccVar, zzX(zzccVar, i2, j2));
            this.zzk.zzk(zzccVar, i2, zzeu.zzr(j2));
            zzag(zzY, 0, true, 1, zzU(zzY), zzd2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzb() {
        zzai();
        if (zzw()) {
            return this.zzR.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzc() {
        zzai();
        if (zzw()) {
            return this.zzR.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzd() {
        zzai();
        int zzR = zzR(this.zzR);
        if (zzR == -1) {
            return 0;
        }
        return zzR;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zze() {
        zzai();
        if (this.zzR.zza.zzo()) {
            return 0;
        }
        zzlk zzlkVar = this.zzR;
        return zzlkVar.zza.zza(zzlkVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzf() {
        zzai();
        return this.zzR.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzg() {
        zzai();
        return this.zzR.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzh() {
        zzai();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzi() {
        zzai();
        if (zzw()) {
            zzlk zzlkVar = this.zzR;
            return zzlkVar.zzk.equals(zzlkVar.zzb) ? zzeu.zzu(this.zzR.zzq) : zzl();
        }
        zzai();
        if (this.zzR.zza.zzo()) {
            return this.zzT;
        }
        zzlk zzlkVar2 = this.zzR;
        long j2 = 0;
        if (zzlkVar2.zzk.zzd != zzlkVar2.zzb.zzd) {
            return zzeu.zzu(zzlkVar2.zza.zze(zzd(), this.zza, 0L).zzm);
        }
        long j3 = zzlkVar2.zzq;
        if (this.zzR.zzk.zzb()) {
            zzlk zzlkVar3 = this.zzR;
            zzlkVar3.zza.zzn(zzlkVar3.zzk.zza, this.zzn).zzg(this.zzR.zzk.zzb);
        } else {
            j2 = j3;
        }
        zzlk zzlkVar4 = this.zzR;
        zzW(zzlkVar4.zza, zzlkVar4.zzk, j2);
        return zzeu.zzu(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzj() {
        zzai();
        return zzT(this.zzR);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzk() {
        zzai();
        return zzeu.zzu(zzU(this.zzR));
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzl() {
        zzai();
        if (zzw()) {
            zzlk zzlkVar = this.zzR;
            zzuy zzuyVar = zzlkVar.zzb;
            zzlkVar.zza.zzn(zzuyVar.zza, this.zzn);
            return zzeu.zzu(this.zzn.zzf(zzuyVar.zzb, zzuyVar.zzc));
        }
        zzcc zzn = zzn();
        if (zzn.zzo()) {
            return -9223372036854775807L;
        }
        return zzeu.zzu(zzn.zze(zzd(), this.zza, 0L).zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzm() {
        zzai();
        return zzeu.zzu(this.zzR.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final zzcc zzn() {
        zzai();
        return this.zzR.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final zzck zzo() {
        zzai();
        return this.zzR.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzp() {
        zzai();
        zzhy zzhyVar = this.zzw;
        boolean zzu = zzu();
        zzhyVar.zzb(zzu, 2);
        zzaf(zzu, 1, zzS(1));
        zzlk zzlkVar = this.zzR;
        if (zzlkVar.zze != 1) {
            return;
        }
        zzlk zzd2 = zzlkVar.zzd(null);
        zzlk zze = zzd2.zze(true == zzd2.zza.zzo() ? 4 : 2);
        this.zzy++;
        this.zzk.zzj();
        zzag(zze, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzq(boolean z2) {
        zzai();
        this.zzw.zzb(z2, zzf());
        zzaf(z2, 1, zzS(1));
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzr(@Nullable Surface surface) {
        zzai();
        zzad(surface);
        int i2 = surface == null ? 0 : -1;
        zzaa(i2, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzs(float f2) {
        zzai();
        final float max = Math.max(0.0f, Math.min(f2, 1.0f));
        if (this.zzL == max) {
            return;
        }
        this.zzL = max;
        zzac();
        zzdz zzdzVar = this.zzl;
        zzdzVar.zzd(22, new zzdw() { // from class: com.google.android.gms.internal.ads.zzja
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i2 = zzjz.zzd;
                ((zzbu) obj).zzs(max);
            }
        });
        zzdzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzt() {
        zzai();
        this.zzw.zzb(zzu(), 1);
        zzae(null);
        int i2 = zzdc.zza;
        zzgax zzn = zzgax.zzn();
        long j2 = this.zzR.zzs;
        zzgax.zzl(zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzu() {
        zzai();
        return this.zzR.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzv() {
        zzai();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzw() {
        zzai();
        return this.zzR.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final int zzx() {
        zzai();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzy(zzmd zzmdVar) {
        this.zzq.zzt(zzmdVar);
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzz() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzeu.zze;
        String zza = zzbd.zza();
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("Release ", hexString, " [AndroidXMedia3/1.4.0] [", str, "] [");
        t2.append(zza);
        t2.append("]");
        zzea.zze("ExoPlayerImpl", t2.toString());
        zzai();
        this.zzw.zzd();
        if (!this.zzk.zzo()) {
            zzdz zzdzVar = this.zzl;
            zzdzVar.zzd(10, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjc
                @Override // com.google.android.gms.internal.ads.zzdw
                public final void zza(Object obj) {
                    ((zzbu) obj).zzj(zzij.zzd(new zzkl(1), 1003));
                }
            });
            zzdzVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzs.zzg(this.zzq);
        zzlk zzlkVar = this.zzR;
        boolean z2 = zzlkVar.zzp;
        zzlk zze = zzlkVar.zze(1);
        this.zzR = zze;
        zzlk zza2 = zze.zza(zze.zzb);
        this.zzR = zza2;
        zza2.zzq = zza2.zzs;
        this.zzR.zzr = 0L;
        this.zzq.zzP();
        this.zzi.zzj();
        Surface surface = this.zzG;
        if (surface != null) {
            surface.release();
            this.zzG = null;
        }
        int i2 = zzdc.zza;
    }
}

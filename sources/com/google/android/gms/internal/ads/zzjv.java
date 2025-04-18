package com.google.android.gms.internal.ads;

import a4.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzjv extends zzi implements zzir {
    public static final /* synthetic */ int zzd = 0;
    private boolean zzA;
    private zzls zzB;
    private zziq zzC;
    private zzbl zzD;
    private zzba zzE;

    @Nullable
    private Object zzF;

    @Nullable
    private Surface zzG;
    private int zzH;
    private zzee zzI;
    private int zzJ;
    private zzg zzK;
    private float zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private zzba zzQ;
    private zzlg zzR;
    private int zzS;
    private long zzT;
    private final zzjd zzU;
    private zzwj zzV;
    final zzyk zzb;
    final zzbl zzc;
    private final zzdf zze;
    private final Context zzf;
    private final zzbp zzg;
    private final zzln[] zzh;
    private final zzyj zzi;
    private final zzdm zzj;
    private final zzkh zzk;
    private final zzds zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzbt zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzlw zzq;
    private final Looper zzr;
    private final zzyr zzs;
    private final zzdc zzt;
    private final zzjr zzu;
    private final zzjs zzv;
    private final zzhv zzw;
    private final long zzx;
    private int zzy;
    private int zzz;

    static {
        zzax.zzb("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public zzjv(zzip zzipVar, @Nullable zzbp zzbpVar) {
        zzoj zza;
        int generateAudioSessionId;
        zzdf zzdfVar = new zzdf(zzdc.zza);
        this.zze = zzdfVar;
        try {
            zzdt.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-alpha01] [" + zzen.zze + "]");
            Context applicationContext = zzipVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            zzlw zzlwVar = (zzlw) zzipVar.zzh.apply(zzipVar.zzb);
            this.zzq = zzlwVar;
            this.zzP = zzipVar.zzj;
            this.zzK = zzipVar.zzk;
            this.zzH = zzipVar.zzl;
            this.zzM = false;
            this.zzx = zzipVar.zzp;
            zzjr zzjrVar = new zzjr(this, null);
            this.zzu = zzjrVar;
            zzjs zzjsVar = new zzjs(null);
            this.zzv = zzjsVar;
            Handler handler = new Handler(zzipVar.zzi);
            zzln[] zza2 = ((zzii) zzipVar.zzc).zza.zza(handler, zzjrVar, zzjrVar, zzjrVar, zzjrVar);
            this.zzh = zza2;
            int length = zza2.length;
            zzyj zzyjVar = (zzyj) zzipVar.zze.zza();
            this.zzi = zzyjVar;
            zzip.zza(((zzij) zzipVar.zzd).zza);
            zzyv zzh = zzyv.zzh(((zzim) zzipVar.zzg).zza);
            this.zzs = zzh;
            this.zzp = zzipVar.zzm;
            this.zzB = zzipVar.zzn;
            Looper looper = zzipVar.zzi;
            this.zzr = looper;
            zzdc zzdcVar = zzipVar.zzb;
            this.zzt = zzdcVar;
            this.zzg = zzbpVar;
            zzds zzdsVar = new zzds(looper, zzdcVar, new zzdq(this) { // from class: com.google.android.gms.internal.ads.zzjc
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj, zzz zzzVar) {
                }
            });
            this.zzl = zzdsVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzV = new zzwj(0);
            this.zzC = zziq.zza;
            int length2 = zza2.length;
            zzyk zzykVar = new zzyk(new zzlr[2], new zzyd[2], zzcd.zza, null);
            this.zzb = zzykVar;
            this.zzn = new zzbt();
            zzbk zzbkVar = new zzbk();
            zzbkVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzyjVar.zzn();
            zzbkVar.zzd(29, true);
            zzbkVar.zzd(23, false);
            zzbkVar.zzd(25, false);
            zzbkVar.zzd(33, false);
            zzbkVar.zzd(26, false);
            zzbkVar.zzd(34, false);
            zzbl zze = zzbkVar.zze();
            this.zzc = zze;
            zzbk zzbkVar2 = new zzbk();
            zzbkVar2.zzb(zze);
            zzbkVar2.zza(4);
            zzbkVar2.zza(10);
            this.zzD = zzbkVar2.zze();
            this.zzj = zzdcVar.zzd(looper, null);
            zzjd zzjdVar = new zzjd(this);
            this.zzU = zzjdVar;
            this.zzR = zzlg.zzg(zzykVar);
            zzlwVar.zzS(zzbpVar, looper);
            if (zzen.zza < 31) {
                zza = new zzoj(zzipVar.zzs);
            } else {
                zza = zzjn.zza(applicationContext, this, zzipVar.zzq, zzipVar.zzs);
            }
            this.zzk = new zzkh(zza2, zzyjVar, zzykVar, (zzkl) zzipVar.zzf.zza(), zzh, 0, false, zzlwVar, this.zzB, zzipVar.zzt, zzipVar.zzo, false, false, looper, zzdcVar, zzjdVar, zza, null, this.zzC);
            this.zzL = 1.0f;
            zzba zzbaVar = zzba.zza;
            this.zzE = zzbaVar;
            this.zzQ = zzbaVar;
            this.zzS = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager == null) {
                generateAudioSessionId = -1;
            } else {
                generateAudioSessionId = audioManager.generateAudioSessionId();
            }
            this.zzJ = generateAudioSessionId;
            int i10 = zzcu.zza;
            this.zzN = true;
            zzlwVar.getClass();
            zzdsVar.zzb(zzlwVar);
            zzh.zzf(new Handler(looper), zzlwVar);
            copyOnWriteArraySet.add(zzjrVar);
            new zzhq(zzipVar.zza, handler, zzjrVar);
            this.zzw = new zzhv(zzipVar.zza, handler, zzjrVar);
            zzipVar.zza.getApplicationContext();
            zzipVar.zza.getApplicationContext();
            new zzq(0).zza();
            zzci zzciVar = zzci.zza;
            this.zzI = zzee.zza;
            zzyjVar.zzk(this.zzK);
            zzab(1, 10, Integer.valueOf(this.zzJ));
            zzab(2, 10, Integer.valueOf(this.zzJ));
            zzab(1, 3, this.zzK);
            zzab(2, 4, Integer.valueOf(this.zzH));
            zzab(2, 5, 0);
            zzab(1, 9, Boolean.valueOf(this.zzM));
            zzab(2, 7, zzjsVar);
            zzab(6, 8, zzjsVar);
            zzab(-1, 16, Integer.valueOf(this.zzP));
            zzdfVar.zze();
        } catch (Throwable th2) {
            this.zze.zze();
            throw th2;
        }
    }

    public static /* bridge */ /* synthetic */ void zzK(zzjv zzjvVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjvVar.zzad(surface);
        zzjvVar.zzG = surface;
    }

    private final int zzR(zzlg zzlgVar) {
        if (zzlgVar.zza.zzo()) {
            return this.zzS;
        }
        return zzlgVar.zza.zzn(zzlgVar.zzb.zza, this.zzn).zzc;
    }

    public static int zzS(int i10) {
        return i10 == -1 ? 2 : 1;
    }

    private final long zzT(zzlg zzlgVar) {
        if (zzlgVar.zzb.zzb()) {
            zzlgVar.zza.zzn(zzlgVar.zzb.zza, this.zzn);
            long j3 = zzlgVar.zzc;
            if (j3 == C.TIME_UNSET) {
                long j10 = zzlgVar.zza.zze(zzR(zzlgVar), this.zza, 0L).zzl;
                return zzen.zzv(0L);
            }
            return zzen.zzv(j3) + zzen.zzv(0L);
        }
        return zzen.zzv(zzU(zzlgVar));
    }

    private final long zzU(zzlg zzlgVar) {
        if (zzlgVar.zza.zzo()) {
            return zzen.zzs(this.zzT);
        }
        long j3 = zzlgVar.zzs;
        if (zzlgVar.zzb.zzb()) {
            return j3;
        }
        zzW(zzlgVar.zza, zzlgVar.zzb, j3);
        return j3;
    }

    private static long zzV(zzlg zzlgVar) {
        zzbu zzbuVar = new zzbu();
        zzbt zzbtVar = new zzbt();
        zzlgVar.zza.zzn(zzlgVar.zzb.zza, zzbtVar);
        long j3 = zzlgVar.zzc;
        if (j3 == C.TIME_UNSET) {
            long j10 = zzlgVar.zza.zze(zzbtVar.zzc, zzbuVar, 0L).zzl;
            return 0L;
        }
        return j3;
    }

    private final long zzW(zzbv zzbvVar, zzur zzurVar, long j3) {
        zzbvVar.zzn(zzurVar.zza, this.zzn);
        return j3;
    }

    @Nullable
    private final Pair zzX(zzbv zzbvVar, int i10, long j3) {
        if (zzbvVar.zzo()) {
            this.zzS = i10;
            if (j3 == C.TIME_UNSET) {
                j3 = 0;
            }
            this.zzT = j3;
            return null;
        }
        if (i10 == -1 || i10 >= zzbvVar.zzc()) {
            i10 = zzbvVar.zzg(false);
            long j10 = zzbvVar.zze(i10, this.zza, 0L).zzl;
            j3 = zzen.zzv(0L);
        }
        return zzbvVar.zzl(this.zza, this.zzn, i10, zzen.zzs(j3));
    }

    private final zzlg zzY(zzlg zzlgVar, zzbv zzbvVar, @Nullable Pair pair) {
        boolean z10;
        zzur zzurVar;
        zzwr zzwrVar;
        zzyk zzykVar;
        List list;
        long j3;
        if (!zzbvVar.zzo() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzdb.zzd(z10);
        zzbv zzbvVar2 = zzlgVar.zza;
        long zzT = zzT(zzlgVar);
        zzlg zzf = zzlgVar.zzf(zzbvVar);
        if (zzbvVar.zzo()) {
            zzur zzh = zzlg.zzh();
            long zzs = zzen.zzs(this.zzT);
            zzlg zza = zzf.zzb(zzh, zzs, zzs, zzs, 0L, zzwr.zza, this.zzb, zzfzo.zzn()).zza(zzh);
            zza.zzq = zza.zzs;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i10 = zzen.zza;
        boolean z11 = !obj.equals(pair.first);
        if (z11) {
            zzurVar = new zzur(pair.first, -1L);
        } else {
            zzurVar = zzf.zzb;
        }
        zzur zzurVar2 = zzurVar;
        long longValue = ((Long) pair.second).longValue();
        long zzs2 = zzen.zzs(zzT);
        if (!zzbvVar2.zzo()) {
            zzbvVar2.zzn(obj, this.zzn);
        }
        if (!z11 && longValue >= zzs2) {
            if (longValue == zzs2) {
                int zza2 = zzbvVar.zza(zzf.zzk.zza);
                if (zza2 == -1 || zzbvVar.zzd(zza2, this.zzn, false).zzc != zzbvVar.zzn(zzurVar2.zza, this.zzn).zzc) {
                    zzbvVar.zzn(zzurVar2.zza, this.zzn);
                    if (zzurVar2.zzb()) {
                        j3 = this.zzn.zzf(zzurVar2.zzb, zzurVar2.zzc);
                    } else {
                        j3 = this.zzn.zzd;
                    }
                    zzlg zza3 = zzf.zzb(zzurVar2, zzf.zzs, zzf.zzs, zzf.zzd, j3 - zzf.zzs, zzf.zzh, zzf.zzi, zzf.zzj).zza(zzurVar2);
                    zza3.zzq = j3;
                    return zza3;
                }
                return zzf;
            }
            zzdb.zzf(!zzurVar2.zzb());
            long max = Math.max(0L, zzf.zzr - (longValue - zzs2));
            long j10 = zzf.zzq;
            if (zzf.zzk.equals(zzf.zzb)) {
                j10 = longValue + max;
            }
            zzlg zzb = zzf.zzb(zzurVar2, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzq = j10;
            return zzb;
        }
        zzdb.zzf(!zzurVar2.zzb());
        if (z11) {
            zzwrVar = zzwr.zza;
        } else {
            zzwrVar = zzf.zzh;
        }
        zzwr zzwrVar2 = zzwrVar;
        if (z11) {
            zzykVar = this.zzb;
        } else {
            zzykVar = zzf.zzi;
        }
        zzyk zzykVar2 = zzykVar;
        if (z11) {
            list = zzfzo.zzn();
        } else {
            list = zzf.zzj;
        }
        zzlg zza4 = zzf.zzb(zzurVar2, longValue, longValue, longValue, 0L, zzwrVar2, zzykVar2, list).zza(zzurVar2);
        zza4.zzq = longValue;
        return zza4;
    }

    private final zzlj zzZ(zzli zzliVar) {
        int zzR = zzR(this.zzR);
        zzbv zzbvVar = this.zzR.zza;
        if (zzR == -1) {
            zzR = 0;
        }
        zzdc zzdcVar = this.zzt;
        zzkh zzkhVar = this.zzk;
        return new zzlj(zzkhVar, zzliVar, zzbvVar, zzR, zzdcVar, zzkhVar.zzc());
    }

    public final void zzaa(final int i10, final int i11) {
        if (i10 == this.zzI.zzb() && i11 == this.zzI.zza()) {
            return;
        }
        this.zzI = new zzee(i10, i11);
        zzds zzdsVar = this.zzl;
        zzdsVar.zzd(24, new zzdp() { // from class: com.google.android.gms.internal.ads.zziy
            @Override // com.google.android.gms.internal.ads.zzdp
            public final void zza(Object obj) {
                int i12 = zzjv.zzd;
                ((zzbm) obj).zzo(i10, i11);
            }
        });
        zzdsVar.zzc();
        zzab(2, 14, new zzee(i10, i11));
    }

    private final void zzab(int i10, int i11, @Nullable Object obj) {
        zzln[] zzlnVarArr = this.zzh;
        int length = zzlnVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzln zzlnVar = zzlnVarArr[i12];
            if (i10 == -1 || zzlnVar.zzb() == i10) {
                zzlj zzZ = zzZ(zzlnVar);
                zzZ.zzf(i11);
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
        zzln[] zzlnVarArr = this.zzh;
        int length = zzlnVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            zzln zzlnVar = zzlnVarArr[i10];
            if (zzlnVar.zzb() == 2) {
                zzlj zzZ = zzZ(zzlnVar);
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
                    ((zzlj) it.next()).zzi(this.zzx);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.zzF;
            Surface surface = this.zzG;
            if (obj3 == surface) {
                surface.release();
                this.zzG = null;
            }
        }
        this.zzF = obj;
        if (z10) {
            zzae(zzig.zzd(new zzki(3), 1003));
        }
    }

    private final void zzae(@Nullable zzig zzigVar) {
        zzlg zzlgVar = this.zzR;
        zzlg zza = zzlgVar.zza(zzlgVar.zzb);
        zza.zzq = zza.zzs;
        zza.zzr = 0L;
        zzlg zze = zza.zze(1);
        if (zzigVar != null) {
            zze = zze.zzd(zzigVar);
        }
        this.zzy++;
        this.zzk.zzo();
        zzag(zze, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    public final void zzaf(boolean z10, int i10, int i11) {
        boolean z11;
        int i12 = 0;
        if (z10 && i10 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == 0) {
            i12 = 1;
        }
        zzlg zzlgVar = this.zzR;
        if (zzlgVar.zzl == z11 && zzlgVar.zzn == i12 && zzlgVar.zzm == i11) {
            return;
        }
        this.zzy++;
        zzlg zzc = zzlgVar.zzc(z11, i11, i12);
        this.zzk.zzn(z11, i11, i12);
        zzag(zzc, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0482 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ea  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzag(final com.google.android.gms.internal.ads.zzlg r43, final int r44, boolean r45, int r46, long r47, int r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 1273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjv.zzag(com.google.android.gms.internal.ads.zzlg, int, boolean, int, long, int, boolean):void");
    }

    private final void zzah() {
        int zzf = zzf();
        if (zzf != 2 && zzf != 3) {
            return;
        }
        zzai();
        boolean z10 = this.zzR.zzp;
        zzu();
        zzu();
    }

    private final void zzai() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        if (Thread.currentThread() != this.zzr.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzr.getThread().getName());
            if (!this.zzN) {
                if (this.zzO) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzdt.zzg("ExoPlayerImpl", format, illegalStateException);
                this.zzO = true;
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzA(zzlz zzlzVar) {
        zzai();
        this.zzq.zzR(zzlzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzB(zzut zzutVar) {
        zzai();
        List singletonList = Collections.singletonList(zzutVar);
        zzai();
        zzai();
        zzR(this.zzR);
        zzk();
        this.zzy++;
        boolean z10 = false;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.zzo.remove(i10);
            }
            this.zzV = this.zzV.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < singletonList.size(); i11++) {
            zzld zzldVar = new zzld((zzut) singletonList.get(i11), this.zzp);
            arrayList.add(zzldVar);
            this.zzo.add(i11, new zzjt(zzldVar.zzb, zzldVar.zza));
        }
        this.zzV = this.zzV.zzg(0, arrayList.size());
        zzll zzllVar = new zzll(this.zzo, this.zzV);
        if (!zzllVar.zzo() && zzllVar.zzc() < 0) {
            throw new zzah(zzllVar, -1, C.TIME_UNSET);
        }
        int zzg = zzllVar.zzg(false);
        zzlg zzY = zzY(this.zzR, zzllVar, zzX(zzllVar, zzg, C.TIME_UNSET));
        int i12 = zzY.zze;
        if (zzg != -1 && i12 != 1) {
            i12 = 4;
            if (!zzllVar.zzo() && zzg < zzllVar.zzc()) {
                i12 = 2;
            }
        }
        zzlg zze = zzY.zze(i12);
        this.zzk.zzq(arrayList, zzg, zzen.zzs(C.TIME_UNSET), this.zzV);
        if (!this.zzR.zzb.zza.equals(zze.zzb.zza) && !this.zzR.zza.zzo()) {
            z10 = true;
        }
        zzag(zze, 0, z10, 4, zzU(zze), -1, false);
    }

    @Nullable
    public final zzig zzE() {
        zzai();
        return this.zzR.zzf;
    }

    public final /* synthetic */ void zzN(zzke zzkeVar) {
        long j3;
        boolean z10;
        int i10 = this.zzy - zzkeVar.zzb;
        this.zzy = i10;
        boolean z11 = true;
        if (zzkeVar.zzc) {
            this.zzz = zzkeVar.zzd;
            this.zzA = true;
        }
        if (i10 == 0) {
            zzbv zzbvVar = zzkeVar.zza.zza;
            if (!this.zzR.zza.zzo() && zzbvVar.zzo()) {
                this.zzS = -1;
                this.zzT = 0L;
            }
            if (!zzbvVar.zzo()) {
                List zzw = ((zzll) zzbvVar).zzw();
                if (zzw.size() == this.zzo.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdb.zzf(z10);
                for (int i11 = 0; i11 < zzw.size(); i11++) {
                    ((zzjt) this.zzo.get(i11)).zzc((zzbv) zzw.get(i11));
                }
            }
            boolean z12 = this.zzA;
            long j10 = C.TIME_UNSET;
            if (z12) {
                if (zzkeVar.zza.zzb.equals(this.zzR.zzb) && zzkeVar.zza.zzd == this.zzR.zzs) {
                    z11 = false;
                }
                if (z11) {
                    if (!zzbvVar.zzo() && !zzkeVar.zza.zzb.zzb()) {
                        zzlg zzlgVar = zzkeVar.zza;
                        zzur zzurVar = zzlgVar.zzb;
                        j3 = zzlgVar.zzd;
                        zzW(zzbvVar, zzurVar, j3);
                    } else {
                        j3 = zzkeVar.zza.zzd;
                    }
                    j10 = j3;
                }
            } else {
                z11 = false;
            }
            this.zzA = false;
            zzag(zzkeVar.zza, 1, z11, this.zzz, j10, -1, false);
        }
    }

    public final /* synthetic */ void zzO(final zzke zzkeVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzja
            @Override // java.lang.Runnable
            public final void run() {
                zzjv.this.zzN(zzkeVar);
            }
        });
    }

    public final /* synthetic */ void zzP(zzbm zzbmVar) {
        zzbmVar.zza(this.zzD);
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final void zza(int i10, long j3, int i11, boolean z10) {
        boolean z11;
        zzai();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzdb.zzd(z11);
            zzbv zzbvVar = this.zzR.zza;
            if (!zzbvVar.zzo() && i10 >= zzbvVar.zzc()) {
                return;
            }
            this.zzq.zzu();
            this.zzy++;
            if (zzw()) {
                zzdt.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzke zzkeVar = new zzke(this.zzR);
                zzkeVar.zza(1);
                this.zzU.zza.zzO(zzkeVar);
                return;
            }
            zzlg zzlgVar = this.zzR;
            int i12 = zzlgVar.zze;
            if (i12 == 3 || (i12 == 4 && !zzbvVar.zzo())) {
                zzlgVar = this.zzR.zze(2);
            }
            int zzd2 = zzd();
            zzlg zzY = zzY(zzlgVar, zzbvVar, zzX(zzbvVar, i10, j3));
            this.zzk.zzl(zzbvVar, i10, zzen.zzs(j3));
            zzag(zzY, 0, true, 1, zzU(zzY), zzd2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzb() {
        zzai();
        if (zzw()) {
            return this.zzR.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzc() {
        zzai();
        if (zzw()) {
            return this.zzR.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzd() {
        zzai();
        int zzR = zzR(this.zzR);
        if (zzR == -1) {
            return 0;
        }
        return zzR;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zze() {
        zzai();
        if (this.zzR.zza.zzo()) {
            return 0;
        }
        zzlg zzlgVar = this.zzR;
        return zzlgVar.zza.zza(zzlgVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzf() {
        zzai();
        return this.zzR.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzg() {
        zzai();
        return this.zzR.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzh() {
        zzai();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzi() {
        zzai();
        if (zzw()) {
            zzlg zzlgVar = this.zzR;
            if (zzlgVar.zzk.equals(zzlgVar.zzb)) {
                return zzen.zzv(this.zzR.zzq);
            }
            return zzl();
        }
        zzai();
        if (this.zzR.zza.zzo()) {
            return this.zzT;
        }
        zzlg zzlgVar2 = this.zzR;
        long j3 = 0;
        if (zzlgVar2.zzk.zzd != zzlgVar2.zzb.zzd) {
            return zzen.zzv(zzlgVar2.zza.zze(zzd(), this.zza, 0L).zzm);
        }
        long j10 = zzlgVar2.zzq;
        if (this.zzR.zzk.zzb()) {
            zzlg zzlgVar3 = this.zzR;
            zzlgVar3.zza.zzn(zzlgVar3.zzk.zza, this.zzn).zzg(this.zzR.zzk.zzb);
        } else {
            j3 = j10;
        }
        zzlg zzlgVar4 = this.zzR;
        zzW(zzlgVar4.zza, zzlgVar4.zzk, j3);
        return zzen.zzv(j3);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzj() {
        zzai();
        return zzT(this.zzR);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzk() {
        zzai();
        return zzen.zzv(zzU(this.zzR));
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzl() {
        zzai();
        if (!zzw()) {
            zzbv zzn = zzn();
            if (zzn.zzo()) {
                return C.TIME_UNSET;
            }
            return zzen.zzv(zzn.zze(zzd(), this.zza, 0L).zzm);
        }
        zzlg zzlgVar = this.zzR;
        zzur zzurVar = zzlgVar.zzb;
        zzlgVar.zza.zzn(zzurVar.zza, this.zzn);
        return zzen.zzv(this.zzn.zzf(zzurVar.zzb, zzurVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzm() {
        zzai();
        return zzen.zzv(this.zzR.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final zzbv zzn() {
        zzai();
        return this.zzR.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final zzcd zzo() {
        zzai();
        return this.zzR.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzp() {
        zzai();
        zzhv zzhvVar = this.zzw;
        boolean zzu = zzu();
        int i10 = 2;
        zzhvVar.zzb(zzu, 2);
        zzaf(zzu, 1, zzS(1));
        zzlg zzlgVar = this.zzR;
        if (zzlgVar.zze != 1) {
            return;
        }
        zzlg zzd2 = zzlgVar.zzd(null);
        if (true == zzd2.zza.zzo()) {
            i10 = 4;
        }
        zzlg zze = zzd2.zze(i10);
        this.zzy++;
        this.zzk.zzk();
        zzag(zze, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzq(boolean z10) {
        zzai();
        this.zzw.zzb(z10, zzf());
        zzaf(z10, 1, zzS(1));
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzr(@Nullable Surface surface) {
        int i10;
        zzai();
        zzad(surface);
        if (surface == null) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        zzaa(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzs(float f10) {
        zzai();
        final float max = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzL == max) {
            return;
        }
        this.zzL = max;
        zzac();
        zzds zzdsVar = this.zzl;
        zzdsVar.zzd(22, new zzdp() { // from class: com.google.android.gms.internal.ads.zzix
            @Override // com.google.android.gms.internal.ads.zzdp
            public final void zza(Object obj) {
                int i10 = zzjv.zzd;
                ((zzbm) obj).zzs(max);
            }
        });
        zzdsVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzt() {
        zzai();
        this.zzw.zzb(zzu(), 1);
        zzae(null);
        int i10 = zzcu.zza;
        zzfzo zzn = zzfzo.zzn();
        long j3 = this.zzR.zzs;
        zzfzo.zzl(zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final boolean zzu() {
        zzai();
        return this.zzR.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final boolean zzv() {
        zzai();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final boolean zzw() {
        zzai();
        return this.zzR.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final int zzx() {
        zzai();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzy(zzlz zzlzVar) {
        this.zzq.zzt(zzlzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzz() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzen.zze;
        String zza = zzax.zza();
        StringBuilder p10 = j.p("Release ", hexString, " [AndroidXMedia3/1.5.0-alpha01] [", str, "] [");
        p10.append(zza);
        p10.append("]");
        zzdt.zze("ExoPlayerImpl", p10.toString());
        zzai();
        this.zzw.zzd();
        if (!this.zzk.zzp()) {
            zzds zzdsVar = this.zzl;
            zzdsVar.zzd(10, new zzdp() { // from class: com.google.android.gms.internal.ads.zziz
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj) {
                    ((zzbm) obj).zzj(zzig.zzd(new zzki(1), 1003));
                }
            });
            zzdsVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzs.zzg(this.zzq);
        zzlg zzlgVar = this.zzR;
        boolean z10 = zzlgVar.zzp;
        zzlg zze = zzlgVar.zze(1);
        this.zzR = zze;
        zzlg zza2 = zze.zza(zze.zzb);
        this.zzR = zza2;
        zza2.zzq = zza2.zzs;
        this.zzR.zzr = 0L;
        this.zzq.zzQ();
        this.zzi.zzj();
        Surface surface = this.zzG;
        if (surface != null) {
            surface.release();
            this.zzG = null;
        }
        int i10 = zzcu.zza;
    }
}

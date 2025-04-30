package com.google.android.gms.internal.ads;

import Q7.n0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzkw extends zzm implements zzjr {
    public static final /* synthetic */ int zzd = 0;
    private final zzmw zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzmr zzG;
    private zzcp zzH;
    private zzca zzI;
    private zzca zzJ;

    @Nullable
    private zzan zzK;

    @Nullable
    private zzan zzL;

    @Nullable
    private Object zzM;

    @Nullable
    private Surface zzN;
    private int zzO;
    private zzfv zzP;

    @Nullable
    private zzix zzQ;

    @Nullable
    private zzix zzR;
    private int zzS;
    private zzk zzT;
    private float zzU;
    private boolean zzV;
    private zzek zzW;
    private boolean zzX;
    private boolean zzY;
    private zzaa zzZ;
    private zzdv zzaa;
    private zzca zzab;
    private zzmg zzac;
    private int zzad;
    private long zzae;
    private final zzjs zzaf;
    private zzxi zzag;
    final zzzn zzb;
    final zzcp zzc;
    private final zzeu zze;
    private final Context zzf;
    private final zzct zzg;
    private final zzmn[] zzh;
    private final zzzm zzi;
    private final zzfb zzj;
    private final zzlh zzk;
    private final zzfh zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcz zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzvn zzq;
    private final zzmx zzr;
    private final Looper zzs;
    private final zzzu zzt;
    private final zzer zzu;
    private final zzks zzv;
    private final zzku zzw;
    private final zzir zzx;
    private final zziv zzy;
    private final zzmv zzz;

    static {
        zzbv.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.zzmx, com.google.android.gms.internal.ads.zzzt, java.lang.Object] */
    @SuppressLint({"HandlerLeak"})
    public zzkw(zzjq zzjqVar, @Nullable zzct zzctVar) {
        zzpj zza;
        zzeu zzeuVar = new zzeu(zzer.zza);
        this.zze = zzeuVar;
        try {
            zzfk.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0-alpha01] [" + zzgd.zze + "]");
            Context applicationContext = zzjqVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzjqVar.zzh.apply(zzjqVar.zzb);
            this.zzr = apply;
            this.zzT = zzjqVar.zzj;
            this.zzO = zzjqVar.zzk;
            this.zzV = false;
            this.zzB = zzjqVar.zzo;
            zzks zzksVar = new zzks(this, null);
            this.zzv = zzksVar;
            zzku zzkuVar = new zzku(null);
            this.zzw = zzkuVar;
            Handler handler = new Handler(zzjqVar.zzi);
            zzmn[] zza2 = ((zzjj) zzjqVar.zzc).zza.zza(handler, zzksVar, zzksVar, zzksVar, zzksVar);
            this.zzh = zza2;
            int length = zza2.length;
            zzzm zzzmVar = (zzzm) zzjqVar.zze.zza();
            this.zzi = zzzmVar;
            this.zzq = zzjq.zza(((zzjk) zzjqVar.zzd).zza);
            zzzy zzg = zzzy.zzg(((zzjn) zzjqVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = zzjqVar.zzl;
            this.zzG = zzjqVar.zzm;
            Looper looper = zzjqVar.zzi;
            this.zzs = looper;
            zzer zzerVar = zzjqVar.zzb;
            this.zzu = zzerVar;
            this.zzg = zzctVar;
            zzfh zzfhVar = new zzfh(looper, zzerVar, new zzff() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzff
                public final void zza(Object obj, zzah zzahVar) {
                }
            });
            this.zzl = zzfhVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzag = new zzxi(0);
            int length2 = zza2.length;
            zzzn zzznVar = new zzzn(new zzmq[2], new zzzg[2], zzdp.zza, null);
            this.zzb = zzznVar;
            this.zzn = new zzcz();
            zzcn zzcnVar = new zzcn();
            zzcnVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzzmVar.zzn();
            zzcnVar.zzd(29, true);
            zzcnVar.zzd(23, false);
            zzcnVar.zzd(25, false);
            zzcnVar.zzd(33, false);
            zzcnVar.zzd(26, false);
            zzcnVar.zzd(34, false);
            zzcp zze = zzcnVar.zze();
            this.zzc = zze;
            zzcn zzcnVar2 = new zzcn();
            zzcnVar2.zzb(zze);
            zzcnVar2.zza(4);
            zzcnVar2.zza(10);
            this.zzH = zzcnVar2.zze();
            this.zzj = zzerVar.zzb(looper, null);
            zzjs zzjsVar = new zzjs(this);
            this.zzaf = zzjsVar;
            this.zzac = zzmg.zzg(zzznVar);
            apply.zzR(zzctVar, looper);
            if (zzgd.zza < 31) {
                zza = new zzpj(zzjqVar.zzr);
            } else {
                zza = zzkn.zza(applicationContext, this, zzjqVar.zzp, zzjqVar.zzr);
            }
            this.zzk = new zzlh(zza2, zzzmVar, zzznVar, (zzlk) zzjqVar.zzf.zza(), zzg, 0, false, apply, this.zzG, zzjqVar.zzs, zzjqVar.zzn, false, looper, zzerVar, zzjsVar, zza, null);
            this.zzU = 1.0f;
            zzca zzcaVar = zzca.zza;
            this.zzI = zzcaVar;
            this.zzJ = zzcaVar;
            this.zzab = zzcaVar;
            int i9 = -1;
            this.zzad = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager != null) {
                i9 = audioManager.generateAudioSessionId();
            }
            this.zzS = i9;
            this.zzW = zzek.zza;
            this.zzX = true;
            apply.getClass();
            zzfhVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzksVar);
            this.zzx = new zzir(zzjqVar.zza, handler, zzksVar);
            this.zzy = new zziv(zzjqVar.zza, handler, zzksVar);
            zzgd.zzG(null, null);
            this.zzz = new zzmv(zzjqVar.zza);
            this.zzA = new zzmw(zzjqVar.zza);
            this.zzZ = new zzy(0).zza();
            this.zzaa = zzdv.zza;
            this.zzP = zzfv.zza;
            zzzmVar.zzk(this.zzT);
            zzag(1, 10, Integer.valueOf(this.zzS));
            zzag(2, 10, Integer.valueOf(this.zzS));
            zzag(1, 3, this.zzT);
            zzag(2, 4, Integer.valueOf(this.zzO));
            zzag(2, 5, 0);
            zzag(1, 9, Boolean.valueOf(this.zzV));
            zzag(2, 7, zzkuVar);
            zzag(6, 8, zzkuVar);
            zzeuVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzP(zzkw zzkwVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkwVar.zzai(surface);
        zzkwVar.zzN = surface;
    }

    private final int zzW(zzmg zzmgVar) {
        if (zzmgVar.zza.zzo()) {
            return this.zzad;
        }
        return zzmgVar.zza.zzn(zzmgVar.zzb.zza, this.zzn).zzd;
    }

    public static int zzX(boolean z8, int i9) {
        return (!z8 || i9 == 1) ? 1 : 2;
    }

    private final long zzY(zzmg zzmgVar) {
        if (zzmgVar.zzb.zzb()) {
            zzmgVar.zza.zzn(zzmgVar.zzb.zza, this.zzn);
            long j7 = zzmgVar.zzc;
            if (j7 == C.TIME_UNSET) {
                long j9 = zzmgVar.zza.zze(zzW(zzmgVar), this.zza, 0L).zzn;
                return zzgd.zzu(0L);
            }
            return zzgd.zzu(j7) + zzgd.zzu(0L);
        }
        return zzgd.zzu(zzZ(zzmgVar));
    }

    private final long zzZ(zzmg zzmgVar) {
        if (zzmgVar.zza.zzo()) {
            return zzgd.zzr(this.zzae);
        }
        long j7 = zzmgVar.zzr;
        if (zzmgVar.zzb.zzb()) {
            return j7;
        }
        zzab(zzmgVar.zza, zzmgVar.zzb, j7);
        return j7;
    }

    private static long zzaa(zzmg zzmgVar) {
        zzdb zzdbVar = new zzdb();
        zzcz zzczVar = new zzcz();
        zzmgVar.zza.zzn(zzmgVar.zzb.zza, zzczVar);
        long j7 = zzmgVar.zzc;
        if (j7 == C.TIME_UNSET) {
            long j9 = zzmgVar.zza.zze(zzczVar.zzd, zzdbVar, 0L).zzn;
            return 0L;
        }
        return j7;
    }

    private final long zzab(zzdc zzdcVar, zzvo zzvoVar, long j7) {
        zzdcVar.zzn(zzvoVar.zza, this.zzn);
        return j7;
    }

    @Nullable
    private final Pair zzac(zzdc zzdcVar, int i9, long j7) {
        if (zzdcVar.zzo()) {
            this.zzad = i9;
            if (j7 == C.TIME_UNSET) {
                j7 = 0;
            }
            this.zzae = j7;
            return null;
        }
        if (i9 == -1 || i9 >= zzdcVar.zzc()) {
            i9 = zzdcVar.zzg(false);
            long j9 = zzdcVar.zze(i9, this.zza, 0L).zzn;
            j7 = zzgd.zzu(0L);
        }
        return zzdcVar.zzl(this.zza, this.zzn, i9, zzgd.zzr(j7));
    }

    private final zzmg zzad(zzmg zzmgVar, zzdc zzdcVar, @Nullable Pair pair) {
        boolean z8;
        zzvo zzvoVar;
        zzxr zzxrVar;
        zzzn zzznVar;
        List list;
        long j7;
        if (zzdcVar.zzo() || pair != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        zzdc zzdcVar2 = zzmgVar.zza;
        long zzY = zzY(zzmgVar);
        zzmg zzf = zzmgVar.zzf(zzdcVar);
        if (zzdcVar.zzo()) {
            zzvo zzh = zzmg.zzh();
            long zzr = zzgd.zzr(this.zzae);
            zzmg zza = zzf.zzb(zzh, zzr, zzr, zzr, 0L, zzxr.zza, this.zzb, zzgbc.zzm()).zza(zzh);
            zza.zzp = zza.zzr;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i9 = zzgd.zza;
        boolean z9 = !obj.equals(pair.first);
        if (z9) {
            zzvoVar = new zzvo(pair.first, -1L);
        } else {
            zzvoVar = zzf.zzb;
        }
        zzvo zzvoVar2 = zzvoVar;
        long longValue = ((Long) pair.second).longValue();
        long zzr2 = zzgd.zzr(zzY);
        if (!zzdcVar2.zzo()) {
            zzdcVar2.zzn(obj, this.zzn);
        }
        if (!z9 && longValue >= zzr2) {
            if (longValue == zzr2) {
                int zza2 = zzdcVar.zza(zzf.zzk.zza);
                if (zza2 == -1 || zzdcVar.zzd(zza2, this.zzn, false).zzd != zzdcVar.zzn(zzvoVar2.zza, this.zzn).zzd) {
                    zzdcVar.zzn(zzvoVar2.zza, this.zzn);
                    if (zzvoVar2.zzb()) {
                        j7 = this.zzn.zzh(zzvoVar2.zzb, zzvoVar2.zzc);
                    } else {
                        j7 = this.zzn.zze;
                    }
                    zzmg zza3 = zzf.zzb(zzvoVar2, zzf.zzr, zzf.zzr, zzf.zzd, j7 - zzf.zzr, zzf.zzh, zzf.zzi, zzf.zzj).zza(zzvoVar2);
                    zza3.zzp = j7;
                    return zza3;
                }
                return zzf;
            }
            zzeq.zzf(!zzvoVar2.zzb());
            long max = Math.max(0L, zzf.zzq - (longValue - zzr2));
            long j9 = zzf.zzp;
            if (zzf.zzk.equals(zzf.zzb)) {
                j9 = longValue + max;
            }
            zzmg zzb = zzf.zzb(zzvoVar2, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzp = j9;
            return zzb;
        }
        zzeq.zzf(!zzvoVar2.zzb());
        if (z9) {
            zzxrVar = zzxr.zza;
        } else {
            zzxrVar = zzf.zzh;
        }
        zzxr zzxrVar2 = zzxrVar;
        if (z9) {
            zzznVar = this.zzb;
        } else {
            zzznVar = zzf.zzi;
        }
        zzzn zzznVar2 = zzznVar;
        if (z9) {
            list = zzgbc.zzm();
        } else {
            list = zzf.zzj;
        }
        zzmg zza4 = zzf.zzb(zzvoVar2, longValue, longValue, longValue, 0L, zzxrVar2, zzznVar2, list).zza(zzvoVar2);
        zza4.zzp = longValue;
        return zza4;
    }

    private final zzmj zzae(zzmi zzmiVar) {
        int zzW = zzW(this.zzac);
        zzdc zzdcVar = this.zzac.zza;
        if (zzW == -1) {
            zzW = 0;
        }
        zzer zzerVar = this.zzu;
        zzlh zzlhVar = this.zzk;
        return new zzmj(zzlhVar, zzmiVar, zzdcVar, zzW, zzerVar, zzlhVar.zzb());
    }

    public final void zzaf(final int i9, final int i10) {
        if (i9 == this.zzP.zzb() && i10 == this.zzP.zza()) {
            return;
        }
        this.zzP = new zzfv(i9, i10);
        zzfh zzfhVar = this.zzl;
        zzfhVar.zzd(24, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkj
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                int i11 = zzkw.zzd;
                ((zzcq) obj).zzo(i9, i10);
            }
        });
        zzfhVar.zzc();
        zzag(2, 14, new zzfv(i9, i10));
    }

    private final void zzag(int i9, int i10, @Nullable Object obj) {
        zzmn[] zzmnVarArr = this.zzh;
        int length = zzmnVarArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            zzmn zzmnVar = zzmnVarArr[i11];
            if (zzmnVar.zzb() == i9) {
                zzmj zzae = zzae(zzmnVar);
                zzae.zzf(i10);
                zzae.zze(obj);
                zzae.zzd();
            }
        }
    }

    public final void zzah() {
        zzag(1, 2, Float.valueOf(this.zzU * this.zzy.zza()));
    }

    public final void zzai(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        zzmn[] zzmnVarArr = this.zzh;
        int length = zzmnVarArr.length;
        boolean z8 = false;
        for (int i9 = 0; i9 < 2; i9++) {
            zzmn zzmnVar = zzmnVarArr[i9];
            if (zzmnVar.zzb() == 2) {
                zzmj zzae = zzae(zzmnVar);
                zzae.zzf(1);
                zzae.zze(obj);
                zzae.zzd();
                arrayList.add(zzae);
            }
        }
        Object obj2 = this.zzM;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzmj) it.next()).zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z8 = true;
            }
            Object obj3 = this.zzM;
            Surface surface = this.zzN;
            if (obj3 == surface) {
                surface.release();
                this.zzN = null;
            }
        }
        this.zzM = obj;
        if (z8) {
            zzaj(zzjh.zzd(new zzli(3), 1003));
        }
    }

    private final void zzaj(@Nullable zzjh zzjhVar) {
        zzmg zzmgVar = this.zzac;
        zzmg zza = zzmgVar.zza(zzmgVar.zzb);
        zza.zzp = zza.zzr;
        zza.zzq = 0L;
        zzmg zze = zza.zze(1);
        if (zzjhVar != null) {
            zze = zze.zzd(zzjhVar);
        }
        this.zzC++;
        this.zzk.zzo();
        zzal(zze, 0, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    public final void zzak(boolean z8, int i9, int i10) {
        boolean z9;
        int i11 = 0;
        if (z8 && i9 != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && i9 != 1) {
            i11 = 1;
        }
        zzmg zzmgVar = this.zzac;
        if (zzmgVar.zzl == z9 && zzmgVar.zzm == i11) {
            return;
        }
        this.zzC++;
        zzmg zzc = zzmgVar.zzc(z9, i11);
        this.zzk.zzn(z9, i11);
        zzal(zzc, 0, i10, false, 5, C.TIME_UNSET, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0490 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ec  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzal(final com.google.android.gms.internal.ads.zzmg r43, final int r44, final int r45, boolean r46, int r47, long r48, int r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkw.zzal(com.google.android.gms.internal.ads.zzmg, int, int, boolean, int, long, int, boolean):void");
    }

    private final void zzam() {
        int zzf = zzf();
        if (zzf != 2 && zzf != 3) {
            return;
        }
        zzan();
        boolean z8 = this.zzac.zzo;
        zzv();
        zzv();
    }

    private final void zzan() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.zzs.getThread().getName();
            Locale locale = Locale.US;
            String j7 = n0.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.zzX) {
                if (this.zzY) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzfk.zzg("ExoPlayerImpl", j7, illegalStateException);
                this.zzY = true;
                return;
            }
            throw new IllegalStateException(j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final void zzA(zzna zznaVar) {
        zzan();
        this.zzr.zzQ(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final void zzB(zzvq zzvqVar) {
        boolean z8;
        zzan();
        List singletonList = Collections.singletonList(zzvqVar);
        zzan();
        zzan();
        zzW(this.zzac);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i9 = size - 1; i9 >= 0; i9--) {
                this.zzo.remove(i9);
            }
            this.zzag = this.zzag.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < singletonList.size(); i10++) {
            zzmd zzmdVar = new zzmd((zzvq) singletonList.get(i10), this.zzp);
            arrayList.add(zzmdVar);
            this.zzo.add(i10, new zzkv(zzmdVar.zzb, zzmdVar.zza));
        }
        this.zzag = this.zzag.zzg(0, arrayList.size());
        zzml zzmlVar = new zzml(this.zzo, this.zzag);
        if (!zzmlVar.zzo() && zzmlVar.zzc() < 0) {
            throw new zzar(zzmlVar, -1, C.TIME_UNSET);
        }
        int zzg = zzmlVar.zzg(false);
        zzmg zzad = zzad(this.zzac, zzmlVar, zzac(zzmlVar, zzg, C.TIME_UNSET));
        int i11 = zzad.zze;
        if (zzg != -1 && i11 != 1) {
            i11 = 4;
            if (!zzmlVar.zzo() && zzg < zzmlVar.zzc()) {
                i11 = 2;
            }
        }
        zzmg zze = zzad.zze(i11);
        this.zzk.zzq(arrayList, zzg, zzgd.zzr(C.TIME_UNSET), this.zzag);
        if (!this.zzac.zzb.zza.equals(zze.zzb.zza) && !this.zzac.zza.zzo()) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzal(zze, 0, 1, z8, 4, zzZ(zze), -1, false);
    }

    @Nullable
    public final zzjh zzE() {
        zzan();
        return this.zzac.zzf;
    }

    public final /* synthetic */ void zzS(zzlf zzlfVar) {
        long j7;
        boolean z8;
        boolean z9;
        int i9 = this.zzC - zzlfVar.zzb;
        this.zzC = i9;
        boolean z10 = true;
        if (zzlfVar.zzc) {
            this.zzD = zzlfVar.zzd;
            this.zzE = true;
        }
        if (zzlfVar.zze) {
            this.zzF = zzlfVar.zzf;
        }
        if (i9 == 0) {
            zzdc zzdcVar = zzlfVar.zza.zza;
            if (!this.zzac.zza.zzo() && zzdcVar.zzo()) {
                this.zzad = -1;
                this.zzae = 0L;
            }
            if (!zzdcVar.zzo()) {
                List zzw = ((zzml) zzdcVar).zzw();
                if (zzw.size() == this.zzo.size()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zzeq.zzf(z9);
                for (int i10 = 0; i10 < zzw.size(); i10++) {
                    ((zzkv) this.zzo.get(i10)).zzc((zzdc) zzw.get(i10));
                }
            }
            if (this.zzE) {
                if (zzlfVar.zza.zzb.equals(this.zzac.zzb) && zzlfVar.zza.zzd == this.zzac.zzr) {
                    z10 = false;
                }
                if (z10) {
                    if (!zzdcVar.zzo() && !zzlfVar.zza.zzb.zzb()) {
                        zzmg zzmgVar = zzlfVar.zza;
                        zzvo zzvoVar = zzmgVar.zzb;
                        j7 = zzmgVar.zzd;
                        zzab(zzdcVar, zzvoVar, j7);
                    } else {
                        j7 = zzlfVar.zza.zzd;
                    }
                } else {
                    j7 = -9223372036854775807L;
                }
                z8 = z10;
            } else {
                j7 = -9223372036854775807L;
                z8 = false;
            }
            this.zzE = false;
            zzal(zzlfVar.zza, 1, this.zzF, z8, this.zzD, j7, -1, false);
        }
    }

    public final /* synthetic */ void zzT(final zzlf zzlfVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkl
            @Override // java.lang.Runnable
            public final void run() {
                zzkw.this.zzS(zzlfVar);
            }
        });
    }

    public final /* synthetic */ void zzU(zzcq zzcqVar) {
        zzcqVar.zza(this.zzH);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i9, long j7, int i10, boolean z8) {
        boolean z9;
        zzan();
        if (i9 != -1) {
            if (i9 >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            zzeq.zzd(z9);
            zzdc zzdcVar = this.zzac.zza;
            if (!zzdcVar.zzo() && i9 >= zzdcVar.zzc()) {
                return;
            }
            this.zzr.zzu();
            this.zzC++;
            if (zzx()) {
                zzfk.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlf zzlfVar = new zzlf(this.zzac);
                zzlfVar.zza(1);
                this.zzaf.zza.zzT(zzlfVar);
                return;
            }
            zzmg zzmgVar = this.zzac;
            int i11 = zzmgVar.zze;
            if (i11 == 3 || (i11 == 4 && !zzdcVar.zzo())) {
                zzmgVar = this.zzac.zze(2);
            }
            int zzd2 = zzd();
            zzmg zzad = zzad(zzmgVar, zzdcVar, zzac(zzdcVar, i9, j7));
            this.zzk.zzl(zzdcVar, i9, zzgd.zzr(j7));
            zzal(zzad, 0, 1, true, 1, zzZ(zzad), zzd2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzb() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzc() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzd() {
        zzan();
        int zzW = zzW(this.zzac);
        if (zzW == -1) {
            return 0;
        }
        return zzW;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zze() {
        zzan();
        if (this.zzac.zza.zzo()) {
            return 0;
        }
        zzmg zzmgVar = this.zzac;
        return zzmgVar.zza.zza(zzmgVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzf() {
        zzan();
        return this.zzac.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzg() {
        zzan();
        return this.zzac.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzh() {
        zzan();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzi() {
        zzan();
        if (zzx()) {
            zzmg zzmgVar = this.zzac;
            if (zzmgVar.zzk.equals(zzmgVar.zzb)) {
                return zzgd.zzu(this.zzac.zzp);
            }
            return zzl();
        }
        zzan();
        if (this.zzac.zza.zzo()) {
            return this.zzae;
        }
        zzmg zzmgVar2 = this.zzac;
        long j7 = 0;
        if (zzmgVar2.zzk.zzd != zzmgVar2.zzb.zzd) {
            return zzgd.zzu(zzmgVar2.zza.zze(zzd(), this.zza, 0L).zzo);
        }
        long j9 = zzmgVar2.zzp;
        if (this.zzac.zzk.zzb()) {
            zzmg zzmgVar3 = this.zzac;
            zzmgVar3.zza.zzn(zzmgVar3.zzk.zza, this.zzn).zzi(this.zzac.zzk.zzb);
        } else {
            j7 = j9;
        }
        zzmg zzmgVar4 = this.zzac;
        zzab(zzmgVar4.zza, zzmgVar4.zzk, j7);
        return zzgd.zzu(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzj() {
        zzan();
        return zzY(this.zzac);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzk() {
        zzan();
        return zzgd.zzu(zzZ(this.zzac));
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzl() {
        zzan();
        if (!zzx()) {
            zzdc zzn = zzn();
            if (zzn.zzo()) {
                return C.TIME_UNSET;
            }
            return zzgd.zzu(zzn.zze(zzd(), this.zza, 0L).zzo);
        }
        zzmg zzmgVar = this.zzac;
        zzvo zzvoVar = zzmgVar.zzb;
        zzmgVar.zza.zzn(zzvoVar.zza, this.zzn);
        return zzgd.zzu(this.zzn.zzh(zzvoVar.zzb, zzvoVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzm() {
        zzan();
        return zzgd.zzu(this.zzac.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final zzdc zzn() {
        zzan();
        return this.zzac.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final zzdp zzo() {
        zzan();
        return this.zzac.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzp() {
        zzan();
        zziv zzivVar = this.zzy;
        boolean zzv = zzv();
        int i9 = 2;
        int zzb = zzivVar.zzb(zzv, 2);
        zzak(zzv, zzb, zzX(zzv, zzb));
        zzmg zzmgVar = this.zzac;
        if (zzmgVar.zze != 1) {
            return;
        }
        zzmg zzd2 = zzmgVar.zzd(null);
        if (true == zzd2.zza.zzo()) {
            i9 = 4;
        }
        zzmg zze = zzd2.zze(i9);
        this.zzC++;
        this.zzk.zzk();
        zzal(zze, 1, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzq() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzgd.zze;
        String zza = zzbv.zza();
        StringBuilder o3 = o.o("Release ", hexString, " [AndroidXMedia3/1.4.0-alpha01] [", str, "] [");
        o3.append(zza);
        o3.append("]");
        zzfk.zze("ExoPlayerImpl", o3.toString());
        zzan();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzfh zzfhVar = this.zzl;
            zzfhVar.zzd(10, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkk
                @Override // com.google.android.gms.internal.ads.zzfe
                public final void zza(Object obj) {
                    ((zzcq) obj).zzj(zzjh.zzd(new zzli(1), 1003));
                }
            });
            zzfhVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        zzmg zzmgVar = this.zzac;
        boolean z8 = zzmgVar.zzo;
        zzmg zze = zzmgVar.zze(1);
        this.zzac = zze;
        zzmg zza2 = zze.zza(zze.zzb);
        this.zzac = zza2;
        zza2.zzp = zza2.zzr;
        this.zzac.zzq = 0L;
        this.zzr.zzP();
        this.zzi.zzj();
        Surface surface = this.zzN;
        if (surface != null) {
            surface.release();
            this.zzN = null;
        }
        this.zzW = zzek.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzr(boolean z8) {
        zzan();
        int zzb = this.zzy.zzb(z8, zzf());
        zzak(z8, zzb, zzX(z8, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzs(@Nullable Surface surface) {
        int i9;
        zzan();
        zzai(surface);
        if (surface == null) {
            i9 = 0;
        } else {
            i9 = -1;
        }
        zzaf(i9, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzt(float f9) {
        zzan();
        final float max = Math.max(0.0f, Math.min(f9, 1.0f));
        if (this.zzU == max) {
            return;
        }
        this.zzU = max;
        zzah();
        zzfh zzfhVar = this.zzl;
        zzfhVar.zzd(22, new zzfe() { // from class: com.google.android.gms.internal.ads.zzka
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                int i9 = zzkw.zzd;
                ((zzcq) obj).zzs(max);
            }
        });
        zzfhVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzu() {
        zzan();
        this.zzy.zzb(zzv(), 1);
        zzaj(null);
        this.zzW = new zzek(zzgbc.zzm(), this.zzac.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzv() {
        zzan();
        return this.zzac.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzw() {
        zzan();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzx() {
        zzan();
        return this.zzac.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final int zzy() {
        zzan();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final void zzz(zzna zznaVar) {
        this.zzr.zzt(zznaVar);
    }
}

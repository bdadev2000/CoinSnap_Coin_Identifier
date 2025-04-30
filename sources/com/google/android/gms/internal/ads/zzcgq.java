package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcgq extends zzcdv implements zzie, zzna {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcgb zzc;
    private final zzze zzd;
    private final zzced zze;
    private final WeakReference zzf;
    private final zzwu zzg;

    @Nullable
    private zzjr zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcdu zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;

    @Nullable
    private Integer zzr;
    private final ArrayList zzs;

    @Nullable
    private volatile zzcgd zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzbR)).booleanValue() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r5.zzm == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcgh(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        if (r5.zzj == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzcgk(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0114, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
    
        if (r4.limit() <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011c, code lost:
    
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcgl(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r5.zzi <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcgi(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcgj(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        if (r5.zzj == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzcgq(android.content.Context r4, com.google.android.gms.internal.ads.zzced r5, com.google.android.gms.internal.ads.zzcee r6, @androidx.annotation.Nullable java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgq.<init>(android.content.Context, com.google.android.gms.internal.ads.zzced, com.google.android.gms.internal.ads.zzcee, java.lang.Integer):void");
    }

    private final boolean zzad() {
        if (this.zzt != null && this.zzt.zzq()) {
            return true;
        }
        return false;
    }

    public final void finalize() {
        zzcdv.zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzA() {
        if (!zzad()) {
            return this.zzl;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzB() {
        if (!zzad()) {
            synchronized (this.zzq) {
                while (!this.zzs.isEmpty()) {
                    long j7 = this.zzn;
                    Map zze = ((zzhz) this.zzs.remove(0)).zze();
                    long j9 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfxm.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j9 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j7 + j9;
                }
            }
            return this.zzn;
        }
        return this.zzt.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    @Nullable
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z8) {
        zzvq zzwfVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z8;
            int length = uriArr.length;
            if (length == 1) {
                zzwfVar = zzaa(uriArr[0]);
            } else {
                zzvq[] zzvqVarArr = new zzvq[length];
                for (int i9 = 0; i9 < uriArr.length; i9++) {
                    zzvqVarArr[i9] = zzaa(uriArr[i9]);
                }
                zzwfVar = new zzwf(false, false, new zzuz(), zzvqVarArr);
            }
            this.zzh.zzB(zzwfVar);
            this.zzh.zzp();
            zzcdv.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzH() {
        zzjr zzjrVar = this.zzh;
        if (zzjrVar != null) {
            zzjrVar.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzcdv.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzI(long j7) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzd(), j7, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzJ(int i9) {
        this.zzc.zzk(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzK(int i9) {
        this.zzc.zzl(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzL(zzcdu zzcduVar) {
        this.zzk = zzcduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzM(int i9) {
        this.zzc.zzm(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzN(int i9) {
        this.zzc.zzn(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzO(boolean z8) {
        this.zzh.zzr(z8);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzP(@Nullable Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzQ(boolean z8) {
        if (this.zzh != null) {
            int i9 = 0;
            while (true) {
                this.zzh.zzy();
                if (i9 < 2) {
                    zzze zzzeVar = this.zzd;
                    zzyq zzc = zzzeVar.zzf().zzc();
                    zzc.zzp(i9, !z8);
                    zzzeVar.zzl(zzc);
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzR(int i9) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcga zzcgaVar = (zzcga) ((WeakReference) it.next()).get();
            if (zzcgaVar != null) {
                zzcgaVar.zzm(i9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzS(Surface surface, boolean z8) {
        zzjr zzjrVar = this.zzh;
        if (zzjrVar != null) {
            zzjrVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzT(float f9, boolean z8) {
        zzjr zzjrVar = this.zzh;
        if (zzjrVar != null) {
            zzjrVar.zzt(f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final boolean zzV() {
        return this.zzh != null;
    }

    public final /* synthetic */ zzhb zzW(String str, boolean z8) {
        zzcgq zzcgqVar;
        if (true != z8) {
            zzcgqVar = null;
        } else {
            zzcgqVar = this;
        }
        zzced zzcedVar = this.zze;
        return new zzcgt(str, zzcgqVar, zzcedVar.zzd, zzcedVar.zzf, zzcedVar.zzn, zzcedVar.zzo);
    }

    public final /* synthetic */ zzhb zzX(String str, boolean z8) {
        zzcgq zzcgqVar;
        if (true != z8) {
            zzcgqVar = null;
        } else {
            zzcgqVar = this;
        }
        zzced zzcedVar = this.zze;
        zzcga zzcgaVar = new zzcga(str, zzcgqVar, zzcedVar.zzd, zzcedVar.zzf, zzcedVar.zzi);
        this.zzu.add(new WeakReference(zzcgaVar));
        return zzcgaVar;
    }

    public final /* synthetic */ zzhb zzY(String str, boolean z8) {
        zzcgq zzcgqVar;
        zzhk zzhkVar = new zzhk();
        zzhkVar.zzf(str);
        if (true != z8) {
            zzcgqVar = null;
        } else {
            zzcgqVar = this;
        }
        zzhkVar.zze(zzcgqVar);
        zzhkVar.zzc(this.zze.zzd);
        zzhkVar.zzd(this.zze.zzf);
        zzhkVar.zzb(true);
        return zzhkVar.zza();
    }

    public final /* synthetic */ zzhb zzZ(zzha zzhaVar) {
        zzhb zza2 = zzhaVar.zza();
        zzcgo zzcgoVar = new zzcgo(this);
        return new zzcgd(this.zzb, zza2, this.zzo, this.zzp, this, zzcgoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zza(zzhb zzhbVar, zzhh zzhhVar, boolean z8, int i9) {
        this.zzl += i9;
    }

    public final zzvq zzaa(Uri uri) {
        zzaw zzawVar = new zzaw();
        zzawVar.zzb(uri);
        zzbu zzc = zzawVar.zzc();
        zzwu zzwuVar = this.zzg;
        zzwuVar.zza(this.zze.zzg);
        return zzwuVar.zzb(zzc);
    }

    public final /* synthetic */ void zzab(boolean z8, long j7) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            zzcduVar.zzi(z8, j7);
        }
    }

    public final /* synthetic */ zzmn[] zzac(Handler handler, zzaci zzaciVar, zzqo zzqoVar, zzxu zzxuVar, zzun zzunVar) {
        zztx zztxVar = zztx.zza;
        Context context = this.zzb;
        zzsf zzsfVar = new zzsf(context, new zztj(context), zztxVar, false, handler, zzqoVar, new zzrl(context).zzd());
        Context context2 = this.zzb;
        return new zzmn[]{zzsfVar, new zzabj(context2, new zztj(context2), zztxVar, 0L, false, handler, zzaciVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzb(zzhb zzhbVar, zzhh zzhhVar, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzc(zzhb zzhbVar, zzhh zzhhVar, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzd(zzhb zzhbVar, zzhh zzhhVar, boolean z8) {
        if (zzhbVar instanceof zzhz) {
            synchronized (this.zzq) {
                this.zzs.add((zzhz) zzhbVar);
            }
        } else if (zzhbVar instanceof zzcgd) {
            this.zzt = (zzcgd) zzhbVar;
            final zzcee zzceeVar = (zzcee) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue() && zzceeVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgm
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i9 = zzcgq.zza;
                        zzcee.this.zzd("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zze(zzmy zzmyVar, zzan zzanVar, @Nullable zziy zziyVar) {
        zzcee zzceeVar = (zzcee) this.zzf.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue() && zzceeVar != null) {
            HashMap hashMap = new HashMap();
            String str = zzanVar.zzm;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = zzanVar.zzn;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = zzanVar.zzk;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            zzceeVar.zzd("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzf(zzmy zzmyVar, int i9, long j7, long j9) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzg(zzmy zzmyVar, zzvk zzvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzh(zzmy zzmyVar, int i9, long j7) {
        this.zzm += i9;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzi(zzct zzctVar, zzmz zzmzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzj(zzmy zzmyVar, zzvf zzvfVar, zzvk zzvkVar, IOException iOException, boolean z8) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            if (this.zze.zzk) {
                zzcduVar.zzl("onLoadException", iOException);
            } else {
                zzcduVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzk(zzmy zzmyVar, int i9) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            zzcduVar.zzm(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzl(zzmy zzmyVar, zzcj zzcjVar) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            zzcduVar.zzk("onPlayerError", zzcjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzm(zzmy zzmyVar, zzcs zzcsVar, zzcs zzcsVar2, int i9) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzn(zzmy zzmyVar, Object obj, long j7) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            zzcduVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzo(zzmy zzmyVar, zzix zzixVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzp(zzmy zzmyVar, zzan zzanVar, @Nullable zziy zziyVar) {
        zzcee zzceeVar = (zzcee) this.zzf.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue() && zzceeVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzanVar.zzu));
            hashMap.put("bitRate", String.valueOf(zzanVar.zzj));
            hashMap.put("resolution", zzanVar.zzs + "x" + zzanVar.zzt);
            String str = zzanVar.zzm;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = zzanVar.zzn;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = zzanVar.zzk;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            zzceeVar.zzd("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzq(zzmy zzmyVar, zzdv zzdvVar) {
        zzcdu zzcduVar = this.zzk;
        if (zzcduVar != null) {
            zzcduVar.zzD(zzdvVar.zzc, zzdvVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final long zzz() {
        return this.zzh.zzl();
    }
}

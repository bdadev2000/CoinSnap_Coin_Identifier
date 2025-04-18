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

/* loaded from: classes3.dex */
public final class zzces extends zzcbw implements zzhd, zzlz {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzced zzc;
    private final zzyb zzd;
    private final zzcce zze;
    private final WeakReference zzf;
    private final zzvv zzg;

    @Nullable
    private zzir zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbv zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;

    @Nullable
    private Integer zzr;
    private final ArrayList zzs;

    @Nullable
    private volatile zzcef zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzbW)).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:
    
        if (r5.zzl == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcej(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        if (r5.zzi == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzcem(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
    
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
    
        if (r4.limit() <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcen(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r5.zzh <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcek(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcel(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (r5.zzi == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzces(android.content.Context r4, com.google.android.gms.internal.ads.zzcce r5, com.google.android.gms.internal.ads.zzccf r6, @androidx.annotation.Nullable java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzces.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcce, com.google.android.gms.internal.ads.zzccf, java.lang.Integer):void");
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzcbw.zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzB() {
        if (!zzad()) {
            synchronized (this.zzq) {
                while (!this.zzs.isEmpty()) {
                    long j3 = this.zzn;
                    Map zze = ((zzgy) this.zzs.remove(0)).zze();
                    long j10 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfwa.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j10 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j3 + j10;
                }
            }
            return this.zzn;
        }
        return this.zzt.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    @Nullable
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zzut zzvgVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z10;
            int length = uriArr.length;
            if (length == 1) {
                zzvgVar = zzaa(uriArr[0]);
            } else {
                zzut[] zzutVarArr = new zzut[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    zzutVarArr[i10] = zzaa(uriArr[i10]);
                }
                zzvgVar = new zzvg(false, false, new zzuc(), zzutVarArr);
            }
            this.zzh.zzB(zzvgVar);
            this.zzh.zzp();
            zzcbw.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzH() {
        zzir zzirVar = this.zzh;
        if (zzirVar != null) {
            zzirVar.zzA(this);
            this.zzh.zzz();
            this.zzh = null;
            zzcbw.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzI(long j3) {
        zzi zziVar = (zzi) this.zzh;
        zziVar.zza(zziVar.zzd(), j3, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzJ(int i10) {
        this.zzc.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzK(int i10) {
        this.zzc.zzl(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzL(zzcbv zzcbvVar) {
        this.zzk = zzcbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzM(int i10) {
        this.zzc.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzN(int i10) {
        this.zzc.zzn(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzO(boolean z10) {
        this.zzh.zzq(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzP(@Nullable Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzQ(boolean z10) {
        if (this.zzh != null) {
            int i10 = 0;
            while (true) {
                this.zzh.zzx();
                if (i10 < 2) {
                    zzyb zzybVar = this.zzd;
                    zzxo zzc = zzybVar.zzf().zzc();
                    zzc.zzp(i10, !z10);
                    zzybVar.zzl(zzc);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzR(int i10) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcec zzcecVar = (zzcec) ((WeakReference) it.next()).get();
            if (zzcecVar != null) {
                zzcecVar.zzm(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzS(Surface surface, boolean z10) {
        zzir zzirVar = this.zzh;
        if (zzirVar != null) {
            zzirVar.zzr(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzT(float f10, boolean z10) {
        zzir zzirVar = this.zzh;
        if (zzirVar != null) {
            zzirVar.zzs(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzU() {
        this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final boolean zzV() {
        return this.zzh != null;
    }

    public final /* synthetic */ zzgd zzW(String str, boolean z10) {
        zzces zzcesVar = true != z10 ? null : this;
        zzcce zzcceVar = this.zze;
        return new zzcev(str, zzcesVar, zzcceVar.zzd, zzcceVar.zze, zzcceVar.zzm, zzcceVar.zzn);
    }

    public final /* synthetic */ zzgd zzX(String str, boolean z10) {
        zzces zzcesVar;
        if (true != z10) {
            zzcesVar = null;
        } else {
            zzcesVar = this;
        }
        zzcce zzcceVar = this.zze;
        zzcec zzcecVar = new zzcec(str, zzcesVar, zzcceVar.zzd, zzcceVar.zze, zzcceVar.zzh);
        this.zzu.add(new WeakReference(zzcecVar));
        return zzcecVar;
    }

    public final /* synthetic */ zzgd zzY(String str, boolean z10) {
        zzces zzcesVar;
        zzgl zzglVar = new zzgl();
        zzglVar.zzf(str);
        if (true != z10) {
            zzcesVar = null;
        } else {
            zzcesVar = this;
        }
        zzglVar.zze(zzcesVar);
        zzglVar.zzc(this.zze.zzd);
        zzglVar.zzd(this.zze.zze);
        zzglVar.zzb(true);
        return zzglVar.zza();
    }

    public final /* synthetic */ zzgd zzZ(zzgc zzgcVar) {
        zzgd zza2 = zzgcVar.zza();
        zzceq zzceqVar = new zzceq(this);
        return new zzcef(this.zzb, zza2, this.zzo, this.zzp, this, zzceqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zza(zzgd zzgdVar, zzgi zzgiVar, boolean z10, int i10) {
        this.zzl += i10;
    }

    public final zzut zzaa(Uri uri) {
        zzak zzakVar = new zzak();
        zzakVar.zzb(uri);
        zzaw zzc = zzakVar.zzc();
        zzvv zzvvVar = this.zzg;
        zzvvVar.zza(this.zze.zzf);
        return zzvvVar.zzb(zzc);
    }

    public final /* synthetic */ void zzab(boolean z10, long j3) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            zzcbvVar.zzi(z10, j3);
        }
    }

    public final /* synthetic */ zzln[] zzac(Handler handler, zzabg zzabgVar, zzpn zzpnVar, zzwu zzwuVar, zztp zztpVar) {
        zzta zztaVar = zzta.zza;
        Context context = this.zzb;
        zzrc zzrcVar = new zzrc(context, new zzsf(context), zztaVar, false, handler, zzpnVar, new zzqk(context).zzc());
        Context context2 = this.zzb;
        return new zzln[]{zzrcVar, new zzaai(context2, new zzsf(context2), zztaVar, 0L, false, handler, zzabgVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzb(zzgd zzgdVar, zzgi zzgiVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzc(zzgd zzgdVar, zzgi zzgiVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzd(zzgd zzgdVar, zzgi zzgiVar, boolean z10) {
        if (zzgdVar instanceof zzgy) {
            synchronized (this.zzq) {
                this.zzs.add((zzgy) zzgdVar);
            }
        } else if (zzgdVar instanceof zzcef) {
            this.zzt = (zzcef) zzgdVar;
            final zzccf zzccfVar = (zzccf) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue() && zzccfVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = zzces.zza;
                        zzccf.this.zzd("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zze(zzlx zzlxVar, zzad zzadVar, @Nullable zzhy zzhyVar) {
        zzccf zzccfVar = (zzccf) this.zzf.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue() && zzccfVar != null) {
            HashMap hashMap = new HashMap();
            String str = zzadVar.zzn;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = zzadVar.zzo;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = zzadVar.zzk;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            zzccfVar.zzd("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzf(zzlx zzlxVar, int i10, long j3, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzg(zzlx zzlxVar, zzun zzunVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzh(zzlx zzlxVar, int i10, long j3) {
        this.zzm += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzi(zzbp zzbpVar, zzly zzlyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzj(zzlx zzlxVar, zzui zzuiVar, zzun zzunVar, IOException iOException, boolean z10) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            if (this.zze.zzj) {
                zzcbvVar.zzl("onLoadException", iOException);
            } else {
                zzcbvVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzk(zzlx zzlxVar, int i10) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            zzcbvVar.zzm(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzl(zzlx zzlxVar, zzbi zzbiVar) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            zzcbvVar.zzk("onPlayerError", zzbiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzm(zzlx zzlxVar, zzbn zzbnVar, zzbn zzbnVar2, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzn(zzlx zzlxVar, Object obj, long j3) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            zzcbvVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzo(zzlx zzlxVar, zzhx zzhxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzp(zzlx zzlxVar, zzad zzadVar, @Nullable zzhy zzhyVar) {
        zzccf zzccfVar = (zzccf) this.zzf.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue() && zzccfVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzadVar.zzw));
            hashMap.put("bitRate", String.valueOf(zzadVar.zzj));
            hashMap.put("resolution", zzadVar.zzu + "x" + zzadVar.zzv);
            String str = zzadVar.zzn;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = zzadVar.zzo;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = zzadVar.zzk;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            zzccfVar.zzd("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzq(zzlx zzlxVar, zzci zzciVar) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            zzcbvVar.zzD(zzciVar.zzb, zzciVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzz() {
        return this.zzh.zzl();
    }
}

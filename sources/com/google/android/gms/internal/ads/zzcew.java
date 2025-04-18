package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
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
public final class zzcew extends zzcca implements zzhh, zzmd {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzceh zzc;
    private final zzyj zzd;
    private final zzcci zze;
    private final WeakReference zzf;
    private final zzwc zzg;

    @Nullable
    private zziu zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;

    @Nullable
    private Integer zzr;
    private final ArrayList zzs;

    @Nullable
    private volatile zzcej zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcv.zzbT)).booleanValue() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r5.zzl == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcen(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        if (r5.zzi == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzceq(r3, r6);
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
        r5 = new com.google.android.gms.internal.ads.zzcer(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r5.zzh <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzceo(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcep(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        if (r5.zzi == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzcew(android.content.Context r4, com.google.android.gms.internal.ads.zzcci r5, com.google.android.gms.internal.ads.zzccj r6, @androidx.annotation.Nullable java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcew.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcci, com.google.android.gms.internal.ads.zzccj, java.lang.Integer):void");
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzcca.zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j2 = this.zzn;
                Map zze = ((zzhc) this.zzs.remove(0)).zze();
                long j3 = 0;
                if (zze != null) {
                    Iterator it = zze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzfxi.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j3 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j2 + j3;
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    @Nullable
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z2) {
        zzva zzvnVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z2;
            int length = uriArr.length;
            if (length == 1) {
                zzvnVar = zzaa(uriArr[0]);
            } else {
                zzva[] zzvaVarArr = new zzva[length];
                for (int i2 = 0; i2 < uriArr.length; i2++) {
                    zzvaVarArr[i2] = zzaa(uriArr[i2]);
                }
                zzvnVar = new zzvn(false, false, new zzuj(), zzvaVarArr);
            }
            this.zzh.zzB(zzvnVar);
            this.zzh.zzp();
            zzcca.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzH() {
        zziu zziuVar = this.zzh;
        if (zziuVar != null) {
            zziuVar.zzA(this);
            this.zzh.zzz();
            this.zzh = null;
            zzcca.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzI(long j2) {
        zzj zzjVar = (zzj) this.zzh;
        zzjVar.zza(zzjVar.zzd(), j2, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzJ(int i2) {
        this.zzc.zzk(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzK(int i2) {
        this.zzc.zzl(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzL(zzcbz zzcbzVar) {
        this.zzk = zzcbzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzM(int i2) {
        this.zzc.zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzN(int i2) {
        this.zzc.zzn(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzO(boolean z2) {
        this.zzh.zzq(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzP(@Nullable Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzQ(boolean z2) {
        if (this.zzh == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            this.zzh.zzx();
            if (i2 >= 2) {
                return;
            }
            zzyj zzyjVar = this.zzd;
            zzxw zzc = zzyjVar.zzf().zzc();
            zzc.zzp(i2, !z2);
            zzyjVar.zzl(zzc);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzR(int i2) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzceg zzcegVar = (zzceg) ((WeakReference) it.next()).get();
            if (zzcegVar != null) {
                zzcegVar.zzm(i2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzS(Surface surface, boolean z2) {
        zziu zziuVar = this.zzh;
        if (zziuVar != null) {
            zziuVar.zzr(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzT(float f2, boolean z2) {
        zziu zziuVar = this.zzh;
        if (zziuVar != null) {
            zziuVar.zzs(f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzU() {
        this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final boolean zzV() {
        return this.zzh != null;
    }

    public final /* synthetic */ zzgg zzW(String str, boolean z2) {
        zzcew zzcewVar = true != z2 ? null : this;
        zzcci zzcciVar = this.zze;
        return new zzcez(str, zzcewVar, zzcciVar.zzd, zzcciVar.zze, zzcciVar.zzm, zzcciVar.zzn);
    }

    public final /* synthetic */ zzgg zzX(String str, boolean z2) {
        zzcew zzcewVar = true != z2 ? null : this;
        zzcci zzcciVar = this.zze;
        zzceg zzcegVar = new zzceg(str, zzcewVar, zzcciVar.zzd, zzcciVar.zze, zzcciVar.zzh);
        this.zzu.add(new WeakReference(zzcegVar));
        return zzcegVar;
    }

    public final /* synthetic */ zzgg zzY(String str, boolean z2) {
        zzgp zzgpVar = new zzgp();
        zzgpVar.zzf(str);
        zzgpVar.zze(true != z2 ? null : this);
        zzgpVar.zzc(this.zze.zzd);
        zzgpVar.zzd(this.zze.zze);
        zzgpVar.zzb(true);
        return zzgpVar.zza();
    }

    public final /* synthetic */ zzgg zzZ(zzgf zzgfVar) {
        zzgg zza2 = zzgfVar.zza();
        zzceu zzceuVar = new zzceu(this);
        return new zzcej(this.zzb, zza2, this.zzo, this.zzp, this, zzceuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zza(zzgg zzggVar, zzgm zzgmVar, boolean z2, int i2) {
        this.zzl += i2;
    }

    @VisibleForTesting
    public final zzva zzaa(Uri uri) {
        zzam zzamVar = new zzam();
        zzamVar.zzb(uri);
        zzbc zzc = zzamVar.zzc();
        zzwc zzwcVar = this.zzg;
        zzwcVar.zza(this.zze.zzf);
        return zzwcVar.zzb(zzc);
    }

    public final /* synthetic */ void zzab(boolean z2, long j2) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzi(z2, j2);
        }
    }

    public final /* synthetic */ zzlr[] zzac(Handler handler, zzabq zzabqVar, zzpr zzprVar, zzxb zzxbVar, zztw zztwVar) {
        zztg zztgVar = zztg.zza;
        Context context = this.zzb;
        zzri zzriVar = new zzri(context, new zzsl(context), zztgVar, false, handler, zzprVar, new zzqo(context).zzc());
        Context context2 = this.zzb;
        return new zzlr[]{zzriVar, new zzaas(context2, new zzsl(context2), zztgVar, 0L, false, handler, zzabqVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzb(zzgg zzggVar, zzgm zzgmVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzc(zzgg zzggVar, zzgm zzgmVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzd(zzgg zzggVar, zzgm zzgmVar, boolean z2) {
        if (zzggVar instanceof zzhc) {
            synchronized (this.zzq) {
                this.zzs.add((zzhc) zzggVar);
            }
        } else if (zzggVar instanceof zzcej) {
            this.zzt = (zzcej) zzggVar;
            final zzccj zzccjVar = (zzccj) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbT)).booleanValue() && zzccjVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzces
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = zzcew.zza;
                        zzccj.this.zzd("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zze(zzmb zzmbVar, zzaf zzafVar, @Nullable zzib zzibVar) {
        zzccj zzccjVar = (zzccj) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbT)).booleanValue() || zzccjVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzafVar.zzm;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzafVar.zzn;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzafVar.zzj;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzccjVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzf(zzmb zzmbVar, int i2, long j2, long j3) {
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzg(zzmb zzmbVar, zzuu zzuuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzh(zzmb zzmbVar, int i2, long j2) {
        this.zzm += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzi(zzbw zzbwVar, zzmc zzmcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzj(zzmb zzmbVar, zzup zzupVar, zzuu zzuuVar, IOException iOException, boolean z2) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            if (this.zze.zzj) {
                zzcbzVar.zzl("onLoadException", iOException);
            } else {
                zzcbzVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzk(zzmb zzmbVar, int i2) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzm(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzl(zzmb zzmbVar, zzbp zzbpVar) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzk("onPlayerError", zzbpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzm(zzmb zzmbVar, zzbv zzbvVar, zzbv zzbvVar2, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzn(zzmb zzmbVar, Object obj, long j2) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzo(zzmb zzmbVar, zzia zziaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzp(zzmb zzmbVar, zzaf zzafVar, @Nullable zzib zzibVar) {
        zzccj zzccjVar = (zzccj) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbT)).booleanValue() || zzccjVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzafVar.zzv));
        hashMap.put("bitRate", String.valueOf(zzafVar.zzi));
        hashMap.put("resolution", zzafVar.zzt + "x" + zzafVar.zzu);
        String str = zzafVar.zzm;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzafVar.zzn;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzafVar.zzj;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzccjVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzq(zzmb zzmbVar, zzcp zzcpVar) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzD(zzcpVar.zzb, zzcpVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzz() {
        return this.zzh.zzl();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbyf implements zzbyk {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());

    @VisibleForTesting
    boolean zza;
    private final zzhff zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbyh zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbyf(Context context, VersionInfoParcel versionInfoParcel, zzbyh zzbyhVar, @Nullable String str, zzbyg zzbygVar) {
        Preconditions.checkNotNull(zzbyhVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbyhVar;
        Iterator it = zzbyhVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhff zzc2 = zzhhe.zzc();
        zzc2.zzn(9);
        zzc2.zzj(str);
        zzc2.zzh(str);
        zzhfg zzc3 = zzhfh.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc3.zza(str2);
        }
        zzc2.zzg((zzhfh) zzc3.zzbr());
        zzhgv zzc4 = zzhgw.zzc();
        zzc4.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzc4.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc4.zzb(apkVersion);
        }
        zzc2.zzf((zzhgw) zzc4.zzbr());
        this.zzd = zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final zzbyh zza() {
        return this.zzi;
    }

    public final /* synthetic */ ListenableFuture zzb(Map map) throws Exception {
        zzhgt zzhgtVar;
        ListenableFuture zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            try {
                                int length = optJSONArray.length();
                                synchronized (this.zzj) {
                                    zzhgtVar = (zzhgt) this.zze.get(str);
                                }
                                if (zzhgtVar == null) {
                                    zzbyj.zza("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i2 = 0; i2 < length; i2++) {
                                        zzhgtVar.zza(optJSONArray.getJSONObject(i2).getString("threat_type"));
                                    }
                                    this.zza = (length > 0) | this.zza;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbez.zza.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzgfo.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z2 = this.zza;
        if (!(z2 && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z2 || !this.zzi.zzd))) {
            return zzgfo.zzh(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzc((zzhgu) ((zzhgt) it.next()).zzbr());
                }
                this.zzd.zza(this.zzf);
                this.zzd.zzb(this.zzg);
                if (zzbyj.zzb()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                    for (zzhgu zzhguVar : this.zzd.zzm()) {
                        sb.append("    [");
                        sb.append(zzhguVar.zzc());
                        sb.append("] ");
                        sb.append(zzhguVar.zzf());
                    }
                    zzbyj.zza(sb.toString());
                }
                ListenableFuture zzb2 = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhhe) this.zzd.zzbr()).zzaV());
                if (zzbyj.zzb()) {
                    zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbyc
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbyj.zza("Pinged SB successfully.");
                        }
                    }, zzcan.zza);
                }
                zzm = zzgfo.zzm(zzb2, new zzfxq() { // from class: com.google.android.gms.internal.ads.zzbyd
                    @Override // com.google.android.gms.internal.ads.zzfxq
                    public final Object apply(Object obj) {
                        int i3 = zzbyf.zzb;
                        return null;
                    }
                }, zzcan.zzf);
            } finally {
            }
        }
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzd(String str, Map map, int i2) {
        synchronized (this.zzj) {
            if (i2 == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zze.containsKey(str)) {
                if (i2 == 3) {
                    ((zzhgt) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzhgt zzd = zzhgu.zzd();
            int zza = zzhgs.zza(i2);
            if (zza != 0) {
                zzd.zze(zza);
            }
            zzd.zzb(this.zze.size());
            zzd.zzd(str);
            zzhfs zzc2 = zzhfv.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhfq zzc3 = zzhfr.zzc();
                        zzc3.zza(zzgzs.zzw(str2));
                        zzc3.zzb(zzgzs.zzw(str3));
                        zzc2.zza((zzhfr) zzc3.zzbr());
                    }
                }
            }
            zzd.zzc((zzhfv) zzc2.zzbr());
            this.zze.put(str, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture zzh = zzgfo.zzh(Collections.emptyMap());
            zzgev zzgevVar = new zzgev() { // from class: com.google.android.gms.internal.ads.zzbya
                @Override // com.google.android.gms.internal.ads.zzgev
                public final ListenableFuture zza(Object obj) {
                    return zzbyf.this.zzb((Map) obj);
                }
            };
            zzgfz zzgfzVar = zzcan.zzf;
            ListenableFuture zzn = zzgfo.zzn(zzh, zzgevVar, zzgfzVar);
            ListenableFuture zzo = zzgfo.zzo(zzn, 10L, TimeUnit.SECONDS, zzcan.zzd);
            zzgfo.zzr(zzn, new zzbye(this, zzo), zzgfzVar);
            zzc.add(zzo);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgzr zzt = zzgzs.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzhff zzhffVar = this.zzd;
            zzhgn zzc2 = zzhgp.zzc();
            zzc2.zza(zzt.zzb());
            zzc2.zzb("image/png");
            zzc2.zzc(2);
            zzhffVar.zzi((zzhgp) zzc2.zzbr());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzbyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbyh r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L95
            com.google.android.gms.ads.internal.zzu.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6f
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L26
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L26
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L26
            if (r3 == 0) goto L28
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L26
            goto L29
        L26:
            r2 = move-exception
            goto L2f
        L28:
            r3 = r1
        L29:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2d
            goto L35
        L2d:
            r2 = move-exception
            goto L30
        L2f:
            r3 = r1
        L30:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r2)
        L35:
            if (r3 != 0) goto L6e
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L60
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L60
            if (r2 == 0) goto L62
            if (r3 != 0) goto L44
            goto L62
        L44:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L60
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L60
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L60
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L60
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L60
            r1 = r4
            goto L6f
        L60:
            r8 = move-exception
            goto L68
        L62:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r8)     // Catch: java.lang.RuntimeException -> L60
            goto L6f
        L68:
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r8)
            goto L6f
        L6e:
            r1 = r3
        L6f:
            if (r1 != 0) goto L77
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbyj.zza(r8)
            return
        L77:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbyb r8 = new com.google.android.gms.internal.ads.zzbyb
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L90
            r8.run()
            return
        L90:
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            r0.execute(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyf.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzh(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzd();
                } else {
                    this.zzd.zze(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}

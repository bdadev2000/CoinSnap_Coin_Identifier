package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
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
public final class zzcaa implements zzcaf {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhgn zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzcac zzi;
    private final zzcab zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcaa(Context context, VersionInfoParcel versionInfoParcel, zzcac zzcacVar, @Nullable String str, zzcab zzcabVar) {
        Preconditions.checkNotNull(zzcacVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzcabVar;
        this.zzi = zzcacVar;
        Iterator it = zzcacVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhgn zzc2 = zzhjh.zzc();
        zzc2.zzj(zzhim.OCTAGON_AD);
        zzc2.zzk(str);
        zzc2.zzh(str);
        zzhgo zzc3 = zzhgp.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc3.zza(str2);
        }
        zzc2.zzg((zzhgp) zzc3.zzbr());
        zzhis zzc4 = zzhit.zzc();
        zzc4.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzc4.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc4.zzb(apkVersion);
        }
        zzc2.zzf((zzhit) zzc4.zzbr());
        this.zzd = zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final zzcac zza() {
        return this.zzi;
    }

    public final /* synthetic */ f4.c zzb(Map map) throws Exception {
        zzhiq zzhiqVar;
        f4.c zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            try {
                                int length = optJSONArray.length();
                                synchronized (this.zzj) {
                                    zzhiqVar = (zzhiq) this.zze.get(str);
                                }
                                if (zzhiqVar == null) {
                                    zzcae.zza("Cannot find the corresponding resource object for " + str);
                                } else {
                                    boolean z8 = false;
                                    for (int i9 = 0; i9 < length; i9++) {
                                        zzhiqVar.zza(optJSONArray.getJSONObject(i9).getString("threat_type"));
                                    }
                                    boolean z9 = this.zza;
                                    if (length > 0) {
                                        z8 = true;
                                    }
                                    this.zza = z8 | z9;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } catch (JSONException e4) {
                if (((Boolean) zzbgs.zzb.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to get SafeBrowsing metadata", e4);
                }
                return zzgft.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzj(zzhim.OCTAGON_AD_SB_MATCH);
            }
        }
        boolean z10 = this.zza;
        if ((z10 && this.zzi.zzg) || ((this.zzm && this.zzi.zzf) || (!z10 && this.zzi.zzd))) {
            synchronized (this.zzj) {
                try {
                    Iterator it = this.zze.values().iterator();
                    while (it.hasNext()) {
                        this.zzd.zzc((zzhir) ((zzhiq) it.next()).zzbr());
                    }
                    this.zzd.zza(this.zzf);
                    this.zzd.zzb(this.zzg);
                    if (zzcae.zzb()) {
                        StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzm() + "\n  clickUrl: " + this.zzd.zzl() + "\n  resources: \n");
                        for (zzhir zzhirVar : this.zzd.zzn()) {
                            sb.append("    [");
                            sb.append(zzhirVar.zzc());
                            sb.append("] ");
                            sb.append(zzhirVar.zzg());
                        }
                        zzcae.zza(sb.toString());
                    }
                    f4.c zzb2 = new com.google.android.gms.ads.internal.util.zzbq(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhjh) this.zzd.zzbr()).zzaV());
                    if (zzcae.zzb()) {
                        zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzx
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcae.zza("Pinged SB successfully.");
                            }
                        }, zzcci.zza);
                    }
                    zzm = zzgft.zzm(zzb2, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbzy
                        @Override // com.google.android.gms.internal.ads.zzfxu
                        public final Object apply(Object obj) {
                            int i10 = zzcaa.zzb;
                            return null;
                        }
                    }, zzcci.zzf);
                } finally {
                }
            }
            return zzm;
        }
        return zzgft.zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzd(String str, Map map, int i9) {
        String str2;
        String str3;
        zzhip zzhipVar;
        synchronized (this.zzj) {
            if (i9 == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zze.containsKey(str)) {
                if (i9 == 3 && (zzhipVar = zzhip.AD_RESOURCE_AUTO_CLICK_DESTINATION) != null) {
                    ((zzhiq) this.zze.get(str)).zzb(zzhipVar);
                }
                return;
            }
            zzhiq zze = zzhir.zze();
            zzhip zzb2 = zzhip.zzb(i9);
            if (zzb2 != null) {
                zze.zzb(zzb2);
            }
            zze.zzc(this.zze.size());
            zze.zze(str);
            zzhhe zzc2 = zzhhh.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        str2 = (String) entry.getKey();
                    } else {
                        str2 = "";
                    }
                    if (entry.getValue() != null) {
                        str3 = (String) entry.getValue();
                    } else {
                        str3 = "";
                    }
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhhc zzc3 = zzhhd.zzc();
                        zzc3.zza(zzhac.zzw(str2));
                        zzc3.zzb(zzhac.zzw(str3));
                        zzc2.zza((zzhhd) zzc3.zzbr());
                    }
                }
            }
            zze.zzd((zzhhh) zzc2.zzbr());
            this.zze.put(str, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            f4.c zzh = zzgft.zzh(Collections.emptyMap());
            zzgfa zzgfaVar = new zzgfa() { // from class: com.google.android.gms.internal.ads.zzbzv
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final f4.c zza(Object obj) {
                    return zzcaa.this.zzb((Map) obj);
                }
            };
            zzgge zzggeVar = zzcci.zzf;
            f4.c zzn = zzgft.zzn(zzh, zzgfaVar, zzggeVar);
            f4.c zzo = zzgft.zzo(zzn, 10L, TimeUnit.SECONDS, zzcci.zzd);
            zzgft.zzr(zzn, new zzbzz(this, zzo), zzggeVar);
            zzc.add(zzo);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgzz zzt = zzhac.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzhgn zzhgnVar = this.zzd;
            zzhif zzc2 = zzhij.zzc();
            zzc2.zza(zzt.zzb());
            zzc2.zzb("image/png");
            zzc2.zzc(zzhii.TYPE_CREATIVE);
            zzhgnVar.zzi((zzhij) zzc2.zzbr());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzcaf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcac r0 = r7.zzi
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
            com.google.android.gms.internal.ads.zzcae.zza(r8)
            return
        L77:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbzw r8 = new com.google.android.gms.internal.ads.zzbzw
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L90
            r8.run()
            return
        L90:
            com.google.android.gms.internal.ads.zzgge r0 = com.google.android.gms.internal.ads.zzcci.zza
            r0.execute(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcaa.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
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

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final boolean zzi() {
        if (PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl) {
            return true;
        }
        return false;
    }
}

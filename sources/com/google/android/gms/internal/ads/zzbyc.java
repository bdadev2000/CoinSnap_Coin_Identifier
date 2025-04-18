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

/* loaded from: classes3.dex */
public final class zzbyc implements zzbyh {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhct zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbye zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbyc(Context context, VersionInfoParcel versionInfoParcel, zzbye zzbyeVar, @Nullable String str, zzbyd zzbydVar) {
        Preconditions.checkNotNull(zzbyeVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbyeVar;
        Iterator it = zzbyeVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhct zzc2 = zzhes.zzc();
        zzc2.zzn(9);
        zzc2.zzj(str);
        zzc2.zzh(str);
        zzhcu zzc3 = zzhcv.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc3.zza(str2);
        }
        zzc2.zzg((zzhcv) zzc3.zzbr());
        zzhej zzc4 = zzhek.zzc();
        zzc4.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzc4.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc4.zzb(apkVersion);
        }
        zzc2.zzf((zzhek) zzc4.zzbr());
        this.zzd = zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final zzbye zza() {
        return this.zzi;
    }

    public final /* synthetic */ ua.b zzb(Map map) throws Exception {
        zzheh zzhehVar;
        ua.b zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzhehVar = (zzheh) this.zze.get(str);
                            }
                            if (zzhehVar == null) {
                                zzbyg.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                boolean z10 = false;
                                for (int i10 = 0; i10 < length; i10++) {
                                    zzhehVar.zza(optJSONArray.getJSONObject(i10).getString("threat_type"));
                                }
                                boolean z11 = this.zza;
                                if (length > 0) {
                                    z10 = true;
                                }
                                this.zza = z10 | z11;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (((Boolean) zzbev.zza.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to get SafeBrowsing metadata", e2);
                }
                return zzgei.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z12 = this.zza;
        if ((z12 && this.zzi.zzg) || ((this.zzm && this.zzi.zzf) || (!z12 && this.zzi.zzd))) {
            synchronized (this.zzj) {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzc((zzhei) ((zzheh) it.next()).zzbr());
                }
                this.zzd.zza(this.zzf);
                this.zzd.zzb(this.zzg);
                if (zzbyg.zzb()) {
                    StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                    for (zzhei zzheiVar : this.zzd.zzm()) {
                        sb2.append("    [");
                        sb2.append(zzheiVar.zzc());
                        sb2.append("] ");
                        sb2.append(zzheiVar.zzg());
                    }
                    zzbyg.zza(sb2.toString());
                }
                ua.b zzb2 = new com.google.android.gms.ads.internal.util.zzbn(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhes) this.zzd.zzbr()).zzaV());
                if (zzbyg.zzb()) {
                    zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbyg.zza("Pinged SB successfully.");
                        }
                    }, zzcaj.zza);
                }
                zzm = zzgei.zzm(zzb2, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbya
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        int i11 = zzbyc.zzb;
                        return null;
                    }
                }, zzcaj.zzf);
            }
            return zzm;
        }
        return zzgei.zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final void zzd(String str, Map map, int i10) {
        String str2;
        String str3;
        synchronized (this.zzj) {
            if (i10 == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i10 == 3) {
                    ((zzheh) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzheh zzd = zzhei.zzd();
            int zza = zzheg.zza(i10);
            if (zza != 0) {
                zzd.zze(zza);
            }
            zzd.zzb(this.zze.size());
            zzd.zzd(str);
            zzhdg zzc2 = zzhdj.zzc();
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
                        zzhde zzc3 = zzhdf.zzc();
                        zzc3.zza(zzgxp.zzw(str2));
                        zzc3.zzb(zzgxp.zzw(str3));
                        zzc2.zza((zzhdf) zzc3.zzbr());
                    }
                }
            }
            zzd.zzc((zzhdj) zzc2.zzbr());
            this.zze.put(str, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ua.b zzh = zzgei.zzh(Collections.emptyMap());
            zzgdp zzgdpVar = new zzgdp() { // from class: com.google.android.gms.internal.ads.zzbxx
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    return zzbyc.this.zzb((Map) obj);
                }
            };
            zzges zzgesVar = zzcaj.zzf;
            ua.b zzn = zzgei.zzn(zzh, zzgdpVar, zzgesVar);
            ua.b zzo = zzgei.zzo(zzn, 10L, TimeUnit.SECONDS, zzcaj.zzd);
            zzgei.zzr(zzn, new zzbyb(this, zzo), zzgesVar);
            zzc.add(zzo);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgxn zzt = zzgxp.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzhct zzhctVar = this.zzd;
            zzheb zzc2 = zzhed.zzc();
            zzc2.zza(zzt.zzb());
            zzc2.zzb("image/png");
            zzc2.zzc(2);
            zzhctVar.zzi((zzhed) zzc2.zzbr());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    @Override // com.google.android.gms.internal.ads.zzbyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbye r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L93
            com.google.android.gms.ads.internal.zzv.zzq()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbyg.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbxy r8 = new com.google.android.gms.internal.ads.zzbxy
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L8e
            r8.run()
            return
        L8e:
            com.google.android.gms.internal.ads.zzges r0 = com.google.android.gms.internal.ads.zzcaj.zza
            r0.execute(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyc.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}

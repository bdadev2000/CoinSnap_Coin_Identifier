package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes2.dex */
public final class zzbeu {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbeu zzbeuVar) {
        while (true) {
            try {
                zzbfe zzbfeVar = (zzbfe) zzbeuVar.zza.take();
                zzbfd zza = zzbfeVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbeuVar.zzg(zzbeuVar.zzb(zzbeuVar.zzb, zzbfeVar.zzb()), zza);
                }
            } catch (InterruptedException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter:reporter interrupted", e4);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbfd zzbfdVar) {
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbfdVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbfdVar.zzb())) {
                sb.append("&it=");
                sb.append(zzbfdVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbfdVar.zza())) {
                sb.append("&blat=");
                sb.append(zzbfdVar.zza());
            }
            uri = sb.toString();
        }
        if (this.zzh.get()) {
            File file = this.zzi;
            if (file != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                        try {
                            fileOutputStream2.write(uri.getBytes());
                            fileOutputStream2.write(10);
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e4) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                            }
                        } catch (IOException e9) {
                            e = e9;
                            fileOutputStream = fileOutputStream2;
                            com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e10) {
                                    com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e11) {
                                    com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e12) {
                    e = e12;
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            }
        } else {
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzL(this.zze, this.zzf, uri);
        }
    }

    public final zzbfa zza(String str) {
        zzbfa zzbfaVar = (zzbfa) this.zzc.get(str);
        if (zzbfaVar != null) {
            return zzbfaVar;
        }
        return zzbfa.zza;
    }

    public final Map zzb(Map map, @Nullable Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zza(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbgf.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(zzftv.zza(zzftu.zza(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbet
            @Override // java.lang.Runnable
            public final void run() {
                zzbeu.zzc(zzbeu.this);
            }
        });
        Map map2 = this.zzc;
        zzbfa zzbfaVar = zzbfa.zzb;
        map2.put("action", zzbfaVar);
        this.zzc.put("ad_format", zzbfaVar);
        this.zzc.put("e", zzbfa.zzc);
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbfe zzbfeVar) {
        return this.zza.offer(zzbfeVar);
    }
}

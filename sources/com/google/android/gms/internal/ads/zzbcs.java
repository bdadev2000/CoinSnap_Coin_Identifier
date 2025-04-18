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
/* loaded from: classes3.dex */
public final class zzbcs {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbcs zzbcsVar) {
        while (true) {
            try {
                zzbdc zzbdcVar = (zzbdc) zzbcsVar.zza.take();
                zzbdb zza = zzbdcVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbcsVar.zzg(zzbcsVar.zzb(zzbcsVar.zzb, zzbdcVar.zzb()), zza);
                }
            } catch (InterruptedException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter:reporter interrupted", e2);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbdb zzbdbVar) {
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbdbVar != null) {
            StringBuilder sb2 = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbdbVar.zzb())) {
                sb2.append("&it=");
                sb2.append(zzbdbVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbdbVar.zza())) {
                sb2.append("&blat=");
                sb2.append(zzbdbVar.zza());
            }
            uri = sb2.toString();
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
                            } catch (IOException e2) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                            }
                        } catch (IOException e10) {
                            e = e10;
                            fileOutputStream = fileOutputStream2;
                            com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e11) {
                                    com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e12) {
                                    com.google.android.gms.ads.internal.util.client.zzm.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            }
        } else {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzL(this.zze, this.zzf, uri);
        }
    }

    public final zzbcy zza(String str) {
        zzbcy zzbcyVar = (zzbcy) this.zzc.get(str);
        return zzbcyVar != null ? zzbcyVar : zzbcy.zza;
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
        atomicBoolean.set(((Boolean) zzbei.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(zzfsc.zza(zzfsb.zza(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcr
            @Override // java.lang.Runnable
            public final void run() {
                zzbcs.zzc(zzbcs.this);
            }
        });
        Map map2 = this.zzc;
        zzbcy zzbcyVar = zzbcy.zzb;
        map2.put("action", zzbcyVar);
        this.zzc.put("ad_format", zzbcyVar);
        this.zzc.put("e", zzbcy.zzc);
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

    public final boolean zzf(zzbdc zzbdcVar) {
        return this.zza.offer(zzbdcVar);
    }
}

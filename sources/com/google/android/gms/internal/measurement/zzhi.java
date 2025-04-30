package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x.l;

/* loaded from: classes2.dex */
public final class zzhi implements zzgn {
    private static final Map<String, zzhi> zza = new l();
    private final SharedPreferences zzb;
    private final Runnable zzc;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzd;
    private final Object zze;
    private volatile Map<String, ?> zzf;
    private final List<zzgl> zzg;

    private zzhi(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.zzhl
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                zzhi.this.zza(sharedPreferences2, str);
            }
        };
        this.zzd = onSharedPreferenceChangeListener;
        this.zze = new Object();
        this.zzg = new ArrayList();
        this.zzb = sharedPreferences;
        this.zzc = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences zza(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (zzgi.zza()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return sharedPreferences;
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    @Nullable
    public static zzhi zza(Context context, String str, Runnable runnable) {
        zzhi zzhiVar;
        if (!((!zzgi.zza() || str.startsWith("direct_boot:")) ? true : zzgi.zzb(context))) {
            return null;
        }
        synchronized (zzhi.class) {
            try {
                Map<String, zzhi> map = zza;
                zzhiVar = map.get(str);
                if (zzhiVar == null) {
                    zzhiVar = new zzhi(zza(context, str), runnable);
                    map.put(str, zzhiVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhiVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    @Nullable
    public final Object zza(String str) {
        Map<String, ?> map = this.zzf;
        if (map == null) {
            synchronized (this.zze) {
                try {
                    map = this.zzf;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.zzb.getAll();
                            this.zzf = all;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static synchronized void zza() {
        synchronized (zzhi.class) {
            try {
                for (zzhi zzhiVar : zza.values()) {
                    zzhiVar.zzb.unregisterOnSharedPreferenceChangeListener(zzhiVar.zzd);
                }
                zza.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zze) {
            this.zzf = null;
            this.zzc.run();
        }
        synchronized (this) {
            try {
                Iterator<zzgl> it = this.zzg.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzcau {
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();

    @Nullable
    private String zzd = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zze = new AtomicInteger(-1);
    private final AtomicReference zzf = new AtomicReference(null);
    private final AtomicReference zzg = new AtomicReference(null);
    private final ConcurrentMap zzh = new ConcurrentHashMap(9);
    private final AtomicReference zzi = new AtomicReference(null);
    private final BlockingQueue zzj = new ArrayBlockingQueue(20);
    private final Object zzk = new Object();

    public static final boolean zzq(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzai)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaj)).intValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzak)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    @Nullable
    private final Object zzr(String str, Context context) {
        if (!zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return null;
        }
        try {
            return zzs(context, str).invoke(this.zzf.get(), null);
        } catch (Exception unused) {
            zzv(str, true);
            return null;
        }
    }

    @Nullable
    private final Method zzs(Context context, String str) {
        Method method = (Method) this.zzh.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.zzh.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzv(str, false);
            return null;
        }
    }

    private final void zzt(Context context, String str, String str2) {
        if (!zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return;
        }
        Method method = (Method) this.zzh.get(str2);
        if (method == null) {
            try {
                method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                this.zzh.put(str2, method);
            } catch (Exception unused) {
                zzv(str2, false);
                method = null;
            }
        }
        try {
            method.invoke(this.zzf.get(), str);
            com.google.android.gms.ads.internal.util.zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
        } catch (Exception unused2) {
            zzv(str2, false);
        }
    }

    private final void zzu(Context context, String str, String str2, @Nullable Bundle bundle) {
        if (zzp(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e4);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                Method method = (Method) this.zzh.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzh.put("logEventInternal", method);
                    } catch (Exception unused) {
                        zzv("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzf.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzv("logEventInternal", true);
                }
            }
        }
    }

    private final void zzv(String str, boolean z8) {
        if (!this.zza.get()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Invoke Firebase method " + str + " error.");
            if (z8) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zza.set(true);
            }
        }
    }

    private final boolean zzw(Context context, String str, AtomicReference atomicReference, boolean z8) {
        if (atomicReference.get() == null) {
            try {
                zzcar.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
                return true;
            } catch (Exception unused) {
                zzv("getInstance", z8);
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final String zza(Context context) {
        Object zzr;
        if (zzp(context) && (zzr = zzr("generateEventId", context)) != null) {
            return zzr.toString();
        }
        return null;
    }

    @Nullable
    public final String zzb(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!zzp(context)) {
            return null;
        }
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzag)).longValue();
        if (longValue < 0) {
            return (String) zzr("getAppInstanceId", context);
        }
        if (this.zzb.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = zzfuu.zza().zzc(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzah)).intValue(), new zzcat(this), 2);
            } else {
                zzbeg zzbegVar = zzbep.zzah;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzcat(this));
            }
            zzcar.zza(this.zzb, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) this.zzb.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcas
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzcau.this.zze(context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String zzc(Context context) {
        if (zzp(context) && zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            try {
                String str = (String) zzs(context, "getCurrentScreenName").invoke(this.zzf.get(), null);
                if (str == null) {
                    str = (String) zzs(context, "getCurrentScreenClass").invoke(this.zzf.get(), null);
                }
                if (str == null) {
                    return "";
                }
                return str;
            } catch (Exception unused) {
                zzv("getCurrentScreenName", false);
            }
        }
        return "";
    }

    @Nullable
    public final String zzd(Context context) {
        if (!zzp(context)) {
            return null;
        }
        synchronized (this.zzc) {
            try {
                String str = this.zzd;
                if (str != null) {
                    return str;
                }
                String str2 = (String) zzr("getGmpAppId", context);
                this.zzd = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ String zze(Context context) throws Exception {
        return (String) zzr("getAppInstanceId", context);
    }

    public final void zzf(Context context, String str) {
        if (!zzp(context)) {
            return;
        }
        zzt(context, str, "beginAdUnitExposure");
    }

    public final void zzg(Context context, String str) {
        if (!zzp(context)) {
            return;
        }
        zzt(context, str, "endAdUnitExposure");
    }

    public final void zzh(Context context, String str) {
        zzu(context, "_aa", str, null);
    }

    public final void zzi(Context context, String str) {
        zzu(context, "_aq", str, null);
    }

    public final void zzj(Context context, @Nullable String str, @Nullable Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str2 : map.keySet()) {
                bundle.putString(str2, (String) map.get(str2));
            }
        }
        zzu(context, "_ac", str, bundle);
    }

    public final void zzk(Context context, @Nullable String str, @Nullable Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str2 : map.keySet()) {
                bundle.putString(str2, (String) map.get(str2));
            }
        }
        zzu(context, "_ai", str, bundle);
    }

    public final void zzl(Context context, String str, String str2, String str3, int i9) {
        if (!zzp(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str2);
        bundle.putString("reward_type", str3);
        bundle.putInt("reward_value", i9);
        zzu(context, "_ar", str, bundle);
        com.google.android.gms.ads.internal.util.zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i9);
    }

    public final void zzm(Context context, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzan)).booleanValue() && zzp(context) && zzq(context)) {
            synchronized (this.zzk) {
            }
        }
    }

    public final void zzn(Context context, com.google.android.gms.ads.internal.client.zzff zzffVar) {
        zzcav.zzd(context).zzb().zzc(zzffVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzan)).booleanValue() && zzp(context) && zzq(context)) {
            synchronized (this.zzk) {
            }
        }
    }

    @Deprecated
    public final void zzo(Context context, String str) {
        if (zzp(context) && (context instanceof Activity) && zzw(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            Method method = (Method) this.zzh.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.zzh.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    zzv("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                zzv("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzp(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaa)).booleanValue() && !this.zza.get()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzal)).booleanValue()) {
                return true;
            }
            if (this.zze.get() == -1) {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (!com.google.android.gms.ads.internal.util.client.zzf.zzt(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzu(context)) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zze.set(0);
                    }
                }
                this.zze.set(1);
            }
            if (this.zze.get() == 1) {
                return true;
            }
        }
        return false;
    }
}

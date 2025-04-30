package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfyt;

/* loaded from: classes2.dex */
public class zzm {
    protected static final zzfyt zza = zzfyt.zzb(4000);

    public static String zzd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            return str + " @" + stackTrace[3].getLineNumber();
        }
        return str;
    }

    public static void zze(String str) {
        if (zzm(3)) {
            if (str != null && str.length() > 4000) {
                boolean z8 = true;
                for (String str2 : zza.zzd(str)) {
                    if (z8) {
                        Log.d("Ads", str2);
                    } else {
                        Log.d("Ads-cont", str2);
                    }
                    z8 = false;
                }
                return;
            }
            Log.d("Ads", str);
        }
    }

    public static void zzf(String str, Throwable th) {
        if (zzm(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void zzg(String str) {
        if (zzm(6)) {
            if (str != null && str.length() > 4000) {
                boolean z8 = true;
                for (String str2 : zza.zzd(str)) {
                    if (z8) {
                        Log.e("Ads", str2);
                    } else {
                        Log.e("Ads-cont", str2);
                    }
                    z8 = false;
                }
                return;
            }
            Log.e("Ads", str);
        }
    }

    public static void zzh(String str, Throwable th) {
        if (zzm(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void zzi(String str) {
        if (zzm(4)) {
            if (str != null && str.length() > 4000) {
                boolean z8 = true;
                for (String str2 : zza.zzd(str)) {
                    if (z8) {
                        Log.i("Ads", str2);
                    } else {
                        Log.i("Ads-cont", str2);
                    }
                    z8 = false;
                }
                return;
            }
            Log.i("Ads", str);
        }
    }

    public static void zzj(String str) {
        if (zzm(5)) {
            if (str != null && str.length() > 4000) {
                boolean z8 = true;
                for (String str2 : zza.zzd(str)) {
                    if (z8) {
                        Log.w("Ads", str2);
                    } else {
                        Log.w("Ads-cont", str2);
                    }
                    z8 = false;
                }
                return;
            }
            Log.w("Ads", str);
        }
    }

    public static void zzk(String str, Throwable th) {
        if (zzm(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void zzl(String str, @Nullable Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzk(zzd(str), th);
            } else {
                zzj(zzd(str));
            }
        }
    }

    public static boolean zzm(int i9) {
        if (i9 < 5 && !Log.isLoggable("Ads", i9)) {
            return false;
        }
        return true;
    }
}

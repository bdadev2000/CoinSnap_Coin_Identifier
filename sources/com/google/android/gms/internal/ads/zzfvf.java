package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
final class zzfvf {
    private static zzfvf zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfvf(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public static zzfvf zzb(Context context) {
        if (zza == null) {
            zza = new zzfvf(context);
        }
        return zza;
    }

    public final long zza(String str, long j7) {
        return this.zzc.getLong(str, -1L);
    }

    public final String zzc(String str, String str2) {
        return this.zzc.getString(str, null);
    }

    public final void zzd(String str, Object obj) throws IOException {
        boolean commit;
        if (obj instanceof String) {
            commit = this.zzc.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = this.zzc.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            Log.e("PaidLifecycleSPHandler", "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.zzb);
            throw new IOException(AbstractC2914a.k("Failed to store ", str, " for app ", this.zzb));
        }
        if (commit) {
            return;
        }
        throw new IOException(AbstractC2914a.k("Failed to store ", str, " for app ", this.zzb));
    }

    public final void zze(String str) throws IOException {
        if (this.zzc.edit().remove(str).commit()) {
        } else {
            throw new IOException(AbstractC2914a.k("Failed to remove ", str, " for app ", this.zzb));
        }
    }

    public final boolean zzf(String str, boolean z8) {
        return this.zzc.getBoolean(str, true);
    }

    public final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}

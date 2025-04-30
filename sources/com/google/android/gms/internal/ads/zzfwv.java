package com.google.android.gms.internal.ads;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;
import java.util.IllegalFormatException;
import java.util.Locale;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzfwv {
    private final String zza;

    public zzfwv(String str) {
        this.zza = AbstractC2914a.c(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    private static String zze(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e4) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e4);
                str2 = AbstractC2914a.f(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return o.k(str, " : ", str2);
    }

    public final int zza(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzb(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", zze(this.zza, str, objArr), th);
        }
        return 0;
    }

    public final int zzc(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzd(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }
}

package com.google.android.gms.common.internal;

import Q7.n0;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkArgument(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    public static double checkArgumentInRange(double d2, double d9, double d10, @NonNull String str) {
        if (d2 < d9) {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d9), Double.valueOf(d10)));
        }
        if (d2 <= d10) {
            return d2;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d9), Double.valueOf(d10)));
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException(n0.j("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", str, "."));
        }
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @NonNull
    @KeepForSdk
    public static String checkNotEmpty(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @NonNull
    @KeepForSdk
    public static <T> T checkNotNull(@Nullable T t9) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException("null reference");
    }

    @KeepForSdk
    public static int checkNotZero(int i9) {
        if (i9 != 0) {
            return i9;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk
    public static void checkState(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static String zza(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        int i9 = 0;
        int i10 = 0;
        while (i9 < 3 && (indexOf = str.indexOf("%s", i10)) != -1) {
            sb.append(str.substring(i10, indexOf));
            sb.append(objArr[i9]);
            i10 = indexOf + 2;
            i9++;
        }
        sb.append(str.substring(i10));
        if (i9 < 3) {
            sb.append(" [");
            sb.append(objArr[i9]);
            for (int i11 = i9 + 1; i11 < 3; i11++) {
                sb.append(", ");
                sb.append(objArr[i11]);
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @KeepForSdk
    public static void checkArgument(boolean z8, @NonNull Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (!com.google.android.gms.common.util.zzb.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread(@NonNull String str) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException(str);
            }
        }
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (com.google.android.gms.common.util.zzb.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @KeepForSdk
    public static <T> T checkNotNull(@NonNull T t9, @NonNull Object obj) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkNotZero(int i9, @NonNull Object obj) {
        if (i9 != 0) {
            return i9;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void checkState(boolean z8, @NonNull Object obj) {
        if (!z8) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z8, @NonNull String str, @NonNull Object... objArr) {
        if (!z8) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @NonNull
    @KeepForSdk
    public static String checkNotEmpty(@Nullable String str, @NonNull Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @KeepForSdk
    public static long checkNotZero(long j7) {
        if (j7 != 0) {
            return j7;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @KeepForSdk
    public static void checkState(boolean z8, @NonNull String str, @NonNull Object... objArr) {
        if (!z8) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static float checkArgumentInRange(float f9, float f10, float f11, @NonNull String str) {
        if (f9 < f10) {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f10), Float.valueOf(f11)));
        }
        if (f9 <= f11) {
            return f9;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f10), Float.valueOf(f11)));
    }

    @KeepForSdk
    public static long checkNotZero(long j7, @NonNull Object obj) {
        if (j7 != 0) {
            return j7;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkArgumentInRange(int i9, int i10, int i11, @NonNull String str) {
        if (i9 < i10) {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i9 <= i11) {
            return i9;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @KeepForSdk
    public static long checkArgumentInRange(long j7, long j9, long j10, @NonNull String str) {
        if (j7 < j9) {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j9), Long.valueOf(j10)));
        }
        if (j7 <= j10) {
            return j7;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j9), Long.valueOf(j10)));
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler, @NonNull String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }
}

package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.annotations.UsedByNative;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.function.Consumer;

@UsedByNative("arcoreapk.cc")
/* loaded from: classes2.dex */
final class ArCoreApkJniAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f14251a;

    static {
        HashMap hashMap = new HashMap();
        f14251a = hashMap;
        hashMap.put(IllegalArgumentException.class, -1);
        hashMap.put(ResourceExhaustedException.class, -11);
        hashMap.put(UnavailableArcoreNotInstalledException.class, -100);
        hashMap.put(UnavailableDeviceNotCompatibleException.class, -101);
        hashMap.put(UnavailableApkTooOldException.class, -103);
        hashMap.put(UnavailableSdkTooOldException.class, -104);
        hashMap.put(UnavailableUserDeclinedInstallationException.class, -105);
    }

    private ArCoreApkJniAdapter() {
    }

    public static int b(Throwable th) {
        Log.e("ARCore-ArCoreApkJniAdap", "Exception details:", th);
        HashMap hashMap = f14251a;
        Class<?> cls = th.getClass();
        if (hashMap.containsKey(cls)) {
            return ((Integer) hashMap.get(cls)).intValue();
        }
        return -2;
    }

    @UsedByNative("arcoreapk.cc")
    public static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th) {
            b(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.function.Consumer, com.google.ar.core.x] */
    @UsedByNative("arcoreapk.cc")
    public static void checkAvailabilityAsync(Context context, final long j7, final long j9) {
        final ?? r02 = new Consumer() { // from class: com.google.ar.core.x
            @Override // java.util.function.Consumer
            public final /* synthetic */ void accept(Object obj) {
                ArCoreApkJniAdapter.nativeInvokeAvailabilityCallback(j7, j9, ((ArCoreApk.Availability) obj).nativeCode);
            }
        };
        try {
            ArCoreApk.getInstance().checkAvailabilityAsync(context, r02);
        } catch (Throwable th) {
            b(th);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.ar.core.w
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    HashMap hashMap = ArCoreApkJniAdapter.f14251a;
                    r02.accept(ArCoreApk.Availability.UNKNOWN_ERROR);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeInvokeAvailabilityCallback(long j7, long j9, int i9);

    @UsedByNative("arcoreapk.cc")
    public static int requestInstall(Activity activity, boolean z8, int[] iArr) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z8).nativeCode;
            return 0;
        } catch (Throwable th) {
            return b(th);
        }
    }

    @UsedByNative("arcoreapk.cc")
    public static int requestInstallCustom(Activity activity, boolean z8, int i9, int i10, int[] iArr) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z8, ArCoreApk.InstallBehavior.forNumber(i9), ArCoreApk.UserMessageType.forNumber(i10)).nativeCode;
            return 0;
        } catch (Throwable th) {
            return b(th);
        }
    }
}

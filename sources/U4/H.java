package U4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class H implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f3267h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f3268i;

    /* renamed from: j, reason: collision with root package name */
    public static Boolean f3269j;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final r f3270c;

    /* renamed from: d, reason: collision with root package name */
    public final PowerManager.WakeLock f3271d;

    /* renamed from: f, reason: collision with root package name */
    public final F f3272f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3273g;

    public H(F f9, Context context, r rVar, long j7) {
        this.f3272f = f9;
        this.b = context;
        this.f3273g = j7;
        this.f3270c = rVar;
        this.f3271d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f3267h) {
            try {
                Boolean bool = f3269j;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f3269j = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z8;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z8;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f3267h) {
            try {
                Boolean bool = f3268i;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f3268i = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z8;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z8 = true;
                }
            }
            z8 = false;
        } catch (Throwable th) {
            throw th;
        }
        return z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F f9 = this.f3272f;
        Context context = this.b;
        boolean c9 = c(context);
        PowerManager.WakeLock wakeLock = this.f3271d;
        if (c9) {
            wakeLock.acquire(AbstractC0310f.f3299a);
        }
        try {
            try {
                synchronized (f9) {
                    f9.f3264g = true;
                }
            } catch (IOException e4) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e4.getMessage());
                synchronized (f9) {
                    f9.f3264g = false;
                    if (!c(context)) {
                        return;
                    }
                }
            }
            if (!this.f3270c.d()) {
                synchronized (f9) {
                    f9.f3264g = false;
                }
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (a(context) && !d()) {
                new G(this, this).a();
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (f9.d()) {
                synchronized (f9) {
                    f9.f3264g = false;
                }
            } else {
                f9.e(this.f3273g);
            }
            if (!c(context)) {
                return;
            }
            try {
                wakeLock.release();
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}

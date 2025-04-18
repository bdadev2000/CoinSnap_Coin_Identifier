package ic;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class b0 implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f19525h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f19526i;

    /* renamed from: j, reason: collision with root package name */
    public static Boolean f19527j;

    /* renamed from: b, reason: collision with root package name */
    public final Context f19528b;

    /* renamed from: c, reason: collision with root package name */
    public final com.facebook.i f19529c;

    /* renamed from: d, reason: collision with root package name */
    public final PowerManager.WakeLock f19530d;

    /* renamed from: f, reason: collision with root package name */
    public final z f19531f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19532g;

    public b0(z zVar, Context context, com.facebook.i iVar, long j3) {
        this.f19531f = zVar;
        this.f19528b = context;
        this.f19532g = j3;
        this.f19529c = iVar;
        this.f19530d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f19525h) {
            Boolean bool = f19527j;
            if (bool == null) {
                booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f19527j = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z10;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f19525h) {
            Boolean bool = f19526i;
            if (bool == null) {
                booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f19526i = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f19528b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f19531f;
        Context context = this.f19528b;
        boolean c10 = c(context);
        PowerManager.WakeLock wakeLock = this.f19530d;
        if (c10) {
            wakeLock.acquire(f.a);
        }
        try {
            try {
                synchronized (zVar) {
                    zVar.f19599g = true;
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e2.getMessage());
                synchronized (zVar) {
                    zVar.f19599g = false;
                    if (!c(context)) {
                        return;
                    }
                }
            }
            if (!this.f19529c.c()) {
                synchronized (zVar) {
                    zVar.f19599g = false;
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
                new a0(this, this).a();
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
            if (zVar.e()) {
                synchronized (zVar) {
                    zVar.f19599g = false;
                }
            } else {
                zVar.f(this.f19532g);
            }
            if (!c(context)) {
                return;
            }
            try {
                wakeLock.release();
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th2) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}

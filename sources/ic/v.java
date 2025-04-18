package ic;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f19580b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f19581c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f19582d;

    public v(FirebaseMessaging firebaseMessaging, long j3) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f19582d = firebaseMessaging;
        this.f19580b = j3;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f12075b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f19581c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f19582d.f12075b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        boolean z10 = true;
        try {
            if (this.f19582d.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z10 = false;
            }
            if (z10) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e2.getMessage() + ". Will retry token retrieval");
                return false;
            }
            if (e2.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            throw e2;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        t f10 = t.f();
        FirebaseMessaging firebaseMessaging = this.f19582d;
        boolean h10 = f10.h(firebaseMessaging.f12075b);
        PowerManager.WakeLock wakeLock = this.f19581c;
        if (h10) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f12082i = true;
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f12082i = false;
                    if (!t.f().h(firebaseMessaging.f12075b)) {
                        return;
                    }
                }
            }
            if (!firebaseMessaging.f12081h.c()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f12082i = false;
                }
                if (t.f().h(firebaseMessaging.f12075b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (t.f().g(firebaseMessaging.f12075b) && !a()) {
                new h.c0(this).a();
                if (t.f().h(firebaseMessaging.f12075b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (b()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f12082i = false;
                }
            } else {
                firebaseMessaging.e(this.f19580b);
            }
        } finally {
            if (t.f().h(firebaseMessaging.f12075b)) {
                wakeLock.release();
            }
        }
    }
}

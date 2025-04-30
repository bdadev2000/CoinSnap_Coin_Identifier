package U4;

import android.animation.Animator;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.facebook.internal.C1835d;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class B implements Runnable {
    public final /* synthetic */ int b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final long f3245c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3246d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3247f;

    public B(View view, long j7, j6.i iVar) {
        this.f3246d = view;
        this.f3245c = j7;
        this.f3247f = iVar;
    }

    public boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f3247f).b.getSystemService("connectivity");
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

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.f3247f).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
            return true;
        } catch (IOException e4) {
            String message = e4.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e4.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e4;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e4.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                y e4 = y.e();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f3247f;
                boolean g9 = e4.g(firebaseMessaging.b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f3246d;
                if (g9) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f14336i = true;
                        }
                        if (!firebaseMessaging.f14335h.d()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.f14336i = false;
                            }
                            if (!y.e().g(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (y.e().f(firebaseMessaging.b) && !a()) {
                            C1835d c1835d = new C1835d();
                            c1835d.b = this;
                            c1835d.b();
                            if (!y.e().g(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.f14336i = false;
                                }
                            } else {
                                firebaseMessaging.f(this.f3245c);
                            }
                            if (!y.e().g(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e9) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e9.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f14336i = false;
                            if (!y.e().g(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (y.e().g(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            default:
                View view = (View) this.f3246d;
                if (view.isAttachedToWindow()) {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getRight() + view.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, Math.max(view.getWidth(), view.getHeight()), 0.0f);
                    createCircularReveal.setDuration(this.f3245c);
                    createCircularReveal.start();
                    createCircularReveal.addListener(new B3.c((j6.i) ((F7.a) this.f3247f), 7));
                    return;
                }
                return;
        }
    }

    public B(FirebaseMessaging firebaseMessaging, long j7) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f3247f = firebaseMessaging;
        this.f3245c = j7;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f3246d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }
}

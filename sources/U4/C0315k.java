package U4;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* renamed from: U4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0315k {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3311c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static L f3312d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3313a;
    public final Object b;

    public C0315k(ExecutorService executorService) {
        this.b = new x.l();
        this.f3313a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z8) {
        L l;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f3311c) {
            try {
                if (f3312d == null) {
                    f3312d = new L(context);
                }
                l = f3312d;
            } finally {
            }
        }
        if (z8) {
            if (y.e().g(context)) {
                synchronized (I.b) {
                    try {
                        if (I.f3275c == null) {
                            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                            I.f3275c = wakeLock;
                            wakeLock.setReferenceCounted(true);
                        }
                        boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                        if (!booleanExtra) {
                            I.f3275c.acquire(I.f3274a);
                        }
                        l.b(intent).addOnCompleteListener(new F2.d(intent, 6));
                    } finally {
                    }
                }
            } else {
                l.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return l.b(intent).continueWith(new A0.c(0), new A4.a(18));
    }

    public Task b(Intent intent) {
        boolean z8;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z9 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean isAtLeastO = PlatformVersion.isAtLeastO();
        Context context = (Context) this.f3313a;
        if (isAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z9 = true;
        }
        if (z8 && !z9) {
            return a(context, intent, z9);
        }
        CallableC0313i callableC0313i = new CallableC0313i(0, context, intent);
        A0.c cVar = (A0.c) this.b;
        return Tasks.call(cVar, callableC0313i).continueWithTask(cVar, new C0314j(context, intent, z9));
    }

    public C0315k(Context context) {
        this.f3313a = context;
        this.b = new A0.c(0);
    }
}

package ic;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f19554c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static f0 f19555d;
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final l.a f19556b = new l.a(15);

    public i(Context context) {
        this.a = context;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        f0 f0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f19554c) {
            if (f19555d == null) {
                f19555d = new f0(context);
            }
            f0Var = f19555d;
        }
        if (z10) {
            if (t.f().h(context)) {
                synchronized (c0.f19533b) {
                    if (c0.f19534c == null) {
                        WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                        c0.f19534c = wakeLock;
                        wakeLock.setReferenceCounted(true);
                    }
                    int i10 = 0;
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        c0.f19534c.acquire(c0.a);
                    }
                    f0Var.b(intent).addOnCompleteListener(new androidx.core.app.h(intent, i10));
                }
            } else {
                f0Var.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return f0Var.b(intent).continueWith(new l.a(17), new nb.a(4));
    }

    public final Task b(Intent intent) {
        boolean z10;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z11 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean isAtLeastO = PlatformVersion.isAtLeastO();
        Context context = this.a;
        if (isAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z11 = true;
        }
        if (z10 && !z11) {
            return a(context, intent, z11);
        }
        m3.f fVar = new m3.f(3, context, intent);
        l.a aVar = this.f19556b;
        return Tasks.call(aVar, fVar).continueWithTask(aVar, new com.applovin.impl.sdk.ad.f(context, intent, z11));
    }
}

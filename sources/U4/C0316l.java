package U4;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.measurement.AppMeasurement;
import g4.C2296f;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import k4.C2434c;
import k4.InterfaceC2433b;
import l4.AbstractC2445b;
import w4.v0;

/* renamed from: U4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0316l implements Application.ActivityLifecycleCallbacks {
    public final Set b = Collections.newSetFromMap(new WeakHashMap());

    public static void a(Intent intent) {
        boolean equals;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e4) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e4);
        }
        if (bundle == null) {
            equals = false;
        } else {
            equals = "1".equals(bundle.getString("google.c.a.e"));
        }
        if (equals) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    InterfaceC2433b interfaceC2433b = (InterfaceC2433b) C2296f.c().b(InterfaceC2433b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (interfaceC2433b != null) {
                        String string = bundle.getString("google.c.a.c_id");
                        C2434c c2434c = (C2434c) interfaceC2433b;
                        if (AbstractC2445b.d(AppMeasurement.FCM_ORIGIN) && AbstractC2445b.b(AppMeasurement.FCM_ORIGIN, "_ln")) {
                            c2434c.f21472a.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", string);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString(Constants.MEDIUM, "notification");
                        bundle2.putString("campaign", string);
                        c2434c.a(AppMeasurement.FCM_ORIGIN, "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            v0.x(bundle, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null && this.b.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new A4.d(5, this, intent));
            } else {
                a(intent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.b.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

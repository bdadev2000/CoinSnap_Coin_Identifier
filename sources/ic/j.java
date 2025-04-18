package ic;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class j implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f19557b = new ArrayDeque(10);

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            android.os.Bundle r7 = r7.getExtras()     // Catch: java.lang.RuntimeException -> L2f
            if (r7 == 0) goto L35
            java.lang.String r1 = "google.message_id"
            java.lang.String r1 = r7.getString(r1)     // Catch: java.lang.RuntimeException -> L2f
            if (r1 != 0) goto L16
            java.lang.String r1 = "message_id"
            java.lang.String r1 = r7.getString(r1)     // Catch: java.lang.RuntimeException -> L2f
        L16:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.RuntimeException -> L2f
            if (r2 != 0) goto L28
            java.util.ArrayDeque r2 = r6.f19557b
            boolean r3 = r2.contains(r1)     // Catch: java.lang.RuntimeException -> L2f
            if (r3 == 0) goto L25
            return
        L25:
            r2.add(r1)     // Catch: java.lang.RuntimeException -> L2f
        L28:
            java.lang.String r1 = "gcm.n.analytics_data"
            android.os.Bundle r7 = r7.getBundle(r1)     // Catch: java.lang.RuntimeException -> L2f
            goto L36
        L2f:
            r7 = move-exception
            java.lang.String r1 = "Failed trying to get analytics data from Intent extras."
            android.util.Log.w(r0, r1, r7)
        L35:
            r7 = 0
        L36:
            java.lang.String r1 = "1"
            if (r7 != 0) goto L3c
            r2 = 0
            goto L46
        L3c:
            java.lang.String r2 = "google.c.a.e"
            java.lang.String r2 = r7.getString(r2)
            boolean r2 = r1.equals(r2)
        L46:
            if (r2 == 0) goto Lc5
            if (r7 != 0) goto L4c
            goto Lc0
        L4c:
            java.lang.String r2 = "google.c.a.tc"
            java.lang.String r2 = r7.getString(r2)
            boolean r1 = r1.equals(r2)
            r2 = 3
            if (r1 == 0) goto Lb5
            va.g r1 = va.g.c()
            java.lang.Class<za.b> r3 = za.b.class
            java.lang.Object r1 = r1.b(r3)
            za.b r1 = (za.b) r1
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L70
            java.lang.String r2 = "Received event with track-conversion=true. Setting user property and reengagement event"
            android.util.Log.d(r0, r2)
        L70:
            if (r1 == 0) goto Laf
            java.lang.String r0 = "google.c.a.c_id"
            java.lang.String r0 = r7.getString(r0)
            za.c r1 = (za.c) r1
            java.lang.String r2 = "fcm"
            boolean r3 = ab.a.d(r2)
            if (r3 != 0) goto L83
            goto L91
        L83:
            java.lang.String r3 = "_ln"
            boolean r4 = ab.a.b(r2, r3)
            if (r4 != 0) goto L8c
            goto L91
        L8c:
            com.google.android.gms.measurement.api.AppMeasurementSdk r4 = r1.a
            r4.setUserProperty(r2, r3, r0)
        L91:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "source"
            java.lang.String r5 = "Firebase"
            r3.putString(r4, r5)
            java.lang.String r4 = "medium"
            java.lang.String r5 = "notification"
            r3.putString(r4, r5)
            java.lang.String r4 = "campaign"
            r3.putString(r4, r0)
            java.lang.String r0 = "_cmp"
            r1.a(r2, r0, r3)
            goto Lc0
        Laf:
            java.lang.String r1 = "Unable to set user property for conversion tracking:  analytics library is missing"
            android.util.Log.w(r0, r1)
            goto Lc0
        Lb5:
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto Lc0
            java.lang.String r1 = "Received event with track-conversion=false. Do not set user property"
            android.util.Log.d(r0, r1)
        Lc0:
            java.lang.String r0 = "_no"
            c6.c.w(r7, r0)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.j.a(android.content.Intent):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new jb.j(3, this, intent));
        } else {
            a(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

package xg;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public static final b a = new b();

    static {
        bb.a.a();
    }

    public final void a(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        bb.a.a().a(null, eventName);
    }

    public final void b(String activityName, String eventName) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Log.d("ITGTrackingHelper", "logEvent: " + activityName + " click " + eventName);
        bb.a.a().a(null, activityName + "_click_" + eventName);
    }
}

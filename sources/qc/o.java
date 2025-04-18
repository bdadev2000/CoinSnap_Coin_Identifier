package qc;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes3.dex */
public final class o {
    public final va.g a;

    /* renamed from: b, reason: collision with root package name */
    public final sc.l f23852b;

    public o(va.g firebaseApp, sc.l settings, CoroutineContext backgroundDispatcher, w0 lifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.a = firebaseApp;
        this.f23852b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        firebaseApp.a();
        Context applicationContext = firebaseApp.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(y0.f23890b);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(backgroundDispatcher), null, null, new n(this, backgroundDispatcher, lifecycleServiceBinder, null), 3, null);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}

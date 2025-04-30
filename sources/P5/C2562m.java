package p5;

import Q7.AbstractC0255x;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import g4.C2296f;
import r5.C2678j;

/* renamed from: p5.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2562m {

    /* renamed from: a, reason: collision with root package name */
    public final C2296f f22351a;
    public final C2678j b;

    public C2562m(C2296f c2296f, C2678j c2678j, w7.k kVar, T t9) {
        this.f22351a = c2296f;
        this.b = c2678j;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        c2296f.a();
        Context applicationContext = c2296f.f20433a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(V.b);
            AbstractC0255x.l(AbstractC0255x.a(kVar), null, null, new C2561l(this, kVar, t9, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}

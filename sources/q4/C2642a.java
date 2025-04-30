package q4;

import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.C1838g;
import com.google.android.gms.measurement.AppMeasurement;
import j0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import k4.C2434c;
import k4.InterfaceC2433b;
import s4.InterfaceC2699a;
import t4.InterfaceC2708a;
import u4.C2770o;

/* renamed from: q4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2642a implements InterfaceC2708a, InterfaceC2699a, N4.a {
    public final /* synthetic */ f b;

    public /* synthetic */ C2642a(f fVar) {
        this.b = fVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [b1.h, java.lang.Object] */
    @Override // N4.a
    public void a(N4.b bVar) {
        f fVar = this.b;
        fVar.getClass();
        r4.d dVar = r4.d.f22842a;
        dVar.c("AnalyticsConnector now available.");
        InterfaceC2433b interfaceC2433b = (InterfaceC2433b) bVar.get();
        C1838g c1838g = new C1838g(interfaceC2433b);
        a7.b bVar2 = new a7.b(29, false);
        C2434c c2434c = (C2434c) interfaceC2433b;
        C2645d b = c2434c.b("clx", bVar2);
        if (b == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            C2645d b8 = c2434c.b(AppMeasurement.CRASH_ORIGIN, bVar2);
            if (b8 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            b = b8;
        }
        if (b != null) {
            dVar.c("Registered Firebase Analytics listener.");
            com.bumptech.glide.f fVar2 = new com.bumptech.glide.f(15);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ?? obj = new Object();
            obj.f5271d = new Object();
            obj.b = c1838g;
            obj.f5270c = timeUnit;
            synchronized (fVar) {
                try {
                    Iterator it = ((ArrayList) fVar.f20969c).iterator();
                    while (it.hasNext()) {
                        fVar2.d((C2770o) it.next());
                    }
                    bVar2.f4078d = fVar2;
                    bVar2.f4077c = obj;
                    fVar.b = fVar2;
                    fVar.f20968a = obj;
                } finally {
                }
            }
            return;
        }
        dVar.g("Could not register Firebase Analytics listener; a listener is already registered.", null);
    }

    @Override // t4.InterfaceC2708a
    public void d(C2770o c2770o) {
        f fVar = this.b;
        synchronized (fVar) {
            if (((InterfaceC2708a) fVar.b) instanceof t4.b) {
                ((ArrayList) fVar.f20969c).add(c2770o);
            }
            ((InterfaceC2708a) fVar.b).d(c2770o);
        }
    }

    @Override // s4.InterfaceC2699a
    public void h(Bundle bundle) {
        ((InterfaceC2699a) this.b.f20968a).h(bundle);
    }
}

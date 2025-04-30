package W4;

import O4.e;
import a5.C0397a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import g4.C2296f;
import g4.i;
import g5.C2303f;
import g5.RunnableC2302e;
import h5.C2322c;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b {
    public static final C0397a b = C0397a.d();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3611a = new ConcurrentHashMap();

    public b(C2296f c2296f, N4.b bVar, e eVar, N4.b bVar2, RemoteConfigManager remoteConfigManager, Y4.a aVar, SessionManager sessionManager) {
        Bundle bundle;
        C2322c c2322c;
        boolean h6;
        if (c2296f == null) {
            new C2322c(new Bundle());
            return;
        }
        C2303f c2303f = C2303f.f20472u;
        c2303f.f20475f = c2296f;
        c2296f.a();
        i iVar = c2296f.f20434c;
        c2303f.f20485r = iVar.f20451g;
        c2303f.f20477h = eVar;
        c2303f.f20478i = bVar2;
        c2303f.f20480k.execute(new RunnableC2302e(c2303f, 1));
        c2296f.a();
        Context context = c2296f.f20433a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e4) {
            Log.d("isEnabled", "No perf enable meta data found " + e4.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            c2322c = new C2322c(bundle);
        } else {
            c2322c = new C2322c();
        }
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        aVar.b = c2322c;
        Y4.a.f3788d.b = com.bumptech.glide.c.N(context);
        aVar.f3791c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean g9 = aVar.g();
        C0397a c0397a = b;
        if (c0397a.b) {
            if (g9 != null) {
                h6 = g9.booleanValue();
            } else {
                h6 = C2296f.c().h();
            }
            if (h6) {
                c2296f.a();
                String concat = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(y8.a.m(iVar.f20451g, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (c0397a.b) {
                    c0397a.f4074a.getClass();
                    Log.i("FirebasePerformance", concat);
                }
            }
        }
    }
}

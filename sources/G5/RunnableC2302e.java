package g5;

import Y4.g;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.appevents.k;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import g4.C2296f;
import h5.C2323d;
import h5.C2326g;
import i5.C2347b;
import i5.C2352g;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: g5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2302e implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2303f f20470c;

    public /* synthetic */ RunnableC2302e(C2303f c2303f, int i9) {
        this.b = i9;
        this.f20470c = c2303f;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, Y4.g] */
    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        String str;
        switch (this.b) {
            case 0:
                C2303f c2303f = this.f20470c;
                C2301d c2301d = c2303f.f20481n;
                boolean z8 = c2303f.f20486s;
                c2301d.f20468d.a(z8);
                c2301d.f20469e.a(z8);
                return;
            default:
                C2303f c2303f2 = this.f20470c;
                C2296f c2296f = c2303f2.f20475f;
                c2296f.a();
                Context context = c2296f.f20433a;
                c2303f2.l = context;
                c2303f2.f20484q = context.getPackageName();
                c2303f2.m = Y4.a.e();
                c2303f2.f20481n = new C2301d(c2303f2.l, new C2326g(100L, 1L, TimeUnit.MINUTES));
                c2303f2.f20482o = X4.c.a();
                N4.b bVar = c2303f2.f20478i;
                Y4.a aVar = c2303f2.m;
                aVar.getClass();
                g gVar2 = g.f3796j;
                synchronized (g.class) {
                    try {
                        if (g.f3796j == null) {
                            g.f3796j = new Object();
                        }
                        gVar = g.f3796j;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                gVar.getClass();
                Long l = (Long) aVar.f3790a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map map = g.f3797k;
                if (map.containsKey(l) && (str = (String) map.get(l)) != null) {
                    aVar.f3791c.f("com.google.firebase.perf.LogSourceName", str);
                } else {
                    C2323d d2 = aVar.d(gVar);
                    if (d2.b()) {
                        str = (String) d2.a();
                    } else {
                        str = "FIREPERF";
                    }
                }
                c2303f2.f20479j = new C2298a(bVar, str);
                X4.c cVar = c2303f2.f20482o;
                WeakReference weakReference = new WeakReference(C2303f.f20472u);
                synchronized (cVar.f3682h) {
                    cVar.f3682h.add(weakReference);
                }
                C2352g newBuilder = ApplicationInfo.newBuilder();
                c2303f2.f20483p = newBuilder;
                C2296f c2296f2 = c2303f2.f20475f;
                c2296f2.a();
                newBuilder.f(c2296f2.f20434c.b);
                C2347b newBuilder2 = AndroidApplicationInfo.newBuilder();
                newBuilder2.a(c2303f2.f20484q);
                newBuilder2.b();
                Context context2 = c2303f2.l;
                String str2 = "";
                try {
                    String str3 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str3 != null) {
                        str2 = str3;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                newBuilder2.c(str2);
                newBuilder.c(newBuilder2);
                c2303f2.f20474d.set(true);
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = c2303f2.f20473c;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        C2299b c2299b = (C2299b) concurrentLinkedQueue.poll();
                        if (c2299b != null) {
                            c2303f2.f20480k.execute(new k(12, c2303f2, c2299b));
                        }
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}

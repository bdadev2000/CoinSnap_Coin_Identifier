package U4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import l5.C2451c;

/* renamed from: U4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC0313i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3307a;
    public final /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3308c;

    public /* synthetic */ CallableC0313i(int i9, Object obj, Object obj2) {
        this.f3307a = i9;
        this.b = obj;
        this.f3308c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i9;
        ComponentName startService;
        Object m44getWrappedCallableWithFallback$lambda0;
        String str2 = null;
        switch (this.f3307a) {
            case 0:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.f3308c;
                y e4 = y.e();
                e4.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) e4.f3336d).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (e4) {
                    try {
                        String str3 = (String) e4.f3334a;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(".")) {
                                        e4.f3334a = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        e4.f3334a = serviceInfo.name;
                                    }
                                    str2 = (String) e4.f3334a;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (e4.g(context)) {
                        startService = I.b(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i9 = 404;
                    } else {
                        i9 = -1;
                    }
                } catch (IllegalStateException e9) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e9);
                    i9 = 402;
                } catch (SecurityException e10) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
                    i9 = 401;
                }
                return Integer.valueOf(i9);
            case 1:
                a7.b bVar = (a7.b) this.b;
                G7.j.e(bVar, "this$0");
                CountDownLatch countDownLatch = (CountDownLatch) bVar.f4078d;
                Callable callable = (Callable) this.f3308c;
                G7.j.e(callable, "$callable");
                try {
                    bVar.f4077c = callable.call();
                    return null;
                } finally {
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            case 2:
                m44getWrappedCallableWithFallback$lambda0 = com.vungle.ads.internal.executor.i.m44getWrappedCallableWithFallback$lambda0((Callable) this.b, (F7.a) this.f3308c);
                return m44getWrappedCallableWithFallback$lambda0;
            case 3:
                k5.b bVar2 = (k5.b) this.b;
                k5.g gVar = (k5.g) this.f3308c;
                l5.j jVar = bVar2.f21480i;
                synchronized (jVar.b) {
                    jVar.f21616a.edit().putLong("fetch_timeout_in_seconds", gVar.f21483a).putLong("minimum_fetch_interval_in_seconds", gVar.b).commit();
                }
                return null;
            case 4:
                C2451c c2451c = (C2451c) this.b;
                l5.d dVar = (l5.d) this.f3308c;
                l5.n nVar = c2451c.b;
                synchronized (nVar) {
                    FileOutputStream openFileOutput = nVar.f21637a.openFileOutput(nVar.b, 0);
                    try {
                        openFileOutput.write(dVar.f21586a.toString().getBytes("UTF-8"));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
            case 5:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.b;
                boolean z8 = lottieAnimationView.l;
                String str4 = (String) this.f3308c;
                if (z8) {
                    Context context2 = lottieAnimationView.getContext();
                    HashMap hashMap = v1.m.f23505a;
                    return v1.m.b(context2, str4, "asset_" + str4);
                }
                return v1.m.b(lottieAnimationView.getContext(), str4, null);
            case 6:
                return v1.m.c((InputStream) this.b, (String) this.f3308c);
            default:
                z4.c cVar = (z4.c) this.b;
                ((v4.g) cVar.b).h((String) cVar.f24545a, (List) this.f3308c);
                return null;
        }
    }

    public /* synthetic */ CallableC0313i(ByteArrayInputStream byteArrayInputStream) {
        this.f3307a = 6;
        this.b = byteArrayInputStream;
        this.f3308c = null;
    }
}

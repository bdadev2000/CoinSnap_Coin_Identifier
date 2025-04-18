package m3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21531c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.f21531c = obj;
        this.f21530b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i10;
        ComponentName startService;
        String str2 = null;
        switch (this.a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f21531c;
                String str3 = (String) this.f21530b;
                if (lottieAnimationView.f2929l) {
                    Context context = lottieAnimationView.getContext();
                    HashMap hashMap = n.a;
                    return n.b(context, str3, "asset_" + str3);
                }
                return n.b(lottieAnimationView.getContext(), str3, null);
            case 1:
                return n.c((InputStream) this.f21531c, (String) this.f21530b);
            case 2:
                r4.c this$0 = (r4.c) this.f21531c;
                Callable callable = (Callable) this.f21530b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(callable, "$callable");
                try {
                    this$0.f23999c = callable.call();
                    return null;
                } finally {
                    CountDownLatch countDownLatch = (CountDownLatch) this$0.f24000d;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            case 3:
                Context context2 = (Context) this.f21531c;
                Intent intent = (Intent) this.f21530b;
                Object obj = ic.i.f19554c;
                ic.t f10 = ic.t.f();
                f10.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((Queue) f10.f19576d).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context2.getPackageName());
                synchronized (f10) {
                    Object obj2 = f10.a;
                    if (((String) obj2) != null) {
                        str2 = (String) obj2;
                    } else {
                        ResolveInfo resolveService = context2.getPackageManager().resolveService(intent2, 0);
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context2.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                if (str.startsWith(".")) {
                                    f10.a = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    f10.a = serviceInfo.name;
                                }
                                str2 = (String) f10.a;
                            }
                            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                        }
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context2.getPackageName(), str2);
                }
                try {
                    if (f10.h(context2)) {
                        startService = ic.c0.b(context2, intent2);
                    } else {
                        startService = context2.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e2) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e2);
                    i10 = 402;
                } catch (SecurityException e10) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            case 4:
                lc.b bVar = (lc.b) this.f21531c;
                androidx.emoji2.text.x xVar = (androidx.emoji2.text.x) this.f21530b;
                mc.l lVar = bVar.f21334i;
                synchronized (lVar.f22198b) {
                    lVar.a.edit().putLong("fetch_timeout_in_seconds", xVar.a).putLong("minimum_fetch_interval_in_seconds", xVar.f1549b).commit();
                }
                return null;
            case 5:
                mc.d dVar = (mc.d) this.f21531c;
                mc.f fVar = (mc.f) this.f21530b;
                mc.o oVar = dVar.f22159b;
                synchronized (oVar) {
                    FileOutputStream openFileOutput = oVar.a.openFileOutput(oVar.f22218b, 0);
                    try {
                        openFileOutput.write(fVar.toString().getBytes("UTF-8"));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
            default:
                return com.vungle.ads.internal.executor.i.a((Callable) this.f21531c, (Function0) this.f21530b);
        }
    }
}

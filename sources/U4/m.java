package U4;

import android.os.Build;
import android.os.StrictMode;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p4.ThreadFactoryC2543a;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements N4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3314a;

    public /* synthetic */ m(int i9) {
        this.f3314a = i9;
    }

    @Override // N4.b
    public final Object get() {
        f5.b lambda$new$0;
        f5.f lambda$new$1;
        switch (this.f3314a) {
            case 0:
                A a6 = FirebaseMessaging.f14328k;
                return null;
            case 1:
                return Executors.newSingleThreadScheduledExecutor();
            case 2:
                lambda$new$0 = GaugeManager.lambda$new$0();
                return lambda$new$0;
            case 3:
                lambda$new$1 = GaugeManager.lambda$new$1();
                return lambda$new$1;
            case 4:
                Clock clock = k5.k.f21486j;
                return null;
            case 5:
                return Collections.emptySet();
            case 6:
                return null;
            case 7:
                o4.l lVar = ExecutorsRegistrar.f14323a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i9 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i9 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new p4.f(Executors.newFixedThreadPool(4, new ThreadFactoryC2543a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f14325d.get());
            case 8:
                o4.l lVar2 = ExecutorsRegistrar.f14323a;
                return new p4.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC2543a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f14325d.get());
            case 9:
                o4.l lVar3 = ExecutorsRegistrar.f14323a;
                return new p4.f(Executors.newCachedThreadPool(new ThreadFactoryC2543a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f14325d.get());
            default:
                o4.l lVar4 = ExecutorsRegistrar.f14323a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC2543a("Firebase Scheduler", 0, null));
        }
    }
}

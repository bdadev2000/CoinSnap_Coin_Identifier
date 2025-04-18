package db;

import android.os.Build;
import android.os.StrictMode;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements cc.c {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    @Override // cc.c
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                n nVar = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i10 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i10 >= 26) {
                    d2.a.v(detectNetwork);
                }
                return new eb.e(Executors.newFixedThreadPool(4, new eb.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f12068d.get());
            case 3:
                n nVar2 = ExecutorsRegistrar.a;
                return new eb.e(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new eb.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f12068d.get());
            case 4:
                n nVar3 = ExecutorsRegistrar.a;
                return new eb.e(Executors.newCachedThreadPool(new eb.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f12068d.get());
            case 5:
                n nVar4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new eb.a("Firebase Scheduler", 0, null));
            case 6:
                y7.q qVar = FirebaseMessaging.f12072k;
                return null;
            default:
                Clock clock = lc.j.f21338j;
                return null;
        }
    }
}

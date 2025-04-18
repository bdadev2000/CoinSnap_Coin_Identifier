package hb;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class c implements b, a {

    /* renamed from: b, reason: collision with root package name */
    public final d f19006b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f19007c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19008d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public CountDownLatch f19009f;

    public c(d dVar, TimeUnit timeUnit) {
        this.f19006b = dVar;
        this.f19007c = timeUnit;
    }

    @Override // hb.b
    public final void b(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.f19009f;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // hb.a
    public final void f(Bundle bundle) {
        synchronized (this.f19008d) {
            b6.a aVar = b6.a.f2288f;
            aVar.h("Logging event _ae to Firebase Analytics with params " + bundle);
            this.f19009f = new CountDownLatch(1);
            this.f19006b.f(bundle);
            aVar.h("Awaiting app exception callback from Analytics...");
            try {
                if (this.f19009f.await(500, this.f19007c)) {
                    aVar.h("App exception callback received from Analytics listener.");
                } else {
                    aVar.i("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                b6.a.f2288f.e("Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f19009f = null;
        }
    }
}

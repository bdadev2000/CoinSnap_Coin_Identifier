package n0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.UUID;

/* loaded from: classes.dex */
public final class w1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22365d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22367g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f22368h;

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f22363b = i10;
        this.f22368h = obj;
        this.f22364c = obj2;
        this.f22365d = obj3;
        this.f22366f = obj4;
        this.f22367g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22363b) {
            case 0:
                y1.h((View) this.f22364c, (c2) this.f22365d, (d3.g) this.f22366f);
                ((ValueAnimator) this.f22367g).start();
                return;
            default:
                try {
                    if (!(((w2.j) this.f22364c).f26688b instanceof w2.a)) {
                        String uuid = ((UUID) this.f22365d).toString();
                        androidx.work.y h10 = ((v2.n) this.f22368h).f26006c.h(uuid);
                        if (h10 != null && !h10.a()) {
                            ((m2.b) ((v2.n) this.f22368h).f26005b).e(uuid, (androidx.work.i) this.f22366f);
                            ((Context) this.f22367g).startService(t2.c.a((Context) this.f22367g, uuid, (androidx.work.i) this.f22366f));
                        } else {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                    }
                    ((w2.j) this.f22364c).h(null);
                    return;
                } catch (Throwable th2) {
                    ((w2.j) this.f22364c).i(th2);
                    return;
                }
        }
    }
}

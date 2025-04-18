package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class FullyDrawnReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f154a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f155b;
    public int d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f157f;

    /* renamed from: c, reason: collision with root package name */
    public final Object f156c = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f158g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final d f159h = new d(this, 3);

    public FullyDrawnReporter(Executor executor, a aVar) {
        this.f154a = executor;
        this.f155b = aVar;
    }

    public final void a() {
        synchronized (this.f156c) {
            try {
                this.f157f = true;
                Iterator it = this.f158g.iterator();
                while (it.hasNext()) {
                    ((q0.a) it.next()).invoke();
                }
                this.f158g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        int i2;
        synchronized (this.f156c) {
            if (!this.f157f && (i2 = this.d) > 0) {
                int i3 = i2 - 1;
                this.d = i3;
                if (!this.e && i3 == 0) {
                    this.e = true;
                    this.f154a.execute(this.f159h);
                }
            }
        }
    }
}

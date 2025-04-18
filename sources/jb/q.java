package jb;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class q {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final t f19928b;

    /* renamed from: c, reason: collision with root package name */
    public final qa.a f19929c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19930d;

    /* renamed from: e, reason: collision with root package name */
    public qa.a f19931e;

    /* renamed from: f, reason: collision with root package name */
    public qa.a f19932f;

    /* renamed from: g, reason: collision with root package name */
    public m f19933g;

    /* renamed from: h, reason: collision with root package name */
    public final x f19934h;

    /* renamed from: i, reason: collision with root package name */
    public final ob.c f19935i;

    /* renamed from: j, reason: collision with root package name */
    public final ib.a f19936j;

    /* renamed from: k, reason: collision with root package name */
    public final hb.a f19937k;

    /* renamed from: l, reason: collision with root package name */
    public final i f19938l;

    /* renamed from: m, reason: collision with root package name */
    public final gb.a f19939m;

    /* renamed from: n, reason: collision with root package name */
    public final y7.u f19940n;

    /* renamed from: o, reason: collision with root package name */
    public final kb.d f19941o;

    public q(va.g gVar, x xVar, gb.b bVar, t tVar, fb.a aVar, fb.a aVar2, ob.c cVar, i iVar, y7.u uVar, kb.d dVar) {
        this.f19928b = tVar;
        gVar.a();
        this.a = gVar.a;
        this.f19934h = xVar;
        this.f19939m = bVar;
        this.f19936j = aVar;
        this.f19937k = aVar2;
        this.f19935i = cVar;
        this.f19938l = iVar;
        this.f19940n = uVar;
        this.f19941o = dVar;
        this.f19930d = System.currentTimeMillis();
        this.f19929c = new qa.a(7);
    }

    public final void a(m2.l lVar) {
        kb.d.a();
        kb.d.a();
        this.f19931e.g();
        b6.a aVar = b6.a.f2288f;
        aVar.h("Initialization marker file was created.");
        try {
            try {
                this.f19936j.a(new o(this));
                this.f19933g.f();
            } catch (Exception e2) {
                aVar.e("Crashlytics encountered a problem during asynchronous initialization.", e2);
            }
            if (lVar.f().f23738b.a) {
                if (!this.f19933g.d(lVar)) {
                    aVar.i("Previous sessions could not be finalized.", null);
                }
                this.f19933g.g(((TaskCompletionSource) ((AtomicReference) lVar.f21474i).get()).getTask());
                c();
                return;
            }
            aVar.d("Collection of crash reports disabled in Crashlytics settings.", null);
            throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(m2.l lVar) {
        Future<?> submit = this.f19941o.a.f20629b.submit(new n(this, lVar, 0));
        b6.a aVar = b6.a.f2288f;
        aVar.d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            aVar.e("Crashlytics was interrupted during initialization.", e2);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            aVar.e("Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            aVar.e("Crashlytics timed out during initialization.", e11);
        }
    }

    public final void c() {
        b6.a aVar = b6.a.f2288f;
        kb.d.a();
        try {
            qa.a aVar2 = this.f19931e;
            ob.c cVar = (ob.c) aVar2.f23737d;
            String str = (String) aVar2.f23736c;
            cVar.getClass();
            if (!new File((File) cVar.f23293c, str).delete()) {
                aVar.i("Initialization marker file was not properly removed.", null);
            }
        } catch (Exception e2) {
            aVar.e("Problem encountered deleting Crashlytics initialization marker.", e2);
        }
    }
}

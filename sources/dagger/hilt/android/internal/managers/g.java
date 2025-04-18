package dagger.hilt.android.internal.managers;

import androidx.fragment.app.Fragment;
import ic.t;
import p000if.j;
import y7.q;

/* loaded from: classes4.dex */
public final class g implements ph.b {

    /* renamed from: c, reason: collision with root package name */
    public volatile ph.a f16935c;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16937f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16934b = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16936d = new Object();

    public g(q qVar) {
        this.f16937f = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Context b(dagger.hilt.android.internal.managers.i r1) {
        /*
        L0:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto Lf
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 != 0) goto Lf
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L0
        Lf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.g.b(dagger.hilt.android.internal.managers.i):android.content.Context");
    }

    public final Object a() {
        Fragment fragment = (Fragment) this.f16937f;
        if (fragment.getHost() != null) {
            com.facebook.internal.i.j(fragment.getHost() instanceof ph.b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", fragment.getHost().getClass());
            p000if.a aVar = (p000if.a) ((h) com.facebook.internal.i.r(h.class, fragment.getHost()));
            t tVar = new t(aVar.a, aVar.f19614b, aVar.f19615c);
            fragment.getClass();
            tVar.f19576d = fragment;
            return new p000if.d((p000if.a) tVar.f19575c);
        }
        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
    }

    @Override // ph.b
    public final Object d() {
        switch (this.f16934b) {
            case 0:
                if (this.f16935c == null) {
                    synchronized (this.f16936d) {
                        if (this.f16935c == null) {
                            q qVar = (q) this.f16937f;
                            qVar.getClass();
                            hb.d dVar = new hb.d(0);
                            j.a aVar = new j.a((j) qVar.f27991b);
                            dVar.f19011c = aVar;
                            this.f16935c = new p000if.f(aVar);
                        }
                    }
                }
                return this.f16935c;
            default:
                if (this.f16935c == null) {
                    synchronized (this.f16936d) {
                        if (this.f16935c == null) {
                            this.f16935c = (ph.a) a();
                        }
                    }
                }
                return this.f16935c;
        }
    }

    public g(Fragment fragment) {
        this.f16937f = fragment;
    }
}

package n1;

import java.lang.ref.SoftReference;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile SoftReference f31117a;

    public final synchronized Object a(q0.a aVar) {
        Object obj = this.f31117a.get();
        if (obj != null) {
            return obj;
        }
        Object invoke = aVar.invoke();
        this.f31117a = new SoftReference(invoke);
        return invoke;
    }
}

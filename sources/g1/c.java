package g1;

import java.lang.ref.SoftReference;

/* loaded from: classes2.dex */
public final class c extends ClassValue {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30595a;

    /* JADX WARN: Type inference failed for: r3v2, types: [n1.o0, java.lang.Object] */
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        switch (this.f30595a) {
            case 0:
                p0.a.q(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
                return l.a(cls);
            default:
                p0.a.s(cls, "type");
                ?? obj = new Object();
                obj.f31117a = new SoftReference(null);
                return obj;
        }
    }
}

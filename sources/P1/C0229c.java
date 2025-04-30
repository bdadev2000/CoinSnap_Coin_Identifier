package P1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: P1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229c extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final N1.f f2294a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public B f2295c;

    public C0229c(N1.f fVar, v vVar, ReferenceQueue referenceQueue) {
        super(vVar, referenceQueue);
        j2.g.c(fVar, "Argument must not be null");
        this.f2294a = fVar;
        boolean z8 = vVar.b;
        this.f2295c = null;
        this.b = z8;
    }
}

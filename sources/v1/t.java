package v1;

import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends r {

    /* renamed from: b, reason: collision with root package name */
    public final u f25937b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f25938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u tracker, d delegate) {
        super(delegate.a);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f25937b = tracker;
        this.f25938c = new WeakReference(delegate);
    }

    @Override // v1.r
    public final void b(Set tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        r rVar = (r) this.f25938c.get();
        if (rVar == null) {
            this.f25937b.d(this);
        } else {
            rVar.b(tables);
        }
    }
}

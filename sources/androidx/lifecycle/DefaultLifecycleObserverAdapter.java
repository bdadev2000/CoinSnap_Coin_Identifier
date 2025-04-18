package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/t;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements t {

    /* renamed from: b, reason: collision with root package name */
    public final f f1769b;

    /* renamed from: c, reason: collision with root package name */
    public final t f1770c;

    public DefaultLifecycleObserverAdapter(f defaultLifecycleObserver, t tVar) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f1769b = defaultLifecycleObserver;
        this.f1770c = tVar;
    }

    @Override // androidx.lifecycle.t
    public final void a(v owner, n event) {
        Intrinsics.checkNotNullParameter(owner, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = g.a[event.ordinal()];
        f fVar = this.f1769b;
        switch (i10) {
            case 1:
                fVar.getClass();
                Intrinsics.checkNotNullParameter(owner, "owner");
                break;
            case 2:
                fVar.getClass();
                Intrinsics.checkNotNullParameter(owner, "owner");
                break;
            case 3:
                fVar.b();
                break;
            case 4:
                fVar.getClass();
                Intrinsics.checkNotNullParameter(owner, "owner");
                break;
            case 5:
                fVar.getClass();
                Intrinsics.checkNotNullParameter(owner, "owner");
                break;
            case 6:
                fVar.getClass();
                Intrinsics.checkNotNullParameter(owner, "owner");
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        t tVar = this.f1770c;
        if (tVar != null) {
            tVar.a(owner, event);
        }
    }
}

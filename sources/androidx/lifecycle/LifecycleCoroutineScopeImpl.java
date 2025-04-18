package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/t;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl implements t, CoroutineScope {

    /* renamed from: b, reason: collision with root package name */
    public final p f1773b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f1774c;

    public LifecycleCoroutineScopeImpl(p lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f1773b = lifecycle;
        this.f1774c = coroutineContext;
        if (((x) lifecycle).f1835d == o.DESTROYED) {
            JobKt__JobKt.cancel$default(coroutineContext, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // androidx.lifecycle.t
    public final void a(v source, n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        p pVar = this.f1773b;
        if (((x) pVar).f1835d.compareTo(o.DESTROYED) <= 0) {
            pVar.b(this);
            JobKt__JobKt.cancel$default(this.f1774c, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF1774c() {
        return this.f1774c;
    }
}

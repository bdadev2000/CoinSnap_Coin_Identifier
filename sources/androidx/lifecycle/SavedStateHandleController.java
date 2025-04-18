package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/t;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/* loaded from: classes.dex */
public final class SavedStateHandleController implements t {

    /* renamed from: b, reason: collision with root package name */
    public final String f1780b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f1781c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1782d;

    public SavedStateHandleController(String key, q0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f1780b = key;
        this.f1781c = handle;
    }

    @Override // androidx.lifecycle.t
    public final void a(v source, n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == n.ON_DESTROY) {
            this.f1782d = false;
            source.getLifecycle().b(this);
        }
    }

    public final void c(p lifecycle, y1.d registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!this.f1782d) {
            this.f1782d = true;
            lifecycle.a(this);
            registry.c(this.f1780b, this.f1781c.f1817e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }
}

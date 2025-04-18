package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/t;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements t {

    /* renamed from: b, reason: collision with root package name */
    public final s0 f1779b;

    public SavedStateHandleAttacher(s0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f1779b = provider;
    }

    @Override // androidx.lifecycle.t
    public final void a(v source, n event) {
        boolean z10;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == n.ON_CREATE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            source.getLifecycle().b(this);
            this.f1779b.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}

package androidx.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable", "Landroidx/lifecycle/t;", "Landroidx/activity/c;", "activity_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.t, c {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.p f560b;

    /* renamed from: c, reason: collision with root package name */
    public final q f561c;

    /* renamed from: d, reason: collision with root package name */
    public x f562d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f563f;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(z zVar, androidx.lifecycle.p lifecycle, q onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f563f = zVar;
        this.f560b = lifecycle;
        this.f561c = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // androidx.lifecycle.t
    public final void a(androidx.lifecycle.v source, androidx.lifecycle.n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.n.ON_START) {
            z zVar = this.f563f;
            zVar.getClass();
            q onBackPressedCallback = this.f561c;
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            zVar.f625b.add(onBackPressedCallback);
            x cancellable = new x(zVar, onBackPressedCallback);
            onBackPressedCallback.getClass();
            Intrinsics.checkNotNullParameter(cancellable, "cancellable");
            onBackPressedCallback.f587b.add(cancellable);
            zVar.d();
            onBackPressedCallback.f588c = new y(zVar, 1);
            this.f562d = cancellable;
            return;
        }
        if (event == androidx.lifecycle.n.ON_STOP) {
            x xVar = this.f562d;
            if (xVar != null) {
                xVar.cancel();
                return;
            }
            return;
        }
        if (event == androidx.lifecycle.n.ON_DESTROY) {
            cancel();
        }
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f560b.b(this);
        q qVar = this.f561c;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "cancellable");
        qVar.f587b.remove(this);
        x xVar = this.f562d;
        if (xVar != null) {
            xVar.cancel();
        }
        this.f562d = null;
    }
}

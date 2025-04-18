package androidx.lifecycle;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1829b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1830c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1831d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1832f;

    public w0(x registry, n event) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f1831d = registry;
        this.f1832f = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1829b;
        Object obj = this.f1832f;
        Object obj2 = this.f1831d;
        switch (i10) {
            case 0:
                if (!this.f1830c) {
                    ((x) obj2).e((n) obj);
                    this.f1830c = true;
                    return;
                }
                return;
            default:
                x0.d dVar = ((SwipeDismissBehavior) obj).a;
                if (dVar != null && dVar.g()) {
                    ((View) obj2).postOnAnimation(this);
                    return;
                }
                return;
        }
    }

    public w0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z10) {
        this.f1832f = swipeDismissBehavior;
        this.f1831d = view;
        this.f1830c = z10;
    }
}

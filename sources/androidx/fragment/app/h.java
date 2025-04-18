package androidx.fragment.app;

import android.view.View;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class h {
    public final c2 a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.e f1643b;

    public h(c2 operation, j0.e signal) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        this.a = operation;
        this.f1643b = signal;
    }

    public final void a() {
        c2 c2Var = this.a;
        c2Var.getClass();
        j0.e signal = this.f1643b;
        Intrinsics.checkNotNullParameter(signal, "signal");
        LinkedHashSet linkedHashSet = c2Var.f1598e;
        if (linkedHashSet.remove(signal) && linkedHashSet.isEmpty()) {
            c2Var.b();
        }
    }

    public final boolean b() {
        b2 b2Var;
        c2 c2Var = this.a;
        View view = c2Var.f1596c.mView;
        Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
        b2 a = ac.e.a(view);
        b2 b2Var2 = c2Var.a;
        if (a != b2Var2 && (a == (b2Var = b2.VISIBLE) || b2Var2 == b2Var)) {
            return false;
        }
        return true;
    }
}

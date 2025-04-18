package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class VNode {

    /* renamed from: a, reason: collision with root package name */
    public l f15389a;

    public abstract void a(DrawScope drawScope);

    public l b() {
        return this.f15389a;
    }

    public final void c() {
        l b2 = b();
        if (b2 != null) {
            b2.invoke(this);
        }
    }

    public void d(l lVar) {
        this.f15389a = lVar;
    }
}

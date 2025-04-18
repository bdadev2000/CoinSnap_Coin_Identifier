package androidx.compose.ui.draw;

import androidx.collection.MutableObjectList;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import e0.q;

/* loaded from: classes4.dex */
final class ScopedGraphicsContext implements GraphicsContext {

    /* renamed from: a, reason: collision with root package name */
    public MutableObjectList f14820a;

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final GraphicsLayer a() {
        InlineClassHelperKt.b("GraphicsContext not provided");
        throw null;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final void b(GraphicsLayer graphicsLayer) {
    }

    public final void c() {
        MutableObjectList mutableObjectList = this.f14820a;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.f1549a;
            int i2 = mutableObjectList.f1550b;
            for (int i3 = 0; i3 < i2; i3++) {
                b((GraphicsLayer) objArr[i3]);
            }
            q.W(0, mutableObjectList.f1550b, mutableObjectList.f1549a);
            mutableObjectList.f1550b = 0;
        }
    }
}

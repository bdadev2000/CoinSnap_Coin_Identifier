package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import java.util.List;

@RequiresApi
/* loaded from: classes4.dex */
final class PreferKeepClearNode extends RectListNode {
    @Override // androidx.compose.foundation.RectListNode
    public final MutableVector e2() {
        List preferKeepClearRects;
        MutableVector mutableVector = new MutableVector(new Rect[16]);
        preferKeepClearRects = DelegatableNode_androidKt.a(this).getPreferKeepClearRects();
        mutableVector.d(mutableVector.f14144c, preferKeepClearRects);
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    public final void f2(MutableVector mutableVector) {
        DelegatableNode_androidKt.a(this).setPreferKeepClearRects(mutableVector.f());
    }
}

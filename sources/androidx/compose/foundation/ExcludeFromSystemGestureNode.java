package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import java.util.List;

@RequiresApi
/* loaded from: classes2.dex */
final class ExcludeFromSystemGestureNode extends RectListNode {
    @Override // androidx.compose.foundation.RectListNode
    public final MutableVector e2() {
        List systemGestureExclusionRects;
        MutableVector mutableVector = new MutableVector(new Rect[16]);
        systemGestureExclusionRects = DelegatableNode_androidKt.a(this).getSystemGestureExclusionRects();
        mutableVector.d(mutableVector.f14144c, systemGestureExclusionRects);
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    public final void f2(MutableVector mutableVector) {
        DelegatableNode_androidKt.a(this).setSystemGestureExclusionRects(mutableVector.f());
    }
}

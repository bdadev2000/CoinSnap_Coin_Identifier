package androidx.compose.ui.viewinterop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes2.dex */
public final class AndroidViewHolder_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 f17557a = new Object();

    public static final void a(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        long e02 = layoutNode.B.f16089b.e0(0L);
        int round = Math.round(Offset.g(e02));
        int round2 = Math.round(Offset.h(e02));
        androidViewHolder.layout(round, round2, androidViewHolder.getMeasuredWidth() + round, androidViewHolder.getMeasuredHeight() + round2);
    }
}

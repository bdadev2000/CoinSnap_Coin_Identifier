package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AndroidViewHolder$layoutNode$1$5$measure$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f17538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f17539b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$5$measure$2(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.f17538a = androidViewHolder;
        this.f17539b = layoutNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AndroidViewHolder_androidKt.a(this.f17538a, this.f17539b);
        return b0.f30125a;
    }
}

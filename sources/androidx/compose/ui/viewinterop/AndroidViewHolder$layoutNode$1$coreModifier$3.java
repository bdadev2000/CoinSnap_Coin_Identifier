package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidViewHolder$layoutNode$1$coreModifier$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f17544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f17545b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.f17544a = androidViewHolder;
        this.f17545b = layoutNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LayoutNode layoutNode = this.f17545b;
        AndroidViewHolder androidViewHolder = this.f17544a;
        AndroidViewHolder_androidKt.a(androidViewHolder, layoutNode);
        androidViewHolder.f17510c.v();
        return b0.f30125a;
    }
}

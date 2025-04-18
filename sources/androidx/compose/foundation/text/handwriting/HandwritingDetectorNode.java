package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import b1.f0;
import d0.h;
import d0.i;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class HandwritingDetectorNode extends DelegatingNode implements PointerInputModifierNode {

    /* renamed from: q, reason: collision with root package name */
    public a f6265q = null;

    /* renamed from: r, reason: collision with root package name */
    public final h f6266r = f0.s(i.f30133c, new HandwritingDetectorNode$composeImm$2(this));

    /* renamed from: s, reason: collision with root package name */
    public final StylusHandwritingNodeWithNegativePadding f6267s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.text.handwriting.StylusHandwritingNode, androidx.compose.foundation.text.handwriting.StylusHandwritingNodeWithNegativePadding, androidx.compose.ui.node.DelegatableNode] */
    public HandwritingDetectorNode() {
        ?? stylusHandwritingNode = new StylusHandwritingNode(new HandwritingDetectorNode$pointerInputNode$1(this));
        e2(stylusHandwritingNode);
        this.f6267s = stylusHandwritingNode;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.f6267s.e0(pointerEvent, pointerEventPass, j2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void m1() {
        this.f6267s.m1();
    }
}

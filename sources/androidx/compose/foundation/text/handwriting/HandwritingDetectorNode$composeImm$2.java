package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
final class HandwritingDetectorNode$composeImm$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HandwritingDetectorNode f6268a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandwritingDetectorNode$composeImm$2(HandwritingDetectorNode handwritingDetectorNode) {
        super(0);
        this.f6268a = handwritingDetectorNode;
    }

    @Override // q0.a
    public final Object invoke() {
        return ComposeInputMethodManager_androidKt.a(DelegatableNode_androidKt.a(this.f6268a));
    }
}

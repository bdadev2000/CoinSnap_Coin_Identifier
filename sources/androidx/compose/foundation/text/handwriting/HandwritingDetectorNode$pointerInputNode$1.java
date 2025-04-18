package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
final class HandwritingDetectorNode$pointerInputNode$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HandwritingDetectorNode f6269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandwritingDetectorNode$pointerInputNode$1(HandwritingDetectorNode handwritingDetectorNode) {
        super(0);
        this.f6269a = handwritingDetectorNode;
    }

    @Override // q0.a
    public final Object invoke() {
        HandwritingDetectorNode handwritingDetectorNode = this.f6269a;
        handwritingDetectorNode.f6265q.invoke();
        ((ComposeInputMethodManager) handwritingDetectorNode.f6266r.getValue()).f();
        return Boolean.TRUE;
    }
}

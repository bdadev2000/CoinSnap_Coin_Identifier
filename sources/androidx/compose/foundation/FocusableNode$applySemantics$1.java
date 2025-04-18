package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FocusableNode$applySemantics$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusableNode f2713a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$applySemantics$1(FocusableNode focusableNode) {
        super(0);
        this.f2713a = focusableNode;
    }

    @Override // q0.a
    public final Object invoke() {
        return Boolean.valueOf(FocusRequesterModifierNodeKt.a(this.f2713a));
    }
}

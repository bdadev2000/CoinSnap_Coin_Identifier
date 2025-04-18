package androidx.compose.ui.focus;

import d0.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FocusTargetNode$invalidateFocus$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f14894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f14895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetNode$invalidateFocus$1(f0 f0Var, FocusTargetNode focusTargetNode) {
        super(0);
        this.f14894a = f0Var;
        this.f14895b = focusTargetNode;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f14894a.f30930a = this.f14895b.e2();
        return b0.f30125a;
    }
}

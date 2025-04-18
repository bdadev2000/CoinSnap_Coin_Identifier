package androidx.compose.ui.focus;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class FocusRestorerKt$saveFocusedChild$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f14879a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusRestorerKt$saveFocusedChild$1$1(FocusTargetNode focusTargetNode) {
        super(0);
        this.f14879a = focusTargetNode;
    }

    @Override // q0.a
    public final Object invoke() {
        return Integer.valueOf(this.f14879a.f14892r);
    }
}

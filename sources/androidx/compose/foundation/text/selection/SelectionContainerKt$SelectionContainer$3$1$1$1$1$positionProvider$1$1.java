package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class SelectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$1(SelectionManager selectionManager) {
        super(0);
        this.f7118a = selectionManager;
    }

    @Override // q0.a
    public final Object invoke() {
        Offset offset = (Offset) this.f7118a.f7226n.getValue();
        return new Offset(offset != null ? offset.f14913a : 9205357640488583168L);
    }
}

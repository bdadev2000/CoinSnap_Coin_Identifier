package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemAnimator f4774a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
        super(0);
        this.f4774a = lazyLayoutItemAnimator;
    }

    @Override // q0.a
    public final Object invoke() {
        DrawModifierNode drawModifierNode = this.f4774a.f4760j;
        if (drawModifierNode != null) {
            DrawModifierNodeKt.a(drawModifierNode);
        }
        return b0.f30125a;
    }
}

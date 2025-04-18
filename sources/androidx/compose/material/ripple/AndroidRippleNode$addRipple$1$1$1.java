package androidx.compose.material.ripple;

import androidx.compose.ui.node.DrawModifierNodeKt;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class AndroidRippleNode$addRipple$1$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidRippleNode f7386a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRippleNode$addRipple$1$1$1(AndroidRippleNode androidRippleNode) {
        super(0);
        this.f7386a = androidRippleNode;
    }

    @Override // q0.a
    public final Object invoke() {
        DrawModifierNodeKt.a(this.f7386a);
        return b0.f30125a;
    }
}

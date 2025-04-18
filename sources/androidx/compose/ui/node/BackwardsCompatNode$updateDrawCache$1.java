package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawCacheModifier;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class BackwardsCompatNode$updateDrawCache$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier.Element f15887a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackwardsCompatNode$updateDrawCache$1(Modifier.Element element, BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.f15887a = element;
    }

    @Override // q0.a
    public final Object invoke() {
        ((DrawCacheModifier) this.f15887a).x0();
        return b0.f30125a;
    }
}

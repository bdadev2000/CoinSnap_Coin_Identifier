package androidx.compose.animation;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class EnterExitTransitionKt$createModifier$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f1838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$2$1(q0.a aVar, boolean z2) {
        super(1);
        this.f1837a = z2;
        this.f1838b = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((GraphicsLayerScope) obj).x(!this.f1837a && ((Boolean) this.f1838b.invoke()).booleanValue());
        return b0.f30125a;
    }
}

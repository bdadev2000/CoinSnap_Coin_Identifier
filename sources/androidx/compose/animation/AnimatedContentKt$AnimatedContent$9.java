package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AnimatedContentKt$AnimatedContent$9 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f1655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f1656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1657c;
    public final /* synthetic */ Alignment d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f1658f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0.r f1659g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1660h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1661i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$9(Transition transition, Modifier modifier, l lVar, Alignment alignment, l lVar2, q0.r rVar, int i2, int i3) {
        super(2);
        this.f1655a = transition;
        this.f1656b = modifier;
        this.f1657c = lVar;
        this.d = alignment;
        this.f1658f = lVar2;
        this.f1659g = rVar;
        this.f1660h = i2;
        this.f1661i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AnimatedContentKt.a(this.f1655a, this.f1656b, this.f1657c, this.d, this.f1658f, this.f1659g, (Composer) obj, RecomposeScopeImplKt.a(this.f1660h | 1), this.f1661i);
        return b0.f30125a;
    }
}

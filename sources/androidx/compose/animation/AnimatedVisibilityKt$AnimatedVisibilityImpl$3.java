package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AnimatedVisibilityKt$AnimatedVisibilityImpl$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f1765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f1767c;
    public final /* synthetic */ EnterTransition d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ExitTransition f1768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f1769g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1770h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibilityImpl$3(Transition transition, l lVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, q qVar, int i2) {
        super(2);
        this.f1765a = transition;
        this.f1766b = lVar;
        this.f1767c = modifier;
        this.d = enterTransition;
        this.f1768f = exitTransition;
        this.f1769g = qVar;
        this.f1770h = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AnimatedVisibilityKt.e(this.f1765a, this.f1766b, this.f1767c, this.d, this.f1768f, this.f1769g, (Composer) obj, RecomposeScopeImplKt.a(this.f1770h | 1));
        return b0.f30125a;
    }
}

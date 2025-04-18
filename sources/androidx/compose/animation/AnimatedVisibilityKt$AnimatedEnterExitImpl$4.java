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
/* loaded from: classes4.dex */
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f1686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f1688c;
    public final /* synthetic */ EnterTransition d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ExitTransition f1689f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f1690g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ OnLookaheadMeasured f1691h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f1692i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1693j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1694k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$4(Transition transition, l lVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, p pVar, OnLookaheadMeasured onLookaheadMeasured, q qVar, int i2, int i3) {
        super(2);
        this.f1686a = transition;
        this.f1687b = lVar;
        this.f1688c = modifier;
        this.d = enterTransition;
        this.f1689f = exitTransition;
        this.f1690g = pVar;
        this.f1691h = onLookaheadMeasured;
        this.f1692i = qVar;
        this.f1693j = i2;
        this.f1694k = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AnimatedVisibilityKt.a(this.f1686a, this.f1687b, this.f1688c, this.d, this.f1689f, this.f1690g, this.f1691h, this.f1692i, (Composer) obj, RecomposeScopeImplKt.a(this.f1693j | 1), this.f1694k);
        return b0.f30125a;
    }
}

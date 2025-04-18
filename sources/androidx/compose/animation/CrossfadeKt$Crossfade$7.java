package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
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
/* loaded from: classes3.dex */
public final class CrossfadeKt$Crossfade$7 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f1800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f1801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f1802c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f1803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1805h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$7(Transition transition, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, l lVar, q qVar, int i2, int i3) {
        super(2);
        this.f1800a = transition;
        this.f1801b = modifier;
        this.f1802c = finiteAnimationSpec;
        this.d = lVar;
        this.f1803f = qVar;
        this.f1804g = i2;
        this.f1805h = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        CrossfadeKt.a(this.f1800a, this.f1801b, this.f1802c, this.d, this.f1803f, (Composer) obj, RecomposeScopeImplKt.a(this.f1804g | 1), this.f1805h);
        return b0.f30125a;
    }
}

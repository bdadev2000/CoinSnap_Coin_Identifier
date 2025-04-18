package androidx.compose.animation;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedVisibility$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RowScope f1735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f1737c;
    public final /* synthetic */ EnterTransition d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ExitTransition f1738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f1740h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1741i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1742j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$4(RowScope rowScope, boolean z2, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, q qVar, int i2, int i3) {
        super(2);
        this.f1735a = rowScope;
        this.f1736b = z2;
        this.f1737c = modifier;
        this.d = enterTransition;
        this.f1738f = exitTransition;
        this.f1739g = str;
        this.f1740h = qVar;
        this.f1741i = i2;
        this.f1742j = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AnimatedVisibilityKt.c(this.f1735a, this.f1736b, this.f1737c, this.d, this.f1738f, this.f1739g, this.f1740h, (Composer) obj, RecomposeScopeImplKt.a(this.f1741i | 1), this.f1742j);
        return b0.f30125a;
    }
}

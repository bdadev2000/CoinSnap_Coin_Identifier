package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedVisibility$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f1728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EnterTransition f1729c;
    public final /* synthetic */ ExitTransition d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f1731g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1732h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1733i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$2(boolean z2, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, q qVar, int i2, int i3) {
        super(2);
        this.f1727a = z2;
        this.f1728b = modifier;
        this.f1729c = enterTransition;
        this.d = exitTransition;
        this.f1730f = str;
        this.f1731g = qVar;
        this.f1732h = i2;
        this.f1733i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AnimatedVisibilityKt.d(this.f1727a, this.f1728b, this.f1729c, this.d, this.f1730f, this.f1731g, (Composer) obj, RecomposeScopeImplKt.a(this.f1732h | 1), this.f1733i);
        return b0.f30125a;
    }
}

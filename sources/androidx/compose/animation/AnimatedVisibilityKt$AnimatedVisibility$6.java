package androidx.compose.animation;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedVisibility$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ColumnScope f1744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f1746c;
    public final /* synthetic */ EnterTransition d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ExitTransition f1747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1748g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f1749h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1750i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1751j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$6(ColumnScope columnScope, boolean z2, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, q qVar, int i2, int i3) {
        super(2);
        this.f1744a = columnScope;
        this.f1745b = z2;
        this.f1746c = modifier;
        this.d = enterTransition;
        this.f1747f = exitTransition;
        this.f1748g = str;
        this.f1749h = qVar;
        this.f1750i = i2;
        this.f1751j = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AnimatedVisibilityKt.b(this.f1744a, this.f1745b, this.f1746c, this.d, this.f1747f, this.f1748g, this.f1749h, (Composer) obj, RecomposeScopeImplKt.a(this.f1750i | 1), this.f1751j);
        return b0.f30125a;
    }
}

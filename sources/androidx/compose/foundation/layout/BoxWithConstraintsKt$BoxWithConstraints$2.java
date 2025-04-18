package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BoxWithConstraintsKt$BoxWithConstraints$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f3821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Alignment f3822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3823c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3825g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$2(Modifier modifier, Alignment alignment, boolean z2, q qVar, int i2, int i3) {
        super(2);
        this.f3821a = modifier;
        this.f3822b = alignment;
        this.f3823c = z2;
        this.d = qVar;
        this.f3824f = i2;
        this.f3825g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BoxWithConstraintsKt.a(this.f3821a, this.f3822b, this.f3823c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f3824f | 1), this.f3825g);
        return b0.f30125a;
    }
}

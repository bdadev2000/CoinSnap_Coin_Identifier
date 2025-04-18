package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BasicTooltip_androidKt$WrappedAnchor$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f2540c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2542g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$WrappedAnchor$2(boolean z2, BasicTooltipState basicTooltipState, Modifier modifier, p pVar, int i2, int i3) {
        super(2);
        this.f2538a = z2;
        this.f2539b = basicTooltipState;
        this.f2540c = modifier;
        this.d = pVar;
        this.f2541f = i2;
        this.f2542g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BasicTooltip_androidKt.b(this.f2538a, this.f2539b, this.f2540c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f2541f | 1), this.f2542g);
        return b0.f30125a;
    }
}

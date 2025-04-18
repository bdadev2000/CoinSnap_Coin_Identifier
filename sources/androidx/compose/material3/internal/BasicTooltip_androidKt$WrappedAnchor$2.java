package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BasicTooltip_androidKt$WrappedAnchor$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TooltipState f12898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f12899c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12900f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12901g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$WrappedAnchor$2(boolean z2, TooltipState tooltipState, Modifier modifier, p pVar, int i2, int i3) {
        super(2);
        this.f12897a = z2;
        this.f12898b = tooltipState;
        this.f12899c = modifier;
        this.d = pVar;
        this.f12900f = i2;
        this.f12901g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BasicTooltip_androidKt.c(this.f12897a, this.f12898b, this.f12899c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f12900f | 1), this.f12901g);
        return b0.f30125a;
    }
}

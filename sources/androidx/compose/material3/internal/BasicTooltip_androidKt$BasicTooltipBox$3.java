package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BasicTooltip_androidKt$BasicTooltipBox$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f12878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f12879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TooltipState f12880c;
    public final /* synthetic */ Modifier d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f12881f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f12882g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f12883h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12884i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f12885j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$BasicTooltipBox$3(PopupPositionProvider popupPositionProvider, p pVar, TooltipState tooltipState, Modifier modifier, boolean z2, boolean z3, p pVar2, int i2, int i3) {
        super(2);
        this.f12878a = popupPositionProvider;
        this.f12879b = pVar;
        this.f12880c = tooltipState;
        this.d = modifier;
        this.f12881f = z2;
        this.f12882g = z3;
        this.f12883h = pVar2;
        this.f12884i = i2;
        this.f12885j = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BasicTooltip_androidKt.a(this.f12878a, this.f12879b, this.f12880c, this.d, this.f12881f, this.f12882g, this.f12883h, (Composer) obj, RecomposeScopeImplKt.a(this.f12884i | 1), this.f12885j);
        return b0.f30125a;
    }
}

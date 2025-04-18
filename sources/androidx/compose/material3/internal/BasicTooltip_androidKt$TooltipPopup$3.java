package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.window.PopupPositionProvider;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BasicTooltip_androidKt$TooltipPopup$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f12892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TooltipState f12893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f12894c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f12895f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12896g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$TooltipPopup$3(PopupPositionProvider popupPositionProvider, TooltipState tooltipState, d0 d0Var, boolean z2, p pVar, int i2) {
        super(2);
        this.f12892a = popupPositionProvider;
        this.f12893b = tooltipState;
        this.f12894c = d0Var;
        this.d = z2;
        this.f12895f = pVar;
        this.f12896g = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BasicTooltip_androidKt.b(this.f12892a, this.f12893b, this.f12894c, this.d, this.f12895f, (Composer) obj, RecomposeScopeImplKt.a(this.f12896g | 1));
        return b0.f30125a;
    }
}

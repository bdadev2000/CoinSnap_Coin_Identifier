package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.window.PopupPositionProvider;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BasicTooltip_androidKt$TooltipPopup$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f2533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2534b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f2535c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f2536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2537g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$TooltipPopup$3(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, d0 d0Var, boolean z2, p pVar, int i2) {
        super(2);
        this.f2533a = popupPositionProvider;
        this.f2534b = basicTooltipState;
        this.f2535c = d0Var;
        this.d = z2;
        this.f2536f = pVar;
        this.f2537g = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BasicTooltip_androidKt.a(this.f2533a, this.f2534b, this.f2535c, this.d, this.f2536f, (Composer) obj, RecomposeScopeImplKt.a(this.f2537g | 1));
        return b0.f30125a;
    }
}

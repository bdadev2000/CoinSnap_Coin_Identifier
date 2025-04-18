package androidx.compose.material3;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
final class TooltipScopeImpl$drawCaret$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f12558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TooltipScopeImpl f12559b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipScopeImpl$drawCaret$1(p pVar, TooltipScopeImpl tooltipScopeImpl) {
        super(1);
        this.f12558a = pVar;
        this.f12559b = tooltipScopeImpl;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Object invoke = this.f12559b.f12557a.invoke();
        return (DrawResult) this.f12558a.invoke((CacheDrawScope) obj, invoke);
    }
}

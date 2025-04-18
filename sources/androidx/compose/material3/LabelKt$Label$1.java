package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class LabelKt$Label$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f9639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TooltipScopeImpl f9640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$Label$1(q qVar, TooltipScopeImpl tooltipScopeImpl) {
        super(2);
        this.f9639a = qVar;
        this.f9640b = tooltipScopeImpl;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            this.f9639a.invoke(this.f9640b, composer, 6);
        }
        return b0.f30125a;
    }
}

package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class ReportDrawnKt$ReportDrawn$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawn$2(int i2) {
        super(2);
        this.f253a = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i2 = this.f253a | 1;
        ComposerImpl g2 = ((Composer) obj).g(-1357012904);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            ReportDrawnKt.b(ReportDrawnKt$ReportDrawn$1.f252a, g2, 6);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ReportDrawnKt$ReportDrawn$2(i2);
        }
        return b0.f30125a;
    }
}

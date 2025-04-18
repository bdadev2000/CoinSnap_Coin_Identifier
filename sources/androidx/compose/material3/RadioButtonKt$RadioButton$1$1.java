package androidx.compose.material3;

import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class RadioButtonKt$RadioButton$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f10743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ State f10744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$1$1(State state, State state2) {
        super(1);
        this.f10743a = state;
        this.f10744b = state2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float y1 = drawScope.y1(RadioButtonKt.f10742c);
        State state = this.f10743a;
        float f2 = 2;
        float f3 = y1 / f2;
        drawScope.j1(((Color) state.getValue()).f14964a, (r19 & 2) != 0 ? Size.c(drawScope.b()) / 2.0f : drawScope.y1(RadioButtonTokens.f13495a / f2) - f3, (r19 & 4) != 0 ? drawScope.F1() : 0L, (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : new Stroke(y1, 0.0f, 0, 0, 30), null, (r19 & 64) != 0 ? 3 : 0);
        State state2 = this.f10744b;
        if (Float.compare(((Dp) state2.getValue()).f17486a, 0) > 0) {
            drawScope.j1(((Color) state.getValue()).f14964a, (r19 & 2) != 0 ? Size.c(drawScope.b()) / 2.0f : drawScope.y1(((Dp) state2.getValue()).f17486a) - f3, (r19 & 4) != 0 ? drawScope.F1() : 0L, (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : Fill.f15146a, null, (r19 & 64) != 0 ? 3 : 0);
        }
        return b0.f30125a;
    }
}

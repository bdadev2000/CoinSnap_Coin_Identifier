package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldKt$drawIndicatorLine$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f12183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$drawIndicatorLine$1(MutableState mutableState) {
        super(1);
        this.f12183a = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        contentDrawScope.P1();
        State state = this.f12183a;
        float y1 = contentDrawScope.y1(((BorderStroke) state.getValue()).f2608a);
        float b2 = Size.b(contentDrawScope.b()) - (y1 / 2);
        contentDrawScope.B1(((BorderStroke) state.getValue()).f2609b, OffsetKt.a(0.0f, b2), OffsetKt.a(Size.d(contentDrawScope.b()), b2), (r22 & 8) != 0 ? 0.0f : y1, 0, null, (r22 & 64) != 0 ? 1.0f : 0.0f, null, (r22 & 256) != 0 ? 3 : 0);
        return b0.f30125a;
    }
}

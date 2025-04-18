package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import d0.b0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import q0.l;

/* loaded from: classes4.dex */
final /* synthetic */ class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 extends o implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode f6336a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        super(1, q.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f6336a = legacyPlatformTextInputNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float[] fArr = ((Matrix) obj).f14999a;
        LayoutCoordinates S = this.f6336a.S();
        if (S != null) {
            if (!S.B()) {
                S = null;
            }
            if (S != null) {
                S.P(fArr);
            }
        }
        return b0.f30125a;
    }
}

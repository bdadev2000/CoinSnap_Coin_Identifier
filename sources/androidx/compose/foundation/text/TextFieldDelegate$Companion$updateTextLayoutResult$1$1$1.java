package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f6130a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1(LayoutCoordinates layoutCoordinates) {
        super(1);
        this.f6130a = layoutCoordinates;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float[] fArr = ((Matrix) obj).f14999a;
        LayoutCoordinates layoutCoordinates = this.f6130a;
        if (layoutCoordinates.B()) {
            LayoutCoordinatesKt.c(layoutCoordinates).E(layoutCoordinates, fArr);
        }
        return b0.f30125a;
    }
}

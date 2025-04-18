package androidx.compose.foundation.text;

import androidx.compose.ui.layout.LayoutCoordinates;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.f5874a = legacyTextFieldState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        TextLayoutResultProxy d = this.f5874a.d();
        if (d != null) {
            d.f6212c = layoutCoordinates;
        }
        return b0.f30125a;
    }
}

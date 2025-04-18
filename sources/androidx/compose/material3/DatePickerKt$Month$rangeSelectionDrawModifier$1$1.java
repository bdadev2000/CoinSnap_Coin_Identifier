package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DatePickerKt$Month$rangeSelectionDrawModifier$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectedRangeInfo f8916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8917b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$rangeSelectionDrawModifier$1$1(SelectedRangeInfo selectedRangeInfo, DatePickerColors datePickerColors) {
        super(1);
        this.f8916a = selectedRangeInfo;
        this.f8917b = datePickerColors;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        long j2 = this.f8917b.f8721v;
        PaddingValuesImpl paddingValuesImpl = DateRangePickerKt.f9089a;
        float f2 = DatePickerKt.f8765a;
        float y1 = contentDrawScope.y1(f2);
        float y12 = contentDrawScope.y1(f2);
        float y13 = contentDrawScope.y1(DatePickerModalTokens.f13294h);
        float f3 = 2;
        float f4 = (y12 - y13) / f3;
        float f5 = 7;
        float d = (Size.d(contentDrawScope.b()) - (f5 * y1)) / f5;
        SelectedRangeInfo selectedRangeInfo = this.f8916a;
        long j3 = selectedRangeInfo.f11176a;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        long j4 = selectedRangeInfo.f11177b;
        int i4 = (int) (j4 >> 32);
        int i5 = (int) (j4 & 4294967295L);
        float f6 = y1 + d;
        float f7 = d / f3;
        float f8 = (i2 * f6) + (selectedRangeInfo.f11178c ? y1 / f3 : 0.0f) + f7;
        float f9 = (i3 * y12) + f4;
        float f10 = i4 * f6;
        if (selectedRangeInfo.d) {
            y1 /= f3;
        }
        float f11 = f10 + y1 + f7;
        float f12 = (i5 * y12) + f4;
        boolean z2 = contentDrawScope.getLayoutDirection() == LayoutDirection.f17495b;
        if (z2) {
            f8 = Size.d(contentDrawScope.b()) - f8;
            f11 = Size.d(contentDrawScope.b()) - f11;
        }
        float f13 = f11;
        DrawScope.R0(contentDrawScope, j2, OffsetKt.a(f8, f9), SizeKt.a(i3 == i5 ? f13 - f8 : z2 ? -f8 : Size.d(contentDrawScope.b()) - f8, y13), 0.0f, null, 120);
        if (i3 != i5) {
            for (int i6 = (i5 - i3) - 1; i6 > 0; i6--) {
                DrawScope.R0(contentDrawScope, j2, OffsetKt.a(0.0f, (i6 * y12) + f9), SizeKt.a(Size.d(contentDrawScope.b()), y13), 0.0f, null, 120);
            }
            long a2 = OffsetKt.a(contentDrawScope.getLayoutDirection() != LayoutDirection.f17494a ? Size.d(contentDrawScope.b()) : 0.0f, f12);
            if (z2) {
                f13 -= Size.d(contentDrawScope.b());
            }
            DrawScope.R0(contentDrawScope, j2, a2, SizeKt.a(f13, y13), 0.0f, null, 120);
        }
        contentDrawScope.P1();
        return b0.f30125a;
    }
}

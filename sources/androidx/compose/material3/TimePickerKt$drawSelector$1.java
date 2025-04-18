package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$drawSelector$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f12495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$drawSelector$1(AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors) {
        super(1);
        this.f12495a = analogTimePickerState;
        this.f12496b = timePickerColors;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        AnalogTimePickerState analogTimePickerState = this.f12495a;
        long a2 = OffsetKt.a(contentDrawScope.y1(Float.intBitsToFloat((int) (TimePickerKt.t(analogTimePickerState) >> 32))), contentDrawScope.y1(Float.intBitsToFloat((int) (TimePickerKt.t(analogTimePickerState) & 4294967295L))));
        float f2 = 2;
        float y1 = contentDrawScope.y1(TimePickerTokens.f13564c) / f2;
        TimePickerColors timePickerColors = this.f12496b;
        long j2 = timePickerColors.f12311b;
        contentDrawScope.j1(Color.f14957b, (r19 & 2) != 0 ? Size.c(contentDrawScope.b()) / 2.0f : y1, (r19 & 4) != 0 ? contentDrawScope.F1() : a2, (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : null, null, (r19 & 64) != 0 ? 3 : 0);
        contentDrawScope.P1();
        contentDrawScope.j1(j2, (r19 & 2) != 0 ? Size.c(contentDrawScope.b()) / 2.0f : y1, (r19 & 4) != 0 ? contentDrawScope.F1() : a2, (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : null, null, (r19 & 64) != 0 ? 3 : 11);
        contentDrawScope.b1(j2, SizeKt.b(contentDrawScope.b()), Offset.j(a2, OffsetKt.a(((float) Math.cos(((Number) analogTimePickerState.d.d()).floatValue())) * y1, ((float) Math.sin(((Number) analogTimePickerState.d.d()).floatValue())) * y1)), (r26 & 8) != 0 ? 0.0f : contentDrawScope.y1(TimePickerTokens.d), (r26 & 16) != 0 ? 0 : 0, null, (r26 & 64) != 0 ? 1.0f : 0.0f, null, (r26 & 256) != 0 ? 3 : 3);
        contentDrawScope.j1(j2, (r19 & 2) != 0 ? Size.c(contentDrawScope.b()) / 2.0f : contentDrawScope.y1(TimePickerTokens.f13563b) / f2, (r19 & 4) != 0 ? contentDrawScope.F1() : SizeKt.b(contentDrawScope.b()), (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : null, null, (r19 & 64) != 0 ? 3 : 0);
        contentDrawScope.j1(timePickerColors.e, (r19 & 2) != 0 ? Size.c(contentDrawScope.b()) / 2.0f : y1, (r19 & 4) != 0 ? contentDrawScope.F1() : a2, (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : null, null, (r19 & 64) != 0 ? 3 : 4);
        return b0.f30125a;
    }
}

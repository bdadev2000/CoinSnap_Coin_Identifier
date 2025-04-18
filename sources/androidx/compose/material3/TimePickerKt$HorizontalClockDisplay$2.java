package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$HorizontalClockDisplay$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$HorizontalClockDisplay$2(TimePickerState timePickerState, TimePickerColors timePickerColors, int i2) {
        super(2);
        this.f12391a = timePickerState;
        this.f12392b = timePickerColors;
        this.f12393c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f12393c | 1);
        TimePickerKt.c(this.f12391a, this.f12392b, (Composer) obj, a2);
        return b0.f30125a;
    }
}

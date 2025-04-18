package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class DateRangePickerKt$DateRangePicker$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DateRangePickerState f9092a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePicker$2(DateRangePickerState dateRangePickerState) {
        super(2);
        this.f9092a = dateRangePickerState;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            DateRangePickerDefaults.f9061a.c(this.f9092a.e(), PaddingKt.e(Modifier.Companion.f14687a, DateRangePickerKt.f9090b), composer, 432, 0);
        }
        return b0.f30125a;
    }
}

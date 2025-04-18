package androidx.compose.material3;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$TimeInputImpl$hourValue$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12436a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$hourValue$2$1(TimePickerState timePickerState) {
        super(0);
        this.f12436a = timePickerState;
    }

    @Override // q0.a
    public final Object invoke() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(new TextFieldValue(CalendarLocale_jvmKt.a(TimePickerKt.s(this.f12436a), 2, 6), 0L, 6), StructuralEqualityPolicy.f14078a);
        return f2;
    }
}

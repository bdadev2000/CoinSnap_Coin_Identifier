package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TimePickerKt$TimeInputImpl$1$1$1$5$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f12430b;

    /* renamed from: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState f12431a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState mutableState) {
            super(1);
            this.f12431a = mutableState;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            float f2 = TimePickerKt.f12322a;
            this.f12431a.setValue((TextFieldValue) obj);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$1$5$1(TimePickerState timePickerState, MutableState mutableState) {
        super(1);
        this.f12429a = timePickerState;
        this.f12430b = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        TimePickerState timePickerState = this.f12429a;
        float f2 = TimePickerKt.f12322a;
        MutableState mutableState = this.f12430b;
        TimePickerKt.r(1, timePickerState, textFieldValue, (TextFieldValue) mutableState.getValue(), 59, new AnonymousClass1(mutableState));
        return b0.f30125a;
    }
}

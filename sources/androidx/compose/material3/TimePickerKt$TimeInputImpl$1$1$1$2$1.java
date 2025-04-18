package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TimePickerKt$TimeInputImpl$1$1$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f12424b;

    /* renamed from: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState f12425a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState mutableState) {
            super(1);
            this.f12425a = mutableState;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            float f2 = TimePickerKt.f12322a;
            this.f12425a.setValue((TextFieldValue) obj);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$1$2$1(TimePickerState timePickerState, MutableState mutableState) {
        super(1);
        this.f12423a = timePickerState;
        this.f12424b = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        TimePickerState timePickerState = this.f12423a;
        float f2 = TimePickerKt.f12322a;
        MutableState mutableState = this.f12424b;
        TimePickerKt.r(0, timePickerState, textFieldValue, (TextFieldValue) mutableState.getValue(), this.f12423a.g() ? 23 : 12, new AnonymousClass1(mutableState));
        return b0.f30125a;
    }
}

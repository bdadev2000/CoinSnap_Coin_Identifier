package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class TimePickerKt$TimeInputImpl$1$1$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f12422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$1$1$1(TimePickerState timePickerState, MutableState mutableState) {
        super(1);
        this.f12421a = timePickerState;
        this.f12422b = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int unicodeChar = ((KeyEvent) obj).f15514a.getUnicodeChar();
        if (48 <= unicodeChar && unicodeChar < 58) {
            float f2 = TimePickerKt.f12322a;
            MutableState mutableState = this.f12422b;
            long j2 = ((TextFieldValue) mutableState.getValue()).f17362b;
            int i2 = TextRange.f17057c;
            if (((int) (j2 >> 32)) == 2 && ((TextFieldValue) mutableState.getValue()).f17361a.f16880a.length() == 2) {
                this.f12421a.b(1);
            }
        }
        return Boolean.FALSE;
    }
}

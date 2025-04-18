package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DatePickerKt$DatePickerContent$1$3$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f8811a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$3$1(MutableState mutableState) {
        super(0);
        this.f8811a = mutableState;
    }

    @Override // q0.a
    public final Object invoke() {
        float f2 = DatePickerKt.f8765a;
        this.f8811a.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
        return b0.f30125a;
    }
}

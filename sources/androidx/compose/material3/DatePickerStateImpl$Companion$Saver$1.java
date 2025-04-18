package androidx.compose.material3;

import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;
import w0.g;

/* loaded from: classes4.dex */
final class DatePickerStateImpl$Companion$Saver$1 extends r implements p {
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) obj2;
        Long i2 = datePickerStateImpl.i();
        Long valueOf = Long.valueOf(datePickerStateImpl.f());
        g gVar = datePickerStateImpl.f7909a;
        return f0.v(i2, valueOf, Integer.valueOf(gVar.f31406a), Integer.valueOf(gVar.f31407b), Integer.valueOf(datePickerStateImpl.e()));
    }
}

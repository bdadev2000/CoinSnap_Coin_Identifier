package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
final class DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f9178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f9179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f9180c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1(Long l2, Long l3, p pVar) {
        super(1);
        this.f9178a = l2;
        this.f9179b = l3;
        this.f9180c = pVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        PaddingValuesImpl paddingValuesImpl = DateRangePickerKt.f9089a;
        Long l2 = this.f9178a;
        Long l3 = this.f9179b;
        p pVar = this.f9180c;
        if ((l2 == null && l3 == null) || (l2 != null && l3 != null)) {
            pVar.invoke(Long.valueOf(longValue), null);
        } else if (l2 == null || longValue < l2.longValue()) {
            pVar.invoke(Long.valueOf(longValue), null);
        } else {
            pVar.invoke(l2, Long.valueOf(longValue));
        }
        return b0.f30125a;
    }
}

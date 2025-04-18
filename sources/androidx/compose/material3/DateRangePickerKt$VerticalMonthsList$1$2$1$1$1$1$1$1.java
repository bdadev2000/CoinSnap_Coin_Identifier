package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;
import x0.n;

/* loaded from: classes.dex */
final class DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f9177a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$1$1(List list) {
        super(1);
        this.f9177a = list;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.f16812v;
        n nVar = SemanticsPropertiesKt.f16865a[25];
        semanticsPropertyKey.getClass();
        ((SemanticsPropertyReceiver) obj).b(semanticsPropertyKey, this.f9177a);
        return b0.f30125a;
    }
}

package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class DateRangePickerDefaults$DateRangePickerHeadline$4$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9072b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerDefaults$DateRangePickerHeadline$4$1(String str, String str2) {
        super(1);
        this.f9071a = str;
        this.f9072b = str2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SemanticsPropertiesKt.n(semanticsPropertyReceiver, 0);
        SemanticsPropertiesKt.l(semanticsPropertyReceiver, this.f9071a + ", " + this.f9072b);
        return b0.f30125a;
    }
}

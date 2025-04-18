package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class TimePickerKt$ToggleItem$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ToggleItem$1$1(boolean z2) {
        super(1);
        this.f12474a = z2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertiesKt.s((SemanticsPropertyReceiver) obj, this.f12474a);
        return b0.f30125a;
    }
}

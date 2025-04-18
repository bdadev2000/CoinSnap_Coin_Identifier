package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class DateInputKt$DateInputContent$2$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8661b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputContent$2$1$1(String str, String str2) {
        super(1);
        this.f8660a = str;
        this.f8661b = str2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertiesKt.l((SemanticsPropertyReceiver) obj, this.f8660a + ", " + this.f8661b);
        return b0.f30125a;
    }
}

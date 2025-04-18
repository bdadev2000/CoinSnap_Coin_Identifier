package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class IconKt$Icon$semantics$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$semantics$1$1(String str) {
        super(1);
        this.f9617a = str;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SemanticsPropertiesKt.l(semanticsPropertyReceiver, this.f9617a);
        SemanticsPropertiesKt.r(semanticsPropertyReceiver, 5);
        return b0.f30125a;
    }
}

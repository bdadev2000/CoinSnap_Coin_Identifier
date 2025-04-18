package androidx.compose.material3.internal;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import x0.n;

/* loaded from: classes3.dex */
final class TextFieldImplKt$defaultErrorSemantics$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13106a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$defaultErrorSemantics$1(String str) {
        super(1);
        this.f13106a = str;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        ((SemanticsPropertyReceiver) obj).b(SemanticsProperties.E, this.f13106a);
        return b0.f30125a;
    }
}

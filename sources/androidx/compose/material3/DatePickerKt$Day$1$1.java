package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import b1.f0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import x0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DatePickerKt$Day$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8846a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Day$1$1(String str) {
        super(1);
        this.f8846a = str;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        AnnotatedString annotatedString = new AnnotatedString(this.f8846a, null, 6);
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        semanticsPropertyReceiver.b(SemanticsProperties.f16851v, f0.u(annotatedString));
        SemanticsPropertiesKt.r(semanticsPropertyReceiver, 0);
        return b0.f30125a;
    }
}

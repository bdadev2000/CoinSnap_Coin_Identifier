package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import x0.n;
import z0.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DateInputKt$DateInputTextField$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f8677a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$2$1(MutableState mutableState) {
        super(1);
        this.f8677a = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        MutableState mutableState = this.f8677a;
        if (!m.Z0((CharSequence) mutableState.getValue())) {
            String str = (String) mutableState.getValue();
            n[] nVarArr = SemanticsPropertiesKt.f16865a;
            semanticsPropertyReceiver.b(SemanticsProperties.E, str);
        }
        return b0.f30125a;
    }
}

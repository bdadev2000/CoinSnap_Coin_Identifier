package androidx.compose.foundation.selection;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import x0.n;

/* loaded from: classes2.dex */
final class SelectableGroupKt$selectableGroup$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SelectableGroupKt$selectableGroup$1 f5360a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16835f;
        b0 b0Var = b0.f30125a;
        ((SemanticsPropertyReceiver) obj).b(semanticsPropertyKey, b0Var);
        return b0Var;
    }
}

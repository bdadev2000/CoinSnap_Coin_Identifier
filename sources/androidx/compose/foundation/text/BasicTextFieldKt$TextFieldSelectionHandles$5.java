package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BasicTextFieldKt$TextFieldSelectionHandles$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5637b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$TextFieldSelectionHandles$5(TextFieldSelectionState textFieldSelectionState, int i2) {
        super(2);
        this.f5636a = textFieldSelectionState;
        this.f5637b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f5637b | 1);
        BasicTextFieldKt.e(this.f5636a, (Composer) obj, a2);
        return b0.f30125a;
    }
}

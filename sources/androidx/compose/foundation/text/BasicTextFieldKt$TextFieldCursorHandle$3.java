package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BasicTextFieldKt$TextFieldCursorHandle$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$TextFieldCursorHandle$3(TextFieldSelectionState textFieldSelectionState, int i2) {
        super(2);
        this.f5625a = textFieldSelectionState;
        this.f5626b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f5626b | 1);
        BasicTextFieldKt.d(this.f5625a, (Composer) obj, a2);
        return b0.f30125a;
    }
}

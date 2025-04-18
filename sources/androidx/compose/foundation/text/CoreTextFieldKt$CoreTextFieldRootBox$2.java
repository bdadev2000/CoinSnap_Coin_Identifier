package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CoreTextFieldKt$CoreTextFieldRootBox$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f5936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f5938c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextFieldRootBox$2(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, p pVar, int i2) {
        super(2);
        this.f5936a = modifier;
        this.f5937b = textFieldSelectionManager;
        this.f5938c = pVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        TextFieldSelectionManager textFieldSelectionManager = this.f5937b;
        p pVar = this.f5938c;
        CoreTextFieldKt.b(this.f5936a, textFieldSelectionManager, pVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}

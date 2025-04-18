package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CoreTextFieldKt$SelectionToolbarAndHandles$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$SelectionToolbarAndHandles$2(TextFieldSelectionManager textFieldSelectionManager, boolean z2, int i2) {
        super(2);
        this.f5939a = textFieldSelectionManager;
        this.f5940b = z2;
        this.f5941c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f5941c | 1);
        CoreTextFieldKt.d(this.f5939a, this.f5940b, (Composer) obj, a2);
        return b0.f30125a;
    }
}

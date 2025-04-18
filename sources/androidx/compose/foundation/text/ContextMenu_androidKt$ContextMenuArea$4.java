package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ContextMenu_androidKt$ContextMenuArea$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f5786c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$ContextMenuArea$4(TextFieldSelectionState textFieldSelectionState, boolean z2, p pVar, int i2) {
        super(2);
        this.f5784a = textFieldSelectionState;
        this.f5785b = z2;
        this.f5786c = pVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        boolean z2 = this.f5785b;
        p pVar = this.f5786c;
        ContextMenu_androidKt.a(this.f5784a, z2, pVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}

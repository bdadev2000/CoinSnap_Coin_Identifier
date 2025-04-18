package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ResolvedTextDirection f7336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7337c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManagerKt$TextFieldSelectionHandle$3(boolean z2, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, int i2) {
        super(2);
        this.f7335a = z2;
        this.f7336b = resolvedTextDirection;
        this.f7337c = textFieldSelectionManager;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        ResolvedTextDirection resolvedTextDirection = this.f7336b;
        TextFieldSelectionManager textFieldSelectionManager = this.f7337c;
        TextFieldSelectionManagerKt.a(this.f7335a, resolvedTextDirection, textFieldSelectionManager, (Composer) obj, a2);
        return b0.f30125a;
    }
}

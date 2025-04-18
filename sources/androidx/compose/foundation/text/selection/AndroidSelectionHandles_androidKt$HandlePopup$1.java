package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AndroidSelectionHandles_androidKt$HandlePopup$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f7012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Alignment f7013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7014c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$HandlePopup$1(OffsetProvider offsetProvider, Alignment alignment, p pVar, int i2) {
        super(2);
        this.f7012a = offsetProvider;
        this.f7013b = alignment;
        this.f7014c = pVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        Alignment alignment = this.f7013b;
        p pVar = this.f7014c;
        AndroidSelectionHandles_androidKt.a(this.f7012a, alignment, pVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}

package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PopupLayout$Content$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f17694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$Content$4(PopupLayout popupLayout, int i2) {
        super(2);
        this.f17694a = popupLayout;
        this.f17695b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f17695b | 1);
        this.f17694a.a((Composer) obj, a2);
        return b0.f30125a;
    }
}

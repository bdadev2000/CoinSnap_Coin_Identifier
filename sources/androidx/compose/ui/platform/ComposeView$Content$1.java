package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposeView$Content$1 extends r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposeView f16429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16430b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeView$Content$1(ComposeView composeView, int i2) {
        super(2);
        this.f16429a = composeView;
        this.f16430b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f16430b | 1);
        this.f16429a.a((Composer) obj, a2);
        return b0.f30125a;
    }
}

package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Canvas;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class RenderNodeLayer$updateDisplayList$1$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.p f16586a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderNodeLayer$updateDisplayList$1$1(q0.p pVar) {
        super(1);
        this.f16586a = pVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f16586a.invoke((Canvas) obj, null);
        return b0.f30125a;
    }
}

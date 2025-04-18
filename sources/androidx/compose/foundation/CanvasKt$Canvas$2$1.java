package androidx.compose.foundation;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class CanvasKt$Canvas$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2613a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanvasKt$Canvas$2$1(String str) {
        super(1);
        this.f2613a = str;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertiesKt.l((SemanticsPropertyReceiver) obj, this.f2613a);
        return b0.f30125a;
    }
}

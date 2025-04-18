package androidx.compose.material3;

import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import w0.d;

/* loaded from: classes4.dex */
final class ProgressIndicatorKt$CircularProgressIndicator$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f10628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$2$1(q0.a aVar) {
        super(1);
        this.f10628a = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertiesKt.q((SemanticsPropertyReceiver) obj, new ProgressBarRangeInfo(((Number) this.f10628a.invoke()).floatValue(), new d(0.0f, 1.0f), 0));
        return b0.f30125a;
    }
}

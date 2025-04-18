package g;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30538a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(String str) {
        super(1);
        this.f30538a = str;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SemanticsPropertiesKt.l(semanticsPropertyReceiver, this.f30538a);
        SemanticsPropertiesKt.r(semanticsPropertyReceiver, 5);
        return d0.b0.f30125a;
    }
}

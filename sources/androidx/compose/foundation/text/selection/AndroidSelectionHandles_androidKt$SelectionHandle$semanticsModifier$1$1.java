package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f7031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1(OffsetProvider offsetProvider, boolean z2, boolean z3) {
        super(1);
        this.f7031a = offsetProvider;
        this.f7032b = z2;
        this.f7033c = z3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        long a2 = this.f7031a.a();
        semanticsPropertyReceiver.b(SelectionHandlesKt.f7187c, new SelectionHandleInfo(this.f7032b ? Handle.f5965b : Handle.f5966c, a2, this.f7033c ? SelectionHandleAnchor.f7179a : SelectionHandleAnchor.f7181c, OffsetKt.c(a2)));
        return b0.f30125a;
    }
}

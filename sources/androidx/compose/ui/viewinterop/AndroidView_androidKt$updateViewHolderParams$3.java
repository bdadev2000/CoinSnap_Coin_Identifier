package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidView_androidKt$updateViewHolderParams$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidView_androidKt$updateViewHolderParams$3 f17581a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        AndroidView_androidKt.c((LayoutNode) obj).setLifecycleOwner((LifecycleOwner) obj2);
        return b0.f30125a;
    }
}

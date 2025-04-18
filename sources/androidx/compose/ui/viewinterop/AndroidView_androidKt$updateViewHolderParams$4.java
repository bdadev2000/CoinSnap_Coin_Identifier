package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.savedstate.SavedStateRegistryOwner;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidView_androidKt$updateViewHolderParams$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidView_androidKt$updateViewHolderParams$4 f17582a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        AndroidView_androidKt.c((LayoutNode) obj).setSavedStateRegistryOwner((SavedStateRegistryOwner) obj2);
        return b0.f30125a;
    }
}

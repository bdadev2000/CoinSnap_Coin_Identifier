package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SemanticsNode$parent$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SemanticsNode$parent$1 f16828a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsConfiguration w = ((LayoutNode) obj).w();
        boolean z2 = false;
        if (w != null && w.f16816b) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}

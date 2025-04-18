package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f17531a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$2(LayoutNode layoutNode) {
        super(1);
        this.f17531a = layoutNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f17531a.k((Density) obj);
        return b0.f30125a;
    }
}

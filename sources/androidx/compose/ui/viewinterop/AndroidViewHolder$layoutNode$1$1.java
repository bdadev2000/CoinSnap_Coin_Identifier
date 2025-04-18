package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f17529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f17530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$1(LayoutNode layoutNode, Modifier modifier) {
        super(1);
        this.f17529a = layoutNode;
        this.f17530b = modifier;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f17529a.j(((Modifier) obj).T0(this.f17530b));
        return b0.f30125a;
    }
}

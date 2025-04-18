package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NodeChainKt$fillVector$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableVector f16099a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeChainKt$fillVector$1(MutableVector mutableVector) {
        super(1);
        this.f16099a = mutableVector;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f16099a.b((Modifier.Element) obj);
        return Boolean.TRUE;
    }
}

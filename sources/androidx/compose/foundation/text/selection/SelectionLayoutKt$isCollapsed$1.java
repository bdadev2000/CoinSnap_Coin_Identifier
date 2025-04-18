package androidx.compose.foundation.text.selection;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SelectionLayoutKt$isCollapsed$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f7197a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionLayoutKt$isCollapsed$1(b0 b0Var) {
        super(1);
        this.f7197a = b0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (((SelectableInfo) obj).f7082f.f17046a.f17038a.f16880a.length() > 0) {
            this.f7197a.f30919a = false;
        }
        return d0.b0.f30125a;
    }
}

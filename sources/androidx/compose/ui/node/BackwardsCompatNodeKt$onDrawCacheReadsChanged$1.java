package androidx.compose.ui.node;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class BackwardsCompatNodeKt$onDrawCacheReadsChanged$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final BackwardsCompatNodeKt$onDrawCacheReadsChanged$1 f15890a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) obj;
        backwardsCompatNode.f15881p = true;
        DrawModifierNodeKt.a(backwardsCompatNode);
        return b0.f30125a;
    }
}

package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import d0.b0;
import e0.s;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SharedTransitionScopeKt$SharedTransitionScope$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScopeImpl f1939a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$1$2$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(1);
        this.f1939a = sharedTransitionScopeImpl;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Comparator] */
    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        contentDrawScope.P1();
        SnapshotStateList snapshotStateList = this.f1939a.f1920i;
        if (snapshotStateList.size() > 1) {
            s.s0(snapshotStateList, new Object());
        }
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((LayerRenderer) snapshotStateList.get(i2)).b(contentDrawScope);
        }
        return b0.f30125a;
    }
}

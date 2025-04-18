package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.node.NodeCoordinator;
import d0.b0;
import h0.n;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4650a;

    /* renamed from: b, reason: collision with root package name */
    public n f4651b;

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public final void M(NodeCoordinator nodeCoordinator) {
        if (this.f4650a) {
            return;
        }
        this.f4650a = true;
        n nVar = this.f4651b;
        if (nVar != null) {
            nVar.resumeWith(b0.f30125a);
        }
        this.f4651b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(h0.g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f4653b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            d0.b0 r3 = d0.b0.f30125a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            h0.g r0 = r0.f4652a
            kotlin.jvm.internal.q.m(r6)
            goto L56
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.jvm.internal.q.m(r6)
            boolean r6 = r5.f4650a
            if (r6 != 0) goto L5b
            h0.n r6 = r5.f4651b
            r0.getClass()
            r0.f4652a = r6
            r0.d = r4
            h0.n r2 = new h0.n
            h0.g r0 = b1.f0.r(r0)
            r2.<init>(r0)
            r5.f4651b = r2
            java.lang.Object r0 = r2.a()
            if (r0 != r1) goto L55
            return r1
        L55:
            r0 = r6
        L56:
            if (r0 == 0) goto L5b
            r0.resumeWith(r3)
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.a(h0.g):java.lang.Object");
    }
}

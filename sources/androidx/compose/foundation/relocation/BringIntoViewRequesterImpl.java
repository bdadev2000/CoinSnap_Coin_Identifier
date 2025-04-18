package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;

/* JADX INFO: Access modifiers changed from: package-private */
@ExperimentalFoundationApi
/* loaded from: classes4.dex */
public final class BringIntoViewRequesterImpl implements BringIntoViewRequester {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f5325a = new MutableVector(new BringIntoViewRequesterNode[16]);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.ui.geometry.Rect r8, h0.g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.f5331h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5331h = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f5329f
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f5331h
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r8 = r0.d
            int r2 = r0.f5328c
            java.lang.Object[] r4 = r0.f5327b
            androidx.compose.ui.geometry.Rect r5 = r0.f5326a
            kotlin.jvm.internal.q.m(r9)
            r9 = r5
            goto L5d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.jvm.internal.q.m(r9)
            androidx.compose.runtime.collection.MutableVector r9 = r7.f5325a
            int r2 = r9.f14144c
            if (r2 <= 0) goto L60
            java.lang.Object[] r9 = r9.f14142a
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L48:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.BringIntoViewRequesterNode r5 = (androidx.compose.foundation.relocation.BringIntoViewRequesterNode) r5
            r0.f5326a = r9
            r0.f5327b = r4
            r0.f5328c = r2
            r0.d = r8
            r0.f5331h = r3
            java.lang.Object r5 = androidx.compose.foundation.relocation.ScrollIntoView.a(r5, r9, r0)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            int r8 = r8 + r3
            if (r8 < r2) goto L48
        L60:
            d0.b0 r8 = d0.b0.f30125a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.a(androidx.compose.ui.geometry.Rect, h0.g):java.lang.Object");
    }
}

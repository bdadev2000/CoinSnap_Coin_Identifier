package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.d0;
import q0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class NestedScrollDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public NestedScrollNode f15519a;

    /* renamed from: b, reason: collision with root package name */
    public a f15520b = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);

    /* renamed from: c, reason: collision with root package name */
    public d0 f15521c;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, h0.g r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.f15525c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f15525c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f15523a
            i0.a r0 = i0.a.f30806a
            int r1 = r6.f15525c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.jvm.internal.q.m(r12)
            goto L51
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.jvm.internal.q.m(r12)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r12 = r7.f15519a
            r1 = 0
            if (r12 == 0) goto L44
            boolean r3 = r12.f14699n
            if (r3 == 0) goto L44
            androidx.compose.ui.node.TraversableNode r12 = androidx.compose.ui.node.TraversableNodeKt.b(r12)
            r1 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r1
        L44:
            if (r1 == 0) goto L56
            r6.f15525c = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.h1(r2, r4, r6)
            if (r12 != r0) goto L51
            return r0
        L51:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r8 = r12.f17502a
            goto L58
        L56:
            r8 = 0
        L58:
            androidx.compose.ui.unit.Velocity r10 = new androidx.compose.ui.unit.Velocity
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.a(long, long, h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r6, h0.g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.f15528c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15528c = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f15526a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f15528c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.jvm.internal.q.m(r8)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.jvm.internal.q.m(r8)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r8 = r5.f15519a
            r2 = 0
            if (r8 == 0) goto L42
            boolean r4 = r8.f14699n
            if (r4 == 0) goto L42
            androidx.compose.ui.node.TraversableNode r8 = androidx.compose.ui.node.TraversableNodeKt.b(r8)
            r2 = r8
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r2
        L42:
            if (r2 == 0) goto L52
            r0.f15528c = r3
            java.lang.Object r8 = r2.W0(r6, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            androidx.compose.ui.unit.Velocity r8 = (androidx.compose.ui.unit.Velocity) r8
            long r6 = r8.f17502a
            goto L54
        L52:
            r6 = 0
        L54:
            androidx.compose.ui.unit.Velocity r8 = new androidx.compose.ui.unit.Velocity
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.b(long, h0.g):java.lang.Object");
    }

    public final d0 c() {
        d0 d0Var = (d0) this.f15520b.invoke();
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}

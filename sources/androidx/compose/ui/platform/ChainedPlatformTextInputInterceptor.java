package androidx.compose.ui.platform;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
/* loaded from: classes3.dex */
public final class ChainedPlatformTextInputInterceptor {

    /* renamed from: a, reason: collision with root package name */
    public final ChainedPlatformTextInputInterceptor f16402a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f16403b;

    public ChainedPlatformTextInputInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        ParcelableSnapshotMutableState f2;
        this.f16402a = chainedPlatformTextInputInterceptor;
        f2 = SnapshotStateKt.f(platformTextInputInterceptor, StructuralEqualityPolicy.f14078a);
        this.f16403b = f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.ui.node.Owner r5, q0.p r6, h0.g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1) r0
            int r1 = r0.f16406c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16406c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f16404a
            i0.a r1 = i0.a.f30806a
            int r1 = r0.f16406c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.jvm.internal.q.m(r7)
            d0.e r5 = new d0.e
            r5.<init>()
            throw r5
        L34:
            kotlin.jvm.internal.q.m(r7)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2 r7 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2
            r1 = 0
            r7.<init>(r6, r4, r1)
            r0.f16406c = r2
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r6 = r4.f16402a
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.b(r5, r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor.a(androidx.compose.ui.node.Owner, q0.p, h0.g):void");
    }
}

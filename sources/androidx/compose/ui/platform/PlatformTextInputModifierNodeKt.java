package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;

/* loaded from: classes4.dex */
public final class PlatformTextInputModifierNodeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16556a = new CompositionLocal(PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1.f16560a);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.platform.PlatformTextInputModifierNode r4, q0.p r5, h0.g r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1) r0
            int r1 = r0.f16562b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16562b = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16561a
            i0.a r1 = i0.a.f30806a
            int r1 = r0.f16562b
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            kotlin.jvm.internal.q.m(r6)
            d0.e r4 = new d0.e
            r4.<init>()
            throw r4
        L34:
            kotlin.jvm.internal.q.m(r6)
            r6 = r4
            androidx.compose.ui.Modifier$Node r6 = (androidx.compose.ui.Modifier.Node) r6
            androidx.compose.ui.Modifier$Node r6 = r6.f14688a
            boolean r6 = r6.f14699n
            if (r6 == 0) goto L58
            androidx.compose.ui.node.Owner r6 = androidx.compose.ui.node.DelegatableNodeKt.g(r4)
            androidx.compose.ui.node.LayoutNode r4 = androidx.compose.ui.node.DelegatableNodeKt.f(r4)
            androidx.compose.runtime.CompositionLocalMap r4 = r4.x
            androidx.compose.runtime.StaticProvidableCompositionLocal r1 = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.f16556a
            java.lang.Object r4 = r4.b(r1)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r4 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor) r4
            r0.f16562b = r2
            b(r6, r4, r5, r0)
            return
        L58:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.a(androidx.compose.ui.platform.PlatformTextInputModifierNode, q0.p, h0.g):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.node.Owner r4, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r5, q0.p r6, h0.g r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) r0
            int r1 = r0.f16564b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16564b = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16563a
            i0.a r1 = i0.a.f30806a
            int r1 = r0.f16564b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L37
            if (r1 == r2) goto L2e
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2e:
            kotlin.jvm.internal.q.m(r7)
            d0.e r4 = new d0.e
            r4.<init>()
            throw r4
        L37:
            kotlin.jvm.internal.q.m(r7)
            d0.e r4 = new d0.e
            r4.<init>()
            throw r4
        L40:
            kotlin.jvm.internal.q.m(r7)
            if (r5 != 0) goto L4b
            r0.f16564b = r3
            r4.h(r6, r0)
            return
        L4b:
            r0.f16564b = r2
            r5.a(r4, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.b(androidx.compose.ui.node.Owner, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor, q0.p, h0.g):void");
    }
}

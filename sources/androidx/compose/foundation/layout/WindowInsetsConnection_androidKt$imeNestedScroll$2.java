package androidx.compose.foundation.layout;

import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes2.dex */
final class WindowInsetsConnection_androidKt$imeNestedScroll$2 extends r implements q {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r0 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r0 == r5) goto L13;
     */
    @Override // q0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            androidx.compose.runtime.Composer r8 = (androidx.compose.runtime.Composer) r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            r9 = -369978792(0xffffffffe9f29258, float:-3.6656392E25)
            r8.J(r9)
            java.util.WeakHashMap r9 = androidx.compose.foundation.layout.WindowInsetsHolder.x
            androidx.compose.foundation.layout.WindowInsetsHolder r9 = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.c(r8)
            float r0 = androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.f4132a
            r0 = -1011341039(0xffffffffc3b82911, float:-368.32083)
            r8.J(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L2a
            androidx.compose.foundation.layout.DoNothingNestedScrollConnection r9 = androidx.compose.foundation.layout.DoNothingNestedScrollConnection.f3882a
            r8.D()
            goto Ld2
        L2a:
            androidx.compose.runtime.StaticProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.f16440l
            java.lang.Object r0 = r8.K(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.ui.unit.LayoutDirection) r0
            androidx.compose.foundation.layout.SideCalculator$Companion r1 = androidx.compose.foundation.layout.SideCalculator.f4097a
            r1.getClass()
            int r1 = androidx.compose.foundation.layout.WindowInsetsSides.f4223c
            r2 = 32
            boolean r1 = androidx.compose.foundation.layout.WindowInsetsSides.a(r2, r1)
            androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1 r3 = androidx.compose.foundation.layout.SideCalculator.Companion.f4099b
            if (r1 == 0) goto L44
            goto L7c
        L44:
            r1 = 16
            boolean r1 = androidx.compose.foundation.layout.WindowInsetsSides.a(r2, r1)
            if (r1 == 0) goto L4f
            androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1 r3 = androidx.compose.foundation.layout.SideCalculator.Companion.f4100c
            goto L7c
        L4f:
            int r1 = androidx.compose.foundation.layout.WindowInsetsSides.d
            boolean r1 = androidx.compose.foundation.layout.WindowInsetsSides.a(r2, r1)
            androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1 r4 = androidx.compose.foundation.layout.SideCalculator.Companion.d
            if (r1 == 0) goto L5b
        L59:
            r3 = r4
            goto L7c
        L5b:
            boolean r1 = androidx.compose.foundation.layout.WindowInsetsSides.a(r2, r2)
            if (r1 == 0) goto L64
            androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1 r3 = androidx.compose.foundation.layout.SideCalculator.Companion.e
            goto L7c
        L64:
            int r1 = androidx.compose.foundation.layout.WindowInsetsSides.f4221a
            boolean r1 = androidx.compose.foundation.layout.WindowInsetsSides.a(r2, r1)
            androidx.compose.ui.unit.LayoutDirection r5 = androidx.compose.ui.unit.LayoutDirection.f17494a
            if (r1 == 0) goto L71
            if (r0 != r5) goto L59
            goto L7c
        L71:
            int r1 = androidx.compose.foundation.layout.WindowInsetsSides.f4222b
            boolean r1 = androidx.compose.foundation.layout.WindowInsetsSides.a(r2, r1)
            if (r1 == 0) goto Ldb
            if (r0 != r5) goto L7c
            goto L59
        L7c:
            androidx.compose.runtime.StaticProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f16327f
            java.lang.Object r0 = r8.K(r0)
            android.view.View r0 = (android.view.View) r0
            androidx.compose.runtime.StaticProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.f16434f
            java.lang.Object r1 = r8.K(r1)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.ui.unit.Density) r1
            androidx.compose.foundation.layout.AndroidWindowInsets r9 = r9.f4139c
            boolean r2 = r8.I(r9)
            boolean r4 = r8.I(r0)
            r2 = r2 | r4
            boolean r4 = r8.I(r3)
            r2 = r2 | r4
            boolean r4 = r8.I(r1)
            r2 = r2 | r4
            java.lang.Object r4 = r8.u()
            androidx.compose.runtime.Composer$Companion$Empty$1 r5 = androidx.compose.runtime.Composer.Companion.f13690a
            if (r2 != 0) goto Lab
            if (r4 != r5) goto Lb3
        Lab:
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r4 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection
            r4.<init>(r9, r0, r3, r1)
            r8.o(r4)
        Lb3:
            r9 = r4
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r9 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r9
            boolean r0 = r8.w(r9)
            java.lang.Object r1 = r8.u()
            if (r0 != 0) goto Lc2
            if (r1 != r5) goto Lca
        Lc2:
            androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1 r1 = new androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1
            r1.<init>(r9)
            r8.o(r1)
        Lca:
            q0.l r1 = (q0.l) r1
            androidx.compose.runtime.EffectsKt.c(r9, r1, r8)
            r8.D()
        Ld2:
            r0 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.a(r7, r9, r0)
            r8.D()
            return r7
        Ldb:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Only Left, Top, Right, Bottom, Start and End are allowed"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$imeNestedScroll$2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

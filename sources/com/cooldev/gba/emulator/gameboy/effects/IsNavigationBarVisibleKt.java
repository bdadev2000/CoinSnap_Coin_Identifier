package com.cooldev.gba.emulator.gameboy.effects;

/* loaded from: classes4.dex */
public final class IsNavigationBarVisibleKt {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r5.p(2) == true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r5 == true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r2 = true;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isNavigationBarVisible(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r4, int r5) {
        /*
            r5 = -2078349928(0xffffffff841ee598, float:-1.8678235E-36)
            r4.J(r5)
            androidx.compose.runtime.StaticProvidableCompositionLocal r5 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f16327f
            java.lang.Object r5 = r4.K(r5)
            android.view.View r5 = (android.view.View) r5
            r0 = 1115006885(0x4275a7a5, float:61.413715)
            r4.J(r0)
            java.lang.Object r0 = r4.u()
            androidx.compose.runtime.Composer$Companion$Empty$1 r1 = androidx.compose.runtime.Composer.Companion.f13690a
            if (r0 != r1) goto L47
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L32
            android.view.WindowInsets r5 = r5.getRootWindowInsets()
            if (r5 == 0) goto L40
            boolean r5 = com.applovin.impl.bv.v(r5)
            if (r5 != r3) goto L40
        L30:
            r2 = r3
            goto L40
        L32:
            androidx.core.view.WindowInsetsCompat r5 = androidx.core.view.ViewCompat.n(r5)
            if (r5 == 0) goto L40
            r0 = 2
            boolean r5 = r5.p(r0)
            if (r5 != r3) goto L40
            goto L30
        L40:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.o(r0)
        L47:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            r4.D()
            r4.D()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.effects.IsNavigationBarVisibleKt.isNavigationBarVisible(androidx.compose.runtime.Composer, int):boolean");
    }
}

package com.google.accompanist.systemuicontroller;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class SystemUiControllerKt$BlackScrimmed$1 extends r implements l {
    public static final SystemUiControllerKt$BlackScrimmed$1 INSTANCE = new SystemUiControllerKt$BlackScrimmed$1();

    public SystemUiControllerKt$BlackScrimmed$1() {
        super(1);
    }

    @Override // q0.l
    public /* synthetic */ Object invoke(Object obj) {
        return new Color(m598invokel2rxGTc(((Color) obj).f14964a));
    }

    /* renamed from: invoke-l2rxGTc, reason: not valid java name */
    public final long m598invokel2rxGTc(long j2) {
        long j3;
        j3 = SystemUiControllerKt.BlackScrim;
        return ColorKt.g(j3, j2);
    }
}

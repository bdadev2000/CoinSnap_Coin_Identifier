package androidx.navigation;

import androidx.navigation.NavOptions;
import q0.l;

/* loaded from: classes4.dex */
public final class NavOptionsBuilderKt {
    public static final NavOptions a(l lVar) {
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        lVar.invoke(navOptionsBuilder);
        boolean z2 = navOptionsBuilder.f20489b;
        NavOptions.Builder builder = navOptionsBuilder.f20488a;
        builder.f20480a = z2;
        builder.f20481b = navOptionsBuilder.f20490c;
        int i2 = navOptionsBuilder.d;
        boolean z3 = navOptionsBuilder.e;
        boolean z4 = navOptionsBuilder.f20491f;
        builder.f20482c = i2;
        builder.d = null;
        builder.e = z3;
        builder.f20483f = z4;
        return builder.a();
    }
}

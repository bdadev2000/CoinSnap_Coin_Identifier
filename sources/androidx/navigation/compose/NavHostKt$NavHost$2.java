package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
final class NavHostKt$NavHost$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavHostController f20638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f20640c;
    public final /* synthetic */ String d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f20641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20642g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20643h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$2(NavHostController navHostController, String str, Modifier modifier, String str2, l lVar, int i2, int i3) {
        super(2);
        this.f20638a = navHostController;
        this.f20639b = str;
        this.f20640c = modifier;
        this.d = str2;
        this.f20641f = lVar;
        this.f20642g = i2;
        this.f20643h = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        int i3;
        int i4;
        l lVar;
        Modifier modifier;
        String str;
        ((Number) obj2).intValue();
        NavHostController navHostController = this.f20638a;
        String str2 = this.f20639b;
        l lVar2 = this.f20641f;
        int a2 = RecomposeScopeImplKt.a(this.f20642g | 1);
        int i5 = this.f20643h;
        ComposerImpl g2 = ((Composer) obj).g(141827520);
        if ((i5 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.w(navHostController) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        if ((i5 & 2) != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.I(str2) ? 32 : 16;
        }
        int i6 = i5 & 4;
        Modifier modifier2 = this.f20640c;
        if (i6 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(modifier2) ? 256 : 128;
        }
        int i7 = i5 & 8;
        String str3 = this.d;
        if (i7 != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.I(str3) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i2 |= 24576;
        } else if ((a2 & 24576) == 0) {
            i2 |= g2.w(lVar2) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && g2.i()) {
            g2.A();
            modifier = modifier2;
            str = str3;
            i3 = i5;
            i4 = a2;
            lVar = lVar2;
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.Companion.f14687a;
            }
            Modifier modifier3 = modifier2;
            if (i7 != 0) {
                str3 = null;
            }
            String str4 = str3;
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | ((57344 & i2) == 16384);
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.w, str2, str4);
                lVar2.invoke(navGraphBuilder);
                u2 = navGraphBuilder.a();
                g2.o(u2);
            }
            i3 = i5;
            i4 = a2;
            lVar = lVar2;
            NavHostKt.a(navHostController, (NavGraph) u2, modifier3, null, null, null, null, null, null, g2, (i2 & 14) | (i2 & 896), 504);
            modifier = modifier3;
            str = str4;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NavHostKt$NavHost$2(navHostController, str2, modifier, str, lVar, i4, i3);
        }
        return b0.f30125a;
    }
}

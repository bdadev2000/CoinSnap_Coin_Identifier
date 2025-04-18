package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes.dex */
final class NavHostKt$NavHost$19 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavHostController f20634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavGraph f20635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f20636c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$19(NavHostController navHostController, NavGraph navGraph, Modifier modifier, int i2, int i3) {
        super(2);
        this.f20634a = navHostController;
        this.f20635b = navGraph;
        this.f20636c = modifier;
        this.d = i2;
        this.f20637f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        int i3;
        int i4;
        Modifier modifier;
        ((Number) obj2).intValue();
        NavHostController navHostController = this.f20634a;
        NavGraph navGraph = this.f20635b;
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        int i5 = this.f20637f;
        ComposerImpl g2 = ((Composer) obj).g(-957014592);
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
            i2 |= g2.w(navGraph) ? 32 : 16;
        }
        int i6 = i5 & 4;
        Modifier modifier2 = this.f20636c;
        if (i6 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(modifier2) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
            modifier = modifier2;
            i3 = i5;
            i4 = a2;
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.Companion.f14687a;
            }
            Modifier modifier3 = modifier2;
            i3 = i5;
            i4 = a2;
            NavHostKt.a(navHostController, navGraph, modifier3, null, null, null, null, null, null, g2, (i2 & 14) | (i2 & 112) | (i2 & 896), 504);
            modifier = modifier3;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NavHostKt$NavHost$19(navHostController, navGraph, modifier, i4, i3);
        }
        return b0.f30125a;
    }
}

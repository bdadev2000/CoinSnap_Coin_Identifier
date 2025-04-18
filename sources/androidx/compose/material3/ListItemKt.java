package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import b1.f0;
import java.util.List;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes4.dex */
public final class ListItemKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f9661a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final float f9662b = 12;

    /* renamed from: c, reason: collision with root package name */
    public static final float f9663c;
    public static final float d;
    public static final float e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f9664f;

    static {
        float f2 = 16;
        f9663c = f2;
        d = f2;
        e = f2;
        f9664f = f2;
    }

    public static final void a(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(2052297037);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(pVar4) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(pVar5) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = new Object();
                g2.o(u2);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) u2;
            p[] pVarArr = new p[5];
            pVarArr[0] = pVar3;
            pVarArr[1] = pVar4 == null ? ComposableSingletons$ListItemKt.f8606a : pVar4;
            pVarArr[2] = pVar5 == null ? ComposableSingletons$ListItemKt.f8607b : pVar5;
            pVarArr[3] = pVar == null ? ComposableSingletons$ListItemKt.f8608c : pVar;
            pVarArr[4] = pVar2 == null ? ComposableSingletons$ListItemKt.d : pVar2;
            List v2 = f0.v(pVarArr);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            ComposableLambdaImpl a2 = LayoutKt.a(v2);
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = new MultiContentMeasurePolicyImpl(listItemMeasurePolicy);
                g2.o(u3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u3;
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, companion);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, measurePolicy, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar6 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar6);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            a2.invoke(g2, 0);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ListItemKt$ListItemLayout$1(pVar, pVar2, pVar3, pVar4, pVar5, i2);
        }
    }

    public static final void b(long j2, TypographyKeyTokens typographyKeyTokens, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1133967795);
        if ((i2 & 6) == 0) {
            i3 = (g2.d(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(typographyKeyTokens) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            ProvideContentColorTextStyleKt.a(j2, TypographyKt.a(typographyKeyTokens, g2), pVar, g2, (i3 & 14) | (i3 & 896));
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ListItemKt$ProvideTextStyleFromToken$1(j2, typographyKeyTokens, pVar, i2);
        }
    }

    public static final int c(IntrinsicMeasureScope intrinsicMeasureScope, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        int max = Math.max(Math.max(Constraints.j(j2), intrinsicMeasureScope.F0(i7 == 1 ? ListTokens.f13425m : i7 == 2 ? ListTokens.f13434v : ListTokens.f13430r)), Math.max(i2, Math.max(i4 + i5 + i6, i3)) + i8);
        int h2 = Constraints.h(j2);
        return max > h2 ? h2 : max;
    }
}

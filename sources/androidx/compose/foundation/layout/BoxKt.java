package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashMap;
import q0.p;

/* loaded from: classes4.dex */
public final class BoxKt {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f3796a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f3797b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final MeasurePolicy f3798c = BoxKt$EmptyBoxMeasurePolicy$1.f3801a;

    public static final void a(Modifier modifier, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-211209833);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            MeasurePolicy measurePolicy = f3798c;
            int i4 = g2.P;
            Modifier c2 = ComposedModifierKt.c(g2, modifier);
            PersistentCompositionLocalMap Q = g2.Q();
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
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar);
            }
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BoxKt$Box$2(modifier, i2);
        }
    }

    public static final void b(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i2, int i3, Alignment alignment) {
        Alignment alignment2;
        Object m2 = measurable.m();
        BoxChildDataNode boxChildDataNode = m2 instanceof BoxChildDataNode ? (BoxChildDataNode) m2 : null;
        Placeable.PlacementScope.g(placementScope, placeable, ((boxChildDataNode == null || (alignment2 = boxChildDataNode.f3794o) == null) ? alignment : alignment2).a(IntSizeKt.a(placeable.f15825a, placeable.f15826b), IntSizeKt.a(i2, i3), layoutDirection));
    }

    public static final HashMap c(boolean z2) {
        HashMap hashMap = new HashMap(9);
        d(hashMap, z2, Alignment.Companion.f14659a);
        d(hashMap, z2, Alignment.Companion.f14660b);
        d(hashMap, z2, Alignment.Companion.f14661c);
        d(hashMap, z2, Alignment.Companion.d);
        d(hashMap, z2, Alignment.Companion.e);
        d(hashMap, z2, Alignment.Companion.f14662f);
        d(hashMap, z2, Alignment.Companion.f14663g);
        d(hashMap, z2, Alignment.Companion.f14664h);
        d(hashMap, z2, Alignment.Companion.f14665i);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean z2, BiasAlignment biasAlignment) {
        hashMap.put(biasAlignment, new BoxMeasurePolicy(biasAlignment, z2));
    }

    public static final MeasurePolicy e(Alignment alignment, boolean z2) {
        MeasurePolicy measurePolicy = (MeasurePolicy) (z2 ? f3796a : f3797b).get(alignment);
        return measurePolicy == null ? new BoxMeasurePolicy(alignment, z2) : measurePolicy;
    }
}

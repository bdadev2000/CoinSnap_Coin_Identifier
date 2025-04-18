package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.DialogNavigator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
public final class DialogHostKt {
    public static final void a(DialogNavigator dialogNavigator, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(294589392);
        int i3 = (i2 & 6) == 0 ? (g2.I(dialogNavigator) ? 4 : 2) | i2 : i2;
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            SaveableStateHolder a2 = SaveableStateHolderKt.a(g2);
            boolean z2 = false;
            MutableState b2 = SnapshotStateKt.b(dialogNavigator.b().e, g2, 0);
            Object obj = (Collection) ((List) b2.getValue());
            boolean booleanValue = ((Boolean) g2.K(InspectionModeKt.f16522a)).booleanValue();
            boolean I = g2.I(obj);
            Object u2 = g2.u();
            Object obj2 = Composer.Companion.f13690a;
            Object obj3 = u2;
            if (I || u2 == obj2) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj) {
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj4;
                    if (booleanValue || navBackStackEntry.f20333i.d.compareTo(Lifecycle.State.d) >= 0) {
                        arrayList.add(obj4);
                    }
                }
                snapshotStateList.addAll(arrayList);
                g2.o(snapshotStateList);
                obj3 = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj3;
            b(snapshotStateList2, (List) b2.getValue(), g2, 0);
            MutableState b3 = SnapshotStateKt.b(dialogNavigator.b().f20522f, g2, 0);
            Object u3 = g2.u();
            if (u3 == obj2) {
                u3 = new SnapshotStateList();
                g2.o(u3);
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) u3;
            g2.J(1361037007);
            ListIterator listIterator = snapshotStateList2.listIterator();
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                }
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) listIterator.next();
                NavDestination navDestination = navBackStackEntry2.f20328b;
                p0.a.q(navDestination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                DialogNavigator.Destination destination = (DialogNavigator.Destination) navDestination;
                boolean w = g2.w(navBackStackEntry2) | ((i3 & 14) != 4 ? z2 : true);
                Object u4 = g2.u();
                if (w || u4 == obj2) {
                    u4 = new DialogHostKt$DialogHost$1$1$1(dialogNavigator, navBackStackEntry2);
                    g2.o(u4);
                }
                AndroidDialog_androidKt.a((q0.a) u4, destination.f20574l, ComposableLambdaKt.c(1129586364, new DialogHostKt$DialogHost$1$2(navBackStackEntry2, dialogNavigator, a2, snapshotStateList3, destination), g2), g2, 384, 0);
                b3 = b3;
                snapshotStateList3 = snapshotStateList3;
                obj2 = obj2;
                z2 = false;
            }
            SnapshotStateList snapshotStateList4 = snapshotStateList3;
            MutableState mutableState = b3;
            Object obj5 = obj2;
            boolean z3 = z2;
            g2.V(z3);
            Set set = (Set) mutableState.getValue();
            boolean I2 = g2.I(mutableState) | ((i3 & 14) == 4 ? true : z3);
            Object u5 = g2.u();
            if (I2 || u5 == obj5) {
                u5 = new DialogHostKt$DialogHost$2$1(mutableState, dialogNavigator, snapshotStateList4, null);
                g2.o(u5);
            }
            EffectsKt.e(set, snapshotStateList4, (p) u5, g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DialogHostKt$DialogHost$3(dialogNavigator, i2);
        }
    }

    public static final void b(List list, Collection collection, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1537894851);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(collection) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            boolean booleanValue = ((Boolean) g2.K(InspectionModeKt.f16522a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
                LifecycleRegistry lifecycleRegistry = navBackStackEntry.f20333i;
                boolean a2 = g2.a(booleanValue) | g2.w(list) | g2.w(navBackStackEntry);
                Object u2 = g2.u();
                if (a2 || u2 == Composer.Companion.f13690a) {
                    u2 = new DialogHostKt$PopulateVisibleList$1$1$1(navBackStackEntry, list, booleanValue);
                    g2.o(u2);
                }
                EffectsKt.c(lifecycleRegistry, (l) u2, g2);
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DialogHostKt$PopulateVisibleList$2(list, collection, i2);
        }
    }
}

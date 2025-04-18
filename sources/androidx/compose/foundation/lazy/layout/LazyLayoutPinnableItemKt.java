package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt {
    public static final void a(Object obj, int i2, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, p pVar, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-2079116560);
        if ((i3 & 6) == 0) {
            i4 = (g2.w(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= g2.c(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= g2.w(lazyLayoutPinnedItemList) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= g2.w(pVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i4 & 1171) == 1170 && g2.i()) {
            g2.A();
        } else {
            boolean I = g2.I(obj) | g2.I(lazyLayoutPinnedItemList);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (I || u2 == composer$Companion$Empty$1) {
                u2 = new LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
                g2.o(u2);
            }
            LazyLayoutPinnableItem lazyLayoutPinnableItem = (LazyLayoutPinnableItem) u2;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = lazyLayoutPinnableItem.f4825c;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = lazyLayoutPinnableItem.e;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = lazyLayoutPinnableItem.f4826f;
            parcelableSnapshotMutableIntState.b(i2);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = PinnableContainerKt.f15823a;
            PinnableContainer pinnableContainer = (PinnableContainer) g2.K(dynamicProvidableCompositionLocal);
            Snapshot a2 = Snapshot.Companion.a();
            l f2 = a2 != null ? a2.f() : null;
            Snapshot c2 = Snapshot.Companion.c(a2);
            try {
                if (pinnableContainer != ((PinnableContainer) parcelableSnapshotMutableState2.getValue())) {
                    parcelableSnapshotMutableState2.setValue(pinnableContainer);
                    if (lazyLayoutPinnableItem.d.g() > 0) {
                        PinnableContainer.PinnedHandle pinnedHandle = (PinnableContainer.PinnedHandle) parcelableSnapshotMutableState.getValue();
                        if (pinnedHandle != null) {
                            pinnedHandle.release();
                        }
                        parcelableSnapshotMutableState.setValue(pinnableContainer != null ? pinnableContainer.a() : null);
                    }
                }
                Snapshot.Companion.f(a2, c2, f2);
                boolean I2 = g2.I(lazyLayoutPinnableItem);
                Object u3 = g2.u();
                if (I2 || u3 == composer$Companion$Empty$1) {
                    u3 = new LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1(lazyLayoutPinnableItem);
                    g2.o(u3);
                }
                EffectsKt.c(lazyLayoutPinnableItem, (l) u3, g2);
                CompositionLocalKt.a(dynamicProvidableCompositionLocal.c(lazyLayoutPinnableItem), pVar, g2, ((i4 >> 6) & 112) | 8);
            } catch (Throwable th) {
                Snapshot.Companion.f(a2, c2, f2);
                throw th;
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2(obj, i2, lazyLayoutPinnedItemList, pVar, i3);
        }
    }
}

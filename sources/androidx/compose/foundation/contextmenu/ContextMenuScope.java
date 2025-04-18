package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import q0.a;
import q0.q;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ContextMenuScope {

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotStateList f2936a = new SnapshotStateList();

    public static void b(ContextMenuScope contextMenuScope, ContextMenu_androidKt$TextItem$1 contextMenu_androidKt$TextItem$1, boolean z2, a aVar) {
        Modifier.Companion companion = Modifier.Companion.f14687a;
        contextMenuScope.getClass();
        ContextMenuScope$item$1 contextMenuScope$item$1 = new ContextMenuScope$item$1(companion, aVar, contextMenu_androidKt$TextItem$1, null, z2);
        Object obj = ComposableLambdaKt.f14482a;
        contextMenuScope.f2936a.add(new ComposableLambdaImpl(262103052, contextMenuScope$item$1, true));
    }

    public final void a(ContextMenuColors contextMenuColors, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1320309496);
        int i3 = (i2 & 6) == 0 ? (g2.I(contextMenuColors) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= g2.I(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            SnapshotStateList snapshotStateList = this.f2936a;
            int size = snapshotStateList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((q) snapshotStateList.get(i4)).invoke(contextMenuColors, g2, Integer.valueOf(i3 & 14));
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ContextMenuScope$Content$2(this, contextMenuColors, i2);
        }
    }
}

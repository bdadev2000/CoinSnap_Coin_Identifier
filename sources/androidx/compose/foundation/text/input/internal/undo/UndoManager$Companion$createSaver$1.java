package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import b1.f0;
import f0.c;
import java.util.List;
import p0.a;

/* loaded from: classes2.dex */
public final class UndoManager$Companion$createSaver$1 implements Saver<UndoManager<Object>, Object> {
    @Override // androidx.compose.runtime.saveable.Saver
    public final Object a(SaverScope saverScope, Object obj) {
        UndoManager undoManager = (UndoManager) obj;
        c cVar = new c();
        cVar.add(Integer.valueOf(undoManager.f6883a));
        SnapshotStateList snapshotStateList = undoManager.f6884b;
        cVar.add(Integer.valueOf(snapshotStateList.size()));
        SnapshotStateList snapshotStateList2 = undoManager.f6885c;
        cVar.add(Integer.valueOf(snapshotStateList2.size()));
        if (snapshotStateList.size() > 0) {
            snapshotStateList.get(0);
            throw null;
        }
        if (snapshotStateList2.size() <= 0) {
            return f0.e(cVar);
        }
        snapshotStateList2.get(0);
        throw null;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object b(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        int intValue = ((Number) list.get(0)).intValue();
        int intValue2 = ((Number) list.get(1)).intValue();
        int intValue3 = ((Number) list.get(2)).intValue();
        c cVar = new c();
        if (3 < intValue2 + 3) {
            list.get(3);
            throw null;
        }
        c e = f0.e(cVar);
        c cVar2 = new c();
        if (3 >= intValue2 + intValue3 + 3) {
            return new UndoManager(e, f0.e(cVar2), intValue);
        }
        list.get(3);
        throw null;
    }
}

package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import b1.f0;
import f0.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class TextUndoManager$Companion$Saver$special$$inlined$createSaver$1 implements Saver<UndoManager<TextUndoOperation>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Saver f6313a = TextUndoOperation.f6876i;

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object a(SaverScope saverScope, Object obj) {
        Saver saver;
        UndoManager undoManager = (UndoManager) obj;
        c cVar = new c();
        cVar.add(Integer.valueOf(undoManager.f6883a));
        SnapshotStateList snapshotStateList = undoManager.f6884b;
        cVar.add(Integer.valueOf(snapshotStateList.size()));
        SnapshotStateList snapshotStateList2 = undoManager.f6885c;
        cVar.add(Integer.valueOf(snapshotStateList2.size()));
        int size = snapshotStateList.size();
        int i2 = 0;
        while (true) {
            saver = this.f6313a;
            if (i2 >= size) {
                break;
            }
            cVar.add(saver.a(saverScope, snapshotStateList.get(i2)));
            i2++;
        }
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            cVar.add(saver.a(saverScope, snapshotStateList2.get(i3)));
        }
        return f0.e(cVar);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object b(Object obj) {
        Saver saver;
        p0.a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        int intValue = ((Number) list.get(0)).intValue();
        int intValue2 = ((Number) list.get(1)).intValue();
        int intValue3 = ((Number) list.get(2)).intValue();
        c cVar = new c();
        int i2 = 3;
        while (true) {
            int i3 = intValue2 + 3;
            saver = this.f6313a;
            if (i2 >= i3) {
                break;
            }
            Object b2 = saver.b(list.get(i2));
            p0.a.p(b2);
            cVar.add(b2);
            i2++;
        }
        c e = f0.e(cVar);
        c cVar2 = new c();
        while (i2 < intValue2 + intValue3 + 3) {
            Object b3 = saver.b(list.get(i2));
            p0.a.p(b3);
            cVar2.add(b3);
            i2++;
        }
        return new UndoManager(e, f0.e(cVar2), intValue);
    }
}

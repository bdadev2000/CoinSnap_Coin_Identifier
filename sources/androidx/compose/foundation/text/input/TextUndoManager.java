package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text.input.internal.undo.TextEditType;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import b1.f0;
import e0.t;
import java.util.List;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TextUndoManager {

    /* renamed from: a, reason: collision with root package name */
    public final UndoManager f6311a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6312b;

    /* loaded from: classes2.dex */
    public static final class Companion {

        @StabilityInferred
        /* loaded from: classes2.dex */
        public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextUndoManager, Object> {

            /* renamed from: a, reason: collision with root package name */
            public static final TextUndoManager$Companion$Saver$special$$inlined$createSaver$1 f6314a = new TextUndoManager$Companion$Saver$special$$inlined$createSaver$1();

            public static TextUndoManager c(Object obj) {
                p0.a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                TextUndoOperation textUndoOperation = obj2 != null ? (TextUndoOperation) TextUndoOperation.f6876i.b(obj2) : null;
                TextUndoManager$Companion$Saver$special$$inlined$createSaver$1 textUndoManager$Companion$Saver$special$$inlined$createSaver$1 = f6314a;
                p0.a.p(obj3);
                return new TextUndoManager(textUndoOperation, (UndoManager) textUndoManager$Companion$Saver$special$$inlined$createSaver$1.b(obj3));
            }

            public static List d(SaverScope saverScope, TextUndoManager textUndoManager) {
                Object[] objArr = new Object[2];
                TextUndoOperation textUndoOperation = (TextUndoOperation) textUndoManager.f6312b.getValue();
                objArr[0] = textUndoOperation != null ? TextUndoOperation.f6876i.a(saverScope, textUndoOperation) : null;
                objArr[1] = f6314a.a(saverScope, textUndoManager.f6311a);
                return f0.v(objArr);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public final /* bridge */ /* synthetic */ Object a(SaverScope saverScope, Object obj) {
                return d(saverScope, (TextUndoManager) obj);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public final /* bridge */ /* synthetic */ Object b(Object obj) {
                return c(obj);
            }
        }
    }

    public TextUndoManager(TextUndoOperation textUndoOperation, UndoManager undoManager) {
        ParcelableSnapshotMutableState f2;
        this.f6311a = undoManager;
        f2 = SnapshotStateKt.f(textUndoOperation, StructuralEqualityPolicy.f14078a);
        this.f6312b = f2;
    }

    public final void a() {
        SnapshotStateList snapshotStateList;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f6312b;
        Snapshot a2 = Snapshot.Companion.a();
        l f2 = a2 != null ? a2.f() : null;
        Snapshot c2 = Snapshot.Companion.c(a2);
        try {
            TextUndoOperation textUndoOperation = (TextUndoOperation) parcelableSnapshotMutableState.getValue();
            if (textUndoOperation != null) {
                UndoManager undoManager = this.f6311a;
                undoManager.f6885c.clear();
                while (true) {
                    int size = undoManager.f6885c.size() + undoManager.f6884b.size();
                    int i2 = undoManager.f6883a - 1;
                    snapshotStateList = undoManager.f6884b;
                    if (size <= i2) {
                        break;
                    } else {
                        t.x0(snapshotStateList);
                    }
                }
                snapshotStateList.add(textUndoOperation);
            }
            parcelableSnapshotMutableState.setValue(null);
        } finally {
            Snapshot.Companion.f(a2, c2, f2);
        }
    }

    public final void b(TextUndoOperation textUndoOperation) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f6312b;
        Snapshot a2 = Snapshot.Companion.a();
        TextUndoOperation textUndoOperation2 = null;
        l f2 = a2 != null ? a2.f() : null;
        Snapshot c2 = Snapshot.Companion.c(a2);
        try {
            TextUndoOperation textUndoOperation3 = (TextUndoOperation) parcelableSnapshotMutableState.getValue();
            if (textUndoOperation3 == null) {
                parcelableSnapshotMutableState.setValue(textUndoOperation);
                return;
            }
            if (textUndoOperation3.f6881g && textUndoOperation.f6881g) {
                long j2 = textUndoOperation.f6880f;
                long j3 = textUndoOperation3.f6880f;
                if (j2 >= j3 && j2 - j3 < 5000) {
                    String str = textUndoOperation3.f6879c;
                    if (!p0.a.g(str, "\n") && !p0.a.g(str, "\r\n")) {
                        String str2 = textUndoOperation.f6879c;
                        if (!p0.a.g(str2, "\n") && !p0.a.g(str2, "\r\n")) {
                            TextEditType textEditType = textUndoOperation.f6882h;
                            TextEditType textEditType2 = textUndoOperation3.f6882h;
                            if (textEditType2 == textEditType) {
                                TextEditType textEditType3 = TextEditType.f6870a;
                                int i2 = textUndoOperation3.f6877a;
                                int i3 = textUndoOperation.f6877a;
                                if (textEditType2 == textEditType3 && str.length() + i2 == i3) {
                                    textUndoOperation2 = new TextUndoOperation(textUndoOperation3.f6877a, "", a.j(str, str2), textUndoOperation3.d, textUndoOperation.e, textUndoOperation3.f6880f, false, 64);
                                } else if (textEditType2 == TextEditType.f6871b && textUndoOperation3.a() == textUndoOperation.a() && (textUndoOperation3.a() == TextDeleteType.f6866a || textUndoOperation3.a() == TextDeleteType.f6867b)) {
                                    String str3 = textUndoOperation.f6878b;
                                    int length = str3.length() + i3;
                                    String str4 = textUndoOperation3.f6878b;
                                    if (i2 == length) {
                                        textUndoOperation2 = new TextUndoOperation(textUndoOperation.f6877a, a.j(str3, str4), "", textUndoOperation3.d, textUndoOperation.e, textUndoOperation3.f6880f, false, 64);
                                    } else {
                                        int i4 = textUndoOperation3.f6877a;
                                        if (i4 == i3) {
                                            textUndoOperation2 = new TextUndoOperation(i4, a.j(str4, str3), "", textUndoOperation3.d, textUndoOperation.e, textUndoOperation3.f6880f, false, 64);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (textUndoOperation2 != null) {
                parcelableSnapshotMutableState.setValue(textUndoOperation2);
            } else {
                a();
                parcelableSnapshotMutableState.setValue(textUndoOperation);
            }
        } finally {
            Snapshot.Companion.f(a2, c2, f2);
        }
    }
}

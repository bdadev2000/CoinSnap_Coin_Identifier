package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextUndoManager;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.EditingBuffer;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import b1.f0;
import java.util.List;
import q0.l;
import z0.m;

@Stable
/* loaded from: classes2.dex */
public final class TextFieldState {

    /* renamed from: a, reason: collision with root package name */
    public final TextUndoManager f6306a;

    /* renamed from: b, reason: collision with root package name */
    public EditingBuffer f6307b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6308c;
    public final ParcelableSnapshotMutableState d;
    public final UndoState e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableVector f6309f;

    /* loaded from: classes2.dex */
    public interface NotifyImeListener {
        void a(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2);
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {
        public static List c(SaverScope saverScope, TextFieldState textFieldState) {
            String obj = textFieldState.b().f6297a.toString();
            long j2 = textFieldState.b().f6298b;
            int i2 = TextRange.f17057c;
            Integer valueOf = Integer.valueOf((int) (j2 >> 32));
            Integer valueOf2 = Integer.valueOf((int) (textFieldState.b().f6298b & 4294967295L));
            TextUndoManager$Companion$Saver$special$$inlined$createSaver$1 textUndoManager$Companion$Saver$special$$inlined$createSaver$1 = TextUndoManager.Companion.Saver.f6314a;
            return f0.v(obj, valueOf, valueOf2, TextUndoManager.Companion.Saver.d(saverScope, textFieldState.f6306a));
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public final /* bridge */ /* synthetic */ Object a(SaverScope saverScope, Object obj) {
            return c(saverScope, (TextFieldState) obj);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public final Object b(Object obj) {
            p0.a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            p0.a.q(obj2, "null cannot be cast to non-null type kotlin.String");
            p0.a.q(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            p0.a.q(obj4, "null cannot be cast to non-null type kotlin.Int");
            long a2 = TextRangeKt.a(intValue, ((Integer) obj4).intValue());
            TextUndoManager$Companion$Saver$special$$inlined$createSaver$1 textUndoManager$Companion$Saver$special$$inlined$createSaver$1 = TextUndoManager.Companion.Saver.f6314a;
            p0.a.p(obj5);
            return new TextFieldState((String) obj2, a2, TextUndoManager.Companion.Saver.c(obj5));
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TextFieldState(String str, long j2, TextUndoManager textUndoManager) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        this.f6306a = textUndoManager;
        this.f6307b = new EditingBuffer(str, TextRangeKt.b(str.length(), j2));
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f6308c = f2;
        f3 = SnapshotStateKt.f(new TextFieldCharSequence(str, j2, (TextRange) null, 12), StructuralEqualityPolicy.f14078a);
        this.d = f3;
        this.e = new UndoState(this);
        this.f6309f = new MutableVector(new NotifyImeListener[16]);
    }

    public static final void a(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        TextFieldCharSequence b2 = textFieldState.b();
        EditingBuffer editingBuffer = textFieldState.f6307b;
        if (editingBuffer.f6400b.f6369a.f14144c == 0 && TextRange.b(b2.f6298b, editingBuffer.e())) {
            if (p0.a.g(b2.f6299c, textFieldState.f6307b.d())) {
                if (p0.a.g(b2.d, textFieldState.f6307b.e)) {
                    return;
                }
            }
            textFieldState.d(textFieldState.b(), new TextFieldCharSequence(textFieldState.f6307b.f6399a.toString(), textFieldState.f6307b.e(), textFieldState.f6307b.d(), textFieldState.f6307b.e), z2);
            return;
        }
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(textFieldState.f6307b.f6399a.toString(), textFieldState.f6307b.e(), textFieldState.f6307b.d(), textFieldState.f6307b.e);
        if (inputTransformation == null) {
            textFieldState.d(b2, textFieldCharSequence, z2);
            textFieldState.c(b2, textFieldCharSequence, textFieldState.f6307b.f6400b, textFieldEditUndoBehavior);
            return;
        }
        TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, textFieldState.f6307b.f6400b, b2, null, 8);
        inputTransformation.C(textFieldBuffer);
        PartialGapBuffer partialGapBuffer = textFieldBuffer.f6295c;
        boolean z3 = !m.O0(partialGapBuffer, textFieldCharSequence);
        boolean z4 = !TextRange.b(textFieldBuffer.f6296f, textFieldCharSequence.f6298b);
        if (z3 || z4) {
            String partialGapBuffer2 = textFieldState.f6307b.f6399a.toString();
            TextFieldCharSequence textFieldCharSequence2 = new TextFieldCharSequence(partialGapBuffer2, textFieldState.f6307b.e(), textFieldState.f6307b.d(), 8);
            boolean z5 = !p0.a.g(null, textFieldState.f6307b.d());
            if (z3) {
                textFieldState.f6307b = new EditingBuffer(partialGapBuffer.toString(), textFieldBuffer.f6296f);
            } else if (z4) {
                EditingBuffer editingBuffer2 = textFieldState.f6307b;
                long j2 = textFieldBuffer.f6296f;
                editingBuffer2.h((int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
            textFieldState.f6307b.b();
            if (z3 || (!z4 && z5)) {
                textFieldState.f6307b.b();
            }
            if (z3) {
                partialGapBuffer2 = partialGapBuffer.toString();
            }
            textFieldState.d(textFieldCharSequence2, new TextFieldCharSequence(partialGapBuffer2, textFieldState.f6307b.e(), textFieldState.f6307b.d(), 8), true);
        } else {
            textFieldState.d(b2, new TextFieldCharSequence(partialGapBuffer.toString(), textFieldBuffer.f6296f, textFieldCharSequence.f6299c, 8), z2);
        }
        textFieldState.c(b2, textFieldState.b(), textFieldBuffer.a(), textFieldEditUndoBehavior);
    }

    public final TextFieldCharSequence b() {
        return (TextFieldCharSequence) this.d.getValue();
    }

    public final void c(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, ChangeTracker changeTracker, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        int ordinal = textFieldEditUndoBehavior.ordinal();
        TextUndoManager textUndoManager = this.f6306a;
        if (ordinal == 0) {
            TextUndoManagerKt.a(textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeTracker, true);
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            TextUndoManagerKt.a(textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeTracker, false);
        } else {
            textUndoManager.f6312b.setValue(null);
            UndoManager undoManager = textUndoManager.f6311a;
            undoManager.f6884b.clear();
            undoManager.f6885c.clear();
        }
    }

    public final void d(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
        this.d.setValue(textFieldCharSequence2);
        this.f6308c.setValue(Boolean.FALSE);
        MutableVector mutableVector = this.f6309f;
        int i2 = mutableVector.f14144c;
        if (i2 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i3 = 0;
            do {
                ((NotifyImeListener) objArr[i3]).a(textFieldCharSequence, textFieldCharSequence2, z2);
                i3++;
            } while (i3 < i2);
        }
    }

    public final String toString() {
        Snapshot a2 = Snapshot.Companion.a();
        l f2 = a2 != null ? a2.f() : null;
        Snapshot c2 = Snapshot.Companion.c(a2);
        try {
            return "TextFieldState(selection=" + ((Object) TextRange.h(b().f6298b)) + ", text=\"" + ((Object) b().f6297a) + "\")";
        } finally {
            Snapshot.Companion.f(a2, c2, f2);
        }
    }
}

package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextFieldValue;

@StabilityInferred
/* loaded from: classes2.dex */
public final class UndoManager {

    /* renamed from: a, reason: collision with root package name */
    public final int f6245a = 100000;

    /* renamed from: b, reason: collision with root package name */
    public Entry f6246b;

    /* renamed from: c, reason: collision with root package name */
    public Entry f6247c;
    public int d;
    public Long e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6248f;

    /* loaded from: classes2.dex */
    public static final class Entry {

        /* renamed from: a, reason: collision with root package name */
        public Entry f6249a;

        /* renamed from: b, reason: collision with root package name */
        public TextFieldValue f6250b;

        public Entry(Entry entry, TextFieldValue textFieldValue) {
            this.f6249a = entry;
            this.f6250b = textFieldValue;
        }
    }

    public static void b(UndoManager undoManager, TextFieldValue textFieldValue) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!undoManager.f6248f) {
            Long l2 = undoManager.e;
            if (currentTimeMillis <= (l2 != null ? l2.longValue() : 0L) + 5000) {
                return;
            }
        }
        undoManager.e = Long.valueOf(currentTimeMillis);
        undoManager.a(textFieldValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066 A[LOOP:0: B:26:0x005a->B:31:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[EDGE_INSN: B:32:0x0069->B:33:0x0069 BREAK  A[LOOP:0: B:26:0x005a->B:31:0x0066], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.ui.text.input.TextFieldValue r4) {
        /*
            r3 = this;
            r0 = 0
            r3.f6248f = r0
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.f6246b
            r1 = 0
            if (r0 == 0) goto Lb
            androidx.compose.ui.text.input.TextFieldValue r0 = r0.f6250b
            goto Lc
        Lb:
            r0 = r1
        Lc:
            boolean r0 = p0.a.g(r4, r0)
            if (r0 == 0) goto L13
            return
        L13:
            androidx.compose.ui.text.AnnotatedString r0 = r4.f17361a
            java.lang.String r0 = r0.f16880a
            androidx.compose.foundation.text.UndoManager$Entry r2 = r3.f6246b
            if (r2 == 0) goto L24
            androidx.compose.ui.text.input.TextFieldValue r2 = r2.f6250b
            if (r2 == 0) goto L24
            androidx.compose.ui.text.AnnotatedString r2 = r2.f17361a
            java.lang.String r2 = r2.f16880a
            goto L25
        L24:
            r2 = r1
        L25:
            boolean r0 = p0.a.g(r0, r2)
            if (r0 == 0) goto L33
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.f6246b
            if (r0 != 0) goto L30
            goto L32
        L30:
            r0.f6250b = r4
        L32:
            return
        L33:
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.f6246b
            androidx.compose.foundation.text.UndoManager$Entry r2 = new androidx.compose.foundation.text.UndoManager$Entry
            r2.<init>(r0, r4)
            r3.f6246b = r2
            r3.f6247c = r1
            int r0 = r3.d
            androidx.compose.ui.text.AnnotatedString r4 = r4.f17361a
            java.lang.String r4 = r4.f16880a
            int r4 = r4.length()
            int r4 = r4 + r0
            r3.d = r4
            int r0 = r3.f6245a
            if (r4 <= r0) goto L6e
            androidx.compose.foundation.text.UndoManager$Entry r4 = r3.f6246b
            if (r4 == 0) goto L56
            androidx.compose.foundation.text.UndoManager$Entry r0 = r4.f6249a
            goto L57
        L56:
            r0 = r1
        L57:
            if (r0 != 0) goto L5a
            goto L6e
        L5a:
            if (r4 == 0) goto L63
            androidx.compose.foundation.text.UndoManager$Entry r0 = r4.f6249a
            if (r0 == 0) goto L63
            androidx.compose.foundation.text.UndoManager$Entry r0 = r0.f6249a
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 == 0) goto L69
            androidx.compose.foundation.text.UndoManager$Entry r4 = r4.f6249a
            goto L5a
        L69:
            if (r4 != 0) goto L6c
            goto L6e
        L6c:
            r4.f6249a = r1
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.UndoManager.a(androidx.compose.ui.text.input.TextFieldValue):void");
    }
}

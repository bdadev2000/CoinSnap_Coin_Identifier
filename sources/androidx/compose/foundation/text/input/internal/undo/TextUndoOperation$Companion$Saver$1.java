package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import b1.f0;
import java.util.List;
import p0.a;

/* loaded from: classes.dex */
public final class TextUndoOperation$Companion$Saver$1 implements Saver<TextUndoOperation, Object> {
    @Override // androidx.compose.runtime.saveable.Saver
    public final Object a(SaverScope saverScope, Object obj) {
        TextUndoOperation textUndoOperation = (TextUndoOperation) obj;
        Integer valueOf = Integer.valueOf(textUndoOperation.f6877a);
        String str = textUndoOperation.f6878b;
        String str2 = textUndoOperation.f6879c;
        int i2 = TextRange.f17057c;
        long j2 = textUndoOperation.d;
        Integer valueOf2 = Integer.valueOf((int) (j2 >> 32));
        Integer valueOf3 = Integer.valueOf((int) (j2 & 4294967295L));
        long j3 = textUndoOperation.e;
        return f0.v(valueOf, str, str2, valueOf2, valueOf3, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (4294967295L & j3)), Long.valueOf(textUndoOperation.f6880f));
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object b(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        a.q(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        a.q(obj3, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj3;
        Object obj4 = list.get(2);
        a.q(obj4, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj4;
        Object obj5 = list.get(3);
        a.q(obj5, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        a.q(obj6, "null cannot be cast to non-null type kotlin.Int");
        long a2 = TextRangeKt.a(intValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        a.q(obj7, "null cannot be cast to non-null type kotlin.Int");
        int intValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        a.q(obj8, "null cannot be cast to non-null type kotlin.Int");
        long a3 = TextRangeKt.a(intValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        a.q(obj9, "null cannot be cast to non-null type kotlin.Long");
        return new TextUndoOperation(intValue, str, str2, a2, a3, ((Long) obj9).longValue(), false, 64);
    }
}

package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.Comparator;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class AnnotatedString$special$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return q.c(Integer.valueOf(((AnnotatedString.Range) obj).f16891b), Integer.valueOf(((AnnotatedString.Range) obj2).f16891b));
    }
}

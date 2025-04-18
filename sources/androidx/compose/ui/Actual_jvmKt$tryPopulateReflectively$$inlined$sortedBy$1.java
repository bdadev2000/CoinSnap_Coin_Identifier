package androidx.compose.ui;

import java.lang.reflect.Field;
import java.util.Comparator;
import kotlin.jvm.internal.q;

/* loaded from: classes.dex */
public final class Actual_jvmKt$tryPopulateReflectively$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return q.c(((Field) obj).getName(), ((Field) obj2).getName());
    }
}

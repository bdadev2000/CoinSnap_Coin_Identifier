package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\ncollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1208#2,2:96\n1238#2,4:98\n1#3:102\n*S KotlinDebug\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n22#1:96,2\n22#1:98,4\n*E\n"})
/* loaded from: classes4.dex */
public final class CollectionsKt {
    public static final <T> void addIfNotNull(Collection<T> collection, T t5) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (t5 != null) {
            collection.add(t5);
        }
    }

    private static final int capacity(int i10) {
        if (i10 < 3) {
            return 3;
        }
        return (i10 / 3) + i10 + 1;
    }

    public static final <T> List<T> compact(ArrayList<T> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                arrayList.trimToSize();
                return arrayList;
            }
            return kotlin.collections.CollectionsKt.listOf(kotlin.collections.CollectionsKt.first((List) arrayList));
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final <K> Map<K, Integer> mapToIndex(Iterable<? extends K> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i10) {
        return new HashMap<>(capacity(i10));
    }

    public static final <E> HashSet<E> newHashSetWithExpectedSize(int i10) {
        return new HashSet<>(capacity(i10));
    }

    public static final <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i10) {
        return new LinkedHashSet<>(capacity(i10));
    }
}

package kotlin.collections;

import java.util.Collection;
import java.util.List;
import ki.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes4.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static /* bridge */ /* synthetic */ void c(Collection collection, Object[] objArr) {
        CollectionsKt__MutableCollectionsKt.addAll(collection, objArr);
    }

    public static /* bridge */ /* synthetic */ int e(List list, l lVar) {
        return CollectionsKt__CollectionsKt.binarySearch$default(list, lVar, 0, 0, 6, (Object) null);
    }

    public static /* bridge */ /* synthetic */ int f(Iterable iterable) {
        return CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
    }

    public static /* bridge */ /* synthetic */ Appendable i(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i10) {
        return CollectionsKt___CollectionsKt.joinTo$default(iterable, appendable, str, str2, str3, 0, null, function1, i10, null);
    }

    public static /* bridge */ /* synthetic */ String j(Iterable iterable, String str, String str2, String str3, Function1 function1, int i10) {
        return CollectionsKt___CollectionsKt.joinToString$default(iterable, str, str2, str3, 0, null, function1, i10, null);
    }
}

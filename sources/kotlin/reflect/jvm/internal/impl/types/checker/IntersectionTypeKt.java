package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension({"SMAP\nIntersectionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/IntersectionTypeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n1549#2:184\n1620#2,3:185\n1549#2:188\n1620#2,3:189\n1549#2:192\n1620#2,3:193\n*S KotlinDebug\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/IntersectionTypeKt\n*L\n26#1:184\n26#1:185,3\n38#1:188\n38#1:189,3\n58#1:192\n58#1:193,3\n*E\n"})
/* loaded from: classes4.dex */
public final class IntersectionTypeKt {
    public static final UnwrappedType intersectTypes(List<? extends UnwrappedType> types) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        SimpleType lowerBound;
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size != 0) {
            if (size != 1) {
                List<? extends UnwrappedType> list = types;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                boolean z10 = false;
                boolean z11 = false;
                for (UnwrappedType unwrappedType : list) {
                    if (!z10 && !KotlinTypeKt.isError(unwrappedType)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (unwrappedType instanceof SimpleType) {
                        lowerBound = (SimpleType) unwrappedType;
                    } else if (unwrappedType instanceof FlexibleType) {
                        if (DynamicTypesKt.isDynamic(unwrappedType)) {
                            return unwrappedType;
                        }
                        lowerBound = ((FlexibleType) unwrappedType).getLowerBound();
                        z11 = true;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(lowerBound);
                }
                if (z10) {
                    return ErrorUtils.createErrorType(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, types.toString());
                }
                if (!z11) {
                    return TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList);
                }
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(FlexibleTypesKt.upperIfFlexible((UnwrappedType) it.next()));
                }
                TypeIntersector typeIntersector = TypeIntersector.INSTANCE;
                return KotlinTypeFactory.flexibleType(typeIntersector.intersectTypes$descriptors(arrayList), typeIntersector.intersectTypes$descriptors(arrayList2));
            }
            return (UnwrappedType) CollectionsKt.single((List) types);
        }
        throw new IllegalStateException("Expected some types".toString());
    }
}

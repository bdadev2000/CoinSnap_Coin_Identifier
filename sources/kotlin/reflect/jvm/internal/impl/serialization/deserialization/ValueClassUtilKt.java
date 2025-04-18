package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

@SourceDebugExtension({"SMAP\nValueClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,3:48\n1549#2:51\n1620#2,3:52\n1549#2:55\n1620#2,3:56\n*S KotlinDebug\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n*L\n25#1:47\n25#1:48,3\n29#1:51\n29#1:52,3\n32#1:55\n32#1:56,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ValueClassUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    public static final <T extends SimpleTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(ProtoBuf.Class r52, NameResolver nameResolver, TypeTable typeTable, Function1<? super ProtoBuf.Type, ? extends T> typeDeserializer, Function1<? super Name, ? extends T> typeOfPublicProperty) {
        T invoke;
        int collectionSizeOrDefault;
        ?? multiFieldValueClassUnderlyingTypeList;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        Intrinsics.checkNotNullParameter(r52, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        Intrinsics.checkNotNullParameter(typeOfPublicProperty, "typeOfPublicProperty");
        if (r52.getMultiFieldValueClassUnderlyingNameCount() > 0) {
            List<Integer> multiFieldValueClassUnderlyingNameList = r52.getMultiFieldValueClassUnderlyingNameList();
            Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingNameList, "multiFieldValueClassUnderlyingNameList");
            List<Integer> list = multiFieldValueClassUnderlyingNameList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Integer it : list) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                arrayList.add(NameResolverUtilKt.getName(nameResolver, it.intValue()));
            }
            Pair pair = TuplesKt.to(Integer.valueOf(r52.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(r52.getMultiFieldValueClassUnderlyingTypeCount()));
            if (Intrinsics.areEqual(pair, TuplesKt.to(Integer.valueOf(arrayList.size()), 0))) {
                List<Integer> multiFieldValueClassUnderlyingTypeIdList = r52.getMultiFieldValueClassUnderlyingTypeIdList();
                Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingTypeIdList, "multiFieldValueClassUnderlyingTypeIdList");
                List<Integer> list2 = multiFieldValueClassUnderlyingTypeIdList;
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                multiFieldValueClassUnderlyingTypeList = new ArrayList(collectionSizeOrDefault3);
                for (Integer it2 : list2) {
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    multiFieldValueClassUnderlyingTypeList.add(typeTable.get(it2.intValue()));
                }
            } else if (Intrinsics.areEqual(pair, TuplesKt.to(0, Integer.valueOf(arrayList.size())))) {
                multiFieldValueClassUnderlyingTypeList = r52.getMultiFieldValueClassUnderlyingTypeList();
            } else {
                throw new IllegalStateException(("class " + NameResolverUtilKt.getName(nameResolver, r52.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingTypeList, "when (typeIdCount to typ…epresentation\")\n        }");
            Iterable iterable = (Iterable) multiFieldValueClassUnderlyingTypeList;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                arrayList2.add(typeDeserializer.invoke(it3.next()));
            }
            return new MultiFieldValueClassRepresentation(CollectionsKt.zip(arrayList, arrayList2));
        }
        if (r52.hasInlineClassUnderlyingPropertyName()) {
            Name name = NameResolverUtilKt.getName(nameResolver, r52.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type inlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r52, typeTable);
            if ((inlineClassUnderlyingType != null && (invoke = typeDeserializer.invoke(inlineClassUnderlyingType)) != null) || (invoke = typeOfPublicProperty.invoke(name)) != null) {
                return new InlineClassRepresentation(name, invoke);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.getName(nameResolver, r52.getFqName()) + " with property " + name).toString());
        }
        return null;
    }
}

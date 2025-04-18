package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

@SourceDebugExtension({"SMAP\nprotoTypeTableUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 protoTypeTableUtil.kt\norg/jetbrains/kotlin/metadata/deserialization/ProtoTypeTableUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1#2:126\n1549#3:127\n1620#3,3:128\n1549#3:131\n1620#3,3:132\n1549#3:135\n1620#3,3:136\n1549#3:139\n1620#3,3:140\n1549#3:143\n1620#3,3:144\n*S KotlinDebug\n*F\n+ 1 protoTypeTableUtil.kt\norg/jetbrains/kotlin/metadata/deserialization/ProtoTypeTableUtilKt\n*L\n24#1:127\n24#1:128,3\n45#1:131\n45#1:132,3\n118#1:135\n118#1:136,3\n121#1:139\n121#1:140,3\n124#1:143\n124#1:144,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ProtoTypeTableUtilKt {
    public static final ProtoBuf.Type abbreviatedType(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        if (type.hasAbbreviatedTypeId()) {
            return typeTable.get(type.getAbbreviatedTypeId());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final List<ProtoBuf.Type> contextReceiverTypes(ProtoBuf.Class r32, TypeTable typeTable) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(r32, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = r32.getContextReceiverTypeList();
        boolean z10 = !contextReceiverTypeList.isEmpty();
        ?? r02 = contextReceiverTypeList;
        if (!z10) {
            r02 = 0;
        }
        if (r02 == 0) {
            List<Integer> contextReceiverTypeIdList = r32.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            List<Integer> list = contextReceiverTypeIdList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            r02 = new ArrayList(collectionSizeOrDefault);
            for (Integer it : list) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                r02.add(typeTable.get(it.intValue()));
            }
        }
        return r02;
    }

    public static final ProtoBuf.Type expandedType(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeAlias, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (typeAlias.hasExpandedType()) {
            ProtoBuf.Type expandedType = typeAlias.getExpandedType();
            Intrinsics.checkNotNullExpressionValue(expandedType, "expandedType");
            return expandedType;
        }
        if (typeAlias.hasExpandedTypeId()) {
            return typeTable.get(typeAlias.getExpandedTypeId());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
    }

    public static final ProtoBuf.Type flexibleUpperBound(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        if (type.hasFlexibleUpperBoundId()) {
            return typeTable.get(type.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final boolean hasReceiver(ProtoBuf.Function function) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    public static final ProtoBuf.Type inlineClassUnderlyingType(ProtoBuf.Class r12, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(r12, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (r12.hasInlineClassUnderlyingType()) {
            return r12.getInlineClassUnderlyingType();
        }
        if (r12.hasInlineClassUnderlyingTypeId()) {
            return typeTable.get(r12.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type outerType(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        if (type.hasOuterTypeId()) {
            return typeTable.get(type.getOuterTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type receiverType(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return typeTable.get(function.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type returnType(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (function.hasReturnType()) {
            ProtoBuf.Type returnType = function.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "returnType");
            return returnType;
        }
        if (function.hasReturnTypeId()) {
            return typeTable.get(function.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final List<ProtoBuf.Type> supertypes(ProtoBuf.Class r32, TypeTable typeTable) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(r32, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> supertypeList = r32.getSupertypeList();
        boolean z10 = !supertypeList.isEmpty();
        ?? r02 = supertypeList;
        if (!z10) {
            r02 = 0;
        }
        if (r02 == 0) {
            List<Integer> supertypeIdList = r32.getSupertypeIdList();
            Intrinsics.checkNotNullExpressionValue(supertypeIdList, "supertypeIdList");
            List<Integer> list = supertypeIdList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            r02 = new ArrayList(collectionSizeOrDefault);
            for (Integer it : list) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                r02.add(typeTable.get(it.intValue()));
            }
        }
        return r02;
    }

    public static final ProtoBuf.Type type(ProtoBuf.Type.Argument argument, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(argument, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.get(argument.getTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type underlyingType(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeAlias, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (typeAlias.hasUnderlyingType()) {
            ProtoBuf.Type underlyingType = typeAlias.getUnderlyingType();
            Intrinsics.checkNotNullExpressionValue(underlyingType, "underlyingType");
            return underlyingType;
        }
        if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.get(typeAlias.getUnderlyingTypeId());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final List<ProtoBuf.Type> upperBounds(ProtoBuf.TypeParameter typeParameter, TypeTable typeTable) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(typeParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> upperBoundList = typeParameter.getUpperBoundList();
        boolean z10 = !upperBoundList.isEmpty();
        ?? r02 = upperBoundList;
        if (!z10) {
            r02 = 0;
        }
        if (r02 == 0) {
            List<Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
            Intrinsics.checkNotNullExpressionValue(upperBoundIdList, "upperBoundIdList");
            List<Integer> list = upperBoundIdList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            r02 = new ArrayList(collectionSizeOrDefault);
            for (Integer it : list) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                r02.add(typeTable.get(it.intValue()));
            }
        }
        return r02;
    }

    public static final ProtoBuf.Type varargElementType(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(valueParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return typeTable.get(valueParameter.getVarargElementTypeId());
        }
        return null;
    }

    public static final boolean hasReceiver(ProtoBuf.Property property) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    public static final ProtoBuf.Type receiverType(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return typeTable.get(property.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type type(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(valueParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (valueParameter.hasType()) {
            ProtoBuf.Type type = valueParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "type");
            return type;
        }
        if (valueParameter.hasTypeId()) {
            return typeTable.get(valueParameter.getTypeId());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    public static final ProtoBuf.Type returnType(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (property.hasReturnType()) {
            ProtoBuf.Type returnType = property.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "returnType");
            return returnType;
        }
        if (property.hasReturnTypeId()) {
            return typeTable.get(property.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final List<ProtoBuf.Type> contextReceiverTypes(ProtoBuf.Function function, TypeTable typeTable) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(function, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
        boolean z10 = !contextReceiverTypeList.isEmpty();
        ?? r02 = contextReceiverTypeList;
        if (!z10) {
            r02 = 0;
        }
        if (r02 == 0) {
            List<Integer> contextReceiverTypeIdList = function.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            List<Integer> list = contextReceiverTypeIdList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            r02 = new ArrayList(collectionSizeOrDefault);
            for (Integer it : list) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                r02.add(typeTable.get(it.intValue()));
            }
        }
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final List<ProtoBuf.Type> contextReceiverTypes(ProtoBuf.Property property, TypeTable typeTable) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(property, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
        boolean z10 = !contextReceiverTypeList.isEmpty();
        ?? r02 = contextReceiverTypeList;
        if (!z10) {
            r02 = 0;
        }
        if (r02 == 0) {
            List<Integer> contextReceiverTypeIdList = property.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            List<Integer> list = contextReceiverTypeIdList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            r02 = new ArrayList(collectionSizeOrDefault);
            for (Integer it : list) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                r02.add(typeTable.get(it.intValue()));
            }
        }
        return r02;
    }
}

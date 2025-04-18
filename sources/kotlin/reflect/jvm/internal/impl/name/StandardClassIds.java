package kotlin.reflect.jvm.internal.impl.name;

import eb.j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@SourceDebugExtension({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n1271#2,2:266\n1285#2,4:268\n1271#2,2:272\n1285#2,4:274\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n*L\n80#1:266,2\n80#1:268,4\n84#1:272,2\n84#1:274,4\n*E\n"})
/* loaded from: classes4.dex */
public final class StandardClassIds {
    private static final ClassId Annotation;
    private static final ClassId AnnotationRetention;
    private static final ClassId AnnotationTarget;
    private static final ClassId Any;
    private static final ClassId Array;
    private static final FqName BASE_ANNOTATION_PACKAGE;
    private static final FqName BASE_COLLECTIONS_PACKAGE;
    private static final FqName BASE_COROUTINES_PACKAGE;
    private static final FqName BASE_ENUMS_PACKAGE;
    private static final FqName BASE_INTERNAL_IR_PACKAGE;
    private static final FqName BASE_INTERNAL_PACKAGE;
    private static final FqName BASE_JVM_INTERNAL_PACKAGE;
    private static final FqName BASE_JVM_PACKAGE;
    private static final FqName BASE_KOTLIN_PACKAGE;
    private static final FqName BASE_RANGES_PACKAGE;
    private static final FqName BASE_REFLECT_PACKAGE;
    private static final ClassId Boolean;
    private static final ClassId Byte;
    private static final ClassId Char;
    private static final ClassId CharIterator;
    private static final ClassId CharRange;
    private static final ClassId CharSequence;
    private static final ClassId Cloneable;
    private static final ClassId Collection;
    private static final ClassId Comparable;
    private static final ClassId Continuation;
    private static final ClassId Double;
    private static final ClassId Enum;
    private static final ClassId EnumEntries;
    private static final ClassId Float;
    private static final ClassId Function;
    public static final StandardClassIds INSTANCE = new StandardClassIds();
    private static final ClassId Int;
    private static final ClassId IntRange;
    private static final ClassId Iterable;
    private static final ClassId Iterator;
    private static final ClassId KCallable;
    private static final ClassId KClass;
    private static final ClassId KFunction;
    private static final ClassId KMutableProperty;
    private static final ClassId KMutableProperty0;
    private static final ClassId KMutableProperty1;
    private static final ClassId KMutableProperty2;
    private static final ClassId KProperty;
    private static final ClassId KProperty0;
    private static final ClassId KProperty1;
    private static final ClassId KProperty2;
    private static final ClassId List;
    private static final ClassId ListIterator;
    private static final ClassId Long;
    private static final ClassId LongRange;
    private static final ClassId Map;
    private static final ClassId MapEntry;
    private static final ClassId MutableCollection;
    private static final ClassId MutableIterable;
    private static final ClassId MutableIterator;
    private static final ClassId MutableList;
    private static final ClassId MutableListIterator;
    private static final ClassId MutableMap;
    private static final ClassId MutableMapEntry;
    private static final ClassId MutableSet;
    private static final ClassId Nothing;
    private static final ClassId Number;
    private static final ClassId Result;
    private static final ClassId Set;
    private static final ClassId Short;
    private static final ClassId String;
    private static final ClassId Throwable;
    private static final ClassId UByte;
    private static final ClassId UInt;
    private static final ClassId ULong;
    private static final ClassId UShort;
    private static final ClassId Unit;
    private static final Set<FqName> builtInsPackages;
    private static final Set<ClassId> constantAllowedTypes;
    private static final Map<ClassId, ClassId> elementTypeByPrimitiveArrayType;
    private static final Map<ClassId, ClassId> elementTypeByUnsignedArrayType;
    private static final Map<ClassId, ClassId> primitiveArrayTypeByElementType;
    private static final Set<ClassId> primitiveTypes;
    private static final Map<ClassId, ClassId> unsignedArrayTypeByElementType;
    private static final Set<ClassId> unsignedTypes;

    static {
        ClassId baseId;
        ClassId baseId2;
        ClassId baseId3;
        ClassId baseId4;
        ClassId baseId5;
        ClassId baseId6;
        ClassId baseId7;
        ClassId baseId8;
        ClassId baseId9;
        ClassId baseId10;
        ClassId baseId11;
        ClassId baseId12;
        ClassId baseId13;
        ClassId baseId14;
        ClassId unsignedId;
        ClassId unsignedId2;
        ClassId unsignedId3;
        ClassId unsignedId4;
        ClassId baseId15;
        ClassId baseId16;
        ClassId baseId17;
        ClassId baseId18;
        ClassId reflectId;
        ClassId reflectId2;
        ClassId reflectId3;
        ClassId reflectId4;
        ClassId reflectId5;
        ClassId reflectId6;
        ClassId reflectId7;
        ClassId reflectId8;
        ClassId reflectId9;
        ClassId reflectId10;
        ClassId reflectId11;
        ClassId baseId19;
        ClassId baseId20;
        ClassId baseId21;
        int collectionSizeOrDefault;
        Map<ClassId, ClassId> inverseMap;
        int collectionSizeOrDefault2;
        Map<ClassId, ClassId> inverseMap2;
        ClassId coroutinesId;
        ClassId collectionsId;
        ClassId collectionsId2;
        ClassId collectionsId3;
        ClassId collectionsId4;
        ClassId collectionsId5;
        ClassId collectionsId6;
        ClassId collectionsId7;
        ClassId collectionsId8;
        ClassId collectionsId9;
        ClassId collectionsId10;
        ClassId collectionsId11;
        ClassId collectionsId12;
        ClassId collectionsId13;
        ClassId collectionsId14;
        ClassId collectionsId15;
        ClassId baseId22;
        ClassId rangesId;
        ClassId rangesId2;
        ClassId rangesId3;
        ClassId annotationId;
        ClassId annotationId2;
        ClassId enumsId;
        ClassId primitiveArrayId;
        ClassId primitiveArrayId2;
        FqName fqName = new FqName("kotlin");
        BASE_KOTLIN_PACKAGE = fqName;
        FqName s5 = j.s("reflect", fqName, "BASE_KOTLIN_PACKAGE.chil…me.identifier(\"reflect\"))");
        BASE_REFLECT_PACKAGE = s5;
        FqName s10 = j.s("collections", fqName, "BASE_KOTLIN_PACKAGE.chil…dentifier(\"collections\"))");
        BASE_COLLECTIONS_PACKAGE = s10;
        FqName s11 = j.s("ranges", fqName, "BASE_KOTLIN_PACKAGE.chil…ame.identifier(\"ranges\"))");
        BASE_RANGES_PACKAGE = s11;
        FqName s12 = j.s("jvm", fqName, "BASE_KOTLIN_PACKAGE.child(Name.identifier(\"jvm\"))");
        BASE_JVM_PACKAGE = s12;
        BASE_JVM_INTERNAL_PACKAGE = j.s("internal", s12, "BASE_JVM_PACKAGE.child(N…e.identifier(\"internal\"))");
        FqName s13 = j.s("annotation", fqName, "BASE_KOTLIN_PACKAGE.chil…identifier(\"annotation\"))");
        BASE_ANNOTATION_PACKAGE = s13;
        FqName s14 = j.s("internal", fqName, "BASE_KOTLIN_PACKAGE.chil…e.identifier(\"internal\"))");
        BASE_INTERNAL_PACKAGE = s14;
        BASE_INTERNAL_IR_PACKAGE = j.s("ir", s14, "BASE_INTERNAL_PACKAGE.child(Name.identifier(\"ir\"))");
        FqName s15 = j.s("coroutines", fqName, "BASE_KOTLIN_PACKAGE.chil…identifier(\"coroutines\"))");
        BASE_COROUTINES_PACKAGE = s15;
        BASE_ENUMS_PACKAGE = j.s("enums", fqName, "BASE_KOTLIN_PACKAGE.chil…Name.identifier(\"enums\"))");
        builtInsPackages = SetsKt.setOf((Object[]) new FqName[]{fqName, s10, s11, s13, s5, s14, s15});
        baseId = StandardClassIdsKt.baseId("Nothing");
        Nothing = baseId;
        baseId2 = StandardClassIdsKt.baseId("Unit");
        Unit = baseId2;
        baseId3 = StandardClassIdsKt.baseId("Any");
        Any = baseId3;
        baseId4 = StandardClassIdsKt.baseId("Enum");
        Enum = baseId4;
        baseId5 = StandardClassIdsKt.baseId("Annotation");
        Annotation = baseId5;
        baseId6 = StandardClassIdsKt.baseId("Array");
        Array = baseId6;
        baseId7 = StandardClassIdsKt.baseId("Boolean");
        Boolean = baseId7;
        baseId8 = StandardClassIdsKt.baseId("Char");
        Char = baseId8;
        baseId9 = StandardClassIdsKt.baseId("Byte");
        Byte = baseId9;
        baseId10 = StandardClassIdsKt.baseId("Short");
        Short = baseId10;
        baseId11 = StandardClassIdsKt.baseId("Int");
        Int = baseId11;
        baseId12 = StandardClassIdsKt.baseId("Long");
        Long = baseId12;
        baseId13 = StandardClassIdsKt.baseId("Float");
        Float = baseId13;
        baseId14 = StandardClassIdsKt.baseId("Double");
        Double = baseId14;
        unsignedId = StandardClassIdsKt.unsignedId(baseId9);
        UByte = unsignedId;
        unsignedId2 = StandardClassIdsKt.unsignedId(baseId10);
        UShort = unsignedId2;
        unsignedId3 = StandardClassIdsKt.unsignedId(baseId11);
        UInt = unsignedId3;
        unsignedId4 = StandardClassIdsKt.unsignedId(baseId12);
        ULong = unsignedId4;
        baseId15 = StandardClassIdsKt.baseId("CharSequence");
        CharSequence = baseId15;
        baseId16 = StandardClassIdsKt.baseId("String");
        String = baseId16;
        baseId17 = StandardClassIdsKt.baseId("Throwable");
        Throwable = baseId17;
        baseId18 = StandardClassIdsKt.baseId("Cloneable");
        Cloneable = baseId18;
        reflectId = StandardClassIdsKt.reflectId("KProperty");
        KProperty = reflectId;
        reflectId2 = StandardClassIdsKt.reflectId("KMutableProperty");
        KMutableProperty = reflectId2;
        reflectId3 = StandardClassIdsKt.reflectId("KProperty0");
        KProperty0 = reflectId3;
        reflectId4 = StandardClassIdsKt.reflectId("KMutableProperty0");
        KMutableProperty0 = reflectId4;
        reflectId5 = StandardClassIdsKt.reflectId("KProperty1");
        KProperty1 = reflectId5;
        reflectId6 = StandardClassIdsKt.reflectId("KMutableProperty1");
        KMutableProperty1 = reflectId6;
        reflectId7 = StandardClassIdsKt.reflectId("KProperty2");
        KProperty2 = reflectId7;
        reflectId8 = StandardClassIdsKt.reflectId("KMutableProperty2");
        KMutableProperty2 = reflectId8;
        reflectId9 = StandardClassIdsKt.reflectId("KFunction");
        KFunction = reflectId9;
        reflectId10 = StandardClassIdsKt.reflectId("KClass");
        KClass = reflectId10;
        reflectId11 = StandardClassIdsKt.reflectId("KCallable");
        KCallable = reflectId11;
        baseId19 = StandardClassIdsKt.baseId("Comparable");
        Comparable = baseId19;
        baseId20 = StandardClassIdsKt.baseId("Number");
        Number = baseId20;
        baseId21 = StandardClassIdsKt.baseId("Function");
        Function = baseId21;
        Set<ClassId> of2 = SetsKt.setOf((Object[]) new ClassId[]{baseId7, baseId8, baseId9, baseId10, baseId11, baseId12, baseId13, baseId14});
        primitiveTypes = of2;
        Set<ClassId> set = of2;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
        for (Object obj : set) {
            Name shortClassName = ((ClassId) obj).getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName, "id.shortClassName");
            primitiveArrayId2 = StandardClassIdsKt.primitiveArrayId(shortClassName);
            linkedHashMap.put(obj, primitiveArrayId2);
        }
        primitiveArrayTypeByElementType = linkedHashMap;
        inverseMap = StandardClassIdsKt.inverseMap(linkedHashMap);
        elementTypeByPrimitiveArrayType = inverseMap;
        Set<ClassId> of3 = SetsKt.setOf((Object[]) new ClassId[]{UByte, UShort, UInt, ULong});
        unsignedTypes = of3;
        Set<ClassId> set2 = of3;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault2), 16));
        for (Object obj2 : set2) {
            Name shortClassName2 = ((ClassId) obj2).getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName2, "id.shortClassName");
            primitiveArrayId = StandardClassIdsKt.primitiveArrayId(shortClassName2);
            linkedHashMap2.put(obj2, primitiveArrayId);
        }
        unsignedArrayTypeByElementType = linkedHashMap2;
        inverseMap2 = StandardClassIdsKt.inverseMap(linkedHashMap2);
        elementTypeByUnsignedArrayType = inverseMap2;
        constantAllowedTypes = SetsKt.plus((Set<? extends ClassId>) SetsKt.plus((Set) primitiveTypes, (Iterable) unsignedTypes), String);
        coroutinesId = StandardClassIdsKt.coroutinesId("Continuation");
        Continuation = coroutinesId;
        collectionsId = StandardClassIdsKt.collectionsId("Iterator");
        Iterator = collectionsId;
        collectionsId2 = StandardClassIdsKt.collectionsId("Iterable");
        Iterable = collectionsId2;
        collectionsId3 = StandardClassIdsKt.collectionsId("Collection");
        Collection = collectionsId3;
        collectionsId4 = StandardClassIdsKt.collectionsId("List");
        List = collectionsId4;
        collectionsId5 = StandardClassIdsKt.collectionsId("ListIterator");
        ListIterator = collectionsId5;
        collectionsId6 = StandardClassIdsKt.collectionsId("Set");
        Set = collectionsId6;
        collectionsId7 = StandardClassIdsKt.collectionsId("Map");
        Map = collectionsId7;
        collectionsId8 = StandardClassIdsKt.collectionsId("MutableIterator");
        MutableIterator = collectionsId8;
        collectionsId9 = StandardClassIdsKt.collectionsId("CharIterator");
        CharIterator = collectionsId9;
        collectionsId10 = StandardClassIdsKt.collectionsId("MutableIterable");
        MutableIterable = collectionsId10;
        collectionsId11 = StandardClassIdsKt.collectionsId("MutableCollection");
        MutableCollection = collectionsId11;
        collectionsId12 = StandardClassIdsKt.collectionsId("MutableList");
        MutableList = collectionsId12;
        collectionsId13 = StandardClassIdsKt.collectionsId("MutableListIterator");
        MutableListIterator = collectionsId13;
        collectionsId14 = StandardClassIdsKt.collectionsId("MutableSet");
        MutableSet = collectionsId14;
        collectionsId15 = StandardClassIdsKt.collectionsId("MutableMap");
        MutableMap = collectionsId15;
        ClassId createNestedClassId = collectionsId7.createNestedClassId(Name.identifier("Entry"));
        Intrinsics.checkNotNullExpressionValue(createNestedClassId, "Map.createNestedClassId(Name.identifier(\"Entry\"))");
        MapEntry = createNestedClassId;
        ClassId createNestedClassId2 = collectionsId15.createNestedClassId(Name.identifier("MutableEntry"));
        Intrinsics.checkNotNullExpressionValue(createNestedClassId2, "MutableMap.createNestedC…entifier(\"MutableEntry\"))");
        MutableMapEntry = createNestedClassId2;
        baseId22 = StandardClassIdsKt.baseId("Result");
        Result = baseId22;
        rangesId = StandardClassIdsKt.rangesId("IntRange");
        IntRange = rangesId;
        rangesId2 = StandardClassIdsKt.rangesId("LongRange");
        LongRange = rangesId2;
        rangesId3 = StandardClassIdsKt.rangesId("CharRange");
        CharRange = rangesId3;
        annotationId = StandardClassIdsKt.annotationId("AnnotationRetention");
        AnnotationRetention = annotationId;
        annotationId2 = StandardClassIdsKt.annotationId("AnnotationTarget");
        AnnotationTarget = annotationId2;
        enumsId = StandardClassIdsKt.enumsId("EnumEntries");
        EnumEntries = enumsId;
    }

    private StandardClassIds() {
    }

    public final ClassId getArray() {
        return Array;
    }

    public final FqName getBASE_ANNOTATION_PACKAGE() {
        return BASE_ANNOTATION_PACKAGE;
    }

    public final FqName getBASE_COLLECTIONS_PACKAGE() {
        return BASE_COLLECTIONS_PACKAGE;
    }

    public final FqName getBASE_COROUTINES_PACKAGE() {
        return BASE_COROUTINES_PACKAGE;
    }

    public final FqName getBASE_ENUMS_PACKAGE() {
        return BASE_ENUMS_PACKAGE;
    }

    public final FqName getBASE_KOTLIN_PACKAGE() {
        return BASE_KOTLIN_PACKAGE;
    }

    public final FqName getBASE_RANGES_PACKAGE() {
        return BASE_RANGES_PACKAGE;
    }

    public final FqName getBASE_REFLECT_PACKAGE() {
        return BASE_REFLECT_PACKAGE;
    }

    public final ClassId getEnumEntries() {
        return EnumEntries;
    }

    public final ClassId getKClass() {
        return KClass;
    }

    public final ClassId getKFunction() {
        return KFunction;
    }

    public final ClassId getMutableList() {
        return MutableList;
    }

    public final ClassId getMutableMap() {
        return MutableMap;
    }

    public final ClassId getMutableSet() {
        return MutableSet;
    }
}

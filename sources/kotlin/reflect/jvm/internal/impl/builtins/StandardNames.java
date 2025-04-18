package kotlin.reflect.jvm.internal.impl.builtins;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import eb.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes4.dex */
public final class StandardNames {

    @JvmField
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;

    @JvmField
    public static final Name BACKING_FIELD;

    @JvmField
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;

    @JvmField
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;

    @JvmField
    public static final Name BUILT_INS_PACKAGE_NAME;

    @JvmField
    public static final Name CHAR_CODE;

    @JvmField
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;

    @JvmField
    public static final Name CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;

    @JvmField
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;

    @JvmField
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;

    @JvmField
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;

    @JvmField
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;

    @JvmField
    public static final String DATA_CLASS_COMPONENT_PREFIX;

    @JvmField
    public static final Name DATA_CLASS_COPY;

    @JvmField
    public static final Name DEFAULT_VALUE_PARAMETER;

    @JvmField
    public static final FqName DYNAMIC_FQ_NAME;

    @JvmField
    public static final Name ENUM_ENTRIES;

    @JvmField
    public static final Name ENUM_VALUES;

    @JvmField
    public static final Name ENUM_VALUE_OF;

    @JvmField
    public static final Name HASHCODE_NAME;
    public static final StandardNames INSTANCE = new StandardNames();

    @JvmField
    public static final FqName KOTLIN_INTERNAL_FQ_NAME;

    @JvmField
    public static final FqName KOTLIN_REFLECT_FQ_NAME;

    @JvmField
    public static final Name NEXT_CHAR;
    private static final FqName NON_EXISTENT_CLASS;

    @JvmField
    public static final List<String> PREFIXES;

    @JvmField
    public static final FqName RANGES_PACKAGE_FQ_NAME;

    @JvmField
    public static final FqName RESULT_FQ_NAME;

    @JvmField
    public static final FqName TEXT_PACKAGE_FQ_NAME;

    @SourceDebugExtension({"SMAP\nStandardNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,295:1\n11670#2,3:296\n11670#2,3:299\n*S KotlinDebug\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n*L\n191#1:296,3\n195#1:299,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class FqNames {
        public static final FqNames INSTANCE;

        @JvmField
        public static final FqNameUnsafe _boolean;

        @JvmField
        public static final FqNameUnsafe _byte;

        @JvmField
        public static final FqNameUnsafe _char;

        @JvmField
        public static final FqNameUnsafe _double;

        @JvmField
        public static final FqNameUnsafe _enum;

        @JvmField
        public static final FqNameUnsafe _float;

        @JvmField
        public static final FqNameUnsafe _int;

        @JvmField
        public static final FqNameUnsafe _long;

        @JvmField
        public static final FqNameUnsafe _short;

        @JvmField
        public static final FqName accessibleLateinitPropertyLiteral;

        @JvmField
        public static final FqName annotation;

        @JvmField
        public static final FqName annotationRetention;

        @JvmField
        public static final FqName annotationTarget;

        @JvmField
        public static final FqNameUnsafe any;

        @JvmField
        public static final FqNameUnsafe array;

        @JvmField
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;

        @JvmField
        public static final FqNameUnsafe charSequence;

        @JvmField
        public static final FqNameUnsafe cloneable;

        @JvmField
        public static final FqName collection;

        @JvmField
        public static final FqName comparable;

        @JvmField
        public static final FqName contextFunctionTypeParams;

        @JvmField
        public static final FqName deprecated;

        @JvmField
        public static final FqName deprecatedSinceKotlin;

        @JvmField
        public static final FqName deprecationLevel;

        @JvmField
        public static final FqName extensionFunctionType;

        @JvmField
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;

        @JvmField
        public static final FqNameUnsafe functionSupertype;

        @JvmField
        public static final FqNameUnsafe intRange;

        @JvmField
        public static final FqName iterable;

        @JvmField
        public static final FqName iterator;

        @JvmField
        public static final FqNameUnsafe kCallable;

        @JvmField
        public static final FqNameUnsafe kClass;

        @JvmField
        public static final FqNameUnsafe kDeclarationContainer;

        @JvmField
        public static final FqNameUnsafe kMutableProperty0;

        @JvmField
        public static final FqNameUnsafe kMutableProperty1;

        @JvmField
        public static final FqNameUnsafe kMutableProperty2;

        @JvmField
        public static final FqNameUnsafe kMutablePropertyFqName;

        @JvmField
        public static final ClassId kProperty;

        @JvmField
        public static final FqNameUnsafe kProperty0;

        @JvmField
        public static final FqNameUnsafe kProperty1;

        @JvmField
        public static final FqNameUnsafe kProperty2;

        @JvmField
        public static final FqNameUnsafe kPropertyFqName;

        @JvmField
        public static final FqName list;

        @JvmField
        public static final FqName listIterator;

        @JvmField
        public static final FqNameUnsafe longRange;

        @JvmField
        public static final FqName map;

        @JvmField
        public static final FqName mapEntry;

        @JvmField
        public static final FqName mustBeDocumented;

        @JvmField
        public static final FqName mutableCollection;

        @JvmField
        public static final FqName mutableIterable;

        @JvmField
        public static final FqName mutableIterator;

        @JvmField
        public static final FqName mutableList;

        @JvmField
        public static final FqName mutableListIterator;

        @JvmField
        public static final FqName mutableMap;

        @JvmField
        public static final FqName mutableMapEntry;

        @JvmField
        public static final FqName mutableSet;

        @JvmField
        public static final FqNameUnsafe nothing;

        @JvmField
        public static final FqNameUnsafe number;

        @JvmField
        public static final FqName parameterName;

        @JvmField
        public static final ClassId parameterNameClassId;

        @JvmField
        public static final Set<Name> primitiveArrayTypeShortNames;

        @JvmField
        public static final Set<Name> primitiveTypeShortNames;

        @JvmField
        public static final FqName publishedApi;

        @JvmField
        public static final FqName repeatable;

        @JvmField
        public static final ClassId repeatableClassId;

        @JvmField
        public static final FqName replaceWith;

        @JvmField
        public static final FqName retention;

        @JvmField
        public static final ClassId retentionClassId;

        @JvmField
        public static final FqName set;

        @JvmField
        public static final FqNameUnsafe string;

        @JvmField
        public static final FqName suppress;

        @JvmField
        public static final FqName target;

        @JvmField
        public static final ClassId targetClassId;

        @JvmField
        public static final FqName throwable;

        @JvmField
        public static final ClassId uByte;

        @JvmField
        public static final FqName uByteArrayFqName;

        @JvmField
        public static final FqName uByteFqName;

        @JvmField
        public static final ClassId uInt;

        @JvmField
        public static final FqName uIntArrayFqName;

        @JvmField
        public static final FqName uIntFqName;

        @JvmField
        public static final ClassId uLong;

        @JvmField
        public static final FqName uLongArrayFqName;

        @JvmField
        public static final FqName uLongFqName;

        @JvmField
        public static final ClassId uShort;

        @JvmField
        public static final FqName uShortArrayFqName;

        @JvmField
        public static final FqName uShortFqName;

        @JvmField
        public static final FqNameUnsafe unit;

        @JvmField
        public static final FqName unsafeVariance;

        static {
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            any = fqNames.fqNameUnsafe("Any");
            nothing = fqNames.fqNameUnsafe("Nothing");
            cloneable = fqNames.fqNameUnsafe("Cloneable");
            suppress = fqNames.fqName("Suppress");
            unit = fqNames.fqNameUnsafe("Unit");
            charSequence = fqNames.fqNameUnsafe("CharSequence");
            string = fqNames.fqNameUnsafe("String");
            array = fqNames.fqNameUnsafe("Array");
            _boolean = fqNames.fqNameUnsafe("Boolean");
            _char = fqNames.fqNameUnsafe("Char");
            _byte = fqNames.fqNameUnsafe("Byte");
            _short = fqNames.fqNameUnsafe("Short");
            _int = fqNames.fqNameUnsafe("Int");
            _long = fqNames.fqNameUnsafe("Long");
            _float = fqNames.fqNameUnsafe("Float");
            _double = fqNames.fqNameUnsafe("Double");
            number = fqNames.fqNameUnsafe("Number");
            _enum = fqNames.fqNameUnsafe("Enum");
            functionSupertype = fqNames.fqNameUnsafe("Function");
            throwable = fqNames.fqName("Throwable");
            comparable = fqNames.fqName("Comparable");
            intRange = fqNames.rangesFqName("IntRange");
            longRange = fqNames.rangesFqName("LongRange");
            deprecated = fqNames.fqName("Deprecated");
            deprecatedSinceKotlin = fqNames.fqName("DeprecatedSinceKotlin");
            deprecationLevel = fqNames.fqName("DeprecationLevel");
            replaceWith = fqNames.fqName("ReplaceWith");
            extensionFunctionType = fqNames.fqName("ExtensionFunctionType");
            contextFunctionTypeParams = fqNames.fqName("ContextFunctionTypeParams");
            FqName fqName = fqNames.fqName("ParameterName");
            parameterName = fqName;
            ClassId classId = ClassId.topLevel(fqName);
            Intrinsics.checkNotNullExpressionValue(classId, "topLevel(parameterName)");
            parameterNameClassId = classId;
            annotation = fqNames.fqName("Annotation");
            FqName annotationName = fqNames.annotationName("Target");
            target = annotationName;
            ClassId classId2 = ClassId.topLevel(annotationName);
            Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(target)");
            targetClassId = classId2;
            annotationTarget = fqNames.annotationName("AnnotationTarget");
            annotationRetention = fqNames.annotationName("AnnotationRetention");
            FqName annotationName2 = fqNames.annotationName("Retention");
            retention = annotationName2;
            ClassId classId3 = ClassId.topLevel(annotationName2);
            Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(retention)");
            retentionClassId = classId3;
            FqName annotationName3 = fqNames.annotationName("Repeatable");
            repeatable = annotationName3;
            ClassId classId4 = ClassId.topLevel(annotationName3);
            Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(repeatable)");
            repeatableClassId = classId4;
            mustBeDocumented = fqNames.annotationName("MustBeDocumented");
            unsafeVariance = fqNames.fqName("UnsafeVariance");
            publishedApi = fqNames.fqName("PublishedApi");
            accessibleLateinitPropertyLiteral = fqNames.internalName("AccessibleLateinitPropertyLiteral");
            iterator = fqNames.collectionsFqName("Iterator");
            iterable = fqNames.collectionsFqName("Iterable");
            collection = fqNames.collectionsFqName("Collection");
            list = fqNames.collectionsFqName("List");
            listIterator = fqNames.collectionsFqName("ListIterator");
            set = fqNames.collectionsFqName("Set");
            FqName collectionsFqName = fqNames.collectionsFqName("Map");
            map = collectionsFqName;
            mapEntry = j.s("Entry", collectionsFqName, "map.child(Name.identifier(\"Entry\"))");
            mutableIterator = fqNames.collectionsFqName("MutableIterator");
            mutableIterable = fqNames.collectionsFqName("MutableIterable");
            mutableCollection = fqNames.collectionsFqName("MutableCollection");
            mutableList = fqNames.collectionsFqName("MutableList");
            mutableListIterator = fqNames.collectionsFqName("MutableListIterator");
            mutableSet = fqNames.collectionsFqName("MutableSet");
            FqName collectionsFqName2 = fqNames.collectionsFqName("MutableMap");
            mutableMap = collectionsFqName2;
            mutableMapEntry = j.s("MutableEntry", collectionsFqName2, "mutableMap.child(Name.identifier(\"MutableEntry\"))");
            kClass = reflect("KClass");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe reflect = reflect("KProperty");
            kPropertyFqName = reflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            ClassId classId5 = ClassId.topLevel(reflect.toSafe());
            Intrinsics.checkNotNullExpressionValue(classId5, "topLevel(kPropertyFqName.toSafe())");
            kProperty = classId5;
            kDeclarationContainer = reflect("KDeclarationContainer");
            FqName fqName2 = fqNames.fqName("UByte");
            uByteFqName = fqName2;
            FqName fqName3 = fqNames.fqName("UShort");
            uShortFqName = fqName3;
            FqName fqName4 = fqNames.fqName("UInt");
            uIntFqName = fqName4;
            FqName fqName5 = fqNames.fqName("ULong");
            uLongFqName = fqName5;
            ClassId classId6 = ClassId.topLevel(fqName2);
            Intrinsics.checkNotNullExpressionValue(classId6, "topLevel(uByteFqName)");
            uByte = classId6;
            ClassId classId7 = ClassId.topLevel(fqName3);
            Intrinsics.checkNotNullExpressionValue(classId7, "topLevel(uShortFqName)");
            uShort = classId7;
            ClassId classId8 = ClassId.topLevel(fqName4);
            Intrinsics.checkNotNullExpressionValue(classId8, "topLevel(uIntFqName)");
            uInt = classId8;
            ClassId classId9 = ClassId.topLevel(fqName5);
            Intrinsics.checkNotNullExpressionValue(classId9, "topLevel(uLongFqName)");
            uLong = classId9;
            uByteArrayFqName = fqNames.fqName("UByteArray");
            uShortArrayFqName = fqNames.fqName("UShortArray");
            uIntArrayFqName = fqNames.fqName("UIntArray");
            uLongArrayFqName = fqNames.fqName("ULongArray");
            HashSet newHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                newHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = newHashSetWithExpectedSize;
            HashSet newHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                newHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = newHashSetWithExpectedSize2;
            HashMap newHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String asString = primitiveType3.getTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(asString, "primitiveType.typeName.asString()");
                newHashMapWithExpectedSize.put(fqNames2.fqNameUnsafe(asString), primitiveType3);
            }
            fqNameToPrimitiveType = newHashMapWithExpectedSize;
            HashMap newHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames3 = INSTANCE;
                String asString2 = primitiveType4.getArrayTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(asString2, "primitiveType.arrayTypeName.asString()");
                newHashMapWithExpectedSize2.put(fqNames3.fqNameUnsafe(asString2), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = newHashMapWithExpectedSize2;
        }

        private FqNames() {
        }

        private final FqName annotationName(String str) {
            return j.s(str, StandardNames.ANNOTATION_PACKAGE_FQ_NAME, "ANNOTATION_PACKAGE_FQ_NA…e.identifier(simpleName))");
        }

        private final FqName collectionsFqName(String str) {
            return j.s(str, StandardNames.COLLECTIONS_PACKAGE_FQ_NAME, "COLLECTIONS_PACKAGE_FQ_N…e.identifier(simpleName))");
        }

        private final FqName fqName(String str) {
            return j.s(str, StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "BUILT_INS_PACKAGE_FQ_NAM…e.identifier(simpleName))");
        }

        private final FqNameUnsafe fqNameUnsafe(String str) {
            FqNameUnsafe unsafe = fqName(str).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "fqName(simpleName).toUnsafe()");
            return unsafe;
        }

        private final FqName internalName(String str) {
            return j.s(str, StandardNames.KOTLIN_INTERNAL_FQ_NAME, "KOTLIN_INTERNAL_FQ_NAME.…e.identifier(simpleName))");
        }

        private final FqNameUnsafe rangesFqName(String str) {
            FqNameUnsafe unsafe = StandardNames.RANGES_PACKAGE_FQ_NAME.child(Name.identifier(str)).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return unsafe;
        }

        @JvmStatic
        public static final FqNameUnsafe reflect(String simpleName) {
            Intrinsics.checkNotNullParameter(simpleName, "simpleName");
            FqNameUnsafe unsafe = StandardNames.KOTLIN_REFLECT_FQ_NAME.child(Name.identifier(simpleName)).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "KOTLIN_REFLECT_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return unsafe;
        }
    }

    static {
        Name identifier = Name.identifier("field");
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(\"field\")");
        BACKING_FIELD = identifier;
        Name identifier2 = Name.identifier(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullExpressionValue(identifier2, "identifier(\"value\")");
        DEFAULT_VALUE_PARAMETER = identifier2;
        Name identifier3 = Name.identifier("values");
        Intrinsics.checkNotNullExpressionValue(identifier3, "identifier(\"values\")");
        ENUM_VALUES = identifier3;
        Name identifier4 = Name.identifier("entries");
        Intrinsics.checkNotNullExpressionValue(identifier4, "identifier(\"entries\")");
        ENUM_ENTRIES = identifier4;
        Name identifier5 = Name.identifier("valueOf");
        Intrinsics.checkNotNullExpressionValue(identifier5, "identifier(\"valueOf\")");
        ENUM_VALUE_OF = identifier5;
        Name identifier6 = Name.identifier("copy");
        Intrinsics.checkNotNullExpressionValue(identifier6, "identifier(\"copy\")");
        DATA_CLASS_COPY = identifier6;
        DATA_CLASS_COMPONENT_PREFIX = "component";
        Name identifier7 = Name.identifier("hashCode");
        Intrinsics.checkNotNullExpressionValue(identifier7, "identifier(\"hashCode\")");
        HASHCODE_NAME = identifier7;
        Name identifier8 = Name.identifier("code");
        Intrinsics.checkNotNullExpressionValue(identifier8, "identifier(\"code\")");
        CHAR_CODE = identifier8;
        Name identifier9 = Name.identifier("nextChar");
        Intrinsics.checkNotNullExpressionValue(identifier9, "identifier(\"nextChar\")");
        NEXT_CHAR = identifier9;
        Name identifier10 = Name.identifier("count");
        Intrinsics.checkNotNullExpressionValue(identifier10, "identifier(\"count\")");
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = identifier10;
        DYNAMIC_FQ_NAME = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = fqName;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        CONTINUATION_INTERFACE_FQ_NAME = j.s("Continuation", fqName, "COROUTINES_PACKAGE_FQ_NA…entifier(\"Continuation\"))");
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = kotlin.collections.CollectionsKt.listOf((Object[]) new String[]{"KProperty", "KMutableProperty", "KFunction", "KSuspendFunction"});
        Name identifier11 = Name.identifier("kotlin");
        Intrinsics.checkNotNullExpressionValue(identifier11, "identifier(\"kotlin\")");
        BUILT_INS_PACKAGE_NAME = identifier11;
        FqName fqName3 = FqName.topLevel(identifier11);
        Intrinsics.checkNotNullExpressionValue(fqName3, "topLevel(BUILT_INS_PACKAGE_NAME)");
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        FqName s5 = j.s("annotation", fqName3, "BUILT_INS_PACKAGE_FQ_NAM…identifier(\"annotation\"))");
        ANNOTATION_PACKAGE_FQ_NAME = s5;
        FqName s10 = j.s("collections", fqName3, "BUILT_INS_PACKAGE_FQ_NAM…dentifier(\"collections\"))");
        COLLECTIONS_PACKAGE_FQ_NAME = s10;
        FqName s11 = j.s("ranges", fqName3, "BUILT_INS_PACKAGE_FQ_NAM…ame.identifier(\"ranges\"))");
        RANGES_PACKAGE_FQ_NAME = s11;
        TEXT_PACKAGE_FQ_NAME = j.s(MimeTypes.BASE_TYPE_TEXT, fqName3, "BUILT_INS_PACKAGE_FQ_NAM…(Name.identifier(\"text\"))");
        FqName s12 = j.s("internal", fqName3, "BUILT_INS_PACKAGE_FQ_NAM…e.identifier(\"internal\"))");
        KOTLIN_INTERNAL_FQ_NAME = s12;
        NON_EXISTENT_CLASS = new FqName("error.NonExistentClass");
        BUILT_INS_PACKAGE_FQ_NAMES = SetsKt.setOf((Object[]) new FqName[]{fqName3, s10, s11, s5, fqName2, s12, fqName});
    }

    private StandardNames() {
    }

    @JvmStatic
    public static final ClassId getFunctionClassId(int i10) {
        return new ClassId(BUILT_INS_PACKAGE_FQ_NAME, Name.identifier(getFunctionName(i10)));
    }

    @JvmStatic
    public static final String getFunctionName(int i10) {
        return j.i("Function", i10);
    }

    @JvmStatic
    public static final FqName getPrimitiveFqName(PrimitiveType primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        FqName child = BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
        Intrinsics.checkNotNullExpressionValue(child, "BUILT_INS_PACKAGE_FQ_NAM…d(primitiveType.typeName)");
        return child;
    }

    @JvmStatic
    public static final String getSuspendFunctionName(int i10) {
        return FunctionClassKind.SuspendFunction.getClassNamePrefix() + i10;
    }

    @JvmStatic
    public static final boolean isPrimitiveArray(FqNameUnsafe arrayFqName) {
        Intrinsics.checkNotNullParameter(arrayFqName, "arrayFqName");
        if (FqNames.arrayClassFqNameToPrimitiveType.get(arrayFqName) != null) {
            return true;
        }
        return false;
    }
}

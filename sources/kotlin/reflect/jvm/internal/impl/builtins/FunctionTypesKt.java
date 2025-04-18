package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension({"SMAP\nfunctionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,293:1\n1#2:294\n1549#3:295\n1620#3,3:296\n223#3,2:299\n1549#3:301\n1620#3,3:302\n1549#3:305\n1620#3,3:306\n1590#3,4:309\n*S KotlinDebug\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n*L\n152#1:295\n152#1:296,3\n187#1:299,2\n192#1:301\n192#1:302,3\n214#1:305\n214#1:306,3\n217#1:309,4\n*E\n"})
/* loaded from: classes4.dex */
public final class FunctionTypesKt {
    public static final int contextFunctionTypeParamsCount(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        AnnotationDescriptor mo1418findAnnotation = kotlinType.getAnnotations().mo1418findAnnotation(StandardNames.FqNames.contextFunctionTypeParams);
        if (mo1418findAnnotation == null) {
            return 0;
        }
        ConstantValue constantValue = (ConstantValue) MapsKt.getValue(mo1418findAnnotation.getAllValueArguments(), StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME);
        Intrinsics.checkNotNull(constantValue, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((IntValue) constantValue).getValue().intValue();
    }

    @JvmOverloads
    public static final SimpleType createFunctionType(KotlinBuiltIns builtIns, Annotations annotations, KotlinType kotlinType, List<? extends KotlinType> contextReceiverTypes, List<? extends KotlinType> parameterTypes, List<Name> list, KotlinType returnType, boolean z10) {
        int i10;
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        List<TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        int size = contextReceiverTypes.size() + parameterTypes.size();
        if (kotlinType == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        ClassDescriptor functionDescriptor = getFunctionDescriptor(builtIns, size + i10, z10);
        if (kotlinType != null) {
            annotations = withExtensionFunctionAnnotation(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = withContextReceiversFunctionAnnotation(annotations, builtIns, contextReceiverTypes.size());
        }
        return KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations), functionDescriptor, functionTypeArgumentProjections);
    }

    public static final Name extractParameterNameFromFunctionTypeArgument(KotlinType kotlinType) {
        StringValue stringValue;
        String value;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        AnnotationDescriptor mo1418findAnnotation = kotlinType.getAnnotations().mo1418findAnnotation(StandardNames.FqNames.parameterName);
        if (mo1418findAnnotation == null) {
            return null;
        }
        Object singleOrNull = CollectionsKt.singleOrNull(mo1418findAnnotation.getAllValueArguments().values());
        if (singleOrNull instanceof StringValue) {
            stringValue = (StringValue) singleOrNull;
        } else {
            stringValue = null;
        }
        if (stringValue != null && (value = stringValue.getValue()) != null) {
            if (!Name.isValidIdentifier(value)) {
                value = null;
            }
            if (value != null) {
                return Name.identifier(value);
            }
        }
        return null;
    }

    public static final List<KotlinType> getContextReceiverTypesFromFunctionType(KotlinType kotlinType) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        int contextFunctionTypeParamsCount = contextFunctionTypeParamsCount(kotlinType);
        if (contextFunctionTypeParamsCount == 0) {
            return CollectionsKt.emptyList();
        }
        List<TypeProjection> subList = kotlinType.getArguments().subList(0, contextFunctionTypeParamsCount);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(subList, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            KotlinType type = ((TypeProjection) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final ClassDescriptor getFunctionDescriptor(KotlinBuiltIns builtIns, int i10, boolean z10) {
        ClassDescriptor function;
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (z10) {
            function = builtIns.getSuspendFunction(i10);
        } else {
            function = builtIns.getFunction(i10);
        }
        Intrinsics.checkNotNullExpressionValue(function, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return function;
    }

    public static final List<TypeProjection> getFunctionTypeArgumentProjections(KotlinType kotlinType, List<? extends KotlinType> contextReceiverTypes, List<? extends KotlinType> parameterTypes, List<Name> list, KotlinType returnType, KotlinBuiltIns builtIns) {
        int i10;
        int collectionSizeOrDefault;
        TypeProjection typeProjection;
        Name name;
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        int size = contextReceiverTypes.size() + parameterTypes.size();
        int i11 = 0;
        if (kotlinType != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList = new ArrayList(size + i10 + 1);
        List<? extends KotlinType> list2 = contextReceiverTypes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(TypeUtilsKt.asTypeProjection((KotlinType) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (kotlinType != null) {
            typeProjection = TypeUtilsKt.asTypeProjection(kotlinType);
        } else {
            typeProjection = null;
        }
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, typeProjection);
        for (Object obj : parameterTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KotlinType kotlinType2 = (KotlinType) obj;
            if (list == null || (name = list.get(i11)) == null || name.isSpecial()) {
                name = null;
            }
            if (name != null) {
                FqName fqName = StandardNames.FqNames.parameterName;
                Name identifier = Name.identifier("name");
                String asString = name.asString();
                Intrinsics.checkNotNullExpressionValue(asString, "name.asString()");
                kotlinType2 = TypeUtilsKt.replaceAnnotations(kotlinType2, Annotations.Companion.create(CollectionsKt.plus(kotlinType2.getAnnotations(), new BuiltInAnnotationDescriptor(builtIns, fqName, MapsKt.mapOf(TuplesKt.to(identifier, new StringValue(asString)))))));
            }
            arrayList.add(TypeUtilsKt.asTypeProjection(kotlinType2));
            i11 = i12;
        }
        arrayList.add(TypeUtilsKt.asTypeProjection(returnType));
        return arrayList;
    }

    public static final FunctionClassKind getFunctionalClassKind(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return getFunctionalClassKind(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }

    public static final KotlinType getReceiverTypeFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        if (!isTypeAnnotatedWithExtensionFunctionType(kotlinType)) {
            return null;
        }
        return kotlinType.getArguments().get(contextFunctionTypeParamsCount(kotlinType)).getType();
    }

    public static final KotlinType getReturnTypeFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        KotlinType type = ((TypeProjection) CollectionsKt.last((List) kotlinType.getArguments())).getType();
        Intrinsics.checkNotNullExpressionValue(type, "arguments.last().type");
        return type;
    }

    public static final List<TypeProjection> getValueParameterTypesFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        return kotlinType.getArguments().subList((isBuiltinExtensionFunctionalType(kotlinType) ? 1 : 0) + contextFunctionTypeParamsCount(kotlinType), r0.size() - 1);
    }

    public static final boolean isBuiltinExtensionFunctionalType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        if (isBuiltinFunctionalType(kotlinType) && isTypeAnnotatedWithExtensionFunctionType(kotlinType)) {
            return true;
        }
        return false;
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        FunctionClassKind functionalClassKind = getFunctionalClassKind(declarationDescriptor);
        if (functionalClassKind != FunctionClassKind.Function && functionalClassKind != FunctionClassKind.SuspendFunction) {
            return false;
        }
        return true;
    }

    public static final boolean isBuiltinFunctionalType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor mo1423getDeclarationDescriptor = kotlinType.getConstructor().mo1423getDeclarationDescriptor();
        if (mo1423getDeclarationDescriptor == null || !isBuiltinFunctionalClassDescriptor(mo1423getDeclarationDescriptor)) {
            return false;
        }
        return true;
    }

    public static final boolean isFunctionType(KotlinType kotlinType) {
        FunctionClassKind functionClassKind;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor mo1423getDeclarationDescriptor = kotlinType.getConstructor().mo1423getDeclarationDescriptor();
        if (mo1423getDeclarationDescriptor != null) {
            functionClassKind = getFunctionalClassKind(mo1423getDeclarationDescriptor);
        } else {
            functionClassKind = null;
        }
        if (functionClassKind == FunctionClassKind.Function) {
            return true;
        }
        return false;
    }

    public static final boolean isSuspendFunctionType(KotlinType kotlinType) {
        FunctionClassKind functionClassKind;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor mo1423getDeclarationDescriptor = kotlinType.getConstructor().mo1423getDeclarationDescriptor();
        if (mo1423getDeclarationDescriptor != null) {
            functionClassKind = getFunctionalClassKind(mo1423getDeclarationDescriptor);
        } else {
            functionClassKind = null;
        }
        if (functionClassKind == FunctionClassKind.SuspendFunction) {
            return true;
        }
        return false;
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(KotlinType kotlinType) {
        return kotlinType.getAnnotations().mo1418findAnnotation(StandardNames.FqNames.extensionFunctionType) != null;
    }

    public static final Annotations withContextReceiversFunctionAnnotation(Annotations annotations, KotlinBuiltIns builtIns, int i10) {
        Intrinsics.checkNotNullParameter(annotations, "<this>");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        FqName fqName = StandardNames.FqNames.contextFunctionTypeParams;
        if (!annotations.hasAnnotation(fqName)) {
            return Annotations.Companion.create(CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName, MapsKt.mapOf(TuplesKt.to(StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, new IntValue(i10))))));
        }
        return annotations;
    }

    public static final Annotations withExtensionFunctionAnnotation(Annotations annotations, KotlinBuiltIns builtIns) {
        Intrinsics.checkNotNullParameter(annotations, "<this>");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        FqName fqName = StandardNames.FqNames.extensionFunctionType;
        if (!annotations.hasAnnotation(fqName)) {
            return Annotations.Companion.create(CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName, MapsKt.emptyMap())));
        }
        return annotations;
    }

    private static final FunctionClassKind getFunctionalClassKind(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        FunctionClassKind.Companion companion = FunctionClassKind.Companion;
        String asString = fqNameUnsafe.shortName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "shortName().asString()");
        FqName parent = fqNameUnsafe.toSafe().parent();
        Intrinsics.checkNotNullExpressionValue(parent, "toSafe().parent()");
        return companion.getFunctionalClassKind(asString, parent);
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension({"SMAP\ntypeParameterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n+ 2 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n15#2,2:101\n1549#3:103\n1620#3,3:104\n*S KotlinDebug\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n*L\n37#1:101,2\n42#1:103\n42#1:104,3\n*E\n"})
/* loaded from: classes4.dex */
public final class TypeParameterUtilsKt {
    public static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor mo1423getDeclarationDescriptor = kotlinType.getConstructor().mo1423getDeclarationDescriptor();
        return buildPossiblyInnerType(kotlinType, mo1423getDeclarationDescriptor instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) mo1423getDeclarationDescriptor : null, 0);
    }

    private static final CapturedTypeParameterDescriptor capturedCopyForInnerDeclaration(TypeParameterDescriptor typeParameterDescriptor, DeclarationDescriptor declarationDescriptor, int i10) {
        return new CapturedTypeParameterDescriptor(typeParameterDescriptor, declarationDescriptor, i10);
    }

    public static final List<TypeParameterDescriptor> computeConstructorTypeParameters(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> list;
        DeclarationDescriptor declarationDescriptor;
        int collectionSizeOrDefault;
        TypeConstructor typeConstructor;
        Intrinsics.checkNotNullParameter(classifierDescriptorWithTypeParameters, "<this>");
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "declaredTypeParameters");
        if (!classifierDescriptorWithTypeParameters.isInner() && !(classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof CallableDescriptor)) {
            return declaredTypeParameters;
        }
        List list2 = SequencesKt.toList(SequencesKt.flatMap(SequencesKt.filter(SequencesKt.takeWhile(DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters), new Function1<DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(DeclarationDescriptor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it instanceof CallableDescriptor);
            }
        }), new Function1<DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(DeclarationDescriptor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!(it instanceof ConstructorDescriptor));
            }
        }), new Function1<DeclarationDescriptor, Sequence<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3
            @Override // kotlin.jvm.functions.Function1
            public final Sequence<TypeParameterDescriptor> invoke(DeclarationDescriptor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) it).getTypeParameters();
                Intrinsics.checkNotNullExpressionValue(typeParameters, "it as CallableDescriptor).typeParameters");
                return CollectionsKt.asSequence(typeParameters);
            }
        }));
        Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters).iterator();
        while (true) {
            list = null;
            if (it.hasNext()) {
                declarationDescriptor = it.next();
                if (declarationDescriptor instanceof ClassDescriptor) {
                    break;
                }
            } else {
                declarationDescriptor = null;
                break;
            }
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        if (classDescriptor != null && (typeConstructor = classDescriptor.getTypeConstructor()) != null) {
            list = typeConstructor.getParameters();
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list2.isEmpty() && list.isEmpty()) {
            List<TypeParameterDescriptor> declaredTypeParameters2 = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
            Intrinsics.checkNotNullExpressionValue(declaredTypeParameters2, "declaredTypeParameters");
            return declaredTypeParameters2;
        }
        List<TypeParameterDescriptor> plus = CollectionsKt.plus((Collection) list2, (Iterable) list);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (TypeParameterDescriptor it2 : plus) {
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            arrayList.add(capturedCopyForInnerDeclaration(it2, classifierDescriptorWithTypeParameters, declaredTypeParameters.size()));
        }
        return CollectionsKt.plus((Collection) declaredTypeParameters, (Iterable) arrayList);
    }

    private static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i10) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.isError(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i10;
        if (!classifierDescriptorWithTypeParameters.isInner()) {
            if (size != kotlinType.getArguments().size()) {
                DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters);
            }
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i10, kotlinType.getArguments().size()), null);
        }
        List<TypeProjection> subList = kotlinType.getArguments().subList(i10, size);
        DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, subList, buildPossiblyInnerType(kotlinType, containingDeclaration instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) containingDeclaration : null, size));
    }
}

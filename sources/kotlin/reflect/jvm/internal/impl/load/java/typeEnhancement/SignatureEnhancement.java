package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1549#2:283\n1620#2,3:284\n1549#2:287\n1620#2,3:288\n1549#2:292\n1620#2,3:293\n1747#2,3:296\n1747#2,3:299\n1559#2:302\n1590#2,4:303\n1549#2:307\n1620#2,3:308\n1549#2:311\n1620#2,3:312\n1#3:291\n*S KotlinDebug\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n*L\n55#1:283\n55#1:284,3\n66#1:287\n66#1:288,3\n117#1:292\n117#1:293,3\n138#1:296,3\n144#1:299,3\n150#1:302\n150#1:303,4\n164#1:307\n164#1:308,3\n214#1:311\n214#1:312,3\n*E\n"})
/* loaded from: classes4.dex */
public final class SignatureEnhancement {
    private final JavaTypeEnhancement typeEnhancement;

    public SignatureEnhancement(JavaTypeEnhancement typeEnhancement) {
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.typeEnhancement = typeEnhancement;
    }

    private final boolean containsFunctionN(KotlinType kotlinType) {
        return TypeUtils.contains(kotlinType, new Function1<UnwrappedType, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$containsFunctionN$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(UnwrappedType unwrappedType) {
                ClassifierDescriptor mo1423getDeclarationDescriptor = unwrappedType.getConstructor().mo1423getDeclarationDescriptor();
                if (mo1423getDeclarationDescriptor == null) {
                    return Boolean.FALSE;
                }
                Name name = mo1423getDeclarationDescriptor.getName();
                JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
                return Boolean.valueOf(Intrinsics.areEqual(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(mo1423getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME()));
            }
        });
    }

    private final KotlinType enhance(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z10, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z11, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        int collectionSizeOrDefault;
        SignatureParts signatureParts = new SignatureParts(annotated, z10, lazyJavaResolverContext, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType invoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "overriddenDescriptors");
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (CallableMemberDescriptor it : collection) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(function1.invoke(it));
        }
        return enhance(signatureParts, invoke, arrayList, typeEnhancementInfo, z11);
    }

    public static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z10, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z11, Function1 function1, int i10, Object obj) {
        return signatureEnhancement.enhance(callableMemberDescriptor, annotated, z10, lazyJavaResolverContext, annotationQualifierApplicabilityType, typeEnhancementInfo, (i10 & 32) != 0 ? false : z11, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D enhanceSignature(D r21, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r22) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    private final KotlinType enhanceValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, TypeEnhancementInfo typeEnhancementInfo, boolean z10, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContext2;
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers;
        if (valueParameterDescriptor != null && (copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) != null) {
            lazyJavaResolverContext2 = copyWithNewDefaultTypeQualifiers;
        } else {
            lazyJavaResolverContext2 = lazyJavaResolverContext;
        }
        return enhance(callableMemberDescriptor, valueParameterDescriptor, false, lazyJavaResolverContext2, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo, z10, function1);
    }

    private final <D extends CallableMemberDescriptor> Annotations getDefaultAnnotations(D d10, LazyJavaResolverContext lazyJavaResolverContext) {
        LazyJavaClassDescriptor lazyJavaClassDescriptor;
        boolean z10;
        int collectionSizeOrDefault;
        ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(d10);
        if (topLevelContainingClassifier == null) {
            return d10.getAnnotations();
        }
        List<JavaAnnotation> list = null;
        if (topLevelContainingClassifier instanceof LazyJavaClassDescriptor) {
            lazyJavaClassDescriptor = (LazyJavaClassDescriptor) topLevelContainingClassifier;
        } else {
            lazyJavaClassDescriptor = null;
        }
        if (lazyJavaClassDescriptor != null) {
            list = lazyJavaClassDescriptor.getModuleAnnotations();
        }
        List<JavaAnnotation> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return d10.getAnnotations();
        }
        List<JavaAnnotation> list3 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (JavaAnnotation) it.next(), true));
        }
        return Annotations.Companion.create(CollectionsKt.plus((Iterable) d10.getAnnotations(), (Iterable) arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(LazyJavaResolverContext c10, Collection<? extends D> platformSignatures) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        Collection<? extends D> collection = platformSignatures;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature((CallableMemberDescriptor) it.next(), c10));
        }
        return arrayList;
    }

    public final KotlinType enhanceSuperType(KotlinType type, LazyJavaResolverContext context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        KotlinType enhance$default = enhance$default(this, new SignatureParts(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true), type, CollectionsKt.emptyList(), null, false, 12, null);
        if (enhance$default != null) {
            return enhance$default;
        }
        return type;
    }

    public final List<KotlinType> enhanceTypeParameterBounds(TypeParameterDescriptor typeParameter, List<? extends KotlinType> bounds, LazyJavaResolverContext context) {
        int collectionSizeOrDefault;
        KotlinType enhance$default;
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        List<? extends KotlinType> list = bounds;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (KotlinType kotlinType : list) {
            if (!TypeUtilsKt.contains(kotlinType, new Function1<UnwrappedType, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceTypeParameterBounds$1$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(UnwrappedType it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it instanceof RawType);
                }
            }) && (enhance$default = enhance$default(this, new SignatureParts(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), kotlinType, CollectionsKt.emptyList(), null, false, 12, null)) != null) {
                kotlinType = enhance$default;
            }
            arrayList.add(kotlinType);
        }
        return arrayList;
    }

    public static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, SignatureParts signatureParts, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            typeEnhancementInfo = null;
        }
        TypeEnhancementInfo typeEnhancementInfo2 = typeEnhancementInfo;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return signatureEnhancement.enhance(signatureParts, kotlinType, list, typeEnhancementInfo2, z10);
    }

    private final KotlinType enhance(SignatureParts signatureParts, KotlinType kotlinType, List<? extends KotlinType> list, TypeEnhancementInfo typeEnhancementInfo, boolean z10) {
        return this.typeEnhancement.enhance(kotlinType, signatureParts.computeIndexedQualifiers(kotlinType, list, typeEnhancementInfo, z10), signatureParts.getSkipRawTypeArguments());
    }
}

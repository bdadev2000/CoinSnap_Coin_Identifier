package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

@SourceDebugExtension({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1446#2,5:891\n1747#2,2:897\n1747#2,3:899\n1749#2:902\n1603#2,9:903\n1855#2:912\n1856#2:914\n1612#2:915\n1747#2,3:916\n1549#2:919\n1620#2,3:920\n819#2:923\n847#2,2:924\n766#2:926\n857#2,2:927\n1747#2,3:929\n1747#2,3:932\n2624#2,3:935\n766#2:938\n857#2,2:939\n766#2:941\n857#2,2:942\n1549#2:944\n1620#2,3:945\n2624#2,3:948\n288#2,2:951\n1549#2:953\n1620#2,3:954\n1446#2,5:957\n2624#2,3:962\n1360#2:965\n1446#2,2:966\n1549#2:968\n1620#2,3:969\n1448#2,3:972\n1549#2:975\n1620#2,3:976\n3190#2,10:979\n1446#2,5:989\n1#3:896\n1#3:913\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n*L\n74#1:891,5\n160#1:897,2\n161#1:899,3\n160#1:902\n189#1:903,9\n189#1:912\n189#1:914\n189#1:915\n193#1:916,3\n199#1:919\n199#1:920,3\n202#1:923\n202#1:924,2\n211#1:926\n211#1:927,2\n216#1:929,3\n222#1:932,3\n322#1:935,3\n327#1:938\n327#1:939,2\n354#1:941\n354#1:942,2\n376#1:944\n376#1:945,3\n461#1:948,3\n470#1:951,2\n476#1:953\n476#1:954,3\n489#1:957,5\n495#1:962,3\n649#1:965\n649#1:966,2\n650#1:968\n650#1:969,3\n649#1:972,3\n698#1:975\n698#1:976,3\n749#1:979,10\n879#1:989,5\n189#1:913\n*E\n"})
/* loaded from: classes4.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {
    private final NotNullLazyValue<List<ClassConstructorDescriptor>> constructors;
    private final NotNullLazyValue<Map<Name, JavaField>> enumEntryIndex;
    private final NotNullLazyValue<Set<Name>> generatedNestedClassNames;
    private final JavaClass jClass;
    private final NotNullLazyValue<Set<Name>> nestedClassIndex;
    private final MemoizedFunctionToNullable<Name, ClassDescriptor> nestedClasses;
    private final ClassDescriptor ownerDescriptor;
    private final boolean skipRefinement;

    public /* synthetic */ LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z10, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z10, (i10 & 16) != 0 ? null : lazyJavaClassMemberScope);
    }

    private final void addAnnotationValueParameter(List<ValueParameterDescriptor> list, ConstructorDescriptor constructorDescriptor, int i10, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinType kotlinType3;
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = javaMethod.getName();
        KotlinType makeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        Intrinsics.checkNotNullExpressionValue(makeNotNullable, "makeNotNullable(returnType)");
        boolean hasAnnotationParameterDefaultValue = javaMethod.getHasAnnotationParameterDefaultValue();
        if (kotlinType2 != null) {
            kotlinType3 = TypeUtils.makeNotNullable(kotlinType2);
        } else {
            kotlinType3 = null;
        }
        list.add(new ValueParameterDescriptorImpl(constructorDescriptor, null, i10, empty, name, makeNotNullable, hasAnnotationParameterDefaultValue, false, false, kotlinType3, getC().getComponents().getSourceElementFactory().source(javaMethod)));
    }

    private final void addFunctionFromSupertypes(Collection<SimpleFunctionDescriptor> collection, Name name, Collection<? extends SimpleFunctionDescriptor> collection2, boolean z10) {
        int collectionSizeOrDefault;
        Collection<? extends SimpleFunctionDescriptor> resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, collection2, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(resolveOverridesForNonStaticMembers, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z10) {
            collection.addAll(resolveOverridesForNonStaticMembers);
            return;
        }
        Collection<? extends SimpleFunctionDescriptor> collection3 = resolveOverridesForNonStaticMembers;
        List plus = CollectionsKt.plus((Collection) collection, (Iterable) collection3);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection3, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (SimpleFunctionDescriptor resolvedOverride : collection3) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenSpecialBuiltin(resolvedOverride);
            if (simpleFunctionDescriptor == null) {
                Intrinsics.checkNotNullExpressionValue(resolvedOverride, "resolvedOverride");
            } else {
                Intrinsics.checkNotNullExpressionValue(resolvedOverride, "resolvedOverride");
                resolvedOverride = createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(resolvedOverride, simpleFunctionDescriptor, plus);
            }
            arrayList.add(resolvedOverride);
        }
        collection.addAll(arrayList);
    }

    private final void addOverriddenSpecialMethods(Name name, Collection<? extends SimpleFunctionDescriptor> collection, Collection<? extends SimpleFunctionDescriptor> collection2, Collection<SimpleFunctionDescriptor> collection3, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, obtainOverrideForBuiltinWithDifferentJvmName(simpleFunctionDescriptor, function1, name, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, obtainOverrideForBuiltInWithErasedValueParametersInJava(simpleFunctionDescriptor, function1, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, obtainOverrideForSuspend(simpleFunctionDescriptor, function1));
        }
    }

    private final void addPropertyOverrideByMethod(Set<? extends PropertyDescriptor> set, Collection<PropertyDescriptor> collection, Set<PropertyDescriptor> set2, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (PropertyDescriptor propertyDescriptor : set) {
            JavaPropertyDescriptor createPropertyDescriptorByMethods = createPropertyDescriptorByMethods(propertyDescriptor, function1);
            if (createPropertyDescriptorByMethods != null) {
                collection.add(createPropertyDescriptorByMethods);
                if (set2 != null) {
                    set2.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    private final void computeAnnotationProperties(Name name, Collection<PropertyDescriptor> collection) {
        JavaMethod javaMethod = (JavaMethod) CollectionsKt.singleOrNull(getDeclaredMemberIndex().invoke().findMethodsByName(name));
        if (javaMethod == null) {
            return;
        }
        collection.add(createPropertyDescriptorWithDefaultGetter$default(this, javaMethod, null, Modality.FINAL, 2, null));
    }

    private final Collection<KotlinType> computeSupertypes() {
        if (this.skipRefinement) {
            Collection<KotlinType> mo1424getSupertypes = getOwnerDescriptor().getTypeConstructor().mo1424getSupertypes();
            Intrinsics.checkNotNullExpressionValue(mo1424getSupertypes, "ownerDescriptor.typeConstructor.supertypes");
            return mo1424getSupertypes;
        }
        return getC().getComponents().getKotlinTypeChecker().getKotlinTypeRefiner().refineSupertypes(getOwnerDescriptor());
    }

    private final List<ValueParameterDescriptor> createAnnotationConstructorParameters(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        Pair pair;
        Collection<JavaMethod> methods = this.jClass.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : methods) {
            if (Intrinsics.areEqual(((JavaMethod) obj).getName(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.component1();
        List<JavaMethod> list2 = (List) pair2.component2();
        list.size();
        JavaMethod javaMethod = (JavaMethod) CollectionsKt.firstOrNull(list);
        int i10 = 1;
        if (javaMethod != null) {
            JavaType returnType = javaMethod.getReturnType();
            if (returnType instanceof JavaArrayType) {
                JavaArrayType javaArrayType = (JavaArrayType) returnType;
                pair = new Pair(getC().getTypeResolver().transformArrayType(javaArrayType, attributes$default, true), getC().getTypeResolver().transformJavaType(javaArrayType.getComponentType(), attributes$default));
            } else {
                pair = new Pair(getC().getTypeResolver().transformJavaType(returnType, attributes$default), null);
            }
            addAnnotationValueParameter(arrayList, classConstructorDescriptorImpl, 0, javaMethod, (KotlinType) pair.component1(), (KotlinType) pair.component2());
        }
        int i11 = 0;
        if (javaMethod == null) {
            i10 = 0;
        }
        for (JavaMethod javaMethod2 : list2) {
            addAnnotationValueParameter(arrayList, classConstructorDescriptorImpl, i11 + i10, javaMethod2, getC().getTypeResolver().transformJavaType(javaMethod2.getReturnType(), attributes$default), null);
            i11++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassConstructorDescriptor createDefaultConstructor() {
        List<ValueParameterDescriptor> emptyList;
        boolean isAnnotationType = this.jClass.isAnnotationType();
        if ((this.jClass.isInterface() || !this.jClass.hasDefaultConstructor()) && !isAnnotationType) {
            return null;
        }
        ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        JavaClassConstructorDescriptor createJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, Annotations.Companion.getEMPTY(), true, getC().getComponents().getSourceElementFactory().source(this.jClass));
        Intrinsics.checkNotNullExpressionValue(createJavaConstructor, "createJavaConstructor(\n ….source(jClass)\n        )");
        if (isAnnotationType) {
            emptyList = createAnnotationConstructorParameters(createJavaConstructor);
        } else {
            emptyList = Collections.emptyList();
        }
        createJavaConstructor.setHasSynthesizedParameterNames(false);
        createJavaConstructor.initialize(emptyList, getConstructorVisibility(ownerDescriptor));
        createJavaConstructor.setHasStableParameterNames(true);
        createJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        getC().getComponents().getJavaResolverCache().recordConstructor(this.jClass, createJavaConstructor);
        return createJavaConstructor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassConstructorDescriptor createDefaultRecordConstructor() {
        ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        JavaClassConstructorDescriptor createJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, Annotations.Companion.getEMPTY(), true, getC().getComponents().getSourceElementFactory().source(this.jClass));
        Intrinsics.checkNotNullExpressionValue(createJavaConstructor, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<ValueParameterDescriptor> createRecordConstructorParameters = createRecordConstructorParameters(createJavaConstructor);
        createJavaConstructor.setHasSynthesizedParameterNames(false);
        createJavaConstructor.initialize(createRecordConstructorParameters, getConstructorVisibility(ownerDescriptor));
        createJavaConstructor.setHasStableParameterNames(false);
        createJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        return createJavaConstructor;
    }

    private final SimpleFunctionDescriptor createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(SimpleFunctionDescriptor simpleFunctionDescriptor, CallableDescriptor callableDescriptor, Collection<? extends SimpleFunctionDescriptor> collection) {
        boolean z10;
        Collection<? extends SimpleFunctionDescriptor> collection2 = collection;
        boolean z11 = true;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
                if (!Intrinsics.areEqual(simpleFunctionDescriptor, simpleFunctionDescriptor2) && simpleFunctionDescriptor2.getInitialSignatureDescriptor() == null && doesOverride(simpleFunctionDescriptor2, callableDescriptor)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = false;
                    break;
                }
            }
        }
        if (!z11) {
            SimpleFunctionDescriptor build = simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
            Intrinsics.checkNotNull(build);
            return build;
        }
        return simpleFunctionDescriptor;
    }

    private final SimpleFunctionDescriptor createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(FunctionDescriptor functionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        Object obj;
        int collectionSizeOrDefault;
        Name name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "overridden.name");
        Iterator<T> it = function1.invoke(name).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (hasSameJvmDescriptorButDoesNotOverride((SimpleFunctionDescriptor) obj, functionDescriptor)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "overridden.valueParameters");
        List<ValueParameterDescriptor> list = valueParameters;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it2.next()).getType());
        }
        List<ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters2, "override.valueParameters");
        newCopyBuilder.setValueParameters(UtilKt.copyValueParameters(arrayList, valueParameters2, functionDescriptor));
        newCopyBuilder.setSignatureChange();
        newCopyBuilder.setPreserveSourceElement();
        newCopyBuilder.putUserData(JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS, Boolean.TRUE);
        return newCopyBuilder.build();
    }

    private final JavaPropertyDescriptor createPropertyDescriptorByMethods(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = null;
        if (!doesClassOverridesProperty(propertyDescriptor, function1)) {
            return null;
        }
        SimpleFunctionDescriptor findGetterOverride = findGetterOverride(propertyDescriptor, function1);
        Intrinsics.checkNotNull(findGetterOverride);
        if (propertyDescriptor.isVar()) {
            simpleFunctionDescriptor = findSetterOverride(propertyDescriptor, function1);
            Intrinsics.checkNotNull(simpleFunctionDescriptor);
        } else {
            simpleFunctionDescriptor = null;
        }
        if (simpleFunctionDescriptor != null) {
            simpleFunctionDescriptor.getModality();
            findGetterOverride.getModality();
        }
        JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = new JavaForKotlinOverridePropertyDescriptor(getOwnerDescriptor(), findGetterOverride, simpleFunctionDescriptor, propertyDescriptor);
        KotlinType returnType = findGetterOverride.getReturnType();
        Intrinsics.checkNotNull(returnType);
        javaForKotlinOverridePropertyDescriptor.setType(returnType, CollectionsKt.emptyList(), getDispatchReceiverParameter(), null, CollectionsKt.emptyList());
        PropertyGetterDescriptorImpl createGetter = DescriptorFactory.createGetter(javaForKotlinOverridePropertyDescriptor, findGetterOverride.getAnnotations(), false, false, false, findGetterOverride.getSource());
        createGetter.setInitialSignatureDescriptor(findGetterOverride);
        createGetter.initialize(javaForKotlinOverridePropertyDescriptor.getType());
        Intrinsics.checkNotNullExpressionValue(createGetter, "createGetter(\n          …escriptor.type)\n        }");
        if (simpleFunctionDescriptor != null) {
            List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "setterMethod.valueParameters");
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.firstOrNull((List) valueParameters);
            if (valueParameterDescriptor != null) {
                propertySetterDescriptorImpl = DescriptorFactory.createSetter(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptor.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor.getSource());
                propertySetterDescriptorImpl.setInitialSignatureDescriptor(simpleFunctionDescriptor);
            } else {
                throw new AssertionError("No parameter found for " + simpleFunctionDescriptor);
            }
        }
        javaForKotlinOverridePropertyDescriptor.initialize(createGetter, propertySetterDescriptorImpl);
        return javaForKotlinOverridePropertyDescriptor;
    }

    private final JavaPropertyDescriptor createPropertyDescriptorWithDefaultGetter(JavaMethod javaMethod, KotlinType kotlinType, Modality modality) {
        KotlinType kotlinType2;
        JavaPropertyDescriptor create = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaMethod), modality, UtilsKt.toDescriptorVisibility(javaMethod.getVisibility()), false, javaMethod.getName(), getC().getComponents().getSourceElementFactory().source(javaMethod), false);
        Intrinsics.checkNotNullExpressionValue(create, "create(\n            owne…inal = */ false\n        )");
        PropertyGetterDescriptorImpl createDefaultGetter = DescriptorFactory.createDefaultGetter(create, Annotations.Companion.getEMPTY());
        Intrinsics.checkNotNullExpressionValue(createDefaultGetter, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        create.initialize(createDefaultGetter, null);
        if (kotlinType == null) {
            kotlinType2 = computeMethodReturnType(javaMethod, ContextKt.childForMethod$default(getC(), create, javaMethod, 0, 4, null));
        } else {
            kotlinType2 = kotlinType;
        }
        create.setType(kotlinType2, CollectionsKt.emptyList(), getDispatchReceiverParameter(), null, CollectionsKt.emptyList());
        createDefaultGetter.initialize(kotlinType2);
        return create;
    }

    public static /* synthetic */ JavaPropertyDescriptor createPropertyDescriptorWithDefaultGetter$default(LazyJavaClassMemberScope lazyJavaClassMemberScope, JavaMethod javaMethod, KotlinType kotlinType, Modality modality, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kotlinType = null;
        }
        return lazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter(javaMethod, kotlinType, modality);
    }

    private final List<ValueParameterDescriptor> createRecordConstructorParameters(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        KotlinType kotlinType;
        Collection<JavaRecordComponent> recordComponents = this.jClass.getRecordComponents();
        ArrayList arrayList = new ArrayList(recordComponents.size());
        JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null);
        Iterator<JavaRecordComponent> it = recordComponents.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (it.hasNext()) {
                i10 = i11 + 1;
                JavaRecordComponent next = it.next();
                KotlinType transformJavaType = getC().getTypeResolver().transformJavaType(next.getType(), attributes$default);
                if (next.isVararg()) {
                    kotlinType = getC().getComponents().getModule().getBuiltIns().getArrayElementType(transformJavaType);
                } else {
                    kotlinType = null;
                }
                arrayList.add(new ValueParameterDescriptorImpl(classConstructorDescriptorImpl, null, i11, Annotations.Companion.getEMPTY(), next.getName(), transformJavaType, false, false, false, kotlinType, getC().getComponents().getSourceElementFactory().source(next)));
            } else {
                return arrayList;
            }
        }
    }

    private final SimpleFunctionDescriptor createRenamedCopy(SimpleFunctionDescriptor simpleFunctionDescriptor, Name name) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        newCopyBuilder.setName(name);
        newCopyBuilder.setSignatureChange();
        newCopyBuilder.setPreserveSourceElement();
        SimpleFunctionDescriptor build = newCopyBuilder.build();
        Intrinsics.checkNotNull(build);
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createSuspendView(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.getValueParameters()
            java.lang.String r1 = "valueParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.lastOrNull(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r0
            r2 = 0
            if (r0 == 0) goto L7e
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r3 = r3.getConstructor()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r3 = r3.mo1423getDeclarationDescriptor()
            if (r3 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.isSafe()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = r3.toSafe()
            goto L36
        L35:
            r3 = r2
        L36:
            kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.CONTINUATION_INTERFACE_FQ_NAME
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7e
        L43:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r2 = r6.newCopyBuilder()
            java.util.List r6 = r6.getValueParameters()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            java.util.List r6 = kotlin.collections.CollectionsKt.g(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r6 = r2.setValueParameters(r6)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            java.util.List r0 = r0.getArguments()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r0 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r0
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r6 = r6.setReturnType(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6 = r6.build()
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r6
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl) r0
            if (r0 != 0) goto L79
            goto L7d
        L79:
            r1 = 1
            r0.setSuspend(r1)
        L7d:
            return r6
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.createSuspendView(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor):kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor");
    }

    private final boolean doesClassOverridesProperty(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor findGetterOverride = findGetterOverride(propertyDescriptor, function1);
        SimpleFunctionDescriptor findSetterOverride = findSetterOverride(propertyDescriptor, function1);
        if (findGetterOverride == null) {
            return false;
        }
        if (!propertyDescriptor.isVar()) {
            return true;
        }
        if (findSetterOverride == null || findSetterOverride.getModality() != findGetterOverride.getModality()) {
            return false;
        }
        return true;
    }

    private final boolean doesOverride(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor2, callableDescriptor, true).getResult();
        Intrinsics.checkNotNullExpressionValue(result, "DEFAULT.isOverridableByW…iptor, this, true).result");
        if (result == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor2, callableDescriptor)) {
            return true;
        }
        return false;
    }

    private final boolean doesOverrideRenamedBuiltins(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        Name builtinFunctionNamesByJvmName = companion.getBuiltinFunctionNamesByJvmName(name);
        if (builtinFunctionNamesByJvmName == null) {
            return false;
        }
        Set<SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(builtinFunctionNamesByJvmName);
        ArrayList arrayList = new ArrayList();
        for (Object obj : functionsFromSupertypes) {
            if (SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName((SimpleFunctionDescriptor) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        SimpleFunctionDescriptor createRenamedCopy = createRenamedCopy(simpleFunctionDescriptor, builtinFunctionNamesByJvmName);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (doesOverrideRenamedDescriptor((SimpleFunctionDescriptor) it.next(), createRenamedCopy)) {
                return true;
            }
        }
        return false;
    }

    private final boolean doesOverrideRenamedDescriptor(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        if (BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.getOriginal();
        }
        Intrinsics.checkNotNullExpressionValue(functionDescriptor, "if (superDescriptor.isRe…iginal else subDescriptor");
        return doesOverride(functionDescriptor, simpleFunctionDescriptor);
    }

    private final boolean doesOverrideSuspendFunction(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        boolean z10;
        SimpleFunctionDescriptor createSuspendView = createSuspendView(simpleFunctionDescriptor);
        if (createSuspendView == null) {
            return false;
        }
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        Set<SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name);
        if ((functionsFromSupertypes instanceof Collection) && functionsFromSupertypes.isEmpty()) {
            return false;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : functionsFromSupertypes) {
            if (simpleFunctionDescriptor2.isSuspend() && doesOverride(createSuspendView, simpleFunctionDescriptor2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    private final SimpleFunctionDescriptor findGetterByName(PropertyDescriptor propertyDescriptor, String str, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        boolean isSubtypeOf;
        Name identifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(getterName)");
        Iterator<T> it = function1.invoke(identifier).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null) {
                    isSubtypeOf = false;
                } else {
                    isSubtypeOf = kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType());
                }
                if (isSubtypeOf) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final SimpleFunctionDescriptor findGetterOverride(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        PropertyGetterDescriptor propertyGetterDescriptor;
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        String str = null;
        if (getter != null) {
            propertyGetterDescriptor = (PropertyGetterDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter);
        } else {
            propertyGetterDescriptor = null;
        }
        if (propertyGetterDescriptor != null) {
            str = ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyGetterDescriptor);
        }
        if (str != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(getOwnerDescriptor(), propertyGetterDescriptor)) {
            return findGetterByName(propertyDescriptor, str, function1);
        }
        String asString = propertyDescriptor.getName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "name.asString()");
        return findGetterByName(propertyDescriptor, JvmAbi.getterName(asString), function1);
    }

    private final SimpleFunctionDescriptor findSetterOverride(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        String asString = propertyDescriptor.getName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "name.asString()");
        Name identifier = Name.identifier(JvmAbi.setterName(asString));
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator<T> it = function1.invoke(identifier).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.isUnit(returnType)) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor2.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "descriptor.valueParameters");
                if (kotlinTypeChecker.equalTypes(((ValueParameterDescriptor) CollectionsKt.single((List) valueParameters)).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final DescriptorVisibility getConstructorVisibility(ClassDescriptor classDescriptor) {
        DescriptorVisibility visibility = classDescriptor.getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "classDescriptor.visibility");
        if (Intrinsics.areEqual(visibility, JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
            DescriptorVisibility PROTECTED_AND_PACKAGE = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
            Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
            return PROTECTED_AND_PACKAGE;
        }
        return visibility;
    }

    private final Set<SimpleFunctionDescriptor> getFunctionsFromSupertypes(Name name) {
        Collection<KotlinType> computeSupertypes = computeSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = computeSupertypes.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set<PropertyDescriptor> getPropertiesFromSupertypes(Name name) {
        int collectionSizeOrDefault;
        Collection<KotlinType> computeSupertypes = computeSupertypes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = computeSupertypes.iterator();
        while (it.hasNext()) {
            Collection<? extends PropertyDescriptor> contributedVariables = ((KotlinType) it.next()).getMemberScope().getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(contributedVariables, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it2 = contributedVariables.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PropertyDescriptor) it2.next());
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        return CollectionsKt.toSet(arrayList);
    }

    private final boolean hasSameJvmDescriptorButDoesNotOverride(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 2, null);
        FunctionDescriptor original = functionDescriptor.getOriginal();
        Intrinsics.checkNotNullExpressionValue(original, "builtinWithErasedParameters.original");
        if (!Intrinsics.areEqual(computeJvmDescriptor$default, MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null)) || doesOverride(simpleFunctionDescriptor, functionDescriptor)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.isSetterName(r4) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[LOOP:1: B:32:0x0049->B:46:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isVisibleAsFunctionInCurrentClass(final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r7) {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.impl.name.Name r0 = r7.getName()
            java.lang.String r1 = "function.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L20
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L20
        L1e:
            r0 = r3
            goto L82
        L20:
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.name.Name r1 = (kotlin.reflect.jvm.internal.impl.name.Name) r1
            java.util.Set r1 = r6.getPropertiesFromSupertypes(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L45
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L45
        L43:
            r1 = r3
            goto L7f
        L45:
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) r4
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1 r5 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1
            r5.<init>()
            boolean r5 = r6.doesClassOverridesProperty(r4, r5)
            if (r5 == 0) goto L7b
            boolean r4 = r4.isVar()
            if (r4 != 0) goto L79
            kotlin.reflect.jvm.internal.impl.name.Name r4 = r7.getName()
            java.lang.String r4 = r4.asString()
            java.lang.String r5 = "function.name.asString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            boolean r4 = kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.isSetterName(r4)
            if (r4 != 0) goto L7b
        L79:
            r4 = r2
            goto L7c
        L7b:
            r4 = r3
        L7c:
            if (r4 == 0) goto L49
            r1 = r2
        L7f:
            if (r1 == 0) goto L24
            r0 = r2
        L82:
            if (r0 == 0) goto L85
            return r3
        L85:
            boolean r0 = r6.doesOverrideRenamedBuiltins(r7)
            if (r0 != 0) goto L98
            boolean r0 = r6.shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(r7)
            if (r0 != 0) goto L98
            boolean r7 = r6.doesOverrideSuspendFunction(r7)
            if (r7 != 0) goto L98
            goto L99
        L98:
            r2 = r3
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor):boolean");
    }

    private final SimpleFunctionDescriptor obtainOverrideForBuiltInWithErasedValueParametersInJava(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor createOverrideForBuiltinFunctionWithErasedParameterIfNeeded;
        FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor);
        if (overriddenBuiltinFunctionWithErasedValueParametersInJava == null || (createOverrideForBuiltinFunctionWithErasedParameterIfNeeded = createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(overriddenBuiltinFunctionWithErasedValueParametersInJava, function1)) == null) {
            return null;
        }
        if (!isVisibleAsFunctionInCurrentClass(createOverrideForBuiltinFunctionWithErasedParameterIfNeeded)) {
            createOverrideForBuiltinFunctionWithErasedParameterIfNeeded = null;
        }
        if (createOverrideForBuiltinFunctionWithErasedParameterIfNeeded == null) {
            return null;
        }
        return createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(createOverrideForBuiltinFunctionWithErasedParameterIfNeeded, overriddenBuiltinFunctionWithErasedValueParametersInJava, collection);
    }

    private final SimpleFunctionDescriptor obtainOverrideForBuiltinWithDifferentJvmName(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Name name, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(simpleFunctionDescriptor);
        if (simpleFunctionDescriptor2 == null) {
            return null;
        }
        String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(simpleFunctionDescriptor2);
        Intrinsics.checkNotNull(jvmMethodNameIfSpecial);
        Name identifier = Name.identifier(jvmMethodNameIfSpecial);
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(nameInJava)");
        Iterator<? extends SimpleFunctionDescriptor> it = function1.invoke(identifier).iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor createRenamedCopy = createRenamedCopy(it.next(), name);
            if (doesOverrideRenamedDescriptor(simpleFunctionDescriptor2, createRenamedCopy)) {
                return createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(createRenamedCopy, simpleFunctionDescriptor2, collection);
            }
        }
        return null;
    }

    private final SimpleFunctionDescriptor obtainOverrideForSuspend(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (!simpleFunctionDescriptor.isSuspend()) {
            return null;
        }
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "descriptor.name");
        Iterator<T> it = function1.invoke(name).iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor createSuspendView = createSuspendView((SimpleFunctionDescriptor) it.next());
            if (createSuspendView == null || !doesOverride(createSuspendView, simpleFunctionDescriptor)) {
                createSuspendView = null;
            }
            if (createSuspendView != null) {
                return createSuspendView;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JavaClassConstructorDescriptor resolveConstructor(JavaConstructor javaConstructor) {
        int collectionSizeOrDefault;
        ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        JavaClassConstructorDescriptor createJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaConstructor), false, getC().getComponents().getSourceElementFactory().source(javaConstructor));
        Intrinsics.checkNotNullExpressionValue(createJavaConstructor, "createJavaConstructor(\n …ce(constructor)\n        )");
        LazyJavaResolverContext childForMethod = ContextKt.childForMethod(getC(), createJavaConstructor, javaConstructor, ownerDescriptor.getDeclaredTypeParameters().size());
        LazyJavaScope.ResolvedValueParameters resolveValueParameters = resolveValueParameters(childForMethod, createJavaConstructor, javaConstructor.getValueParameters());
        List<TypeParameterDescriptor> declaredTypeParameters = ownerDescriptor.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "classDescriptor.declaredTypeParameters");
        List<TypeParameterDescriptor> list = declaredTypeParameters;
        List<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor resolveTypeParameter = childForMethod.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it.next());
            Intrinsics.checkNotNull(resolveTypeParameter);
            arrayList.add(resolveTypeParameter);
        }
        createJavaConstructor.initialize(resolveValueParameters.getDescriptors(), UtilsKt.toDescriptorVisibility(javaConstructor.getVisibility()), CollectionsKt.plus((Collection) list, (Iterable) arrayList));
        createJavaConstructor.setHasStableParameterNames(false);
        createJavaConstructor.setHasSynthesizedParameterNames(resolveValueParameters.getHasSynthesizedNames());
        createJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        childForMethod.getComponents().getJavaResolverCache().recordConstructor(javaConstructor, createJavaConstructor);
        return createJavaConstructor;
    }

    private final JavaMethodDescriptor resolveRecordComponentToFunctionDescriptor(JavaRecordComponent javaRecordComponent) {
        JavaMethodDescriptor createJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaRecordComponent), javaRecordComponent.getName(), getC().getComponents().getSourceElementFactory().source(javaRecordComponent), true);
        Intrinsics.checkNotNullExpressionValue(createJavaMethod, "createJavaMethod(\n      …omponent), true\n        )");
        createJavaMethod.initialize(null, getDispatchReceiverParameter(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), getC().getTypeResolver().transformJavaType(javaRecordComponent.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null)), Modality.Companion.convertFromFlags(false, false, true), DescriptorVisibilities.PUBLIC, null);
        createJavaMethod.setParameterNamesStatus(false, false);
        getC().getComponents().getJavaResolverCache().recordMethod(javaRecordComponent, createJavaMethod);
        return createJavaMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<SimpleFunctionDescriptor> searchMethodsByNameWithoutBuiltinMagic(Name name) {
        int collectionSizeOrDefault;
        Collection<JavaMethod> findMethodsByName = getDeclaredMemberIndex().invoke().findMethodsByName(name);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(findMethodsByName, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = findMethodsByName.iterator();
        while (it.hasNext()) {
            arrayList.add(resolveMethodToFunctionDescriptor((JavaMethod) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<SimpleFunctionDescriptor> searchMethodsInSupertypesWithoutBuiltinMagic(Name name) {
        boolean z10;
        Set<SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : functionsFromSupertypes) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (!SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(simpleFunctionDescriptor) && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor) == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return false;
        }
        Name name2 = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "name");
        Set<SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = functionsFromSupertypes.iterator();
        while (it.hasNext()) {
            FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((SimpleFunctionDescriptor) it.next());
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                arrayList.add(overriddenBuiltinFunctionWithErasedValueParametersInJava);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (hasSameJvmDescriptorButDoesNotOverride(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computeClassNames(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return SetsKt.plus((Set) this.nestedClassIndex.invoke(), (Iterable) this.enumEntryIndex.invoke().keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public /* bridge */ /* synthetic */ Set computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        return computeFunctionNames(descriptorKindFilter, (Function1<? super Name, Boolean>) function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeImplicitlyDeclaredFunctions(Collection<SimpleFunctionDescriptor> result, Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.jClass.isRecord() && getDeclaredMemberIndex().invoke().findRecordComponentByName(name) != null) {
            Collection<SimpleFunctionDescriptor> collection = result;
            boolean z10 = true;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((SimpleFunctionDescriptor) it.next()).getValueParameters().isEmpty()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10) {
                JavaRecordComponent findRecordComponentByName = getDeclaredMemberIndex().invoke().findRecordComponentByName(name);
                Intrinsics.checkNotNull(findRecordComponentByName);
                result.add(resolveRecordComponentToFunctionDescriptor(findRecordComponentByName));
            }
        }
        getC().getComponents().getSyntheticPartsProvider().generateMethods(getC(), getOwnerDescriptor(), name, result);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(Collection<SimpleFunctionDescriptor> result, Name name) {
        boolean z10;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        Set<SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name);
        if (!SpecialGenericSignatures.Companion.getSameAsRenamedInJvmBuiltin(name) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            Set<SimpleFunctionDescriptor> set = functionsFromSupertypes;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (((FunctionDescriptor) it.next()).isSuspend()) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : set) {
                    if (isVisibleAsFunctionInCurrentClass((SimpleFunctionDescriptor) obj)) {
                        arrayList.add(obj);
                    }
                }
                addFunctionFromSupertypes(result, name, arrayList, false);
                return;
            }
        }
        SmartSet create = SmartSet.Companion.create();
        Collection<? extends SimpleFunctionDescriptor> resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, functionsFromSupertypes, CollectionsKt.emptyList(), getOwnerDescriptor(), ErrorReporter.DO_NOTHING, getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(resolveOverridesForNonStaticMembers, "resolveOverridesForNonSt….overridingUtil\n        )");
        addOverriddenSpecialMethods(name, result, resolveOverridesForNonStaticMembers, result, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        addOverriddenSpecialMethods(name, result, resolveOverridesForNonStaticMembers, create, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : functionsFromSupertypes) {
            if (isVisibleAsFunctionInCurrentClass((SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        addFunctionFromSupertypes(result, name, CollectionsKt.plus((Collection) arrayList2, (Iterable) create), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredProperties(Name name, Collection<PropertyDescriptor> result) {
        Set<? extends PropertyDescriptor> minus;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.jClass.isAnnotationType()) {
            computeAnnotationProperties(name, result);
        }
        Set<PropertyDescriptor> propertiesFromSupertypes = getPropertiesFromSupertypes(name);
        if (propertiesFromSupertypes.isEmpty()) {
            return;
        }
        SmartSet.Companion companion = SmartSet.Companion;
        SmartSet create = companion.create();
        Collection<PropertyDescriptor> create2 = companion.create();
        addPropertyOverrideByMethod(propertiesFromSupertypes, result, create, new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Collection<SimpleFunctionDescriptor> invoke(Name it) {
                Collection<SimpleFunctionDescriptor> searchMethodsByNameWithoutBuiltinMagic;
                Intrinsics.checkNotNullParameter(it, "it");
                searchMethodsByNameWithoutBuiltinMagic = LazyJavaClassMemberScope.this.searchMethodsByNameWithoutBuiltinMagic(it);
                return searchMethodsByNameWithoutBuiltinMagic;
            }
        });
        minus = SetsKt___SetsKt.minus((Set) propertiesFromSupertypes, (Iterable) create);
        addPropertyOverrideByMethod(minus, create2, null, new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Collection<SimpleFunctionDescriptor> invoke(Name it) {
                Collection<SimpleFunctionDescriptor> searchMethodsInSupertypesWithoutBuiltinMagic;
                Intrinsics.checkNotNullParameter(it, "it");
                searchMethodsInSupertypesWithoutBuiltinMagic = LazyJavaClassMemberScope.this.searchMethodsInSupertypesWithoutBuiltinMagic(it);
                return searchMethodsInSupertypesWithoutBuiltinMagic;
            }
        });
        Collection<? extends PropertyDescriptor> resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, SetsKt.plus((Set) propertiesFromSupertypes, (Iterable) create2), result, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(resolveOverridesForNonStaticMembers, "resolveOverridesForNonSt…rridingUtil\n            )");
        result.addAll(resolveOverridesForNonStaticMembers);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computePropertyNames(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (this.jClass.isAnnotationType()) {
            return getFunctionNames();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(getDeclaredMemberIndex().invoke().getFieldNames());
        Collection<KotlinType> mo1424getSupertypes = getOwnerDescriptor().getTypeConstructor().mo1424getSupertypes();
        Intrinsics.checkNotNullExpressionValue(mo1424getSupertypes, "ownerDescriptor.typeConstructor.supertypes");
        Iterator<T> it = mo1424getSupertypes.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getVariableNames());
        }
        return linkedHashSet;
    }

    public final NotNullLazyValue<List<ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.constructors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo1425getContributedClassifier(Name name, LookupLocation location) {
        MemoizedFunctionToNullable<Name, ClassDescriptor> memoizedFunctionToNullable;
        ClassDescriptor invoke;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo1429recordLookup(name, location);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) getMainScope();
        if (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.nestedClasses) == null || (invoke = memoizedFunctionToNullable.invoke(name)) == null) {
            return this.nestedClasses.invoke(name);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo1429recordLookup(name, location);
        return super.getContributedFunctions(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo1429recordLookup(name, location);
        return super.getContributedVariables(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return DescriptorUtils.getDispatchReceiverParameterIfNeeded(getOwnerDescriptor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public boolean isVisibleAsFunction(JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor, "<this>");
        if (this.jClass.isAnnotationType()) {
            return false;
        }
        return isVisibleAsFunctionInCurrentClass(javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public void mo1429recordLookup(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(getC().getComponents().getLookupTracker(), location, getOwnerDescriptor(), name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public LazyJavaScope.MethodSignatureData resolveMethodSignature(JavaMethod method, List<? extends TypeParameterDescriptor> methodTypeParameters, KotlinType returnType, List<? extends ValueParameterDescriptor> valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        SignaturePropagator.PropagatedSignature resolvePropagatedSignature = getC().getComponents().getSignaturePropagator().resolvePropagatedSignature(method, getOwnerDescriptor(), returnType, null, valueParameters, methodTypeParameters);
        Intrinsics.checkNotNullExpressionValue(resolvePropagatedSignature, "c.components.signaturePr…dTypeParameters\n        )");
        KotlinType returnType2 = resolvePropagatedSignature.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType2, "propagated.returnType");
        KotlinType receiverType = resolvePropagatedSignature.getReceiverType();
        List<ValueParameterDescriptor> valueParameters2 = resolvePropagatedSignature.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters2, "propagated.valueParameters");
        List<TypeParameterDescriptor> typeParameters = resolvePropagatedSignature.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "propagated.typeParameters");
        boolean hasStableParameterNames = resolvePropagatedSignature.hasStableParameterNames();
        List<String> errors = resolvePropagatedSignature.getErrors();
        Intrinsics.checkNotNullExpressionValue(errors, "propagated.errors");
        return new LazyJavaScope.MethodSignatureData(returnType2, receiverType, valueParameters2, typeParameters, hasStableParameterNames, errors);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public String toString() {
        return "Lazy Java member scope for " + this.jClass.getFqName();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(final LazyJavaResolverContext c10, ClassDescriptor ownerDescriptor, JavaClass jClass, boolean z10, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(c10, lazyJavaClassMemberScope);
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.ownerDescriptor = ownerDescriptor;
        this.jClass = jClass;
        this.skipRefinement = z10;
        this.constructors = c10.getStorageManager().createLazyValue(new Function0<List<? extends ClassConstructorDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$constructors$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Collection] */
            @Override // kotlin.jvm.functions.Function0
            public final List<? extends ClassConstructorDescriptor> invoke() {
                JavaClass javaClass;
                JavaClass javaClass2;
                ClassConstructorDescriptor createDefaultConstructor;
                ClassConstructorDescriptor createDefaultRecordConstructor;
                JavaClass javaClass3;
                JavaClassConstructorDescriptor resolveConstructor;
                javaClass = LazyJavaClassMemberScope.this.jClass;
                Collection<JavaConstructor> constructors = javaClass.getConstructors();
                ArrayList arrayList = new ArrayList(constructors.size());
                Iterator<JavaConstructor> it = constructors.iterator();
                while (it.hasNext()) {
                    resolveConstructor = LazyJavaClassMemberScope.this.resolveConstructor(it.next());
                    arrayList.add(resolveConstructor);
                }
                javaClass2 = LazyJavaClassMemberScope.this.jClass;
                if (javaClass2.isRecord()) {
                    createDefaultRecordConstructor = LazyJavaClassMemberScope.this.createDefaultRecordConstructor();
                    boolean z11 = false;
                    String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(createDefaultRecordConstructor, false, false, 2, null);
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default((ClassConstructorDescriptor) it2.next(), false, false, 2, null), computeJvmDescriptor$default)) {
                                break;
                            }
                        }
                    }
                    z11 = true;
                    if (z11) {
                        arrayList.add(createDefaultRecordConstructor);
                        JavaResolverCache javaResolverCache = c10.getComponents().getJavaResolverCache();
                        javaClass3 = LazyJavaClassMemberScope.this.jClass;
                        javaResolverCache.recordConstructor(javaClass3, createDefaultRecordConstructor);
                    }
                }
                LazyJavaResolverContext lazyJavaResolverContext = c10;
                lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateConstructors(lazyJavaResolverContext, LazyJavaClassMemberScope.this.getOwnerDescriptor(), arrayList);
                SignatureEnhancement signatureEnhancement = c10.getComponents().getSignatureEnhancement();
                LazyJavaResolverContext lazyJavaResolverContext2 = c10;
                LazyJavaClassMemberScope lazyJavaClassMemberScope2 = LazyJavaClassMemberScope.this;
                boolean isEmpty = arrayList.isEmpty();
                ArrayList arrayList2 = arrayList;
                if (isEmpty) {
                    createDefaultConstructor = lazyJavaClassMemberScope2.createDefaultConstructor();
                    arrayList2 = CollectionsKt.listOfNotNull(createDefaultConstructor);
                }
                return CollectionsKt.toList(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext2, arrayList2));
            }
        });
        this.nestedClassIndex = c10.getStorageManager().createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClassIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends Name> invoke() {
                JavaClass javaClass;
                javaClass = LazyJavaClassMemberScope.this.jClass;
                return CollectionsKt.toSet(javaClass.getInnerClassNames());
            }
        });
        this.generatedNestedClassNames = c10.getStorageManager().createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$generatedNestedClassNames$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends Name> invoke() {
                LazyJavaResolverContext lazyJavaResolverContext = LazyJavaResolverContext.this;
                return CollectionsKt.toSet(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getNestedClassNames(lazyJavaResolverContext, this.getOwnerDescriptor()));
            }
        });
        this.enumEntryIndex = c10.getStorageManager().createLazyValue(new Function0<Map<Name, ? extends JavaField>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$enumEntryIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<Name, ? extends JavaField> invoke() {
                JavaClass javaClass;
                int collectionSizeOrDefault;
                javaClass = LazyJavaClassMemberScope.this.jClass;
                Collection<JavaField> fields = javaClass.getFields();
                ArrayList arrayList = new ArrayList();
                for (Object obj : fields) {
                    if (((JavaField) obj).isEnumEntry()) {
                        arrayList.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((JavaField) next).getName(), next);
                }
                return linkedHashMap;
            }
        });
        this.nestedClasses = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1<Name, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ClassDescriptor invoke(Name name) {
                NotNullLazyValue notNullLazyValue;
                NotNullLazyValue notNullLazyValue2;
                NotNullLazyValue notNullLazyValue3;
                JavaClass javaClass;
                Intrinsics.checkNotNullParameter(name, "name");
                notNullLazyValue = LazyJavaClassMemberScope.this.nestedClassIndex;
                if (((Set) notNullLazyValue.invoke()).contains(name)) {
                    JavaClassFinder finder = c10.getComponents().getFinder();
                    ClassId classId = DescriptorUtilsKt.getClassId(LazyJavaClassMemberScope.this.getOwnerDescriptor());
                    Intrinsics.checkNotNull(classId);
                    ClassId createNestedClassId = classId.createNestedClassId(name);
                    Intrinsics.checkNotNullExpressionValue(createNestedClassId, "ownerDescriptor.classId!…createNestedClassId(name)");
                    javaClass = LazyJavaClassMemberScope.this.jClass;
                    JavaClass findClass = finder.findClass(new JavaClassFinder.Request(createNestedClassId, null, javaClass, 2, null));
                    if (findClass == null) {
                        return null;
                    }
                    LazyJavaResolverContext lazyJavaResolverContext = c10;
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, LazyJavaClassMemberScope.this.getOwnerDescriptor(), findClass, null, 8, null);
                    lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                    return lazyJavaClassDescriptor;
                }
                notNullLazyValue2 = LazyJavaClassMemberScope.this.generatedNestedClassNames;
                if (((Set) notNullLazyValue2.invoke()).contains(name)) {
                    LazyJavaResolverContext lazyJavaResolverContext2 = c10;
                    LazyJavaClassMemberScope lazyJavaClassMemberScope2 = LazyJavaClassMemberScope.this;
                    List<ClassDescriptor> createListBuilder = CollectionsKt.createListBuilder();
                    lazyJavaResolverContext2.getComponents().getSyntheticPartsProvider().generateNestedClass(lazyJavaResolverContext2, lazyJavaClassMemberScope2.getOwnerDescriptor(), name, createListBuilder);
                    List build = CollectionsKt.build(createListBuilder);
                    int size = build.size();
                    if (size == 0) {
                        return null;
                    }
                    if (size == 1) {
                        return (ClassDescriptor) CollectionsKt.single(build);
                    }
                    throw new IllegalStateException(("Multiple classes with same name are generated: " + build).toString());
                }
                notNullLazyValue3 = LazyJavaClassMemberScope.this.enumEntryIndex;
                JavaField javaField = (JavaField) ((Map) notNullLazyValue3.invoke()).get(name);
                if (javaField == null) {
                    return null;
                }
                StorageManager storageManager = c10.getStorageManager();
                final LazyJavaClassMemberScope lazyJavaClassMemberScope3 = LazyJavaClassMemberScope.this;
                return EnumEntrySyntheticClassDescriptor.create(c10.getStorageManager(), LazyJavaClassMemberScope.this.getOwnerDescriptor(), name, storageManager.createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Set<? extends Name> invoke() {
                        return SetsKt.plus((Set) LazyJavaClassMemberScope.this.getFunctionNames(), (Iterable) LazyJavaClassMemberScope.this.getVariableNames());
                    }
                }), LazyJavaAnnotationsKt.resolveAnnotations(c10, javaField), c10.getComponents().getSourceElementFactory().source(javaField));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public LinkedHashSet<Name> computeFunctionNames(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Collection<KotlinType> mo1424getSupertypes = getOwnerDescriptor().getTypeConstructor().mo1424getSupertypes();
        Intrinsics.checkNotNullExpressionValue(mo1424getSupertypes, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet<Name> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = mo1424getSupertypes.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getFunctionNames());
        }
        linkedHashSet.addAll(getDeclaredMemberIndex().invoke().getMethodNames());
        linkedHashSet.addAll(getDeclaredMemberIndex().invoke().getRecordComponentNames());
        linkedHashSet.addAll(computeClassNames(kindFilter, function1));
        linkedHashSet.addAll(getC().getComponents().getSyntheticPartsProvider().getMethodNames(getC(), getOwnerDescriptor()));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.jClass, new Function1<JavaMember, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeMemberIndex$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(JavaMember it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isStatic());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public ClassDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }
}

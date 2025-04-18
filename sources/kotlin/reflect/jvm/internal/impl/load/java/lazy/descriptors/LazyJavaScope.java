package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import vd.e;

@SourceDebugExtension({"SMAP\nLazyJavaScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,405:1\n1477#2:406\n1502#2,3:407\n1505#2,3:417\n1549#2:420\n1620#2,3:421\n1549#2:424\n1620#2,3:425\n361#3,7:410\n*S KotlinDebug\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n*L\n129#1:406\n129#1:407,3\n129#1:417,3\n165#1:420\n165#1:421,3\n212#1:424\n212#1:425,3\n129#1:410,7\n*E\n"})
/* loaded from: classes4.dex */
public abstract class LazyJavaScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    private final NotNullLazyValue<Collection<DeclarationDescriptor>> allDescriptors;

    /* renamed from: c, reason: collision with root package name */
    private final LazyJavaResolverContext f21056c;
    private final NotNullLazyValue classNamesLazy$delegate;
    private final MemoizedFunctionToNullable<Name, PropertyDescriptor> declaredField;
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> declaredFunctions;
    private final NotNullLazyValue<DeclaredMemberIndex> declaredMemberIndex;
    private final NotNullLazyValue functionNamesLazy$delegate;
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> functions;
    private final LazyJavaScope mainScope;
    private final MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> properties;
    private final NotNullLazyValue propertyNamesLazy$delegate;

    /* loaded from: classes4.dex */
    public static final class MethodSignatureData {
        private final List<String> errors;
        private final boolean hasStableParameterNames;
        private final KotlinType receiverType;
        private final KotlinType returnType;
        private final List<TypeParameterDescriptor> typeParameters;
        private final List<ValueParameterDescriptor> valueParameters;

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSignatureData(KotlinType returnType, KotlinType kotlinType, List<? extends ValueParameterDescriptor> valueParameters, List<? extends TypeParameterDescriptor> typeParameters, boolean z10, List<String> errors) {
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
            Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.returnType = returnType;
            this.receiverType = kotlinType;
            this.valueParameters = valueParameters;
            this.typeParameters = typeParameters;
            this.hasStableParameterNames = z10;
            this.errors = errors;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return Intrinsics.areEqual(this.returnType, methodSignatureData.returnType) && Intrinsics.areEqual(this.receiverType, methodSignatureData.receiverType) && Intrinsics.areEqual(this.valueParameters, methodSignatureData.valueParameters) && Intrinsics.areEqual(this.typeParameters, methodSignatureData.typeParameters) && this.hasStableParameterNames == methodSignatureData.hasStableParameterNames && Intrinsics.areEqual(this.errors, methodSignatureData.errors);
        }

        public final List<String> getErrors() {
            return this.errors;
        }

        public final boolean getHasStableParameterNames() {
            return this.hasStableParameterNames;
        }

        public final KotlinType getReceiverType() {
            return this.receiverType;
        }

        public final KotlinType getReturnType() {
            return this.returnType;
        }

        public final List<TypeParameterDescriptor> getTypeParameters() {
            return this.typeParameters;
        }

        public final List<ValueParameterDescriptor> getValueParameters() {
            return this.valueParameters;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2 = this.returnType.hashCode() * 31;
            KotlinType kotlinType = this.receiverType;
            if (kotlinType == null) {
                hashCode = 0;
            } else {
                hashCode = kotlinType.hashCode();
            }
            int d10 = e.d(this.typeParameters, e.d(this.valueParameters, (hashCode2 + hashCode) * 31, 31), 31);
            boolean z10 = this.hasStableParameterNames;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return this.errors.hashCode() + ((d10 + i10) * 31);
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.returnType + ", receiverType=" + this.receiverType + ", valueParameters=" + this.valueParameters + ", typeParameters=" + this.typeParameters + ", hasStableParameterNames=" + this.hasStableParameterNames + ", errors=" + this.errors + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class ResolvedValueParameters {
        private final List<ValueParameterDescriptor> descriptors;
        private final boolean hasSynthesizedNames;

        /* JADX WARN: Multi-variable type inference failed */
        public ResolvedValueParameters(List<? extends ValueParameterDescriptor> descriptors, boolean z10) {
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            this.descriptors = descriptors;
            this.hasSynthesizedNames = z10;
        }

        public final List<ValueParameterDescriptor> getDescriptors() {
            return this.descriptors;
        }

        public final boolean getHasSynthesizedNames() {
            return this.hasSynthesizedNames;
        }
    }

    public /* synthetic */ LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i10 & 2) != 0 ? null : lazyJavaScope);
    }

    private final PropertyDescriptorImpl createPropertyDescriptor(JavaField javaField) {
        JavaPropertyDescriptor create = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.f21056c, javaField), Modality.FINAL, UtilsKt.toDescriptorVisibility(javaField.getVisibility()), !javaField.isFinal(), javaField.getName(), this.f21056c.getComponents().getSourceElementFactory().source(javaField), isFinalStatic(javaField));
        Intrinsics.checkNotNullExpressionValue(create, "create(\n            owne…d.isFinalStatic\n        )");
        return create;
    }

    private final Set<Name> getClassNamesLazy() {
        return (Set) StorageKt.getValue(this.classNamesLazy$delegate, this, (KProperty<?>) $$delegatedProperties[2]);
    }

    private final Set<Name> getFunctionNamesLazy() {
        return (Set) StorageKt.getValue(this.functionNamesLazy$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    private final Set<Name> getPropertyNamesLazy() {
        return (Set) StorageKt.getValue(this.propertyNamesLazy$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    private final KotlinType getPropertyType(JavaField javaField) {
        boolean z10;
        KotlinType transformJavaType = this.f21056c.getTypeResolver().transformJavaType(javaField.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
        if ((KotlinBuiltIns.isPrimitiveType(transformJavaType) || KotlinBuiltIns.isString(transformJavaType)) && isFinalStatic(javaField) && javaField.getHasConstantNotNullInitializer()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            KotlinType makeNotNullable = TypeUtils.makeNotNullable(transformJavaType);
            Intrinsics.checkNotNullExpressionValue(makeNotNullable, "makeNotNullable(propertyType)");
            return makeNotNullable;
        }
        return transformJavaType;
    }

    private final boolean isFinalStatic(JavaField javaField) {
        return javaField.isFinal() && javaField.isStatic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final PropertyDescriptor resolveProperty(final JavaField javaField) {
        final PropertyDescriptorImpl createPropertyDescriptor = createPropertyDescriptor(javaField);
        createPropertyDescriptor.initialize(null, null, null, null);
        createPropertyDescriptor.setType(getPropertyType(javaField), CollectionsKt.emptyList(), getDispatchReceiverParameter(), null, CollectionsKt.emptyList());
        if (DescriptorUtils.shouldRecordInitializerForProperty(createPropertyDescriptor, createPropertyDescriptor.getType())) {
            createPropertyDescriptor.setCompileTimeInitializerFactory(new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final NullableLazyValue<? extends ConstantValue<?>> invoke() {
                    StorageManager storageManager = LazyJavaScope.this.getC().getStorageManager();
                    final LazyJavaScope lazyJavaScope = LazyJavaScope.this;
                    final JavaField javaField2 = javaField;
                    final PropertyDescriptorImpl propertyDescriptorImpl = createPropertyDescriptor;
                    return storageManager.createNullableLazyValue(new Function0<ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final ConstantValue<?> invoke() {
                            return LazyJavaScope.this.getC().getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(javaField2, propertyDescriptorImpl);
                        }
                    });
                }
            });
        }
        this.f21056c.getComponents().getJavaResolverCache().recordField(javaField, createPropertyDescriptor);
        return createPropertyDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retainMostSpecificMethods(Set<SimpleFunctionDescriptor> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) obj, false, false, 2, null);
            Object obj2 = linkedHashMap.get(computeJvmDescriptor$default);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(computeJvmDescriptor$default, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends SimpleFunctionDescriptor> selectMostSpecificInEachOverridableGroup = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list2, new Function1<SimpleFunctionDescriptor, CallableDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1
                    @Override // kotlin.jvm.functions.Function1
                    public final CallableDescriptor invoke(SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup2) {
                        Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup2, "$this$selectMostSpecificInEachOverridableGroup");
                        return selectMostSpecificInEachOverridableGroup2;
                    }
                });
                set.removeAll(list2);
                set.addAll(selectMostSpecificInEachOverridableGroup);
            }
        }
    }

    public abstract Set<Name> computeClassNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1);

    public final List<DeclarationDescriptor> computeDescriptors(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (Name name : computeClassNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(linkedHashSet, mo1425getContributedClassifier(name, noLookupLocation));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name2 : computeFunctionNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    linkedHashSet.addAll(getContributedFunctions(name2, noLookupLocation));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name3 : computePropertyNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name3).booleanValue()) {
                    linkedHashSet.addAll(getContributedVariables(name3, noLookupLocation));
                }
            }
        }
        return CollectionsKt.toList(linkedHashSet);
    }

    public abstract Set<Name> computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1);

    public void computeImplicitlyDeclaredFunctions(Collection<SimpleFunctionDescriptor> result, Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public abstract DeclaredMemberIndex computeMemberIndex();

    public final KotlinType computeMethodReturnType(JavaMethod method, LazyJavaResolverContext c10) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(c10, "c");
        return c10.getTypeResolver().transformJavaType(method.getReturnType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, method.getContainingClass().isAnnotationType(), false, null, 6, null));
    }

    public abstract void computeNonDeclaredFunctions(Collection<SimpleFunctionDescriptor> collection, Name name);

    public abstract void computeNonDeclaredProperties(Name name, Collection<PropertyDescriptor> collection);

    public abstract Set<Name> computePropertyNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1);

    public final NotNullLazyValue<Collection<DeclarationDescriptor>> getAllDescriptors() {
        return this.allDescriptors;
    }

    public final LazyJavaResolverContext getC() {
        return this.f21056c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return getClassNamesLazy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return this.allDescriptors.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (!getFunctionNames().contains(name)) {
            return CollectionsKt.emptyList();
        }
        return this.functions.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (!getVariableNames().contains(name)) {
            return CollectionsKt.emptyList();
        }
        return this.properties.invoke(name);
    }

    public final NotNullLazyValue<DeclaredMemberIndex> getDeclaredMemberIndex() {
        return this.declaredMemberIndex;
    }

    public abstract ReceiverParameterDescriptor getDispatchReceiverParameter();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return getFunctionNamesLazy();
    }

    public final LazyJavaScope getMainScope() {
        return this.mainScope;
    }

    public abstract DeclarationDescriptor getOwnerDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return getPropertyNamesLazy();
    }

    public boolean isVisibleAsFunction(JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor, "<this>");
        return true;
    }

    public abstract MethodSignatureData resolveMethodSignature(JavaMethod javaMethod, List<? extends TypeParameterDescriptor> list, KotlinType kotlinType, List<? extends ValueParameterDescriptor> list2);

    public final JavaMethodDescriptor resolveMethodToFunctionDescriptor(JavaMethod method) {
        boolean z10;
        int collectionSizeOrDefault;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        Map<? extends CallableDescriptor.UserDataKey<?>, ?> emptyMap;
        Intrinsics.checkNotNullParameter(method, "method");
        Annotations resolveAnnotations = LazyJavaAnnotationsKt.resolveAnnotations(this.f21056c, method);
        DeclarationDescriptor ownerDescriptor = getOwnerDescriptor();
        Name name = method.getName();
        JavaSourceElement source = this.f21056c.getComponents().getSourceElementFactory().source(method);
        if (this.declaredMemberIndex.invoke().findRecordComponentByName(method.getName()) != null && method.getValueParameters().isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        JavaMethodDescriptor createJavaMethod = JavaMethodDescriptor.createJavaMethod(ownerDescriptor, resolveAnnotations, name, source, z10);
        Intrinsics.checkNotNullExpressionValue(createJavaMethod, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        LazyJavaResolverContext childForMethod$default = ContextKt.childForMethod$default(this.f21056c, createJavaMethod, method, 0, 4, null);
        List<JavaTypeParameter> typeParameters = method.getTypeParameters();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor resolveTypeParameter = childForMethod$default.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it.next());
            Intrinsics.checkNotNull(resolveTypeParameter);
            arrayList.add(resolveTypeParameter);
        }
        ResolvedValueParameters resolveValueParameters = resolveValueParameters(childForMethod$default, createJavaMethod, method.getValueParameters());
        MethodSignatureData resolveMethodSignature = resolveMethodSignature(method, arrayList, computeMethodReturnType(method, childForMethod$default), resolveValueParameters.getDescriptors());
        KotlinType receiverType = resolveMethodSignature.getReceiverType();
        if (receiverType != null) {
            receiverParameterDescriptor = DescriptorFactory.createExtensionReceiverParameterForCallable(createJavaMethod, receiverType, Annotations.Companion.getEMPTY());
        } else {
            receiverParameterDescriptor = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor2 = receiverParameterDescriptor;
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List<ReceiverParameterDescriptor> emptyList = CollectionsKt.emptyList();
        List<TypeParameterDescriptor> typeParameters2 = resolveMethodSignature.getTypeParameters();
        List<ValueParameterDescriptor> valueParameters = resolveMethodSignature.getValueParameters();
        KotlinType returnType = resolveMethodSignature.getReturnType();
        Modality convertFromFlags = Modality.Companion.convertFromFlags(false, method.isAbstract(), !method.isFinal());
        DescriptorVisibility descriptorVisibility = UtilsKt.toDescriptorVisibility(method.getVisibility());
        if (resolveMethodSignature.getReceiverType() != null) {
            emptyMap = MapsKt.mapOf(TuplesKt.to(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, CollectionsKt.first((List) resolveValueParameters.getDescriptors())));
        } else {
            emptyMap = MapsKt.emptyMap();
        }
        createJavaMethod.initialize(receiverParameterDescriptor2, dispatchReceiverParameter, emptyList, typeParameters2, valueParameters, returnType, convertFromFlags, descriptorVisibility, emptyMap);
        createJavaMethod.setParameterNamesStatus(resolveMethodSignature.getHasStableParameterNames(), resolveValueParameters.getHasSynthesizedNames());
        if (!resolveMethodSignature.getErrors().isEmpty()) {
            childForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(createJavaMethod, resolveMethodSignature.getErrors());
        }
        return createJavaMethod;
    }

    public final ResolvedValueParameters resolveValueParameters(LazyJavaResolverContext lazyJavaResolverContext, FunctionDescriptor function, List<? extends JavaValueParameter> jValueParameters) {
        int collectionSizeOrDefault;
        Pair pair;
        Name name;
        LazyJavaResolverContext c10 = lazyJavaResolverContext;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(jValueParameters, "jValueParameters");
        Iterable<IndexedValue> withIndex = CollectionsKt.withIndex(jValueParameters);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(withIndex, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        boolean z10 = false;
        for (IndexedValue indexedValue : withIndex) {
            int index = indexedValue.getIndex();
            JavaValueParameter javaValueParameter = (JavaValueParameter) indexedValue.component2();
            Annotations resolveAnnotations = LazyJavaAnnotationsKt.resolveAnnotations(c10, javaValueParameter);
            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            JavaArrayType javaArrayType = null;
            if (javaValueParameter.isVararg()) {
                JavaType type = javaValueParameter.getType();
                if (type instanceof JavaArrayType) {
                    javaArrayType = (JavaArrayType) type;
                }
                if (javaArrayType != null) {
                    KotlinType transformArrayType = lazyJavaResolverContext.getTypeResolver().transformArrayType(javaArrayType, attributes$default, true);
                    pair = TuplesKt.to(transformArrayType, lazyJavaResolverContext.getModule().getBuiltIns().getArrayElementType(transformArrayType));
                } else {
                    throw new AssertionError("Vararg parameter should be an array: " + javaValueParameter);
                }
            } else {
                pair = TuplesKt.to(lazyJavaResolverContext.getTypeResolver().transformJavaType(javaValueParameter.getType(), attributes$default), null);
            }
            KotlinType kotlinType = (KotlinType) pair.component1();
            KotlinType kotlinType2 = (KotlinType) pair.component2();
            if (Intrinsics.areEqual(function.getName().asString(), "equals") && jValueParameters.size() == 1 && Intrinsics.areEqual(lazyJavaResolverContext.getModule().getBuiltIns().getNullableAnyType(), kotlinType)) {
                name = Name.identifier("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    name = Name.identifier(TtmlNode.TAG_P + index);
                    Intrinsics.checkNotNullExpressionValue(name, "identifier(\"p$index\")");
                }
            }
            Name name2 = name;
            Intrinsics.checkNotNullExpressionValue(name2, "if (function.name.asStri…(\"p$index\")\n            }");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(function, null, index, resolveAnnotations, name2, kotlinType, false, false, false, kotlinType2, lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaValueParameter)));
            arrayList = arrayList2;
            z10 = z10;
            c10 = lazyJavaResolverContext;
        }
        return new ResolvedValueParameters(CollectionsKt.toList(arrayList), z10);
    }

    public String toString() {
        return "Lazy scope for " + getOwnerDescriptor();
    }

    public LazyJavaScope(LazyJavaResolverContext c10, LazyJavaScope lazyJavaScope) {
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f21056c = c10;
        this.mainScope = lazyJavaScope;
        this.allDescriptors = c10.getStorageManager().createRecursionTolerantLazyValue(new Function0<Collection<? extends DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$allDescriptors$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Collection<? extends DeclarationDescriptor> invoke() {
                return LazyJavaScope.this.computeDescriptors(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER());
            }
        }, CollectionsKt.emptyList());
        this.declaredMemberIndex = c10.getStorageManager().createLazyValue(new Function0<DeclaredMemberIndex>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredMemberIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final DeclaredMemberIndex invoke() {
                return LazyJavaScope.this.computeMemberIndex();
            }
        });
        this.declaredFunctions = c10.getStorageManager().createMemoizedFunction(new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredFunctions$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Collection<SimpleFunctionDescriptor> invoke(Name name) {
                MemoizedFunctionToNotNull memoizedFunctionToNotNull;
                Intrinsics.checkNotNullParameter(name, "name");
                if (LazyJavaScope.this.getMainScope() != null) {
                    memoizedFunctionToNotNull = LazyJavaScope.this.getMainScope().declaredFunctions;
                    return (Collection) memoizedFunctionToNotNull.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                for (JavaMethod javaMethod : LazyJavaScope.this.getDeclaredMemberIndex().invoke().findMethodsByName(name)) {
                    JavaMethodDescriptor resolveMethodToFunctionDescriptor = LazyJavaScope.this.resolveMethodToFunctionDescriptor(javaMethod);
                    if (LazyJavaScope.this.isVisibleAsFunction(resolveMethodToFunctionDescriptor)) {
                        LazyJavaScope.this.getC().getComponents().getJavaResolverCache().recordMethod(javaMethod, resolveMethodToFunctionDescriptor);
                        arrayList.add(resolveMethodToFunctionDescriptor);
                    }
                }
                LazyJavaScope.this.computeImplicitlyDeclaredFunctions(arrayList, name);
                return arrayList;
            }
        });
        this.declaredField = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1<Name, PropertyDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredField$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final PropertyDescriptor invoke(Name name) {
                PropertyDescriptor resolveProperty;
                MemoizedFunctionToNullable memoizedFunctionToNullable;
                Intrinsics.checkNotNullParameter(name, "name");
                if (LazyJavaScope.this.getMainScope() != null) {
                    memoizedFunctionToNullable = LazyJavaScope.this.getMainScope().declaredField;
                    return (PropertyDescriptor) memoizedFunctionToNullable.invoke(name);
                }
                JavaField findFieldByName = LazyJavaScope.this.getDeclaredMemberIndex().invoke().findFieldByName(name);
                if (findFieldByName == null || findFieldByName.isEnumEntry()) {
                    return null;
                }
                resolveProperty = LazyJavaScope.this.resolveProperty(findFieldByName);
                return resolveProperty;
            }
        });
        this.functions = c10.getStorageManager().createMemoizedFunction(new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functions$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Collection<SimpleFunctionDescriptor> invoke(Name name) {
                MemoizedFunctionToNotNull memoizedFunctionToNotNull;
                Intrinsics.checkNotNullParameter(name, "name");
                memoizedFunctionToNotNull = LazyJavaScope.this.declaredFunctions;
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) memoizedFunctionToNotNull.invoke(name));
                LazyJavaScope.this.retainMostSpecificMethods(linkedHashSet);
                LazyJavaScope.this.computeNonDeclaredFunctions(linkedHashSet, name);
                return CollectionsKt.toList(LazyJavaScope.this.getC().getComponents().getSignatureEnhancement().enhanceSignatures(LazyJavaScope.this.getC(), linkedHashSet));
            }
        });
        this.functionNamesLazy$delegate = c10.getStorageManager().createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functionNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends Name> invoke() {
                return LazyJavaScope.this.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
            }
        });
        this.propertyNamesLazy$delegate = c10.getStorageManager().createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$propertyNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends Name> invoke() {
                return LazyJavaScope.this.computePropertyNames(DescriptorKindFilter.VARIABLES, null);
            }
        });
        this.classNamesLazy$delegate = c10.getStorageManager().createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$classNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends Name> invoke() {
                return LazyJavaScope.this.computeClassNames(DescriptorKindFilter.CLASSIFIERS, null);
            }
        });
        this.properties = c10.getStorageManager().createMemoizedFunction(new Function1<Name, List<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$properties$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<PropertyDescriptor> invoke(Name name) {
                MemoizedFunctionToNullable memoizedFunctionToNullable;
                Intrinsics.checkNotNullParameter(name, "name");
                ArrayList arrayList = new ArrayList();
                memoizedFunctionToNullable = LazyJavaScope.this.declaredField;
                kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, memoizedFunctionToNullable.invoke(name));
                LazyJavaScope.this.computeNonDeclaredProperties(name, arrayList);
                if (DescriptorUtils.isAnnotationClass(LazyJavaScope.this.getOwnerDescriptor())) {
                    return CollectionsKt.toList(arrayList);
                }
                return CollectionsKt.toList(LazyJavaScope.this.getC().getComponents().getSignatureEnhancement().enhanceSignatures(LazyJavaScope.this.getC(), arrayList));
            }
        });
    }
}

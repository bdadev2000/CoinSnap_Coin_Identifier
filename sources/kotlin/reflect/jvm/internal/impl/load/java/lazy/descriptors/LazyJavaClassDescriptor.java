package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

@SourceDebugExtension({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,322:1\n1747#2,3:323\n1747#2,3:326\n1603#2,9:329\n1855#2:338\n1856#2:340\n1612#2:341\n1045#2:342\n1#3:339\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n*L\n185#1:323,3\n188#1:326,3\n200#1:329,9\n200#1:338\n200#1:340\n200#1:341\n202#1:342\n200#1:339\n*E\n"})
/* loaded from: classes4.dex */
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> PUBLIC_METHOD_NAMES_IN_OBJECT = SetsKt.setOf((Object[]) new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    private final ClassDescriptor additionalSupertypeClassDescriptor;
    private final Annotations annotations;

    /* renamed from: c, reason: collision with root package name */
    private final LazyJavaResolverContext f21054c;
    private final NotNullLazyValue<List<TypeParameterDescriptor>> declaredParameters;
    private final InnerClassesScopeWrapper innerClassesScope;
    private final boolean isInner;
    private final JavaClass jClass;
    private final ClassKind kind;
    private final Modality modality;
    private final Lazy moduleAnnotations$delegate;
    private final LazyJavaResolverContext outerContext;
    private final ScopesHolderForClass<LazyJavaClassMemberScope> scopeHolder;
    private final LazyJavaStaticClassScope staticScope;
    private final LazyJavaClassTypeConstructor typeConstructor;
    private final LazyJavaClassMemberScope unsubstitutedMemberScope;
    private final Visibility visibility;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @SourceDebugExtension({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$LazyJavaClassTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,322:1\n1549#2:323\n1620#2,3:324\n1549#2:327\n1620#2,3:328\n1549#2:331\n1620#2,3:332\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$LazyJavaClassTypeConstructor\n*L\n254#1:323\n254#1:324,3\n280#1:327\n280#1:328,3\n285#1:331\n285#1:332,3\n*E\n"})
    /* loaded from: classes4.dex */
    public final class LazyJavaClassTypeConstructor extends AbstractClassTypeConstructor {
        private final NotNullLazyValue<List<TypeParameterDescriptor>> parameters;

        public LazyJavaClassTypeConstructor() {
            super(LazyJavaClassDescriptor.this.f21054c.getStorageManager());
            this.parameters = LazyJavaClassDescriptor.this.f21054c.getStorageManager().createLazyValue(new Function0<List<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends TypeParameterDescriptor> invoke() {
                    return TypeParameterUtilsKt.computeConstructorTypeParameters(LazyJavaClassDescriptor.this);
                }
            });
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r3 != false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType getPurelyImplementedSupertype() {
            /*
                r7 = this;
                kotlin.reflect.jvm.internal.impl.name.FqName r0 = r7.getPurelyImplementsFqNameFromAnnotation()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L1c
                boolean r3 = r0.isRoot()
                if (r3 != 0) goto L18
                kotlin.reflect.jvm.internal.impl.name.Name r3 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_NAME
                boolean r3 = r0.startsWith(r3)
                if (r3 == 0) goto L18
                r3 = r1
                goto L19
            L18:
                r3 = 0
            L19:
                if (r3 == 0) goto L1c
                goto L1d
            L1c:
                r0 = r2
            L1d:
                if (r0 != 0) goto L2e
                kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider r3 = kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider.INSTANCE
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this
                kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r4)
                kotlin.reflect.jvm.internal.impl.name.FqName r3 = r3.getPurelyImplementedInterface(r4)
                if (r3 != 0) goto L2f
                return r2
            L2e:
                r3 = r0
            L2f:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this
                kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.access$getC$p(r4)
                kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r4 = r4.getModule()
                kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r5 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_JAVA_LOADER
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.resolveTopLevelClass(r4, r3, r5)
                if (r3 != 0) goto L42
                return r2
            L42:
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r4 = r3.getTypeConstructor()
                java.util.List r4 = r4.getParameters()
                int r4 = r4.size()
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r5.getTypeConstructor()
                java.util.List r5 = r5.getParameters()
                java.lang.String r6 = "getTypeConstructor().parameters"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                int r6 = r5.size()
                if (r6 != r4) goto L8d
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = kotlin.collections.CollectionsKt.f(r5)
                r0.<init>(r1)
                java.util.Iterator r1 = r5.iterator()
            L72:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto Lc7
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r2
                kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r4 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
                kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r2.getDefaultType()
                r4.<init>(r5, r2)
                r0.add(r4)
                goto L72
            L8d:
                if (r6 != r1) goto Ld2
                if (r4 <= r1) goto Ld2
                if (r0 != 0) goto Ld2
                kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r0 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
                kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                java.lang.Object r5 = kotlin.collections.CollectionsKt.single(r5)
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r5
                kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = r5.getDefaultType()
                r0.<init>(r2, r5)
                kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
                r2.<init>(r1, r4)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r4 = kotlin.collections.CollectionsKt.f(r2)
                r1.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            Lb6:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lc6
                r4 = r2
                kotlin.collections.IntIterator r4 = (kotlin.collections.IntIterator) r4
                r4.nextInt()
                r1.add(r0)
                goto Lb6
            Lc6:
                r0 = r1
            Lc7:
                kotlin.reflect.jvm.internal.impl.types.TypeAttributes$Companion r1 = kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion
                kotlin.reflect.jvm.internal.impl.types.TypeAttributes r1 = r1.getEmpty()
                kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(r1, r3, r0)
                return r0
            Ld2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype():kotlin.reflect.jvm.internal.impl.types.KotlinType");
        }

        private final FqName getPurelyImplementsFqNameFromAnnotation() {
            StringValue stringValue;
            String value;
            Annotations annotations = LazyJavaClassDescriptor.this.getAnnotations();
            FqName PURELY_IMPLEMENTS_ANNOTATION = JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION;
            Intrinsics.checkNotNullExpressionValue(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            AnnotationDescriptor mo1418findAnnotation = annotations.mo1418findAnnotation(PURELY_IMPLEMENTS_ANNOTATION);
            if (mo1418findAnnotation == null) {
                return null;
            }
            Object singleOrNull = CollectionsKt.singleOrNull(mo1418findAnnotation.getAllValueArguments().values());
            if (singleOrNull instanceof StringValue) {
                stringValue = (StringValue) singleOrNull;
            } else {
                stringValue = null;
            }
            if (stringValue == null || (value = stringValue.getValue()) == null || !FqNamesUtilKt.isValidJavaFqName(value)) {
                return null;
            }
            return new FqName(value);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public Collection<KotlinType> computeSupertypes() {
            Object obj;
            List listOf;
            int collectionSizeOrDefault;
            Collection<JavaClassifierType> supertypes = LazyJavaClassDescriptor.this.getJClass().getSupertypes();
            ArrayList arrayList = new ArrayList(supertypes.size());
            ArrayList arrayList2 = new ArrayList(0);
            KotlinType purelyImplementedSupertype = getPurelyImplementedSupertype();
            Iterator<JavaClassifierType> it = supertypes.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                JavaClassifierType next = it.next();
                KotlinType enhanceSuperType = LazyJavaClassDescriptor.this.f21054c.getComponents().getSignatureEnhancement().enhanceSuperType(LazyJavaClassDescriptor.this.f21054c.getTypeResolver().transformJavaType(next, JavaTypeAttributesKt.toAttributes$default(TypeUsage.SUPERTYPE, false, false, null, 7, null)), LazyJavaClassDescriptor.this.f21054c);
                if (enhanceSuperType.getConstructor().mo1423getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList2.add(next);
                }
                TypeConstructor constructor = enhanceSuperType.getConstructor();
                if (purelyImplementedSupertype != null) {
                    obj = purelyImplementedSupertype.getConstructor();
                }
                if (!Intrinsics.areEqual(constructor, obj) && !KotlinBuiltIns.isAnyOrNullableAny(enhanceSuperType)) {
                    arrayList.add(enhanceSuperType);
                }
            }
            ClassDescriptor classDescriptor = LazyJavaClassDescriptor.this.additionalSupertypeClassDescriptor;
            if (classDescriptor != null) {
                obj = MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptor, LazyJavaClassDescriptor.this).buildSubstitutor().substitute(classDescriptor.getDefaultType(), Variance.INVARIANT);
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, obj);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, purelyImplementedSupertype);
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporter = LazyJavaClassDescriptor.this.f21054c.getComponents().getErrorReporter();
                ClassDescriptor mo1423getDeclarationDescriptor = mo1423getDeclarationDescriptor();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    JavaType javaType = (JavaType) it2.next();
                    Intrinsics.checkNotNull(javaType, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((JavaClassifierType) javaType).getPresentableText());
                }
                errorReporter.reportIncompleteHierarchy(mo1423getDeclarationDescriptor, arrayList3);
            }
            if (!arrayList.isEmpty()) {
                listOf = CollectionsKt.toList(arrayList);
            } else {
                listOf = CollectionsKt.listOf(LazyJavaClassDescriptor.this.f21054c.getModule().getBuiltIns().getAnyType());
            }
            return listOf;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            return this.parameters.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            return LazyJavaClassDescriptor.this.f21054c.getComponents().getSupertypeLoopChecker();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        public String toString() {
            String asString = LazyJavaClassDescriptor.this.getName().asString();
            Intrinsics.checkNotNullExpressionValue(asString, "name.asString()");
            return asString;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public ClassDescriptor mo1423getDeclarationDescriptor() {
            return LazyJavaClassDescriptor.this;
        }
    }

    public /* synthetic */ LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass, ClassDescriptor classDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, (i10 & 8) != 0 ? null : classDescriptor);
    }

    public final LazyJavaClassDescriptor copy$descriptors_jvm(JavaResolverCache javaResolverCache, ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        LazyJavaResolverContext lazyJavaResolverContext = this.f21054c;
        LazyJavaResolverContext replaceComponents = ContextKt.replaceComponents(lazyJavaResolverContext, lazyJavaResolverContext.getComponents().replace(javaResolverCache));
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "containingDeclaration");
        return new LazyJavaClassDescriptor(replaceComponents, containingDeclaration, this.jClass, classDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo1416getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.declaredParameters.invoke();
    }

    public final JavaClass getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return this.modality;
    }

    public final List<JavaAnnotation> getModuleAnnotations() {
        return (List) this.moduleAnnotations$delegate.getValue();
    }

    public final LazyJavaResolverContext getOuterContext() {
        return this.outerContext;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        ClassDescriptor classDescriptor;
        if (this.modality == Modality.SEALED) {
            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            Collection<JavaClassifierType> permittedTypes = this.jClass.getPermittedTypes();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = permittedTypes.iterator();
            while (it.hasNext()) {
                ClassifierDescriptor mo1423getDeclarationDescriptor = this.f21054c.getTypeResolver().transformJavaType((JavaClassifierType) it.next(), attributes$default).getConstructor().mo1423getDeclarationDescriptor();
                if (mo1423getDeclarationDescriptor instanceof ClassDescriptor) {
                    classDescriptor = (ClassDescriptor) mo1423getDeclarationDescriptor;
                } else {
                    classDescriptor = null;
                }
                if (classDescriptor != null) {
                    arrayList.add(classDescriptor);
                }
            }
            return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$getSealedSubclasses$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t5, T t10) {
                    return ComparisonsKt.compareValues(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t5).asString(), DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t10).asString());
                }
            });
        }
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        return this.staticScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedInnerClassesScope() {
        return this.innerClassesScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo1417getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public DescriptorVisibility getVisibility() {
        if (Intrinsics.areEqual(this.visibility, DescriptorVisibilities.PRIVATE) && this.jClass.getOuterClass() == null) {
            DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.PACKAGE_VISIBILITY;
            Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
            return descriptorVisibility;
        }
        return UtilsKt.toDescriptorVisibility(this.visibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.isInner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.getFqNameUnsafe(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(LazyJavaResolverContext outerContext, DeclarationDescriptor containingDeclaration, JavaClass jClass, ClassDescriptor classDescriptor) {
        super(outerContext.getStorageManager(), containingDeclaration, jClass.getName(), outerContext.getComponents().getSourceElementFactory().source(jClass), false);
        ClassKind classKind;
        Modality modality;
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.outerContext = outerContext;
        this.jClass = jClass;
        this.additionalSupertypeClassDescriptor = classDescriptor;
        LazyJavaResolverContext childForClassOrPackage$default = ContextKt.childForClassOrPackage$default(outerContext, this, jClass, 0, 4, null);
        this.f21054c = childForClassOrPackage$default;
        childForClassOrPackage$default.getComponents().getJavaResolverCache().recordClass(jClass, this);
        jClass.getLightClassOriginKind();
        this.moduleAnnotations$delegate = LazyKt.lazy(new Function0<List<? extends JavaAnnotation>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$moduleAnnotations$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends JavaAnnotation> invoke() {
                ClassId classId = DescriptorUtilsKt.getClassId(LazyJavaClassDescriptor.this);
                if (classId != null) {
                    return LazyJavaClassDescriptor.this.getOuterContext().getComponents().getJavaModuleResolver().getAnnotationsForModuleOwnerOfClass(classId);
                }
                return null;
            }
        });
        if (jClass.isAnnotationType()) {
            classKind = ClassKind.ANNOTATION_CLASS;
        } else if (jClass.isInterface()) {
            classKind = ClassKind.INTERFACE;
        } else {
            classKind = jClass.isEnum() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        }
        this.kind = classKind;
        if (!jClass.isAnnotationType() && !jClass.isEnum()) {
            modality = Modality.Companion.convertFromFlags(jClass.isSealed(), jClass.isSealed() || jClass.isAbstract() || jClass.isInterface(), !jClass.isFinal());
        } else {
            modality = Modality.FINAL;
        }
        this.modality = modality;
        this.visibility = jClass.getVisibility();
        this.isInner = (jClass.getOuterClass() == null || jClass.isStatic()) ? false : true;
        this.typeConstructor = new LazyJavaClassTypeConstructor();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(childForClassOrPackage$default, this, jClass, classDescriptor != null, null, 16, null);
        this.unsubstitutedMemberScope = lazyJavaClassMemberScope;
        this.scopeHolder = ScopesHolderForClass.Companion.create(this, childForClassOrPackage$default.getStorageManager(), childForClassOrPackage$default.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new Function1<KotlinTypeRefiner, LazyJavaClassMemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$scopeHolder$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final LazyJavaClassMemberScope invoke(KotlinTypeRefiner it) {
                LazyJavaClassMemberScope lazyJavaClassMemberScope2;
                Intrinsics.checkNotNullParameter(it, "it");
                LazyJavaResolverContext lazyJavaResolverContext = LazyJavaClassDescriptor.this.f21054c;
                LazyJavaClassDescriptor lazyJavaClassDescriptor = LazyJavaClassDescriptor.this;
                JavaClass jClass2 = lazyJavaClassDescriptor.getJClass();
                boolean z10 = LazyJavaClassDescriptor.this.additionalSupertypeClassDescriptor != null;
                lazyJavaClassMemberScope2 = LazyJavaClassDescriptor.this.unsubstitutedMemberScope;
                return new LazyJavaClassMemberScope(lazyJavaResolverContext, lazyJavaClassDescriptor, jClass2, z10, lazyJavaClassMemberScope2);
            }
        });
        this.innerClassesScope = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.staticScope = new LazyJavaStaticClassScope(childForClassOrPackage$default, jClass, this);
        this.annotations = LazyJavaAnnotationsKt.resolveAnnotations(childForClassOrPackage$default, jClass);
        this.declaredParameters = childForClassOrPackage$default.getStorageManager().createLazyValue(new Function0<List<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$declaredParameters$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends TypeParameterDescriptor> invoke() {
                int collectionSizeOrDefault;
                List<JavaTypeParameter> typeParameters = LazyJavaClassDescriptor.this.getJClass().getTypeParameters();
                LazyJavaClassDescriptor lazyJavaClassDescriptor = LazyJavaClassDescriptor.this;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (JavaTypeParameter javaTypeParameter : typeParameters) {
                    TypeParameterDescriptor resolveTypeParameter = lazyJavaClassDescriptor.f21054c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
                    if (resolveTypeParameter != null) {
                        arrayList.add(resolveTypeParameter);
                    } else {
                        throw new AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + lazyJavaClassDescriptor.getJClass() + ", so it must be resolved");
                    }
                }
                return arrayList;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ClassConstructorDescriptor> getConstructors() {
        return this.unsubstitutedMemberScope.getConstructors$descriptors_jvm().invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.scopeHolder.getScope(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = super.getUnsubstitutedMemberScope();
        Intrinsics.checkNotNull(unsubstitutedMemberScope, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (LazyJavaClassMemberScope) unsubstitutedMemberScope;
    }
}

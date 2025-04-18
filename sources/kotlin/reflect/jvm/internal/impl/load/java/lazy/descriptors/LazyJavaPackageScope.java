package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

@SourceDebugExtension({"SMAP\nLazyJavaPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1620#2,3:190\n1611#2:193\n1855#2:194\n1856#2:196\n1612#2:197\n766#2:198\n857#2,2:199\n1#3:195\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n*L\n160#1:190,3\n162#1:193\n162#1:194\n162#1:196\n162#1:197\n185#1:198\n185#1:199,2\n162#1:195\n*E\n"})
/* loaded from: classes4.dex */
public final class LazyJavaPackageScope extends LazyJavaStaticScope {
    private final MemoizedFunctionToNullable<FindClassRequest, ClassDescriptor> classes;
    private final JavaPackage jPackage;
    private final NullableLazyValue<Set<String>> knownClassNamesInPackage;
    private final LazyJavaPackageFragment ownerDescriptor;

    /* loaded from: classes4.dex */
    public static final class FindClassRequest {
        private final JavaClass javaClass;
        private final Name name;

        public FindClassRequest(Name name, JavaClass javaClass) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.javaClass = javaClass;
        }

        public boolean equals(Object obj) {
            return (obj instanceof FindClassRequest) && Intrinsics.areEqual(this.name, ((FindClassRequest) obj).name);
        }

        public final JavaClass getJavaClass() {
            return this.javaClass;
        }

        public final Name getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class KotlinClassLookupResult {

        /* loaded from: classes4.dex */
        public static final class Found extends KotlinClassLookupResult {
            private final ClassDescriptor descriptor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Found(ClassDescriptor descriptor) {
                super(null);
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                this.descriptor = descriptor;
            }

            public final ClassDescriptor getDescriptor() {
                return this.descriptor;
            }
        }

        /* loaded from: classes4.dex */
        public static final class NotFound extends KotlinClassLookupResult {
            public static final NotFound INSTANCE = new NotFound();

            private NotFound() {
                super(null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class SyntheticClass extends KotlinClassLookupResult {
            public static final SyntheticClass INSTANCE = new SyntheticClass();

            private SyntheticClass() {
                super(null);
            }
        }

        private KotlinClassLookupResult() {
        }

        public /* synthetic */ KotlinClassLookupResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(final LazyJavaResolverContext c10, JavaPackage jPackage, LazyJavaPackageFragment ownerDescriptor) {
        super(c10);
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.jPackage = jPackage;
        this.ownerDescriptor = ownerDescriptor;
        this.knownClassNamesInPackage = c10.getStorageManager().createNullableLazyValue(new Function0<Set<? extends String>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$knownClassNamesInPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends String> invoke() {
                return LazyJavaResolverContext.this.getComponents().getFinder().knownClassNamesInPackage(this.getOwnerDescriptor().getFqName());
            }
        });
        this.classes = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1<FindClassRequest, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$classes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ClassDescriptor invoke(LazyJavaPackageScope.FindClassRequest request) {
                JvmMetadataVersion jvmMetadataVersion;
                KotlinClassFinder.Result findKotlinClassOrContent;
                LazyJavaPackageScope.KotlinClassLookupResult resolveKotlinBinaryClass;
                JvmMetadataVersion jvmMetadataVersion2;
                JvmMetadataVersion jvmMetadataVersion3;
                JvmMetadataVersion jvmMetadataVersion4;
                Intrinsics.checkNotNullParameter(request, "request");
                ClassId classId = new ClassId(LazyJavaPackageScope.this.getOwnerDescriptor().getFqName(), request.getName());
                if (request.getJavaClass() != null) {
                    KotlinClassFinder kotlinClassFinder = c10.getComponents().getKotlinClassFinder();
                    JavaClass javaClass = request.getJavaClass();
                    jvmMetadataVersion4 = LazyJavaPackageScope.this.getJvmMetadataVersion();
                    findKotlinClassOrContent = kotlinClassFinder.findKotlinClassOrContent(javaClass, jvmMetadataVersion4);
                } else {
                    KotlinClassFinder kotlinClassFinder2 = c10.getComponents().getKotlinClassFinder();
                    jvmMetadataVersion = LazyJavaPackageScope.this.getJvmMetadataVersion();
                    findKotlinClassOrContent = kotlinClassFinder2.findKotlinClassOrContent(classId, jvmMetadataVersion);
                }
                KotlinJvmBinaryClass kotlinJvmBinaryClass = findKotlinClassOrContent != null ? findKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
                ClassId classId2 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
                if (classId2 != null && (classId2.isNestedClass() || classId2.isLocal())) {
                    return null;
                }
                resolveKotlinBinaryClass = LazyJavaPackageScope.this.resolveKotlinBinaryClass(kotlinJvmBinaryClass);
                if (resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.Found) {
                    return ((LazyJavaPackageScope.KotlinClassLookupResult.Found) resolveKotlinBinaryClass).getDescriptor();
                }
                if (resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass) {
                    return null;
                }
                if (resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.NotFound) {
                    JavaClass javaClass2 = request.getJavaClass();
                    if (javaClass2 == null) {
                        JavaClassFinder finder = c10.getComponents().getFinder();
                        KotlinClassFinder.Result.ClassFileContent classFileContent = findKotlinClassOrContent instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) findKotlinClassOrContent : null;
                        javaClass2 = finder.findClass(new JavaClassFinder.Request(classId, classFileContent != null ? classFileContent.getContent() : null, null, 4, null));
                    }
                    JavaClass javaClass3 = javaClass2;
                    if ((javaClass3 != null ? javaClass3.getLightClassOriginKind() : null) != LightClassOriginKind.BINARY) {
                        FqName fqName = javaClass3 != null ? javaClass3.getFqName() : null;
                        if (fqName == null || fqName.isRoot() || !Intrinsics.areEqual(fqName.parent(), LazyJavaPackageScope.this.getOwnerDescriptor().getFqName())) {
                            return null;
                        }
                        LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(c10, LazyJavaPackageScope.this.getOwnerDescriptor(), javaClass3, null, 8, null);
                        c10.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                        return lazyJavaClassDescriptor;
                    }
                    StringBuilder sb2 = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                    sb2.append(javaClass3);
                    sb2.append("\nClassId: ");
                    sb2.append(classId);
                    sb2.append("\nfindKotlinClass(JavaClass) = ");
                    KotlinClassFinder kotlinClassFinder3 = c10.getComponents().getKotlinClassFinder();
                    jvmMetadataVersion2 = LazyJavaPackageScope.this.getJvmMetadataVersion();
                    sb2.append(KotlinClassFinderKt.findKotlinClass(kotlinClassFinder3, javaClass3, jvmMetadataVersion2));
                    sb2.append("\nfindKotlinClass(ClassId) = ");
                    KotlinClassFinder kotlinClassFinder4 = c10.getComponents().getKotlinClassFinder();
                    jvmMetadataVersion3 = LazyJavaPackageScope.this.getJvmMetadataVersion();
                    sb2.append(KotlinClassFinderKt.findKotlinClass(kotlinClassFinder4, classId, jvmMetadataVersion3));
                    sb2.append('\n');
                    throw new IllegalStateException(sb2.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
        });
    }

    private final ClassDescriptor findClassifier(Name name, JavaClass javaClass) {
        if (!SpecialNames.INSTANCE.isSafeIdentifier(name)) {
            return null;
        }
        Set<String> invoke = this.knownClassNamesInPackage.invoke();
        if (javaClass == null && invoke != null && !invoke.contains(name.asString())) {
            return null;
        }
        return this.classes.invoke(new FindClassRequest(name, javaClass));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JvmMetadataVersion getJvmMetadataVersion() {
        return DeserializationHelpersKt.jvmMetadataVersionOrDefault(getC().getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KotlinClassLookupResult resolveKotlinBinaryClass(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass == null) {
            return KotlinClassLookupResult.NotFound.INSTANCE;
        }
        if (kotlinJvmBinaryClass.getClassHeader().getKind() == KotlinClassHeader.Kind.CLASS) {
            ClassDescriptor resolveClass = getC().getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
            if (resolveClass != null) {
                return new KotlinClassLookupResult.Found(resolveClass);
            }
            return KotlinClassLookupResult.NotFound.INSTANCE;
        }
        return KotlinClassLookupResult.SyntheticClass.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computeClassNames(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Name name;
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (!kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return SetsKt.emptySet();
        }
        Set<String> invoke = this.knownClassNamesInPackage.invoke();
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = invoke.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.identifier((String) it.next()));
            }
            return hashSet;
        }
        JavaPackage javaPackage = this.jPackage;
        if (function1 == null) {
            function1 = FunctionsKt.alwaysTrue();
        }
        Collection<JavaClass> classes = javaPackage.getClasses(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : classes) {
            if (javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE) {
                name = null;
            } else {
                name = javaClass.getName();
            }
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computeFunctionNames(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclaredMemberIndex computeMemberIndex() {
        return DeclaredMemberIndex.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(Collection<SimpleFunctionDescriptor> result, Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computePropertyNames(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return SetsKt.emptySet();
    }

    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(JavaClass javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        return findClassifier(javaClass.getName(), javaClass);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035 A[SYNTHETIC] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter r5, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter$Companion r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion
            int r1 = r0.getCLASSIFIERS_MASK()
            int r0 = r0.getNON_SINGLETON_CLASSIFIERS_MASK()
            r0 = r0 | r1
            boolean r5 = r5.acceptsKinds(r0)
            if (r5 != 0) goto L22
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r5 = (java.util.Collection) r5
            goto L67
        L22:
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r5 = r4.getAllDescriptors()
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L35:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r2
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            if (r3 == 0) goto L5f
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r2
            kotlin.reflect.jvm.internal.impl.name.Name r2 = r2.getName()
            java.lang.String r3 = "it.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5f
            r2 = 1
            goto L60
        L5f:
            r2 = 0
        L60:
            if (r2 == 0) goto L35
            r0.add(r1)
            goto L35
        L66:
            r5 = r0
        L67:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter, kotlin.jvm.functions.Function1):java.util.Collection");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassDescriptor mo1425getContributedClassifier(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return findClassifier(name, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public LazyJavaPackageFragment getOwnerDescriptor() {
        return this.ownerDescriptor;
    }
}

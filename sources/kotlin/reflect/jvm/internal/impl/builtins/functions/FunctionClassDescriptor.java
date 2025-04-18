package kotlin.reflect.jvm.internal.impl.builtins.functions;

import eb.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

@SourceDebugExtension({"SMAP\nFunctionClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n1549#2:140\n1620#2,3:141\n*S KotlinDebug\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor\n*L\n51#1:140\n51#1:141,3\n*E\n"})
/* loaded from: classes4.dex */
public final class FunctionClassDescriptor extends AbstractClassDescriptor {
    public static final Companion Companion = new Companion(null);
    private static final ClassId functionClassId = new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, Name.identifier("Function"));
    private static final ClassId kFunctionClassId = new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, Name.identifier("KFunction"));
    private final int arity;
    private final PackageFragmentDescriptor containingDeclaration;
    private final FunctionClassKind functionKind;
    private final FunctionClassScope memberScope;
    private final List<TypeParameterDescriptor> parameters;
    private final StorageManager storageManager;
    private final FunctionTypeConstructor typeConstructor;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(StorageManager storageManager, PackageFragmentDescriptor containingDeclaration, FunctionClassKind functionKind, int i10) {
        super(storageManager, functionKind.numberedClassName(i10));
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(functionKind, "functionKind");
        this.storageManager = storageManager;
        this.containingDeclaration = containingDeclaration;
        this.functionKind = functionKind;
        this.arity = i10;
        this.typeConstructor = new FunctionTypeConstructor();
        this.memberScope = new FunctionClassScope(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i10);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            _init_$typeParameter(arrayList, this, Variance.IN_VARIANCE, j.i("P", ((IntIterator) it).nextInt()));
            arrayList2.add(Unit.INSTANCE);
        }
        _init_$typeParameter(arrayList, this, Variance.OUT_VARIANCE, "R");
        this.parameters = CollectionsKt.toList(arrayList);
    }

    private static final void _init_$typeParameter(ArrayList<TypeParameterDescriptor> arrayList, FunctionClassDescriptor functionClassDescriptor, Variance variance, String str) {
        arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(functionClassDescriptor, Annotations.Companion.getEMPTY(), false, variance, Name.identifier(str), arrayList.size(), functionClassDescriptor.storageManager));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    public final int getArity() {
        return this.arity;
    }

    public Void getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.parameters;
    }

    public final FunctionClassKind getFunctionKind() {
        return this.functionKind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    public Void getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility PUBLIC = DescriptorVisibilities.PUBLIC;
        Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
        return PUBLIC;
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
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
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public String toString() {
        String asString = getName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "name.asString()");
        return asString;
    }

    @SourceDebugExtension({"SMAP\nFunctionClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor$FunctionTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n1549#2:140\n1620#2,2:141\n1549#2:143\n1620#2,3:144\n1622#2:147\n*S KotlinDebug\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor$FunctionTypeConstructor\n*L\n109#1:140\n109#1:141,2\n113#1:143\n113#1:144,3\n109#1:147\n*E\n"})
    /* loaded from: classes4.dex */
    public final class FunctionTypeConstructor extends AbstractClassTypeConstructor {

        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FunctionClassKind.values().length];
                try {
                    iArr[FunctionClassKind.Function.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FunctionClassKind.KFunction.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FunctionClassKind.SuspendFunction.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FunctionClassKind.KSuspendFunction.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public FunctionTypeConstructor() {
            super(FunctionClassDescriptor.this.storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public Collection<KotlinType> computeSupertypes() {
            List listOf;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            int i10 = WhenMappings.$EnumSwitchMapping$0[FunctionClassDescriptor.this.getFunctionKind().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            listOf = CollectionsKt.listOf((Object[]) new ClassId[]{FunctionClassDescriptor.kFunctionClassId, new ClassId(StandardNames.COROUTINES_PACKAGE_FQ_NAME, FunctionClassKind.SuspendFunction.numberedClassName(FunctionClassDescriptor.this.getArity()))});
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        listOf = CollectionsKt.listOf(FunctionClassDescriptor.functionClassId);
                    }
                } else {
                    listOf = CollectionsKt.listOf((Object[]) new ClassId[]{FunctionClassDescriptor.kFunctionClassId, new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, FunctionClassKind.Function.numberedClassName(FunctionClassDescriptor.this.getArity()))});
                }
            } else {
                listOf = CollectionsKt.listOf(FunctionClassDescriptor.functionClassId);
            }
            ModuleDescriptor containingDeclaration = FunctionClassDescriptor.this.containingDeclaration.getContainingDeclaration();
            List<ClassId> list = listOf;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (ClassId classId : list) {
                ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(containingDeclaration, classId);
                if (findClassAcrossModuleDependencies != null) {
                    List takeLast = CollectionsKt.takeLast(getParameters(), findClassAcrossModuleDependencies.getTypeConstructor().getParameters().size());
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(takeLast, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                    Iterator it = takeLast.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).getDefaultType()));
                    }
                    arrayList.add(KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), findClassAcrossModuleDependencies, arrayList2));
                } else {
                    throw new IllegalStateException(("Built-in class " + classId + " not found").toString());
                }
            }
            return CollectionsKt.toList(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            return FunctionClassDescriptor.this.parameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        public String toString() {
            return mo1423getDeclarationDescriptor().toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public FunctionClassDescriptor mo1423getDeclarationDescriptor() {
            return FunctionClassDescriptor.this;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassDescriptor mo1416getCompanionObjectDescriptor() {
        return (ClassDescriptor) getCompanionObjectDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ClassConstructorDescriptor> getConstructors() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PackageFragmentDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ClassDescriptor> getSealedSubclasses() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope.Empty getStaticScope() {
        return MemberScope.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public FunctionClassScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassConstructorDescriptor mo1417getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) getUnsubstitutedPrimaryConstructor();
    }
}

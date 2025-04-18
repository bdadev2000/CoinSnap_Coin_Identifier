package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes4.dex */
public final class DescriptorEquivalenceForOverrides {
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    private DescriptorEquivalenceForOverrides() {
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z10, boolean z11, boolean z12, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z10, z13, z12, kotlinTypeRefiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areCallableDescriptorsEquivalent$lambda$0(boolean z10, final CallableDescriptor a, final CallableDescriptor b3, TypeConstructor c12, TypeConstructor c22) {
        Intrinsics.checkNotNullParameter(a, "$a");
        Intrinsics.checkNotNullParameter(b3, "$b");
        Intrinsics.checkNotNullParameter(c12, "c1");
        Intrinsics.checkNotNullParameter(c22, "c2");
        if (Intrinsics.areEqual(c12, c22)) {
            return true;
        }
        ClassifierDescriptor mo1423getDeclarationDescriptor = c12.mo1423getDeclarationDescriptor();
        ClassifierDescriptor mo1423getDeclarationDescriptor2 = c22.mo1423getDeclarationDescriptor();
        if ((mo1423getDeclarationDescriptor instanceof TypeParameterDescriptor) && (mo1423getDeclarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) mo1423getDeclarationDescriptor, (TypeParameterDescriptor) mo1423getDeclarationDescriptor2, z10, new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
                    return Boolean.valueOf(Intrinsics.areEqual(declarationDescriptor, CallableDescriptor.this) && Intrinsics.areEqual(declarationDescriptor2, b3));
                }
            });
        }
        return false;
    }

    private final boolean areClassesEquivalent(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        return Intrinsics.areEqual(classDescriptor.getTypeConstructor(), classDescriptor2.getTypeConstructor());
    }

    public static /* synthetic */ boolean areEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return descriptorEquivalenceForOverrides.areEquivalent(declarationDescriptor, declarationDescriptor2, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function2 = new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
                    return Boolean.FALSE;
                }
            };
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, z10, function2);
    }

    private final boolean ownersEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2, boolean z10) {
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = declarationDescriptor2.getContainingDeclaration();
        if (!(containingDeclaration instanceof CallableMemberDescriptor) && !(containingDeclaration2 instanceof CallableMemberDescriptor)) {
            return areEquivalent$default(this, containingDeclaration, containingDeclaration2, z10, false, 8, null);
        }
        return function2.invoke(containingDeclaration, containingDeclaration2).booleanValue();
    }

    private final SourceElement singleSource(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "overriddenDescriptors");
            callableDescriptor = (CallableMemberDescriptor) CollectionsKt.singleOrNull(overriddenDescriptors);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }

    public final boolean areCallableDescriptorsEquivalent(final CallableDescriptor a, final CallableDescriptor b3, final boolean z10, boolean z11, boolean z12, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b3, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (Intrinsics.areEqual(a, b3)) {
            return true;
        }
        if (!Intrinsics.areEqual(a.getName(), b3.getName())) {
            return false;
        }
        if (z11 && (a instanceof MemberDescriptor) && (b3 instanceof MemberDescriptor) && ((MemberDescriptor) a).isExpect() != ((MemberDescriptor) b3).isExpect()) {
            return false;
        }
        if ((Intrinsics.areEqual(a.getContainingDeclaration(), b3.getContainingDeclaration()) && (!z10 || !Intrinsics.areEqual(singleSource(a), singleSource(b3)))) || DescriptorUtils.isLocal(a) || DescriptorUtils.isLocal(b3) || !ownersEquivalent(a, b3, new Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1
            @Override // kotlin.jvm.functions.Function2
            public final Boolean invoke(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
                return Boolean.FALSE;
            }
        }, z10)) {
            return false;
        }
        OverridingUtil create = OverridingUtil.create(kotlinTypeRefiner, new KotlinTypeChecker.TypeConstructorEquality(z10, a, b3) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$0
            private final boolean arg$0;
            private final CallableDescriptor arg$1;
            private final CallableDescriptor arg$2;

            {
                this.arg$0 = z10;
                this.arg$1 = a;
                this.arg$2 = b3;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
            public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
                boolean areCallableDescriptorsEquivalent$lambda$0;
                areCallableDescriptorsEquivalent$lambda$0 = DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent$lambda$0(this.arg$0, this.arg$1, this.arg$2, typeConstructor, typeConstructor2);
                return areCallableDescriptorsEquivalent$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(create, "create(kotlinTypeRefiner…= a && y == b }\n        }");
        OverridingUtil.OverrideCompatibilityInfo.Result result = create.isOverridableBy(a, b3, null, !z12).getResult();
        OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (result == result2 && create.isOverridableBy(b3, a, null, !z12).getResult() == result2) {
            return true;
        }
        return false;
    }

    public final boolean areEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z10, boolean z11) {
        if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            return areClassesEquivalent((ClassDescriptor) declarationDescriptor, (ClassDescriptor) declarationDescriptor2);
        }
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return areTypeParametersEquivalent$default(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z10, null, 8, null);
        }
        if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            return areCallableDescriptorsEquivalent$default(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z10, z11, false, KotlinTypeRefiner.Default.INSTANCE, 16, null);
        }
        if ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) {
            return Intrinsics.areEqual(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((PackageFragmentDescriptor) declarationDescriptor2).getFqName());
        }
        return Intrinsics.areEqual(declarationDescriptor, declarationDescriptor2);
    }

    @JvmOverloads
    public final boolean areTypeParametersEquivalent(TypeParameterDescriptor a, TypeParameterDescriptor b3, boolean z10) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b3, "b");
        return areTypeParametersEquivalent$default(this, a, b3, z10, null, 8, null);
    }

    @JvmOverloads
    public final boolean areTypeParametersEquivalent(TypeParameterDescriptor a, TypeParameterDescriptor b3, boolean z10, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> equivalentCallables) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b3, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.areEqual(a, b3)) {
            return true;
        }
        return !Intrinsics.areEqual(a.getContainingDeclaration(), b3.getContainingDeclaration()) && ownersEquivalent(a, b3, equivalentCallables, z10) && a.getIndex() == b3.getIndex();
    }
}

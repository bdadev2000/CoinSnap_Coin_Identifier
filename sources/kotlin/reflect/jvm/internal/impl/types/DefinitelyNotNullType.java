package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;

/* loaded from: classes4.dex */
public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeParameter, DefinitelyNotNullTypeMarker {
    public static final Companion Companion = new Companion(null);
    private final SimpleType original;
    private final boolean useCorrectedNullabilityForTypeParameters;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean canHaveUndefinedNullability(UnwrappedType unwrappedType) {
            if (!(unwrappedType.getConstructor() instanceof NewTypeVariableConstructor) && !(unwrappedType.getConstructor().mo1423getDeclarationDescriptor() instanceof TypeParameterDescriptor) && !(unwrappedType instanceof NewCapturedType) && !(unwrappedType instanceof StubTypeForBuilderInference)) {
                return false;
            }
            return true;
        }

        public static /* synthetic */ DefinitelyNotNullType makeDefinitelyNotNull$default(Companion companion, UnwrappedType unwrappedType, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return companion.makeDefinitelyNotNull(unwrappedType, z10, z11);
        }

        private final boolean makesSenseToBeDefinitelyNotNull(UnwrappedType unwrappedType, boolean z10) {
            TypeParameterDescriptorImpl typeParameterDescriptorImpl;
            boolean z11 = false;
            if (!canHaveUndefinedNullability(unwrappedType)) {
                return false;
            }
            if (unwrappedType instanceof StubTypeForBuilderInference) {
                return TypeUtils.isNullableType(unwrappedType);
            }
            ClassifierDescriptor mo1423getDeclarationDescriptor = unwrappedType.getConstructor().mo1423getDeclarationDescriptor();
            if (mo1423getDeclarationDescriptor instanceof TypeParameterDescriptorImpl) {
                typeParameterDescriptorImpl = (TypeParameterDescriptorImpl) mo1423getDeclarationDescriptor;
            } else {
                typeParameterDescriptorImpl = null;
            }
            if (typeParameterDescriptorImpl != null && !typeParameterDescriptorImpl.isInitialized()) {
                z11 = true;
            }
            if (z11) {
                return true;
            }
            if (z10 && (unwrappedType.getConstructor().mo1423getDeclarationDescriptor() instanceof TypeParameterDescriptor)) {
                return TypeUtils.isNullableType(unwrappedType);
            }
            return !NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType);
        }

        @JvmOverloads
        public final DefinitelyNotNullType makeDefinitelyNotNull(UnwrappedType type, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) type;
            }
            if (!z11 && !makesSenseToBeDefinitelyNotNull(type, z10)) {
                return null;
            }
            if (type instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) type;
                Intrinsics.areEqual(flexibleType.getLowerBound().getConstructor(), flexibleType.getUpperBound().getConstructor());
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.lowerIfFlexible(type).makeNullableAsSpecified(false), z10, null);
        }
    }

    public /* synthetic */ DefinitelyNotNullType(SimpleType simpleType, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public SimpleType getDelegate() {
        return this.original;
    }

    public final SimpleType getOriginal() {
        return this.original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        if (!(getDelegate().getConstructor() instanceof NewTypeVariableConstructor) && !(getDelegate().getConstructor().mo1423getDeclarationDescriptor() instanceof TypeParameterDescriptor)) {
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public KotlinType substitutionResult(KotlinType replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull(replacement.unwrap(), this.useCorrectedNullabilityForTypeParameters);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        return getDelegate() + " & Any";
    }

    private DefinitelyNotNullType(SimpleType simpleType, boolean z10) {
        this.original = simpleType;
        this.useCorrectedNullabilityForTypeParameters = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z10) {
        return z10 ? getDelegate().makeNullableAsSpecified(z10) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new DefinitelyNotNullType(getDelegate().replaceAttributes(newAttributes), this.useCorrectedNullabilityForTypeParameters);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public DefinitelyNotNullType replaceDelegate(SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new DefinitelyNotNullType(delegate, this.useCorrectedNullabilityForTypeParameters);
    }
}

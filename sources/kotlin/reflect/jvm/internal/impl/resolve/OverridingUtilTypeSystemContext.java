package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerStateKt;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RawTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* loaded from: classes4.dex */
public final class OverridingUtilTypeSystemContext implements ClassicTypeSystemContext {
    private final Function2<KotlinType, KotlinType, Boolean> customSubtype;
    private final KotlinTypeChecker.TypeConstructorEquality equalityAxioms;
    private final KotlinTypePreparator kotlinTypePreparator;
    private final KotlinTypeRefiner kotlinTypeRefiner;
    private final Map<TypeConstructor, TypeConstructor> matchingTypeConstructors;

    /* JADX WARN: Multi-variable type inference failed */
    public OverridingUtilTypeSystemContext(Map<TypeConstructor, ? extends TypeConstructor> map, KotlinTypeChecker.TypeConstructorEquality equalityAxioms, KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator, Function2<? super KotlinType, ? super KotlinType, Boolean> function2) {
        Intrinsics.checkNotNullParameter(equalityAxioms, "equalityAxioms");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        this.matchingTypeConstructors = map;
        this.equalityAxioms = equalityAxioms;
        this.kotlinTypeRefiner = kotlinTypeRefiner;
        this.kotlinTypePreparator = kotlinTypePreparator;
        this.customSubtype = function2;
    }

    private final boolean areEqualTypeConstructorsByAxioms(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        if (this.equalityAxioms.equals(typeConstructor, typeConstructor2)) {
            return true;
        }
        Map<TypeConstructor, TypeConstructor> map = this.matchingTypeConstructors;
        if (map == null) {
            return false;
        }
        TypeConstructor typeConstructor3 = map.get(typeConstructor);
        TypeConstructor typeConstructor4 = this.matchingTypeConstructors.get(typeConstructor2);
        if (typeConstructor3 != null && Intrinsics.areEqual(typeConstructor3, typeConstructor2)) {
            return true;
        }
        if (typeConstructor4 != null && Intrinsics.areEqual(typeConstructor4, typeConstructor)) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean areEqualTypeConstructors(TypeConstructorMarker c12, TypeConstructorMarker c22) {
        Intrinsics.checkNotNullParameter(c12, "c1");
        Intrinsics.checkNotNullParameter(c22, "c2");
        if (c12 instanceof TypeConstructor) {
            if (c22 instanceof TypeConstructor) {
                if (!ClassicTypeSystemContext.DefaultImpls.areEqualTypeConstructors(this, c12, c22) && !areEqualTypeConstructorsByAxioms((TypeConstructor) c12, (TypeConstructor) c22)) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int argumentsCount(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.argumentsCount(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentListMarker asArgumentList(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asArgumentList(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public CapturedTypeMarker asCapturedType(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asCapturedType(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public DefinitelyNotNullTypeMarker asDefinitelyNotNullType(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asDefinitelyNotNullType(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public DynamicTypeMarker asDynamicType(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asDynamicType(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public FlexibleTypeMarker asFlexibleType(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asFlexibleType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public RawTypeMarker asRawType(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asRawType(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker asSimpleType(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asSimpleType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentMarker asTypeArgument(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asTypeArgument(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker captureFromArguments(SimpleTypeMarker simpleTypeMarker, CaptureStatus captureStatus) {
        return ClassicTypeSystemContext.DefaultImpls.captureFromArguments(this, simpleTypeMarker, captureStatus);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public CaptureStatus captureStatus(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.captureStatus(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public KotlinTypeMarker createFlexibleType(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.createFlexibleType(this, simpleTypeMarker, simpleTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public List<SimpleTypeMarker> fastCorrespondingSupertypes(SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker constructor) {
        Intrinsics.checkNotNullParameter(simpleTypeMarker, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentMarker get(TypeArgumentListMarker typeArgumentListMarker, int i10) {
        Intrinsics.checkNotNullParameter(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return getArgument((KotlinTypeMarker) typeArgumentListMarker, i10);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            TypeArgumentMarker typeArgumentMarker = ((ArgumentList) typeArgumentListMarker).get(i10);
            Intrinsics.checkNotNullExpressionValue(typeArgumentMarker, "get(index)");
            return typeArgumentMarker;
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.getOrCreateKotlinClass(typeArgumentListMarker.getClass())).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentMarker getArgument(KotlinTypeMarker kotlinTypeMarker, int i10) {
        return ClassicTypeSystemContext.DefaultImpls.getArgument(this, kotlinTypeMarker, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentMarker getArgumentOrNull(SimpleTypeMarker simpleTypeMarker, int i10) {
        Intrinsics.checkNotNullParameter(simpleTypeMarker, "<this>");
        boolean z10 = false;
        if (i10 >= 0 && i10 < argumentsCount(simpleTypeMarker)) {
            z10 = true;
        }
        if (z10) {
            return getArgument(simpleTypeMarker, i10);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public List<TypeArgumentMarker> getArguments(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getArguments(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public FqNameUnsafe getClassFqNameUnsafe(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getClassFqNameUnsafe(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeParameterMarker getParameter(TypeConstructorMarker typeConstructorMarker, int i10) {
        return ClassicTypeSystemContext.DefaultImpls.getParameter(this, typeConstructorMarker, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public List<TypeParameterMarker> getParameters(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getParameters(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public PrimitiveType getPrimitiveArrayType(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getPrimitiveArrayType(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public PrimitiveType getPrimitiveType(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getPrimitiveType(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public KotlinTypeMarker getRepresentativeUpperBound(TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getRepresentativeUpperBound(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public KotlinTypeMarker getType(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getType(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeParameterMarker getTypeParameter(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getTypeParameter(this, typeVariableTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeParameterMarker getTypeParameterClassifier(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getTypeParameterClassifier(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public KotlinTypeMarker getUnsubstitutedUnderlyingType(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getUnsubstitutedUnderlyingType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public List<KotlinTypeMarker> getUpperBounds(TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getUpperBounds(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeVariance getVariance(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getVariance(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean hasAnnotation(KotlinTypeMarker kotlinTypeMarker, FqName fqName) {
        return ClassicTypeSystemContext.DefaultImpls.hasAnnotation(this, kotlinTypeMarker, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean hasFlexibleNullability(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        if (isMarkedNullable(lowerBoundIfFlexible(kotlinTypeMarker)) != isMarkedNullable(upperBoundIfFlexible(kotlinTypeMarker))) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean hasRecursiveBounds(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.hasRecursiveBounds(this, typeParameterMarker, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    public boolean identicalArguments(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.identicalArguments(this, simpleTypeMarker, simpleTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public KotlinTypeMarker intersectTypes(List<? extends KotlinTypeMarker> list) {
        return ClassicTypeSystemContext.DefaultImpls.intersectTypes(this, list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isAnyConstructor(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isAnyConstructor(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isCapturedType(KotlinTypeMarker kotlinTypeMarker) {
        CapturedTypeMarker capturedTypeMarker;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        SimpleTypeMarker asSimpleType = asSimpleType(kotlinTypeMarker);
        if (asSimpleType != null) {
            capturedTypeMarker = asCapturedType(asSimpleType);
        } else {
            capturedTypeMarker = null;
        }
        if (capturedTypeMarker != null) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isClassType(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.checkNotNullParameter(simpleTypeMarker, "<this>");
        return isClassTypeConstructor(typeConstructor(simpleTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isClassTypeConstructor(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isClassTypeConstructor(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isCommonFinalClassConstructor(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isCommonFinalClassConstructor(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isDefinitelyNotNullType(KotlinTypeMarker kotlinTypeMarker) {
        DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        SimpleTypeMarker asSimpleType = asSimpleType(kotlinTypeMarker);
        if (asSimpleType != null) {
            definitelyNotNullTypeMarker = asDefinitelyNotNullType(asSimpleType);
        } else {
            definitelyNotNullTypeMarker = null;
        }
        if (definitelyNotNullTypeMarker != null) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isDenotable(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isDenotable(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isDynamic(KotlinTypeMarker kotlinTypeMarker) {
        DynamicTypeMarker dynamicTypeMarker;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker asFlexibleType = asFlexibleType(kotlinTypeMarker);
        if (asFlexibleType != null) {
            dynamicTypeMarker = asDynamicType(asFlexibleType);
        } else {
            dynamicTypeMarker = null;
        }
        if (dynamicTypeMarker != null) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isError(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isError(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean isInlineClass(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isInlineClass(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isIntegerLiteralType(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.checkNotNullParameter(simpleTypeMarker, "<this>");
        return isIntegerLiteralTypeConstructor(typeConstructor(simpleTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isIntegerLiteralTypeConstructor(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isIntegerLiteralTypeConstructor(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isIntersection(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isIntersection(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isMarkedNullable(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isMarkedNullable(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNotNullTypeParameter(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isNotNullTypeParameter(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNothing(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        if (isNothingConstructor(typeConstructor(kotlinTypeMarker)) && !isNullableType(kotlinTypeMarker)) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNothingConstructor(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isNothingConstructor(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNullableType(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isNullableType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isOldCapturedType(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isOldCapturedType(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isPrimitiveType(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isPrimitiveType(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isProjectionNotNull(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isProjectionNotNull(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isSingleClassifierType(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isSingleClassifierType(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isStarProjection(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isStarProjection(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isStubType(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isStubType(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isStubTypeForBuilderInference(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isStubTypeForBuilderInference(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isTypeVariableType(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isTypeVariableType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean isUnderKotlinPackage(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isUnderKotlinPackage(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker lowerBound(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.lowerBound(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker lowerBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        SimpleTypeMarker lowerBound;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker asFlexibleType = asFlexibleType(kotlinTypeMarker);
        if (asFlexibleType == null || (lowerBound = lowerBound(asFlexibleType)) == null) {
            SimpleTypeMarker asSimpleType = asSimpleType(kotlinTypeMarker);
            Intrinsics.checkNotNull(asSimpleType);
            return asSimpleType;
        }
        return lowerBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public KotlinTypeMarker lowerType(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.lowerType(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public KotlinTypeMarker makeDefinitelyNotNullOrNotNull(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.makeDefinitelyNotNullOrNotNull(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public KotlinTypeMarker makeNullable(KotlinTypeMarker kotlinTypeMarker) {
        SimpleTypeMarker withNullability;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        SimpleTypeMarker asSimpleType = asSimpleType(kotlinTypeMarker);
        if (asSimpleType != null && (withNullability = withNullability(asSimpleType, true)) != null) {
            return withNullability;
        }
        return kotlinTypeMarker;
    }

    public TypeCheckerState newTypeCheckerState(final boolean z10, final boolean z11) {
        if (this.customSubtype == null) {
            return ClassicTypeCheckerStateKt.createClassicTypeCheckerState(z10, z11, this, this.kotlinTypePreparator, this.kotlinTypeRefiner);
        }
        final KotlinTypePreparator kotlinTypePreparator = this.kotlinTypePreparator;
        final KotlinTypeRefiner kotlinTypeRefiner = this.kotlinTypeRefiner;
        return new TypeCheckerState(z10, z11, this, kotlinTypePreparator, kotlinTypeRefiner) { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilTypeSystemContext$newTypeCheckerState$1
            final /* synthetic */ OverridingUtilTypeSystemContext this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
            public boolean customIsSubtypeOf(KotlinTypeMarker subType, KotlinTypeMarker superType) {
                Function2 function2;
                Intrinsics.checkNotNullParameter(subType, "subType");
                Intrinsics.checkNotNullParameter(superType, "superType");
                if (subType instanceof KotlinType) {
                    if (superType instanceof KotlinType) {
                        function2 = this.this$0.customSubtype;
                        return ((Boolean) function2.invoke(subType, superType)).booleanValue();
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker original(DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.original(this, definitelyNotNullTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker originalIfDefinitelyNotNullable(SimpleTypeMarker simpleTypeMarker) {
        SimpleTypeMarker original;
        Intrinsics.checkNotNullParameter(simpleTypeMarker, "<this>");
        DefinitelyNotNullTypeMarker asDefinitelyNotNullType = asDefinitelyNotNullType(simpleTypeMarker);
        if (asDefinitelyNotNullType != null && (original = original(asDefinitelyNotNullType)) != null) {
            return original;
        }
        return simpleTypeMarker;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int parametersCount(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.parametersCount(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public Collection<KotlinTypeMarker> possibleIntegerTypes(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.possibleIntegerTypes(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentMarker projection(CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.projection(this, capturedTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int size(TypeArgumentListMarker typeArgumentListMarker) {
        Intrinsics.checkNotNullParameter(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return argumentsCount((KotlinTypeMarker) typeArgumentListMarker);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            return ((ArgumentList) typeArgumentListMarker).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.getOrCreateKotlinClass(typeArgumentListMarker.getClass())).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.substitutionSupertypePolicy(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public Collection<KotlinTypeMarker> supertypes(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.supertypes(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public CapturedTypeConstructorMarker typeConstructor(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.typeConstructor((ClassicTypeSystemContext) this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker upperBound(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.upperBound(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker upperBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        SimpleTypeMarker upperBound;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker asFlexibleType = asFlexibleType(kotlinTypeMarker);
        if (asFlexibleType == null || (upperBound = upperBound(asFlexibleType)) == null) {
            SimpleTypeMarker asSimpleType = asSimpleType(kotlinTypeMarker);
            Intrinsics.checkNotNull(asSimpleType);
            return asSimpleType;
        }
        return upperBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public KotlinTypeMarker withNullability(KotlinTypeMarker kotlinTypeMarker, boolean z10) {
        return ClassicTypeSystemContext.DefaultImpls.withNullability(this, kotlinTypeMarker, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeVariance getVariance(TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getVariance(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isMarkedNullable(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return (kotlinTypeMarker instanceof SimpleTypeMarker) && isMarkedNullable((SimpleTypeMarker) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeConstructorMarker typeConstructor(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.typeConstructor(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker withNullability(SimpleTypeMarker simpleTypeMarker, boolean z10) {
        return ClassicTypeSystemContext.DefaultImpls.withNullability((ClassicTypeSystemContext) this, simpleTypeMarker, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeConstructorMarker typeConstructor(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        SimpleTypeMarker asSimpleType = asSimpleType(kotlinTypeMarker);
        if (asSimpleType == null) {
            asSimpleType = lowerBoundIfFlexible(kotlinTypeMarker);
        }
        return typeConstructor(asSimpleType);
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension({"SMAP\nRawSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,3:97\n*S KotlinDebug\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n*L\n73#1:96\n73#1:97,3\n*E\n"})
/* loaded from: classes4.dex */
public final class RawSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);
    private static final JavaTypeAttributes lowerTypeAttr;
    private static final JavaTypeAttributes upperTypeAttr;
    private final RawProjectionComputer projectionComputer;
    private final TypeParameterUpperBoundEraser typeParameterUpperBoundEraser;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        lowerTypeAttr = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        upperTypeAttr = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<SimpleType, Boolean> eraseInflexibleBasedOnClassDescriptor(final SimpleType simpleType, final ClassDescriptor classDescriptor, final JavaTypeAttributes javaTypeAttributes) {
        int collectionSizeOrDefault;
        if (simpleType.getConstructor().getParameters().isEmpty()) {
            return TuplesKt.to(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.isArray(simpleType)) {
            TypeProjection typeProjection = simpleType.getArguments().get(0);
            Variance projectionKind = typeProjection.getProjectionKind();
            KotlinType type = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type, "componentTypeProjection.type");
            return TuplesKt.to(KotlinTypeFactory.simpleType$default(simpleType.getAttributes(), simpleType.getConstructor(), CollectionsKt.listOf(new TypeProjectionImpl(projectionKind, eraseType(type, javaTypeAttributes))), simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null), Boolean.FALSE);
        }
        if (KotlinTypeKt.isError(simpleType)) {
            return TuplesKt.to(ErrorUtils.createErrorType(ErrorTypeKind.ERROR_RAW_TYPE, simpleType.getConstructor().toString()), Boolean.FALSE);
        }
        MemberScope memberScope = classDescriptor.getMemberScope(this);
        Intrinsics.checkNotNullExpressionValue(memberScope, "declaration.getMemberScope(this)");
        TypeAttributes attributes = simpleType.getAttributes();
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "declaration.typeConstructor");
        List<TypeParameterDescriptor> parameters = classDescriptor.getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "declaration.typeConstructor.parameters");
        List<TypeParameterDescriptor> list = parameters;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (TypeParameterDescriptor parameter : list) {
            RawProjectionComputer rawProjectionComputer = this.projectionComputer;
            Intrinsics.checkNotNullExpressionValue(parameter, "parameter");
            arrayList.add(ErasureProjectionComputer.computeProjection$default(rawProjectionComputer, parameter, javaTypeAttributes, this.typeParameterUpperBoundEraser, null, 8, null));
        }
        return TuplesKt.to(KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(attributes, typeConstructor, arrayList, simpleType.isMarkedNullable(), memberScope, new Function1<KotlinTypeRefiner, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SimpleType invoke(KotlinTypeRefiner kotlinTypeRefiner) {
                ClassId classId;
                ClassDescriptor findClassAcrossModuleDependencies;
                Pair eraseInflexibleBasedOnClassDescriptor;
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                ClassDescriptor classDescriptor2 = ClassDescriptor.this;
                if (!(classDescriptor2 instanceof ClassDescriptor)) {
                    classDescriptor2 = null;
                }
                if (classDescriptor2 == null || (classId = DescriptorUtilsKt.getClassId(classDescriptor2)) == null || (findClassAcrossModuleDependencies = kotlinTypeRefiner.findClassAcrossModuleDependencies(classId)) == null || Intrinsics.areEqual(findClassAcrossModuleDependencies, ClassDescriptor.this)) {
                    return null;
                }
                eraseInflexibleBasedOnClassDescriptor = this.eraseInflexibleBasedOnClassDescriptor(simpleType, findClassAcrossModuleDependencies, javaTypeAttributes);
                return (SimpleType) eraseInflexibleBasedOnClassDescriptor.getFirst();
            }
        }), Boolean.TRUE);
    }

    private final KotlinType eraseType(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor mo1423getDeclarationDescriptor = kotlinType.getConstructor().mo1423getDeclarationDescriptor();
        if (mo1423getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return eraseType(this.typeParameterUpperBoundEraser.getErasedUpperBound((TypeParameterDescriptor) mo1423getDeclarationDescriptor, javaTypeAttributes.markIsRaw(true)), javaTypeAttributes);
        }
        if (mo1423getDeclarationDescriptor instanceof ClassDescriptor) {
            ClassifierDescriptor mo1423getDeclarationDescriptor2 = FlexibleTypesKt.upperIfFlexible(kotlinType).getConstructor().mo1423getDeclarationDescriptor();
            if (mo1423getDeclarationDescriptor2 instanceof ClassDescriptor) {
                Pair<SimpleType, Boolean> eraseInflexibleBasedOnClassDescriptor = eraseInflexibleBasedOnClassDescriptor(FlexibleTypesKt.lowerIfFlexible(kotlinType), (ClassDescriptor) mo1423getDeclarationDescriptor, lowerTypeAttr);
                SimpleType component1 = eraseInflexibleBasedOnClassDescriptor.component1();
                boolean booleanValue = eraseInflexibleBasedOnClassDescriptor.component2().booleanValue();
                Pair<SimpleType, Boolean> eraseInflexibleBasedOnClassDescriptor2 = eraseInflexibleBasedOnClassDescriptor(FlexibleTypesKt.upperIfFlexible(kotlinType), (ClassDescriptor) mo1423getDeclarationDescriptor2, upperTypeAttr);
                SimpleType component12 = eraseInflexibleBasedOnClassDescriptor2.component1();
                boolean booleanValue2 = eraseInflexibleBasedOnClassDescriptor2.component2().booleanValue();
                if (!booleanValue && !booleanValue2) {
                    return KotlinTypeFactory.flexibleType(component1, component12);
                }
                return new RawTypeImpl(component1, component12);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + mo1423getDeclarationDescriptor2 + "\" while for lower it's \"" + mo1423getDeclarationDescriptor + '\"').toString());
        }
        throw new IllegalStateException(("Unexpected declaration kind: " + mo1423getDeclarationDescriptor).toString());
    }

    public static /* synthetic */ KotlinType eraseType$default(RawSubstitution rawSubstitution, KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            javaTypeAttributes = new JavaTypeAttributes(TypeUsage.COMMON, null, false, false, null, null, 62, null);
        }
        return rawSubstitution.eraseType(kotlinType, javaTypeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    public RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.projectionComputer = rawProjectionComputer;
        this.typeParameterUpperBoundEraser = typeParameterUpperBoundEraser == null ? new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, null) : typeParameterUpperBoundEraser;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get */
    public TypeProjectionImpl mo1428get(KotlinType key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new TypeProjectionImpl(eraseType$default(this, key, null, 2, null));
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}

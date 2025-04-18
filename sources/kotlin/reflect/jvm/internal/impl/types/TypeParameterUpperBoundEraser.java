package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1179#2,2:159\n1253#2,4:161\n1549#2:166\n1620#2,3:167\n1#3:165\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n*L\n77#1:159,2\n77#1:161,4\n100#1:166\n100#1:167,3\n*E\n"})
/* loaded from: classes4.dex */
public final class TypeParameterUpperBoundEraser {
    public static final Companion Companion = new Companion(null);
    private final Lazy erroneousErasedBound$delegate;
    private final MemoizedFunctionToNotNull<DataToEraseUpperBound, KotlinType> getErasedUpperBound;
    private final TypeParameterErasureOptions options;
    private final ErasureProjectionComputer projectionComputer;
    private final LockBasedStorageManager storage;

    @SourceDebugExtension({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n+ 2 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n261#2,14:159\n276#2:177\n1549#3:173\n1620#3,3:174\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n*L\n140#1:159,14\n140#1:177\n140#1:173\n140#1:174,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00b2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x014b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01ed A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.reflect.jvm.internal.impl.types.KotlinType replaceArgumentsOfUpperBound(kotlin.reflect.jvm.internal.impl.types.KotlinType r17, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r18, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> r19, boolean r20) {
            /*
                Method dump skipped, instructions count: 526
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.Companion.replaceArgumentsOfUpperBound(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor, java.util.Set, boolean):kotlin.reflect.jvm.internal.impl.types.KotlinType");
        }
    }

    /* loaded from: classes4.dex */
    public static final class DataToEraseUpperBound {
        private final ErasureTypeAttributes typeAttr;
        private final TypeParameterDescriptor typeParameter;

        public DataToEraseUpperBound(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
            this.typeParameter = typeParameter;
            this.typeAttr = typeAttr;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof DataToEraseUpperBound)) {
                return false;
            }
            DataToEraseUpperBound dataToEraseUpperBound = (DataToEraseUpperBound) obj;
            if (!Intrinsics.areEqual(dataToEraseUpperBound.typeParameter, this.typeParameter) || !Intrinsics.areEqual(dataToEraseUpperBound.typeAttr, this.typeAttr)) {
                return false;
            }
            return true;
        }

        public final ErasureTypeAttributes getTypeAttr() {
            return this.typeAttr;
        }

        public final TypeParameterDescriptor getTypeParameter() {
            return this.typeParameter;
        }

        public int hashCode() {
            int hashCode = this.typeParameter.hashCode();
            return this.typeAttr.hashCode() + (hashCode * 31) + hashCode;
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.typeParameter + ", typeAttr=" + this.typeAttr + ')';
        }
    }

    public TypeParameterUpperBoundEraser(ErasureProjectionComputer projectionComputer, TypeParameterErasureOptions options) {
        Intrinsics.checkNotNullParameter(projectionComputer, "projectionComputer");
        Intrinsics.checkNotNullParameter(options, "options");
        this.projectionComputer = projectionComputer;
        this.options = options;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.storage = lockBasedStorageManager;
        this.erroneousErasedBound$delegate = LazyKt.lazy(new Function0<ErrorType>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$erroneousErasedBound$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ErrorType invoke() {
                return ErrorUtils.createErrorType(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, TypeParameterUpperBoundEraser.this.toString());
            }
        });
        MemoizedFunctionToNotNull<DataToEraseUpperBound, KotlinType> createMemoizedFunction = lockBasedStorageManager.createMemoizedFunction(new Function1<DataToEraseUpperBound, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$getErasedUpperBound$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final KotlinType invoke(TypeParameterUpperBoundEraser.DataToEraseUpperBound dataToEraseUpperBound) {
                KotlinType erasedUpperBoundInternal;
                erasedUpperBoundInternal = TypeParameterUpperBoundEraser.this.getErasedUpperBoundInternal(dataToEraseUpperBound.getTypeParameter(), dataToEraseUpperBound.getTypeAttr());
                return erasedUpperBoundInternal;
            }
        });
        Intrinsics.checkNotNullExpressionValue(createMemoizedFunction, "storage.createMemoizedFu…ameter, typeAttr) }\n    }");
        this.getErasedUpperBound = createMemoizedFunction;
    }

    private final KotlinType getDefaultType(ErasureTypeAttributes erasureTypeAttributes) {
        KotlinType replaceArgumentsWithStarProjections;
        SimpleType defaultType = erasureTypeAttributes.getDefaultType();
        return (defaultType == null || (replaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) == null) ? getErroneousErasedBound() : replaceArgumentsWithStarProjections;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KotlinType getErasedUpperBoundInternal(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        TypeProjection computeProjection;
        Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
        if (visitedTypeParameters != null && visitedTypeParameters.contains(typeParameterDescriptor.getOriginal())) {
            return getDefaultType(erasureTypeAttributes);
        }
        SimpleType defaultType = typeParameterDescriptor.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "typeParameter.defaultType");
        Set<TypeParameterDescriptor> extractTypeParametersFromUpperBounds = TypeUtilsKt.extractTypeParametersFromUpperBounds(defaultType, visitedTypeParameters);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(extractTypeParametersFromUpperBounds, 10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
        for (TypeParameterDescriptor typeParameterDescriptor2 : extractTypeParametersFromUpperBounds) {
            if (visitedTypeParameters != null && visitedTypeParameters.contains(typeParameterDescriptor2)) {
                computeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor2, erasureTypeAttributes);
                Intrinsics.checkNotNullExpressionValue(computeProjection, "makeStarProjection(it, typeAttr)");
            } else {
                computeProjection = this.projectionComputer.computeProjection(typeParameterDescriptor2, erasureTypeAttributes, this, getErasedUpperBound(typeParameterDescriptor2, erasureTypeAttributes.withNewVisitedTypeParameter(typeParameterDescriptor)));
            }
            Pair pair = TuplesKt.to(typeParameterDescriptor2.getTypeConstructor(), computeProjection);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        boolean z10 = false;
        TypeSubstitutor create = TypeSubstitutor.create(TypeConstructorSubstitution.Companion.createByConstructorsMap$default(TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
        Intrinsics.checkNotNullExpressionValue(create, "create(TypeConstructorSu…ap(erasedTypeParameters))");
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "typeParameter.upperBounds");
        Set<KotlinType> substituteErasedUpperBounds = substituteErasedUpperBounds(create, upperBounds, erasureTypeAttributes);
        if (!substituteErasedUpperBounds.isEmpty()) {
            if (!this.options.getIntersectUpperBounds()) {
                if (substituteErasedUpperBounds.size() == 1) {
                    z10 = true;
                }
                if (z10) {
                    return (KotlinType) CollectionsKt.single(substituteErasedUpperBounds);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
            }
            List list = CollectionsKt.toList(substituteErasedUpperBounds);
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((KotlinType) it.next()).unwrap());
            }
            return IntersectionTypeKt.intersectTypes(arrayList);
        }
        return getDefaultType(erasureTypeAttributes);
    }

    private final ErrorType getErroneousErasedBound() {
        return (ErrorType) this.erroneousErasedBound$delegate.getValue();
    }

    private final Set<KotlinType> substituteErasedUpperBounds(TypeSubstitutor typeSubstitutor, List<? extends KotlinType> list, ErasureTypeAttributes erasureTypeAttributes) {
        Set createSetBuilder = SetsKt.createSetBuilder();
        for (KotlinType kotlinType : list) {
            ClassifierDescriptor mo1423getDeclarationDescriptor = kotlinType.getConstructor().mo1423getDeclarationDescriptor();
            if (mo1423getDeclarationDescriptor instanceof ClassDescriptor) {
                createSetBuilder.add(Companion.replaceArgumentsOfUpperBound(kotlinType, typeSubstitutor, erasureTypeAttributes.getVisitedTypeParameters(), this.options.getLeaveNonTypeParameterTypes()));
            } else if (mo1423getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
                boolean z10 = false;
                if (visitedTypeParameters != null && visitedTypeParameters.contains(mo1423getDeclarationDescriptor)) {
                    z10 = true;
                }
                if (z10) {
                    createSetBuilder.add(getDefaultType(erasureTypeAttributes));
                } else {
                    List<KotlinType> upperBounds = ((TypeParameterDescriptor) mo1423getDeclarationDescriptor).getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds, "declaration.upperBounds");
                    createSetBuilder.addAll(substituteErasedUpperBounds(typeSubstitutor, upperBounds, erasureTypeAttributes));
                }
            }
            if (!this.options.getIntersectUpperBounds()) {
                break;
            }
        }
        return SetsKt.build(createSetBuilder);
    }

    public final KotlinType getErasedUpperBound(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        KotlinType invoke = this.getErasedUpperBound.invoke(new DataToEraseUpperBound(typeParameter, typeAttr));
        Intrinsics.checkNotNullExpressionValue(invoke, "getErasedUpperBound(Data…typeParameter, typeAttr))");
        return invoke;
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer, TypeParameterErasureOptions typeParameterErasureOptions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(erasureProjectionComputer, (i10 & 2) != 0 ? new TypeParameterErasureOptions(false, false) : typeParameterErasureOptions);
    }
}

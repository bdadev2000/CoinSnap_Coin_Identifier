package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TypeSystemContext.kt\norg/jetbrains/kotlin/types/model/TypeSystemContextKt\n*L\n1#1,835:1\n1#2:836\n1#2:853\n1#2:905\n1#2:943\n132#3,16:837\n148#3,13:854\n46#3,8:875\n132#3,16:889\n148#3,13:906\n132#3,16:927\n148#3,13:944\n1549#4:867\n1620#4,3:868\n1549#4:871\n1620#4,3:872\n1726#4,3:883\n1726#4,3:886\n766#4:919\n857#4:920\n858#4:926\n1360#4:957\n1446#4,5:958\n1747#4,3:963\n1747#4,3:966\n556#5,5:921\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n*L\n342#1:853\n622#1:905\n692#1:943\n342#1:837,16\n342#1:854,13\n475#1:875,8\n622#1:889,16\n622#1:906,13\n692#1:927,16\n692#1:944,13\n378#1:867\n378#1:868,3\n389#1:871\n389#1:872,3\n561#1:883,3\n572#1:886,3\n667#1:919\n667#1:920\n667#1:926\n701#1:957\n701#1:958,5\n295#1:963,3\n303#1:966,3\n668#1:921,5\n*E\n"})
/* loaded from: classes4.dex */
public final class AbstractTypeChecker {
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();

    @JvmField
    public static boolean RUN_SLOW_ASSERTIONS;

    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private AbstractTypeChecker() {
    }

    private final Boolean checkSubtypeForIntegerLiteralType(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (!typeSystemContext.isIntegerLiteralType(simpleTypeMarker) && !typeSystemContext.isIntegerLiteralType(simpleTypeMarker2)) {
            return null;
        }
        if (checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeOrCapturedOne(typeSystemContext, simpleTypeMarker) && checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeOrCapturedOne(typeSystemContext, simpleTypeMarker2)) {
            return Boolean.TRUE;
        }
        if (typeSystemContext.isIntegerLiteralType(simpleTypeMarker)) {
            if (checkSubtypeForIntegerLiteralType$lambda$7$isTypeInIntegerLiteralType(typeSystemContext, typeCheckerState, simpleTypeMarker, simpleTypeMarker2, false)) {
                return Boolean.TRUE;
            }
        } else if (typeSystemContext.isIntegerLiteralType(simpleTypeMarker2) && (checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeInIntersectionComponents(typeSystemContext, simpleTypeMarker) || checkSubtypeForIntegerLiteralType$lambda$7$isTypeInIntegerLiteralType(typeSystemContext, typeCheckerState, simpleTypeMarker2, simpleTypeMarker, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean checkSubtypeForIntegerLiteralType$lambda$7$isCapturedIntegerLiteralType(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
        if (!(simpleTypeMarker instanceof CapturedTypeMarker)) {
            return false;
        }
        TypeArgumentMarker projection = typeSystemContext.projection(typeSystemContext.typeConstructor((CapturedTypeMarker) simpleTypeMarker));
        if (typeSystemContext.isStarProjection(projection) || !typeSystemContext.isIntegerLiteralType(typeSystemContext.upperBoundIfFlexible(typeSystemContext.getType(projection)))) {
            return false;
        }
        return true;
    }

    private static final boolean checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeInIntersectionComponents(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
        boolean z10;
        boolean z11;
        TypeConstructorMarker typeConstructor = typeSystemContext.typeConstructor(simpleTypeMarker);
        if (!(typeConstructor instanceof IntersectionTypeConstructorMarker)) {
            return false;
        }
        Collection<KotlinTypeMarker> supertypes = typeSystemContext.supertypes(typeConstructor);
        if (!(supertypes instanceof Collection) || !supertypes.isEmpty()) {
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                SimpleTypeMarker asSimpleType = typeSystemContext.asSimpleType((KotlinTypeMarker) it.next());
                if (asSimpleType != null && typeSystemContext.isIntegerLiteralType(asSimpleType)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!z11) {
            return false;
        }
        return true;
    }

    private static final boolean checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeOrCapturedOne(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
        return typeSystemContext.isIntegerLiteralType(simpleTypeMarker) || checkSubtypeForIntegerLiteralType$lambda$7$isCapturedIntegerLiteralType(typeSystemContext, simpleTypeMarker);
    }

    private static final boolean checkSubtypeForIntegerLiteralType$lambda$7$isTypeInIntegerLiteralType(TypeSystemContext typeSystemContext, TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2, boolean z10) {
        boolean z11;
        Collection<KotlinTypeMarker> possibleIntegerTypes = typeSystemContext.possibleIntegerTypes(simpleTypeMarker);
        if ((possibleIntegerTypes instanceof Collection) && possibleIntegerTypes.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : possibleIntegerTypes) {
            if (!Intrinsics.areEqual(typeSystemContext.typeConstructor(kotlinTypeMarker), typeSystemContext.typeConstructor(simpleTypeMarker2)) && (!z10 || !isSubtypeOf$default(INSTANCE, typeCheckerState, simpleTypeMarker2, kotlinTypeMarker, false, 8, null))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0131, code lost:
    
        if (r10 != false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Boolean checkSubtypeForSpecialCases(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r15, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r16, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r17) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.checkSubtypeForSpecialCases(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker):java.lang.Boolean");
    }

    private final List<SimpleTypeMarker> collectAllSupertypesWithGivenTypeConstructor(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        String joinToString$default;
        TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        List<SimpleTypeMarker> fastCorrespondingSupertypes = typeSystemContext.fastCorrespondingSupertypes(simpleTypeMarker, typeConstructorMarker);
        if (fastCorrespondingSupertypes != null) {
            return fastCorrespondingSupertypes;
        }
        if (!typeSystemContext.isClassTypeConstructor(typeConstructorMarker) && typeSystemContext.isClassType(simpleTypeMarker)) {
            return CollectionsKt.emptyList();
        }
        if (typeSystemContext.isCommonFinalClassConstructor(typeConstructorMarker)) {
            if (typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(simpleTypeMarker), typeConstructorMarker)) {
                SimpleTypeMarker captureFromArguments = typeSystemContext.captureFromArguments(simpleTypeMarker, CaptureStatus.FOR_SUBTYPING);
                if (captureFromArguments != null) {
                    simpleTypeMarker = captureFromArguments;
                }
                return CollectionsKt.listOf(simpleTypeMarker);
            }
            return CollectionsKt.emptyList();
        }
        SmartList smartList = new SmartList();
        typeCheckerState.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<SimpleTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(simpleTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() <= 1000) {
                SimpleTypeMarker current = supertypesDeque.pop();
                Intrinsics.checkNotNullExpressionValue(current, "current");
                if (supertypesSet.add(current)) {
                    SimpleTypeMarker captureFromArguments2 = typeSystemContext.captureFromArguments(current, CaptureStatus.FOR_SUBTYPING);
                    if (captureFromArguments2 == null) {
                        captureFromArguments2 = current;
                    }
                    if (typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(captureFromArguments2), typeConstructorMarker)) {
                        smartList.add(captureFromArguments2);
                        substitutionSupertypePolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                    } else if (typeSystemContext.argumentsCount(captureFromArguments2) == 0) {
                        substitutionSupertypePolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                    } else {
                        substitutionSupertypePolicy = typeCheckerState.getTypeSystemContext().substitutionSupertypePolicy(captureFromArguments2);
                    }
                    if (!(!Intrinsics.areEqual(substitutionSupertypePolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE))) {
                        substitutionSupertypePolicy = null;
                    }
                    if (substitutionSupertypePolicy != null) {
                        TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                        Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(current)).iterator();
                        while (it.hasNext()) {
                            supertypesDeque.add(substitutionSupertypePolicy.mo1427transformType(typeCheckerState, it.next()));
                        }
                    }
                }
            } else {
                StringBuilder p10 = a.p("Too many supertypes for type: ", simpleTypeMarker, ". Supertypes = ");
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null);
                p10.append(joinToString$default);
                throw new IllegalStateException(p10.toString().toString());
            }
        }
        typeCheckerState.clear();
        return smartList;
    }

    private final List<SimpleTypeMarker> collectAndFilter(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return selectOnlyPureKotlinSupertypes(typeCheckerState, collectAllSupertypesWithGivenTypeConstructor(typeCheckerState, simpleTypeMarker, typeConstructorMarker));
    }

    private final boolean completeIsSubTypeOf(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z10) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        KotlinTypeMarker prepareType = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker));
        KotlinTypeMarker prepareType2 = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker2));
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        Boolean checkSubtypeForSpecialCases = abstractTypeChecker.checkSubtypeForSpecialCases(typeCheckerState, typeSystemContext.lowerBoundIfFlexible(prepareType), typeSystemContext.upperBoundIfFlexible(prepareType2));
        if (checkSubtypeForSpecialCases != null) {
            boolean booleanValue = checkSubtypeForSpecialCases.booleanValue();
            typeCheckerState.addSubtypeConstraint(prepareType, prepareType2, z10);
            return booleanValue;
        }
        Boolean addSubtypeConstraint = typeCheckerState.addSubtypeConstraint(prepareType, prepareType2, z10);
        if (addSubtypeConstraint != null) {
            return addSubtypeConstraint.booleanValue();
        }
        return abstractTypeChecker.isSubtypeOfForSingleClassifierType(typeCheckerState, typeSystemContext.lowerBoundIfFlexible(prepareType), typeSystemContext.upperBoundIfFlexible(prepareType2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        return r8.getParameter(r8.typeConstructor(r9), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getTypeParameterForArgumentInBaseIfItEqualToTarget(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r8, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r9, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r10) {
        /*
            r7 = this;
            int r0 = r8.argumentsCount(r9)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L67
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker r4 = r8.getArgument(r9, r2)
            boolean r5 = r8.isStarProjection(r4)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L16
            r3 = r4
        L16:
            if (r3 == 0) goto L64
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r3 = r8.getType(r3)
            if (r3 != 0) goto L1f
            goto L64
        L1f:
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r4 = r8.lowerBoundIfFlexible(r3)
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r4 = r8.originalIfDefinitelyNotNullable(r4)
            boolean r4 = r8.isCapturedType(r4)
            if (r4 == 0) goto L3c
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r4 = r8.lowerBoundIfFlexible(r10)
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r4 = r8.originalIfDefinitelyNotNullable(r4)
            boolean r4 = r8.isCapturedType(r4)
            if (r4 == 0) goto L3c
            goto L3d
        L3c:
            r6 = r1
        L3d:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r10)
            if (r4 != 0) goto L5b
            if (r6 == 0) goto L54
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r4 = r8.typeConstructor(r3)
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r5 = r8.typeConstructor(r10)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L54
            goto L5b
        L54:
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r3 = r7.getTypeParameterForArgumentInBaseIfItEqualToTarget(r8, r3, r10)
            if (r3 == 0) goto L64
            return r3
        L5b:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r9 = r8.typeConstructor(r9)
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r8 = r8.getParameter(r9, r2)
            return r8
        L64:
            int r2 = r2 + 1
            goto L6
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.getTypeParameterForArgumentInBaseIfItEqualToTarget(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker):kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker");
    }

    private final boolean hasNothingSupertype(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker) {
        String joinToString$default;
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        TypeConstructorMarker typeConstructor = typeSystemContext.typeConstructor(simpleTypeMarker);
        if (typeSystemContext.isClassTypeConstructor(typeConstructor)) {
            return typeSystemContext.isNothingConstructor(typeConstructor);
        }
        if (typeSystemContext.isNothingConstructor(typeSystemContext.typeConstructor(simpleTypeMarker))) {
            return true;
        }
        typeCheckerState.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<SimpleTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(simpleTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() <= 1000) {
                SimpleTypeMarker current = supertypesDeque.pop();
                Intrinsics.checkNotNullExpressionValue(current, "current");
                if (supertypesSet.add(current)) {
                    if (typeSystemContext.isClassType(current)) {
                        supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                    } else {
                        supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                    }
                    if (!(!Intrinsics.areEqual(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE))) {
                        supertypesPolicy = null;
                    }
                    if (supertypesPolicy == null) {
                        continue;
                    } else {
                        TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                        Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(current)).iterator();
                        while (it.hasNext()) {
                            SimpleTypeMarker mo1427transformType = supertypesPolicy.mo1427transformType(typeCheckerState, it.next());
                            if (typeSystemContext.isNothingConstructor(typeSystemContext.typeConstructor(mo1427transformType))) {
                                typeCheckerState.clear();
                                return true;
                            }
                            supertypesDeque.add(mo1427transformType);
                        }
                    }
                }
            } else {
                StringBuilder p10 = a.p("Too many supertypes for type: ", simpleTypeMarker, ". Supertypes = ");
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null);
                p10.append(joinToString$default);
                throw new IllegalStateException(p10.toString().toString());
            }
        }
        typeCheckerState.clear();
        return false;
    }

    private final boolean isCommonDenotableType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        if (typeSystemContext.isDenotable(typeSystemContext.typeConstructor(kotlinTypeMarker)) && !typeSystemContext.isDynamic(kotlinTypeMarker) && !typeSystemContext.isDefinitelyNotNullType(kotlinTypeMarker) && !typeSystemContext.isNotNullTypeParameter(kotlinTypeMarker) && Intrinsics.areEqual(typeSystemContext.typeConstructor(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker)), typeSystemContext.typeConstructor(typeSystemContext.upperBoundIfFlexible(kotlinTypeMarker)))) {
            return true;
        }
        return false;
    }

    private final boolean isStubTypeSubtypeOfAnother(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        SimpleTypeMarker simpleTypeMarker3;
        SimpleTypeMarker simpleTypeMarker4;
        DefinitelyNotNullTypeMarker asDefinitelyNotNullType = typeSystemContext.asDefinitelyNotNullType(simpleTypeMarker);
        if (asDefinitelyNotNullType == null || (simpleTypeMarker3 = typeSystemContext.original(asDefinitelyNotNullType)) == null) {
            simpleTypeMarker3 = simpleTypeMarker;
        }
        DefinitelyNotNullTypeMarker asDefinitelyNotNullType2 = typeSystemContext.asDefinitelyNotNullType(simpleTypeMarker2);
        if (asDefinitelyNotNullType2 == null || (simpleTypeMarker4 = typeSystemContext.original(asDefinitelyNotNullType2)) == null) {
            simpleTypeMarker4 = simpleTypeMarker2;
        }
        if (typeSystemContext.typeConstructor(simpleTypeMarker3) != typeSystemContext.typeConstructor(simpleTypeMarker4)) {
            return false;
        }
        if (!typeSystemContext.isDefinitelyNotNullType(simpleTypeMarker) && typeSystemContext.isDefinitelyNotNullType(simpleTypeMarker2)) {
            return false;
        }
        if (typeSystemContext.isMarkedNullable(simpleTypeMarker) && !typeSystemContext.isMarkedNullable(simpleTypeMarker2)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean isSubtypeOf$default(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return abstractTypeChecker.isSubtypeOf(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z10);
    }

    private final boolean isSubtypeOfForSingleClassifierType(final TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, final SimpleTypeMarker simpleTypeMarker2) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        boolean z10;
        KotlinTypeMarker type;
        final TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (RUN_SLOW_ASSERTIONS) {
            if (!typeSystemContext.isSingleClassifierType(simpleTypeMarker) && !typeSystemContext.isIntersection(typeSystemContext.typeConstructor(simpleTypeMarker))) {
                typeCheckerState.isAllowedTypeVariable(simpleTypeMarker);
            }
            if (!typeSystemContext.isSingleClassifierType(simpleTypeMarker2)) {
                typeCheckerState.isAllowedTypeVariable(simpleTypeMarker2);
            }
        }
        boolean z11 = false;
        if (!AbstractNullabilityChecker.INSTANCE.isPossibleSubtype(typeCheckerState, simpleTypeMarker, simpleTypeMarker2)) {
            return false;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        Boolean checkSubtypeForIntegerLiteralType = abstractTypeChecker.checkSubtypeForIntegerLiteralType(typeCheckerState, typeSystemContext.lowerBoundIfFlexible(simpleTypeMarker), typeSystemContext.upperBoundIfFlexible(simpleTypeMarker2));
        if (checkSubtypeForIntegerLiteralType != null) {
            boolean booleanValue = checkSubtypeForIntegerLiteralType.booleanValue();
            TypeCheckerState.addSubtypeConstraint$default(typeCheckerState, simpleTypeMarker, simpleTypeMarker2, false, 4, null);
            return booleanValue;
        }
        TypeConstructorMarker typeConstructor = typeSystemContext.typeConstructor(simpleTypeMarker2);
        boolean z12 = true;
        if ((typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(simpleTypeMarker), typeConstructor) && typeSystemContext.parametersCount(typeConstructor) == 0) || typeSystemContext.isAnyConstructor(typeSystemContext.typeConstructor(simpleTypeMarker2))) {
            return true;
        }
        List<SimpleTypeMarker> findCorrespondingSupertypes = abstractTypeChecker.findCorrespondingSupertypes(typeCheckerState, simpleTypeMarker, typeConstructor);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(findCorrespondingSupertypes, 10);
        final ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (SimpleTypeMarker simpleTypeMarker3 : findCorrespondingSupertypes) {
            SimpleTypeMarker asSimpleType = typeSystemContext.asSimpleType(typeCheckerState.prepareType(simpleTypeMarker3));
            if (asSimpleType != null) {
                simpleTypeMarker3 = asSimpleType;
            }
            arrayList.add(simpleTypeMarker3);
        }
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                ArgumentList argumentList = new ArgumentList(typeSystemContext.parametersCount(typeConstructor));
                int parametersCount = typeSystemContext.parametersCount(typeConstructor);
                int i10 = 0;
                boolean z13 = false;
                while (i10 < parametersCount) {
                    if (!z13 && typeSystemContext.getVariance(typeSystemContext.getParameter(typeConstructor, i10)) == TypeVariance.OUT) {
                        z13 = z11;
                    } else {
                        z13 = z12;
                    }
                    if (!z13) {
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            SimpleTypeMarker simpleTypeMarker4 = (SimpleTypeMarker) it.next();
                            TypeArgumentMarker argumentOrNull = typeSystemContext.getArgumentOrNull(simpleTypeMarker4, i10);
                            if (argumentOrNull != null) {
                                if (typeSystemContext.getVariance(argumentOrNull) == TypeVariance.INV) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    argumentOrNull = null;
                                }
                                if (argumentOrNull != null && (type = typeSystemContext.getType(argumentOrNull)) != null) {
                                    arrayList2.add(type);
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + simpleTypeMarker4 + ", subType: " + simpleTypeMarker + ", superType: " + simpleTypeMarker2).toString());
                        }
                        argumentList.add(typeSystemContext.asTypeArgument(typeSystemContext.intersectTypes(arrayList2)));
                    }
                    i10++;
                    z11 = false;
                    z12 = true;
                }
                if (!z13 && INSTANCE.isSubtypeForSameConstructor(typeCheckerState, argumentList, simpleTypeMarker2)) {
                    return true;
                }
                return typeCheckerState.runForkingPoint(new Function1<TypeCheckerState.ForkPointContext, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TypeCheckerState.ForkPointContext forkPointContext) {
                        invoke2(forkPointContext);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TypeCheckerState.ForkPointContext runForkingPoint) {
                        Intrinsics.checkNotNullParameter(runForkingPoint, "$this$runForkingPoint");
                        for (final SimpleTypeMarker simpleTypeMarker5 : arrayList) {
                            final TypeCheckerState typeCheckerState2 = typeCheckerState;
                            final TypeSystemContext typeSystemContext2 = typeSystemContext;
                            final SimpleTypeMarker simpleTypeMarker6 = simpleTypeMarker2;
                            runForkingPoint.fork(new Function0<Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return Boolean.valueOf(AbstractTypeChecker.INSTANCE.isSubtypeForSameConstructor(TypeCheckerState.this, typeSystemContext2.asArgumentList(simpleTypeMarker5), simpleTypeMarker6));
                                }
                            });
                        }
                    }
                });
            }
            return INSTANCE.isSubtypeForSameConstructor(typeCheckerState, typeSystemContext.asArgumentList((SimpleTypeMarker) CollectionsKt.first((List) arrayList)), simpleTypeMarker2);
        }
        return INSTANCE.hasNothingSupertype(typeCheckerState, simpleTypeMarker);
    }

    private final boolean isTypeVariableAgainstStarProjectionForSelfType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker;
        TypeParameterMarker typeParameter;
        SimpleTypeMarker asSimpleType = typeSystemContext.asSimpleType(kotlinTypeMarker);
        if (!(asSimpleType instanceof CapturedTypeMarker)) {
            return false;
        }
        CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) asSimpleType;
        if (typeSystemContext.isOldCapturedType(capturedTypeMarker) || !typeSystemContext.isStarProjection(typeSystemContext.projection(typeSystemContext.typeConstructor(capturedTypeMarker))) || typeSystemContext.captureStatus(capturedTypeMarker) != CaptureStatus.FOR_SUBTYPING) {
            return false;
        }
        TypeConstructorMarker typeConstructor = typeSystemContext.typeConstructor(kotlinTypeMarker2);
        if (typeConstructor instanceof TypeVariableTypeConstructorMarker) {
            typeVariableTypeConstructorMarker = (TypeVariableTypeConstructorMarker) typeConstructor;
        } else {
            typeVariableTypeConstructorMarker = null;
        }
        if (typeVariableTypeConstructorMarker == null || (typeParameter = typeSystemContext.getTypeParameter(typeVariableTypeConstructorMarker)) == null || !typeSystemContext.hasRecursiveBounds(typeParameter, typeConstructorMarker)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<SimpleTypeMarker> selectOnlyPureKotlinSupertypes(TypeCheckerState typeCheckerState, List<? extends SimpleTypeMarker> list) {
        boolean z10;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TypeArgumentListMarker asArgumentList = typeSystemContext.asArgumentList((SimpleTypeMarker) next);
            int size = typeSystemContext.size(asArgumentList);
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (typeSystemContext.asFlexibleType(typeSystemContext.getType(typeSystemContext.get(asArgumentList, i10))) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    z11 = false;
                    break;
                }
                i10++;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return list;
    }

    public final TypeVariance effectiveVariance(TypeVariance declared, TypeVariance useSite) {
        Intrinsics.checkNotNullParameter(declared, "declared");
        Intrinsics.checkNotNullParameter(useSite, "useSite");
        TypeVariance typeVariance = TypeVariance.INV;
        if (declared == typeVariance) {
            return useSite;
        }
        if (useSite == typeVariance) {
            return declared;
        }
        if (declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean equalTypes(TypeCheckerState state, KotlinTypeMarker a, KotlinTypeMarker b3) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b3, "b");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (a == b3) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        if (abstractTypeChecker.isCommonDenotableType(typeSystemContext, a) && abstractTypeChecker.isCommonDenotableType(typeSystemContext, b3)) {
            KotlinTypeMarker prepareType = state.prepareType(state.refineType(a));
            KotlinTypeMarker prepareType2 = state.prepareType(state.refineType(b3));
            SimpleTypeMarker lowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(prepareType);
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(prepareType), typeSystemContext.typeConstructor(prepareType2))) {
                return false;
            }
            if (typeSystemContext.argumentsCount(lowerBoundIfFlexible) == 0) {
                if (typeSystemContext.hasFlexibleNullability(prepareType) || typeSystemContext.hasFlexibleNullability(prepareType2) || typeSystemContext.isMarkedNullable(lowerBoundIfFlexible) == typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(prepareType2))) {
                    return true;
                }
                return false;
            }
        }
        if (isSubtypeOf$default(abstractTypeChecker, state, a, b3, false, 8, null) && isSubtypeOf$default(abstractTypeChecker, state, b3, a, false, 8, null)) {
            return true;
        }
        return false;
    }

    public final List<SimpleTypeMarker> findCorrespondingSupertypes(TypeCheckerState state, SimpleTypeMarker subType, TypeConstructorMarker superConstructor) {
        String joinToString$default;
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (typeSystemContext.isClassType(subType)) {
            return INSTANCE.collectAndFilter(state, subType, superConstructor);
        }
        if (!typeSystemContext.isClassTypeConstructor(superConstructor) && !typeSystemContext.isIntegerLiteralTypeConstructor(superConstructor)) {
            return INSTANCE.collectAllSupertypesWithGivenTypeConstructor(state, subType, superConstructor);
        }
        SmartList<SimpleTypeMarker> smartList = new SmartList();
        state.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = state.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<SimpleTypeMarker> supertypesSet = state.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(subType);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() <= 1000) {
                SimpleTypeMarker current = supertypesDeque.pop();
                Intrinsics.checkNotNullExpressionValue(current, "current");
                if (supertypesSet.add(current)) {
                    if (typeSystemContext.isClassType(current)) {
                        smartList.add(current);
                        supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                    } else {
                        supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                    }
                    if (!(!Intrinsics.areEqual(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE))) {
                        supertypesPolicy = null;
                    }
                    if (supertypesPolicy != null) {
                        TypeSystemContext typeSystemContext2 = state.getTypeSystemContext();
                        Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(current)).iterator();
                        while (it.hasNext()) {
                            supertypesDeque.add(supertypesPolicy.mo1427transformType(state, it.next()));
                        }
                    }
                }
            } else {
                StringBuilder p10 = a.p("Too many supertypes for type: ", subType, ". Supertypes = ");
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null);
                p10.append(joinToString$default);
                throw new IllegalStateException(p10.toString().toString());
            }
        }
        state.clear();
        ArrayList arrayList = new ArrayList();
        for (SimpleTypeMarker it2 : smartList) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, abstractTypeChecker.collectAndFilter(state, it2, superConstructor));
        }
        return arrayList;
    }

    public final boolean isSubtypeForSameConstructor(TypeCheckerState typeCheckerState, TypeArgumentListMarker capturedSubArguments, SimpleTypeMarker superType) {
        boolean z10;
        int i10;
        int i11;
        boolean equalTypes;
        int i12;
        Intrinsics.checkNotNullParameter(typeCheckerState, "<this>");
        Intrinsics.checkNotNullParameter(capturedSubArguments, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(superType, "superType");
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        TypeConstructorMarker typeConstructor = typeSystemContext.typeConstructor(superType);
        int size = typeSystemContext.size(capturedSubArguments);
        int parametersCount = typeSystemContext.parametersCount(typeConstructor);
        if (size != parametersCount || size != typeSystemContext.argumentsCount(superType)) {
            return false;
        }
        for (int i13 = 0; i13 < parametersCount; i13++) {
            TypeArgumentMarker argument = typeSystemContext.getArgument(superType, i13);
            if (!typeSystemContext.isStarProjection(argument)) {
                KotlinTypeMarker type = typeSystemContext.getType(argument);
                TypeArgumentMarker typeArgumentMarker = typeSystemContext.get(capturedSubArguments, i13);
                typeSystemContext.getVariance(typeArgumentMarker);
                TypeVariance typeVariance = TypeVariance.INV;
                KotlinTypeMarker type2 = typeSystemContext.getType(typeArgumentMarker);
                AbstractTypeChecker abstractTypeChecker = INSTANCE;
                TypeVariance effectiveVariance = abstractTypeChecker.effectiveVariance(typeSystemContext.getVariance(typeSystemContext.getParameter(typeConstructor, i13)), typeSystemContext.getVariance(argument));
                if (effectiveVariance == null) {
                    return typeCheckerState.isErrorTypeEqualsToAnything();
                }
                if (effectiveVariance == typeVariance && (abstractTypeChecker.isTypeVariableAgainstStarProjectionForSelfType(typeSystemContext, type2, type, typeConstructor) || abstractTypeChecker.isTypeVariableAgainstStarProjectionForSelfType(typeSystemContext, type, type2, typeConstructor))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    continue;
                } else {
                    i10 = typeCheckerState.argumentsDepth;
                    if (i10 <= 100) {
                        i11 = typeCheckerState.argumentsDepth;
                        typeCheckerState.argumentsDepth = i11 + 1;
                        int i14 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 == 3) {
                                    equalTypes = isSubtypeOf$default(abstractTypeChecker, typeCheckerState, type, type2, false, 8, null);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                equalTypes = isSubtypeOf$default(abstractTypeChecker, typeCheckerState, type2, type, false, 8, null);
                            }
                        } else {
                            equalTypes = abstractTypeChecker.equalTypes(typeCheckerState, type2, type);
                        }
                        i12 = typeCheckerState.argumentsDepth;
                        typeCheckerState.argumentsDepth = i12 - 1;
                        if (!equalTypes) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + type2).toString());
                    }
                }
            }
        }
        return true;
    }

    @JvmOverloads
    public final boolean isSubtypeOf(TypeCheckerState state, KotlinTypeMarker subType, KotlinTypeMarker superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return isSubtypeOf$default(this, state, subType, superType, false, 8, null);
    }

    @JvmOverloads
    public final boolean isSubtypeOf(TypeCheckerState state, KotlinTypeMarker subType, KotlinTypeMarker superType, boolean z10) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.customIsSubtypeOf(subType, superType)) {
            return completeIsSubTypeOf(state, subType, superType, z10);
        }
        return false;
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension({"SMAP\ntypeEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1#2:263\n3433#3,7:264\n1726#3,3:271\n3433#3,7:274\n*S KotlinDebug\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n*L\n117#1:264,7\n143#1:271,3\n155#1:274,7\n*E\n"})
/* loaded from: classes4.dex */
public final class JavaTypeEnhancement {
    private final JavaResolverSettings javaResolverSettings;

    /* loaded from: classes4.dex */
    public static final class Result {
        private final int subtreeSize;
        private final KotlinType type;

        public Result(KotlinType kotlinType, int i10) {
            this.type = kotlinType;
            this.subtreeSize = i10;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final KotlinType getType() {
            return this.type;
        }
    }

    /* loaded from: classes4.dex */
    public static final class SimpleResult {
        private final boolean forWarnings;
        private final int subtreeSize;
        private final SimpleType type;

        public SimpleResult(SimpleType simpleType, int i10, boolean z10) {
            this.type = simpleType;
            this.subtreeSize = i10;
            this.forWarnings = z10;
        }

        public final boolean getForWarnings() {
            return this.forWarnings;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final SimpleType getType() {
            return this.type;
        }
    }

    public JavaTypeEnhancement(JavaResolverSettings javaResolverSettings) {
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.javaResolverSettings = javaResolverSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    private final SimpleResult enhanceInflexible(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11) {
        boolean z12;
        ClassifierDescriptor enhanceMutability;
        Boolean enhancedNullability;
        TypeConstructor constructor;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        EnhancedTypeAnnotations enhancedTypeAnnotations;
        boolean z13;
        boolean z14;
        Annotations annotations;
        Annotations compositeAnnotationsOrSingle;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        boolean isMarkedNullable;
        boolean z15;
        boolean z16;
        boolean z17;
        Result result;
        TypeProjection typeProjection;
        Function1<? super Integer, JavaTypeQualifiers> function12 = function1;
        boolean shouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        ?? r52 = 0;
        if (z11 && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        KotlinType kotlinType = null;
        if (!shouldEnhance && simpleType.getArguments().isEmpty()) {
            return new SimpleResult(null, 1, false);
        }
        ClassifierDescriptor mo1423getDeclarationDescriptor = simpleType.getConstructor().mo1423getDeclarationDescriptor();
        if (mo1423getDeclarationDescriptor == null) {
            return new SimpleResult(null, 1, false);
        }
        JavaTypeQualifiers invoke = function12.invoke(Integer.valueOf(i10));
        enhanceMutability = TypeEnhancementKt.enhanceMutability(mo1423getDeclarationDescriptor, invoke, typeComponentPosition);
        enhancedNullability = TypeEnhancementKt.getEnhancedNullability(invoke, typeComponentPosition);
        if (enhanceMutability == null || (constructor = enhanceMutability.getTypeConstructor()) == null) {
            constructor = simpleType.getConstructor();
        }
        TypeConstructor typeConstructor = constructor;
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "enhancedClassifier?.typeConstructor ?: constructor");
        int i11 = i10 + 1;
        List<TypeProjection> arguments = simpleType.getArguments();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "typeConstructor.parameters");
        List<TypeParameterDescriptor> list = parameters;
        Iterator<T> it = arguments.iterator();
        Iterator<T> it2 = list.iterator();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10);
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, collectionSizeOrDefault2));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection2 = (TypeProjection) next;
            if (!z12) {
                z17 = z12;
                result = new Result(kotlinType, r52);
            } else {
                z17 = z12;
                if (!typeProjection2.isStarProjection()) {
                    result = enhancePossiblyFlexible(typeProjection2.getType().unwrap(), function12, i11, z11);
                } else if (function12.invoke(Integer.valueOf(i11)).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    UnwrappedType unwrap = typeProjection2.getType().unwrap();
                    result = new Result(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrap).makeNullableAsSpecified((boolean) r52), FlexibleTypesKt.upperIfFlexible(unwrap).makeNullableAsSpecified(true)), 1);
                } else {
                    result = new Result(null, 1);
                }
            }
            i11 += result.getSubtreeSize();
            if (result.getType() != null) {
                KotlinType type = result.getType();
                Variance projectionKind = typeProjection2.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "arg.projectionKind");
                typeProjection = TypeUtilsKt.createProjection(type, projectionKind, typeParameterDescriptor);
            } else if (enhanceMutability != null && !typeProjection2.isStarProjection()) {
                KotlinType type2 = typeProjection2.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "arg.type");
                Variance projectionKind2 = typeProjection2.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind2, "arg.projectionKind");
                typeProjection = TypeUtilsKt.createProjection(type2, projectionKind2, typeParameterDescriptor);
            } else if (enhanceMutability != null) {
                typeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor);
            } else {
                typeProjection = null;
            }
            arrayList.add(typeProjection);
            function12 = function1;
            z12 = z17;
            r52 = 0;
            kotlinType = null;
        }
        int i12 = i11 - i10;
        if (enhanceMutability == null && enhancedNullability == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((TypeProjection) it3.next()) == null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (!z16) {
                        z15 = false;
                        break;
                    }
                }
            }
            z15 = true;
            if (z15) {
                return new SimpleResult(null, i12, false);
            }
        }
        boolean z18 = false;
        Annotations[] annotationsArr = new Annotations[3];
        annotationsArr[0] = simpleType.getAnnotations();
        enhancedTypeAnnotations = TypeEnhancementKt.ENHANCED_MUTABILITY_ANNOTATIONS;
        if (enhanceMutability != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            enhancedTypeAnnotations = null;
        }
        annotationsArr[1] = enhancedTypeAnnotations;
        Annotations enhanced_nullability_annotations = TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS();
        if (enhancedNullability != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            annotations = enhanced_nullability_annotations;
        } else {
            annotations = null;
        }
        annotationsArr[2] = annotations;
        compositeAnnotationsOrSingle = TypeEnhancementKt.compositeAnnotationsOrSingle(CollectionsKt.listOfNotNull((Object[]) annotationsArr));
        TypeAttributes defaultAttributes = TypeAttributesKt.toDefaultAttributes(compositeAnnotationsOrSingle);
        List<TypeProjection> arguments2 = simpleType.getArguments();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = arguments2.iterator();
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments2, 10);
        ArrayList arrayList2 = new ArrayList(Math.min(collectionSizeOrDefault3, collectionSizeOrDefault4));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection3 = (TypeProjection) it5.next();
            TypeProjection typeProjection4 = (TypeProjection) next2;
            if (typeProjection4 != null) {
                typeProjection3 = typeProjection4;
            }
            arrayList2.add(typeProjection3);
        }
        if (enhancedNullability != null) {
            isMarkedNullable = enhancedNullability.booleanValue();
        } else {
            isMarkedNullable = simpleType.isMarkedNullable();
        }
        SimpleType simpleType$default = KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList2, isMarkedNullable, (KotlinTypeRefiner) null, 16, (Object) null);
        if (invoke.getDefinitelyNotNull()) {
            simpleType$default = notNullTypeParameter(simpleType$default);
        }
        if (enhancedNullability != null && invoke.isNullabilityQualifierForWarning()) {
            z18 = true;
        }
        return new SimpleResult(simpleType$default, i12, z18);
    }

    public static /* synthetic */ SimpleResult enhanceInflexible$default(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11, int i11, Object obj) {
        return javaTypeEnhancement.enhanceInflexible(simpleType, function1, i10, typeComponentPosition, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        if (r13 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.Result enhancePossiblyFlexible(kotlin.reflect.jvm.internal.impl.types.UnwrappedType r12, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(r12)
            r1 = 0
            if (r0 == 0) goto Le
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result r12 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        Le:
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType
            if (r0 == 0) goto Lad
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.types.RawType
            r9 = r12
            kotlin.reflect.jvm.internal.impl.types.FlexibleType r9 = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) r9
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r9.getLowerBound()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$SimpleResult r10 = r2.enhanceInflexible(r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r9.getUpperBound()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$SimpleResult r13 = r2.enhanceInflexible(r3, r4, r5, r6, r7, r8)
            r10.getSubtreeSize()
            r13.getSubtreeSize()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r14 = r10.getType()
            if (r14 != 0) goto L43
            kotlin.reflect.jvm.internal.impl.types.SimpleType r14 = r13.getType()
            if (r14 != 0) goto L43
            goto La3
        L43:
            boolean r14 = r10.getForWarnings()
            if (r14 != 0) goto L85
            boolean r14 = r13.getForWarnings()
            if (r14 == 0) goto L50
            goto L85
        L50:
            if (r0 == 0) goto L6c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl
            kotlin.reflect.jvm.internal.impl.types.SimpleType r12 = r10.getType()
            if (r12 != 0) goto L5e
            kotlin.reflect.jvm.internal.impl.types.SimpleType r12 = r9.getLowerBound()
        L5e:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r13 = r13.getType()
            if (r13 != 0) goto L68
            kotlin.reflect.jvm.internal.impl.types.SimpleType r13 = r9.getUpperBound()
        L68:
            r1.<init>(r12, r13)
            goto La3
        L6c:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r12 = r10.getType()
            if (r12 != 0) goto L76
            kotlin.reflect.jvm.internal.impl.types.SimpleType r12 = r9.getLowerBound()
        L76:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r13 = r13.getType()
            if (r13 != 0) goto L80
            kotlin.reflect.jvm.internal.impl.types.SimpleType r13 = r9.getUpperBound()
        L80:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(r12, r13)
            goto La3
        L85:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r13 = r13.getType()
            if (r13 == 0) goto L98
            kotlin.reflect.jvm.internal.impl.types.SimpleType r14 = r10.getType()
            if (r14 != 0) goto L92
            r14 = r13
        L92:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r13 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(r14, r13)
            if (r13 != 0) goto L9f
        L98:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r13 = r10.getType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
        L9f:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r1 = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(r12, r13)
        La3:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result r12 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result
            int r13 = r10.getSubtreeSize()
            r12.<init>(r1, r13)
            goto Ldf
        Lad:
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType
            if (r0 == 0) goto Le0
            r2 = r12
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE
            r6 = 0
            r8 = 8
            r9 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$SimpleResult r13 = enhanceInflexible$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result r14 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result
            boolean r15 = r13.getForWarnings()
            if (r15 == 0) goto Ld3
            kotlin.reflect.jvm.internal.impl.types.SimpleType r15 = r13.getType()
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r12 = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(r12, r15)
            goto Ld7
        Ld3:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r12 = r13.getType()
        Ld7:
            int r13 = r13.getSubtreeSize()
            r14.<init>(r12, r13)
            r12 = r14
        Ldf:
            return r12
        Le0:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.enhancePossiblyFlexible(kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.jvm.functions.Function1, int, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result");
    }

    private final SimpleType notNullTypeParameter(SimpleType simpleType) {
        if (this.javaResolverSettings.getCorrectNullabilityForNotNullTypeParameter()) {
            return SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, true);
        }
        return new NotNullTypeParameterImpl(simpleType);
    }

    public final KotlinType enhance(KotlinType kotlinType, Function1<? super Integer, JavaTypeQualifiers> qualifiers, boolean z10) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return enhancePossiblyFlexible(kotlinType.unwrap(), qualifiers, 0, z10).getType();
    }
}

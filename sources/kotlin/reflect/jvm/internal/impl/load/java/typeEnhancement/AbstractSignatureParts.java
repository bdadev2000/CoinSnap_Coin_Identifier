package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

@SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1#2:229\n1#2:252\n1#2:275\n766#3:230\n857#3,2:231\n1726#3,3:233\n1747#3,3:236\n1747#3,3:239\n1603#3,9:242\n1855#3:251\n1856#3:253\n1612#3:254\n1726#3,3:255\n1549#3:258\n1620#3,3:259\n1747#3,3:262\n1603#3,9:265\n1855#3:274\n1856#3:276\n1612#3:277\n1855#3,2:278\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n*L\n156#1:252\n182#1:275\n89#1:230\n89#1:231,2\n153#1:233,3\n155#1:236,3\n156#1:239,3\n156#1:242,9\n156#1:251\n156#1:253\n156#1:254\n159#1:255,3\n169#1:258\n169#1:259,3\n177#1:262,3\n182#1:265,9\n182#1:274\n182#1:276\n182#1:277\n195#1:278,2\n*E\n"})
/* loaded from: classes4.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    /* loaded from: classes4.dex */
    public static final class TypeAndDefaultQualifiers {
        private final JavaTypeQualifiersByElementType defaultQualifiers;
        private final KotlinTypeMarker type;
        private final TypeParameterMarker typeParameterForArgument;

        public TypeAndDefaultQualifiers(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, TypeParameterMarker typeParameterMarker) {
            this.type = kotlinTypeMarker;
            this.defaultQualifiers = javaTypeQualifiersByElementType;
            this.typeParameterForArgument = typeParameterMarker;
        }

        public final JavaTypeQualifiersByElementType getDefaultQualifiers() {
            return this.defaultQualifiers;
        }

        public final KotlinTypeMarker getType() {
            return this.type;
        }

        public final TypeParameterMarker getTypeParameterForArgument() {
            return this.typeParameterForArgument;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType) {
        return getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType, getAnnotations(kotlinTypeMarker));
    }

    private final JavaTypeQualifiers extractQualifiers(KotlinTypeMarker kotlinTypeMarker) {
        NullabilityQualifier nullabilityQualifier;
        boolean z10;
        NullabilityQualifier nullabilityQualifier2 = getNullabilityQualifier(kotlinTypeMarker);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifier2 == null) {
            KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker);
            if (enhancedForWarnings != null) {
                nullabilityQualifier = getNullabilityQualifier(enhancedForWarnings);
            } else {
                nullabilityQualifier = null;
            }
        } else {
            nullabilityQualifier = nullabilityQualifier2;
        }
        TypeSystemContext typeSystem = getTypeSystem();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (javaToKotlinClassMap.isReadOnly(getFqNameUnsafe(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (javaToKotlinClassMap.isMutable(getFqNameUnsafe(typeSystem.upperBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        boolean z11 = false;
        if (!getTypeSystem().isDefinitelyNotNullType(kotlinTypeMarker) && !isNotNullTypeParameterCompat(kotlinTypeMarker)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (nullabilityQualifier != nullabilityQualifier2) {
            z11 = true;
        }
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z10, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0130, code lost:
    
        if (r0 != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiersFromAnnotations(final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers r12) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.extractQualifiersFromAnnotations(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$TypeAndDefaultQualifiers):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
    }

    private final <T> void flattenTree(T t5, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t5);
        Iterable<? extends T> invoke = function1.invoke(t5);
        if (invoke != null) {
            Iterator<? extends T> it = invoke.iterator();
            while (it.hasNext()) {
                flattenTree(it.next(), list, function1);
            }
        }
    }

    private final NullabilityQualifierWithMigrationStatus getBoundsNullability(TypeParameterMarker typeParameterMarker) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        List<KotlinTypeMarker> arrayList;
        boolean z15;
        NullabilityQualifier nullabilityQualifier;
        TypeSystemContext typeSystem = getTypeSystem();
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        List<KotlinTypeMarker> list = upperBounds;
        boolean z16 = list instanceof Collection;
        boolean z17 = false;
        if (!z16 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!typeSystem.isError((KotlinTypeMarker) it.next())) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            return null;
        }
        if (!z16 || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (getNullabilityQualifier((KotlinTypeMarker) it2.next()) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (z12) {
            arrayList = upperBounds;
        } else {
            if (!z16 || !list.isEmpty()) {
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    if (getEnhancedForWarnings((KotlinTypeMarker) it3.next()) != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        z14 = true;
                        break;
                    }
                }
            }
            z14 = false;
            if (!z14) {
                return null;
            }
            arrayList = new ArrayList<>();
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings((KotlinTypeMarker) it4.next());
                if (enhancedForWarnings != null) {
                    arrayList.add(enhancedForWarnings);
                }
            }
        }
        List<KotlinTypeMarker> list2 = arrayList;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                if (!typeSystem.isNullableType((KotlinTypeMarker) it5.next())) {
                    z15 = false;
                    break;
                }
            }
        }
        z15 = true;
        if (z15) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        }
        if (arrayList != upperBounds) {
            z17 = true;
        }
        return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z17);
    }

    private final NullabilityQualifier getNullabilityQualifier(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (!typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NOT_NULL;
        }
        return null;
    }

    private final NullabilityQualifierWithMigrationStatus mostSpecific(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
        if (nullabilityQualifierWithMigrationStatus == null) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        if (nullabilityQualifierWithMigrationStatus2 == null) {
            return nullabilityQualifierWithMigrationStatus;
        }
        if (nullabilityQualifierWithMigrationStatus.isForWarningOnly() && !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        if (!nullabilityQualifierWithMigrationStatus.isForWarningOnly() && nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) {
            return nullabilityQualifierWithMigrationStatus;
        }
        if (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) < 0) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        if (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) > 0) {
            return nullabilityQualifierWithMigrationStatus;
        }
        return nullabilityQualifierWithMigrationStatus2;
    }

    private final List<TypeAndDefaultQualifiers> toIndexed(KotlinTypeMarker kotlinTypeMarker) {
        final TypeSystemContext typeSystem = getTypeSystem();
        return flattenTree(new TypeAndDefaultQualifiers(kotlinTypeMarker, extractAndMergeDefaultQualifiers(kotlinTypeMarker, getContainerDefaultTypeQualifiers()), null), new Function1<TypeAndDefaultQualifiers, Iterable<? extends TypeAndDefaultQualifiers>>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$toIndexed$1$1
            final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Iterable<AbstractSignatureParts.TypeAndDefaultQualifiers> invoke(AbstractSignatureParts.TypeAndDefaultQualifiers it) {
                TypeConstructorMarker typeConstructor;
                List<TypeParameterMarker> parameters;
                int collectionSizeOrDefault;
                int collectionSizeOrDefault2;
                JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers;
                AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers;
                FlexibleTypeMarker asFlexibleType;
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.this$0.getSkipRawTypeArguments()) {
                    KotlinTypeMarker type = it.getType();
                    if (((type == null || (asFlexibleType = typeSystem.asFlexibleType(type)) == null) ? null : typeSystem.asRawType(asFlexibleType)) != null) {
                        return null;
                    }
                }
                KotlinTypeMarker type2 = it.getType();
                if (type2 == null || (typeConstructor = typeSystem.typeConstructor(type2)) == null || (parameters = typeSystem.getParameters(typeConstructor)) == null) {
                    return null;
                }
                List<TypeParameterMarker> list = parameters;
                List<TypeArgumentMarker> arguments = typeSystem.getArguments(it.getType());
                TypeSystemContext typeSystemContext = typeSystem;
                AbstractSignatureParts<TAnnotation> abstractSignatureParts = this.this$0;
                Iterator<T> it2 = list.iterator();
                Iterator<T> it3 = arguments.iterator();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10);
                ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, collectionSizeOrDefault2));
                while (it2.hasNext() && it3.hasNext()) {
                    Object next = it2.next();
                    TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) it3.next();
                    TypeParameterMarker typeParameterMarker = (TypeParameterMarker) next;
                    if (typeSystemContext.isStarProjection(typeArgumentMarker)) {
                        typeAndDefaultQualifiers = new AbstractSignatureParts.TypeAndDefaultQualifiers(null, it.getDefaultQualifiers(), typeParameterMarker);
                    } else {
                        KotlinTypeMarker type3 = typeSystemContext.getType(typeArgumentMarker);
                        extractAndMergeDefaultQualifiers = abstractSignatureParts.extractAndMergeDefaultQualifiers(type3, it.getDefaultQualifiers());
                        typeAndDefaultQualifiers = new AbstractSignatureParts.TypeAndDefaultQualifiers(type3, extractAndMergeDefaultQualifiers, typeParameterMarker);
                    }
                    arrayList.add(typeAndDefaultQualifiers);
                }
                return arrayList;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r10 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> computeIndexedQualifiers(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r10, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> r11, final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "overrides"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.util.List r0 = r9.toIndexed(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.f(r11)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r3 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r3
            java.util.List r3 = r9.toIndexed(r3)
            r1.add(r3)
            goto L1b
        L2f:
            boolean r2 = r9.getForceOnlyHeadTypeConstructor()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L6a
            boolean r2 = r9.isCovariant()
            if (r2 == 0) goto L68
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L4b
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4b
            goto L64
        L4b:
            java.util.Iterator r11 = r11.iterator()
        L4f:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r11.next()
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r2 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r2
            boolean r2 = r9.isEqual(r10, r2)
            r2 = r2 ^ r3
            if (r2 == 0) goto L4f
            r10 = r3
            goto L65
        L64:
            r10 = r4
        L65:
            if (r10 == 0) goto L68
            goto L6a
        L68:
            r10 = r4
            goto L6b
        L6a:
            r10 = r3
        L6b:
            if (r10 == 0) goto L6f
            r10 = r3
            goto L73
        L6f:
            int r10 = r0.size()
        L73:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[] r11 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[r10]
            r2 = r4
        L76:
            if (r2 >= r10) goto Ld0
            java.lang.Object r5 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$TypeAndDefaultQualifiers r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r5 = r9.extractQualifiersFromAnnotations(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L8b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb1
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.CollectionsKt.getOrNull(r8, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$TypeAndDefaultQualifiers r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers) r8
            if (r8 == 0) goto Laa
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r8 = r8.getType()
            if (r8 == 0) goto Laa
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r8 = r9.extractQualifiers(r8)
            goto Lab
        Laa:
            r8 = 0
        Lab:
            if (r8 == 0) goto L8b
            r6.add(r8)
            goto L8b
        Lb1:
            if (r2 != 0) goto Lbb
            boolean r7 = r9.isCovariant()
            if (r7 == 0) goto Lbb
            r7 = r3
            goto Lbc
        Lbb:
            r7 = r4
        Lbc:
            if (r2 != 0) goto Lc6
            boolean r8 = r9.getContainerIsVarargParameter()
            if (r8 == 0) goto Lc6
            r8 = r3
            goto Lc7
        Lc6:
            r8 = r4
        Lc7:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt.computeQualifiersForOverride(r5, r6, r7, r8, r13)
            r11[r2] = r5
            int r2 = r2 + 1
            goto L76
        Ld0:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$computeIndexedQualifiers$1 r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$computeIndexedQualifiers$1
            r10.<init>()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.computeIndexedQualifiers(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo, boolean):kotlin.jvm.functions.Function1");
    }

    public abstract boolean forceWarning(TAnnotation tannotation, KotlinTypeMarker kotlinTypeMarker);

    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    public abstract Iterable<TAnnotation> getAnnotations(KotlinTypeMarker kotlinTypeMarker);

    public abstract Iterable<TAnnotation> getContainerAnnotations();

    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    public abstract boolean getEnableImprovementsInStrictMode();

    public abstract KotlinTypeMarker getEnhancedForWarnings(KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    public abstract FqNameUnsafe getFqNameUnsafe(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean getSkipRawTypeArguments();

    public abstract TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(TypeParameterMarker typeParameterMarker);

    public boolean isNotNullTypeParameterCompat(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return false;
    }

    private final <T> List<T> flattenTree(T t5, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        flattenTree(t5, arrayList, function1);
        return arrayList;
    }
}

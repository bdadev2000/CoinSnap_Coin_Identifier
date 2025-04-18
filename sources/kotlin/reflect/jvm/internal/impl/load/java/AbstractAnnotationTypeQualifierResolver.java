package kotlin.reflect.jvm.internal.impl.load.java;

import eb.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension({"SMAP\nAbstractAnnotationTypeQualifierResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,213:1\n1#2:214\n1#2:220\n1#2:225\n1#2:247\n1747#3,3:215\n288#3,2:221\n1611#3:223\n1855#3:224\n1856#3:226\n1612#3:227\n1747#3,3:228\n1789#3,3:231\n1789#3,3:234\n1603#3,9:237\n1855#3:246\n1856#3:248\n1612#3:249\n73#4,2:218\n361#5,7:250\n*S KotlinDebug\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n*L\n40#1:220\n81#1:225\n162#1:247\n30#1:215,3\n79#1:221,2\n81#1:223\n81#1:224\n81#1:226\n81#1:227\n88#1:228,3\n124#1:231,3\n136#1:234,3\n162#1:237,9\n162#1:246\n162#1:248\n162#1:249\n40#1:218,2\n208#1:250,7\n*E\n"})
/* loaded from: classes4.dex */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {
    private static final Companion Companion = new Companion(null);
    private static final Map<String, AnnotationQualifierApplicabilityType> JAVA_APPLICABILITY_TYPES;
    private final JavaTypeEnhancementState javaTypeEnhancementState;
    private final ConcurrentHashMap<Object, TAnnotation> resolvedNicknames;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        JAVA_APPLICABILITY_TYPES = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.javaTypeEnhancementState = javaTypeEnhancementState;
        this.resolvedNicknames = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set<AnnotationQualifierApplicabilityType> allIfTypeUse(Set<? extends AnnotationQualifierApplicabilityType> set) {
        if (set.contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
            return SetsKt.plus(SetsKt.a(ArraysKt.toSet(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), (Iterable) set);
        }
        return set;
    }

    private final JavaDefaultQualifiers extractDefaultQualifiers(TAnnotation tannotation) {
        NullabilityQualifierWithMigrationStatus extractNullability;
        JavaDefaultQualifiers resolveQualifierBuiltInDefaultAnnotation = resolveQualifierBuiltInDefaultAnnotation(tannotation);
        if (resolveQualifierBuiltInDefaultAnnotation != null) {
            return resolveQualifierBuiltInDefaultAnnotation;
        }
        Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> resolveTypeQualifierDefaultAnnotation = resolveTypeQualifierDefaultAnnotation(tannotation);
        if (resolveTypeQualifierDefaultAnnotation == null) {
            return null;
        }
        TAnnotation component1 = resolveTypeQualifierDefaultAnnotation.component1();
        Set<AnnotationQualifierApplicabilityType> component2 = resolveTypeQualifierDefaultAnnotation.component2();
        ReportLevel resolveJsr305CustomState = resolveJsr305CustomState(tannotation);
        if (resolveJsr305CustomState == null) {
            resolveJsr305CustomState = resolveJsr305AnnotationState(component1);
        }
        if (resolveJsr305CustomState.isIgnore() || (extractNullability = extractNullability((AbstractAnnotationTypeQualifierResolver<TAnnotation>) component1, (Function1<? super AbstractAnnotationTypeQualifierResolver<TAnnotation>, Boolean>) new Function1<TAnnotation, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TAnnotation extractNullability2) {
                Intrinsics.checkNotNullParameter(extractNullability2, "$this$extractNullability");
                return Boolean.FALSE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1<TAnnotation>) obj);
            }
        })) == null) {
            return null;
        }
        return new JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus.copy$default(extractNullability, null, resolveJsr305CustomState.isWarning(), 1, null), component2, false, 4, null);
    }

    private final TAnnotation findAnnotation(TAnnotation tannotation, FqName fqName) {
        for (TAnnotation tannotation2 : getMetaAnnotations(tannotation)) {
            if (Intrinsics.areEqual(getFqName(tannotation2), fqName)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean hasAnnotation(TAnnotation tannotation, FqName fqName) {
        Iterable<TAnnotation> metaAnnotations = getMetaAnnotations(tannotation);
        if ((metaAnnotations instanceof Collection) && ((Collection) metaAnnotations).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = metaAnnotations.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(getFqName(it.next()), fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (r7.equals("ALWAYS") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        if (r7.equals("NEVER") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r7.equals("MAYBE") == false) goto L47;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0087. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus knownNullability(TAnnotation r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.knownNullability(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    private final ReportLevel resolveDefaultAnnotationState(TAnnotation tannotation) {
        FqName fqName = getFqName(tannotation);
        if (fqName != null && AnnotationQualifiersFqNamesKt.getJSPECIFY_DEFAULT_ANNOTATIONS().containsKey(fqName)) {
            return this.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
        }
        return resolveJsr305AnnotationState(tannotation);
    }

    private final ReportLevel resolveJsr305AnnotationState(TAnnotation tannotation) {
        ReportLevel resolveJsr305CustomState = resolveJsr305CustomState(tannotation);
        if (resolveJsr305CustomState != null) {
            return resolveJsr305CustomState;
        }
        return this.javaTypeEnhancementState.getJsr305().getGlobalLevel();
    }

    private final ReportLevel resolveJsr305CustomState(TAnnotation tannotation) {
        Iterable<String> enumArguments;
        String str;
        ReportLevel reportLevel = this.javaTypeEnhancementState.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(getFqName(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation findAnnotation = findAnnotation(tannotation, AnnotationQualifiersFqNamesKt.getMIGRATION_ANNOTATION_FQNAME());
        if (findAnnotation == null || (enumArguments = enumArguments(findAnnotation, false)) == null || (str = (String) CollectionsKt.firstOrNull(enumArguments)) == null) {
            return null;
        }
        ReportLevel migrationLevel = this.javaTypeEnhancementState.getJsr305().getMigrationLevel();
        if (migrationLevel == null) {
            int hashCode = str.hashCode();
            if (hashCode != -2137067054) {
                if (hashCode != -1838656823) {
                    if (hashCode != 2656902 || !str.equals("WARN")) {
                        return null;
                    }
                    return ReportLevel.WARN;
                }
                if (!str.equals("STRICT")) {
                    return null;
                }
                return ReportLevel.STRICT;
            }
            if (!str.equals("IGNORE")) {
                return null;
            }
            return ReportLevel.IGNORE;
        }
        return migrationLevel;
    }

    private final JavaDefaultQualifiers resolveQualifierBuiltInDefaultAnnotation(TAnnotation tannotation) {
        JavaDefaultQualifiers javaDefaultQualifiers;
        boolean z10;
        if (this.javaTypeEnhancementState.getDisabledDefaultAnnotations() || (javaDefaultQualifiers = AnnotationQualifiersFqNamesKt.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(getFqName(tannotation))) == null) {
            return null;
        }
        ReportLevel resolveDefaultAnnotationState = resolveDefaultAnnotationState(tannotation);
        if (resolveDefaultAnnotationState != ReportLevel.IGNORE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            resolveDefaultAnnotationState = null;
        }
        if (resolveDefaultAnnotationState == null) {
            return null;
        }
        return JavaDefaultQualifiers.copy$default(javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus.copy$default(javaDefaultQualifiers.getNullabilityQualifier(), null, resolveDefaultAnnotationState.isWarning(), 1, null), null, false, 6, null);
    }

    private final Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> resolveTypeQualifierDefaultAnnotation(TAnnotation tannotation) {
        TAnnotation findAnnotation;
        TAnnotation tannotation2;
        boolean z10;
        if (this.javaTypeEnhancementState.getJsr305().isDisabled() || (findAnnotation = findAnnotation(tannotation, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_DEFAULT_FQNAME())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = getMetaAnnotations(tannotation).iterator();
        while (true) {
            if (it.hasNext()) {
                tannotation2 = it.next();
                if (resolveTypeQualifierAnnotation(tannotation2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
            } else {
                tannotation2 = null;
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        Iterable<String> enumArguments = enumArguments(findAnnotation, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = enumArguments.iterator();
        while (it2.hasNext()) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = JAVA_APPLICABILITY_TYPES.get(it2.next());
            if (annotationQualifierApplicabilityType != null) {
                linkedHashSet.add(annotationQualifierApplicabilityType);
            }
        }
        return new Pair<>(tannotation2, allIfTypeUse(linkedHashSet));
    }

    public abstract Iterable<String> enumArguments(TAnnotation tannotation, boolean z10);

    public final JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, Iterable<? extends TAnnotation> annotations) {
        EnumMap enumMap;
        EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> defaultQualifiers;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.javaTypeEnhancementState.getDisabledDefaultAnnotations()) {
            return javaTypeQualifiersByElementType;
        }
        ArrayList<JavaDefaultQualifiers> arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = annotations.iterator();
        while (it.hasNext()) {
            JavaDefaultQualifiers extractDefaultQualifiers = extractDefaultQualifiers(it.next());
            if (extractDefaultQualifiers != null) {
                arrayList.add(extractDefaultQualifiers);
            }
        }
        if (arrayList.isEmpty()) {
            return javaTypeQualifiersByElementType;
        }
        if (javaTypeQualifiersByElementType != null && (defaultQualifiers = javaTypeQualifiersByElementType.getDefaultQualifiers()) != null) {
            enumMap = new EnumMap((EnumMap) defaultQualifiers);
        } else {
            enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
        }
        boolean z10 = false;
        for (JavaDefaultQualifiers javaDefaultQualifiers : arrayList) {
            Iterator<AnnotationQualifierApplicabilityType> it2 = javaDefaultQualifiers.getQualifierApplicabilityTypes().iterator();
            while (it2.hasNext()) {
                enumMap.put((EnumMap) it2.next(), (AnnotationQualifierApplicabilityType) javaDefaultQualifiers);
                z10 = true;
            }
        }
        if (z10) {
            return new JavaTypeQualifiersByElementType(enumMap);
        }
        return javaTypeQualifiersByElementType;
    }

    public final MutabilityQualifier extractMutability(Iterable<? extends TAnnotation> annotations) {
        MutabilityQualifier mutabilityQualifier;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        MutabilityQualifier mutabilityQualifier2 = null;
        while (it.hasNext()) {
            FqName fqName = getFqName(it.next());
            if (JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS().contains(fqName)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS().contains(fqName)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final NullabilityQualifierWithMigrationStatus extractNullability(Iterable<? extends TAnnotation> iterable, Function1<? super TAnnotation, Boolean> function1) {
        Iterator q10 = j.q(iterable, "annotations", function1, "forceWarning");
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        while (q10.hasNext()) {
            NullabilityQualifierWithMigrationStatus extractNullability = extractNullability((AbstractAnnotationTypeQualifierResolver<TAnnotation>) q10.next(), (Function1<? super AbstractAnnotationTypeQualifierResolver<TAnnotation>, Boolean>) function1);
            if (nullabilityQualifierWithMigrationStatus != null) {
                if (extractNullability != null && !Intrinsics.areEqual(extractNullability, nullabilityQualifierWithMigrationStatus) && (!extractNullability.isForWarningOnly() || nullabilityQualifierWithMigrationStatus.isForWarningOnly())) {
                    if (extractNullability.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus.isForWarningOnly()) {
                        return null;
                    }
                }
            }
            nullabilityQualifierWithMigrationStatus = extractNullability;
        }
        return nullabilityQualifierWithMigrationStatus;
    }

    public abstract FqName getFqName(TAnnotation tannotation);

    public abstract Object getKey(TAnnotation tannotation);

    public abstract Iterable<TAnnotation> getMetaAnnotations(TAnnotation tannotation);

    public final boolean isTypeUseAnnotation(TAnnotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        TAnnotation findAnnotation = findAnnotation(annotation, StandardNames.FqNames.target);
        if (findAnnotation == null) {
            return false;
        }
        Iterable<String> enumArguments = enumArguments(findAnnotation, false);
        if ((enumArguments instanceof Collection) && ((Collection) enumArguments).isEmpty()) {
            return false;
        }
        Iterator<String> it = enumArguments.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), KotlinTarget.TYPE.name())) {
                return true;
            }
        }
        return false;
    }

    public final TAnnotation resolveTypeQualifierAnnotation(TAnnotation annotation) {
        TAnnotation tannotation;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (this.javaTypeEnhancementState.getJsr305().isDisabled()) {
            return null;
        }
        if (!CollectionsKt.contains(AnnotationQualifiersFqNamesKt.getBUILT_IN_TYPE_QUALIFIER_FQ_NAMES(), getFqName(annotation)) && !hasAnnotation(annotation, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_FQNAME())) {
            if (!hasAnnotation(annotation, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_NICKNAME_FQNAME())) {
                return null;
            }
            ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.resolvedNicknames;
            Object key = getKey(annotation);
            TAnnotation tannotation2 = concurrentHashMap.get(key);
            if (tannotation2 == null) {
                Iterator<TAnnotation> it = getMetaAnnotations(annotation).iterator();
                while (true) {
                    if (it.hasNext()) {
                        tannotation = resolveTypeQualifierAnnotation(it.next());
                        if (tannotation != null) {
                            break;
                        }
                    } else {
                        tannotation = null;
                        break;
                    }
                }
                if (tannotation == null) {
                    return null;
                }
                TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(key, tannotation);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return tannotation;
            }
            return tannotation2;
        }
        return annotation;
    }

    private final NullabilityQualifierWithMigrationStatus extractNullability(TAnnotation tannotation, Function1<? super TAnnotation, Boolean> function1) {
        NullabilityQualifierWithMigrationStatus knownNullability;
        NullabilityQualifierWithMigrationStatus knownNullability2 = knownNullability(tannotation, function1.invoke(tannotation).booleanValue());
        if (knownNullability2 != null) {
            return knownNullability2;
        }
        TAnnotation resolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(tannotation);
        if (resolveTypeQualifierAnnotation == null) {
            return null;
        }
        ReportLevel resolveJsr305AnnotationState = resolveJsr305AnnotationState(tannotation);
        if (resolveJsr305AnnotationState.isIgnore() || (knownNullability = knownNullability(resolveTypeQualifierAnnotation, function1.invoke(resolveTypeQualifierAnnotation).booleanValue())) == null) {
            return null;
        }
        return NullabilityQualifierWithMigrationStatus.copy$default(knownNullability, null, resolveJsr305AnnotationState.isWarning(), 1, null);
    }
}

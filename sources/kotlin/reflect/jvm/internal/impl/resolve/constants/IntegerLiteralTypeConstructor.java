package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.applovin.impl.mediation.ads.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@SourceDebugExtension({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1726#2,3:182\n1747#2,3:185\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n*L\n132#1:182,3\n176#1:185,3\n*E\n"})
/* loaded from: classes4.dex */
public final class IntegerLiteralTypeConstructor implements TypeConstructor {
    public static final Companion Companion = new Companion(null);
    private final ModuleDescriptor module;
    private final Set<KotlinType> possibleTypes;
    private final Lazy supertypes$delegate;
    private final SimpleType type;
    private final long value;

    public /* synthetic */ IntegerLiteralTypeConstructor(long j3, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j3, moduleDescriptor, set);
    }

    private final List<KotlinType> getSupertypes() {
        return (List) this.supertypes$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isContainsOnlyUnsignedTypes() {
        Collection<KotlinType> allSignedLiteralTypes = PrimitiveTypeUtilKt.getAllSignedLiteralTypes(this.module);
        if ((allSignedLiteralTypes instanceof Collection) && allSignedLiteralTypes.isEmpty()) {
            return true;
        }
        Iterator<T> it = allSignedLiteralTypes.iterator();
        while (it.hasNext()) {
            if (!(!this.possibleTypes.contains((KotlinType) it.next()))) {
                return false;
            }
        }
        return true;
    }

    private final String valueToString() {
        String joinToString$default;
        StringBuilder sb2 = new StringBuilder("[");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.possibleTypes, ",", null, null, 0, null, new Function1<KotlinType, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$valueToString$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(KotlinType it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            }
        }, 30, null);
        return e.g(sb2, joinToString$default, AbstractJsonLexerKt.END_LIST);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo1423getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    public final Set<KotlinType> getPossibleTypes() {
        return this.possibleTypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public String toString() {
        return "IntegerLiteralType" + valueToString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private IntegerLiteralTypeConstructor(long j3, ModuleDescriptor moduleDescriptor, Set<? extends KotlinType> set) {
        this.type = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), this, false);
        this.supertypes$delegate = LazyKt.lazy(new Function0<List<SimpleType>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$supertypes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<SimpleType> invoke() {
                SimpleType simpleType;
                boolean isContainsOnlyUnsignedTypes;
                SimpleType defaultType = IntegerLiteralTypeConstructor.this.getBuiltIns().getComparable().getDefaultType();
                Intrinsics.checkNotNullExpressionValue(defaultType, "builtIns.comparable.defaultType");
                Variance variance = Variance.IN_VARIANCE;
                simpleType = IntegerLiteralTypeConstructor.this.type;
                List<SimpleType> mutableListOf = CollectionsKt.mutableListOf(TypeSubstitutionKt.replace$default(defaultType, CollectionsKt.listOf(new TypeProjectionImpl(variance, simpleType)), null, 2, null));
                isContainsOnlyUnsignedTypes = IntegerLiteralTypeConstructor.this.isContainsOnlyUnsignedTypes();
                if (!isContainsOnlyUnsignedTypes) {
                    mutableListOf.add(IntegerLiteralTypeConstructor.this.getBuiltIns().getNumberType());
                }
                return mutableListOf;
            }
        });
        this.value = j3;
        this.module = moduleDescriptor;
        this.possibleTypes = set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getSupertypes, reason: collision with other method in class */
    public Collection<KotlinType> mo1424getSupertypes() {
        return getSupertypes();
    }

    @SourceDebugExtension({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n2661#2,7:182\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n*L\n40#1:182,7\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* loaded from: classes4.dex */
        public enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Mode.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SimpleType findCommonSuperTypeOrIntersectionType(Collection<? extends SimpleType> collection, Mode mode) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    SimpleType simpleType = (SimpleType) it.next();
                    next = IntegerLiteralTypeConstructor.Companion.fold((SimpleType) next, simpleType, mode);
                }
                return (SimpleType) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        private final SimpleType fold(SimpleType simpleType, SimpleType simpleType2, Mode mode) {
            if (simpleType == null || simpleType2 == null) {
                return null;
            }
            TypeConstructor constructor = simpleType.getConstructor();
            TypeConstructor constructor2 = simpleType2.getConstructor();
            boolean z10 = constructor instanceof IntegerLiteralTypeConstructor;
            if (z10 && (constructor2 instanceof IntegerLiteralTypeConstructor)) {
                return fold((IntegerLiteralTypeConstructor) constructor, (IntegerLiteralTypeConstructor) constructor2, mode);
            }
            if (z10) {
                return fold((IntegerLiteralTypeConstructor) constructor, simpleType2);
            }
            if (constructor2 instanceof IntegerLiteralTypeConstructor) {
                return fold((IntegerLiteralTypeConstructor) constructor2, simpleType);
            }
            return null;
        }

        public final SimpleType findIntersectionType(Collection<? extends SimpleType> types) {
            Intrinsics.checkNotNullParameter(types, "types");
            return findCommonSuperTypeOrIntersectionType(types, Mode.INTERSECTION_TYPE);
        }

        private final SimpleType fold(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, Mode mode) {
            Set intersect;
            int i10 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i10 == 1) {
                intersect = CollectionsKt.intersect(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                intersect = CollectionsKt.union(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            }
            return KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.value, integerLiteralTypeConstructor.module, intersect, null), false);
        }

        private final SimpleType fold(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, SimpleType simpleType) {
            if (integerLiteralTypeConstructor.getPossibleTypes().contains(simpleType)) {
                return simpleType;
            }
            return null;
        }
    }
}

package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension({"SMAP\nKotlinTypePreparator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,76:1\n1#2:77\n1549#3:78\n1620#3,3:79\n1549#3:82\n1620#3,3:83\n1549#3:92\n1620#3,2:93\n1622#3:101\n98#4,6:86\n104#4:95\n105#4,4:97\n112#4,7:102\n99#5:96\n*S KotlinDebug\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n*L\n27#1:78\n27#1:79,3\n37#1:82\n37#1:83,3\n48#1:92\n48#1:93,2\n48#1:101\n48#1:86,6\n48#1:95\n48#1:97,4\n48#1:102,7\n48#1:96\n*E\n"})
/* loaded from: classes4.dex */
public abstract class KotlinTypePreparator extends AbstractTypePreparator {

    /* loaded from: classes4.dex */
    public static final class Default extends KotlinTypePreparator {
        public static final Default INSTANCE = new Default();

        private Default() {
        }
    }

    private final SimpleType transformToNewType(SimpleType simpleType) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        KotlinType type;
        TypeConstructor constructor = simpleType.getConstructor();
        boolean z10 = true;
        boolean z11 = false;
        IntersectionTypeConstructor intersectionTypeConstructor = null;
        r4 = null;
        UnwrappedType unwrappedType = null;
        KotlinType kotlinType = null;
        if (constructor instanceof CapturedTypeConstructorImpl) {
            CapturedTypeConstructorImpl capturedTypeConstructorImpl = (CapturedTypeConstructorImpl) constructor;
            TypeProjection projection = capturedTypeConstructorImpl.getProjection();
            if (projection.getProjectionKind() != Variance.IN_VARIANCE) {
                z10 = false;
            }
            if (!z10) {
                projection = null;
            }
            if (projection != null && (type = projection.getType()) != null) {
                unwrappedType = type.unwrap();
            }
            UnwrappedType unwrappedType2 = unwrappedType;
            if (capturedTypeConstructorImpl.getNewTypeConstructor() == null) {
                TypeProjection projection2 = capturedTypeConstructorImpl.getProjection();
                Collection<KotlinType> mo1424getSupertypes = capturedTypeConstructorImpl.mo1424getSupertypes();
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(mo1424getSupertypes, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault3);
                Iterator<T> it = mo1424getSupertypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).unwrap());
                }
                capturedTypeConstructorImpl.setNewTypeConstructor(new NewCapturedTypeConstructor(projection2, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedTypeConstructor newTypeConstructor = capturedTypeConstructorImpl.getNewTypeConstructor();
            Intrinsics.checkNotNull(newTypeConstructor);
            return new NewCapturedType(captureStatus, newTypeConstructor, unwrappedType2, simpleType.getAttributes(), simpleType.isMarkedNullable(), false, 32, null);
        }
        if (constructor instanceof IntegerValueTypeConstructor) {
            Collection<KotlinType> mo1424getSupertypes2 = ((IntegerValueTypeConstructor) constructor).mo1424getSupertypes();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(mo1424getSupertypes2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            Iterator<T> it2 = mo1424getSupertypes2.iterator();
            while (it2.hasNext()) {
                KotlinType makeNullableAsSpecified = TypeUtils.makeNullableAsSpecified((KotlinType) it2.next(), simpleType.isMarkedNullable());
                Intrinsics.checkNotNullExpressionValue(makeNullableAsSpecified, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                arrayList2.add(makeNullableAsSpecified);
            }
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(simpleType.getAttributes(), new IntersectionTypeConstructor(arrayList2), CollectionsKt.emptyList(), false, simpleType.getMemberScope());
        }
        if ((constructor instanceof IntersectionTypeConstructor) && simpleType.isMarkedNullable()) {
            IntersectionTypeConstructor intersectionTypeConstructor2 = (IntersectionTypeConstructor) constructor;
            Collection<KotlinType> mo1424getSupertypes3 = intersectionTypeConstructor2.mo1424getSupertypes();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(mo1424getSupertypes3, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it3 = mo1424getSupertypes3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(TypeUtilsKt.makeNullable((KotlinType) it3.next()));
                z11 = true;
            }
            if (z11) {
                KotlinType alternativeType = intersectionTypeConstructor2.getAlternativeType();
                if (alternativeType != null) {
                    kotlinType = TypeUtilsKt.makeNullable(alternativeType);
                }
                intersectionTypeConstructor = new IntersectionTypeConstructor(arrayList3).setAlternative(kotlinType);
            }
            if (intersectionTypeConstructor != null) {
                intersectionTypeConstructor2 = intersectionTypeConstructor;
            }
            return intersectionTypeConstructor2.createType();
        }
        return simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator
    public UnwrappedType prepareType(KotlinTypeMarker type) {
        UnwrappedType flexibleType;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof KotlinType) {
            UnwrappedType unwrap = ((KotlinType) type).unwrap();
            if (unwrap instanceof SimpleType) {
                flexibleType = transformToNewType((SimpleType) unwrap);
            } else if (unwrap instanceof FlexibleType) {
                FlexibleType flexibleType2 = (FlexibleType) unwrap;
                SimpleType transformToNewType = transformToNewType(flexibleType2.getLowerBound());
                SimpleType transformToNewType2 = transformToNewType(flexibleType2.getUpperBound());
                flexibleType = (transformToNewType == flexibleType2.getLowerBound() && transformToNewType2 == flexibleType2.getUpperBound()) ? unwrap : KotlinTypeFactory.flexibleType(transformToNewType, transformToNewType2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return TypeWithEnhancementKt.inheritEnhancement(flexibleType, unwrap, new KotlinTypePreparator$prepareType$1(this));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}

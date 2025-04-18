package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1#2:291\n1#2:310\n1655#3,8:292\n1603#3,9:300\n1855#3:309\n1856#3:311\n1612#3:312\n1726#3,3:313\n1549#3:316\n1620#3,3:317\n1620#3,3:320\n1549#3:323\n1620#3,3:324\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n*L\n122#1:310\n117#1:292,8\n122#1:300,9\n122#1:309\n122#1:311\n122#1:312\n154#1:313,3\n156#1:316\n156#1:317,3\n176#1:320,3\n81#1:323\n81#1:324,3\n*E\n"})
/* loaded from: classes4.dex */
public final class NewCapturedTypeKt {
    private static final List<TypeProjection> captureArguments(UnwrappedType unwrappedType, CaptureStatus captureStatus) {
        boolean z10;
        int collectionSizeOrDefault;
        UnwrappedType unwrappedType2;
        if (unwrappedType.getArguments().size() != unwrappedType.getConstructor().getParameters().size()) {
            return null;
        }
        List<TypeProjection> arguments = unwrappedType.getArguments();
        List<TypeProjection> list = arguments;
        boolean z11 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((TypeProjection) it.next()).getProjectionKind() == Variance.INVARIANT) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    z11 = false;
                    break;
                }
            }
        }
        if (z11) {
            return null;
        }
        List<TypeParameterDescriptor> parameters = unwrappedType.getConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "type.constructor.parameters");
        List<Pair> zip = CollectionsKt.zip(list, parameters);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(zip, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Pair pair : zip) {
            TypeProjection typeProjection = (TypeProjection) pair.component1();
            TypeParameterDescriptor parameter = (TypeParameterDescriptor) pair.component2();
            if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                if (!typeProjection.isStarProjection() && typeProjection.getProjectionKind() == Variance.IN_VARIANCE) {
                    unwrappedType2 = typeProjection.getType().unwrap();
                } else {
                    unwrappedType2 = null;
                }
                Intrinsics.checkNotNullExpressionValue(parameter, "parameter");
                typeProjection = TypeUtilsKt.asTypeProjection(new NewCapturedType(captureStatus, unwrappedType2, typeProjection, parameter));
            }
            arrayList.add(typeProjection);
        }
        TypeSubstitutor buildSubstitutor = TypeConstructorSubstitution.Companion.create(unwrappedType.getConstructor(), arrayList).buildSubstitutor();
        int size = arguments.size();
        for (int i10 = 0; i10 < size; i10++) {
            TypeProjection typeProjection2 = arguments.get(i10);
            TypeProjection typeProjection3 = (TypeProjection) arrayList.get(i10);
            if (typeProjection2.getProjectionKind() != Variance.INVARIANT) {
                List<KotlinType> upperBounds = unwrappedType.getConstructor().getParameters().get(i10).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "type.constructor.parameters[index].upperBounds");
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = upperBounds.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) buildSubstitutor.safeSubstitute((KotlinType) it2.next(), Variance.INVARIANT).unwrap()));
                }
                if (!typeProjection2.isStarProjection() && typeProjection2.getProjectionKind() == Variance.OUT_VARIANCE) {
                    arrayList2.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeProjection2.getType().unwrap()));
                }
                KotlinType type = typeProjection3.getType();
                Intrinsics.checkNotNull(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                ((NewCapturedType) type).getConstructor().initializeSupertypes(arrayList2);
            }
        }
        return arrayList;
    }

    public static final SimpleType captureFromArguments(SimpleType type, CaptureStatus status) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        List<TypeProjection> captureArguments = captureArguments(type, status);
        if (captureArguments != null) {
            return replaceArguments(type, captureArguments);
        }
        return null;
    }

    private static final SimpleType replaceArguments(UnwrappedType unwrappedType, List<? extends TypeProjection> list) {
        return KotlinTypeFactory.simpleType$default(unwrappedType.getAttributes(), unwrappedType.getConstructor(), list, unwrappedType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
    }
}

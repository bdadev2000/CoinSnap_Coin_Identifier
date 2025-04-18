package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@SourceDebugExtension({"SMAP\nCapturedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,153:1\n1549#2:154\n1620#2,3:155\n37#3,2:158\n*S KotlinDebug\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n*L\n125#1:154\n125#1:155,3\n127#1:158,2\n*E\n"})
/* loaded from: classes4.dex */
public final class CapturedTypeConstructorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeProjection createCapturedIfNeeded(final TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor != null && typeProjection.getProjectionKind() != Variance.INVARIANT) {
            if (typeParameterDescriptor.getVariance() == typeProjection.getProjectionKind()) {
                if (typeProjection.isStarProjection()) {
                    StorageManager NO_LOCKS = LockBasedStorageManager.NO_LOCKS;
                    Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
                    return new TypeProjectionImpl(new LazyWrappedType(NO_LOCKS, new Function0<KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$createCapturedIfNeeded$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final KotlinType invoke() {
                            KotlinType type = TypeProjection.this.getType();
                            Intrinsics.checkNotNullExpressionValue(type, "this@createCapturedIfNeeded.type");
                            return type;
                        }
                    }));
                }
                return new TypeProjectionImpl(typeProjection.getType());
            }
            return new TypeProjectionImpl(createCapturedType(typeProjection));
        }
        return typeProjection;
    }

    public static final KotlinType createCapturedType(TypeProjection typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        return new CapturedType(typeProjection, null, false, null, 14, null);
    }

    public static final boolean isCaptured(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.getConstructor() instanceof CapturedTypeConstructor;
    }

    public static final TypeSubstitution wrapWithCapturingSubstitution(final TypeSubstitution typeSubstitution, final boolean z10) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(typeSubstitution, "<this>");
        if (typeSubstitution instanceof IndexedParametersSubstitution) {
            IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
            TypeParameterDescriptor[] parameters = indexedParametersSubstitution.getParameters();
            List<Pair> zip = ArraysKt.zip(indexedParametersSubstitution.getArguments(), indexedParametersSubstitution.getParameters());
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(zip, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Pair pair : zip) {
                arrayList.add(createCapturedIfNeeded((TypeProjection) pair.getFirst(), (TypeParameterDescriptor) pair.getSecond()));
            }
            return new IndexedParametersSubstitution(parameters, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), z10);
        }
        return new DelegatedTypeSubstitution(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2
            @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateContravariantCapturedTypes() {
                return z10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* renamed from: get */
            public TypeProjection mo1428get(KotlinType key) {
                TypeProjection createCapturedIfNeeded;
                Intrinsics.checkNotNullParameter(key, "key");
                TypeProjection mo1428get = super.mo1428get(key);
                TypeParameterDescriptor typeParameterDescriptor = null;
                if (mo1428get == null) {
                    return null;
                }
                ClassifierDescriptor mo1423getDeclarationDescriptor = key.getConstructor().mo1423getDeclarationDescriptor();
                if (mo1423getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                    typeParameterDescriptor = (TypeParameterDescriptor) mo1423getDeclarationDescriptor;
                }
                createCapturedIfNeeded = CapturedTypeConstructorKt.createCapturedIfNeeded(mo1428get, typeParameterDescriptor);
                return createCapturedIfNeeded;
            }
        };
    }

    public static /* synthetic */ TypeSubstitution wrapWithCapturingSubstitution$default(TypeSubstitution typeSubstitution, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z10);
    }
}

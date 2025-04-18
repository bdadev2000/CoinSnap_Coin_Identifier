package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKTypeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl$arguments$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1559#2:137\n1590#2,4:138\n*S KotlinDebug\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl$arguments$2\n*L\n81#1:137\n81#1:138,4\n*E\n"})
/* loaded from: classes4.dex */
public final class KTypeImpl$arguments$2 extends Lambda implements Function0<List<? extends KTypeProjection>> {
    final /* synthetic */ Function0<Type> $computeJavaType;
    final /* synthetic */ KTypeImpl this$0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KTypeImpl$arguments$2(KTypeImpl kTypeImpl, Function0<? extends Type> function0) {
        super(0);
        this.this$0 = kTypeImpl;
        this.$computeJavaType = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Type> invoke$lambda$0(Lazy<? extends List<? extends Type>> lazy) {
        return (List) lazy.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends KTypeProjection> invoke() {
        int collectionSizeOrDefault;
        KTypeProjection invariant;
        List<TypeProjection> arguments = this.this$0.getType().getArguments();
        if (arguments.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final KTypeImpl kTypeImpl = this.this$0;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<List<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$parameterizedTypeArguments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Type> invoke() {
                Type javaType = KTypeImpl.this.getJavaType();
                Intrinsics.checkNotNull(javaType);
                return ReflectClassUtilKt.getParameterizedTypeArguments(javaType);
            }
        });
        List<TypeProjection> list = arguments;
        Function0<Type> function0 = this.$computeJavaType;
        final KTypeImpl kTypeImpl2 = this.this$0;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        final int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.isStarProjection()) {
                invariant = KTypeProjection.INSTANCE.getSTAR();
            } else {
                KotlinType type = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type, "typeProjection.type");
                KTypeImpl kTypeImpl3 = new KTypeImpl(type, function0 == null ? null : new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$1$type$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Type invoke() {
                        List invoke$lambda$0;
                        Type javaType = KTypeImpl.this.getJavaType();
                        if (javaType instanceof Class) {
                            Class cls = (Class) javaType;
                            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                            Intrinsics.checkNotNullExpressionValue(componentType, "{\n                      …                        }");
                            return componentType;
                        }
                        if (javaType instanceof GenericArrayType) {
                            if (i10 == 0) {
                                Type genericComponentType = ((GenericArrayType) javaType).getGenericComponentType();
                                Intrinsics.checkNotNullExpressionValue(genericComponentType, "{\n                      …                        }");
                                return genericComponentType;
                            }
                            throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + KTypeImpl.this);
                        }
                        if (javaType instanceof ParameterizedType) {
                            invoke$lambda$0 = KTypeImpl$arguments$2.invoke$lambda$0(lazy);
                            Type type2 = (Type) invoke$lambda$0.get(i10);
                            if (type2 instanceof WildcardType) {
                                WildcardType wildcardType = (WildcardType) type2;
                                Type[] lowerBounds = wildcardType.getLowerBounds();
                                Intrinsics.checkNotNullExpressionValue(lowerBounds, "argument.lowerBounds");
                                Type type3 = (Type) ArraysKt.firstOrNull(lowerBounds);
                                if (type3 == null) {
                                    Type[] upperBounds = wildcardType.getUpperBounds();
                                    Intrinsics.checkNotNullExpressionValue(upperBounds, "argument.upperBounds");
                                    type2 = (Type) ArraysKt.first(upperBounds);
                                } else {
                                    type2 = type3;
                                }
                            }
                            Intrinsics.checkNotNullExpressionValue(type2, "{\n                      …                        }");
                            return type2;
                        }
                        throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + KTypeImpl.this);
                    }
                });
                int i12 = WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()];
                if (i12 == 1) {
                    invariant = KTypeProjection.INSTANCE.invariant(kTypeImpl3);
                } else if (i12 != 2) {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    invariant = KTypeProjection.INSTANCE.covariant(kTypeImpl3);
                } else {
                    invariant = KTypeProjection.INSTANCE.contravariant(kTypeImpl3);
                }
            }
            arrayList.add(invariant);
            i10 = i11;
        }
        return arrayList;
    }
}

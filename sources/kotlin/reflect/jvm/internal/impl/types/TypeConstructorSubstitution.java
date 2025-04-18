package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* loaded from: classes4.dex */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1549#2:208\n1620#2,3:209\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n*L\n96#1:208\n96#1:209,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ TypeConstructorSubstitution createByConstructorsMap$default(Companion companion, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.createByConstructorsMap(map, z10);
        }

        @JvmStatic
        public final TypeSubstitution create(KotlinType kotlinType) {
            Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
            return create(kotlinType.getConstructor(), kotlinType.getArguments());
        }

        @JvmStatic
        @JvmOverloads
        public final TypeConstructorSubstitution createByConstructorsMap(Map<TypeConstructor, ? extends TypeProjection> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return createByConstructorsMap$default(this, map, false, 2, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
        
            if (r2.isCapturedFromOuterDeclaration() == true) goto L8;
         */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution create(kotlin.reflect.jvm.internal.impl.types.TypeConstructor r6, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> r7) {
            /*
                r5 = this;
                java.lang.String r0 = "typeConstructor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "arguments"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.util.List r0 = r6.getParameters()
                java.lang.String r1 = "typeConstructor.parameters"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.Object r2 = kotlin.collections.CollectionsKt.lastOrNull(r0)
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r2
                r3 = 0
                if (r2 == 0) goto L24
                boolean r2 = r2.isCapturedFromOuterDeclaration()
                r4 = 1
                if (r2 != r4) goto L24
                goto L25
            L24:
                r4 = r3
            L25:
                if (r4 == 0) goto L64
                java.util.List r6 = r6.getParameters()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = kotlin.collections.CollectionsKt.f(r6)
                r0.<init>(r1)
                java.util.Iterator r6 = r6.iterator()
            L3d:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L51
                java.lang.Object r1 = r6.next()
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r1
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r1 = r1.getTypeConstructor()
                r0.add(r1)
                goto L3d
            L51:
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.List r6 = kotlin.collections.CollectionsKt.zip(r0, r7)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Map r6 = kotlin.collections.MapsKt.toMap(r6)
                r7 = 2
                r0 = 0
                kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution r6 = createByConstructorsMap$default(r5, r6, r3, r7, r0)
                return r6
            L64:
                kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution r6 = new kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution
                r6.<init>(r0, r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.create(kotlin.reflect.jvm.internal.impl.types.TypeConstructor, java.util.List):kotlin.reflect.jvm.internal.impl.types.TypeSubstitution");
        }

        @JvmStatic
        @JvmOverloads
        public final TypeConstructorSubstitution createByConstructorsMap(final Map<TypeConstructor, ? extends TypeProjection> map, final boolean z10) {
            Intrinsics.checkNotNullParameter(map, "map");
            return new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateCapturedTypes() {
                    return z10;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                public TypeProjection get(TypeConstructor key) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    return map.get(key);
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean isEmpty() {
                    return map.isEmpty();
                }
            };
        }
    }

    @JvmStatic
    public static final TypeSubstitution create(TypeConstructor typeConstructor, List<? extends TypeProjection> list) {
        return Companion.create(typeConstructor, list);
    }

    @JvmStatic
    @JvmOverloads
    public static final TypeConstructorSubstitution createByConstructorsMap(Map<TypeConstructor, ? extends TypeProjection> map) {
        return Companion.createByConstructorsMap(map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get */
    public TypeProjection mo1428get(KotlinType key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return get(key.getConstructor());
    }

    public abstract TypeProjection get(TypeConstructor typeConstructor);
}

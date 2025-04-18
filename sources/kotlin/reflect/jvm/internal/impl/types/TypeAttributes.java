package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;

@SourceDebugExtension({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n105#1,9:134\n105#1,9:143\n105#1,9:152\n766#2:161\n857#2,2:162\n*S KotlinDebug\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n*L\n74#1:134,9\n78#1:143,9\n82#1:152,9\n99#1:161\n99#1:162,2\n*E\n"})
/* loaded from: classes4.dex */
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> {
    public static final Companion Companion = new Companion(null);
    private static final TypeAttributes Empty = new TypeAttributes((List<? extends TypeAttribute<?>>) CollectionsKt.emptyList());

    @SourceDebugExtension({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TypeAttributes create(List<? extends TypeAttribute<?>> attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            if (attributes.isEmpty()) {
                return getEmpty();
            }
            return new TypeAttributes(attributes, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public int customComputeIfAbsent(ConcurrentHashMap<String, Integer> concurrentHashMap, String key, Function1<? super String, Integer> compute) {
            int intValue;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num == null) {
                synchronized (concurrentHashMap) {
                    Integer num2 = concurrentHashMap.get(key);
                    if (num2 == null) {
                        Integer invoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(invoke.intValue()));
                        num2 = invoke;
                    }
                    Intrinsics.checkNotNullExpressionValue(num2, "this[key] ?: compute(key…is.putIfAbsent(key, it) }");
                    intValue = num2.intValue();
                }
                return intValue;
            }
            return num.intValue();
        }

        public final TypeAttributes getEmpty() {
            return TypeAttributes.Empty;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TypeAttributes(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends TypeAttribute<?>>) list);
    }

    public final TypeAttributes add(TypeAttributes other) {
        Object add;
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = getArrayMap().get(intValue);
            TypeAttribute<?> typeAttribute2 = other.getArrayMap().get(intValue);
            if (typeAttribute == null) {
                if (typeAttribute2 != null) {
                    add = typeAttribute2.add(typeAttribute);
                } else {
                    add = null;
                }
            } else {
                add = typeAttribute.add(typeAttribute2);
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, add);
        }
        return Companion.create(arrayList);
    }

    public final boolean contains(TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (getArrayMap().get(Companion.getId(attribute.getKey())) != null) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> getTypeRegistry() {
        return Companion;
    }

    public final TypeAttributes intersect(TypeAttributes other) {
        Object intersect;
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = getArrayMap().get(intValue);
            TypeAttribute<?> typeAttribute2 = other.getArrayMap().get(intValue);
            if (typeAttribute == null) {
                if (typeAttribute2 != null) {
                    intersect = typeAttribute2.intersect(typeAttribute);
                } else {
                    intersect = null;
                }
            } else {
                intersect = typeAttribute.intersect(typeAttribute2);
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, intersect);
        }
        return Companion.create(arrayList);
    }

    public final TypeAttributes plus(TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (contains(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(attribute);
        }
        return Companion.create(CollectionsKt.plus((Collection<? extends TypeAttribute<?>>) CollectionsKt.toList(this), attribute));
    }

    public final TypeAttributes remove(TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (isEmpty()) {
            return this;
        }
        ArrayMap<TypeAttribute<?>> arrayMap = getArrayMap();
        ArrayList arrayList = new ArrayList();
        for (TypeAttribute<?> typeAttribute : arrayMap) {
            if (!Intrinsics.areEqual(typeAttribute, attribute)) {
                arrayList.add(typeAttribute);
            }
        }
        if (arrayList.size() == getArrayMap().getSize()) {
            return this;
        }
        return Companion.create(arrayList);
    }

    private TypeAttributes(List<? extends TypeAttribute<?>> list) {
        for (TypeAttribute<?> typeAttribute : list) {
            registerComponent(typeAttribute.getKey(), typeAttribute);
        }
    }

    private TypeAttributes(TypeAttribute<?> typeAttribute) {
        this((List<? extends TypeAttribute<?>>) CollectionsKt.listOf(typeAttribute));
    }
}

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes4.dex */
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {
    private ArrayMap<T> arrayMap;

    public AttributeArrayOwner(ArrayMap<T> arrayMap) {
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.arrayMap = arrayMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final ArrayMap<T> getArrayMap() {
        return this.arrayMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final void registerComponent(KClass<? extends K> tClass, T value) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(value, "value");
        int id2 = getTypeRegistry().getId(tClass);
        int size = this.arrayMap.getSize();
        if (size != 0) {
            if (size == 1) {
                ArrayMap<T> arrayMap = this.arrayMap;
                Intrinsics.checkNotNull(arrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap;
                if (oneElementArrayMap.getIndex() == id2) {
                    this.arrayMap = new OneElementArrayMap(value, id2);
                    return;
                } else {
                    ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                    this.arrayMap = arrayMapImpl;
                    arrayMapImpl.set(oneElementArrayMap.getIndex(), oneElementArrayMap.getValue());
                }
            }
            this.arrayMap.set(id2, value);
            return;
        }
        this.arrayMap = new OneElementArrayMap(value, id2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AttributeArrayOwner() {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap r0 = kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap.INSTANCE
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner.<init>():void");
    }
}

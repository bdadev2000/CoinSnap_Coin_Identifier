package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n11515#2,11:143\n13644#2,2:154\n13646#2:157\n11526#2:158\n1#3:156\n*S KotlinDebug\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n*L\n137#1:143,11\n137#1:154,2\n137#1:157\n137#1:158\n137#1:156\n*E\n"})
/* loaded from: classes4.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {
    public static final Companion Companion = new Companion(null);
    private Object[] data;
    private int size;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ArrayMapImpl(Object[] objArr, int i10) {
        super(null);
        this.data = objArr;
        this.size = i10;
    }

    private final void ensureCapacity(int i10) {
        Object[] objArr = this.data;
        if (objArr.length <= i10) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.data = copyOf;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i10) {
        return (T) ArraysKt.getOrNull(this.data, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl$iterator$1
            private int index = -1;
            final /* synthetic */ ArrayMapImpl<T> this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                Object[] objArr;
                Object[] objArr2;
                Object[] objArr3;
                Object[] objArr4;
                do {
                    int i10 = this.index + 1;
                    this.index = i10;
                    objArr = ((ArrayMapImpl) this.this$0).data;
                    if (i10 >= objArr.length) {
                        break;
                    } else {
                        objArr4 = ((ArrayMapImpl) this.this$0).data;
                    }
                } while (objArr4[this.index] == null);
                int i11 = this.index;
                objArr2 = ((ArrayMapImpl) this.this$0).data;
                if (i11 >= objArr2.length) {
                    done();
                    return;
                }
                objArr3 = ((ArrayMapImpl) this.this$0).data;
                Object obj = objArr3[this.index];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                setNext(obj);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i10, T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ensureCapacity(i10);
        if (this.data[i10] == null) {
            this.size = getSize() + 1;
        }
        this.data[i10] = value;
    }

    public ArrayMapImpl() {
        this(new Object[20], 0);
    }
}

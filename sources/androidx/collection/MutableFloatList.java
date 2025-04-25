package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FloatList.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001J\u0018\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0003J\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u000bH\u0086\nJ\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u000bH\u0086\nJ\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u0003J\u001a\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u001b\u0010\u001c\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u0006\u0010\u001d\u001a\u00020\fJ\u0006\u0010\u001e\u001a\u00020\fJ\u0010\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\u0003R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006!"}, d2 = {"Landroidx/collection/MutableFloatList;", "Landroidx/collection/FloatList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "element", "", "", "index", "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", TtmlNode.END, "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableFloatList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public MutableFloatList(int i) {
        super(i, null);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(float element) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = element;
        this._size++;
        return true;
    }

    public final void add(int index, float element) {
        if (index < 0 || index > this._size) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
        }
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        if (index != this._size) {
            ArraysKt.copyInto(fArr, fArr, index + 1, index, this._size);
        }
        fArr[index] = element;
        this._size++;
    }

    public final boolean addAll(int index, float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        float[] fArr = this.content;
        if (index != this._size) {
            ArraysKt.copyInto(fArr, fArr, elements.length + index, index, this._size);
        }
        ArraysKt.copyInto$default(elements, fArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final boolean addAll(int index, FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this._size + elements._size);
        float[] fArr = this.content;
        if (index != this._size) {
            ArraysKt.copyInto(fArr, fArr, elements._size + index, index, this._size);
        }
        ArraysKt.copyInto(elements.content, fArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final void plusAssign(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void plusAssign(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableFloatList._size;
        }
        mutableFloatList.trim(i);
    }

    public final void trim(int minCapacity) {
        int max = Math.max(minCapacity, this._size);
        if (this.content.length > max) {
            float[] copyOf = Arrays.copyOf(this.content, max);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final void ensureCapacity(int capacity) {
        float[] fArr = this.content;
        if (fArr.length < capacity) {
            float[] copyOf = Arrays.copyOf(fArr, Math.max(capacity, (fArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final void plusAssign(float element) {
        add(element);
    }

    public final void minusAssign(float element) {
        remove(element);
    }

    public final boolean remove(float element) {
        int indexOf = indexOf(element);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this._size;
        for (float f : elements) {
            remove(f);
        }
        return i != this._size;
    }

    public final boolean removeAll(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this._size;
        int i2 = elements._size - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(elements.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this._size;
    }

    public final float removeAt(int index) {
        if (index < 0 || index >= this._size) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (this._size - 1));
        }
        float[] fArr = this.content;
        float f = fArr[index];
        if (index != this._size - 1) {
            ArraysKt.copyInto(fArr, fArr, index, index + 1, this._size);
        }
        this._size--;
        return f;
    }

    public final void removeRange(int start, int end) {
        if (start < 0 || start > this._size || end < 0 || end > this._size) {
            throw new IndexOutOfBoundsException("Start (" + start + ") and end (" + end + ") must be in 0.." + this._size);
        }
        if (end < start) {
            throw new IllegalArgumentException("Start (" + start + ") is more than end (" + end + ')');
        }
        if (end != start) {
            if (end < this._size) {
                ArraysKt.copyInto(this.content, this.content, start, end, this._size);
            }
            this._size -= end - start;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        removeAt(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean retainAll(float[] r9) {
        /*
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r0 = r8._size
            float[] r1 = r8.content
            r2 = r8
            androidx.collection.FloatList r2 = (androidx.collection.FloatList) r2
            int r2 = r2._size
            r3 = 1
            int r2 = r2 - r3
        L11:
            r4 = 0
            r5 = -1
            if (r5 >= r2) goto L2c
            r5 = r1[r2]
            int r6 = r9.length
        L18:
            if (r4 >= r6) goto L26
            r7 = r9[r4]
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L23
            if (r4 >= 0) goto L29
            goto L26
        L23:
            int r4 = r4 + 1
            goto L18
        L26:
            r8.removeAt(r2)
        L29:
            int r2 = r2 + (-1)
            goto L11
        L2c:
            int r9 = r8._size
            if (r0 == r9) goto L31
            goto L32
        L31:
            r3 = r4
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatList.retainAll(float[]):boolean");
    }

    public final boolean retainAll(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this._size;
        float[] fArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            if (!elements.contains(fArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final float set(int index, float element) {
        if (index < 0 || index >= this._size) {
            throw new IndexOutOfBoundsException("set index " + index + " must be between 0 .. " + (this._size - 1));
        }
        float[] fArr = this.content;
        float f = fArr[index];
        fArr[index] = element;
        return f;
    }

    public final void sort() {
        if (this._size == 0) {
            return;
        }
        ArraysKt.sort(this.content, 0, this._size);
    }

    public final void sortDescending() {
        if (this._size == 0) {
            return;
        }
        ArraysKt.sortDescending(this.content, 0, this._size);
    }

    public final void minusAssign(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (float f : elements) {
            remove(f);
        }
    }

    public final void minusAssign(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        float[] fArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(fArr[i2]);
        }
    }
}

package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.e;
import r0.a;

/* loaded from: classes4.dex */
public interface SubcomposeSlotReusePolicy {

    @StabilityInferred
    /* loaded from: classes4.dex */
    public static final class SlotIdsSet implements Collection<Object>, a {

        /* renamed from: a, reason: collision with root package name */
        public final Set f15856a = new LinkedHashSet();

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.f15856a.add(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f15856a.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.f15856a.contains(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            return this.f15856a.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.f15856a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return this.f15856a.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f15856a.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            return this.f15856a.remove(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            return this.f15856a.retainAll(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.f15856a.size();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return e.C(this);
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return e.D(this, objArr);
        }
    }

    void a(SlotIdsSet slotIdsSet);

    boolean b(Object obj, Object obj2);
}

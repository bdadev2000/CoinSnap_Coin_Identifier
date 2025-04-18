package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class Internal {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f19251a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f19252b;

    /* loaded from: classes.dex */
    public interface BooleanList extends ProtobufList<Boolean> {
    }

    /* loaded from: classes.dex */
    public interface DoubleList extends ProtobufList<Double> {
    }

    /* loaded from: classes.dex */
    public interface EnumLite {
        int getNumber();
    }

    /* loaded from: classes.dex */
    public interface EnumLiteMap<T extends EnumLite> {
    }

    /* loaded from: classes.dex */
    public interface EnumVerifier {
        boolean a(int i2);
    }

    /* loaded from: classes.dex */
    public interface FloatList extends ProtobufList<Float> {
    }

    /* loaded from: classes.dex */
    public interface IntList extends ProtobufList<Integer> {
    }

    /* loaded from: classes.dex */
    public static class ListAdapter<F, T> extends AbstractList<T> {

        /* loaded from: classes.dex */
        public interface Converter<F, T> {
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public interface LongList extends ProtobufList<Long> {
    }

    /* loaded from: classes.dex */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f19253a = 0;

        /* renamed from: androidx.datastore.preferences.protobuf.Internal$MapAdapter$1, reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass1 implements Converter<Integer, EnumLite> {
        }

        /* loaded from: classes.dex */
        public interface Converter<A, B> {
        }

        /* loaded from: classes.dex */
        public class EntryAdapter implements Map.Entry<K, V> {

            /* renamed from: a, reason: collision with root package name */
            public final Map.Entry f19254a;

            public EntryAdapter(Map.Entry entry) {
                this.f19254a = entry;
            }

            @Override // java.util.Map.Entry
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Map.Entry) {
                    return getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public final Object getKey() {
                return this.f19254a.getKey();
            }

            @Override // java.util.Map.Entry
            public final Object getValue() {
                int i2 = MapAdapter.f19253a;
                MapAdapter.this.getClass();
                this.f19254a.getValue();
                throw null;
            }

            @Override // java.util.Map.Entry
            public final int hashCode() {
                return this.f19254a.hashCode();
            }

            @Override // java.util.Map.Entry
            public final Object setValue(Object obj) {
                int i2 = MapAdapter.f19253a;
                MapAdapter.this.getClass();
                throw null;
            }
        }

        /* loaded from: classes.dex */
        public class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw null;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw null;
            }
        }

        /* loaded from: classes.dex */
        public class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                throw null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set entrySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public interface ProtobufList<E> extends List<E>, RandomAccess {
        void i();

        boolean v();

        ProtobufList y(int i2);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f19252b = bArr;
        ByteBuffer.wrap(bArr);
        CodedInputStream.g(bArr, 0, 0, false);
    }

    public static int a(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static MessageLite b(Object obj, Object obj2) {
        return ((MessageLite) obj).a().j((MessageLite) obj2).e();
    }
}

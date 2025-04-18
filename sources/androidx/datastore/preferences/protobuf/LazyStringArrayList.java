package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.Utf8;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19271c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19272b;

    /* loaded from: classes2.dex */
    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i2, Object obj) {
            int i3 = LazyStringArrayList.f19271c;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i2, Object obj) {
            int i3 = LazyStringArrayList.f19271c;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i2, Object obj) {
            int i3 = LazyStringArrayList.f19271c;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i2, Object obj) {
            int i3 = LazyStringArrayList.f19271c;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    static {
        new LazyStringArrayList(10).f19103a = false;
    }

    public LazyStringArrayList(int i2) {
        this(new ArrayList(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final void D(ByteString byteString) {
        a();
        this.f19272b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final LazyStringList E() {
        return this.f19103a ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final Object F(int i2) {
        return this.f19272b.get(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        a();
        this.f19272b.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f19272b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        String str;
        ArrayList arrayList = this.f19272b;
        Object obj = arrayList.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            byteString.getClass();
            str = byteString.size() == 0 ? "" : byteString.r(Internal.f19251a);
            if (byteString.j()) {
                arrayList.set(i2, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, Internal.f19251a);
            Utf8.Processor processor = Utf8.f19397a;
            if (Utf8.f19397a.e(0, bArr, bArr.length)) {
                arrayList.set(i2, str);
            }
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        Object remove = this.f19272b.remove(i2);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof ByteString)) {
            return new String((byte[]) remove, Internal.f19251a);
        }
        ByteString byteString = (ByteString) remove;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.r(Internal.f19251a);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final List s() {
        return Collections.unmodifiableList(this.f19272b);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        a();
        Object obj2 = this.f19272b.set(i2, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, Internal.f19251a);
        }
        ByteString byteString = (ByteString) obj2;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.r(Internal.f19251a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19272b.size();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final boolean v() {
        return this.f19103a;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList y(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f19272b);
        return new LazyStringArrayList(arrayList);
    }

    public LazyStringArrayList(ArrayList arrayList) {
        this.f19272b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        a();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).s();
        }
        boolean addAll = this.f19272b.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}

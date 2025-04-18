package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.UnsafeUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class ListFieldSchema {

    /* renamed from: a, reason: collision with root package name */
    public static final ListFieldSchemaFull f19273a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final ListFieldSchemaLite f19274b = new Object();

    /* loaded from: classes.dex */
    public static final class ListFieldSchemaFull extends ListFieldSchema {

        /* renamed from: c, reason: collision with root package name */
        public static final Class f19275c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX WARN: Multi-variable type inference failed */
        public static List d(int i2, long j2, Object obj) {
            LazyStringArrayList lazyStringArrayList;
            List list = (List) UnsafeUtil.d.m(j2, obj);
            if (list.isEmpty()) {
                List lazyStringArrayList2 = list instanceof LazyStringList ? new LazyStringArrayList(i2) : ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).y(i2) : new ArrayList(i2);
                UnsafeUtil.v(obj, j2, lazyStringArrayList2);
                return lazyStringArrayList2;
            }
            if (f19275c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i2);
                arrayList.addAll(list);
                UnsafeUtil.v(obj, j2, arrayList);
                lazyStringArrayList = arrayList;
            } else {
                if (!(list instanceof UnmodifiableLazyStringList)) {
                    if (!(list instanceof PrimitiveNonBoxingCollection) || !(list instanceof Internal.ProtobufList)) {
                        return list;
                    }
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.v()) {
                        return list;
                    }
                    Internal.ProtobufList y2 = protobufList.y(list.size() + i2);
                    UnsafeUtil.v(obj, j2, y2);
                    return y2;
                }
                LazyStringArrayList lazyStringArrayList3 = new LazyStringArrayList(list.size() + i2);
                lazyStringArrayList3.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.v(obj, j2, lazyStringArrayList3);
                lazyStringArrayList = lazyStringArrayList3;
            }
            return lazyStringArrayList;
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public final void a(long j2, Object obj) {
            Object unmodifiableList;
            List list = (List) UnsafeUtil.d.m(j2, obj);
            if (list instanceof LazyStringList) {
                unmodifiableList = ((LazyStringList) list).E();
            } else {
                if (f19275c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.v()) {
                        protobufList.i();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.v(obj, j2, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public final void b(Object obj, long j2, Object obj2) {
            List list = (List) UnsafeUtil.d.m(j2, obj2);
            List d = d(list.size(), j2, obj);
            int size = d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d.addAll(list);
            }
            if (size > 0) {
                list = d;
            }
            UnsafeUtil.v(obj, j2, list);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public final List c(long j2, Object obj) {
            return d(10, j2, obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class ListFieldSchemaLite extends ListFieldSchema {
        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public final void a(long j2, Object obj) {
            ((Internal.ProtobufList) UnsafeUtil.d.m(j2, obj)).i();
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public final void b(Object obj, long j2, Object obj2) {
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            Internal.ProtobufList protobufList = (Internal.ProtobufList) memoryAccessor.m(j2, obj);
            Internal.ProtobufList protobufList2 = (Internal.ProtobufList) memoryAccessor.m(j2, obj2);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.v()) {
                    protobufList = protobufList.y(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            if (size > 0) {
                protobufList2 = protobufList;
            }
            UnsafeUtil.v(obj, j2, protobufList2);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        public final List c(long j2, Object obj) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) UnsafeUtil.d.m(j2, obj);
            if (protobufList.v()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList y2 = protobufList.y(size == 0 ? 10 : size * 2);
            UnsafeUtil.v(obj, j2, y2);
            return y2;
        }
    }

    public abstract void a(long j2, Object obj);

    public abstract void b(Object obj, long j2, Object obj2);

    public abstract List c(long j2, Object obj);
}

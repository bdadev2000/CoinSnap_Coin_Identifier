package d4;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: d4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2178f extends AbstractMap implements Serializable {
    public static final Object l = new Object();
    public transient Object b;

    /* renamed from: c, reason: collision with root package name */
    public transient int[] f19859c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f19860d;

    /* renamed from: f, reason: collision with root package name */
    public transient Object[] f19861f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f19862g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f19863h;

    /* renamed from: i, reason: collision with root package name */
    public transient C2175c f19864i;

    /* renamed from: j, reason: collision with root package name */
    public transient C2175c f19865j;

    /* renamed from: k, reason: collision with root package name */
    public transient C2177e f19866k;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, d4.f] */
    public static C2178f a() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f19862g = com.facebook.appevents.i.e(3, 1);
        return abstractMap;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            if (readInt >= 0) {
                this.f19862g = com.facebook.appevents.i.e(readInt, 1);
                for (int i9 = 0; i9 < readInt; i9++) {
                    put(objectInputStream.readObject(), objectInputStream.readObject());
                }
                return;
            }
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Iterator c2174b;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map b = b();
        if (b != null) {
            c2174b = b.entrySet().iterator();
        } else {
            c2174b = new C2174b(this, 1);
        }
        while (c2174b.hasNext()) {
            Map.Entry entry = (Map.Entry) c2174b.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final Map b() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f19862g & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f19862g += 32;
        Map b = b();
        if (b != null) {
            this.f19862g = com.facebook.appevents.i.e(size(), 3);
            b.clear();
            this.b = null;
            this.f19863h = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f19863h, (Object) null);
        Arrays.fill(k(), 0, this.f19863h, (Object) null);
        Object obj = this.b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f19863h, 0);
        this.f19863h = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map b = b();
        if (b != null) {
            return b.containsKey(obj);
        }
        if (d(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map b = b();
        if (b != null) {
            return b.containsValue(obj);
        }
        for (int i9 = 0; i9 < this.f19863h; i9++) {
            if (z2.i.h(obj, k()[i9])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int U8 = F2.h.U(obj);
        int c9 = c();
        Object obj2 = this.b;
        Objects.requireNonNull(obj2);
        int y4 = C2.m.y(U8 & c9, obj2);
        if (y4 == 0) {
            return -1;
        }
        int i9 = ~c9;
        int i10 = U8 & i9;
        do {
            int i11 = y4 - 1;
            int i12 = h()[i11];
            if ((i12 & i9) == i10 && z2.i.h(obj, i()[i11])) {
                return i11;
            }
            y4 = i12 & c9;
        } while (y4 != 0);
        return -1;
    }

    public final void e(int i9, int i10) {
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] h6 = h();
        Object[] i11 = i();
        Object[] k6 = k();
        int size = size();
        int i12 = size - 1;
        if (i9 < i12) {
            Object obj2 = i11[i12];
            i11[i9] = obj2;
            k6[i9] = k6[i12];
            i11[i12] = null;
            k6[i12] = null;
            h6[i9] = h6[i12];
            h6[i12] = 0;
            int U8 = F2.h.U(obj2) & i10;
            int y4 = C2.m.y(U8, obj);
            if (y4 == size) {
                C2.m.z(U8, i9 + 1, obj);
                return;
            }
            while (true) {
                int i13 = y4 - 1;
                int i14 = h6[i13];
                int i15 = i14 & i10;
                if (i15 == size) {
                    h6[i13] = C2.m.u(i14, i9 + 1, i10);
                    return;
                }
                y4 = i15;
            }
        } else {
            i11[i9] = null;
            k6[i9] = null;
            h6[i9] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C2175c c2175c = this.f19865j;
        if (c2175c == null) {
            C2175c c2175c2 = new C2175c(this, 0);
            this.f19865j = c2175c2;
            return c2175c2;
        }
        return c2175c;
    }

    public final boolean f() {
        if (this.b == null) {
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        boolean f9 = f();
        Object obj2 = l;
        if (f9) {
            return obj2;
        }
        int c9 = c();
        Object obj3 = this.b;
        Objects.requireNonNull(obj3);
        int v6 = C2.m.v(obj, null, c9, obj3, h(), i(), null);
        if (v6 == -1) {
            return obj2;
        }
        Object obj4 = k()[v6];
        e(v6, c9);
        this.f19863h--;
        this.f19862g += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map b = b();
        if (b != null) {
            return b.get(obj);
        }
        int d2 = d(obj);
        if (d2 == -1) {
            return null;
        }
        return k()[d2];
    }

    public final int[] h() {
        int[] iArr = this.f19859c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f19860d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] k() {
        Object[] objArr = this.f19861f;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C2175c c2175c = this.f19864i;
        if (c2175c == null) {
            C2175c c2175c2 = new C2175c(this, 1);
            this.f19864i = c2175c2;
            return c2175c2;
        }
        return c2175c;
    }

    public final int l(int i9, int i10, int i11, int i12) {
        Object k6 = C2.m.k(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            C2.m.z(i11 & i13, i12 + 1, k6);
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] h6 = h();
        for (int i14 = 0; i14 <= i9; i14++) {
            int y4 = C2.m.y(i14, obj);
            while (y4 != 0) {
                int i15 = y4 - 1;
                int i16 = h6[i15];
                int i17 = ((~i9) & i16) | i14;
                int i18 = i17 & i13;
                int y6 = C2.m.y(i18, k6);
                C2.m.z(i18, y4, k6);
                h6[i15] = C2.m.u(i17, y6, i13);
                y4 = i16 & i9;
            }
        }
        this.b = k6;
        this.f19862g = C2.m.u(this.f19862g, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0102 -> B:47:0x00e8). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.C2178f.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map b = b();
        if (b != null) {
            return b.remove(obj);
        }
        Object g9 = g(obj);
        if (g9 == l) {
            return null;
        }
        return g9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map b = b();
        if (b != null) {
            return b.size();
        }
        return this.f19863h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C2177e c2177e = this.f19866k;
        if (c2177e == null) {
            C2177e c2177e2 = new C2177e(this);
            this.f19866k = c2177e2;
            return c2177e2;
        }
        return c2177e;
    }
}

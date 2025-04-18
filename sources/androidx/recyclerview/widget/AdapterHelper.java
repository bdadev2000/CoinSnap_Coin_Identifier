package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AdapterHelper implements OpReorderer.Callback {
    public final Callback d;

    /* renamed from: a, reason: collision with root package name */
    public final Pools.SimplePool f20916a = new Pools.SimplePool(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20917b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f20918c = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public int f20920g = 0;
    public final boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    public final OpReorderer f20919f = new OpReorderer(this);

    /* loaded from: classes2.dex */
    public interface Callback {
        void a(int i2, int i3);

        void b(UpdateOp updateOp);

        void c(UpdateOp updateOp);

        void d(int i2, int i3);

        void e(int i2, int i3, Object obj);

        RecyclerView.ViewHolder f(int i2);

        void g(int i2, int i3);

        void h(int i2, int i3);
    }

    /* loaded from: classes2.dex */
    public static final class UpdateOp {

        /* renamed from: a, reason: collision with root package name */
        public int f20921a;

        /* renamed from: b, reason: collision with root package name */
        public int f20922b;

        /* renamed from: c, reason: collision with root package name */
        public Object f20923c;
        public int d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateOp)) {
                return false;
            }
            UpdateOp updateOp = (UpdateOp) obj;
            int i2 = this.f20921a;
            if (i2 != updateOp.f20921a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.d - this.f20922b) == 1 && this.d == updateOp.f20922b && this.f20922b == updateOp.d) {
                return true;
            }
            if (this.d != updateOp.d || this.f20922b != updateOp.f20922b) {
                return false;
            }
            Object obj2 = this.f20923c;
            if (obj2 != null) {
                if (!obj2.equals(updateOp.f20923c)) {
                    return false;
                }
            } else if (updateOp.f20923c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f20921a * 31) + this.f20922b) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i2 = this.f20921a;
            sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : ImpressionLog.f29260l);
            sb.append(",s:");
            sb.append(this.f20922b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.f20923c);
            sb.append("]");
            return sb.toString();
        }
    }

    public AdapterHelper(RecyclerView.AnonymousClass6 anonymousClass6) {
        this.d = anonymousClass6;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.recyclerview.widget.AdapterHelper$UpdateOp, java.lang.Object] */
    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public final UpdateOp a(int i2, int i3, int i4, Object obj) {
        UpdateOp updateOp = (UpdateOp) this.f20916a.b();
        if (updateOp != null) {
            updateOp.f20921a = i2;
            updateOp.f20922b = i3;
            updateOp.d = i4;
            updateOp.f20923c = obj;
            return updateOp;
        }
        ?? obj2 = new Object();
        obj2.f20921a = i2;
        obj2.f20922b = i3;
        obj2.d = i4;
        obj2.f20923c = obj;
        return obj2;
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public final void b(UpdateOp updateOp) {
        if (this.e) {
            return;
        }
        updateOp.f20923c = null;
        this.f20916a.a(updateOp);
    }

    public final boolean c(int i2) {
        ArrayList arrayList = this.f20918c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i3);
            int i4 = updateOp.f20921a;
            if (i4 == 8) {
                if (h(updateOp.d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = updateOp.f20922b;
                int i6 = updateOp.d + i5;
                while (i5 < i6) {
                    if (h(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.f20918c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.d.c((UpdateOp) arrayList.get(i2));
        }
        l(arrayList);
        this.f20920g = 0;
    }

    public final void e() {
        d();
        ArrayList arrayList = this.f20917b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i2);
            int i3 = updateOp.f20921a;
            Callback callback = this.d;
            if (i3 == 1) {
                callback.c(updateOp);
                callback.g(updateOp.f20922b, updateOp.d);
            } else if (i3 == 2) {
                callback.c(updateOp);
                callback.h(updateOp.f20922b, updateOp.d);
            } else if (i3 == 4) {
                callback.c(updateOp);
                callback.e(updateOp.f20922b, updateOp.d, updateOp.f20923c);
            } else if (i3 == 8) {
                callback.c(updateOp);
                callback.a(updateOp.f20922b, updateOp.d);
            }
        }
        l(arrayList);
        this.f20920g = 0;
    }

    public final void f(UpdateOp updateOp) {
        int i2;
        int i3 = updateOp.f20921a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m2 = m(updateOp.f20922b, i3);
        int i4 = updateOp.f20922b;
        int i5 = updateOp.f20921a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < updateOp.d; i7++) {
            int m3 = m((i2 * i7) + updateOp.f20922b, updateOp.f20921a);
            int i8 = updateOp.f20921a;
            if (i8 == 2 ? m3 != m2 : !(i8 == 4 && m3 == m2 + 1)) {
                UpdateOp a2 = a(i8, m2, i6, updateOp.f20923c);
                g(a2, i4);
                b(a2);
                if (updateOp.f20921a == 4) {
                    i4 += i6;
                }
                i6 = 1;
                m2 = m3;
            } else {
                i6++;
            }
        }
        Object obj = updateOp.f20923c;
        b(updateOp);
        if (i6 > 0) {
            UpdateOp a3 = a(updateOp.f20921a, m2, i6, obj);
            g(a3, i4);
            b(a3);
        }
    }

    public final void g(UpdateOp updateOp, int i2) {
        Callback callback = this.d;
        callback.b(updateOp);
        int i3 = updateOp.f20921a;
        if (i3 == 2) {
            callback.h(i2, updateOp.d);
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            callback.e(i2, updateOp.d, updateOp.f20923c);
        }
    }

    public final int h(int i2, int i3) {
        ArrayList arrayList = this.f20918c;
        int size = arrayList.size();
        while (i3 < size) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i3);
            int i4 = updateOp.f20921a;
            if (i4 == 8) {
                int i5 = updateOp.f20922b;
                if (i5 == i2) {
                    i2 = updateOp.d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (updateOp.d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = updateOp.f20922b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = updateOp.d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += updateOp.d;
                }
            }
            i3++;
        }
        return i2;
    }

    public final boolean i() {
        return this.f20917b.size() > 0;
    }

    public final void j(UpdateOp updateOp) {
        this.f20918c.add(updateOp);
        int i2 = updateOp.f20921a;
        Callback callback = this.d;
        if (i2 == 1) {
            callback.g(updateOp.f20922b, updateOp.d);
            return;
        }
        if (i2 == 2) {
            callback.d(updateOp.f20922b, updateOp.d);
            return;
        }
        if (i2 == 4) {
            callback.e(updateOp.f20922b, updateOp.d, updateOp.f20923c);
        } else if (i2 == 8) {
            callback.a(updateOp.f20922b, updateOp.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AdapterHelper.k():void");
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b((UpdateOp) arrayList.get(i2));
        }
        arrayList.clear();
    }

    public final int m(int i2, int i3) {
        int i4;
        int i5;
        ArrayList arrayList = this.f20918c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(size);
            int i6 = updateOp.f20921a;
            if (i6 == 8) {
                int i7 = updateOp.f20922b;
                int i8 = updateOp.d;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            updateOp.f20922b = i7 + 1;
                            updateOp.d = i8 + 1;
                        } else if (i3 == 2) {
                            updateOp.f20922b = i7 - 1;
                            updateOp.d = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        updateOp.d = i8 + 1;
                    } else if (i3 == 2) {
                        updateOp.d = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        updateOp.f20922b = i7 + 1;
                    } else if (i3 == 2) {
                        updateOp.f20922b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = updateOp.f20922b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= updateOp.d;
                    } else if (i6 == 2) {
                        i2 += updateOp.d;
                    }
                } else if (i3 == 1) {
                    updateOp.f20922b = i9 + 1;
                } else if (i3 == 2) {
                    updateOp.f20922b = i9 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = (UpdateOp) arrayList.get(size2);
            if (updateOp2.f20921a == 8) {
                int i10 = updateOp2.d;
                if (i10 == updateOp2.f20922b || i10 < 0) {
                    arrayList.remove(size2);
                    b(updateOp2);
                }
            } else if (updateOp2.d <= 0) {
                arrayList.remove(size2);
                b(updateOp2);
            }
        }
        return i2;
    }
}

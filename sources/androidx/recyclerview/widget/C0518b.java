package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518b {

    /* renamed from: d, reason: collision with root package name */
    public final H f4955d;

    /* renamed from: a, reason: collision with root package name */
    public final S.d f4953a = new S.d(30);
    public final ArrayList b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4954c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f4957f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final T f4956e = new T(this, 2);

    public C0518b(H h6) {
        this.f4955d = h6;
    }

    public final boolean a(int i9) {
        ArrayList arrayList = this.f4954c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0516a c0516a = (C0516a) arrayList.get(i10);
            int i11 = c0516a.f4950a;
            if (i11 == 8) {
                if (f(c0516a.f4952d, i10 + 1) == i9) {
                    return true;
                }
            } else if (i11 == 1) {
                int i12 = c0516a.b;
                int i13 = c0516a.f4952d + i12;
                while (i12 < i13) {
                    if (f(i12, i10 + 1) == i9) {
                        return true;
                    }
                    i12++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f4954c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f4955d.a((C0516a) arrayList.get(i9));
        }
        l(arrayList);
        this.f4957f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C0516a c0516a = (C0516a) arrayList.get(i9);
            int i10 = c0516a.f4950a;
            H h6 = this.f4955d;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            h6.a(c0516a);
                            int i11 = c0516a.b;
                            int i12 = c0516a.f4952d;
                            RecyclerView recyclerView = h6.f4935a;
                            recyclerView.offsetPositionRecordsForMove(i11, i12);
                            recyclerView.mItemsAddedOrRemoved = true;
                        }
                    } else {
                        h6.a(c0516a);
                        int i13 = c0516a.b;
                        int i14 = c0516a.f4952d;
                        Object obj = c0516a.f4951c;
                        RecyclerView recyclerView2 = h6.f4935a;
                        recyclerView2.viewRangeUpdate(i13, i14, obj);
                        recyclerView2.mItemsChanged = true;
                    }
                } else {
                    h6.a(c0516a);
                    int i15 = c0516a.b;
                    int i16 = c0516a.f4952d;
                    RecyclerView recyclerView3 = h6.f4935a;
                    recyclerView3.offsetPositionRecordsForRemove(i15, i16, true);
                    recyclerView3.mItemsAddedOrRemoved = true;
                    recyclerView3.mState.f5027c += i16;
                }
            } else {
                h6.a(c0516a);
                int i17 = c0516a.b;
                int i18 = c0516a.f4952d;
                RecyclerView recyclerView4 = h6.f4935a;
                recyclerView4.offsetPositionRecordsForInsert(i17, i18);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        l(arrayList);
        this.f4957f = 0;
    }

    public final void d(C0516a c0516a) {
        int i9;
        int i10 = c0516a.f4950a;
        if (i10 != 1 && i10 != 8) {
            int m = m(c0516a.b, i10);
            int i11 = c0516a.b;
            int i12 = c0516a.f4950a;
            if (i12 != 2) {
                if (i12 == 4) {
                    i9 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + c0516a);
                }
            } else {
                i9 = 0;
            }
            int i13 = 1;
            for (int i14 = 1; i14 < c0516a.f4952d; i14++) {
                int m2 = m((i9 * i14) + c0516a.b, c0516a.f4950a);
                int i15 = c0516a.f4950a;
                if (i15 == 2 ? m2 == m : !(i15 != 4 || m2 != m + 1)) {
                    i13++;
                } else {
                    C0516a h6 = h(i15, m, i13, c0516a.f4951c);
                    e(h6, i11);
                    h6.f4951c = null;
                    this.f4953a.b(h6);
                    if (c0516a.f4950a == 4) {
                        i11 += i13;
                    }
                    i13 = 1;
                    m = m2;
                }
            }
            Object obj = c0516a.f4951c;
            c0516a.f4951c = null;
            this.f4953a.b(c0516a);
            if (i13 > 0) {
                C0516a h9 = h(c0516a.f4950a, m, i13, obj);
                e(h9, i11);
                h9.f4951c = null;
                this.f4953a.b(h9);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(C0516a c0516a, int i9) {
        H h6 = this.f4955d;
        h6.a(c0516a);
        int i10 = c0516a.f4950a;
        RecyclerView recyclerView = h6.f4935a;
        if (i10 != 2) {
            if (i10 == 4) {
                recyclerView.viewRangeUpdate(i9, c0516a.f4952d, c0516a.f4951c);
                recyclerView.mItemsChanged = true;
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i11 = c0516a.f4952d;
        recyclerView.offsetPositionRecordsForRemove(i9, i11, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f5027c += i11;
    }

    public final int f(int i9, int i10) {
        ArrayList arrayList = this.f4954c;
        int size = arrayList.size();
        while (i10 < size) {
            C0516a c0516a = (C0516a) arrayList.get(i10);
            int i11 = c0516a.f4950a;
            if (i11 == 8) {
                int i12 = c0516a.b;
                if (i12 == i9) {
                    i9 = c0516a.f4952d;
                } else {
                    if (i12 < i9) {
                        i9--;
                    }
                    if (c0516a.f4952d <= i9) {
                        i9++;
                    }
                }
            } else {
                int i13 = c0516a.b;
                if (i13 > i9) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = c0516a.f4952d;
                    if (i9 < i13 + i14) {
                        return -1;
                    }
                    i9 -= i14;
                } else if (i11 == 1) {
                    i9 += c0516a.f4952d;
                }
            }
            i10++;
        }
        return i9;
    }

    public final boolean g() {
        if (this.b.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.recyclerview.widget.a] */
    public final C0516a h(int i9, int i10, int i11, Object obj) {
        C0516a c0516a = (C0516a) this.f4953a.g();
        if (c0516a == null) {
            ?? obj2 = new Object();
            obj2.f4950a = i9;
            obj2.b = i10;
            obj2.f4952d = i11;
            obj2.f4951c = obj;
            return obj2;
        }
        c0516a.f4950a = i9;
        c0516a.b = i10;
        c0516a.f4952d = i11;
        c0516a.f4951c = obj;
        return c0516a;
    }

    public final void i(C0516a c0516a) {
        this.f4954c.add(c0516a);
        int i9 = c0516a.f4950a;
        H h6 = this.f4955d;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 == 8) {
                        int i10 = c0516a.b;
                        int i11 = c0516a.f4952d;
                        RecyclerView recyclerView = h6.f4935a;
                        recyclerView.offsetPositionRecordsForMove(i10, i11);
                        recyclerView.mItemsAddedOrRemoved = true;
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + c0516a);
                }
                int i12 = c0516a.b;
                int i13 = c0516a.f4952d;
                Object obj = c0516a.f4951c;
                RecyclerView recyclerView2 = h6.f4935a;
                recyclerView2.viewRangeUpdate(i12, i13, obj);
                recyclerView2.mItemsChanged = true;
                return;
            }
            int i14 = c0516a.b;
            int i15 = c0516a.f4952d;
            RecyclerView recyclerView3 = h6.f4935a;
            recyclerView3.offsetPositionRecordsForRemove(i14, i15, false);
            recyclerView3.mItemsAddedOrRemoved = true;
            return;
        }
        int i16 = c0516a.b;
        int i17 = c0516a.f4952d;
        RecyclerView recyclerView4 = h6.f4935a;
        recyclerView4.offsetPositionRecordsForInsert(i16, i17);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0119 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0518b.j():void");
    }

    public final void k(C0516a c0516a) {
        c0516a.f4951c = null;
        this.f4953a.b(c0516a);
    }

    public final void l(List list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            k((C0516a) list.get(i9));
        }
        list.clear();
    }

    public final int m(int i9, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = this.f4954c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0516a c0516a = (C0516a) arrayList.get(size);
            int i13 = c0516a.f4950a;
            if (i13 == 8) {
                int i14 = c0516a.b;
                int i15 = c0516a.f4952d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i9 >= i12 && i9 <= i11) {
                    if (i12 == i14) {
                        if (i10 == 1) {
                            c0516a.f4952d = i15 + 1;
                        } else if (i10 == 2) {
                            c0516a.f4952d = i15 - 1;
                        }
                        i9++;
                    } else {
                        if (i10 == 1) {
                            c0516a.b = i14 + 1;
                        } else if (i10 == 2) {
                            c0516a.b = i14 - 1;
                        }
                        i9--;
                    }
                } else if (i9 < i14) {
                    if (i10 == 1) {
                        c0516a.b = i14 + 1;
                        c0516a.f4952d = i15 + 1;
                    } else if (i10 == 2) {
                        c0516a.b = i14 - 1;
                        c0516a.f4952d = i15 - 1;
                    }
                }
            } else {
                int i16 = c0516a.b;
                if (i16 <= i9) {
                    if (i13 == 1) {
                        i9 -= c0516a.f4952d;
                    } else if (i13 == 2) {
                        i9 += c0516a.f4952d;
                    }
                } else if (i10 == 1) {
                    c0516a.b = i16 + 1;
                } else if (i10 == 2) {
                    c0516a.b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0516a c0516a2 = (C0516a) arrayList.get(size2);
            if (c0516a2.f4950a == 8) {
                int i17 = c0516a2.f4952d;
                if (i17 == c0516a2.b || i17 < 0) {
                    arrayList.remove(size2);
                    c0516a2.f4951c = null;
                    this.f4953a.b(c0516a2);
                }
            } else if (c0516a2.f4952d <= 0) {
                arrayList.remove(size2);
                c0516a2.f4951c = null;
                this.f4953a.b(c0516a2);
            }
        }
        return i9;
    }
}

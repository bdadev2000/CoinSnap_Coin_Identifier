package androidx.recyclerview.widget;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public final h0 f1864d;
    public final t.e a = new t.e(30, 1);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1862b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1863c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f1866f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final s0 f1865e = new s0(this, 2);

    public b(h0 h0Var) {
        this.f1864d = h0Var;
    }

    public final boolean a(int i10) {
        ArrayList arrayList = this.f1863c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.a;
            if (i12 == 8) {
                if (f(aVar.f1857d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = aVar.f1855b;
                int i14 = aVar.f1857d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f1863c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1864d.a((a) arrayList.get(i10));
        }
        l(arrayList);
        this.f1866f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f1862b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.a;
            h0 h0Var = this.f1864d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            h0Var.a(aVar);
                            int i12 = aVar.f1855b;
                            int i13 = aVar.f1857d;
                            RecyclerView recyclerView = h0Var.a;
                            recyclerView.offsetPositionRecordsForMove(i12, i13);
                            recyclerView.mItemsAddedOrRemoved = true;
                        }
                    } else {
                        h0Var.a(aVar);
                        int i14 = aVar.f1855b;
                        int i15 = aVar.f1857d;
                        Object obj = aVar.f1856c;
                        RecyclerView recyclerView2 = h0Var.a;
                        recyclerView2.viewRangeUpdate(i14, i15, obj);
                        recyclerView2.mItemsChanged = true;
                    }
                } else {
                    h0Var.a(aVar);
                    int i16 = aVar.f1855b;
                    int i17 = aVar.f1857d;
                    RecyclerView recyclerView3 = h0Var.a;
                    recyclerView3.offsetPositionRecordsForRemove(i16, i17, true);
                    recyclerView3.mItemsAddedOrRemoved = true;
                    recyclerView3.mState.f1961c += i17;
                }
            } else {
                h0Var.a(aVar);
                int i18 = aVar.f1855b;
                int i19 = aVar.f1857d;
                RecyclerView recyclerView4 = h0Var.a;
                recyclerView4.offsetPositionRecordsForInsert(i18, i19);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        l(arrayList);
        this.f1866f = 0;
    }

    public final void d(a aVar) {
        int i10;
        t.e eVar;
        boolean z10;
        int i11 = aVar.a;
        if (i11 != 1 && i11 != 8) {
            int m10 = m(aVar.f1855b, i11);
            int i12 = aVar.f1855b;
            int i13 = aVar.a;
            if (i13 != 2) {
                if (i13 == 4) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + aVar);
                }
            } else {
                i10 = 0;
            }
            int i14 = 1;
            int i15 = 1;
            while (true) {
                int i16 = aVar.f1857d;
                eVar = this.a;
                if (i14 >= i16) {
                    break;
                }
                int m11 = m((i10 * i14) + aVar.f1855b, aVar.a);
                int i17 = aVar.a;
                if (i17 == 2 ? m11 == m10 : !(i17 != 4 || m11 != m10 + 1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i15++;
                } else {
                    a h10 = h(i17, m10, i15, aVar.f1856c);
                    e(h10, i12);
                    h10.f1856c = null;
                    eVar.c(h10);
                    if (aVar.a == 4) {
                        i12 += i15;
                    }
                    i15 = 1;
                    m10 = m11;
                }
                i14++;
            }
            Object obj = aVar.f1856c;
            aVar.f1856c = null;
            eVar.c(aVar);
            if (i15 > 0) {
                a h11 = h(aVar.a, m10, i15, obj);
                e(h11, i12);
                h11.f1856c = null;
                eVar.c(h11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(a aVar, int i10) {
        h0 h0Var = this.f1864d;
        h0Var.a(aVar);
        int i11 = aVar.a;
        RecyclerView recyclerView = h0Var.a;
        if (i11 != 2) {
            if (i11 == 4) {
                recyclerView.viewRangeUpdate(i10, aVar.f1857d, aVar.f1856c);
                recyclerView.mItemsChanged = true;
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = aVar.f1857d;
        recyclerView.offsetPositionRecordsForRemove(i10, i12, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f1961c += i12;
    }

    public final int f(int i10, int i11) {
        ArrayList arrayList = this.f1863c;
        int size = arrayList.size();
        while (i11 < size) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.a;
            if (i12 == 8) {
                int i13 = aVar.f1855b;
                if (i13 == i10) {
                    i10 = aVar.f1857d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.f1857d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.f1855b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.f1857d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.f1857d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f1862b.size() > 0;
    }

    public final a h(int i10, int i11, int i12, Object obj) {
        a aVar = (a) this.a.d();
        if (aVar == null) {
            return new a(i10, i11, i12, obj);
        }
        aVar.a = i10;
        aVar.f1855b = i11;
        aVar.f1857d = i12;
        aVar.f1856c = obj;
        return aVar;
    }

    public final void i(a aVar) {
        this.f1863c.add(aVar);
        int i10 = aVar.a;
        h0 h0Var = this.f1864d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        int i11 = aVar.f1855b;
                        int i12 = aVar.f1857d;
                        RecyclerView recyclerView = h0Var.a;
                        recyclerView.offsetPositionRecordsForMove(i11, i12);
                        recyclerView.mItemsAddedOrRemoved = true;
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                int i13 = aVar.f1855b;
                int i14 = aVar.f1857d;
                Object obj = aVar.f1856c;
                RecyclerView recyclerView2 = h0Var.a;
                recyclerView2.viewRangeUpdate(i13, i14, obj);
                recyclerView2.mItemsChanged = true;
                return;
            }
            int i15 = aVar.f1855b;
            int i16 = aVar.f1857d;
            RecyclerView recyclerView3 = h0Var.a;
            recyclerView3.offsetPositionRecordsForRemove(i15, i16, false);
            recyclerView3.mItemsAddedOrRemoved = true;
            return;
        }
        int i17 = aVar.f1855b;
        int i18 = aVar.f1857d;
        RecyclerView recyclerView4 = h0Var.a;
        recyclerView4.offsetPositionRecordsForInsert(i17, i18);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.b.j():void");
    }

    public final void k(a aVar) {
        aVar.f1856c = null;
        this.a.c(aVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((a) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        ArrayList arrayList = this.f1863c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i14 = aVar.a;
            if (i14 == 8) {
                int i15 = aVar.f1855b;
                int i16 = aVar.f1857d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 >= i13 && i10 <= i12) {
                    if (i13 == i15) {
                        if (i11 == 1) {
                            aVar.f1857d = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.f1857d = i16 - 1;
                        }
                        i10++;
                    } else {
                        if (i11 == 1) {
                            aVar.f1855b = i15 + 1;
                        } else if (i11 == 2) {
                            aVar.f1855b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        aVar.f1855b = i15 + 1;
                        aVar.f1857d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f1855b = i15 - 1;
                        aVar.f1857d = i16 - 1;
                    }
                }
            } else {
                int i17 = aVar.f1855b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.f1857d;
                    } else if (i14 == 2) {
                        i10 += aVar.f1857d;
                    }
                } else if (i11 == 1) {
                    aVar.f1855b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f1855b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.a == 8) {
                int i18 = aVar2.f1857d;
                if (i18 == aVar2.f1855b || i18 < 0) {
                    arrayList.remove(size2);
                    k(aVar2);
                }
            } else if (aVar2.f1857d <= 0) {
                arrayList.remove(size2);
                k(aVar2);
            }
        }
        return i10;
    }
}

package uc;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class m extends AbstractMap implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final b0.g f25783k = new b0.g(6);

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f25784b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25785c;

    /* renamed from: d, reason: collision with root package name */
    public l f25786d;

    /* renamed from: f, reason: collision with root package name */
    public int f25787f;

    /* renamed from: g, reason: collision with root package name */
    public int f25788g;

    /* renamed from: h, reason: collision with root package name */
    public final l f25789h;

    /* renamed from: i, reason: collision with root package name */
    public j f25790i;

    /* renamed from: j, reason: collision with root package name */
    public j f25791j;

    public m(boolean z10) {
        b0.g gVar = f25783k;
        this.f25787f = 0;
        this.f25788g = 0;
        this.f25784b = gVar;
        this.f25785c = z10;
        this.f25789h = new l(z10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final l a(Object obj, boolean z10) {
        int i10;
        l lVar;
        Comparable comparable;
        l lVar2;
        l lVar3 = this.f25786d;
        b0.g gVar = f25783k;
        Comparator comparator = this.f25784b;
        if (lVar3 != null) {
            if (comparator == gVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = lVar3.f25779h;
                if (comparable != null) {
                    i10 = comparable.compareTo(obj2);
                } else {
                    i10 = comparator.compare(obj, obj2);
                }
                if (i10 == 0) {
                    return lVar3;
                }
                if (i10 < 0) {
                    lVar2 = lVar3.f25775c;
                } else {
                    lVar2 = lVar3.f25776d;
                }
                if (lVar2 == null) {
                    break;
                }
                lVar3 = lVar2;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        l lVar4 = this.f25789h;
        if (lVar3 == null) {
            if (comparator == gVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(this.f25785c, lVar3, obj, lVar4, lVar4.f25778g);
            this.f25786d = lVar;
        } else {
            lVar = new l(this.f25785c, lVar3, obj, lVar4, lVar4.f25778g);
            if (i10 < 0) {
                lVar3.f25775c = lVar;
            } else {
                lVar3.f25776d = lVar;
            }
            c(lVar3, true);
        }
        this.f25787f++;
        this.f25788g++;
        return lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final uc.l b(java.util.Map.Entry r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Ld
            uc.l r0 = r4.a(r0, r1)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L1d
            java.lang.Object r3 = r0.f25781j
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r3, r5)
            if (r5 == 0) goto L1d
            r1 = 1
        L1d:
            if (r1 == 0) goto L20
            r2 = r0
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.m.b(java.util.Map$Entry):uc.l");
    }

    public final void c(l lVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (lVar != null) {
            l lVar2 = lVar.f25775c;
            l lVar3 = lVar.f25776d;
            int i14 = 0;
            if (lVar2 != null) {
                i10 = lVar2.f25782k;
            } else {
                i10 = 0;
            }
            if (lVar3 != null) {
                i11 = lVar3.f25782k;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                l lVar4 = lVar3.f25775c;
                l lVar5 = lVar3.f25776d;
                if (lVar5 != null) {
                    i13 = lVar5.f25782k;
                } else {
                    i13 = 0;
                }
                if (lVar4 != null) {
                    i14 = lVar4.f25782k;
                }
                int i16 = i14 - i13;
                if (i16 != -1 && (i16 != 0 || z10)) {
                    g(lVar3);
                    f(lVar);
                } else {
                    f(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 2) {
                l lVar6 = lVar2.f25775c;
                l lVar7 = lVar2.f25776d;
                if (lVar7 != null) {
                    i12 = lVar7.f25782k;
                } else {
                    i12 = 0;
                }
                if (lVar6 != null) {
                    i14 = lVar6.f25782k;
                }
                int i17 = i14 - i12;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    f(lVar2);
                    g(lVar);
                } else {
                    g(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 0) {
                lVar.f25782k = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                lVar.f25782k = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            lVar = lVar.f25774b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f25786d = null;
        this.f25787f = 0;
        this.f25788g++;
        l lVar = this.f25789h;
        lVar.f25778g = lVar;
        lVar.f25777f = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L8
            uc.l r2 = r1.a(r2, r0)     // Catch: java.lang.ClassCastException -> L8
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto Lc
            r0 = 1
        Lc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.m.containsKey(java.lang.Object):boolean");
    }

    public final void d(l lVar, boolean z10) {
        l lVar2;
        l lVar3;
        int i10;
        if (z10) {
            l lVar4 = lVar.f25778g;
            lVar4.f25777f = lVar.f25777f;
            lVar.f25777f.f25778g = lVar4;
        }
        l lVar5 = lVar.f25775c;
        l lVar6 = lVar.f25776d;
        l lVar7 = lVar.f25774b;
        int i11 = 0;
        if (lVar5 != null && lVar6 != null) {
            if (lVar5.f25782k > lVar6.f25782k) {
                l lVar8 = lVar5.f25776d;
                while (true) {
                    l lVar9 = lVar8;
                    lVar3 = lVar5;
                    lVar5 = lVar9;
                    if (lVar5 == null) {
                        break;
                    } else {
                        lVar8 = lVar5.f25776d;
                    }
                }
            } else {
                l lVar10 = lVar6.f25775c;
                while (true) {
                    lVar2 = lVar6;
                    lVar6 = lVar10;
                    if (lVar6 == null) {
                        break;
                    } else {
                        lVar10 = lVar6.f25775c;
                    }
                }
                lVar3 = lVar2;
            }
            d(lVar3, false);
            l lVar11 = lVar.f25775c;
            if (lVar11 != null) {
                i10 = lVar11.f25782k;
                lVar3.f25775c = lVar11;
                lVar11.f25774b = lVar3;
                lVar.f25775c = null;
            } else {
                i10 = 0;
            }
            l lVar12 = lVar.f25776d;
            if (lVar12 != null) {
                i11 = lVar12.f25782k;
                lVar3.f25776d = lVar12;
                lVar12.f25774b = lVar3;
                lVar.f25776d = null;
            }
            lVar3.f25782k = Math.max(i10, i11) + 1;
            e(lVar, lVar3);
            return;
        }
        if (lVar5 != null) {
            e(lVar, lVar5);
            lVar.f25775c = null;
        } else if (lVar6 != null) {
            e(lVar, lVar6);
            lVar.f25776d = null;
        } else {
            e(lVar, null);
        }
        c(lVar7, false);
        this.f25787f--;
        this.f25788g++;
    }

    public final void e(l lVar, l lVar2) {
        l lVar3 = lVar.f25774b;
        lVar.f25774b = null;
        if (lVar2 != null) {
            lVar2.f25774b = lVar3;
        }
        if (lVar3 != null) {
            if (lVar3.f25775c == lVar) {
                lVar3.f25775c = lVar2;
                return;
            } else {
                lVar3.f25776d = lVar2;
                return;
            }
        }
        this.f25786d = lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        j jVar = this.f25790i;
        if (jVar == null) {
            j jVar2 = new j(this, 0);
            this.f25790i = jVar2;
            return jVar2;
        }
        return jVar;
    }

    public final void f(l lVar) {
        int i10;
        int i11;
        l lVar2 = lVar.f25775c;
        l lVar3 = lVar.f25776d;
        l lVar4 = lVar3.f25775c;
        l lVar5 = lVar3.f25776d;
        lVar.f25776d = lVar4;
        if (lVar4 != null) {
            lVar4.f25774b = lVar;
        }
        e(lVar, lVar3);
        lVar3.f25775c = lVar;
        lVar.f25774b = lVar3;
        int i12 = 0;
        if (lVar2 != null) {
            i10 = lVar2.f25782k;
        } else {
            i10 = 0;
        }
        if (lVar4 != null) {
            i11 = lVar4.f25782k;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        lVar.f25782k = max;
        if (lVar5 != null) {
            i12 = lVar5.f25782k;
        }
        lVar3.f25782k = Math.max(max, i12) + 1;
    }

    public final void g(l lVar) {
        int i10;
        int i11;
        l lVar2 = lVar.f25775c;
        l lVar3 = lVar.f25776d;
        l lVar4 = lVar2.f25775c;
        l lVar5 = lVar2.f25776d;
        lVar.f25775c = lVar5;
        if (lVar5 != null) {
            lVar5.f25774b = lVar;
        }
        e(lVar, lVar2);
        lVar2.f25776d = lVar;
        lVar.f25774b = lVar2;
        int i12 = 0;
        if (lVar3 != null) {
            i10 = lVar3.f25782k;
        } else {
            i10 = 0;
        }
        if (lVar5 != null) {
            i11 = lVar5.f25782k;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        lVar.f25782k = max;
        if (lVar4 != null) {
            i12 = lVar4.f25782k;
        }
        lVar2.f25782k = Math.max(max, i12) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            uc.l r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            java.lang.Object r0 = r3.f25781j
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.m.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        j jVar = this.f25791j;
        if (jVar == null) {
            j jVar2 = new j(this, 1);
            this.f25791j = jVar2;
            return jVar2;
        }
        return jVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f25785c) {
                throw new NullPointerException("value == null");
            }
            l a = a(obj, true);
            Object obj3 = a.f25781j;
            a.f25781j = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            uc.l r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.d(r3, r1)
        L10:
            if (r3 == 0) goto L14
            java.lang.Object r0 = r3.f25781j
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.m.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f25787f;
    }
}

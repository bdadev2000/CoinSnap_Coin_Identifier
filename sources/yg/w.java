package yg;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes4.dex */
public final class w extends AbstractMap implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final b0.g f28279k = new b0.g(10);

    /* renamed from: i, reason: collision with root package name */
    public u f28286i;

    /* renamed from: j, reason: collision with root package name */
    public u f28287j;

    /* renamed from: f, reason: collision with root package name */
    public int f28283f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f28284g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f28280b = f28279k;

    /* renamed from: d, reason: collision with root package name */
    public final v f28282d = new v();

    /* renamed from: c, reason: collision with root package name */
    public v[] f28281c = new v[16];

    /* renamed from: h, reason: collision with root package name */
    public int f28285h = 12;

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final v a(Object obj, boolean z10) {
        v vVar;
        int i10;
        v vVar2;
        v vVar3;
        v vVar4;
        v vVar5;
        Comparable comparable;
        int compare;
        v vVar6;
        v[] vVarArr = this.f28281c;
        int hashCode = obj.hashCode();
        int i11 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i12 = (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
        int length = i12 & (vVarArr.length - 1);
        v vVar7 = vVarArr[length];
        b0.g gVar = f28279k;
        v vVar8 = null;
        Comparator comparator = this.f28280b;
        if (vVar7 != null) {
            if (comparator == gVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = vVar7.f28275h;
                if (comparable != null) {
                    compare = comparable.compareTo(obj2);
                } else {
                    compare = comparator.compare(obj, obj2);
                }
                if (compare == 0) {
                    return vVar7;
                }
                if (compare < 0) {
                    vVar6 = vVar7.f28271c;
                } else {
                    vVar6 = vVar7.f28272d;
                }
                if (vVar6 == null) {
                    i10 = compare;
                    vVar = vVar7;
                    break;
                }
                vVar7 = vVar6;
            }
        } else {
            vVar = vVar7;
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        v vVar9 = this.f28282d;
        if (vVar == null) {
            if (comparator == gVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            vVar2 = new v(vVar, obj, i12, vVar9, vVar9.f28274g);
            vVarArr[length] = vVar2;
        } else {
            v vVar10 = new v(vVar, obj, i12, vVar9, vVar9.f28274g);
            if (i10 < 0) {
                vVar.f28271c = vVar10;
            } else {
                vVar.f28272d = vVar10;
            }
            c(vVar, true);
            vVar2 = vVar10;
        }
        int i13 = this.f28283f;
        this.f28283f = i13 + 1;
        if (i13 > this.f28285h) {
            v[] vVarArr2 = this.f28281c;
            int length2 = vVarArr2.length;
            int i14 = length2 * 2;
            v[] vVarArr3 = new v[i14];
            y7.u uVar = new y7.u(13);
            androidx.datastore.preferences.protobuf.o oVar = new androidx.datastore.preferences.protobuf.o();
            androidx.datastore.preferences.protobuf.o oVar2 = new androidx.datastore.preferences.protobuf.o();
            int i15 = 0;
            while (i15 < length2) {
                v vVar11 = vVarArr2[i15];
                if (vVar11 == null) {
                    vVar3 = vVar8;
                } else {
                    v vVar12 = vVar8;
                    for (v vVar13 = vVar11; vVar13 != null; vVar13 = vVar13.f28271c) {
                        vVar13.f28270b = vVar12;
                        vVar12 = vVar13;
                    }
                    uVar.f28007b = vVar12;
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        v vVar14 = (v) uVar.f28007b;
                        if (vVar14 == null) {
                            vVar14 = vVar8;
                        } else {
                            v vVar15 = vVar14.f28270b;
                            vVar14.f28270b = vVar8;
                            v vVar16 = vVar14.f28272d;
                            while (vVar16 != null) {
                                vVar16.f28270b = vVar15;
                                v vVar17 = vVar16;
                                vVar16 = vVar16.f28271c;
                                vVar15 = vVar17;
                            }
                            uVar.f28007b = vVar15;
                        }
                        if (vVar14 == null) {
                            break;
                        }
                        if ((vVar14.f28276i & length2) == 0) {
                            i16++;
                        } else {
                            i17++;
                        }
                        vVar8 = null;
                    }
                    oVar.a = ((Integer.highestOneBit(i16) * 2) - 1) - i16;
                    oVar.f1446c = 0;
                    oVar.f1445b = 0;
                    oVar.f1447d = null;
                    oVar2.a = ((Integer.highestOneBit(i17) * 2) - 1) - i17;
                    oVar2.f1446c = 0;
                    oVar2.f1445b = 0;
                    oVar2.f1447d = null;
                    v vVar18 = null;
                    while (vVar11 != null) {
                        vVar11.f28270b = vVar18;
                        v vVar19 = vVar11;
                        vVar11 = vVar11.f28271c;
                        vVar18 = vVar19;
                    }
                    uVar.f28007b = vVar18;
                    while (true) {
                        v vVar20 = (v) uVar.f28007b;
                        if (vVar20 == null) {
                            vVar20 = null;
                            vVar3 = null;
                        } else {
                            v vVar21 = vVar20.f28270b;
                            vVar3 = null;
                            vVar20.f28270b = null;
                            for (v vVar22 = vVar20.f28272d; vVar22 != null; vVar22 = vVar22.f28271c) {
                                vVar22.f28270b = vVar21;
                                vVar21 = vVar22;
                            }
                            uVar.f28007b = vVar21;
                        }
                        if (vVar20 == null) {
                            break;
                        }
                        if ((vVar20.f28276i & length2) == 0) {
                            oVar.a(vVar20);
                        } else {
                            oVar2.a(vVar20);
                        }
                    }
                    if (i16 > 0) {
                        vVar4 = (v) oVar.f1447d;
                        if (vVar4.f28270b != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        vVar4 = vVar3;
                    }
                    vVarArr3[i15] = vVar4;
                    int i18 = i15 + length2;
                    if (i17 > 0) {
                        vVar5 = (v) oVar2.f1447d;
                        if (vVar5.f28270b != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        vVar5 = vVar3;
                    }
                    vVarArr3[i18] = vVar5;
                }
                i15++;
                vVar8 = vVar3;
            }
            this.f28281c = vVarArr3;
            this.f28285h = (i14 / 4) + (i14 / 2);
        }
        this.f28284g++;
        return vVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yg.v b(java.util.Map.Entry r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Ld
            yg.v r0 = r5.a(r0, r1)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L28
            java.lang.Object r3 = r0.f28277j
            java.lang.Object r6 = r6.getValue()
            r4 = 1
            if (r3 == r6) goto L24
            if (r3 == 0) goto L22
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L22
            goto L24
        L22:
            r6 = r1
            goto L25
        L24:
            r6 = r4
        L25:
            if (r6 == 0) goto L28
            r1 = r4
        L28:
            if (r1 == 0) goto L2b
            r2 = r0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.w.b(java.util.Map$Entry):yg.v");
    }

    public final void c(v vVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (vVar != null) {
            v vVar2 = vVar.f28271c;
            v vVar3 = vVar.f28272d;
            int i14 = 0;
            if (vVar2 != null) {
                i10 = vVar2.f28278k;
            } else {
                i10 = 0;
            }
            if (vVar3 != null) {
                i11 = vVar3.f28278k;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                v vVar4 = vVar3.f28271c;
                v vVar5 = vVar3.f28272d;
                if (vVar5 != null) {
                    i13 = vVar5.f28278k;
                } else {
                    i13 = 0;
                }
                if (vVar4 != null) {
                    i14 = vVar4.f28278k;
                }
                int i16 = i14 - i13;
                if (i16 != -1 && (i16 != 0 || z10)) {
                    g(vVar3);
                }
                f(vVar);
                if (z10) {
                    return;
                }
            } else if (i15 == 2) {
                v vVar6 = vVar2.f28271c;
                v vVar7 = vVar2.f28272d;
                if (vVar7 != null) {
                    i12 = vVar7.f28278k;
                } else {
                    i12 = 0;
                }
                if (vVar6 != null) {
                    i14 = vVar6.f28278k;
                }
                int i17 = i14 - i12;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    f(vVar2);
                }
                g(vVar);
                if (z10) {
                    return;
                }
            } else if (i15 == 0) {
                vVar.f28278k = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                vVar.f28278k = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            vVar = vVar.f28270b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f28281c, (Object) null);
        this.f28283f = 0;
        this.f28284g++;
        v vVar = this.f28282d;
        v vVar2 = vVar.f28273f;
        while (vVar2 != vVar) {
            v vVar3 = vVar2.f28273f;
            vVar2.f28274g = null;
            vVar2.f28273f = null;
            vVar2 = vVar3;
        }
        vVar.f28274g = vVar;
        vVar.f28273f = vVar;
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
            yg.v r2 = r1.a(r2, r0)     // Catch: java.lang.ClassCastException -> L8
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto Lc
            r0 = 1
        Lc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.w.containsKey(java.lang.Object):boolean");
    }

    public final void d(v vVar, boolean z10) {
        v vVar2;
        v vVar3;
        int i10;
        if (z10) {
            v vVar4 = vVar.f28274g;
            vVar4.f28273f = vVar.f28273f;
            vVar.f28273f.f28274g = vVar4;
            vVar.f28274g = null;
            vVar.f28273f = null;
        }
        v vVar5 = vVar.f28271c;
        v vVar6 = vVar.f28272d;
        v vVar7 = vVar.f28270b;
        int i11 = 0;
        if (vVar5 != null && vVar6 != null) {
            if (vVar5.f28278k > vVar6.f28278k) {
                v vVar8 = vVar5.f28272d;
                while (true) {
                    v vVar9 = vVar8;
                    vVar3 = vVar5;
                    vVar5 = vVar9;
                    if (vVar5 == null) {
                        break;
                    } else {
                        vVar8 = vVar5.f28272d;
                    }
                }
            } else {
                v vVar10 = vVar6.f28271c;
                while (true) {
                    vVar2 = vVar6;
                    vVar6 = vVar10;
                    if (vVar6 == null) {
                        break;
                    } else {
                        vVar10 = vVar6.f28271c;
                    }
                }
                vVar3 = vVar2;
            }
            d(vVar3, false);
            v vVar11 = vVar.f28271c;
            if (vVar11 != null) {
                i10 = vVar11.f28278k;
                vVar3.f28271c = vVar11;
                vVar11.f28270b = vVar3;
                vVar.f28271c = null;
            } else {
                i10 = 0;
            }
            v vVar12 = vVar.f28272d;
            if (vVar12 != null) {
                i11 = vVar12.f28278k;
                vVar3.f28272d = vVar12;
                vVar12.f28270b = vVar3;
                vVar.f28272d = null;
            }
            vVar3.f28278k = Math.max(i10, i11) + 1;
            e(vVar, vVar3);
            return;
        }
        if (vVar5 != null) {
            e(vVar, vVar5);
            vVar.f28271c = null;
        } else if (vVar6 != null) {
            e(vVar, vVar6);
            vVar.f28272d = null;
        } else {
            e(vVar, null);
        }
        c(vVar7, false);
        this.f28283f--;
        this.f28284g++;
    }

    public final void e(v vVar, v vVar2) {
        v vVar3 = vVar.f28270b;
        vVar.f28270b = null;
        if (vVar2 != null) {
            vVar2.f28270b = vVar3;
        }
        if (vVar3 != null) {
            if (vVar3.f28271c == vVar) {
                vVar3.f28271c = vVar2;
                return;
            } else {
                vVar3.f28272d = vVar2;
                return;
            }
        }
        this.f28281c[vVar.f28276i & (r0.length - 1)] = vVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        u uVar = this.f28286i;
        if (uVar == null) {
            u uVar2 = new u(this, 0);
            this.f28286i = uVar2;
            return uVar2;
        }
        return uVar;
    }

    public final void f(v vVar) {
        int i10;
        int i11;
        v vVar2 = vVar.f28271c;
        v vVar3 = vVar.f28272d;
        v vVar4 = vVar3.f28271c;
        v vVar5 = vVar3.f28272d;
        vVar.f28272d = vVar4;
        if (vVar4 != null) {
            vVar4.f28270b = vVar;
        }
        e(vVar, vVar3);
        vVar3.f28271c = vVar;
        vVar.f28270b = vVar3;
        int i12 = 0;
        if (vVar2 != null) {
            i10 = vVar2.f28278k;
        } else {
            i10 = 0;
        }
        if (vVar4 != null) {
            i11 = vVar4.f28278k;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        vVar.f28278k = max;
        if (vVar5 != null) {
            i12 = vVar5.f28278k;
        }
        vVar3.f28278k = Math.max(max, i12) + 1;
    }

    public final void g(v vVar) {
        int i10;
        int i11;
        v vVar2 = vVar.f28271c;
        v vVar3 = vVar.f28272d;
        v vVar4 = vVar2.f28271c;
        v vVar5 = vVar2.f28272d;
        vVar.f28271c = vVar5;
        if (vVar5 != null) {
            vVar5.f28270b = vVar;
        }
        e(vVar, vVar2);
        vVar2.f28272d = vVar;
        vVar.f28270b = vVar2;
        int i12 = 0;
        if (vVar3 != null) {
            i10 = vVar3.f28278k;
        } else {
            i10 = 0;
        }
        if (vVar5 != null) {
            i11 = vVar5.f28278k;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        vVar.f28278k = max;
        if (vVar4 != null) {
            i12 = vVar4.f28278k;
        }
        vVar2.f28278k = Math.max(max, i12) + 1;
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
            yg.v r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            java.lang.Object r0 = r3.f28277j
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.w.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        u uVar = this.f28287j;
        if (uVar == null) {
            u uVar2 = new u(this, 1);
            this.f28287j = uVar2;
            return uVar2;
        }
        return uVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            v a = a(obj, true);
            Object obj3 = a.f28277j;
            a.f28277j = obj2;
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
            yg.v r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.d(r3, r1)
        L10:
            if (r3 == 0) goto L14
            java.lang.Object r0 = r3.f28277j
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.w.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f28283f;
    }
}

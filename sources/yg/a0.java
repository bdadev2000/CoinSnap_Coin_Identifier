package yg;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f28213d;
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f28214b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f28215c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f28213d = arrayList;
        arrayList.add(com.bumptech.glide.d.f9625e);
        arrayList.add(i.f28241b);
        arrayList.add(x.f28288c);
        arrayList.add(b.f28216c);
        arrayList.add(b0.a);
        arrayList.add(g.f28237d);
    }

    public a0(lb.o oVar) {
        List list = oVar.a;
        int size = list.size();
        ArrayList arrayList = f28213d;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        arrayList2.addAll(arrayList);
        this.a = Collections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [yg.l] */
    public final l a(Type type, Set set, String str) {
        Object asList;
        y yVar;
        if (type != null) {
            if (set != null) {
                Type a = zg.b.a(type);
                if (a instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) a;
                    if (wildcardType.getLowerBounds().length == 0) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        if (upperBounds.length == 1) {
                            a = upperBounds[0];
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                if (set.isEmpty()) {
                    asList = a;
                } else {
                    asList = Arrays.asList(a, set);
                }
                synchronized (this.f28215c) {
                    l lVar = (l) this.f28215c.get(asList);
                    if (lVar != null) {
                        return lVar;
                    }
                    z zVar = (z) this.f28214b.get();
                    if (zVar == null) {
                        zVar = new z(this);
                        this.f28214b.set(zVar);
                    }
                    ArrayList arrayList = zVar.a;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        ArrayDeque arrayDeque = zVar.f28293b;
                        if (i10 < size) {
                            yVar = (y) arrayList.get(i10);
                            if (yVar.f28291c.equals(asList)) {
                                arrayDeque.add(yVar);
                                ?? r13 = yVar.f28292d;
                                if (r13 != 0) {
                                    yVar = r13;
                                }
                            } else {
                                i10++;
                            }
                        } else {
                            y yVar2 = new y(a, str, asList);
                            arrayList.add(yVar2);
                            arrayDeque.add(yVar2);
                            yVar = null;
                            break;
                        }
                    }
                    try {
                        if (yVar != null) {
                            return yVar;
                        }
                        try {
                            int size2 = this.a.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                l a10 = ((a) ((k) this.a.get(i11))).a(a, set, this);
                                if (a10 != null) {
                                    ((y) zVar.f28293b.getLast()).f28292d = a10;
                                    zVar.b(true);
                                    return a10;
                                }
                            }
                            throw new IllegalArgumentException("No JsonAdapter for " + zg.b.h(a, set));
                        } catch (IllegalArgumentException e2) {
                            throw zVar.a(e2);
                        }
                    } finally {
                        zVar.b(false);
                    }
                }
            }
            throw new NullPointerException("annotations == null");
        }
        throw new NullPointerException("type == null");
    }
}

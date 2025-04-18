package a5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static final HashSet f226f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final HashSet f227g = new HashSet();
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final int f228b;

    /* renamed from: c, reason: collision with root package name */
    public int f229c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f230d;

    /* renamed from: e, reason: collision with root package name */
    public final int f231e;

    public p(List list) {
        if (!list.isEmpty()) {
            int size = list.size();
            this.f228b = size;
            this.a = new ArrayList(size);
            Iterator it = list.iterator();
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (it.hasNext()) {
                String str = (String) it.next();
                o oVar = new o(str);
                if (f226f.contains(str)) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(oVar);
                } else if (f227g.contains(str)) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(oVar);
                } else {
                    this.a.add(oVar);
                }
            }
            if (arrayList != null) {
                this.a.addAll(arrayList);
            }
            if (arrayList2 != null) {
                this.a.addAll(arrayList2);
            }
            boolean z10 = v.a;
            this.f231e = this.f228b >= 2 ? 1 : 2;
            return;
        }
        throw new IllegalArgumentException("urls can't be empty");
    }

    public final o a() {
        boolean z10;
        int i10 = this.f230d;
        if (i10 < this.f231e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = this.f229c + 1;
            if (i11 >= this.f228b - 1) {
                this.f229c = -1;
                this.f230d = i10 + 1;
            } else {
                this.f229c = i11;
            }
            o oVar = (o) this.a.get(i11);
            oVar.getClass();
            return oVar;
        }
        throw new NoSuchElementException();
    }

    public p(String str) {
        ArrayList arrayList = new ArrayList(1);
        this.a = arrayList;
        arrayList.add(new o(str));
        this.f228b = 1;
        this.f231e = 1;
    }
}

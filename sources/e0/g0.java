package e0;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class g0 extends f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30202a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30203b;

    public g0(List list) {
        this.f30203b = list;
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        switch (this.f30202a) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w0.g, w0.e] */
    @Override // java.util.List
    public final Object get(int i2) {
        int i3 = this.f30202a;
        Object obj = this.f30203b;
        switch (i3) {
            case 0:
                List list = (List) obj;
                if (new w0.e(0, b1.f0.p(this), 1).c(i2)) {
                    return list.get(b1.f0.p(this) - i2);
                }
                StringBuilder t2 = android.support.v4.media.d.t("Element index ", i2, " must be in range [");
                t2.append(new w0.e(0, b1.f0.p(this), 1));
                t2.append("].");
                throw new IndexOutOfBoundsException(t2.toString());
            default:
                String group = ((z0.f) obj).f31472a.group(i2);
                return group == null ? "" : group;
        }
    }

    @Override // e0.a
    public final int getSize() {
        int i2 = this.f30202a;
        Object obj = this.f30203b;
        switch (i2) {
            case 0:
                return ((List) obj).size();
            default:
                return ((z0.f) obj).f31472a.groupCount() + 1;
        }
    }

    @Override // e0.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        switch (this.f30202a) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // e0.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f30202a) {
            case 0:
                return listIterator(0);
            default:
                return super.iterator();
        }
    }

    @Override // e0.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f30202a) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // e0.f, java.util.List
    public final ListIterator listIterator() {
        switch (this.f30202a) {
            case 0:
                return listIterator(0);
            default:
                return super.listIterator();
        }
    }

    public g0(z0.f fVar) {
        this.f30203b = fVar;
    }

    @Override // e0.f, java.util.List
    public final ListIterator listIterator(int i2) {
        switch (this.f30202a) {
            case 0:
                return new f0(this, i2);
            default:
                return super.listIterator(i2);
        }
    }
}

package yg;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class u extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f28269c;

    public /* synthetic */ u(w wVar, int i10) {
        this.f28268b = i10;
        this.f28269c = wVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f28268b;
        w wVar = this.f28269c;
        switch (i10) {
            case 0:
                wVar.clear();
                return;
            default:
                wVar.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f28268b;
        w wVar = this.f28269c;
        switch (i10) {
            case 0:
                if ((obj instanceof Map.Entry) && wVar.b((Map.Entry) obj) != null) {
                    return true;
                }
                return false;
            default:
                return wVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f28268b) {
            case 0:
                return new t(this);
            default:
                return new t(this, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f28268b
            r1 = 1
            yg.w r2 = r4.f28269c
            r3 = 0
            switch(r0) {
                case 0: goto La;
                default: goto L9;
            }
        L9:
            goto L1d
        La:
            boolean r0 = r5 instanceof java.util.Map.Entry
            if (r0 != 0) goto Lf
            goto L17
        Lf:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            yg.v r5 = r2.b(r5)
            if (r5 != 0) goto L19
        L17:
            r1 = r3
            goto L1c
        L19:
            r2.d(r5, r1)
        L1c:
            return r1
        L1d:
            r2.getClass()
            if (r5 == 0) goto L27
            yg.v r5 = r2.a(r5, r3)     // Catch: java.lang.ClassCastException -> L27
            goto L28
        L27:
            r5 = 0
        L28:
            if (r5 == 0) goto L2d
            r2.d(r5, r1)
        L2d:
            if (r5 == 0) goto L30
            goto L31
        L30:
            r1 = r3
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.u.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f28268b;
        w wVar = this.f28269c;
        switch (i10) {
            case 0:
                return wVar.f28283f;
            default:
                return wVar.f28283f;
        }
    }
}

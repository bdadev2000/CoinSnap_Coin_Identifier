package e8;

import java.util.Map;
import t7.C2720i;

/* loaded from: classes3.dex */
public final class S implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public final a8.b f20135a;
    public final a8.b b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20136c;

    /* renamed from: d, reason: collision with root package name */
    public final c8.h f20137d;

    public S(a8.b bVar, a8.b bVar2, byte b) {
        this.f20135a = bVar;
        this.b = bVar2;
    }

    public final Object a(Object obj) {
        switch (this.f20136c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                G7.j.e(entry, "<this>");
                return entry.getKey();
            default:
                C2720i c2720i = (C2720i) obj;
                G7.j.e(c2720i, "<this>");
                return c2720i.b;
        }
    }

    public final Object b(Object obj) {
        switch (this.f20136c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                G7.j.e(entry, "<this>");
                return entry.getValue();
            default:
                C2720i c2720i = (C2720i) obj;
                G7.j.e(c2720i, "<this>");
                return c2720i.f23021c;
        }
    }

    public final Object c(Object obj, Object obj2) {
        switch (this.f20136c) {
            case 0:
                return new P(obj, obj2);
            default:
                return new C2720i(obj, obj2);
        }
    }

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        d8.a b = cVar.b(getDescriptor());
        Object obj = W.f20142c;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int h6 = b.h(getDescriptor());
            if (h6 != -1) {
                if (h6 != 0) {
                    if (h6 == 1) {
                        obj3 = b.A(getDescriptor(), 1, this.b, null);
                    } else {
                        throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(h6, "Invalid index: "));
                    }
                } else {
                    obj2 = b.A(getDescriptor(), 0, this.f20135a, null);
                }
            } else {
                b.c(getDescriptor());
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        return c(obj2, obj3);
                    }
                    throw new IllegalArgumentException("Element 'value' is missing");
                }
                throw new IllegalArgumentException("Element 'key' is missing");
            }
        }
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        switch (this.f20136c) {
            case 0:
                return this.f20137d;
            default:
                return this.f20137d;
        }
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        G7.j.e(dVar, "encoder");
        d8.b b = dVar.b(getDescriptor());
        b.m(getDescriptor(), 0, this.f20135a, a(obj));
        b.m(getDescriptor(), 1, this.b, b(obj));
        b.c(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public S(a8.b bVar, a8.b bVar2, int i9) {
        this(bVar, bVar2, (byte) 0);
        this.f20136c = i9;
        switch (i9) {
            case 1:
                this(bVar, bVar2, (byte) 0);
                this.f20137d = android.support.v4.media.session.a.d("kotlin.Pair", new c8.g[0], new Q(bVar, bVar2, 1));
                return;
            default:
                this.f20137d = android.support.v4.media.session.a.e("kotlin.collections.Map.Entry", c8.l.f5455f, new c8.g[0], new Q(bVar, bVar2, 0));
                return;
        }
    }
}

package androidx.collection;

import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import java.util.Iterator;
import java.util.Map;
import q0.p;
import r0.a;
import y0.k;
import y0.l;

/* loaded from: classes2.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 implements Iterator<Map.Entry<Object, Object>>, a {

    /* renamed from: a, reason: collision with root package name */
    public final k f1489a;

    /* renamed from: b, reason: collision with root package name */
    public int f1490b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap f1491c;

    @e(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", l = {1412}, m = "invokeSuspend")
    /* renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends h implements p {

        /* renamed from: a, reason: collision with root package name */
        public MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 f1492a;

        /* renamed from: b, reason: collision with root package name */
        public MutableScatterMap f1493b;

        /* renamed from: c, reason: collision with root package name */
        public long[] f1494c;
        public int d;

        /* renamed from: f, reason: collision with root package name */
        public int f1495f;

        /* renamed from: g, reason: collision with root package name */
        public int f1496g;

        /* renamed from: h, reason: collision with root package name */
        public int f1497h;

        /* renamed from: i, reason: collision with root package name */
        public long f1498i;

        /* renamed from: j, reason: collision with root package name */
        public int f1499j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f1500k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MutableScatterMap f1501l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 f1502m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableScatterMap mutableScatterMap, MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$1, g gVar) {
            super(gVar);
            this.f1501l = mutableScatterMap;
            this.f1502m = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1501l, this.f1502m, gVar);
            anonymousClass1.f1500k = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((l) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0070  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a6 -> B:5:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b1 -> B:6:0x00b3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005a -> B:7:0x006e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c6 -> B:19:0x00c8). Please report as a decompilation issue!!! */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 213
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(MutableScatterMap mutableScatterMap) {
        this.f1491c = mutableScatterMap;
        this.f1489a = kotlin.jvm.internal.e.u(new AnonymousClass1(mutableScatterMap, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1489a.hasNext();
    }

    @Override // java.util.Iterator
    public final Map.Entry<Object, Object> next() {
        return (Map.Entry) this.f1489a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2 = this.f1490b;
        if (i2 != -1) {
            this.f1491c.j(i2);
            this.f1490b = -1;
        }
    }
}

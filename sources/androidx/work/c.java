package androidx.work;

import java.util.HashSet;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final c f5202i;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5204c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5205d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5206e;

    /* renamed from: a, reason: collision with root package name */
    public int f5203a = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f5207f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f5208g = -1;

    /* renamed from: h, reason: collision with root package name */
    public e f5209h = new e();

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.work.c, java.lang.Object] */
    static {
        e eVar = new e();
        ?? obj = new Object();
        obj.f5203a = 1;
        obj.f5207f = -1L;
        obj.f5208g = -1L;
        new HashSet();
        obj.b = false;
        obj.f5204c = false;
        obj.f5203a = 1;
        obj.f5205d = false;
        obj.f5206e = false;
        obj.f5209h = eVar;
        obj.f5207f = -1L;
        obj.f5208g = -1L;
        f5202i = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b != cVar.b || this.f5204c != cVar.f5204c || this.f5205d != cVar.f5205d || this.f5206e != cVar.f5206e || this.f5207f != cVar.f5207f || this.f5208g != cVar.f5208g || this.f5203a != cVar.f5203a) {
            return false;
        }
        return this.f5209h.equals(cVar.f5209h);
    }

    public final int hashCode() {
        int d2 = ((((((((AbstractC2965e.d(this.f5203a) * 31) + (this.b ? 1 : 0)) * 31) + (this.f5204c ? 1 : 0)) * 31) + (this.f5205d ? 1 : 0)) * 31) + (this.f5206e ? 1 : 0)) * 31;
        long j7 = this.f5207f;
        int i9 = (d2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j9 = this.f5208g;
        return this.f5209h.f5211a.hashCode() + ((i9 + ((int) (j9 ^ (j9 >>> 32)))) * 31);
    }
}

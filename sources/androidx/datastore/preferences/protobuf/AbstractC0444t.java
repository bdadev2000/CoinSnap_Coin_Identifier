package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0444t implements Cloneable {
    public final AbstractC0446v b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0446v f4607c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4608d = false;

    public AbstractC0444t(AbstractC0446v abstractC0446v) {
        this.b = abstractC0446v;
        this.f4607c = (AbstractC0446v) abstractC0446v.d(4);
    }

    public static void d(AbstractC0446v abstractC0446v, AbstractC0446v abstractC0446v2) {
        X x9 = X.f4537c;
        x9.getClass();
        x9.a(abstractC0446v.getClass()).mergeFrom(abstractC0446v, abstractC0446v2);
    }

    public final AbstractC0446v a() {
        AbstractC0446v b = b();
        if (b.g()) {
            return b;
        }
        throw new h0();
    }

    public final AbstractC0446v b() {
        if (this.f4608d) {
            return this.f4607c;
        }
        AbstractC0446v abstractC0446v = this.f4607c;
        abstractC0446v.getClass();
        X x9 = X.f4537c;
        x9.getClass();
        x9.a(abstractC0446v.getClass()).makeImmutable(abstractC0446v);
        this.f4608d = true;
        return this.f4607c;
    }

    public final void c() {
        if (this.f4608d) {
            AbstractC0446v abstractC0446v = (AbstractC0446v) this.f4607c.d(4);
            d(abstractC0446v, this.f4607c);
            this.f4607c = abstractC0446v;
            this.f4608d = false;
        }
    }

    public final Object clone() {
        AbstractC0444t abstractC0444t = (AbstractC0444t) this.b.d(5);
        AbstractC0446v b = b();
        abstractC0444t.c();
        d(abstractC0444t.f4607c, b);
        return abstractC0444t;
    }
}

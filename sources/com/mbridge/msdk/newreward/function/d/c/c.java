package com.mbridge.msdk.newreward.function.d.c;

/* loaded from: classes3.dex */
public abstract class c extends d<String> {
    protected Boolean b;

    /* renamed from: c, reason: collision with root package name */
    private String f17229c;

    public c(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.b = null;
    }

    public final void a(String str) {
        this.f17229c = str;
    }

    public abstract boolean a_();

    @Override // com.mbridge.msdk.newreward.function.d.c.d
    public final boolean f() {
        return false;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final boolean g() {
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean a_ = a_();
        this.b = Boolean.valueOf(a_);
        return a_;
    }
}

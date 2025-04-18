package com.mbridge.msdk.newreward.function.d.c;

/* loaded from: classes4.dex */
public abstract class c extends d<String> {

    /* renamed from: b, reason: collision with root package name */
    protected Boolean f14594b;

    /* renamed from: c, reason: collision with root package name */
    private String f14595c;

    public c(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.f14594b = null;
    }

    public final void a(String str) {
        this.f14595c = str;
    }

    public abstract boolean a_();

    @Override // com.mbridge.msdk.newreward.function.d.c.d
    public final boolean f() {
        return false;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final boolean g() {
        Boolean bool = this.f14594b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(a_());
        this.f14594b = valueOf;
        return valueOf.booleanValue();
    }
}

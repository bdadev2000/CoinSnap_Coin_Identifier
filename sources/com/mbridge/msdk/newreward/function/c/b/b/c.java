package com.mbridge.msdk.newreward.function.c.b.b;

/* loaded from: classes4.dex */
public final class c {
    private com.mbridge.msdk.newreward.function.c.a.a a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.b.b.a f14485b;

    /* renamed from: c, reason: collision with root package name */
    private b f14486c;

    /* renamed from: d, reason: collision with root package name */
    private d f14487d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14488e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14489f = false;

    public c(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.a = aVar;
    }

    /* loaded from: classes4.dex */
    public class a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: b, reason: collision with root package name */
        private final c f14491b;

        /* renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f14492c;

        public a(c cVar, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f14491b = cVar;
            this.f14492c = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            if (this.f14491b.f14488e) {
                return;
            }
            this.f14491b.f14488e = true;
            this.f14492c.a(obj);
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            if (bVar.a() == 1) {
                if (!c.this.f14485b.a() || !c.this.f14486c.a() || this.f14491b.f14489f) {
                    return;
                } else {
                    this.f14491b.f14489f = true;
                }
            }
            this.f14492c.a(bVar);
        }
    }

    public final void a(e eVar, final com.mbridge.msdk.newreward.a.b.b bVar) {
        int c10 = eVar.c();
        if (c10 == 1) {
            if (this.f14485b == null) {
                a();
            }
            this.f14485b.a(eVar, new a(this, bVar));
        } else if (c10 == 2) {
            if (this.f14487d == null) {
                this.f14487d = new d();
            }
            this.f14487d.a(eVar, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.c.b.b.c.1
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    com.mbridge.msdk.newreward.a.b.b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(obj);
                    }
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
                    com.mbridge.msdk.newreward.a.b.b bVar3 = bVar;
                    if (bVar3 != null) {
                        bVar3.a(bVar2);
                    }
                }
            });
        } else {
            if (c10 != 3) {
                return;
            }
            if (this.f14486c == null) {
                this.f14486c = new b(this.a);
            }
            this.f14486c.a(eVar, new a(this, bVar));
        }
    }

    private void a() {
        this.f14485b = new com.mbridge.msdk.newreward.function.c.b.b.a(this.a);
    }

    public final boolean a(e eVar) {
        if (eVar.c() == 1) {
            if (this.f14485b == null) {
                a();
            }
            return this.f14485b.a(eVar.a(), eVar, eVar.b());
        }
        if (eVar.c() == 2) {
            if (this.f14487d == null) {
                this.f14487d = new d();
            }
            return this.f14487d.a(eVar);
        }
        if (eVar.c() != 3) {
            return false;
        }
        if (this.f14486c == null) {
            this.f14486c = new b(this.a);
        }
        return true;
    }
}

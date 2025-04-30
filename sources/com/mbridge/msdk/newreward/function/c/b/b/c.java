package com.mbridge.msdk.newreward.function.c.b.b;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.a.a f17099a;
    private com.mbridge.msdk.newreward.function.c.b.b.a b;

    /* renamed from: c, reason: collision with root package name */
    private b f17100c;

    /* renamed from: d, reason: collision with root package name */
    private d f17101d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17102e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17103f = false;

    public c(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f17099a = aVar;
    }

    /* loaded from: classes3.dex */
    public class a implements com.mbridge.msdk.newreward.a.b.b {
        private final c b;

        /* renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f17106c;

        public a(c cVar, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.b = cVar;
            this.f17106c = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            if (this.b.f17102e) {
                return;
            }
            this.b.f17102e = true;
            this.f17106c.a(obj);
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            if (bVar.a() == 1) {
                if (!c.this.b.a() || !c.this.f17100c.a() || this.b.f17103f) {
                    return;
                } else {
                    this.b.f17103f = true;
                }
            }
            this.f17106c.a(bVar);
        }
    }

    public final void a(e eVar, final com.mbridge.msdk.newreward.a.b.b bVar) {
        int c9 = eVar.c();
        if (c9 == 1) {
            if (this.b == null) {
                a();
            }
            this.b.a(eVar, new a(this, bVar));
        } else if (c9 == 2) {
            if (this.f17101d == null) {
                this.f17101d = new d();
            }
            this.f17101d.a(eVar, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.c.b.b.c.1
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
            if (c9 != 3) {
                return;
            }
            if (this.f17100c == null) {
                this.f17100c = new b(this.f17099a);
            }
            this.f17100c.a(eVar, new a(this, bVar));
        }
    }

    private void a() {
        this.b = new com.mbridge.msdk.newreward.function.c.b.b.a(this.f17099a);
    }

    public final boolean a(e eVar) {
        if (eVar.c() == 1) {
            if (this.b == null) {
                a();
            }
            return this.b.a(eVar.a(), eVar, eVar.b());
        }
        if (eVar.c() == 2) {
            if (this.f17101d == null) {
                this.f17101d = new d();
            }
            return this.f17101d.a(eVar);
        }
        if (eVar.c() != 3) {
            return false;
        }
        if (this.f17100c == null) {
            this.f17100c = new b(this.f17099a);
        }
        return true;
    }
}

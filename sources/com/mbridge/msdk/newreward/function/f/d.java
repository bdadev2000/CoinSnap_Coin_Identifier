package com.mbridge.msdk.newreward.function.f;

import com.mbridge.msdk.newreward.a.b.f;
import com.mbridge.msdk.newreward.a.b.g;
import com.mbridge.msdk.newreward.a.b.h;
import com.mbridge.msdk.newreward.a.b.i;
import com.mbridge.msdk.newreward.a.b.j;
import com.mbridge.msdk.newreward.a.b.m;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class d {
    private volatile boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f14700b = false;

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        this.a = false;
        this.f14700b = false;
        a aVar = new a(bVar, this, bVar2);
        try {
            new com.mbridge.msdk.newreward.a.b.d().a(bVar, aVar);
        } catch (IOException e2) {
            aVar.a(new com.mbridge.msdk.foundation.c.b(880020, e2.getMessage()));
        }
        for (com.mbridge.msdk.newreward.function.d.a.a aVar2 : bVar.s()) {
            a aVar3 = new a(bVar, this, bVar2);
            try {
                new m().a(aVar2, aVar3);
            } catch (IOException e10) {
                aVar3.a(new com.mbridge.msdk.foundation.c.b(880020, e10.getMessage()));
            }
            a aVar4 = new a(bVar, this, bVar2);
            try {
                new com.mbridge.msdk.newreward.a.b.e().a(aVar2, aVar4);
            } catch (IOException e11) {
                aVar4.a(new com.mbridge.msdk.foundation.c.b(880020, e11.getMessage()));
            }
            a aVar5 = new a(bVar, this, bVar2);
            try {
                new f().a(aVar2, aVar5);
            } catch (IOException e12) {
                aVar5.a(new com.mbridge.msdk.foundation.c.b(880020, e12.getMessage()));
            }
            a aVar6 = new a(bVar, this, bVar2);
            try {
                new h().a(aVar2, aVar6);
            } catch (IOException e13) {
                aVar6.a(new com.mbridge.msdk.foundation.c.b(880020, e13.getMessage()));
            }
            a aVar7 = new a(bVar, this, bVar2);
            try {
                new i().a(aVar2, aVar7);
            } catch (IOException e14) {
                aVar7.a(new com.mbridge.msdk.foundation.c.b(880000, e14.getMessage()));
            }
            a aVar8 = new a(bVar, this, bVar2);
            try {
                new g().a(aVar2, aVar8);
            } catch (IOException e15) {
                aVar8.a(new com.mbridge.msdk.foundation.c.b(880000, e15.getMessage()));
            }
            a aVar9 = new a(bVar, this, bVar2);
            try {
                new j().a(aVar2, aVar9);
            } catch (IOException e16) {
                aVar9.a(new com.mbridge.msdk.foundation.c.b(880000, e16.getMessage()));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements com.mbridge.msdk.newreward.a.b.b {
        private com.mbridge.msdk.newreward.function.d.a.b a;

        /* renamed from: b, reason: collision with root package name */
        private d f14701b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.newreward.a.b.b f14702c;

        public a(com.mbridge.msdk.newreward.function.d.a.b bVar, d dVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.a = bVar;
            this.f14701b = dVar;
            this.f14702c = bVar2;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.newreward.function.d.a.b bVar = this.a;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f14702c;
            if (d.a(this.f14701b) && bVar.x()) {
                this.f14701b.a = true;
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.a(), bVar.b(), bVar.c(), bVar.e(), 3);
                bVar2.a(bVar);
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            com.mbridge.msdk.newreward.function.d.a.b bVar2 = this.a;
            com.mbridge.msdk.newreward.a.b.b bVar3 = this.f14702c;
            if (d.a(this.f14701b)) {
                if (bVar2.x()) {
                    this.f14701b.a = true;
                    com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar2.a(), bVar2.b(), bVar2.c(), bVar2.e(), 3);
                    bVar3.a(bVar2);
                } else {
                    this.f14701b.f14700b = true;
                    bVar3.a(bVar);
                }
            }
        }
    }

    public static /* synthetic */ boolean a(d dVar) {
        return (dVar.a || dVar.f14700b) ? false : true;
    }
}

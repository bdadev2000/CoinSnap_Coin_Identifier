package com.mbridge.msdk.newreward.function.f;

import com.mbridge.msdk.newreward.a.b.f;
import com.mbridge.msdk.newreward.a.b.g;
import com.mbridge.msdk.newreward.a.b.h;
import com.mbridge.msdk.newreward.a.b.i;
import com.mbridge.msdk.newreward.a.b.j;
import com.mbridge.msdk.newreward.a.b.m;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f17327a = false;
    private volatile boolean b = false;

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        this.f17327a = false;
        this.b = false;
        a aVar = new a(bVar, this, bVar2);
        try {
            new com.mbridge.msdk.newreward.a.b.d().a(bVar, aVar);
        } catch (IOException e4) {
            aVar.a(new com.mbridge.msdk.foundation.c.b(880020, e4.getMessage()));
        }
        for (com.mbridge.msdk.newreward.function.d.a.a aVar2 : bVar.s()) {
            a aVar3 = new a(bVar, this, bVar2);
            try {
                new m().a(aVar2, aVar3);
            } catch (IOException e9) {
                aVar3.a(new com.mbridge.msdk.foundation.c.b(880020, e9.getMessage()));
            }
            a aVar4 = new a(bVar, this, bVar2);
            try {
                new com.mbridge.msdk.newreward.a.b.e().a(aVar2, aVar4);
            } catch (IOException e10) {
                aVar4.a(new com.mbridge.msdk.foundation.c.b(880020, e10.getMessage()));
            }
            a aVar5 = new a(bVar, this, bVar2);
            try {
                new f().a(aVar2, aVar5);
            } catch (IOException e11) {
                aVar5.a(new com.mbridge.msdk.foundation.c.b(880020, e11.getMessage()));
            }
            a aVar6 = new a(bVar, this, bVar2);
            try {
                new h().a(aVar2, aVar6);
            } catch (IOException e12) {
                aVar6.a(new com.mbridge.msdk.foundation.c.b(880020, e12.getMessage()));
            }
            a aVar7 = new a(bVar, this, bVar2);
            try {
                new i().a(aVar2, aVar7);
            } catch (IOException e13) {
                aVar7.a(new com.mbridge.msdk.foundation.c.b(880000, e13.getMessage()));
            }
            a aVar8 = new a(bVar, this, bVar2);
            try {
                new g().a(aVar2, aVar8);
            } catch (IOException e14) {
                aVar8.a(new com.mbridge.msdk.foundation.c.b(880000, e14.getMessage()));
            }
            a aVar9 = new a(bVar, this, bVar2);
            try {
                new j().a(aVar2, aVar9);
            } catch (IOException e15) {
                aVar9.a(new com.mbridge.msdk.foundation.c.b(880000, e15.getMessage()));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.newreward.function.d.a.b f17328a;
        private d b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.newreward.a.b.b f17329c;

        public a(com.mbridge.msdk.newreward.function.d.a.b bVar, d dVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f17328a = bVar;
            this.b = dVar;
            this.f17329c = bVar2;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.newreward.function.d.a.b bVar = this.f17328a;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f17329c;
            if (d.a(this.b) && bVar.x()) {
                this.b.f17327a = true;
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.a(), bVar.b(), bVar.c(), bVar.e(), 3);
                bVar2.a(bVar);
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            com.mbridge.msdk.newreward.function.d.a.b bVar2 = this.f17328a;
            com.mbridge.msdk.newreward.a.b.b bVar3 = this.f17329c;
            if (d.a(this.b)) {
                if (bVar2.x()) {
                    this.b.f17327a = true;
                    com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar2.a(), bVar2.b(), bVar2.c(), bVar2.e(), 3);
                    bVar3.a(bVar2);
                } else {
                    this.b.b = true;
                    bVar3.a(bVar);
                }
            }
        }
    }

    public static /* synthetic */ boolean a(d dVar) {
        return (dVar.f17327a || dVar.b) ? false : true;
    }
}

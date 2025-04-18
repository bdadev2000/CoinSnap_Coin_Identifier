package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.dl;
import com.applovin.impl.gr;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class fr extends dl {

    /* renamed from: n, reason: collision with root package name */
    private a f4792n;

    /* renamed from: o, reason: collision with root package name */
    private int f4793o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4794p;

    /* renamed from: q, reason: collision with root package name */
    private gr.d f4795q;

    /* renamed from: r, reason: collision with root package name */
    private gr.b f4796r;

    /* loaded from: classes.dex */
    public static final class a {
        public final gr.d a;

        /* renamed from: b, reason: collision with root package name */
        public final gr.b f4797b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f4798c;

        /* renamed from: d, reason: collision with root package name */
        public final gr.c[] f4799d;

        /* renamed from: e, reason: collision with root package name */
        public final int f4800e;

        public a(gr.d dVar, gr.b bVar, byte[] bArr, gr.c[] cVarArr, int i10) {
            this.a = dVar;
            this.f4797b = bVar;
            this.f4798c = bArr;
            this.f4799d = cVarArr;
            this.f4800e = i10;
        }
    }

    public static int a(byte b3, int i10, int i11) {
        return (b3 >> i11) & (255 >>> (8 - i10));
    }

    public a b(yg ygVar) {
        gr.d dVar = this.f4795q;
        if (dVar == null) {
            this.f4795q = gr.b(ygVar);
            return null;
        }
        gr.b bVar = this.f4796r;
        if (bVar == null) {
            this.f4796r = gr.a(ygVar);
            return null;
        }
        byte[] bArr = new byte[ygVar.e()];
        System.arraycopy(ygVar.c(), 0, bArr, 0, ygVar.e());
        return new a(dVar, bVar, bArr, gr.a(ygVar, dVar.f5025b), gr.a(r4.length - 1));
    }

    @Override // com.applovin.impl.dl
    public void c(long j3) {
        super.c(j3);
        this.f4794p = j3 != 0;
        gr.d dVar = this.f4795q;
        this.f4793o = dVar != null ? dVar.f5030g : 0;
    }

    public static void a(yg ygVar, long j3) {
        if (ygVar.b() < ygVar.e() + 4) {
            ygVar.a(Arrays.copyOf(ygVar.c(), ygVar.e() + 4));
        } else {
            ygVar.e(ygVar.e() + 4);
        }
        byte[] c10 = ygVar.c();
        c10[ygVar.e() - 4] = (byte) (j3 & 255);
        c10[ygVar.e() - 3] = (byte) ((j3 >>> 8) & 255);
        c10[ygVar.e() - 2] = (byte) ((j3 >>> 16) & 255);
        c10[ygVar.e() - 1] = (byte) ((j3 >>> 24) & 255);
    }

    public static boolean c(yg ygVar) {
        try {
            return gr.a(1, ygVar, true);
        } catch (ah unused) {
            return false;
        }
    }

    private static int a(byte b3, a aVar) {
        if (!aVar.f4799d[a(b3, aVar.f4800e, 1)].a) {
            return aVar.a.f5030g;
        }
        return aVar.a.f5031h;
    }

    @Override // com.applovin.impl.dl
    public long a(yg ygVar) {
        if ((ygVar.c()[0] & 1) == 1) {
            return -1L;
        }
        int a10 = a(ygVar.c()[0], (a) a1.b(this.f4792n));
        long j3 = this.f4794p ? (this.f4793o + a10) / 4 : 0;
        a(ygVar, j3);
        this.f4794p = true;
        this.f4793o = a10;
        return j3;
    }

    @Override // com.applovin.impl.dl
    public boolean a(yg ygVar, long j3, dl.b bVar) {
        if (this.f4792n != null) {
            a1.a(bVar.a);
            return false;
        }
        a b3 = b(ygVar);
        this.f4792n = b3;
        if (b3 == null) {
            return true;
        }
        gr.d dVar = b3.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f5033j);
        arrayList.add(b3.f4798c);
        bVar.a = new d9.b().f(MimeTypes.AUDIO_VORBIS).b(dVar.f5028e).k(dVar.f5027d).c(dVar.f5025b).n(dVar.f5026c).a(arrayList).a();
        return true;
    }

    @Override // com.applovin.impl.dl
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f4792n = null;
            this.f4795q = null;
            this.f4796r = null;
        }
        this.f4793o = 0;
        this.f4794p = false;
    }
}

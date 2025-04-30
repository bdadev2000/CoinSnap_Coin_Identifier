package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.dl;
import com.applovin.impl.gr;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class fr extends dl {

    /* renamed from: n, reason: collision with root package name */
    private a f7750n;

    /* renamed from: o, reason: collision with root package name */
    private int f7751o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7752p;

    /* renamed from: q, reason: collision with root package name */
    private gr.d f7753q;

    /* renamed from: r, reason: collision with root package name */
    private gr.b f7754r;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final gr.d f7755a;
        public final gr.b b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f7756c;

        /* renamed from: d, reason: collision with root package name */
        public final gr.c[] f7757d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7758e;

        public a(gr.d dVar, gr.b bVar, byte[] bArr, gr.c[] cVarArr, int i9) {
            this.f7755a = dVar;
            this.b = bVar;
            this.f7756c = bArr;
            this.f7757d = cVarArr;
            this.f7758e = i9;
        }
    }

    public static int a(byte b, int i9, int i10) {
        return (b >> i10) & (255 >>> (8 - i9));
    }

    public a b(yg ygVar) {
        gr.d dVar = this.f7753q;
        if (dVar == null) {
            this.f7753q = gr.b(ygVar);
            return null;
        }
        gr.b bVar = this.f7754r;
        if (bVar == null) {
            this.f7754r = gr.a(ygVar);
            return null;
        }
        byte[] bArr = new byte[ygVar.e()];
        System.arraycopy(ygVar.c(), 0, bArr, 0, ygVar.e());
        return new a(dVar, bVar, bArr, gr.a(ygVar, dVar.b), gr.a(r4.length - 1));
    }

    @Override // com.applovin.impl.dl
    public void c(long j7) {
        super.c(j7);
        this.f7752p = j7 != 0;
        gr.d dVar = this.f7753q;
        this.f7751o = dVar != null ? dVar.f8004g : 0;
    }

    public static void a(yg ygVar, long j7) {
        if (ygVar.b() < ygVar.e() + 4) {
            ygVar.a(Arrays.copyOf(ygVar.c(), ygVar.e() + 4));
        } else {
            ygVar.e(ygVar.e() + 4);
        }
        byte[] c9 = ygVar.c();
        c9[ygVar.e() - 4] = (byte) (j7 & 255);
        c9[ygVar.e() - 3] = (byte) ((j7 >>> 8) & 255);
        c9[ygVar.e() - 2] = (byte) ((j7 >>> 16) & 255);
        c9[ygVar.e() - 1] = (byte) ((j7 >>> 24) & 255);
    }

    public static boolean c(yg ygVar) {
        try {
            return gr.a(1, ygVar, true);
        } catch (ah unused) {
            return false;
        }
    }

    private static int a(byte b, a aVar) {
        if (!aVar.f7757d[a(b, aVar.f7758e, 1)].f7996a) {
            return aVar.f7755a.f8004g;
        }
        return aVar.f7755a.f8005h;
    }

    @Override // com.applovin.impl.dl
    public long a(yg ygVar) {
        if ((ygVar.c()[0] & 1) == 1) {
            return -1L;
        }
        int a6 = a(ygVar.c()[0], (a) AbstractC0669a1.b(this.f7750n));
        long j7 = this.f7752p ? (this.f7751o + a6) / 4 : 0;
        a(ygVar, j7);
        this.f7752p = true;
        this.f7751o = a6;
        return j7;
    }

    @Override // com.applovin.impl.dl
    public boolean a(yg ygVar, long j7, dl.b bVar) {
        if (this.f7750n != null) {
            AbstractC0669a1.a(bVar.f7333a);
            return false;
        }
        a b = b(ygVar);
        this.f7750n = b;
        if (b == null) {
            return true;
        }
        gr.d dVar = b.f7755a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f8007j);
        arrayList.add(b.f7756c);
        bVar.f7333a = new d9.b().f(MimeTypes.AUDIO_VORBIS).b(dVar.f8002e).k(dVar.f8001d).c(dVar.b).n(dVar.f8000c).a(arrayList).a();
        return true;
    }

    @Override // com.applovin.impl.dl
    public void a(boolean z8) {
        super.a(z8);
        if (z8) {
            this.f7750n = null;
            this.f7753q = null;
            this.f7754r = null;
        }
        this.f7751o = 0;
        this.f7752p = false;
    }
}

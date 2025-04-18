package com.applovin.impl;

import com.applovin.impl.f9;
import com.applovin.impl.fr;
import com.applovin.impl.gl;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class er extends gl {

    /* renamed from: n, reason: collision with root package name */
    private a f23744n;

    /* renamed from: o, reason: collision with root package name */
    private int f23745o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23746p;

    /* renamed from: q, reason: collision with root package name */
    private fr.d f23747q;

    /* renamed from: r, reason: collision with root package name */
    private fr.b f23748r;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final fr.d f23749a;

        /* renamed from: b, reason: collision with root package name */
        public final fr.b f23750b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f23751c;
        public final fr.c[] d;
        public final int e;

        public a(fr.d dVar, fr.b bVar, byte[] bArr, fr.c[] cVarArr, int i2) {
            this.f23749a = dVar;
            this.f23750b = bVar;
            this.f23751c = bArr;
            this.d = cVarArr;
            this.e = i2;
        }
    }

    public static int a(byte b2, int i2, int i3) {
        return (b2 >> i3) & (255 >>> (8 - i2));
    }

    public a b(bh bhVar) {
        fr.d dVar = this.f23747q;
        if (dVar == null) {
            this.f23747q = fr.b(bhVar);
            return null;
        }
        fr.b bVar = this.f23748r;
        if (bVar == null) {
            this.f23748r = fr.a(bhVar);
            return null;
        }
        byte[] bArr = new byte[bhVar.e()];
        System.arraycopy(bhVar.c(), 0, bArr, 0, bhVar.e());
        return new a(dVar, bVar, bArr, fr.a(bhVar, dVar.f24019b), fr.a(r4.length - 1));
    }

    @Override // com.applovin.impl.gl
    public void c(long j2) {
        super.c(j2);
        this.f23746p = j2 != 0;
        fr.d dVar = this.f23747q;
        this.f23745o = dVar != null ? dVar.f24022g : 0;
    }

    public static void a(bh bhVar, long j2) {
        if (bhVar.b() < bhVar.e() + 4) {
            bhVar.a(Arrays.copyOf(bhVar.c(), bhVar.e() + 4));
        } else {
            bhVar.e(bhVar.e() + 4);
        }
        byte[] c2 = bhVar.c();
        c2[bhVar.e() - 4] = (byte) (j2 & 255);
        c2[bhVar.e() - 3] = (byte) ((j2 >>> 8) & 255);
        c2[bhVar.e() - 2] = (byte) ((j2 >>> 16) & 255);
        c2[bhVar.e() - 1] = (byte) ((j2 >>> 24) & 255);
    }

    public static boolean c(bh bhVar) {
        try {
            return fr.a(1, bhVar, true);
        } catch (dh unused) {
            return false;
        }
    }

    private static int a(byte b2, a aVar) {
        if (!aVar.d[a(b2, aVar.e, 1)].f24015a) {
            return aVar.f23749a.f24022g;
        }
        return aVar.f23749a.f24023h;
    }

    @Override // com.applovin.impl.gl
    public long a(bh bhVar) {
        if ((bhVar.c()[0] & 1) == 1) {
            return -1L;
        }
        int a2 = a(bhVar.c()[0], (a) b1.b(this.f23744n));
        long j2 = this.f23746p ? (this.f23745o + a2) / 4 : 0;
        a(bhVar, j2);
        this.f23746p = true;
        this.f23745o = a2;
        return j2;
    }

    @Override // com.applovin.impl.gl
    public boolean a(bh bhVar, long j2, gl.b bVar) {
        if (this.f23744n != null) {
            b1.a(bVar.f24135a);
            return false;
        }
        a b2 = b(bhVar);
        this.f23744n = b2;
        if (b2 == null) {
            return true;
        }
        fr.d dVar = b2.f23749a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f24025j);
        arrayList.add(b2.f23751c);
        bVar.f24135a = new f9.b().f("audio/vorbis").b(dVar.e).k(dVar.d).c(dVar.f24019b).n(dVar.f24020c).a(arrayList).a();
        return true;
    }

    @Override // com.applovin.impl.gl
    public void a(boolean z2) {
        super.a(z2);
        if (z2) {
            this.f23744n = null;
            this.f23747q = null;
            this.f23748r = null;
        }
        this.f23745o = 0;
        this.f23746p = false;
    }
}

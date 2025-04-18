package com.applovin.impl;

import com.applovin.impl.a;
import com.applovin.impl.f9;
import com.applovin.impl.xl;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s1 extends xl {
    private static final int[] e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f26403b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26404c;
    private int d;

    public s1(qo qoVar) {
        super(qoVar);
    }

    @Override // com.applovin.impl.xl
    public boolean a(bh bhVar) {
        if (this.f26403b) {
            bhVar.g(1);
        } else {
            int w = bhVar.w();
            int i2 = (w >> 4) & 15;
            this.d = i2;
            if (i2 == 2) {
                this.f27937a.a(new f9.b().f("audio/mpeg").c(1).n(e[(w >> 2) & 3]).a());
                this.f26404c = true;
            } else if (i2 == 7 || i2 == 8) {
                this.f27937a.a(new f9.b().f(i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").c(1).n(8000).a());
                this.f26404c = true;
            } else if (i2 != 10) {
                throw new xl.a("Audio format not supported: " + this.d);
            }
            this.f26403b = true;
        }
        return true;
    }

    @Override // com.applovin.impl.xl
    public boolean b(bh bhVar, long j2) {
        if (this.d == 2) {
            int a2 = bhVar.a();
            this.f27937a.a(bhVar, a2);
            this.f27937a.a(j2, 1, a2, 0, null);
            return true;
        }
        int w = bhVar.w();
        if (w != 0 || this.f26404c) {
            if (this.d == 10 && w != 1) {
                return false;
            }
            int a3 = bhVar.a();
            this.f27937a.a(bhVar, a3);
            this.f27937a.a(j2, 1, a3, 0, null);
            return true;
        }
        int a4 = bhVar.a();
        byte[] bArr = new byte[a4];
        bhVar.a(bArr, 0, a4);
        a.b a5 = a.a(bArr);
        this.f27937a.a(new f9.b().f("audio/mp4a-latm").a(a5.f22663c).c(a5.f22662b).n(a5.f22661a).a(Collections.singletonList(bArr)).a());
        this.f26404c = true;
        return false;
    }
}

package com.applovin.impl;

import com.applovin.impl.a;
import com.applovin.impl.d9;
import com.applovin.impl.wl;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r1 extends wl {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f7306e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f7307b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7308c;

    /* renamed from: d, reason: collision with root package name */
    private int f7309d;

    public r1(ro roVar) {
        super(roVar);
    }

    @Override // com.applovin.impl.wl
    public boolean a(yg ygVar) {
        String str;
        if (!this.f7307b) {
            int w10 = ygVar.w();
            int i10 = (w10 >> 4) & 15;
            this.f7309d = i10;
            if (i10 == 2) {
                this.a.a(new d9.b().f(MimeTypes.AUDIO_MPEG).c(1).n(f7306e[(w10 >> 2) & 3]).a());
                this.f7308c = true;
            } else if (i10 != 7 && i10 != 8) {
                if (i10 != 10) {
                    throw new wl.a("Audio format not supported: " + this.f7309d);
                }
            } else {
                if (i10 == 7) {
                    str = MimeTypes.AUDIO_ALAW;
                } else {
                    str = MimeTypes.AUDIO_MLAW;
                }
                this.a.a(new d9.b().f(str).c(1).n(8000).a());
                this.f7308c = true;
            }
            this.f7307b = true;
        } else {
            ygVar.g(1);
        }
        return true;
    }

    @Override // com.applovin.impl.wl
    public boolean b(yg ygVar, long j3) {
        if (this.f7309d == 2) {
            int a = ygVar.a();
            this.a.a(ygVar, a);
            this.a.a(j3, 1, a, 0, null);
            return true;
        }
        int w10 = ygVar.w();
        if (w10 == 0 && !this.f7308c) {
            int a10 = ygVar.a();
            byte[] bArr = new byte[a10];
            ygVar.a(bArr, 0, a10);
            a.b a11 = a.a(bArr);
            this.a.a(new d9.b().f(MimeTypes.AUDIO_AAC).a(a11.f3565c).c(a11.f3564b).n(a11.a).a(Collections.singletonList(bArr)).a());
            this.f7308c = true;
            return false;
        }
        if (this.f7309d == 10 && w10 != 1) {
            return false;
        }
        int a12 = ygVar.a();
        this.a.a(ygVar, a12);
        this.a.a(j3, 1, a12, 0, null);
        return true;
    }
}

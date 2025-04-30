package com.applovin.impl;

import com.applovin.impl.AbstractC0667a;
import com.applovin.impl.d9;
import com.applovin.impl.wl;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743r1 extends wl {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f10441e = {5512, 11025, 22050, 44100};
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10442c;

    /* renamed from: d, reason: collision with root package name */
    private int f10443d;

    public C0743r1(ro roVar) {
        super(roVar);
    }

    @Override // com.applovin.impl.wl
    public boolean a(yg ygVar) {
        String str;
        if (!this.b) {
            int w2 = ygVar.w();
            int i9 = (w2 >> 4) & 15;
            this.f10443d = i9;
            if (i9 == 2) {
                this.f12014a.a(new d9.b().f(MimeTypes.AUDIO_MPEG).c(1).n(f10441e[(w2 >> 2) & 3]).a());
                this.f10442c = true;
            } else if (i9 != 7 && i9 != 8) {
                if (i9 != 10) {
                    throw new wl.a("Audio format not supported: " + this.f10443d);
                }
            } else {
                if (i9 == 7) {
                    str = MimeTypes.AUDIO_ALAW;
                } else {
                    str = MimeTypes.AUDIO_MLAW;
                }
                this.f12014a.a(new d9.b().f(str).c(1).n(8000).a());
                this.f10442c = true;
            }
            this.b = true;
        } else {
            ygVar.g(1);
        }
        return true;
    }

    @Override // com.applovin.impl.wl
    public boolean b(yg ygVar, long j7) {
        if (this.f10443d == 2) {
            int a6 = ygVar.a();
            this.f12014a.a(ygVar, a6);
            this.f12014a.a(j7, 1, a6, 0, null);
            return true;
        }
        int w2 = ygVar.w();
        if (w2 == 0 && !this.f10442c) {
            int a9 = ygVar.a();
            byte[] bArr = new byte[a9];
            ygVar.a(bArr, 0, a9);
            AbstractC0667a.b a10 = AbstractC0667a.a(bArr);
            this.f12014a.a(new d9.b().f(MimeTypes.AUDIO_AAC).a(a10.f6543c).c(a10.b).n(a10.f6542a).a(Collections.singletonList(bArr)).a());
            this.f10442c = true;
            return false;
        }
        if (this.f10443d == 10 && w2 != 1) {
            return false;
        }
        int a11 = ygVar.a();
        this.f12014a.a(ygVar, a11);
        this.f12014a.a(j7, 1, a11, 0, null);
        return true;
    }
}

package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class eg {
    private final fg a = new fg();

    /* renamed from: b, reason: collision with root package name */
    private final yg f4449b = new yg(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f4450c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f4451d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4452e;

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f4451d = 0;
        do {
            int i13 = this.f4451d;
            int i14 = i10 + i13;
            fg fgVar = this.a;
            if (i14 >= fgVar.f4737g) {
                break;
            }
            int[] iArr = fgVar.f4740j;
            this.f4451d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public yg b() {
        return this.f4449b;
    }

    public void c() {
        this.a.a();
        this.f4449b.d(0);
        this.f4450c = -1;
        this.f4452e = false;
    }

    public void d() {
        if (this.f4449b.c().length == 65025) {
            return;
        }
        yg ygVar = this.f4449b;
        ygVar.a(Arrays.copyOf(ygVar.c(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.f4449b.e())), this.f4449b.e());
    }

    public fg a() {
        return this.a;
    }

    public boolean a(j8 j8Var) {
        int i10;
        a1.b(j8Var != null);
        if (this.f4452e) {
            this.f4452e = false;
            this.f4449b.d(0);
        }
        while (!this.f4452e) {
            if (this.f4450c < 0) {
                if (!this.a.a(j8Var) || !this.a.a(j8Var, true)) {
                    return false;
                }
                fg fgVar = this.a;
                int i11 = fgVar.f4738h;
                if ((fgVar.f4732b & 1) == 1 && this.f4449b.e() == 0) {
                    i11 += a(0);
                    i10 = this.f4451d;
                } else {
                    i10 = 0;
                }
                if (!l8.a(j8Var, i11)) {
                    return false;
                }
                this.f4450c = i10;
            }
            int a = a(this.f4450c);
            int i12 = this.f4450c + this.f4451d;
            if (a > 0) {
                yg ygVar = this.f4449b;
                ygVar.a(ygVar.e() + a);
                if (!l8.b(j8Var, this.f4449b.c(), this.f4449b.e(), a)) {
                    return false;
                }
                yg ygVar2 = this.f4449b;
                ygVar2.e(ygVar2.e() + a);
                this.f4452e = this.a.f4740j[i12 + (-1)] != 255;
            }
            if (i12 == this.a.f4737g) {
                i12 = -1;
            }
            this.f4450c = i12;
        }
        return true;
    }
}

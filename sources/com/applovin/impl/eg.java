package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class eg {

    /* renamed from: a, reason: collision with root package name */
    private final fg f7420a = new fg();
    private final yg b = new yg(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f7421c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f7422d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7423e;

    private int a(int i9) {
        int i10;
        int i11 = 0;
        this.f7422d = 0;
        do {
            int i12 = this.f7422d;
            int i13 = i9 + i12;
            fg fgVar = this.f7420a;
            if (i13 >= fgVar.f7694g) {
                break;
            }
            int[] iArr = fgVar.f7697j;
            this.f7422d = i12 + 1;
            i10 = iArr[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public yg b() {
        return this.b;
    }

    public void c() {
        this.f7420a.a();
        this.b.d(0);
        this.f7421c = -1;
        this.f7423e = false;
    }

    public void d() {
        if (this.b.c().length == 65025) {
            return;
        }
        yg ygVar = this.b;
        ygVar.a(Arrays.copyOf(ygVar.c(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.b.e())), this.b.e());
    }

    public fg a() {
        return this.f7420a;
    }

    public boolean a(j8 j8Var) {
        int i9;
        AbstractC0669a1.b(j8Var != null);
        if (this.f7423e) {
            this.f7423e = false;
            this.b.d(0);
        }
        while (!this.f7423e) {
            if (this.f7421c < 0) {
                if (!this.f7420a.a(j8Var) || !this.f7420a.a(j8Var, true)) {
                    return false;
                }
                fg fgVar = this.f7420a;
                int i10 = fgVar.f7695h;
                if ((fgVar.b & 1) == 1 && this.b.e() == 0) {
                    i10 += a(0);
                    i9 = this.f7422d;
                } else {
                    i9 = 0;
                }
                if (!l8.a(j8Var, i10)) {
                    return false;
                }
                this.f7421c = i9;
            }
            int a6 = a(this.f7421c);
            int i11 = this.f7421c + this.f7422d;
            if (a6 > 0) {
                yg ygVar = this.b;
                ygVar.a(ygVar.e() + a6);
                if (!l8.b(j8Var, this.b.c(), this.b.e(), a6)) {
                    return false;
                }
                yg ygVar2 = this.b;
                ygVar2.e(ygVar2.e() + a6);
                this.f7423e = this.f7420a.f7697j[i11 + (-1)] != 255;
            }
            if (i11 == this.f7420a.f7694g) {
                i11 = -1;
            }
            this.f7421c = i11;
        }
        return true;
    }
}

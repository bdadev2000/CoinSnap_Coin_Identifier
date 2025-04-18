package com.applovin.impl;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ig {

    /* renamed from: a, reason: collision with root package name */
    private final jg f24468a = new jg();

    /* renamed from: b, reason: collision with root package name */
    private final bh f24469b = new bh(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f24470c = -1;
    private int d;
    private boolean e;

    public jg a() {
        return this.f24468a;
    }

    public bh b() {
        return this.f24469b;
    }

    public void c() {
        this.f24468a.a();
        this.f24469b.d(0);
        this.f24470c = -1;
        this.e = false;
    }

    public void d() {
        if (this.f24469b.c().length == 65025) {
            return;
        }
        bh bhVar = this.f24469b;
        bhVar.a(Arrays.copyOf(bhVar.c(), Math.max(65025, this.f24469b.e())), this.f24469b.e());
    }

    private int a(int i2) {
        int i3;
        int i4 = 0;
        this.d = 0;
        do {
            int i5 = this.d;
            int i6 = i2 + i5;
            jg jgVar = this.f24468a;
            if (i6 >= jgVar.f24677g) {
                break;
            }
            int[] iArr = jgVar.f24680j;
            this.d = i5 + 1;
            i3 = iArr[i6];
            i4 += i3;
        } while (i3 == 255);
        return i4;
    }

    public boolean a(l8 l8Var) {
        int i2;
        b1.b(l8Var != null);
        if (this.e) {
            this.e = false;
            this.f24469b.d(0);
        }
        while (!this.e) {
            if (this.f24470c < 0) {
                if (!this.f24468a.a(l8Var) || !this.f24468a.a(l8Var, true)) {
                    return false;
                }
                jg jgVar = this.f24468a;
                int i3 = jgVar.f24678h;
                if ((jgVar.f24674b & 1) == 1 && this.f24469b.e() == 0) {
                    i3 += a(0);
                    i2 = this.d;
                } else {
                    i2 = 0;
                }
                if (!n8.a(l8Var, i3)) {
                    return false;
                }
                this.f24470c = i2;
            }
            int a2 = a(this.f24470c);
            int i4 = this.f24470c + this.d;
            if (a2 > 0) {
                bh bhVar = this.f24469b;
                bhVar.a(bhVar.e() + a2);
                if (!n8.b(l8Var, this.f24469b.c(), this.f24469b.e(), a2)) {
                    return false;
                }
                bh bhVar2 = this.f24469b;
                bhVar2.e(bhVar2.e() + a2);
                this.e = this.f24468a.f24680j[i4 + (-1)] != 255;
            }
            if (i4 == this.f24468a.f24677g) {
                i4 = -1;
            }
            this.f24470c = i4;
        }
        return true;
    }
}

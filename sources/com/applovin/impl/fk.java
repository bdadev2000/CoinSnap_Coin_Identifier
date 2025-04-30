package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class fk {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f7717h = new X(1);

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator f7718i = new X(2);

    /* renamed from: a, reason: collision with root package name */
    private final int f7719a;

    /* renamed from: e, reason: collision with root package name */
    private int f7722e;

    /* renamed from: f, reason: collision with root package name */
    private int f7723f;

    /* renamed from: g, reason: collision with root package name */
    private int f7724g;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f7720c = new b[5];
    private final ArrayList b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private int f7721d = -1;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f7725a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public float f7726c;

        private b() {
        }
    }

    public fk(int i9) {
        this.f7719a = i9;
    }

    private void b() {
        if (this.f7721d != 0) {
            Collections.sort(this.b, f7718i);
            this.f7721d = 0;
        }
    }

    public void a(int i9, float f9) {
        b bVar;
        a();
        int i10 = this.f7724g;
        if (i10 > 0) {
            b[] bVarArr = this.f7720c;
            int i11 = i10 - 1;
            this.f7724g = i11;
            bVar = bVarArr[i11];
        } else {
            bVar = new b();
        }
        int i12 = this.f7722e;
        this.f7722e = i12 + 1;
        bVar.f7725a = i12;
        bVar.b = i9;
        bVar.f7726c = f9;
        this.b.add(bVar);
        this.f7723f += i9;
        while (true) {
            int i13 = this.f7723f;
            int i14 = this.f7719a;
            if (i13 <= i14) {
                return;
            }
            int i15 = i13 - i14;
            b bVar2 = (b) this.b.get(0);
            int i16 = bVar2.b;
            if (i16 <= i15) {
                this.f7723f -= i16;
                this.b.remove(0);
                int i17 = this.f7724g;
                if (i17 < 5) {
                    b[] bVarArr2 = this.f7720c;
                    this.f7724g = i17 + 1;
                    bVarArr2[i17] = bVar2;
                }
            } else {
                bVar2.b = i16 - i15;
                this.f7723f -= i15;
            }
        }
    }

    public void c() {
        this.b.clear();
        this.f7721d = -1;
        this.f7722e = 0;
        this.f7723f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(b bVar, b bVar2) {
        return Float.compare(bVar.f7726c, bVar2.f7726c);
    }

    private void a() {
        if (this.f7721d != 1) {
            Collections.sort(this.b, f7717h);
            this.f7721d = 1;
        }
    }

    public float a(float f9) {
        b();
        float f10 = f9 * this.f7723f;
        int i9 = 0;
        for (int i10 = 0; i10 < this.b.size(); i10++) {
            b bVar = (b) this.b.get(i10);
            i9 += bVar.b;
            if (i9 >= f10) {
                return bVar.f7726c;
            }
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) com.mbridge.msdk.foundation.entity.o.g(this.b, 1)).f7726c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.f7725a - bVar2.f7725a;
    }
}

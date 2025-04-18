package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class ik {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f24501h = new ns(1);

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator f24502i = new ns(2);

    /* renamed from: a, reason: collision with root package name */
    private final int f24503a;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private int f24506f;

    /* renamed from: g, reason: collision with root package name */
    private int f24507g;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f24505c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f24504b = new ArrayList();
    private int d = -1;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f24508a;

        /* renamed from: b, reason: collision with root package name */
        public int f24509b;

        /* renamed from: c, reason: collision with root package name */
        public float f24510c;

        private b() {
        }
    }

    public ik(int i2) {
        this.f24503a = i2;
    }

    private void b() {
        if (this.d != 0) {
            Collections.sort(this.f24504b, f24502i);
            this.d = 0;
        }
    }

    public void a(int i2, float f2) {
        b bVar;
        a();
        int i3 = this.f24507g;
        if (i3 > 0) {
            b[] bVarArr = this.f24505c;
            int i4 = i3 - 1;
            this.f24507g = i4;
            bVar = bVarArr[i4];
        } else {
            bVar = new b();
        }
        int i5 = this.e;
        this.e = i5 + 1;
        bVar.f24508a = i5;
        bVar.f24509b = i2;
        bVar.f24510c = f2;
        this.f24504b.add(bVar);
        this.f24506f += i2;
        while (true) {
            int i6 = this.f24506f;
            int i7 = this.f24503a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            b bVar2 = (b) this.f24504b.get(0);
            int i9 = bVar2.f24509b;
            if (i9 <= i8) {
                this.f24506f -= i9;
                this.f24504b.remove(0);
                int i10 = this.f24507g;
                if (i10 < 5) {
                    b[] bVarArr2 = this.f24505c;
                    this.f24507g = i10 + 1;
                    bVarArr2[i10] = bVar2;
                }
            } else {
                bVar2.f24509b = i9 - i8;
                this.f24506f -= i8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(b bVar, b bVar2) {
        return Float.compare(bVar.f24510c, bVar2.f24510c);
    }

    public void c() {
        this.f24504b.clear();
        this.d = -1;
        this.e = 0;
        this.f24506f = 0;
    }

    private void a() {
        if (this.d != 1) {
            Collections.sort(this.f24504b, f24501h);
            this.d = 1;
        }
    }

    public float a(float f2) {
        b();
        float f3 = f2 * this.f24506f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f24504b.size(); i3++) {
            b bVar = (b) this.f24504b.get(i3);
            i2 += bVar.f24509b;
            if (i2 >= f3) {
                return bVar.f24510c;
            }
        }
        if (this.f24504b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f24504b.get(r5.size() - 1)).f24510c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.f24508a - bVar2.f24508a;
    }
}

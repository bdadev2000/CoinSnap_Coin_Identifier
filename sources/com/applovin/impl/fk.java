package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class fk {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f4761h = new et(1);

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator f4762i = new et(2);
    private final int a;

    /* renamed from: e, reason: collision with root package name */
    private int f4766e;

    /* renamed from: f, reason: collision with root package name */
    private int f4767f;

    /* renamed from: g, reason: collision with root package name */
    private int f4768g;

    /* renamed from: c, reason: collision with root package name */
    private final b[] f4764c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f4763b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private int f4765d = -1;

    /* loaded from: classes.dex */
    public static class b {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public int f4769b;

        /* renamed from: c, reason: collision with root package name */
        public float f4770c;

        private b() {
        }
    }

    public fk(int i10) {
        this.a = i10;
    }

    private void b() {
        if (this.f4765d != 0) {
            Collections.sort(this.f4763b, f4762i);
            this.f4765d = 0;
        }
    }

    public void a(int i10, float f10) {
        b bVar;
        a();
        int i11 = this.f4768g;
        if (i11 > 0) {
            b[] bVarArr = this.f4764c;
            int i12 = i11 - 1;
            this.f4768g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f4766e;
        this.f4766e = i13 + 1;
        bVar.a = i13;
        bVar.f4769b = i10;
        bVar.f4770c = f10;
        this.f4763b.add(bVar);
        this.f4767f += i10;
        while (true) {
            int i14 = this.f4767f;
            int i15 = this.a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = (b) this.f4763b.get(0);
            int i17 = bVar2.f4769b;
            if (i17 <= i16) {
                this.f4767f -= i17;
                this.f4763b.remove(0);
                int i18 = this.f4768g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f4764c;
                    this.f4768g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f4769b = i17 - i16;
                this.f4767f -= i16;
            }
        }
    }

    public void c() {
        this.f4763b.clear();
        this.f4765d = -1;
        this.f4766e = 0;
        this.f4767f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(b bVar, b bVar2) {
        return Float.compare(bVar.f4770c, bVar2.f4770c);
    }

    private void a() {
        if (this.f4765d != 1) {
            Collections.sort(this.f4763b, f4761h);
            this.f4765d = 1;
        }
    }

    public float a(float f10) {
        b();
        float f11 = f10 * this.f4767f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f4763b.size(); i11++) {
            b bVar = (b) this.f4763b.get(i11);
            i10 += bVar.f4769b;
            if (i10 >= f11) {
                return bVar.f4770c;
            }
        }
        if (this.f4763b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f4763b.get(r5.size() - 1)).f4770c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.a - bVar2.a;
    }
}

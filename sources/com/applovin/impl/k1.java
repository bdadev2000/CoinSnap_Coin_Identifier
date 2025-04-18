package com.applovin.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class k1 implements m2 {

    /* renamed from: g, reason: collision with root package name */
    public static final k1 f5582g = new b().a();

    /* renamed from: h, reason: collision with root package name */
    public static final m2.a f5583h = new ss(20);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5584b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5585c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5586d;

    /* renamed from: f, reason: collision with root package name */
    private AudioAttributes f5587f;

    /* loaded from: classes.dex */
    public static final class b {
        private int a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f5588b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f5589c = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f5590d = 1;

        public b a(int i10) {
            this.f5590d = i10;
            return this;
        }

        public b b(int i10) {
            this.a = i10;
            return this;
        }

        public b c(int i10) {
            this.f5588b = i10;
            return this;
        }

        public b d(int i10) {
            this.f5589c = i10;
            return this;
        }

        public k1 a() {
            return new k1(this.a, this.f5588b, this.f5589c, this.f5590d);
        }
    }

    private k1(int i10, int i11, int i12, int i13) {
        this.a = i10;
        this.f5584b = i11;
        this.f5585c = i12;
        this.f5586d = i13;
    }

    public AudioAttributes a() {
        if (this.f5587f == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.f5584b).setUsage(this.f5585c);
            if (yp.a >= 29) {
                usage.setAllowedCapturePolicy(this.f5586d);
            }
            this.f5587f = usage.build();
        }
        return this.f5587f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k1.class != obj.getClass()) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (this.a == k1Var.a && this.f5584b == k1Var.f5584b && this.f5585c == k1Var.f5585c && this.f5586d == k1Var.f5586d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a + 527) * 31) + this.f5584b) * 31) + this.f5585c) * 31) + this.f5586d;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k1 a(Bundle bundle) {
        b bVar = new b();
        if (bundle.containsKey(a(0))) {
            bVar.b(bundle.getInt(a(0)));
        }
        if (bundle.containsKey(a(1))) {
            bVar.c(bundle.getInt(a(1)));
        }
        if (bundle.containsKey(a(2))) {
            bVar.d(bundle.getInt(a(2)));
        }
        if (bundle.containsKey(a(3))) {
            bVar.a(bundle.getInt(a(3)));
        }
        return bVar.a();
    }
}

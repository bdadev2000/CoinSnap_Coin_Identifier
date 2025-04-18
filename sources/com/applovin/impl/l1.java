package com.applovin.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.impl.o2;

/* loaded from: classes.dex */
public final class l1 implements o2 {

    /* renamed from: g, reason: collision with root package name */
    public static final l1 f24967g = new b().a();

    /* renamed from: h, reason: collision with root package name */
    public static final o2.a f24968h = new rs(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f24969a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24970b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24971c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    private AudioAttributes f24972f;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f24973a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f24974b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f24975c = 1;
        private int d = 1;

        public b a(int i2) {
            this.d = i2;
            return this;
        }

        public b b(int i2) {
            this.f24973a = i2;
            return this;
        }

        public b c(int i2) {
            this.f24974b = i2;
            return this;
        }

        public b d(int i2) {
            this.f24975c = i2;
            return this;
        }

        public l1 a() {
            return new l1(this.f24973a, this.f24974b, this.f24975c, this.d);
        }
    }

    private l1(int i2, int i3, int i4, int i5) {
        this.f24969a = i2;
        this.f24970b = i3;
        this.f24971c = i4;
        this.d = i5;
    }

    public AudioAttributes a() {
        if (this.f24972f == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f24969a).setFlags(this.f24970b).setUsage(this.f24971c);
            if (xp.f27962a >= 29) {
                usage.setAllowedCapturePolicy(this.d);
            }
            this.f24972f = usage.build();
        }
        return this.f24972f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l1.class != obj.getClass()) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f24969a == l1Var.f24969a && this.f24970b == l1Var.f24970b && this.f24971c == l1Var.f24971c && this.d == l1Var.d;
    }

    public int hashCode() {
        return ((((((this.f24969a + 527) * 31) + this.f24970b) * 31) + this.f24971c) * 31) + this.d;
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l1 a(Bundle bundle) {
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

package com.applovin.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;

/* renamed from: com.applovin.impl.k1 */
/* loaded from: classes.dex */
public final class C0716k1 implements InterfaceC0725m2 {

    /* renamed from: g */
    public static final C0716k1 f8529g = new b().a();

    /* renamed from: h */
    public static final InterfaceC0725m2.a f8530h = new I(21);

    /* renamed from: a */
    public final int f8531a;
    public final int b;

    /* renamed from: c */
    public final int f8532c;

    /* renamed from: d */
    public final int f8533d;

    /* renamed from: f */
    private AudioAttributes f8534f;

    /* renamed from: com.applovin.impl.k1$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private int f8535a = 0;
        private int b = 0;

        /* renamed from: c */
        private int f8536c = 1;

        /* renamed from: d */
        private int f8537d = 1;

        public b a(int i9) {
            this.f8537d = i9;
            return this;
        }

        public b b(int i9) {
            this.f8535a = i9;
            return this;
        }

        public b c(int i9) {
            this.b = i9;
            return this;
        }

        public b d(int i9) {
            this.f8536c = i9;
            return this;
        }

        public C0716k1 a() {
            return new C0716k1(this.f8535a, this.b, this.f8536c, this.f8537d);
        }
    }

    private C0716k1(int i9, int i10, int i11, int i12) {
        this.f8531a = i9;
        this.b = i10;
        this.f8532c = i11;
        this.f8533d = i12;
    }

    public static /* synthetic */ C0716k1 b(Bundle bundle) {
        return a(bundle);
    }

    public AudioAttributes a() {
        if (this.f8534f == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f8531a).setFlags(this.b).setUsage(this.f8532c);
            if (yp.f12451a >= 29) {
                usage.setAllowedCapturePolicy(this.f8533d);
            }
            this.f8534f = usage.build();
        }
        return this.f8534f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0716k1.class != obj.getClass()) {
            return false;
        }
        C0716k1 c0716k1 = (C0716k1) obj;
        if (this.f8531a == c0716k1.f8531a && this.b == c0716k1.b && this.f8532c == c0716k1.f8532c && this.f8533d == c0716k1.f8533d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f8531a + 527) * 31) + this.b) * 31) + this.f8532c) * 31) + this.f8533d;
    }

    public /* synthetic */ C0716k1(int i9, int i10, int i11, int i12, a aVar) {
        this(i9, i10, i11, i12);
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
    }

    public static /* synthetic */ C0716k1 a(Bundle bundle) {
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

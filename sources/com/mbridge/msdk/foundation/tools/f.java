package com.mbridge.msdk.foundation.tools;

/* loaded from: classes3.dex */
final class f {

    /* loaded from: classes3.dex */
    public static class a extends j {
        public a(int i9, int i10, Object obj, int i11, boolean z8) {
            super(i9, i10, obj, i11, z8);
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 7;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        int f16059a;

        public abstract byte a();
    }

    /* loaded from: classes3.dex */
    public static class c extends b {
        boolean b;

        public c(int i9, boolean z8) {
            this.f16059a = i9;
            this.b = z8;
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 1;
        }
    }

    /* loaded from: classes3.dex */
    public static class d extends b {
        double b;

        public d(int i9, double d2) {
            this.f16059a = i9;
            this.b = d2;
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 5;
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends b {
        float b;

        public e(int i9, float f9) {
            this.f16059a = i9;
            this.b = f9;
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 3;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.f$f, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0164f extends b {
        int b;

        public C0164f(int i9, int i10) {
            this.f16059a = i9;
            this.b = i10;
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 2;
        }
    }

    /* loaded from: classes3.dex */
    public static class g extends b {
        long b;

        public g(int i9, long j7) {
            this.f16059a = i9;
            this.b = j7;
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 4;
        }
    }

    /* loaded from: classes3.dex */
    public static class h extends j {
        public h(int i9, int i10, Object obj, int i11, boolean z8) {
            super(i9, i10, obj, i11, z8);
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 8;
        }
    }

    /* loaded from: classes3.dex */
    public static class i extends j {
        public i(int i9, int i10, String str, int i11, boolean z8) {
            super(i9, i10, str, i11, z8);
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 6;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class j extends b {
        boolean b;

        /* renamed from: c, reason: collision with root package name */
        int f16060c;

        /* renamed from: d, reason: collision with root package name */
        Object f16061d;

        /* renamed from: e, reason: collision with root package name */
        int f16062e;

        public j(int i9, int i10, Object obj, int i11, boolean z8) {
            this.f16060c = i9;
            this.f16059a = i10;
            this.f16061d = obj;
            this.f16062e = i11;
            this.b = z8;
        }
    }
}

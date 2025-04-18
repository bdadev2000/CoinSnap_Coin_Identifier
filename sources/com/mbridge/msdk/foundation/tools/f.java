package com.mbridge.msdk.foundation.tools;

/* loaded from: classes4.dex */
final class f {

    /* loaded from: classes4.dex */
    public static class a extends j {
        public a(int i10, int i11, Object obj, int i12, boolean z10) {
            super(i10, i11, obj, i12, z10);
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 7;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {
        int a;

        public abstract byte a();
    }

    /* loaded from: classes4.dex */
    public static class c extends b {

        /* renamed from: b, reason: collision with root package name */
        boolean f13616b;

        public c(int i10, boolean z10) {
            this.a = i10;
            this.f13616b = z10;
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 1;
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends b {

        /* renamed from: b, reason: collision with root package name */
        double f13617b;

        public d(int i10, double d10) {
            this.a = i10;
            this.f13617b = d10;
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 5;
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends b {

        /* renamed from: b, reason: collision with root package name */
        float f13618b;

        public e(int i10, float f10) {
            this.a = i10;
            this.f13618b = f10;
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 3;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0176f extends b {

        /* renamed from: b, reason: collision with root package name */
        int f13619b;

        public C0176f(int i10, int i11) {
            this.a = i10;
            this.f13619b = i11;
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 2;
        }
    }

    /* loaded from: classes4.dex */
    public static class g extends b {

        /* renamed from: b, reason: collision with root package name */
        long f13620b;

        public g(int i10, long j3) {
            this.a = i10;
            this.f13620b = j3;
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 4;
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends j {
        public h(int i10, int i11, Object obj, int i12, boolean z10) {
            super(i10, i11, obj, i12, z10);
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 8;
        }
    }

    /* loaded from: classes4.dex */
    public static class i extends j {
        public i(int i10, int i11, String str, int i12, boolean z10) {
            super(i10, i11, str, i12, z10);
        }

        @Override // com.mbridge.msdk.foundation.tools.f.b
        public final byte a() {
            return (byte) 6;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class j extends b {

        /* renamed from: b, reason: collision with root package name */
        boolean f13621b;

        /* renamed from: c, reason: collision with root package name */
        int f13622c;

        /* renamed from: d, reason: collision with root package name */
        Object f13623d;

        /* renamed from: e, reason: collision with root package name */
        int f13624e;

        public j(int i10, int i11, Object obj, int i12, boolean z10) {
            this.f13622c = i10;
            this.a = i11;
            this.f13623d = obj;
            this.f13624e = i12;
            this.f13621b = z10;
        }
    }
}

package com.applovin.impl;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC0725m2;
import com.applovin.impl.z8;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface nh {

    /* loaded from: classes.dex */
    public static final class b implements InterfaceC0725m2 {
        public static final b b = new a().a();

        /* renamed from: c */
        public static final InterfaceC0725m2.a f9339c = new I(27);

        /* renamed from: a */
        private final z8 f9340a;

        /* loaded from: classes.dex */
        public static final class a {
            private static final int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};

            /* renamed from: a */
            private final z8.b f9341a = new z8.b();

            public a a(int i9) {
                this.f9341a.a(i9);
                return this;
            }

            public a a(b bVar) {
                this.f9341a.a(bVar.f9340a);
                return this;
            }

            public a a(int... iArr) {
                this.f9341a.a(iArr);
                return this;
            }

            public a a(int i9, boolean z8) {
                this.f9341a.a(i9, z8);
                return this;
            }

            public b a() {
                return new b(this.f9341a.a());
            }
        }

        private b(z8 z8Var) {
            this.f9340a = z8Var;
        }

        public static /* synthetic */ b b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f9340a.equals(((b) obj).f9340a);
        }

        public int hashCode() {
            return this.f9340a.hashCode();
        }

        private static String b(int i9) {
            return Integer.toString(i9, 36);
        }

        public boolean a(int i9) {
            return this.f9340a.a(i9);
        }

        public /* synthetic */ b(z8 z8Var, a aVar) {
            this(z8Var);
        }

        public static b a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b(0));
            if (integerArrayList == null) {
                return b;
            }
            a aVar = new a();
            for (int i9 = 0; i9 < integerArrayList.size(); i9++) {
                aVar.a(integerArrayList.get(i9).intValue());
            }
            return aVar.a();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        default void a(int i9) {
        }

        default void b() {
        }

        void b(int i9);

        default void c(int i9) {
        }

        default void d(boolean z8) {
        }

        default void e(int i9) {
        }

        default void a(go goVar, int i9) {
        }

        default void b(kh khVar) {
        }

        default void c(boolean z8) {
        }

        default void e(boolean z8) {
        }

        default void a(kh khVar) {
        }

        default void b(boolean z8) {
        }

        default void a(mh mhVar) {
        }

        default void b(boolean z8, int i9) {
        }

        default void a(b bVar) {
        }

        default void a(f fVar, f fVar2, int i9) {
        }

        default void a(nh nhVar, d dVar) {
        }

        default void a(od odVar, int i9) {
        }

        default void a(qd qdVar) {
        }

        default void a(qo qoVar, uo uoVar) {
        }

        default void a(boolean z8, int i9) {
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final z8 f9342a;

        public d(z8 z8Var) {
            this.f9342a = z8Var;
        }

        public boolean a(int i9) {
            return this.f9342a.a(i9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return this.f9342a.equals(((d) obj).f9342a);
        }

        public int hashCode() {
            return this.f9342a.hashCode();
        }

        public boolean a(int... iArr) {
            return this.f9342a.a(iArr);
        }
    }

    /* loaded from: classes.dex */
    public interface e extends c {
        default void a() {
        }

        @Override // com.applovin.impl.nh.c
        default void b(int i9) {
        }

        @Override // com.applovin.impl.nh.c
        default void c(int i9) {
        }

        @Override // com.applovin.impl.nh.c
        default void d(boolean z8) {
        }

        default void a(float f9) {
        }

        default void b(int i9, boolean z8) {
        }

        @Override // com.applovin.impl.nh.c
        default void c(boolean z8) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(int i9) {
        }

        @Override // com.applovin.impl.nh.c
        default void b(kh khVar) {
        }

        default void a(int i9, int i10) {
        }

        @Override // com.applovin.impl.nh.c
        default void b(boolean z8) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(go goVar, int i9) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(kh khVar) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(mh mhVar) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(b bVar) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(f fVar, f fVar2, int i9) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(nh nhVar, d dVar) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(od odVar, int i9) {
        }

        default void a(p6 p6Var) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(qd qdVar) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(qo qoVar, uo uoVar) {
        }

        default void a(we weVar) {
        }

        default void a(yq yqVar) {
        }

        default void a(List list) {
        }

        default void a(boolean z8) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(boolean z8, int i9) {
        }
    }

    uo A();

    void B();

    qd C();

    void D();

    int E();

    long F();

    mh a();

    void a(int i9);

    void a(int i9, long j7);

    void a(long j7);

    void a(SurfaceView surfaceView);

    void a(TextureView textureView);

    void a(e eVar);

    void a(boolean z8);

    void b();

    void b(SurfaceView surfaceView);

    void b(TextureView textureView);

    void b(e eVar);

    void b(boolean z8);

    boolean b(int i9);

    kh c();

    boolean d();

    long e();

    int f();

    long g();

    long getCurrentPosition();

    long getDuration();

    long h();

    b i();

    boolean isPlaying();

    int j();

    qo k();

    boolean l();

    int m();

    go n();

    int o();

    Looper p();

    long q();

    boolean r();

    long s();

    int t();

    void u();

    int v();

    void w();

    List x();

    boolean y();

    yq z();

    /* loaded from: classes.dex */
    public static final class f implements InterfaceC0725m2 {

        /* renamed from: k */
        public static final InterfaceC0725m2.a f9343k = new I(28);

        /* renamed from: a */
        public final Object f9344a;
        public final int b;

        /* renamed from: c */
        public final od f9345c;

        /* renamed from: d */
        public final Object f9346d;

        /* renamed from: f */
        public final int f9347f;

        /* renamed from: g */
        public final long f9348g;

        /* renamed from: h */
        public final long f9349h;

        /* renamed from: i */
        public final int f9350i;

        /* renamed from: j */
        public final int f9351j;

        public f(Object obj, int i9, od odVar, Object obj2, int i10, long j7, long j9, int i11, int i12) {
            this.f9344a = obj;
            this.b = i9;
            this.f9345c = odVar;
            this.f9346d = obj2;
            this.f9347f = i10;
            this.f9348g = j7;
            this.f9349h = j9;
            this.f9350i = i11;
            this.f9351j = i12;
        }

        public static f a(Bundle bundle) {
            return new f(null, bundle.getInt(a(0), -1), (od) AbstractC0729n2.a(od.f9411h, bundle.getBundle(a(1))), null, bundle.getInt(a(2), -1), bundle.getLong(a(3), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET), bundle.getLong(a(4), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET), bundle.getInt(a(5), -1), bundle.getInt(a(6), -1));
        }

        public static /* synthetic */ f b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.b == fVar.b && this.f9347f == fVar.f9347f && this.f9348g == fVar.f9348g && this.f9349h == fVar.f9349h && this.f9350i == fVar.f9350i && this.f9351j == fVar.f9351j && Objects.equal(this.f9344a, fVar.f9344a) && Objects.equal(this.f9346d, fVar.f9346d) && Objects.equal(this.f9345c, fVar.f9345c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f9344a, Integer.valueOf(this.b), this.f9345c, this.f9346d, Integer.valueOf(this.f9347f), Integer.valueOf(this.b), Long.valueOf(this.f9348g), Long.valueOf(this.f9349h), Integer.valueOf(this.f9350i), Integer.valueOf(this.f9351j));
        }

        private static String a(int i9) {
            return Integer.toString(i9, 36);
        }
    }
}

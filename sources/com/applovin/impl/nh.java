package com.applovin.impl;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;
import com.applovin.impl.z8;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface nh {

    /* loaded from: classes.dex */
    public static final class b implements m2 {

        /* renamed from: b */
        public static final b f6404b = new a().a();

        /* renamed from: c */
        public static final m2.a f6405c = new ss(26);
        private final z8 a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: b */
            private static final int[] f6406b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
            private final z8.b a = new z8.b();

            public a a(int i10) {
                this.a.a(i10);
                return this;
            }

            public a a(b bVar) {
                this.a.a(bVar.a);
                return this;
            }

            public a a(int... iArr) {
                this.a.a(iArr);
                return this;
            }

            public a a(int i10, boolean z10) {
                this.a.a(i10, z10);
                return this;
            }

            public b a() {
                return new b(this.a.a());
            }
        }

        private b(z8 z8Var) {
            this.a = z8Var;
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
            return this.a.equals(((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean a(int i10) {
            return this.a.a(i10);
        }

        public /* synthetic */ b(z8 z8Var, a aVar) {
            this(z8Var);
        }

        public static b a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b(0));
            if (integerArrayList == null) {
                return f6404b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.a();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        default void a(int i10) {
        }

        default void b() {
        }

        void b(int i10);

        default void c(int i10) {
        }

        default void d(boolean z10) {
        }

        default void e(int i10) {
        }

        default void a(go goVar, int i10) {
        }

        default void b(kh khVar) {
        }

        default void c(boolean z10) {
        }

        default void e(boolean z10) {
        }

        default void a(kh khVar) {
        }

        default void b(boolean z10) {
        }

        default void a(mh mhVar) {
        }

        default void b(boolean z10, int i10) {
        }

        default void a(b bVar) {
        }

        default void a(f fVar, f fVar2, int i10) {
        }

        default void a(nh nhVar, d dVar) {
        }

        default void a(od odVar, int i10) {
        }

        default void a(qd qdVar) {
        }

        default void a(qo qoVar, uo uoVar) {
        }

        default void a(boolean z10, int i10) {
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        private final z8 a;

        public d(z8 z8Var) {
            this.a = z8Var;
        }

        public boolean a(int i10) {
            return this.a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return this.a.equals(((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public boolean a(int... iArr) {
            return this.a.a(iArr);
        }
    }

    /* loaded from: classes.dex */
    public interface e extends c {
        default void a() {
        }

        @Override // com.applovin.impl.nh.c
        default void b(int i10) {
        }

        @Override // com.applovin.impl.nh.c
        default void c(int i10) {
        }

        @Override // com.applovin.impl.nh.c
        default void d(boolean z10) {
        }

        default void a(float f10) {
        }

        default void b(int i10, boolean z10) {
        }

        @Override // com.applovin.impl.nh.c
        default void c(boolean z10) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(int i10) {
        }

        @Override // com.applovin.impl.nh.c
        default void b(kh khVar) {
        }

        default void a(int i10, int i11) {
        }

        @Override // com.applovin.impl.nh.c
        default void b(boolean z10) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(go goVar, int i10) {
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
        default void a(f fVar, f fVar2, int i10) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(nh nhVar, d dVar) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(od odVar, int i10) {
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

        default void a(boolean z10) {
        }

        @Override // com.applovin.impl.nh.c
        default void a(boolean z10, int i10) {
        }
    }

    uo A();

    void B();

    qd C();

    void D();

    int E();

    long F();

    mh a();

    void a(int i10);

    void a(int i10, long j3);

    void a(long j3);

    void a(SurfaceView surfaceView);

    void a(TextureView textureView);

    void a(e eVar);

    void a(boolean z10);

    void b();

    void b(SurfaceView surfaceView);

    void b(TextureView textureView);

    void b(e eVar);

    void b(boolean z10);

    boolean b(int i10);

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
    public static final class f implements m2 {

        /* renamed from: k */
        public static final m2.a f6407k = new ss(27);
        public final Object a;

        /* renamed from: b */
        public final int f6408b;

        /* renamed from: c */
        public final od f6409c;

        /* renamed from: d */
        public final Object f6410d;

        /* renamed from: f */
        public final int f6411f;

        /* renamed from: g */
        public final long f6412g;

        /* renamed from: h */
        public final long f6413h;

        /* renamed from: i */
        public final int f6414i;

        /* renamed from: j */
        public final int f6415j;

        public f(Object obj, int i10, od odVar, Object obj2, int i11, long j3, long j10, int i12, int i13) {
            this.a = obj;
            this.f6408b = i10;
            this.f6409c = odVar;
            this.f6410d = obj2;
            this.f6411f = i11;
            this.f6412g = j3;
            this.f6413h = j10;
            this.f6414i = i12;
            this.f6415j = i13;
        }

        public static f a(Bundle bundle) {
            return new f(null, bundle.getInt(a(0), -1), (od) n2.a(od.f6476h, bundle.getBundle(a(1))), null, bundle.getInt(a(2), -1), bundle.getLong(a(3), C.TIME_UNSET), bundle.getLong(a(4), C.TIME_UNSET), bundle.getInt(a(5), -1), bundle.getInt(a(6), -1));
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
            if (this.f6408b == fVar.f6408b && this.f6411f == fVar.f6411f && this.f6412g == fVar.f6412g && this.f6413h == fVar.f6413h && this.f6414i == fVar.f6414i && this.f6415j == fVar.f6415j && Objects.equal(this.a, fVar.a) && Objects.equal(this.f6410d, fVar.f6410d) && Objects.equal(this.f6409c, fVar.f6409c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.a, Integer.valueOf(this.f6408b), this.f6409c, this.f6410d, Integer.valueOf(this.f6411f), Integer.valueOf(this.f6408b), Long.valueOf(this.f6412g), Long.valueOf(this.f6413h), Integer.valueOf(this.f6414i), Integer.valueOf(this.f6415j));
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }
}

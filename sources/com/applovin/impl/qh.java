package com.applovin.impl;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.b9;
import com.applovin.impl.o2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface qh {

    /* loaded from: classes.dex */
    public static final class b implements o2 {

        /* renamed from: b */
        public static final b f26174b = new a().a();

        /* renamed from: c */
        public static final o2.a f26175c = new ru(2);

        /* renamed from: a */
        private final b9 f26176a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: b */
            private static final int[] f26177b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};

            /* renamed from: a */
            private final b9.b f26178a = new b9.b();

            public a a(int i2) {
                this.f26178a.a(i2);
                return this;
            }

            public a a(b bVar) {
                this.f26178a.a(bVar.f26176a);
                return this;
            }

            public a a(int... iArr) {
                this.f26178a.a(iArr);
                return this;
            }

            public a a(int i2, boolean z2) {
                this.f26178a.a(i2, z2);
                return this;
            }

            public b a() {
                return new b(this.f26178a.a());
            }
        }

        private b(b9 b9Var) {
            this.f26176a = b9Var;
        }

        public static /* synthetic */ b b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f26176a.equals(((b) obj).f26176a);
            }
            return false;
        }

        public int hashCode() {
            return this.f26176a.hashCode();
        }

        public /* synthetic */ b(b9 b9Var, a aVar) {
            this(b9Var);
        }

        private static String b(int i2) {
            return Integer.toString(i2, 36);
        }

        public boolean a(int i2) {
            return this.f26176a.a(i2);
        }

        public static b a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b(0));
            if (integerArrayList == null) {
                return f26174b;
            }
            a aVar = new a();
            for (int i2 = 0; i2 < integerArrayList.size(); i2++) {
                aVar.a(integerArrayList.get(i2).intValue());
            }
            return aVar.a();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        default void a(int i2) {
        }

        default void b() {
        }

        void b(int i2);

        default void c(int i2) {
        }

        default void d(boolean z2) {
        }

        default void e(int i2) {
        }

        default void a(fo foVar, int i2) {
        }

        default void b(nh nhVar) {
        }

        default void c(boolean z2) {
        }

        default void e(boolean z2) {
        }

        default void a(nh nhVar) {
        }

        default void b(boolean z2) {
        }

        default void a(ph phVar) {
        }

        default void b(boolean z2, int i2) {
        }

        default void a(po poVar, to toVar) {
        }

        default void a(b bVar) {
        }

        default void a(f fVar, f fVar2, int i2) {
        }

        default void a(qh qhVar, d dVar) {
        }

        default void a(td tdVar, int i2) {
        }

        default void a(vd vdVar) {
        }

        default void a(boolean z2, int i2) {
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final b9 f26179a;

        public d(b9 b9Var) {
            this.f26179a = b9Var;
        }

        public boolean a(int i2) {
            return this.f26179a.a(i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return this.f26179a.equals(((d) obj).f26179a);
            }
            return false;
        }

        public int hashCode() {
            return this.f26179a.hashCode();
        }

        public boolean a(int... iArr) {
            return this.f26179a.a(iArr);
        }
    }

    /* loaded from: classes.dex */
    public interface e extends c {
        default void a() {
        }

        @Override // com.applovin.impl.qh.c
        default void b(int i2) {
        }

        @Override // com.applovin.impl.qh.c
        default void c(int i2) {
        }

        @Override // com.applovin.impl.qh.c
        default void d(boolean z2) {
        }

        default void a(float f2) {
        }

        default void b(int i2, boolean z2) {
        }

        @Override // com.applovin.impl.qh.c
        default void c(boolean z2) {
        }

        @Override // com.applovin.impl.qh.c
        default void a(int i2) {
        }

        @Override // com.applovin.impl.qh.c
        default void b(nh nhVar) {
        }

        default void a(int i2, int i3) {
        }

        @Override // com.applovin.impl.qh.c
        default void b(boolean z2) {
        }

        default void a(bf bfVar) {
        }

        @Override // com.applovin.impl.qh.c
        default void a(fo foVar, int i2) {
        }

        @Override // com.applovin.impl.qh.c
        default void a(nh nhVar) {
        }

        @Override // com.applovin.impl.qh.c
        default void a(ph phVar) {
        }

        @Override // com.applovin.impl.qh.c
        default void a(po poVar, to toVar) {
        }

        @Override // com.applovin.impl.qh.c
        default void a(b bVar) {
        }

        @Override // com.applovin.impl.qh.c
        default void a(f fVar, f fVar2, int i2) {
        }

        @Override // com.applovin.impl.qh.c
        default void a(qh qhVar, d dVar) {
        }

        default void a(r6 r6Var) {
        }

        @Override // com.applovin.impl.qh.c
        default void a(td tdVar, int i2) {
        }

        @Override // com.applovin.impl.qh.c
        default void a(vd vdVar) {
        }

        default void a(xq xqVar) {
        }

        default void a(List list) {
        }

        default void a(boolean z2) {
        }

        @Override // com.applovin.impl.qh.c
        default void a(boolean z2, int i2) {
        }
    }

    to A();

    void B();

    vd C();

    void D();

    int E();

    long F();

    ph a();

    void a(int i2);

    void a(int i2, long j2);

    void a(long j2);

    void a(SurfaceView surfaceView);

    void a(TextureView textureView);

    void a(e eVar);

    void a(boolean z2);

    void b();

    void b(SurfaceView surfaceView);

    void b(TextureView textureView);

    void b(e eVar);

    void b(boolean z2);

    boolean b(int i2);

    nh c();

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

    po k();

    boolean l();

    int m();

    fo n();

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

    xq z();

    /* loaded from: classes.dex */
    public static final class f implements o2 {

        /* renamed from: k */
        public static final o2.a f26180k = new ru(3);

        /* renamed from: a */
        public final Object f26181a;

        /* renamed from: b */
        public final int f26182b;

        /* renamed from: c */
        public final td f26183c;
        public final Object d;

        /* renamed from: f */
        public final int f26184f;

        /* renamed from: g */
        public final long f26185g;

        /* renamed from: h */
        public final long f26186h;

        /* renamed from: i */
        public final int f26187i;

        /* renamed from: j */
        public final int f26188j;

        public f(Object obj, int i2, td tdVar, Object obj2, int i3, long j2, long j3, int i4, int i5) {
            this.f26181a = obj;
            this.f26182b = i2;
            this.f26183c = tdVar;
            this.d = obj2;
            this.f26184f = i3;
            this.f26185g = j2;
            this.f26186h = j3;
            this.f26187i = i4;
            this.f26188j = i5;
        }

        public static f a(Bundle bundle) {
            return new f(null, bundle.getInt(a(0), -1), (td) p2.a(td.f27056h, bundle.getBundle(a(1))), null, bundle.getInt(a(2), -1), bundle.getLong(a(3), -9223372036854775807L), bundle.getLong(a(4), -9223372036854775807L), bundle.getInt(a(5), -1), bundle.getInt(a(6), -1));
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
            return this.f26182b == fVar.f26182b && this.f26184f == fVar.f26184f && this.f26185g == fVar.f26185g && this.f26186h == fVar.f26186h && this.f26187i == fVar.f26187i && this.f26188j == fVar.f26188j && Objects.equal(this.f26181a, fVar.f26181a) && Objects.equal(this.d, fVar.d) && Objects.equal(this.f26183c, fVar.f26183c);
        }

        public int hashCode() {
            return Objects.hashCode(this.f26181a, Integer.valueOf(this.f26182b), this.f26183c, this.d, Integer.valueOf(this.f26184f), Integer.valueOf(this.f26182b), Long.valueOf(this.f26185g), Long.valueOf(this.f26186h), Integer.valueOf(this.f26187i), Integer.valueOf(this.f26188j));
        }

        private static String a(int i2) {
            return Integer.toString(i2, 36);
        }
    }
}

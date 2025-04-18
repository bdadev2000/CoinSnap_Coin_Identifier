package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ChildHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Callback f20926a;
    public View e;
    public int d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Bucket f20927b = new Bucket();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f20928c = new ArrayList();

    /* loaded from: classes3.dex */
    public static class Bucket {

        /* renamed from: a, reason: collision with root package name */
        public long f20929a = 0;

        /* renamed from: b, reason: collision with root package name */
        public Bucket f20930b;

        public final void a(int i2) {
            if (i2 < 64) {
                this.f20929a &= ~(1 << i2);
                return;
            }
            Bucket bucket = this.f20930b;
            if (bucket != null) {
                bucket.a(i2 - 64);
            }
        }

        public final int b(int i2) {
            Bucket bucket = this.f20930b;
            if (bucket == null) {
                return i2 >= 64 ? Long.bitCount(this.f20929a) : Long.bitCount(this.f20929a & ((1 << i2) - 1));
            }
            if (i2 < 64) {
                return Long.bitCount(this.f20929a & ((1 << i2) - 1));
            }
            return Long.bitCount(this.f20929a) + bucket.b(i2 - 64);
        }

        public final void c() {
            if (this.f20930b == null) {
                this.f20930b = new Bucket();
            }
        }

        public final boolean d(int i2) {
            if (i2 < 64) {
                return (this.f20929a & (1 << i2)) != 0;
            }
            c();
            return this.f20930b.d(i2 - 64);
        }

        public final void e(int i2, boolean z2) {
            if (i2 >= 64) {
                c();
                this.f20930b.e(i2 - 64, z2);
                return;
            }
            long j2 = this.f20929a;
            boolean z3 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.f20929a = ((j2 & (~j3)) << 1) | (j2 & j3);
            if (z2) {
                h(i2);
            } else {
                a(i2);
            }
            if (z3 || this.f20930b != null) {
                c();
                this.f20930b.e(0, z3);
            }
        }

        public final boolean f(int i2) {
            if (i2 >= 64) {
                c();
                return this.f20930b.f(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.f20929a;
            boolean z2 = (j3 & j2) != 0;
            long j4 = j3 & (~j2);
            this.f20929a = j4;
            long j5 = j2 - 1;
            this.f20929a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
            Bucket bucket = this.f20930b;
            if (bucket != null) {
                if (bucket.d(0)) {
                    h(63);
                }
                this.f20930b.f(0);
            }
            return z2;
        }

        public final void g() {
            this.f20929a = 0L;
            Bucket bucket = this.f20930b;
            if (bucket != null) {
                bucket.g();
            }
        }

        public final void h(int i2) {
            if (i2 < 64) {
                this.f20929a |= 1 << i2;
            } else {
                c();
                this.f20930b.h(i2 - 64);
            }
        }

        public final String toString() {
            if (this.f20930b == null) {
                return Long.toBinaryString(this.f20929a);
            }
            return this.f20930b.toString() + "xx" + Long.toBinaryString(this.f20929a);
        }
    }

    /* loaded from: classes3.dex */
    public interface Callback {
        View a(int i2);

        void addView(View view, int i2);

        void b(View view);

        int c();

        RecyclerView.ViewHolder d(View view);

        void e(int i2);

        void f();

        int g(View view);

        void h(View view);

        void i(int i2);

        void j(View view, int i2, ViewGroup.LayoutParams layoutParams);
    }

    public ChildHelper(RecyclerView.AnonymousClass5 anonymousClass5) {
        this.f20926a = anonymousClass5;
    }

    public final void a(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        Callback callback = this.f20926a;
        int c2 = i2 < 0 ? callback.c() : d(i2);
        this.f20927b.e(c2, z2);
        if (z2) {
            this.f20928c.add(view);
            callback.b(view);
        }
        callback.j(view, c2, layoutParams);
    }

    public final View b(int i2) {
        return this.f20926a.a(d(i2));
    }

    public final int c() {
        return this.f20926a.c() - this.f20928c.size();
    }

    public final int d(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int c2 = this.f20926a.c();
        int i3 = i2;
        while (i3 < c2) {
            Bucket bucket = this.f20927b;
            int b2 = i2 - (i3 - bucket.b(i3));
            if (b2 == 0) {
                while (bucket.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += b2;
        }
        return -1;
    }

    public final int e(View view) {
        int g2 = this.f20926a.g(view);
        if (g2 == -1) {
            return -1;
        }
        Bucket bucket = this.f20927b;
        if (bucket.d(g2)) {
            return -1;
        }
        return g2 - bucket.b(g2);
    }

    public final boolean f(View view) {
        return this.f20928c.contains(view);
    }

    public final void g(int i2) {
        Callback callback = this.f20926a;
        int i3 = this.d;
        if (i3 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i3 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int d = d(i2);
            View a2 = callback.a(d);
            if (a2 == null) {
                this.d = 0;
                this.e = null;
                return;
            }
            this.d = 1;
            this.e = a2;
            if (this.f20927b.f(d)) {
                h(a2);
            }
            callback.i(d);
            this.d = 0;
            this.e = null;
        } catch (Throwable th) {
            this.d = 0;
            this.e = null;
            throw th;
        }
    }

    public final void h(View view) {
        if (this.f20928c.remove(view)) {
            this.f20926a.h(view);
        }
    }

    public final String toString() {
        return this.f20927b.toString() + ", hidden list:" + this.f20928c.size();
    }
}

package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
class ViewBoundsCheck {

    /* renamed from: a, reason: collision with root package name */
    public final Callback f21169a;

    /* renamed from: b, reason: collision with root package name */
    public final BoundFlags f21170b;

    /* loaded from: classes2.dex */
    public static class BoundFlags {

        /* renamed from: a, reason: collision with root package name */
        public int f21171a;

        /* renamed from: b, reason: collision with root package name */
        public int f21172b;

        /* renamed from: c, reason: collision with root package name */
        public int f21173c;
        public int d;
        public int e;

        public final boolean a() {
            int i2 = this.f21171a;
            int i3 = 2;
            if ((i2 & 7) != 0) {
                int i4 = this.d;
                int i5 = this.f21172b;
                if (((i4 > i5 ? 1 : i4 == i5 ? 2 : 4) & i2) == 0) {
                    return false;
                }
            }
            if ((i2 & 112) != 0) {
                int i6 = this.d;
                int i7 = this.f21173c;
                if ((((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4) & i2) == 0) {
                    return false;
                }
            }
            if ((i2 & 1792) != 0) {
                int i8 = this.e;
                int i9 = this.f21172b;
                if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 8) & i2) == 0) {
                    return false;
                }
            }
            if ((i2 & 28672) != 0) {
                int i10 = this.e;
                int i11 = this.f21173c;
                if (i10 > i11) {
                    i3 = 1;
                } else if (i10 != i11) {
                    i3 = 4;
                }
                if ((i2 & (i3 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface Callback {
        View a(int i2);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ViewBounds {
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags] */
    public ViewBoundsCheck(Callback callback) {
        this.f21169a = callback;
        ?? obj = new Object();
        obj.f21171a = 0;
        this.f21170b = obj;
    }

    public final View a(int i2, int i3, int i4, int i5) {
        Callback callback = this.f21169a;
        int c2 = callback.c();
        int d = callback.d();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View a2 = callback.a(i2);
            int b2 = callback.b(a2);
            int e = callback.e(a2);
            BoundFlags boundFlags = this.f21170b;
            boundFlags.f21172b = c2;
            boundFlags.f21173c = d;
            boundFlags.d = b2;
            boundFlags.e = e;
            if (i4 != 0) {
                boundFlags.f21171a = i4;
                if (boundFlags.a()) {
                    return a2;
                }
            }
            if (i5 != 0) {
                boundFlags.f21171a = i5;
                if (boundFlags.a()) {
                    view = a2;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public final boolean b(View view) {
        Callback callback = this.f21169a;
        int c2 = callback.c();
        int d = callback.d();
        int b2 = callback.b(view);
        int e = callback.e(view);
        BoundFlags boundFlags = this.f21170b;
        boundFlags.f21172b = c2;
        boundFlags.f21173c = d;
        boundFlags.d = b2;
        boundFlags.e = e;
        boundFlags.f21171a = 24579;
        return boundFlags.a();
    }
}

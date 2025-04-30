package com.applovin.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC0725m2;

/* loaded from: classes.dex */
public final class z4 implements InterfaceC0725m2 {

    /* renamed from: s */
    public static final z4 f12503s = new b().a("").a();

    /* renamed from: t */
    public static final InterfaceC0725m2.a f12504t = new C1(18);

    /* renamed from: a */
    public final CharSequence f12505a;
    public final Layout.Alignment b;

    /* renamed from: c */
    public final Layout.Alignment f12506c;

    /* renamed from: d */
    public final Bitmap f12507d;

    /* renamed from: f */
    public final float f12508f;

    /* renamed from: g */
    public final int f12509g;

    /* renamed from: h */
    public final int f12510h;

    /* renamed from: i */
    public final float f12511i;

    /* renamed from: j */
    public final int f12512j;

    /* renamed from: k */
    public final float f12513k;
    public final float l;
    public final boolean m;

    /* renamed from: n */
    public final int f12514n;

    /* renamed from: o */
    public final int f12515o;

    /* renamed from: p */
    public final float f12516p;

    /* renamed from: q */
    public final int f12517q;

    /* renamed from: r */
    public final float f12518r;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private CharSequence f12519a;
        private Bitmap b;

        /* renamed from: c */
        private Layout.Alignment f12520c;

        /* renamed from: d */
        private Layout.Alignment f12521d;

        /* renamed from: e */
        private float f12522e;

        /* renamed from: f */
        private int f12523f;

        /* renamed from: g */
        private int f12524g;

        /* renamed from: h */
        private float f12525h;

        /* renamed from: i */
        private int f12526i;

        /* renamed from: j */
        private int f12527j;

        /* renamed from: k */
        private float f12528k;
        private float l;
        private float m;

        /* renamed from: n */
        private boolean f12529n;

        /* renamed from: o */
        private int f12530o;

        /* renamed from: p */
        private int f12531p;

        /* renamed from: q */
        private float f12532q;

        public b() {
            this.f12519a = null;
            this.b = null;
            this.f12520c = null;
            this.f12521d = null;
            this.f12522e = -3.4028235E38f;
            this.f12523f = Integer.MIN_VALUE;
            this.f12524g = Integer.MIN_VALUE;
            this.f12525h = -3.4028235E38f;
            this.f12526i = Integer.MIN_VALUE;
            this.f12527j = Integer.MIN_VALUE;
            this.f12528k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.f12529n = false;
            this.f12530o = ViewCompat.MEASURED_STATE_MASK;
            this.f12531p = Integer.MIN_VALUE;
        }

        public b a(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        public b b() {
            this.f12529n = false;
            return this;
        }

        public int c() {
            return this.f12524g;
        }

        public int d() {
            return this.f12526i;
        }

        public CharSequence e() {
            return this.f12519a;
        }

        public b a(float f9) {
            this.m = f9;
            return this;
        }

        public b b(float f9) {
            this.f12525h = f9;
            return this;
        }

        public b c(float f9) {
            this.f12532q = f9;
            return this;
        }

        public b d(float f9) {
            this.l = f9;
            return this;
        }

        public b a(float f9, int i9) {
            this.f12522e = f9;
            this.f12523f = i9;
            return this;
        }

        public b b(int i9) {
            this.f12526i = i9;
            return this;
        }

        public b c(int i9) {
            this.f12531p = i9;
            return this;
        }

        public b d(int i9) {
            this.f12530o = i9;
            this.f12529n = true;
            return this;
        }

        public b b(Layout.Alignment alignment) {
            this.f12520c = alignment;
            return this;
        }

        public b a(int i9) {
            this.f12524g = i9;
            return this;
        }

        public b b(float f9, int i9) {
            this.f12528k = f9;
            this.f12527j = i9;
            return this;
        }

        public b a(Layout.Alignment alignment) {
            this.f12521d = alignment;
            return this;
        }

        public b a(CharSequence charSequence) {
            this.f12519a = charSequence;
            return this;
        }

        public z4 a() {
            return new z4(this.f12519a, this.f12520c, this.f12521d, this.b, this.f12522e, this.f12523f, this.f12524g, this.f12525h, this.f12526i, this.f12527j, this.f12528k, this.l, this.m, this.f12529n, this.f12530o, this.f12531p, this.f12532q);
        }

        private b(z4 z4Var) {
            this.f12519a = z4Var.f12505a;
            this.b = z4Var.f12507d;
            this.f12520c = z4Var.b;
            this.f12521d = z4Var.f12506c;
            this.f12522e = z4Var.f12508f;
            this.f12523f = z4Var.f12509g;
            this.f12524g = z4Var.f12510h;
            this.f12525h = z4Var.f12511i;
            this.f12526i = z4Var.f12512j;
            this.f12527j = z4Var.f12515o;
            this.f12528k = z4Var.f12516p;
            this.l = z4Var.f12513k;
            this.m = z4Var.l;
            this.f12529n = z4Var.m;
            this.f12530o = z4Var.f12514n;
            this.f12531p = z4Var.f12517q;
            this.f12532q = z4Var.f12518r;
        }

        public /* synthetic */ b(z4 z4Var, a aVar) {
            this(z4Var);
        }
    }

    private z4(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f9, int i9, int i10, float f10, int i11, int i12, float f11, float f12, float f13, boolean z8, int i13, int i14, float f14) {
        if (charSequence == null) {
            AbstractC0669a1.a(bitmap);
        } else {
            AbstractC0669a1.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f12505a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f12505a = charSequence.toString();
        } else {
            this.f12505a = null;
        }
        this.b = alignment;
        this.f12506c = alignment2;
        this.f12507d = bitmap;
        this.f12508f = f9;
        this.f12509g = i9;
        this.f12510h = i10;
        this.f12511i = f10;
        this.f12512j = i11;
        this.f12513k = f12;
        this.l = f13;
        this.m = z8;
        this.f12514n = i13;
        this.f12515o = i12;
        this.f12516p = f11;
        this.f12517q = i14;
        this.f12518r = f14;
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
    }

    public static /* synthetic */ z4 b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || z4.class != obj.getClass()) {
            return false;
        }
        z4 z4Var = (z4) obj;
        if (TextUtils.equals(this.f12505a, z4Var.f12505a) && this.b == z4Var.b && this.f12506c == z4Var.f12506c && ((bitmap = this.f12507d) != null ? !((bitmap2 = z4Var.f12507d) == null || !bitmap.sameAs(bitmap2)) : z4Var.f12507d == null) && this.f12508f == z4Var.f12508f && this.f12509g == z4Var.f12509g && this.f12510h == z4Var.f12510h && this.f12511i == z4Var.f12511i && this.f12512j == z4Var.f12512j && this.f12513k == z4Var.f12513k && this.l == z4Var.l && this.m == z4Var.m && this.f12514n == z4Var.f12514n && this.f12515o == z4Var.f12515o && this.f12516p == z4Var.f12516p && this.f12517q == z4Var.f12517q && this.f12518r == z4Var.f12518r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f12505a, this.b, this.f12506c, this.f12507d, Float.valueOf(this.f12508f), Integer.valueOf(this.f12509g), Integer.valueOf(this.f12510h), Float.valueOf(this.f12511i), Integer.valueOf(this.f12512j), Float.valueOf(this.f12513k), Float.valueOf(this.l), Boolean.valueOf(this.m), Integer.valueOf(this.f12514n), Integer.valueOf(this.f12515o), Float.valueOf(this.f12516p), Integer.valueOf(this.f12517q), Float.valueOf(this.f12518r));
    }

    public b a() {
        return new b();
    }

    public static final z4 a(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(a(0));
        if (charSequence != null) {
            bVar.a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(a(1));
        if (alignment != null) {
            bVar.b(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(a(2));
        if (alignment2 != null) {
            bVar.a(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(a(3));
        if (bitmap != null) {
            bVar.a(bitmap);
        }
        if (bundle.containsKey(a(4)) && bundle.containsKey(a(5))) {
            bVar.a(bundle.getFloat(a(4)), bundle.getInt(a(5)));
        }
        if (bundle.containsKey(a(6))) {
            bVar.a(bundle.getInt(a(6)));
        }
        if (bundle.containsKey(a(7))) {
            bVar.b(bundle.getFloat(a(7)));
        }
        if (bundle.containsKey(a(8))) {
            bVar.b(bundle.getInt(a(8)));
        }
        if (bundle.containsKey(a(10)) && bundle.containsKey(a(9))) {
            bVar.b(bundle.getFloat(a(10)), bundle.getInt(a(9)));
        }
        if (bundle.containsKey(a(11))) {
            bVar.d(bundle.getFloat(a(11)));
        }
        if (bundle.containsKey(a(12))) {
            bVar.a(bundle.getFloat(a(12)));
        }
        if (bundle.containsKey(a(13))) {
            bVar.d(bundle.getInt(a(13)));
        }
        if (!bundle.getBoolean(a(14), false)) {
            bVar.b();
        }
        if (bundle.containsKey(a(15))) {
            bVar.c(bundle.getInt(a(15)));
        }
        if (bundle.containsKey(a(16))) {
            bVar.c(bundle.getFloat(a(16)));
        }
        return bVar.a();
    }

    public /* synthetic */ z4(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f9, int i9, int i10, float f10, int i11, int i12, float f11, float f12, float f13, boolean z8, int i13, int i14, float f14, a aVar) {
        this(charSequence, alignment, alignment2, bitmap, f9, i9, i10, f10, i11, i12, f11, f12, f13, z8, i13, i14, f14);
    }
}

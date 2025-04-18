package com.applovin.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.o2;

/* loaded from: classes3.dex */
public final class b5 implements o2 {

    /* renamed from: s, reason: collision with root package name */
    public static final b5 f22988s = new b().a("").a();

    /* renamed from: t, reason: collision with root package name */
    public static final o2.a f22989t = new rs(5);

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f22990a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f22991b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f22992c;
    public final Bitmap d;

    /* renamed from: f, reason: collision with root package name */
    public final float f22993f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22994g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22995h;

    /* renamed from: i, reason: collision with root package name */
    public final float f22996i;

    /* renamed from: j, reason: collision with root package name */
    public final int f22997j;

    /* renamed from: k, reason: collision with root package name */
    public final float f22998k;

    /* renamed from: l, reason: collision with root package name */
    public final float f22999l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f23000m;

    /* renamed from: n, reason: collision with root package name */
    public final int f23001n;

    /* renamed from: o, reason: collision with root package name */
    public final int f23002o;

    /* renamed from: p, reason: collision with root package name */
    public final float f23003p;

    /* renamed from: q, reason: collision with root package name */
    public final int f23004q;

    /* renamed from: r, reason: collision with root package name */
    public final float f23005r;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f23006a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f23007b;

        /* renamed from: c, reason: collision with root package name */
        private Layout.Alignment f23008c;
        private Layout.Alignment d;
        private float e;

        /* renamed from: f, reason: collision with root package name */
        private int f23009f;

        /* renamed from: g, reason: collision with root package name */
        private int f23010g;

        /* renamed from: h, reason: collision with root package name */
        private float f23011h;

        /* renamed from: i, reason: collision with root package name */
        private int f23012i;

        /* renamed from: j, reason: collision with root package name */
        private int f23013j;

        /* renamed from: k, reason: collision with root package name */
        private float f23014k;

        /* renamed from: l, reason: collision with root package name */
        private float f23015l;

        /* renamed from: m, reason: collision with root package name */
        private float f23016m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f23017n;

        /* renamed from: o, reason: collision with root package name */
        private int f23018o;

        /* renamed from: p, reason: collision with root package name */
        private int f23019p;

        /* renamed from: q, reason: collision with root package name */
        private float f23020q;

        public b() {
            this.f23006a = null;
            this.f23007b = null;
            this.f23008c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f23009f = Integer.MIN_VALUE;
            this.f23010g = Integer.MIN_VALUE;
            this.f23011h = -3.4028235E38f;
            this.f23012i = Integer.MIN_VALUE;
            this.f23013j = Integer.MIN_VALUE;
            this.f23014k = -3.4028235E38f;
            this.f23015l = -3.4028235E38f;
            this.f23016m = -3.4028235E38f;
            this.f23017n = false;
            this.f23018o = -16777216;
            this.f23019p = Integer.MIN_VALUE;
        }

        public b a(float f2) {
            this.f23016m = f2;
            return this;
        }

        public b b() {
            this.f23017n = false;
            return this;
        }

        public int c() {
            return this.f23010g;
        }

        public int d() {
            return this.f23012i;
        }

        public CharSequence e() {
            return this.f23006a;
        }

        private b(b5 b5Var) {
            this.f23006a = b5Var.f22990a;
            this.f23007b = b5Var.d;
            this.f23008c = b5Var.f22991b;
            this.d = b5Var.f22992c;
            this.e = b5Var.f22993f;
            this.f23009f = b5Var.f22994g;
            this.f23010g = b5Var.f22995h;
            this.f23011h = b5Var.f22996i;
            this.f23012i = b5Var.f22997j;
            this.f23013j = b5Var.f23002o;
            this.f23014k = b5Var.f23003p;
            this.f23015l = b5Var.f22998k;
            this.f23016m = b5Var.f22999l;
            this.f23017n = b5Var.f23000m;
            this.f23018o = b5Var.f23001n;
            this.f23019p = b5Var.f23004q;
            this.f23020q = b5Var.f23005r;
        }

        public b a(float f2, int i2) {
            this.e = f2;
            this.f23009f = i2;
            return this;
        }

        public b b(float f2) {
            this.f23011h = f2;
            return this;
        }

        public b c(float f2) {
            this.f23020q = f2;
            return this;
        }

        public b d(float f2) {
            this.f23015l = f2;
            return this;
        }

        public b a(int i2) {
            this.f23010g = i2;
            return this;
        }

        public b b(float f2, int i2) {
            this.f23014k = f2;
            this.f23013j = i2;
            return this;
        }

        public b c(int i2) {
            this.f23019p = i2;
            return this;
        }

        public b d(int i2) {
            this.f23018o = i2;
            this.f23017n = true;
            return this;
        }

        public b a(Bitmap bitmap) {
            this.f23007b = bitmap;
            return this;
        }

        public b b(int i2) {
            this.f23012i = i2;
            return this;
        }

        public b a(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b b(Layout.Alignment alignment) {
            this.f23008c = alignment;
            return this;
        }

        public b a(CharSequence charSequence) {
            this.f23006a = charSequence;
            return this;
        }

        public b5 a() {
            return new b5(this.f23006a, this.f23008c, this.d, this.f23007b, this.e, this.f23009f, this.f23010g, this.f23011h, this.f23012i, this.f23013j, this.f23014k, this.f23015l, this.f23016m, this.f23017n, this.f23018o, this.f23019p, this.f23020q);
        }
    }

    private b5(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z2, int i6, int i7, float f7) {
        if (charSequence == null) {
            b1.a(bitmap);
        } else {
            b1.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f22990a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f22990a = charSequence.toString();
        } else {
            this.f22990a = null;
        }
        this.f22991b = alignment;
        this.f22992c = alignment2;
        this.d = bitmap;
        this.f22993f = f2;
        this.f22994g = i2;
        this.f22995h = i3;
        this.f22996i = f3;
        this.f22997j = i4;
        this.f22998k = f5;
        this.f22999l = f6;
        this.f23000m = z2;
        this.f23001n = i6;
        this.f23002o = i5;
        this.f23003p = f4;
        this.f23004q = i7;
        this.f23005r = f7;
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b5.class != obj.getClass()) {
            return false;
        }
        b5 b5Var = (b5) obj;
        return TextUtils.equals(this.f22990a, b5Var.f22990a) && this.f22991b == b5Var.f22991b && this.f22992c == b5Var.f22992c && ((bitmap = this.d) != null ? !((bitmap2 = b5Var.d) == null || !bitmap.sameAs(bitmap2)) : b5Var.d == null) && this.f22993f == b5Var.f22993f && this.f22994g == b5Var.f22994g && this.f22995h == b5Var.f22995h && this.f22996i == b5Var.f22996i && this.f22997j == b5Var.f22997j && this.f22998k == b5Var.f22998k && this.f22999l == b5Var.f22999l && this.f23000m == b5Var.f23000m && this.f23001n == b5Var.f23001n && this.f23002o == b5Var.f23002o && this.f23003p == b5Var.f23003p && this.f23004q == b5Var.f23004q && this.f23005r == b5Var.f23005r;
    }

    public int hashCode() {
        return Objects.hashCode(this.f22990a, this.f22991b, this.f22992c, this.d, Float.valueOf(this.f22993f), Integer.valueOf(this.f22994g), Integer.valueOf(this.f22995h), Float.valueOf(this.f22996i), Integer.valueOf(this.f22997j), Float.valueOf(this.f22998k), Float.valueOf(this.f22999l), Boolean.valueOf(this.f23000m), Integer.valueOf(this.f23001n), Integer.valueOf(this.f23002o), Float.valueOf(this.f23003p), Integer.valueOf(this.f23004q), Float.valueOf(this.f23005r));
    }

    public b a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b5 a(Bundle bundle) {
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
}

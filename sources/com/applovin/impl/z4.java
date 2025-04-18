package com.applovin.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class z4 implements m2 {

    /* renamed from: s */
    public static final z4 f9319s = new b().a("").a();

    /* renamed from: t */
    public static final m2.a f9320t = new lu(17);
    public final CharSequence a;

    /* renamed from: b */
    public final Layout.Alignment f9321b;

    /* renamed from: c */
    public final Layout.Alignment f9322c;

    /* renamed from: d */
    public final Bitmap f9323d;

    /* renamed from: f */
    public final float f9324f;

    /* renamed from: g */
    public final int f9325g;

    /* renamed from: h */
    public final int f9326h;

    /* renamed from: i */
    public final float f9327i;

    /* renamed from: j */
    public final int f9328j;

    /* renamed from: k */
    public final float f9329k;

    /* renamed from: l */
    public final float f9330l;

    /* renamed from: m */
    public final boolean f9331m;

    /* renamed from: n */
    public final int f9332n;

    /* renamed from: o */
    public final int f9333o;

    /* renamed from: p */
    public final float f9334p;

    /* renamed from: q */
    public final int f9335q;

    /* renamed from: r */
    public final float f9336r;

    /* loaded from: classes.dex */
    public static final class b {
        private CharSequence a;

        /* renamed from: b */
        private Bitmap f9337b;

        /* renamed from: c */
        private Layout.Alignment f9338c;

        /* renamed from: d */
        private Layout.Alignment f9339d;

        /* renamed from: e */
        private float f9340e;

        /* renamed from: f */
        private int f9341f;

        /* renamed from: g */
        private int f9342g;

        /* renamed from: h */
        private float f9343h;

        /* renamed from: i */
        private int f9344i;

        /* renamed from: j */
        private int f9345j;

        /* renamed from: k */
        private float f9346k;

        /* renamed from: l */
        private float f9347l;

        /* renamed from: m */
        private float f9348m;

        /* renamed from: n */
        private boolean f9349n;

        /* renamed from: o */
        private int f9350o;

        /* renamed from: p */
        private int f9351p;

        /* renamed from: q */
        private float f9352q;

        public b() {
            this.a = null;
            this.f9337b = null;
            this.f9338c = null;
            this.f9339d = null;
            this.f9340e = -3.4028235E38f;
            this.f9341f = Integer.MIN_VALUE;
            this.f9342g = Integer.MIN_VALUE;
            this.f9343h = -3.4028235E38f;
            this.f9344i = Integer.MIN_VALUE;
            this.f9345j = Integer.MIN_VALUE;
            this.f9346k = -3.4028235E38f;
            this.f9347l = -3.4028235E38f;
            this.f9348m = -3.4028235E38f;
            this.f9349n = false;
            this.f9350o = ViewCompat.MEASURED_STATE_MASK;
            this.f9351p = Integer.MIN_VALUE;
        }

        public b a(Bitmap bitmap) {
            this.f9337b = bitmap;
            return this;
        }

        public b b() {
            this.f9349n = false;
            return this;
        }

        public int c() {
            return this.f9342g;
        }

        public int d() {
            return this.f9344i;
        }

        public CharSequence e() {
            return this.a;
        }

        public b a(float f10) {
            this.f9348m = f10;
            return this;
        }

        public b b(float f10) {
            this.f9343h = f10;
            return this;
        }

        public b c(float f10) {
            this.f9352q = f10;
            return this;
        }

        public b d(float f10) {
            this.f9347l = f10;
            return this;
        }

        public b a(float f10, int i10) {
            this.f9340e = f10;
            this.f9341f = i10;
            return this;
        }

        public b b(int i10) {
            this.f9344i = i10;
            return this;
        }

        public b c(int i10) {
            this.f9351p = i10;
            return this;
        }

        public b d(int i10) {
            this.f9350o = i10;
            this.f9349n = true;
            return this;
        }

        public b b(Layout.Alignment alignment) {
            this.f9338c = alignment;
            return this;
        }

        public b a(int i10) {
            this.f9342g = i10;
            return this;
        }

        public b b(float f10, int i10) {
            this.f9346k = f10;
            this.f9345j = i10;
            return this;
        }

        public b a(Layout.Alignment alignment) {
            this.f9339d = alignment;
            return this;
        }

        public b a(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public z4 a() {
            return new z4(this.a, this.f9338c, this.f9339d, this.f9337b, this.f9340e, this.f9341f, this.f9342g, this.f9343h, this.f9344i, this.f9345j, this.f9346k, this.f9347l, this.f9348m, this.f9349n, this.f9350o, this.f9351p, this.f9352q);
        }

        private b(z4 z4Var) {
            this.a = z4Var.a;
            this.f9337b = z4Var.f9323d;
            this.f9338c = z4Var.f9321b;
            this.f9339d = z4Var.f9322c;
            this.f9340e = z4Var.f9324f;
            this.f9341f = z4Var.f9325g;
            this.f9342g = z4Var.f9326h;
            this.f9343h = z4Var.f9327i;
            this.f9344i = z4Var.f9328j;
            this.f9345j = z4Var.f9333o;
            this.f9346k = z4Var.f9334p;
            this.f9347l = z4Var.f9329k;
            this.f9348m = z4Var.f9330l;
            this.f9349n = z4Var.f9331m;
            this.f9350o = z4Var.f9332n;
            this.f9351p = z4Var.f9335q;
            this.f9352q = z4Var.f9336r;
        }

        public /* synthetic */ b(z4 z4Var, a aVar) {
            this(z4Var);
        }
    }

    private z4(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            a1.a(bitmap);
        } else {
            a1.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.f9321b = alignment;
        this.f9322c = alignment2;
        this.f9323d = bitmap;
        this.f9324f = f10;
        this.f9325g = i10;
        this.f9326h = i11;
        this.f9327i = f11;
        this.f9328j = i12;
        this.f9329k = f13;
        this.f9330l = f14;
        this.f9331m = z10;
        this.f9332n = i14;
        this.f9333o = i13;
        this.f9334p = f12;
        this.f9335q = i15;
        this.f9336r = f15;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
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
        if (TextUtils.equals(this.a, z4Var.a) && this.f9321b == z4Var.f9321b && this.f9322c == z4Var.f9322c && ((bitmap = this.f9323d) != null ? !((bitmap2 = z4Var.f9323d) == null || !bitmap.sameAs(bitmap2)) : z4Var.f9323d == null) && this.f9324f == z4Var.f9324f && this.f9325g == z4Var.f9325g && this.f9326h == z4Var.f9326h && this.f9327i == z4Var.f9327i && this.f9328j == z4Var.f9328j && this.f9329k == z4Var.f9329k && this.f9330l == z4Var.f9330l && this.f9331m == z4Var.f9331m && this.f9332n == z4Var.f9332n && this.f9333o == z4Var.f9333o && this.f9334p == z4Var.f9334p && this.f9335q == z4Var.f9335q && this.f9336r == z4Var.f9336r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.f9321b, this.f9322c, this.f9323d, Float.valueOf(this.f9324f), Integer.valueOf(this.f9325g), Integer.valueOf(this.f9326h), Float.valueOf(this.f9327i), Integer.valueOf(this.f9328j), Float.valueOf(this.f9329k), Float.valueOf(this.f9330l), Boolean.valueOf(this.f9331m), Integer.valueOf(this.f9332n), Integer.valueOf(this.f9333o), Float.valueOf(this.f9334p), Integer.valueOf(this.f9335q), Float.valueOf(this.f9336r));
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

    public /* synthetic */ z4(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, a aVar) {
        this(charSequence, alignment, alignment2, bitmap, f10, i10, i11, f11, i12, i13, f12, f13, f14, z10, i14, i15, f15);
    }
}

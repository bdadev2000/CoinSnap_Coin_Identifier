package androidx.compose.ui.graphics.vector;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import e0.w;
import java.util.ArrayList;
import java.util.List;
import p0.a;

@Immutable
/* loaded from: classes2.dex */
public final class ImageVector {

    /* renamed from: k, reason: collision with root package name */
    public static final Companion f15303k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static int f15304l;

    /* renamed from: a, reason: collision with root package name */
    public final String f15305a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15306b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15307c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final VectorGroup f15308f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15309g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15310h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15311i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15312j;

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final String f15313a;

        /* renamed from: b, reason: collision with root package name */
        public final float f15314b;

        /* renamed from: c, reason: collision with root package name */
        public final float f15315c;
        public final float d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final long f15316f;

        /* renamed from: g, reason: collision with root package name */
        public final int f15317g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f15318h;

        /* renamed from: i, reason: collision with root package name */
        public final ArrayList f15319i;

        /* renamed from: j, reason: collision with root package name */
        public final GroupParams f15320j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f15321k;

        /* loaded from: classes2.dex */
        public static final class GroupParams {

            /* renamed from: a, reason: collision with root package name */
            public final String f15322a;

            /* renamed from: b, reason: collision with root package name */
            public final float f15323b;

            /* renamed from: c, reason: collision with root package name */
            public final float f15324c;
            public final float d;
            public final float e;

            /* renamed from: f, reason: collision with root package name */
            public final float f15325f;

            /* renamed from: g, reason: collision with root package name */
            public final float f15326g;

            /* renamed from: h, reason: collision with root package name */
            public final float f15327h;

            /* renamed from: i, reason: collision with root package name */
            public final List f15328i;

            /* renamed from: j, reason: collision with root package name */
            public final List f15329j;

            public GroupParams(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, int i2) {
                str = (i2 & 1) != 0 ? "" : str;
                f2 = (i2 & 2) != 0 ? 0.0f : f2;
                f3 = (i2 & 4) != 0 ? 0.0f : f3;
                f4 = (i2 & 8) != 0 ? 0.0f : f4;
                f5 = (i2 & 16) != 0 ? 1.0f : f5;
                f6 = (i2 & 32) != 0 ? 1.0f : f6;
                f7 = (i2 & 64) != 0 ? 0.0f : f7;
                f8 = (i2 & 128) != 0 ? 0.0f : f8;
                if ((i2 & 256) != 0) {
                    int i3 = VectorKt.f15465a;
                    list = w.f30218a;
                }
                ArrayList arrayList = (i2 & 512) != 0 ? new ArrayList() : null;
                this.f15322a = str;
                this.f15323b = f2;
                this.f15324c = f3;
                this.d = f4;
                this.e = f5;
                this.f15325f = f6;
                this.f15326g = f7;
                this.f15327h = f8;
                this.f15328i = list;
                this.f15329j = arrayList;
            }
        }

        public Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, boolean z2, int i3) {
            String str2 = (i3 & 1) != 0 ? "" : str;
            long j3 = (i3 & 32) != 0 ? Color.f14962i : j2;
            int i4 = (i3 & 64) != 0 ? 5 : i2;
            boolean z3 = (i3 & 128) != 0 ? false : z2;
            this.f15313a = str2;
            this.f15314b = f2;
            this.f15315c = f3;
            this.d = f4;
            this.e = f5;
            this.f15316f = j3;
            this.f15317g = i4;
            this.f15318h = z3;
            ArrayList arrayList = new ArrayList();
            this.f15319i = arrayList;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            this.f15320j = groupParams;
            arrayList.add(groupParams);
        }

        public final void a(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list) {
            f();
            this.f15319i.add(new GroupParams(str, f2, f3, f4, f5, f6, f7, f8, list, 512));
        }

        public final void b(float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i2, int i3, int i4, Brush brush, Brush brush2, String str, List list) {
            f();
            ((GroupParams) this.f15319i.get(r1.size() - 1)).f15329j.add(new VectorPath(str, list, i2, brush, f2, brush2, f3, f4, i3, i4, f5, f6, f7, f8));
        }

        public final ImageVector d() {
            f();
            while (this.f15319i.size() > 1) {
                e();
            }
            String str = this.f15313a;
            float f2 = this.f15314b;
            float f3 = this.f15315c;
            float f4 = this.d;
            float f5 = this.e;
            GroupParams groupParams = this.f15320j;
            ImageVector imageVector = new ImageVector(str, f2, f3, f4, f5, new VectorGroup(groupParams.f15322a, groupParams.f15323b, groupParams.f15324c, groupParams.d, groupParams.e, groupParams.f15325f, groupParams.f15326g, groupParams.f15327h, groupParams.f15328i, groupParams.f15329j), this.f15316f, this.f15317g, this.f15318h);
            this.f15321k = true;
            return imageVector;
        }

        public final void e() {
            f();
            ArrayList arrayList = this.f15319i;
            GroupParams groupParams = (GroupParams) arrayList.remove(arrayList.size() - 1);
            ((GroupParams) arrayList.get(arrayList.size() - 1)).f15329j.add(new VectorGroup(groupParams.f15322a, groupParams.f15323b, groupParams.f15324c, groupParams.d, groupParams.e, groupParams.f15325f, groupParams.f15326g, groupParams.f15327h, groupParams.f15328i, groupParams.f15329j));
        }

        public final void f() {
            if (!this.f15321k) {
                return;
            }
            InlineClassHelperKt.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2, boolean z2) {
        int i3;
        synchronized (f15303k) {
            i3 = f15304l;
            f15304l = i3 + 1;
        }
        this.f15305a = str;
        this.f15306b = f2;
        this.f15307c = f3;
        this.d = f4;
        this.e = f5;
        this.f15308f = vectorGroup;
        this.f15309g = j2;
        this.f15310h = i2;
        this.f15311i = z2;
        this.f15312j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return a.g(this.f15305a, imageVector.f15305a) && Dp.a(this.f15306b, imageVector.f15306b) && Dp.a(this.f15307c, imageVector.f15307c) && this.d == imageVector.d && this.e == imageVector.e && a.g(this.f15308f, imageVector.f15308f) && Color.c(this.f15309g, imageVector.f15309g) && BlendMode.a(this.f15310h, imageVector.f15310h) && this.f15311i == imageVector.f15311i;
    }

    public final int hashCode() {
        int hashCode = (this.f15308f.hashCode() + d.b(this.e, d.b(this.d, d.b(this.f15307c, d.b(this.f15306b, this.f15305a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i2 = Color.f14963j;
        return Boolean.hashCode(this.f15311i) + d.c(this.f15310h, d.d(this.f15309g, hashCode, 31), 31);
    }
}

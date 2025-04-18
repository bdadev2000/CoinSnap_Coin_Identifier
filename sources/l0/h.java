package l0;

import android.content.res.TypedArray;
import androidx.core.view.ViewCompat;
import androidx.viewpager2.widget.ViewPager2;
import h4.k;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import k4.d0;
import k4.o;
import k4.y;
import k4.z;
import w4.m;

/* loaded from: classes.dex */
public abstract class h implements s3.d, z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21105b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21106c;

    public /* synthetic */ h(Object obj, int i10) {
        this.f21105b = i10;
        this.f21106c = obj;
    }

    @Override // s3.d
    public final List b() {
        return (List) this.f21106c;
    }

    @Override // k4.z
    public final y c(d0 d0Var) {
        return new k4.e((o) this.f21106c, 2);
    }

    public final com.facebook.shimmer.c d() {
        Object obj = this.f21106c;
        com.facebook.shimmer.c cVar = (com.facebook.shimmer.c) obj;
        int i10 = cVar.f11374f;
        int[] iArr = cVar.f11370b;
        if (i10 != 1) {
            int i11 = cVar.f11373e;
            iArr[0] = i11;
            int i12 = cVar.f11372d;
            iArr[1] = i12;
            iArr[2] = i12;
            iArr[3] = i11;
        } else {
            int i13 = cVar.f11372d;
            iArr[0] = i13;
            iArr[1] = i13;
            int i14 = cVar.f11373e;
            iArr[2] = i14;
            iArr[3] = i14;
        }
        com.facebook.shimmer.c cVar2 = (com.facebook.shimmer.c) obj;
        int i15 = cVar2.f11374f;
        float[] fArr = cVar2.a;
        if (i15 != 1) {
            fArr[0] = Math.max(((1.0f - cVar2.f11379k) - cVar2.f11380l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - cVar2.f11379k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((cVar2.f11379k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((cVar2.f11379k + 1.0f) + cVar2.f11380l) / 2.0f, 1.0f);
        } else {
            fArr[0] = 0.0f;
            fArr[1] = Math.min(cVar2.f11379k, 1.0f);
            fArr[2] = Math.min(cVar2.f11379k + cVar2.f11380l, 1.0f);
            fArr[3] = 1.0f;
        }
        return (com.facebook.shimmer.c) this.f21106c;
    }

    public h e(TypedArray typedArray) {
        if (typedArray.hasValue(3)) {
            ((com.facebook.shimmer.c) this.f21106c).f11382n = typedArray.getBoolean(3, ((com.facebook.shimmer.c) this.f21106c).f11382n);
        }
        if (typedArray.hasValue(0)) {
            ((com.facebook.shimmer.c) this.f21106c).f11383o = typedArray.getBoolean(0, ((com.facebook.shimmer.c) this.f21106c).f11383o);
        }
        if (typedArray.hasValue(1)) {
            int min = (int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f);
            com.facebook.shimmer.c cVar = (com.facebook.shimmer.c) this.f21106c;
            cVar.f11373e = (min << 24) | (cVar.f11373e & ViewCompat.MEASURED_SIZE_MASK);
        }
        if (typedArray.hasValue(11)) {
            int min2 = (int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f);
            com.facebook.shimmer.c cVar2 = (com.facebook.shimmer.c) this.f21106c;
            cVar2.f11372d = (min2 << 24) | (16777215 & cVar2.f11372d);
        }
        if (typedArray.hasValue(7)) {
            long j3 = typedArray.getInt(7, (int) ((com.facebook.shimmer.c) this.f21106c).f11387s);
            if (j3 >= 0) {
                ((com.facebook.shimmer.c) this.f21106c).f11387s = j3;
            } else {
                throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Given a negative duration: ", j3));
            }
        }
        if (typedArray.hasValue(14)) {
            ((com.facebook.shimmer.c) this.f21106c).f11385q = typedArray.getInt(14, ((com.facebook.shimmer.c) this.f21106c).f11385q);
        }
        if (typedArray.hasValue(15)) {
            long j10 = typedArray.getInt(15, (int) ((com.facebook.shimmer.c) this.f21106c).f11388t);
            if (j10 >= 0) {
                ((com.facebook.shimmer.c) this.f21106c).f11388t = j10;
            } else {
                throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Given a negative repeat delay: ", j10));
            }
        }
        if (typedArray.hasValue(16)) {
            ((com.facebook.shimmer.c) this.f21106c).f11386r = typedArray.getInt(16, ((com.facebook.shimmer.c) this.f21106c).f11386r);
        }
        if (typedArray.hasValue(5)) {
            int i10 = typedArray.getInt(5, ((com.facebook.shimmer.c) this.f21106c).f11371c);
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        ((com.facebook.shimmer.c) this.f21106c).f11371c = 0;
                    } else {
                        ((com.facebook.shimmer.c) this.f21106c).f11371c = 3;
                    }
                } else {
                    ((com.facebook.shimmer.c) this.f21106c).f11371c = 2;
                }
            } else {
                ((com.facebook.shimmer.c) this.f21106c).f11371c = 1;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, ((com.facebook.shimmer.c) this.f21106c).f11374f) != 1) {
                ((com.facebook.shimmer.c) this.f21106c).f11374f = 0;
            } else {
                ((com.facebook.shimmer.c) this.f21106c).f11374f = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            float f10 = typedArray.getFloat(6, ((com.facebook.shimmer.c) this.f21106c).f11380l);
            if (f10 >= 0.0f) {
                ((com.facebook.shimmer.c) this.f21106c).f11380l = f10;
            } else {
                throw new IllegalArgumentException("Given invalid dropoff value: " + f10);
            }
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, ((com.facebook.shimmer.c) this.f21106c).f11375g);
            if (dimensionPixelSize >= 0) {
                ((com.facebook.shimmer.c) this.f21106c).f11375g = dimensionPixelSize;
            } else {
                throw new IllegalArgumentException(eb.j.i("Given invalid width: ", dimensionPixelSize));
            }
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, ((com.facebook.shimmer.c) this.f21106c).f11376h);
            if (dimensionPixelSize2 >= 0) {
                ((com.facebook.shimmer.c) this.f21106c).f11376h = dimensionPixelSize2;
            } else {
                throw new IllegalArgumentException(eb.j.i("Given invalid height: ", dimensionPixelSize2));
            }
        }
        if (typedArray.hasValue(13)) {
            float f11 = typedArray.getFloat(13, ((com.facebook.shimmer.c) this.f21106c).f11379k);
            if (f11 >= 0.0f) {
                ((com.facebook.shimmer.c) this.f21106c).f11379k = f11;
            } else {
                throw new IllegalArgumentException("Given invalid intensity value: " + f11);
            }
        }
        if (typedArray.hasValue(19)) {
            float f12 = typedArray.getFloat(19, ((com.facebook.shimmer.c) this.f21106c).f11377i);
            if (f12 >= 0.0f) {
                ((com.facebook.shimmer.c) this.f21106c).f11377i = f12;
            } else {
                throw new IllegalArgumentException("Given invalid width ratio: " + f12);
            }
        }
        if (typedArray.hasValue(10)) {
            float f13 = typedArray.getFloat(10, ((com.facebook.shimmer.c) this.f21106c).f11378j);
            if (f13 >= 0.0f) {
                ((com.facebook.shimmer.c) this.f21106c).f11378j = f13;
            } else {
                throw new IllegalArgumentException("Given invalid height ratio: " + f13);
            }
        }
        if (typedArray.hasValue(18)) {
            ((com.facebook.shimmer.c) this.f21106c).f11381m = typedArray.getFloat(18, ((com.facebook.shimmer.c) this.f21106c).f11381m);
        }
        return (com.facebook.shimmer.b) this;
    }

    public abstract k f();

    public abstract boolean g();

    public final k h() {
        k kVar = (k) ((Queue) this.f21106c).poll();
        if (kVar == null) {
            return f();
        }
        return kVar;
    }

    public final boolean i(CharSequence charSequence, int i10) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            g gVar = (g) this.f21106c;
            if (gVar == null) {
                return g();
            }
            int a = gVar.a(charSequence, i10);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return g();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    @Override // s3.d
    public final boolean isStatic() {
        if (((List) this.f21106c).isEmpty()) {
            return true;
        }
        return ((List) this.f21106c).size() == 1 && ((z3.a) ((List) this.f21106c).get(0)).c();
    }

    public final void j(k kVar) {
        if (((Queue) this.f21106c).size() < 20) {
            ((Queue) this.f21106c).offer(kVar);
        }
    }

    public String toString() {
        switch (this.f21105b) {
            case 3:
                StringBuilder sb2 = new StringBuilder();
                if (!((List) this.f21106c).isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(((List) this.f21106c).toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public h(int i10) {
        this.f21105b = i10;
        if (i10 == 4) {
            char[] cArr = m.a;
            this.f21106c = new ArrayDeque(20);
        } else if (i10 != 6) {
            this.f21106c = e3.c.AD_INIT;
        } else {
            this.f21106c = new com.facebook.shimmer.c();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ViewPager2 viewPager2) {
        this(viewPager2, 1);
        this.f21105b = 1;
    }
}

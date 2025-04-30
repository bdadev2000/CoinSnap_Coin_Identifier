package B1;

import Q1.i;
import Q7.n0;
import T1.A;
import T1.C0297c;
import T1.D;
import T1.u;
import T1.v;
import android.content.res.TypedArray;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import b1.h;
import com.mbridge.msdk.foundation.entity.o;
import j2.n;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f implements e, v {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f273c;

    public /* synthetic */ f(int i9, boolean z8) {
        this.b = i9;
    }

    public void d(Bundle bundle) {
        bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, k());
    }

    public abstract void e(h hVar);

    public com.facebook.shimmer.c f() {
        com.facebook.shimmer.c cVar = (com.facebook.shimmer.c) this.f273c;
        int i9 = cVar.f13825f;
        int[] iArr = cVar.b;
        if (i9 != 1) {
            int i10 = cVar.f13824e;
            iArr[0] = i10;
            int i11 = cVar.f13823d;
            iArr[1] = i11;
            iArr[2] = i11;
            iArr[3] = i10;
        } else {
            int i12 = cVar.f13823d;
            iArr[0] = i12;
            iArr[1] = i12;
            int i13 = cVar.f13824e;
            iArr[2] = i13;
            iArr[3] = i13;
        }
        float[] fArr = cVar.f13821a;
        if (i9 != 1) {
            fArr[0] = Math.max(((1.0f - cVar.f13830k) - cVar.l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - cVar.f13830k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((cVar.f13830k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((cVar.f13830k + 1.0f) + cVar.l) / 2.0f, 1.0f);
        } else {
            fArr[0] = 0.0f;
            fArr[1] = Math.min(cVar.f13830k, 1.0f);
            fArr[2] = Math.min(cVar.f13830k + cVar.l, 1.0f);
            fArr[3] = 1.0f;
        }
        return cVar;
    }

    public f h(TypedArray typedArray) {
        boolean hasValue = typedArray.hasValue(3);
        com.facebook.shimmer.c cVar = (com.facebook.shimmer.c) this.f273c;
        if (hasValue) {
            cVar.f13831n = typedArray.getBoolean(3, cVar.f13831n);
        }
        if (typedArray.hasValue(0)) {
            cVar.f13832o = typedArray.getBoolean(0, cVar.f13832o);
        }
        if (typedArray.hasValue(1)) {
            cVar.f13824e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (cVar.f13824e & ViewCompat.MEASURED_SIZE_MASK);
        }
        if (typedArray.hasValue(11)) {
            cVar.f13823d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (cVar.f13823d & ViewCompat.MEASURED_SIZE_MASK);
        }
        if (typedArray.hasValue(7)) {
            long j7 = typedArray.getInt(7, (int) cVar.f13836s);
            if (j7 >= 0) {
                cVar.f13836s = j7;
            } else {
                throw new IllegalArgumentException(n0.g(j7, "Given a negative duration: "));
            }
        }
        if (typedArray.hasValue(14)) {
            cVar.f13834q = typedArray.getInt(14, cVar.f13834q);
        }
        if (typedArray.hasValue(15)) {
            long j9 = typedArray.getInt(15, (int) cVar.f13837t);
            if (j9 >= 0) {
                cVar.f13837t = j9;
            } else {
                throw new IllegalArgumentException(n0.g(j9, "Given a negative repeat delay: "));
            }
        }
        if (typedArray.hasValue(16)) {
            cVar.f13835r = typedArray.getInt(16, cVar.f13835r);
        }
        if (typedArray.hasValue(5)) {
            int i9 = typedArray.getInt(5, cVar.f13822c);
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        cVar.f13822c = 0;
                    } else {
                        cVar.f13822c = 3;
                    }
                } else {
                    cVar.f13822c = 2;
                }
            } else {
                cVar.f13822c = 1;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, cVar.f13825f) != 1) {
                cVar.f13825f = 0;
            } else {
                cVar.f13825f = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            float f9 = typedArray.getFloat(6, cVar.l);
            if (f9 >= 0.0f) {
                cVar.l = f9;
            } else {
                throw new IllegalArgumentException("Given invalid dropoff value: " + f9);
            }
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, cVar.f13826g);
            if (dimensionPixelSize >= 0) {
                cVar.f13826g = dimensionPixelSize;
            } else {
                throw new IllegalArgumentException(o.h(dimensionPixelSize, "Given invalid width: "));
            }
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, cVar.f13827h);
            if (dimensionPixelSize2 >= 0) {
                cVar.f13827h = dimensionPixelSize2;
            } else {
                throw new IllegalArgumentException(o.h(dimensionPixelSize2, "Given invalid height: "));
            }
        }
        if (typedArray.hasValue(13)) {
            float f10 = typedArray.getFloat(13, cVar.f13830k);
            if (f10 >= 0.0f) {
                cVar.f13830k = f10;
            } else {
                throw new IllegalArgumentException("Given invalid intensity value: " + f10);
            }
        }
        if (typedArray.hasValue(19)) {
            float f11 = typedArray.getFloat(19, cVar.f13828i);
            if (f11 >= 0.0f) {
                cVar.f13828i = f11;
            } else {
                throw new IllegalArgumentException("Given invalid width ratio: " + f11);
            }
        }
        if (typedArray.hasValue(10)) {
            float f12 = typedArray.getFloat(10, cVar.f13829j);
            if (f12 >= 0.0f) {
                cVar.f13829j = f12;
            } else {
                throw new IllegalArgumentException("Given invalid height ratio: " + f12);
            }
        }
        if (typedArray.hasValue(18)) {
            cVar.m = typedArray.getFloat(18, cVar.m);
        }
        return l();
    }

    @Override // T1.v
    public u i(A a6) {
        return new C0297c((D) this.f273c, 2);
    }

    @Override // B1.e
    public List j() {
        return (List) this.f273c;
    }

    public abstract String k();

    public abstract f l();

    public void m(i iVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f273c;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(iVar);
        }
    }

    @Override // B1.e
    public boolean o() {
        List list = (List) this.f273c;
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() == 1 && ((I1.a) list.get(0)).c()) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.b) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f273c;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f(Object obj, int i9) {
        this.b = i9;
        this.f273c = obj;
    }

    public f(int i9) {
        this.b = i9;
        switch (i9) {
            case 4:
                this.f273c = new com.facebook.shimmer.c();
                return;
            default:
                char[] cArr = n.f21025a;
                this.f273c = new ArrayDeque(20);
                return;
        }
    }
}

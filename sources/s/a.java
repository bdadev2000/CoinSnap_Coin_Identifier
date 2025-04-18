package s;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import h.o0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a implements ad.e {
    public /* synthetic */ a() {
    }

    public static int a(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    public final void b(int i10) {
        new Handler(Looper.getMainLooper()).post(new f0.m(i10, 0, this));
    }

    @Override // ad.e
    public cd.b c(String str, ad.a aVar, int i10, int i11, Map map) {
        if (!str.isEmpty()) {
            if (i10 >= 0 && i11 >= 0) {
                int k10 = k();
                if (map != null) {
                    ad.b bVar = ad.b.MARGIN;
                    if (map.containsKey(bVar)) {
                        k10 = Integer.parseInt(map.get(bVar).toString());
                    }
                }
                boolean[] h10 = h(str);
                int length = h10.length;
                int i12 = k10 + length;
                int max = Math.max(i10, i12);
                int max2 = Math.max(1, i11);
                int i13 = max / i12;
                int i14 = (max - (length * i13)) / 2;
                cd.b bVar2 = new cd.b(max, max2);
                int i15 = 0;
                while (i15 < length) {
                    if (h10[i15]) {
                        bVar2.c(i14, 0, i13, max2);
                    }
                    i15++;
                    i14 += i13;
                }
                return bVar2;
            }
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public final void d(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new o0(1, this, typeface));
    }

    public abstract boolean e(i iVar, e eVar, e eVar2);

    public abstract boolean f(i iVar, Object obj, Object obj2);

    public abstract boolean g(i iVar, h hVar, h hVar2);

    public abstract boolean[] h(String str);

    public abstract Method i(Class cls, Field field);

    public abstract Constructor j(Class cls);

    public int k() {
        return 10;
    }

    public abstract String[] l(Class cls);

    public abstract boolean m(Class cls);

    public abstract void n(int i10);

    public abstract void o(Typeface typeface);

    public abstract void p(h hVar, h hVar2);

    public abstract void q(h hVar, Thread thread);

    public /* synthetic */ a(int i10) {
    }

    public /* synthetic */ a(Object obj) {
    }

    public a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a aVar) {
    }
}

package k0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.recyclerview.widget.s0;
import g0.l;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.k;

/* loaded from: classes.dex */
public abstract class g {
    public static final r.f a = new r.f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f20201b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f20202c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f20203d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f20201b = threadPoolExecutor;
        f20202c = new Object();
        f20203d = new k();
    }

    public static f a(String str, Context context, c cVar, int i10) {
        int i11;
        r.f fVar = a;
        Typeface typeface = (Typeface) fVar.get(str);
        if (typeface != null) {
            return new f(typeface);
        }
        try {
            s0 p10 = d6.g.p(context, cVar);
            int i12 = p10.f2031b;
            int i13 = 1;
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = -2;
                }
                i11 = -3;
            } else {
                h[] hVarArr = (h[]) p10.f2032c;
                if (hVarArr != null && hVarArr.length != 0) {
                    for (h hVar : hVarArr) {
                        int i14 = hVar.f20207e;
                        if (i14 != 0) {
                            if (i14 >= 0) {
                                i11 = i14;
                            }
                            i11 = -3;
                        }
                    }
                    i13 = 0;
                }
                i11 = i13;
            }
            if (i11 != 0) {
                return new f(i11);
            }
            Typeface w10 = l.a.w(context, (h[]) p10.f2032c, i10);
            if (w10 != null) {
                fVar.put(str, w10);
                return new f(w10);
            }
            return new f(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        }
    }
}

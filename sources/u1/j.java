package u1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import s.m;

/* loaded from: classes.dex */
public abstract class j {
    public static final m a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f25439b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static y5.f f25440c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return h.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static y5.f b(int i10, boolean z10, boolean z11) {
        y5.f fVar = new y5.f();
        f25440c = fVar;
        a.h(fVar);
        return f25440c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        r3 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009c, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.j.c(android.content.Context, boolean):void");
    }
}

package qc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j0 {
    public static final j0 a = new j0();

    /* renamed from: b, reason: collision with root package name */
    public static final y7.u f23825b;

    static {
        xb.d dVar = new xb.d();
        v5.b.f26032d.b(dVar);
        dVar.f27622d = true;
        y7.u uVar = new y7.u(dVar);
        Intrinsics.checkNotNullExpressionValue(uVar, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f23825b = uVar;
    }

    public static b a(va.g firebaseApp) {
        String valueOf;
        String str;
        Object obj;
        boolean z10;
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        firebaseApp.a();
        Context context = firebaseApp.a;
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(com.bytedance.sdk.component.adexpress.vc.a.f(packageInfo));
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        firebaseApp.a();
        String str2 = firebaseApp.f26389c.f26406b;
        Intrinsics.checkNotNullExpressionValue(str2, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str = valueOf;
        } else {
            str = str3;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        firebaseApp.a();
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext");
        Intrinsics.checkNotNullParameter(context, "context");
        int myPid = Process.myPid();
        Iterator it = w5.d.b(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((u) obj).f23879b == myPid) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        u uVar = (u) obj;
        if (uVar == null) {
            uVar = new u(myPid, 0, w5.d.e(), false);
        }
        firebaseApp.a();
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext");
        return new b(str2, MODEL, RELEASE, new a(packageName, str, valueOf, MANUFACTURER, uVar, w5.d.b(context)));
    }
}

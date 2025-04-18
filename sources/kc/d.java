package kc;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;
import kotlinx.coroutines.DebugKt;
import n0.h;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements db.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20643d;

    public /* synthetic */ d(String str, Object obj, int i10) {
        this.f20641b = i10;
        this.f20642c = str;
        this.f20643d = obj;
    }

    @Override // db.d
    public final Object c(ob.c cVar) {
        String a;
        int i10 = this.f20641b;
        String str = this.f20642c;
        Object obj = this.f20643d;
        switch (i10) {
            case 0:
                Context context = (Context) cVar.b(Context.class);
                switch (((h) ((e) obj)).f22278b) {
                    case 14:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            a = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        a = "";
                        break;
                    case 15:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            a = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        a = "";
                        break;
                    case 16:
                        int i11 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            a = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            a = "watch";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            a = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                            break;
                        } else {
                            if (i11 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                a = "embedded";
                                break;
                            }
                            a = "";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            a = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        a = "";
                        break;
                }
                return new a(str, a);
            default:
                db.a aVar = (db.a) obj;
                try {
                    Trace.beginSection(str);
                    return aVar.f16943f.c(cVar);
                } finally {
                    Trace.endSection();
                }
        }
    }
}

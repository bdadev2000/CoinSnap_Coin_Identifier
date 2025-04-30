package c5;

import a5.C0397a;
import com.google.firebase.perf.v1.ApplicationInfo;

/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0608a extends AbstractC0612e {
    public static final C0397a b = C0397a.d();

    /* renamed from: a, reason: collision with root package name */
    public final ApplicationInfo f5414a;

    public C0608a(ApplicationInfo applicationInfo) {
        this.f5414a = applicationInfo;
    }

    @Override // c5.AbstractC0612e
    public final boolean a() {
        C0397a c0397a = b;
        ApplicationInfo applicationInfo = this.f5414a;
        if (applicationInfo == null) {
            c0397a.f("ApplicationInfo is null");
        } else if (!applicationInfo.hasGoogleAppId()) {
            c0397a.f("GoogleAppId is null");
        } else if (!applicationInfo.hasAppInstanceId()) {
            c0397a.f("AppInstanceId is null");
        } else if (!applicationInfo.hasApplicationProcessState()) {
            c0397a.f("ApplicationProcessState is null");
        } else if (applicationInfo.hasAndroidAppInfo()) {
            if (!applicationInfo.getAndroidAppInfo().hasPackageName()) {
                c0397a.f("AndroidAppInfo.packageName is null");
            } else if (!applicationInfo.getAndroidAppInfo().hasSdkVersion()) {
                c0397a.f("AndroidAppInfo.sdkVersion is null");
            } else {
                return true;
            }
        } else {
            return true;
        }
        c0397a.f("ApplicationInfo is invalid");
        return false;
    }
}

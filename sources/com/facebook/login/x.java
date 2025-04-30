package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13785c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f13786a;
    public final com.bumptech.glide.f b;

    static {
        Executors.newSingleThreadScheduledExecutor();
    }

    public x(Context context, String str) {
        G7.j.e(str, "applicationId");
        this.f13786a = str;
        this.b = new com.bumptech.glide.f(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                packageManager.getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}

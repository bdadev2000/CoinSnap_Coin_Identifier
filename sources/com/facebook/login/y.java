package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11314c = 0;
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.appevents.r f11315b;

    static {
        new ni.a();
        Executors.newSingleThreadScheduledExecutor();
    }

    public y(Context context, String applicationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.a = applicationId;
        this.f11315b = new com.facebook.appevents.r(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                packageManager.getPackageInfo(FbValidationUtils.FB_PACKAGE, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}

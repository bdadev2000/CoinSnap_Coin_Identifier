package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class g implements AppLovinCommunicatorPublisher {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29652a = "BrandSafetyReporter";

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f29653b = Executors.newSingleThreadExecutor();

    /* renamed from: c, reason: collision with root package name */
    private static g f29654c = null;

    private g() {
        d();
    }

    public static g a() {
        if (f29654c == null) {
            f29654c = new g();
        }
        return f29654c;
    }

    private void d() {
        com.safedk.android.analytics.b bVar = new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.g.1
            @Override // com.safedk.android.analytics.b
            public void a(String str, Bundle bundle) {
                Logger.d(g.f29652a, "Response received, response=" + bundle.toString());
            }
        };
        AppLovinBridge.registerListener(AppLovinBridge.f29083c, bVar);
        AppLovinBridge.registerListener(AppLovinBridge.d, bVar);
    }

    public static void a(final Bundle bundle) {
        Logger.d(f29652a, "report image uploaded to server started");
        try {
            f29653b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle != null) {
                            if (bundle.size() > 0) {
                                Logger.d(g.f29652a, "Starting image upload report event.");
                                AppLovinBridge.reportImageUploadEvent(bundle, g.f29654c);
                                String string = bundle.getString("image_id");
                                c h2 = b.h(string);
                                if (h2 != null) {
                                    for (l lVar : h2.g()) {
                                        if (string.contains(lVar.f29739a)) {
                                            g.b(lVar, h2.f29382p);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        Logger.d(g.f29652a, "Data argument is null, which means that the upload failed or that the validation check has failed. Nothing to report to the server.");
                    } catch (Throwable th) {
                        Logger.e(g.f29652a, "Caught exception while creating json data", th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(f29652a, "failed during reportImageUploadedToServer. data: " + bundle.toString(), th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(l lVar, BrandSafetyUtils.AdType adType) {
        if (lVar != null) {
            a a2 = SafeDK.getInstance().a(adType);
            if (a2 != null) {
                Logger.d(f29652a, "Executing image cleanup request");
                a2.b(lVar);
            } else {
                Logger.d(f29652a, "Upload: finder not found for image cleanup request");
            }
        }
    }

    public static void b(final Bundle bundle) {
        try {
            f29653b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle != null) {
                            if (bundle.size() > 0) {
                                Logger.d(g.f29652a, "Starting url resolution report event.");
                                AppLovinBridge.reportClickUrlResolvedEvent(bundle, g.f29654c);
                            }
                        } else {
                            Logger.d(g.f29652a, "Data argument is null, which means reporting a resolved click url is not possible. ");
                        }
                    } catch (Throwable th) {
                        Logger.e(g.f29652a, "Caught exception while creating json data", th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(f29652a, "failed during reportImageUploadedToServer. data: " + bundle.toString(), th);
            new CrashReporter().caughtException(th);
        }
    }

    public String b() {
        return AppLovinBridge.f29081a;
    }
}

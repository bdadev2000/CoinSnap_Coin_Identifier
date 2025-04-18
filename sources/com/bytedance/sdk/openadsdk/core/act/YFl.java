package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import b.c;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.pDU;
import java.util.ArrayList;
import java.util.List;
import o.a;
import o.h;
import o.s;
import o.t;

/* loaded from: classes.dex */
public class YFl {
    private static volatile boolean AlY = false;
    private static int Sg = -1;
    private static String YFl = null;
    private static int tN = -1;

    /* renamed from: vc, reason: collision with root package name */
    private static ActServiceConnection f10668vc;
    private static Boolean wN;

    private YFl() {
    }

    public static int Sg(Context context) {
        return !TextUtils.isEmpty(YFl(context)) ? 1 : 0;
    }

    public static int tN() {
        return tN;
    }

    public static int Sg() {
        return Sg;
    }

    public static String YFl(final Context context) {
        String str = YFl;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                YFl = null;
            } else if (!TextUtils.isEmpty(str2) && !YFl(context, intent) && arrayList.contains(str2)) {
                YFl = str2;
            } else {
                YFl = (String) arrayList.get(0);
            }
            if (!TextUtils.isEmpty(YFl)) {
                synchronized (YFl.class) {
                    if (!AlY) {
                        Sg sg2 = new Sg() { // from class: com.bytedance.sdk.openadsdk.core.act.YFl.1
                            @Override // com.bytedance.sdk.openadsdk.core.act.Sg
                            public void YFl(final h hVar) {
                                pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.YFl.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        boolean z10;
                                        try {
                                            a aVar = new a();
                                            t tVar = new t() { // from class: com.bytedance.sdk.openadsdk.core.act.YFl.1.1.1
                                                @Override // o.t
                                                public void onGreatestScrollPercentageIncreased(int i10, @NonNull Bundle bundle) {
                                                }

                                                @Override // o.t
                                                public void onSessionEnded(boolean z11, @NonNull Bundle bundle) {
                                                }

                                                @Override // o.t
                                                public void onVerticalScrollEvent(boolean z11, @NonNull Bundle bundle) {
                                                }
                                            };
                                            s c10 = hVar.c(aVar);
                                            boolean z11 = false;
                                            if (c10 != null) {
                                                try {
                                                    z10 = ((c) c10.f22950b).d(c10.f22951c, c10.a(Bundle.EMPTY));
                                                } catch (SecurityException e2) {
                                                    throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                int unused = YFl.Sg = 1;
                                                boolean c11 = c10.c(tVar, Bundle.EMPTY);
                                                if (c11) {
                                                    int unused2 = YFl.tN = 1;
                                                }
                                                z11 = c11;
                                            } else {
                                                int unused3 = YFl.Sg = 0;
                                            }
                                            if (!z10 || !z11) {
                                                Boolean unused4 = YFl.wN = Boolean.FALSE;
                                            } else {
                                                Boolean unused5 = YFl.wN = Boolean.TRUE;
                                            }
                                        } catch (Throwable th2) {
                                            YoT.YFl("CustomTabsHelper", th2.getMessage());
                                        }
                                        ActServiceConnection actServiceConnection = YFl.f10668vc;
                                        if (YFl.AlY && actServiceConnection != null) {
                                            try {
                                                context.unbindService(actServiceConnection);
                                            } catch (Throwable unused6) {
                                            }
                                        }
                                    }
                                });
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.act.Sg
                            public void YFl() {
                                ActServiceConnection unused = YFl.f10668vc = null;
                            }
                        };
                        if (f10668vc == null) {
                            f10668vc = new ActServiceConnection(sg2);
                        }
                        h.a(context, YFl, f10668vc);
                        AlY = true;
                    }
                }
            }
        } catch (Throwable th2) {
            YoT.YFl("CustomTabsHelper", th2.getMessage());
        }
        return YFl;
    }

    public static void Sg(int i10) {
        tN = i10;
    }

    private static boolean YFl(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (queryIntentActivities.size() == 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            IntentFilter intentFilter = resolveInfo.filter;
            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                return true;
            }
        }
        return false;
    }

    public static int YFl() {
        Boolean bool = wN;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void YFl(int i10) {
        Sg = i10;
    }
}

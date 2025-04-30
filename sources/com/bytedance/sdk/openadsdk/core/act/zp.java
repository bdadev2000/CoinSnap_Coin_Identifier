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
import c.C0578b;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.utils.QUv;
import java.util.ArrayList;
import java.util.List;
import u.AbstractC2736e;
import u.C2744m;
import u.InterfaceC2745n;

/* loaded from: classes.dex */
public class zp {
    private static Boolean COT = null;
    private static ActServiceConnection HWF = null;
    private static int KS = -1;
    private static volatile boolean jU = false;
    private static int lMd = -1;
    private static String zp;

    private zp() {
    }

    public static int lMd(Context context) {
        return !TextUtils.isEmpty(zp(context)) ? 1 : 0;
    }

    public static int KS() {
        return KS;
    }

    public static int lMd() {
        return lMd;
    }

    public static String zp(final Context context) {
        String str = zp;
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
                zp = null;
            } else if (!TextUtils.isEmpty(str2) && !zp(context, intent) && arrayList.contains(str2)) {
                zp = str2;
            } else {
                zp = (String) arrayList.get(0);
            }
            if (!TextUtils.isEmpty(zp)) {
                synchronized (zp.class) {
                    try {
                        if (!jU) {
                            lMd lmd = new lMd() { // from class: com.bytedance.sdk.openadsdk.core.act.zp.1
                                @Override // com.bytedance.sdk.openadsdk.core.act.lMd
                                public void zp(final AbstractC2736e abstractC2736e) {
                                    QUv.jU().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.zp.1.1
                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r0v3, types: [u.a, java.lang.Object] */
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            boolean z8;
                                            try {
                                                ?? obj = new Object();
                                                InterfaceC2745n interfaceC2745n = new InterfaceC2745n() { // from class: com.bytedance.sdk.openadsdk.core.act.zp.1.1.1
                                                    @Override // u.InterfaceC2745n
                                                    public void onGreatestScrollPercentageIncreased(int i9, @NonNull Bundle bundle) {
                                                    }

                                                    @Override // u.InterfaceC2745n
                                                    public void onSessionEnded(boolean z9, @NonNull Bundle bundle) {
                                                    }

                                                    @Override // u.InterfaceC2745n
                                                    public void onVerticalScrollEvent(boolean z9, @NonNull Bundle bundle) {
                                                    }
                                                };
                                                C2744m b = abstractC2736e.b(obj);
                                                boolean z9 = false;
                                                if (b != null) {
                                                    try {
                                                        z8 = ((C0578b) b.b).b(b.f23054c, Bundle.EMPTY);
                                                    } catch (SecurityException e4) {
                                                        throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e4);
                                                    }
                                                } else {
                                                    z8 = false;
                                                }
                                                if (z8) {
                                                    int unused = zp.lMd = 1;
                                                    boolean b8 = b.b(interfaceC2745n, Bundle.EMPTY);
                                                    if (b8) {
                                                        int unused2 = zp.KS = 1;
                                                    }
                                                    z9 = b8;
                                                } else {
                                                    int unused3 = zp.lMd = 0;
                                                }
                                                if (!z8 || !z9) {
                                                    Boolean unused4 = zp.COT = Boolean.FALSE;
                                                } else {
                                                    Boolean unused5 = zp.COT = Boolean.TRUE;
                                                }
                                            } catch (Throwable th) {
                                                tG.zp("CustomTabsHelper", th.getMessage());
                                            }
                                            ActServiceConnection actServiceConnection = zp.HWF;
                                            if (zp.jU && actServiceConnection != null) {
                                                try {
                                                    context.unbindService(actServiceConnection);
                                                } catch (Throwable unused6) {
                                                }
                                            }
                                        }
                                    });
                                }

                                @Override // com.bytedance.sdk.openadsdk.core.act.lMd
                                public void zp() {
                                    ActServiceConnection unused = zp.HWF = null;
                                }
                            };
                            if (HWF == null) {
                                HWF = new ActServiceConnection(lmd);
                            }
                            AbstractC2736e.a(context, zp, HWF);
                            jU = true;
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th) {
            tG.zp("CustomTabsHelper", th.getMessage());
        }
        return zp;
    }

    public static void lMd(int i9) {
        KS = i9;
    }

    private static boolean zp(Context context, Intent intent) {
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

    public static int zp() {
        Boolean bool = COT;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void zp(int i9) {
        lMd = i9;
    }
}

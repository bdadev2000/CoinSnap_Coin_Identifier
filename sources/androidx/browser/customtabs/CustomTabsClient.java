package androidx.browser.customtabs;

import a.b;
import a.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class CustomTabsClient {

    /* renamed from: a, reason: collision with root package name */
    public final f f1333a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f1334b;

    public CustomTabsClient(f fVar, ComponentName componentName) {
        this.f1333a = fVar;
        this.f1334b = componentName;
    }

    public static boolean a(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public static void b(Context context, String str) {
        if (str == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        try {
            a(applicationContext, str, new CustomTabsServiceConnection() { // from class: androidx.browser.customtabs.CustomTabsClient.1
                @Override // androidx.browser.customtabs.CustomTabsServiceConnection
                public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                    try {
                        customTabsClient.f1333a.E(0L);
                    } catch (RemoteException unused) {
                    }
                    applicationContext.unbindService(this);
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                }
            });
        } catch (SecurityException unused) {
        }
    }

    public static String c(Context context, List list, boolean z2) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z2 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final CustomTabsSession d(final CustomTabsCallback customTabsCallback) {
        b bVar = new b() { // from class: androidx.browser.customtabs.CustomTabsClient.2

            /* renamed from: b, reason: collision with root package name */
            public final Handler f1336b;

            {
                attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
                this.f1336b = new Handler(Looper.getMainLooper());
            }

            @Override // a.c
            public final void L(final int i2, final Bundle bundle) {
                if (CustomTabsCallback.this == null) {
                    return;
                }
                this.f1336b.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomTabsCallback.this.onNavigationEvent(i2, bundle);
                    }
                });
            }

            @Override // a.c
            public final void N(final String str, final Bundle bundle) {
                if (CustomTabsCallback.this == null) {
                    return;
                }
                this.f1336b.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomTabsCallback.this.onPostMessage(str, bundle);
                    }
                });
            }

            @Override // a.c
            public final void O(final Bundle bundle) {
                if (CustomTabsCallback.this == null) {
                    return;
                }
                this.f1336b.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomTabsCallback.this.onMessageChannelReady(bundle);
                    }
                });
            }

            @Override // a.c
            public final void P(final int i2, final Uri uri, final boolean z2, final Bundle bundle) {
                if (CustomTabsCallback.this == null) {
                    return;
                }
                this.f1336b.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomTabsCallback.this.onRelationshipValidationResult(i2, uri, z2, bundle);
                    }
                });
            }

            @Override // a.c
            public final Bundle i(String str, Bundle bundle) {
                CustomTabsCallback customTabsCallback2 = CustomTabsCallback.this;
                if (customTabsCallback2 == null) {
                    return null;
                }
                return customTabsCallback2.extraCallbackWithResult(str, bundle);
            }

            @Override // a.c
            public final void n(final String str, final Bundle bundle) {
                if (CustomTabsCallback.this == null) {
                    return;
                }
                this.f1336b.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomTabsCallback.this.extraCallback(str, bundle);
                    }
                });
            }
        };
        f fVar = this.f1333a;
        try {
            if (fVar.D(bVar)) {
                return new CustomTabsSession(fVar, bVar, this.f1334b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}

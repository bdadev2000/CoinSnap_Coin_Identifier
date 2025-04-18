package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class CustomTabPrefetchHelper extends CustomTabsServiceConnection {

    @Nullable
    private static CustomTabsClient client;

    @Nullable
    private static CustomTabsSession session;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final ReentrantLock lock = new ReentrantLock();

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void prepareSession() {
            CustomTabsClient customTabsClient;
            CustomTabPrefetchHelper.lock.lock();
            if (CustomTabPrefetchHelper.session == null && (customTabsClient = CustomTabPrefetchHelper.client) != null) {
                CustomTabPrefetchHelper.session = customTabsClient.d(null);
            }
            CustomTabPrefetchHelper.lock.unlock();
        }

        @Nullable
        public final CustomTabsSession getPreparedSessionOnce() {
            CustomTabPrefetchHelper.lock.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.session;
            CustomTabPrefetchHelper.session = null;
            CustomTabPrefetchHelper.lock.unlock();
            return customTabsSession;
        }

        public final void mayLaunchUrl(@NotNull Uri uri) {
            p0.a.s(uri, "url");
            prepareSession();
            CustomTabPrefetchHelper.lock.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.session;
            if (customTabsSession != null) {
                try {
                    customTabsSession.f1359b.K(customTabsSession.f1360c, uri, customTabsSession.a(), null);
                } catch (RemoteException unused) {
                }
            }
            CustomTabPrefetchHelper.lock.unlock();
        }
    }

    @Nullable
    public static final CustomTabsSession getPreparedSessionOnce() {
        return Companion.getPreparedSessionOnce();
    }

    public static final void mayLaunchUrl(@NotNull Uri uri) {
        Companion.mayLaunchUrl(uri);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(@NotNull ComponentName componentName, @NotNull CustomTabsClient customTabsClient) {
        p0.a.s(componentName, "name");
        p0.a.s(customTabsClient, "newClient");
        try {
            customTabsClient.f1333a.E(0L);
        } catch (RemoteException unused) {
        }
        client = customTabsClient;
        Companion.prepareSession();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        p0.a.s(componentName, "componentName");
    }
}

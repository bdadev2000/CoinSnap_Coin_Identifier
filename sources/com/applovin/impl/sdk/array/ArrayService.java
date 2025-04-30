package com.applovin.impl.sdk.array;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback;
import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.AbstractC0734p;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.x3;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ArrayService extends IAppHubDirectDownloadServiceCallback.Stub {
    private static final int MAX_RECONNECT_RETRY_COUNT = 3;
    private static final String SERVICE_INTENT_CLASS_NAME = "com.applovin.oem.am.android.external.AppHubService";
    private static final String SERVICE_INTENT_FILTER_ACTION = "com.applovin.am.intent.action.APPHUB_SERVICE";
    private static final String TAG = "ArrayService";

    @Nullable
    private String appHubPackageName;

    @Nullable
    private IAppHubService appHubService;

    @Nullable
    private final Intent appHubServiceIntent;
    private long appHubVersionCode = -1;

    @Nullable
    private DirectDownloadState currentDownloadState;
    private int currentRetryCount;
    private final ArrayDataCollector dataCollector;

    @Nullable
    private Boolean isDirectDownloadEnabled;
    private final t logger;

    @Nullable
    private String randomUserToken;
    private final k sdk;

    /* loaded from: classes.dex */
    public interface DirectDownloadListener {
        void onAppDetailsDismissed();

        void onAppDetailsDisplayed();

        void onFailure();
    }

    /* loaded from: classes.dex */
    public static class DirectDownloadState {
        private final String adToken;
        private final AtomicBoolean errorCallbackInvoked = new AtomicBoolean();
        private final DirectDownloadListener listener;

        @Nullable
        private final Bundle parameters;

        public DirectDownloadState(String str, @Nullable Bundle bundle, DirectDownloadListener directDownloadListener) {
            this.adToken = str;
            this.parameters = bundle;
            this.listener = directDownloadListener;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof DirectDownloadState;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DirectDownloadState)) {
                return false;
            }
            DirectDownloadState directDownloadState = (DirectDownloadState) obj;
            if (!directDownloadState.canEqual(this)) {
                return false;
            }
            AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
            AtomicBoolean errorCallbackInvoked2 = directDownloadState.getErrorCallbackInvoked();
            if (errorCallbackInvoked != null ? !errorCallbackInvoked.equals(errorCallbackInvoked2) : errorCallbackInvoked2 != null) {
                return false;
            }
            String adToken = getAdToken();
            String adToken2 = directDownloadState.getAdToken();
            if (adToken != null ? !adToken.equals(adToken2) : adToken2 != null) {
                return false;
            }
            Bundle parameters = getParameters();
            Bundle parameters2 = directDownloadState.getParameters();
            if (parameters != null ? !parameters.equals(parameters2) : parameters2 != null) {
                return false;
            }
            DirectDownloadListener listener = getListener();
            DirectDownloadListener listener2 = directDownloadState.getListener();
            if (listener != null ? listener.equals(listener2) : listener2 == null) {
                return true;
            }
            return false;
        }

        public String getAdToken() {
            return this.adToken;
        }

        public AtomicBoolean getErrorCallbackInvoked() {
            return this.errorCallbackInvoked;
        }

        public DirectDownloadListener getListener() {
            return this.listener;
        }

        @Nullable
        public Bundle getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
            int i9 = 43;
            if (errorCallbackInvoked == null) {
                hashCode = 43;
            } else {
                hashCode = errorCallbackInvoked.hashCode();
            }
            String adToken = getAdToken();
            int i10 = (hashCode + 59) * 59;
            if (adToken == null) {
                hashCode2 = 43;
            } else {
                hashCode2 = adToken.hashCode();
            }
            int i11 = i10 + hashCode2;
            Bundle parameters = getParameters();
            int i12 = i11 * 59;
            if (parameters == null) {
                hashCode3 = 43;
            } else {
                hashCode3 = parameters.hashCode();
            }
            int i13 = i12 + hashCode3;
            DirectDownloadListener listener = getListener();
            int i14 = i13 * 59;
            if (listener != null) {
                i9 = listener.hashCode();
            }
            return i14 + i9;
        }

        public String toString() {
            return "ArrayService.DirectDownloadState(errorCallbackInvoked=" + getErrorCallbackInvoked() + ", adToken=" + getAdToken() + ", parameters=" + getParameters() + ", listener=" + getListener() + ")";
        }
    }

    public ArrayService(k kVar) {
        this.sdk = kVar;
        this.logger = kVar.L();
        this.dataCollector = new ArrayDataCollector(kVar);
        Intent createAppHubServiceIntent = createAppHubServiceIntent();
        this.appHubServiceIntent = createAppHubServiceIntent;
        if (createAppHubServiceIntent != null) {
            bindAppHubService();
        }
        kVar.e().a(new AbstractC0734p() { // from class: com.applovin.impl.sdk.array.ArrayService.1
            @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                DirectDownloadState directDownloadState = ArrayService.this.currentDownloadState;
                if (ArrayService.this.appHubService != null && directDownloadState != null) {
                    try {
                        t unused = ArrayService.this.logger;
                        if (t.a()) {
                            ArrayService.this.logger.a(ArrayService.TAG, "Dismissing Direct Download Activity");
                        }
                        ArrayService.this.appHubService.dismissDirectDownloadAppDetails(directDownloadState.adToken);
                        directDownloadState.listener.onAppDetailsDismissed();
                        ArrayService.this.currentDownloadState = null;
                    } catch (RemoteException e4) {
                        t unused2 = ArrayService.this.logger;
                        if (t.a()) {
                            ArrayService.this.logger.a(ArrayService.TAG, "Failed dismiss Direct Download Activity", e4);
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindAppHubService() {
        if (this.currentRetryCount > 3) {
            if (t.a()) {
                this.logger.k(TAG, "Exceeded maximum retry count");
                return;
            }
            return;
        }
        if (t.a()) {
            this.logger.a(TAG, "Attempting connection to App Hub service...");
        }
        int i9 = 1;
        this.currentRetryCount++;
        try {
            if (x3.c()) {
                i9 = 513;
            }
            if (!k.k().bindService(this.appHubServiceIntent, new ServiceConnection() { // from class: com.applovin.impl.sdk.array.ArrayService.2
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    t unused = ArrayService.this.logger;
                    if (t.a()) {
                        ArrayService.this.logger.a(ArrayService.TAG, "Connection successful: " + componentName);
                    }
                    ArrayService.this.appHubService = IAppHubService.Stub.asInterface(iBinder);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    t unused = ArrayService.this.logger;
                    if (t.a()) {
                        ArrayService.this.logger.b(ArrayService.TAG, "Service disconnected: " + componentName);
                    }
                    ArrayService.this.appHubService = null;
                    t unused2 = ArrayService.this.logger;
                    if (t.a()) {
                        ArrayService.this.logger.b(ArrayService.TAG, "Retrying...");
                    }
                    ArrayService.this.bindAppHubService();
                }
            }, i9) && t.a()) {
                this.logger.k(TAG, "App Hub not available");
            }
        } catch (Throwable th) {
            if (t.a()) {
                this.logger.a(TAG, "Failed to bind to service", th);
            }
        }
    }

    @Nullable
    private Intent createAppHubServiceIntent() {
        Intent intent = new Intent(SERVICE_INTENT_FILTER_ACTION);
        List<ResolveInfo> queryIntentServices = k.k().getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            String str = queryIntentServices.get(0).serviceInfo.packageName;
            this.appHubPackageName = str;
            intent.setClassName(str, SERVICE_INTENT_CLASS_NAME);
            return intent;
        }
        if (t.a()) {
            this.logger.k(TAG, "App Hub not available");
            return null;
        }
        return null;
    }

    public void collectAppHubData() {
        if (!isAppHubInstalled()) {
            return;
        }
        if (t.a()) {
            this.logger.a(TAG, "Collecting data...");
        }
        if (this.isDirectDownloadEnabled == null && ((Boolean) this.sdk.a(oj.f9735c0)).booleanValue()) {
            this.isDirectDownloadEnabled = this.dataCollector.collectDirectDownloadEnabled(this.appHubService);
        }
        if (this.appHubVersionCode == -1 && ((Boolean) this.sdk.a(oj.f9727b0)).booleanValue()) {
            this.appHubVersionCode = this.dataCollector.collectAppHubVersionCode(this.appHubService);
        }
        if (TextUtils.isEmpty(this.randomUserToken) && ((Boolean) this.sdk.a(oj.f9743d0)).booleanValue()) {
            this.randomUserToken = this.dataCollector.collectRandomUserToken(this.appHubService);
        }
    }

    @Nullable
    public String getAppHubPackageName() {
        return this.appHubPackageName;
    }

    public long getAppHubVersionCode() {
        return this.appHubVersionCode;
    }

    @Nullable
    public Boolean getIsDirectDownloadEnabled() {
        return this.isDirectDownloadEnabled;
    }

    @Nullable
    public String getRandomUserToken() {
        return this.randomUserToken;
    }

    public boolean isAppHubInstalled() {
        if (this.appHubService != null) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsDismissed(String str) {
        if (t.a()) {
            this.logger.a(TAG, "App details dismissed");
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null) {
            return;
        }
        directDownloadState.listener.onAppDetailsDismissed();
        this.currentDownloadState = null;
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsShown(String str) {
        if (t.a()) {
            this.logger.a(TAG, "App details shown");
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null) {
            return;
        }
        directDownloadState.listener.onAppDetailsDisplayed();
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onDownloadStarted(String str) {
        if (t.a()) {
            this.logger.a(TAG, "Download started");
        }
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onError(String str, String str2) {
        if (t.a()) {
            this.logger.b(TAG, "Encountered error: " + str2);
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState != null && directDownloadState.errorCallbackInvoked.compareAndSet(false, true)) {
            directDownloadState.listener.onFailure();
            this.currentDownloadState = null;
        }
    }

    public void startDirectInstallOrDownloadProcess(ArrayDirectDownloadAd arrayDirectDownloadAd, @Nullable Bundle bundle, DirectDownloadListener directDownloadListener) {
        if (this.appHubService == null) {
            if (t.a()) {
                this.logger.b(TAG, "Cannot begin Direct Install / Download process - service disconnected");
            }
            directDownloadListener.onFailure();
            return;
        }
        if (!arrayDirectDownloadAd.isDirectDownloadEnabled()) {
            if (t.a()) {
                this.logger.b(TAG, "Cannot begin Direct Install / Download process - missing token");
            }
            directDownloadListener.onFailure();
            return;
        }
        try {
            Bundle directDownloadParameters = arrayDirectDownloadAd.getDirectDownloadParameters();
            if (bundle != null) {
                directDownloadParameters.putAll(bundle);
            }
            this.currentDownloadState = new DirectDownloadState(arrayDirectDownloadAd.getDirectDownloadToken(), directDownloadParameters, directDownloadListener);
            if (t.a()) {
                this.logger.a(TAG, "Starting Direct Download Activity");
            }
            if (this.appHubVersionCode >= 21) {
                this.appHubService.showDirectDownloadAppDetailsWithExtra(this.currentDownloadState.adToken, this.currentDownloadState.parameters, this);
            } else {
                this.appHubService.showDirectDownloadAppDetails(this.currentDownloadState.adToken, this);
            }
            if (t.a()) {
                this.logger.a(TAG, "Activity started");
            }
        } catch (Throwable th) {
            if (t.a()) {
                this.logger.a(TAG, "Failed to execute Direct Install / Download process", th);
            }
            this.sdk.B().a(TAG, "directInstallDownload", th);
            this.currentDownloadState = null;
            directDownloadListener.onFailure();
        }
    }
}

package androidx.core.content.res;

import android.adservices.topics.GetTopicsRequest;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.DispatchQueue;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.room.InvalidationTracker;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.MultiInstanceInvalidationClient$callback$1;
import androidx.room.TransactionExecutor;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.p9;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.NativeCrashReporter;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.q;
import com.applovin.mediation.adapters.AppLovinAdapterAdViewListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.facebook.AccessToken;
import com.facebook.AccessTokenManager;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.ProgressOutputStream;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.SessionEventsState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18525c;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.f18523a = i2;
        this.f18524b = obj;
        this.f18525c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18523a) {
            case 0:
                ((ResourcesCompat.FontCallback) this.f18524b).onFontRetrieved((Typeface) this.f18525c);
                return;
            case 1:
                FragmentStrictMode.Policy policy = (FragmentStrictMode.Policy) this.f18524b;
                Violation violation = (Violation) this.f18525c;
                FragmentStrictMode.Policy policy2 = FragmentStrictMode.f19901a;
                p0.a.s(policy, "$policy");
                p0.a.s(violation, "$violation");
                policy.f19912b.a();
                return;
            case 2:
                String str = (String) this.f18524b;
                Violation violation2 = (Violation) this.f18525c;
                FragmentStrictMode.Policy policy3 = FragmentStrictMode.f19901a;
                p0.a.s(violation2, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation2);
                throw violation2;
            case 3:
                DispatchQueue dispatchQueue = (DispatchQueue) this.f18524b;
                Runnable runnable = (Runnable) this.f18525c;
                p0.a.s(dispatchQueue, "this$0");
                p0.a.s(runnable, "$runnable");
                if (!dispatchQueue.d.offer(runnable)) {
                    throw new IllegalStateException("cannot enqueue any more runnables".toString());
                }
                dispatchQueue.a();
                return;
            case 4:
                ProfileInstallerInitializer.a((ProfileInstallerInitializer) this.f18524b, (Context) this.f18525c);
                return;
            case 5:
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = (MultiInstanceInvalidationClient) this.f18524b;
                String[] strArr = (String[]) this.f18525c;
                int i2 = MultiInstanceInvalidationClient$callback$1.f21307b;
                p0.a.s(multiInstanceInvalidationClient, "this$0");
                p0.a.s(strArr, "$tables");
                InvalidationTracker invalidationTracker = multiInstanceInvalidationClient.f21297b;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                invalidationTracker.getClass();
                p0.a.s(strArr2, "tables");
                synchronized (invalidationTracker.f21283k) {
                    Iterator it = invalidationTracker.f21283k.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        p0.a.r(entry, "(observer, wrapper)");
                        InvalidationTracker.Observer observer = (InvalidationTracker.Observer) entry.getKey();
                        InvalidationTracker.ObserverWrapper observerWrapper = (InvalidationTracker.ObserverWrapper) entry.getValue();
                        observer.getClass();
                        if (!(observer instanceof MultiInstanceInvalidationClient.AnonymousClass1)) {
                            observerWrapper.b(strArr2);
                        }
                    }
                }
                return;
            case 6:
                Runnable runnable2 = (Runnable) this.f18524b;
                TransactionExecutor transactionExecutor = (TransactionExecutor) this.f18525c;
                p0.a.s(runnable2, "$command");
                p0.a.s(transactionExecutor, "this$0");
                try {
                    runnable2.run();
                    return;
                } finally {
                    transactionExecutor.a();
                }
            case 7:
                AppLovinFullscreenActivity.a((AppLovinFullscreenActivity) this.f18524b, (Long) this.f18525c);
                return;
            case 8:
                ((com.applovin.impl.adview.a) this.f18524b).a((AppLovinAd) this.f18525c);
                return;
            case 9:
                ((com.applovin.impl.adview.a) this.f18524b).b((WebView) this.f18525c);
                return;
            case 10:
                ((com.applovin.impl.adview.a) this.f18524b).b((MotionEvent) this.f18525c);
                return;
            case 11:
                ((AppLovinAdServiceImpl) this.f18524b).a((p9) this.f18525c);
                return;
            case 12:
                NativeCrashReporter.a((NativeCrashReporter) this.f18524b, (e.b) this.f18525c);
                return;
            case 13:
                ((i) this.f18524b).a((Activity) this.f18525c);
                return;
            case 14:
                ((i) this.f18524b).a((String) this.f18525c);
                return;
            case 15:
                ((j) this.f18524b).a((AppLovinSdkInitializationConfiguration) this.f18525c);
                return;
            case 16:
                ((k) this.f18524b).b((AppLovinBidTokenCollectionListener) this.f18525c);
                return;
            case 17:
                m.b((m) this.f18524b, (Long) this.f18525c);
                return;
            case 18:
                com.applovin.impl.sdk.nativeAd.b.e((com.applovin.impl.sdk.nativeAd.b) this.f18524b, (AppLovinNativeAdImpl) this.f18525c);
                return;
            case 19:
                ((q) this.f18524b).a((List) this.f18525c);
                return;
            case 20:
                ((q) this.f18524b).a((String) this.f18525c);
                return;
            case 21:
                ((q) this.f18524b).a((GetTopicsRequest) this.f18525c);
                return;
            case 22:
                ((ImageView) this.f18524b).setImageBitmap((Bitmap) this.f18525c);
                return;
            case 23:
                AppLovinAdapterAdViewListener.a((AppLovinAdapterAdViewListener) this.f18524b, (AppLovinAd) this.f18525c);
                return;
            case 24:
                AccessTokenManager.a((AccessTokenManager) this.f18524b, (AccessToken.AccessTokenRefreshCallback) this.f18525c);
                return;
            case 25:
                FacebookSdk.f((Context) this.f18524b, (String) this.f18525c);
                return;
            case 26:
                GraphRequest.Companion.b((ArrayList) this.f18524b, (GraphRequestBatch) this.f18525c);
                return;
            case 27:
                ProgressOutputStream.a((GraphRequestBatch.Callback) this.f18524b, (ProgressOutputStream) this.f18525c);
                return;
            case 28:
                AppEventQueue.f((AccessTokenAppIdPair) this.f18524b, (SessionEventsState) this.f18525c);
                return;
            default:
                AppEventQueue.c((AccessTokenAppIdPair) this.f18524b, (AppEvent) this.f18525c);
                return;
        }
    }
}

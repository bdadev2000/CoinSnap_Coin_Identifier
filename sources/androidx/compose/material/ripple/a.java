package androidx.compose.material.ripple;

import android.os.Build;
import android.os.Bundle;
import android.view.autofill.AutofillId;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransition;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.exoplayer2.ui.b;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.facebook.appevents.suggestedevents.ViewObserver;
import com.facebook.bolts.CancellationTokenSource;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import com.facebook.internal.FacebookWebFallbackDialog;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.FileLruCache;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.widget.ToolTipPopup;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.motion.MaterialBackOrchestrator;
import e0.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7484b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f7483a = i2;
        this.f7484b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IntObjectMap intObjectMap;
        int[] iArr;
        long[] jArr;
        int i2;
        IntObjectMap intObjectMap2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        ContentCaptureSessionCompat contentCaptureSessionCompat;
        int i4;
        ContentCaptureSessionCompat contentCaptureSessionCompat2;
        int i5;
        int i6 = 0;
        switch (this.f7483a) {
            case 0:
                RippleHostView.a((RippleHostView) this.f7484b);
                return;
            case 1:
                AndroidContentCaptureManager androidContentCaptureManager = (AndroidContentCaptureManager) this.f7484b;
                if (androidContentCaptureManager.d()) {
                    AndroidComposeView androidComposeView = androidContentCaptureManager.f14742a;
                    androidComposeView.a(true);
                    androidContentCaptureManager.l(androidComposeView.getSemanticsOwner().a(), androidContentCaptureManager.f14755p);
                    androidContentCaptureManager.k(androidComposeView.getSemanticsOwner().a(), androidContentCaptureManager.f14755p);
                    IntObjectMap b2 = androidContentCaptureManager.b();
                    int[] iArr3 = b2.f1440b;
                    long[] jArr3 = b2.f1439a;
                    int length = jArr3.length - 2;
                    MutableIntObjectMap mutableIntObjectMap = androidContentCaptureManager.f14754o;
                    int i7 = 8;
                    long j2 = -9187201950435737472L;
                    if (length >= 0) {
                        while (true) {
                            long j3 = jArr3[i6];
                            if ((((~j3) << 7) & j3 & j2) != j2) {
                                int i8 = 8 - ((~(i6 - length)) >>> 31);
                                int i9 = 0;
                                while (i9 < i8) {
                                    if ((j3 & 255) < 128) {
                                        int i10 = iArr3[(i6 << 3) + i9];
                                        SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) mutableIntObjectMap.c(i10);
                                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) b2.c(i10);
                                        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.f16596a : null;
                                        if (semanticsNode == null) {
                                            InlineClassHelperKt.c("no value for specified key");
                                            throw null;
                                        }
                                        int i11 = semanticsNode.f16823g;
                                        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
                                        intObjectMap2 = b2;
                                        if (semanticsNodeCopy == null) {
                                            Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsConfiguration.iterator();
                                            while (it.hasNext()) {
                                                SemanticsPropertyKey<?> key = it.next().getKey();
                                                int[] iArr4 = iArr3;
                                                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16851v;
                                                if (p0.a.g(key, semanticsPropertyKey)) {
                                                    Object obj = semanticsConfiguration.f16815a.get(semanticsPropertyKey);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    List list = (List) obj;
                                                    String valueOf = String.valueOf(list != null ? (AnnotatedString) u.F0(list) : null);
                                                    long[] jArr4 = jArr3;
                                                    if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat2 = androidContentCaptureManager.f14744c) != null) {
                                                        i5 = i6;
                                                        AutofillId a2 = contentCaptureSessionCompat2.a(i11);
                                                        if (a2 == null) {
                                                            InlineClassHelperKt.c("Invalid content capture ID");
                                                            throw null;
                                                        }
                                                        contentCaptureSessionCompat2.c(a2, valueOf);
                                                    } else {
                                                        i5 = i6;
                                                    }
                                                    i6 = i5;
                                                    iArr3 = iArr4;
                                                    jArr3 = jArr4;
                                                } else {
                                                    iArr3 = iArr4;
                                                }
                                            }
                                            iArr2 = iArr3;
                                            jArr2 = jArr3;
                                            i2 = i6;
                                        } else {
                                            iArr2 = iArr3;
                                            jArr2 = jArr3;
                                            int i12 = i6;
                                            Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it2 = semanticsConfiguration.iterator();
                                            while (it2.hasNext()) {
                                                SemanticsPropertyKey<?> key2 = it2.next().getKey();
                                                SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f16851v;
                                                if (p0.a.g(key2, semanticsPropertyKey2)) {
                                                    List list2 = (List) SemanticsConfigurationKt.a(semanticsNodeCopy.f16594a, semanticsPropertyKey2);
                                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) u.F0(list2) : null;
                                                    Object obj2 = semanticsConfiguration.f16815a.get(semanticsPropertyKey2);
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    }
                                                    List list3 = (List) obj2;
                                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) u.F0(list3) : null;
                                                    if (p0.a.g(annotatedString, annotatedString2)) {
                                                        continue;
                                                    } else {
                                                        String valueOf2 = String.valueOf(annotatedString2);
                                                        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat = androidContentCaptureManager.f14744c) != null) {
                                                            i4 = i12;
                                                            AutofillId a3 = contentCaptureSessionCompat.a(i11);
                                                            if (a3 == null) {
                                                                InlineClassHelperKt.c("Invalid content capture ID");
                                                                throw null;
                                                            }
                                                            contentCaptureSessionCompat.c(a3, valueOf2);
                                                        } else {
                                                            i4 = i12;
                                                        }
                                                        i12 = i4;
                                                    }
                                                }
                                            }
                                            i2 = i12;
                                        }
                                        i3 = 8;
                                    } else {
                                        i2 = i6;
                                        intObjectMap2 = b2;
                                        iArr2 = iArr3;
                                        jArr2 = jArr3;
                                        i3 = i7;
                                    }
                                    j3 >>= i3;
                                    i9++;
                                    i7 = i3;
                                    b2 = intObjectMap2;
                                    iArr3 = iArr2;
                                    i6 = i2;
                                    jArr3 = jArr2;
                                }
                                int i13 = i6;
                                intObjectMap = b2;
                                iArr = iArr3;
                                jArr = jArr3;
                                if (i8 == i7) {
                                    i6 = i13;
                                }
                            } else {
                                intObjectMap = b2;
                                iArr = iArr3;
                                jArr = jArr3;
                            }
                            if (i6 != length) {
                                i6++;
                                b2 = intObjectMap;
                                iArr3 = iArr;
                                jArr3 = jArr;
                                i7 = 8;
                                j2 = -9187201950435737472L;
                            }
                        }
                    }
                    mutableIntObjectMap.d();
                    IntObjectMap b3 = androidContentCaptureManager.b();
                    int[] iArr5 = b3.f1440b;
                    Object[] objArr = b3.f1441c;
                    long[] jArr5 = b3.f1439a;
                    int length2 = jArr5.length - 2;
                    if (length2 >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j4 = jArr5[i14];
                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((j4 & 255) < 128) {
                                        int i17 = (i14 << 3) + i16;
                                        mutableIntObjectMap.i(iArr5[i17], new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds) objArr[i17]).f16596a, androidContentCaptureManager.b()));
                                    }
                                    j4 >>= 8;
                                }
                                if (i15 != 8) {
                                }
                            }
                            if (i14 != length2) {
                                i14++;
                            }
                        }
                    }
                    androidContentCaptureManager.f14755p = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().a(), androidContentCaptureManager.b());
                    androidContentCaptureManager.f14756q = false;
                    return;
                }
                return;
            case 2:
                TextInputServiceAndroid.i((TextInputServiceAndroid) this.f7484b);
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f7484b;
                p0.a.s(arrayList, "$transitioningViews");
                FragmentTransition.c(4, arrayList);
                return;
            case 4:
                Fragment.a((Fragment) this.f7484b);
                return;
            case 5:
                InvalidationTracker invalidationTracker = (InvalidationTracker) this.f7484b;
                synchronized (invalidationTracker.f21286n) {
                    invalidationTracker.f21280h = false;
                    InvalidationTracker.ObservedTableTracker observedTableTracker = invalidationTracker.f21282j;
                    synchronized (observedTableTracker) {
                        Arrays.fill(observedTableTracker.f21289b, false);
                        observedTableTracker.d = true;
                    }
                    SupportSQLiteStatement supportSQLiteStatement = invalidationTracker.f21281i;
                    if (supportSQLiteStatement != null) {
                        supportSQLiteStatement.close();
                    }
                }
                return;
            case 6:
                AppLovinFullscreenActivity.b((AppLovinFullscreenActivity) this.f7484b);
                return;
            case 7:
                b.b((b) this.f7484b);
                return;
            case 8:
                AppLovinBroadcastManager.sendBroadcastSync((AppLovinCommunicatorMessage) this.f7484b, null);
                return;
            case 9:
                ((MaxNativeAdView) this.f7484b).a();
                return;
            case 10:
                ((MaxAdPlacer) this.f7484b).b();
                return;
            case 11:
                AppEventQueue.e((FlushReason) this.f7484b);
                return;
            case 12:
                UserDataStore.m456setUserDataAndHash$lambda1((Bundle) this.f7484b);
                return;
            case 13:
                AppEventsConversionsAPITransformerWebRequests.a((GraphRequest) this.f7484b);
                return;
            case 14:
                CodelessMatcher.a((CodelessMatcher) this.f7484b);
                return;
            case 15:
                ViewObserver.a((ViewObserver) this.f7484b);
                return;
            case 16:
                CancellationTokenSource.a((CancellationTokenSource) this.f7484b);
                return;
            case 17:
                Task.Companion.m501delay$lambda0((TaskCompletionSource) this.f7484b);
                return;
            case 18:
                FacebookWebFallbackDialog.d((FacebookWebFallbackDialog) this.f7484b);
                return;
            case 19:
                ((FetchedAppGateKeepersManager.Callback) this.f7484b).onCompleted();
                return;
            case 20:
                ((FetchedAppSettingsManager.FetchedAppSettingsCallback) this.f7484b).onError();
                return;
            case 21:
                FileLruCache.m525postTrim$lambda3$lambda2((FileLruCache) this.f7484b);
                return;
            case 22:
                FileLruCache.m524clearCache$lambda1((File[]) this.f7484b);
                return;
            case 23:
                DeviceAuthDialog.m563schedulePoll$lambda3((DeviceAuthDialog) this.f7484b);
                return;
            case 24:
                ToolTipPopup.m581show$lambda2((ToolTipPopup) this.f7484b);
                return;
            case 25:
                WorkInitializer.b((WorkInitializer) this.f7484b);
                return;
            case 26:
                CarouselLayoutManager.d((CarouselLayoutManager) this.f7484b);
                return;
            default:
                ((MaterialBackOrchestrator) this.f7484b).startListeningForBackCallbacksWithPriorityOverlay();
                return;
        }
    }
}

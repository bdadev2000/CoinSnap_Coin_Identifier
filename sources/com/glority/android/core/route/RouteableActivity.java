package com.glority.android.core.route;

import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.DataConsumer;
import com.glority.android.core.data.DataProvider;
import com.glority.android.core.route.utils.BackgroundRequest;
import com.glority.android.core.route.utils.ForegroundRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RouteableActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0014J\b\u0010\u0011\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/glority/android/core/route/RouteableActivity;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/appcompat/app/AppCompatActivity;", "()V", "<set-?>", "", "requestId", "getRequestId", "()Ljava/lang/String;", "resultData", "Ljava/lang/Object;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "pageId", "setResult", "t", "(Ljava/lang/Object;)V", "ApplicationObserver", "Companion", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public class RouteableActivity<T> extends AppCompatActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String REQUEST_ID = "REQUEST_ID";
    private static int analysisActivityCount;
    private static boolean isBackGround;
    private static int resumeActivityCount;
    private String requestId = "";
    private T resultData;

    public final String getRequestId() {
        return this.requestId;
    }

    public void setResult(T t) {
        this.resultData = t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestId = getIntent().getStringExtra(REQUEST_ID);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AppContext.INSTANCE.pushContext(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String str;
        super.onPause();
        if (isFinishing() && (str = this.requestId) != null) {
            Router.onResponse(str, this.resultData);
            new Handler().post(new Runnable() { // from class: com.glority.android.core.route.RouteableActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RouteableActivity.m7751onPause$lambda0(RouteableActivity.this);
                }
            });
        } else {
            AppContext.INSTANCE.popContext(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPause$lambda-0, reason: not valid java name */
    public static final void m7751onPause$lambda0(RouteableActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AppContext.INSTANCE.popContext(this$0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this instanceof DataConsumer) {
            ((DataConsumer) this).stopConsumer();
        }
        if (this instanceof DataProvider) {
            ((DataProvider) this).destroyProvider();
        }
        super.onDestroy();
    }

    public String pageId() {
        String str = this.requestId;
        return str == null ? "" : str;
    }

    /* compiled from: RouteableActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/glority/android/core/route/RouteableActivity$Companion;", "", "()V", "REQUEST_ID", "", "getREQUEST_ID", "()Ljava/lang/String;", "analysisActivityCount", "", "getAnalysisActivityCount", "()I", "setAnalysisActivityCount", "(I)V", "isBackGround", "", "()Z", "setBackGround", "(Z)V", "resumeActivityCount", "getResumeActivityCount", "setResumeActivityCount", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getREQUEST_ID() {
            return RouteableActivity.REQUEST_ID;
        }

        public final int getResumeActivityCount() {
            return RouteableActivity.resumeActivityCount;
        }

        public final void setResumeActivityCount(int i) {
            RouteableActivity.resumeActivityCount = i;
        }

        public final int getAnalysisActivityCount() {
            return RouteableActivity.analysisActivityCount;
        }

        public final void setAnalysisActivityCount(int i) {
            RouteableActivity.analysisActivityCount = i;
        }

        public final boolean isBackGround() {
            return RouteableActivity.isBackGround;
        }

        public final void setBackGround(boolean z) {
            RouteableActivity.isBackGround = z;
        }
    }

    /* compiled from: RouteableActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/core/route/RouteableActivity$ApplicationObserver;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "onBackground", "", "onForeground", "onPause", "onResume", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class ApplicationObserver implements LifecycleObserver {
        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onForeground() {
            Companion companion = RouteableActivity.INSTANCE;
            int resumeActivityCount = companion.getResumeActivityCount();
            companion.setResumeActivityCount(resumeActivityCount + 1);
            if (resumeActivityCount == 0) {
                new ForegroundRequest().post();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onBackground() {
            Companion companion = RouteableActivity.INSTANCE;
            companion.setResumeActivityCount(companion.getResumeActivityCount() - 1);
            if (companion.getResumeActivityCount() == 0) {
                new BackgroundRequest().post();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            Companion companion = RouteableActivity.INSTANCE;
            companion.setAnalysisActivityCount(companion.getAnalysisActivityCount() + 1);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            Companion companion = RouteableActivity.INSTANCE;
            companion.setAnalysisActivityCount(companion.getAnalysisActivityCount() - 1);
            if (companion.getAnalysisActivityCount() == 0) {
                RouteableActivity.INSTANCE.setBackGround(true);
            }
        }
    }
}

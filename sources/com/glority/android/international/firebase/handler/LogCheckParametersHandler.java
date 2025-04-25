package com.glority.android.international.firebase.handler;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.analysis.LogCheckParametersRequest;
import com.glority.android.core.route.analysis.UrlTracking;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.reactivex.Observable;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LogCheckParametersHandler.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/glority/android/international/firebase/handler/LogCheckParametersHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Boolean;", "Companion", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class LogCheckParametersHandler implements RouteHandler<Boolean> {
    private static final String analysisRegex = "^([_a-z]|[a-z])[a-z0-9_]{0,79}$";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "LogCheckParametersHandler";
    private static final String[] intArray = {LogEventArguments.ARG_LENGTH, "count", LogEventArguments.ARG_SIZE, LogEventArguments.ARG_INTEGER_1, LogEventArguments.ARG_INTEGER_2, LogEventArguments.ARG_INTEGER_3, LogEventArguments.ARG_INTEGER_4, LogEventArguments.ARG_INTEGER_5};
    private static final String[] doubleArray = {"time", LogEventArguments.ARG_NUMBER, LogEventArguments.ARG_PERCENT, "price", "double1", "double2", "double3", "double4", LogEventArguments.ARG_DOUBLE_5};
    private static final String[] stringArray = {"code", "index", LogEventArguments.ARG_STEP, "type", "content", "error", "from", "group", "id", "key", LogEventArguments.ARG_KEYWORDS, LogEventArguments.ARG_MESSAGE, "mode", "name", LogEventArguments.ARG_SKU, "source", "status", "target", "to", "value", LogEventArguments.ARG_VERSION, "vip", LogEventArguments.ARG_STRING_1, LogEventArguments.ARG_STRING_2, LogEventArguments.ARG_STRING_3, LogEventArguments.ARG_STRING_4, LogEventArguments.ARG_STRING_5};
    private static final String[] keepName = {"ad_activeview", "ad_click", "ad_exposure", FirebaseAnalytics.Event.AD_IMPRESSION, "ad_query", "adunit_exposure", "app_clear_data", "app_remove", "app_update", "error", "first_open", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", FirebaseAnalytics.Event.SCREEN_VIEW, "session_start", "user_engagement"};

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlTracking.INSTANCE.getURL_CHECK_PARAMETERS();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        boolean z = false;
        if (request instanceof LogCheckParametersRequest) {
            Companion companion = INSTANCE;
            LogCheckParametersRequest logCheckParametersRequest = (LogCheckParametersRequest) request;
            if (companion.checkParameters(logCheckParametersRequest.getEventType(), logCheckParametersRequest.getBundle()) && companion.checkEventName(logCheckParametersRequest.getEventType())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    /* compiled from: LogCheckParametersHandler.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004J+\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u0002H\u0011H\u0002¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/glority/android/international/firebase/handler/LogCheckParametersHandler$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "analysisRegex", "doubleArray", "", "[Ljava/lang/String;", "intArray", "keepName", "stringArray", "checkEventName", "", "eventName", "checkParameter", ExifInterface.GPS_DIRECTION_TRUE, NotificationCompat.CATEGORY_EVENT, "parameterName", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Z", "checkParameters", "bundle", "Landroid/os/Bundle;", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean checkEventName(String eventName) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (StringsKt.startsWith$default(eventName, "firebase_", false, 2, (Object) null) || StringsKt.startsWith$default(eventName, "google_", false, 2, (Object) null) || StringsKt.startsWith$default(eventName, "ga_", false, 2, (Object) null)) {
                ToastUtils.showLong(eventName + "------> can't start with these prefixes:  'google_', 'firebase_', 'ga_'", new Object[0]);
                LogUtils.e(LogCheckParametersHandler.TAG, eventName + "------> can't start with these prefixes:  'google_', 'firebase_', 'ga_'");
                return false;
            }
            if (Pattern.matches(LogCheckParametersHandler.analysisRegex, eventName)) {
                if (!ArraysKt.contains(LogCheckParametersHandler.keepName, eventName)) {
                    return true;
                }
                ToastUtils.showLong(eventName + "------> is a preserved name", new Object[0]);
                LogUtils.e(LogCheckParametersHandler.TAG, eventName + "------> is a preserved name.");
                return false;
            }
            ToastUtils.showLong(eventName + "------> can't use characters other from small case English characters(a-z), underline(_) and numbers(0-9)", new Object[0]);
            LogUtils.e(LogCheckParametersHandler.TAG, eventName + "------> can't use characters other from small case English characters(a-z), underline(_) and numbers(0-9)");
            return false;
        }

        public final boolean checkParameters(String event, Bundle bundle) {
            Intrinsics.checkNotNullParameter(event, "event");
            Set<String> keySet = bundle != null ? bundle.keySet() : null;
            if (keySet == null) {
                return true;
            }
            for (String str : keySet) {
                if (!checkParameter(event, str, bundle.get(str))) {
                    return false;
                }
            }
            return true;
        }

        private final <T> boolean checkParameter(String event, String parameterName, T value) {
            if (value == null) {
                return true;
            }
            if (!ArraysKt.contains(LogCheckParametersHandler.intArray, parameterName)) {
                if (!ArraysKt.contains(LogCheckParametersHandler.doubleArray, parameterName)) {
                    if (!ArraysKt.contains(LogCheckParametersHandler.stringArray, parameterName)) {
                        return false;
                    }
                    boolean z = value instanceof String;
                    if (!z) {
                        ToastUtils.showLong(event + " " + parameterName + "------>is not String " + value + ". We are still uploading this log", new Object[0]);
                        LogUtils.e(LogCheckParametersHandler.TAG, event + " " + parameterName + "------>is not String " + value + ". We are still uploading this log.", "If you don't care this error, please ignore this log.");
                    }
                    return z;
                }
                boolean z2 = value instanceof Double;
                if (!z2 && !(value instanceof Integer) && !(value instanceof Float) && !(value instanceof Long) && !(value instanceof Short) && !(value instanceof Byte)) {
                    ToastUtils.showLong(event + " " + parameterName + "------>is not Double,Int,Float,Long,Short,Byte " + value, new Object[0]);
                    LogUtils.e(LogCheckParametersHandler.TAG, event + " " + parameterName + "------>is not Double,Int,Float,Long,Short,Byte " + value);
                }
                return z2 || (value instanceof Integer) || (value instanceof Float) || (value instanceof Long) || (value instanceof Short) || (value instanceof Byte);
            }
            boolean z3 = value instanceof Integer;
            if (!z3) {
                ToastUtils.showLong(event + " " + parameterName + "------>is not int " + value, new Object[0]);
                LogUtils.e(LogCheckParametersHandler.TAG, event + " " + parameterName + "------>is not int " + value);
            }
            return z3;
        }
    }
}

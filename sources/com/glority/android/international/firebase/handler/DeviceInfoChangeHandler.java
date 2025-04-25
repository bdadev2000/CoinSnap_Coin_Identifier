package com.glority.android.international.firebase.handler;

import android.content.res.Resources;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.analysis.DeviceInfoChangeRequest;
import com.glority.android.core.route.analysis.UrlTracking;
import io.reactivex.Observable;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;

/* compiled from: DeviceInfoChangeHandler.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/glority/android/international/firebase/handler/DeviceInfoChangeHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "Companion", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DeviceInfoChangeHandler implements RouteHandler<Boolean> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "DeviceInfoChangeHandler";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> routeRequest) {
        return (Boolean) RouteHandler.DefaultImpls.execute(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlTracking.INSTANCE.getURL_DEVICE_INFO();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof DeviceInfoChangeRequest) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new DeviceInfoChangeHandler$post$1(request, null), 3, null);
        }
    }

    /* compiled from: DeviceInfoChangeHandler.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0011\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0011\u0010\u000e\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/glority/android/international/firebase/handler/DeviceInfoChangeHandler$Companion;", "", "()V", "TAG", "", "getCurrentTimeZone", "getDiskSize", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFontSize", "", "getOsCountryCode", "getOsLanguage", "getScreenSize", "getScreenSizeInch", "getTotalMemory", "", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getCurrentTimeZone() {
            return new StringBuilder().append(TimeZone.getDefault().getOffset(0L) / 3600000).toString();
        }

        public final float getFontSize() {
            return Resources.getSystem().getConfiguration().fontScale;
        }

        public final String getOsLanguage() {
            Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
            Intrinsics.checkNotNullExpressionValue(locale, "{\n                Resour…ales.get(0)\n            }");
            String language = locale.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "locale.language");
            return language;
        }

        public final String getOsCountryCode() {
            Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
            Intrinsics.checkNotNullExpressionValue(locale, "{\n                Resour…ales.get(0)\n            }");
            String country = locale.getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "locale.country");
            return country;
        }

        public final String getScreenSize() {
            DisplayMetrics displayMetrics = AppContext.INSTANCE.peekContext().getResources().getDisplayMetrics();
            return displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
        }

        public final String getScreenSizeInch() {
            DisplayMetrics displayMetrics = AppContext.INSTANCE.peekContext().getResources().getDisplayMetrics();
            double sqrt = Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(sqrt)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object getTotalMemory(kotlin.coroutines.Continuation<? super java.lang.Integer> r9) {
            /*
                r8 = this;
                boolean r0 = r9 instanceof com.glority.android.international.firebase.handler.DeviceInfoChangeHandler$Companion$getTotalMemory$1
                if (r0 == 0) goto L14
                r0 = r9
                com.glority.android.international.firebase.handler.DeviceInfoChangeHandler$Companion$getTotalMemory$1 r0 = (com.glority.android.international.firebase.handler.DeviceInfoChangeHandler$Companion$getTotalMemory$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.label
                int r9 = r9 - r2
                r0.label = r9
                goto L19
            L14:
                com.glority.android.international.firebase.handler.DeviceInfoChangeHandler$Companion$getTotalMemory$1 r0 = new com.glority.android.international.firebase.handler.DeviceInfoChangeHandler$Companion$getTotalMemory$1
                r0.<init>(r8, r9)
            L19:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r0 = r0.L$0
                kotlin.jvm.internal.Ref$IntRef r0 = (kotlin.jvm.internal.Ref.IntRef) r0
                kotlin.ResultKt.throwOnFailure(r9)
                goto L5f
            L2e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L36:
                kotlin.ResultKt.throwOnFailure(r9)
                kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
                r9.<init>()
                kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
                r2.<init>()
                kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
                kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
                com.glority.android.international.firebase.handler.DeviceInfoChangeHandler$Companion$getTotalMemory$2 r5 = new com.glority.android.international.firebase.handler.DeviceInfoChangeHandler$Companion$getTotalMemory$2
                r6 = 0
                java.lang.String r7 = "/proc/meminfo"
                r5.<init>(r7, r9, r2, r6)
                kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
                r0.L$0 = r2
                r0.label = r3
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r0)
                if (r9 != r1) goto L5e
                return r1
            L5e:
                r0 = r2
            L5f:
                int r9 = r0.element
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.glority.android.international.firebase.handler.DeviceInfoChangeHandler.Companion.getTotalMemory(kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final Object getDiskSize(Continuation<? super String> continuation) {
            StatFs statFs = new StatFs(Environment.getExternalStorageState());
            long blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            long j = 1024;
            return String.valueOf(((blockCountLong / j) / j) / j);
        }
    }
}

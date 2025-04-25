package com.glority.android.vipEvent;

import android.os.Bundle;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.abtest.AbtestGetVariableDataRequest;
import com.glority.android.core.route.abtest.AbtestGetVariableTestIdRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.utils.GetVipStepRequest;
import com.glority.android.core.route.vipEvent.UrlVipEvent;
import com.glority.android.core.route.vipEvent.VipEventRequest;
import com.glority.base.utils.AbTestUtil;
import io.reactivex.Observable;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VipEventHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/glority/android/vipEvent/VipEventHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "Companion", "base-vipEvent_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class VipEventHandler implements RouteHandler<Boolean> {
    public static final int CODE = 4;
    public static final int GROUP = 1;
    public static final int STEP = 8;
    public static final int STRING_1 = 2;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String CONVERSION_PAGE = AbTestUtil.tag_conversion_page;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Boolean execute(RouteRequest<Boolean> request) {
        Intrinsics.checkParameterIsNotNull(request, "request");
        return (Boolean) RouteHandler.DefaultImpls.execute(this, request);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlVipEvent.INSTANCE.getURL_VIP_EVENT();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Boolean> request) {
        Intrinsics.checkParameterIsNotNull(request, "request");
        if (request instanceof VipEventRequest) {
            VipEventRequest vipEventRequest = (VipEventRequest) request;
            if (vipEventRequest.getEventType() != null) {
                int checkParameter = INSTANCE.checkParameter(vipEventRequest.getBundle());
                while (checkParameter > 0) {
                    if ((checkParameter & 1) != 1) {
                        if ((checkParameter & 2) != 2) {
                            if ((checkParameter & 4) != 4) {
                                if ((checkParameter & 8) != 8) {
                                    break;
                                }
                                Bundle bundle = vipEventRequest.getBundle();
                                if (bundle != null) {
                                    bundle.putString(LogEventArguments.ARG_STEP, String.valueOf(new GetVipStepRequest().toResult().intValue()));
                                }
                                checkParameter -= 8;
                            } else {
                                Bundle bundle2 = vipEventRequest.getBundle();
                                if (bundle2 != null) {
                                    Locale locale = Locale.getDefault();
                                    Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
                                    bundle2.putString("code", locale.getCountry());
                                }
                                checkParameter -= 4;
                            }
                        } else {
                            Bundle bundle3 = vipEventRequest.getBundle();
                            if (bundle3 != null) {
                                bundle3.putString(LogEventArguments.ARG_STRING_1, new AbtestGetVariableTestIdRequest(CONVERSION_PAGE, "").toResult());
                            }
                            checkParameter -= 2;
                        }
                    } else {
                        Bundle bundle4 = vipEventRequest.getBundle();
                        if (bundle4 != null) {
                            String result = new AbtestGetVariableDataRequest(CONVERSION_PAGE, LikeItem.DISLIKE).toResult();
                            bundle4.putString("group", result != null ? result : "");
                        }
                        checkParameter--;
                    }
                }
                new LogEventRequest(vipEventRequest.getEventType(), vipEventRequest.getBundle()).post();
            }
        }
    }

    /* compiled from: VipEventHandler.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/glority/android/vipEvent/VipEventHandler$Companion;", "", "()V", "CODE", "", "CONVERSION_PAGE", "", "getCONVERSION_PAGE", "()Ljava/lang/String;", "setCONVERSION_PAGE", "(Ljava/lang/String;)V", "GROUP", "STEP", "STRING_1", "checkParameter", "bundle", "Landroid/os/Bundle;", "base-vipEvent_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getCONVERSION_PAGE() {
            return VipEventHandler.CONVERSION_PAGE;
        }

        public final void setCONVERSION_PAGE(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            VipEventHandler.CONVERSION_PAGE = str;
        }

        public final int checkParameter(Bundle bundle) {
            Set<String> keySet;
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return 0;
            }
            int i = 15;
            for (String str : keySet) {
                switch (str.hashCode()) {
                    case -1881759168:
                        if (str.equals(LogEventArguments.ARG_STRING_1)) {
                            i -= 2;
                            break;
                        } else {
                            break;
                        }
                    case 3059181:
                        if (str.equals("code")) {
                            i -= 4;
                            break;
                        } else {
                            break;
                        }
                    case 3540684:
                        if (str.equals(LogEventArguments.ARG_STEP)) {
                            i -= 8;
                            break;
                        } else {
                            break;
                        }
                    case 98629247:
                        if (str.equals("group")) {
                            i--;
                            break;
                        } else {
                            break;
                        }
                }
            }
            return i;
        }
    }
}

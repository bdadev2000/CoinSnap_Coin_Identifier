package com.glority.android.picturexx.js.method;

import androidx.fragment.app.FragmentManager;
import com.glority.android.cmsui2.util.GradingLevelScaleConvertor;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.picturexx.view.dialog.ContentFeedbackDialog;
import com.glority.android.picturexx.view.grading.GradingDetailFragment;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.widget.webview.AbsJsMethod;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.entity.MethodInvoke;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GradeJsMethod.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/glority/android/picturexx/js/method/GradeJsMethod;", "Lcom/glority/base/widget/webview/AbsJsMethod;", "gradingDetailFragment", "Lcom/glority/android/picturexx/view/grading/GradingDetailFragment;", "activity", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", Args.pageName, "", "<init>", "(Lcom/glority/android/picturexx/view/grading/GradingDetailFragment;Lcom/glority/android/ui/base/RuntimePermissionActivity;Ljava/lang/String;)V", "availableApi", "", "invoke", "", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "setPageData", Args.year, Args.varietyUid, "setUserGradeScale", "stringParams", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class GradeJsMethod extends AbsJsMethod {
    public static final int $stable = 8;
    private final GradingDetailFragment gradingDetailFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradeJsMethod(GradingDetailFragment gradingDetailFragment, RuntimePermissionActivity activity, String pageName) {
        super(activity, pageName);
        Intrinsics.checkNotNullParameter(gradingDetailFragment, "gradingDetailFragment");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.gradingDetailFragment = gradingDetailFragment;
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public Set<String> availableApi() {
        return SetsKt.mutableSetOf("setUserGradeScale", "openFeedback", "setPageData");
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public void invoke(MethodInvoke methodInvoke, JsbWebView.MethodCallback methodCallback) {
        Intrinsics.checkNotNullParameter(methodInvoke, "methodInvoke");
        super.invoke(methodInvoke, methodCallback);
        String method = methodInvoke.getMethod();
        int hashCode = method.hashCode();
        if (hashCode != -1998156817) {
            if (hashCode == -1446673061) {
                if (method.equals("setPageData")) {
                    setPageData(methodInvoke.getStringParams(Args.year), methodInvoke.getStringParams("variety_uid"));
                    return;
                }
                return;
            } else {
                if (hashCode == -353918240 && method.equals("setUserGradeScale")) {
                    setUserGradeScale(methodInvoke.getStringParams("scaleType"));
                    return;
                }
                return;
            }
        }
        if (method.equals("openFeedback")) {
            Map<String, Object> mapParams = methodInvoke.getMapParams("extraParams");
            ContentFeedbackDialog contentFeedbackDialog = ContentFeedbackDialog.INSTANCE;
            RuntimePermissionActivity activity = getActivity();
            FragmentManager supportFragmentManager = this.gradingDetailFragment.getSupportFragmentManager();
            Object obj = mapParams.get("from");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = "";
            }
            Object obj2 = mapParams.get("name");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null) {
                str2 = LogEvents.bottom;
            }
            Object obj3 = mapParams.get("type");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str3 == null) {
                str3 = "";
            }
            Object obj4 = mapParams.get(LogEventArguments.ARG_STRING_2);
            String str4 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = mapParams.get(LogEventArguments.ARG_STRING_3);
            String str5 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = mapParams.get(LogEventArguments.ARG_STRING_4);
            String str6 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = mapParams.get(LogEventArguments.ARG_STRING_5);
            String str7 = obj7 instanceof String ? (String) obj7 : null;
            Object obj8 = mapParams.get(Args.varietyUid);
            contentFeedbackDialog.openGradePriceFeedbackDialog(activity, supportFragmentManager, str, str2, str3, str4, str5, str6, str7, obj8 instanceof String ? (String) obj8 : null).setOnclose(new Function1<String, Unit>() { // from class: com.glority.android.picturexx.js.method.GradeJsMethod$invoke$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str8) {
                    invoke2(str8);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    GradeJsMethod.this.callbackSuccess(MapsKt.mapOf(TuplesKt.to("status", it)));
                }
            });
        }
    }

    private final void setPageData(String year, String varietyUid) {
        GradingDetailFragment gradingDetailFragment = this.gradingDetailFragment;
        if (year == null) {
            year = "";
        }
        gradingDetailFragment.setYear(year);
        this.gradingDetailFragment.setVarietyUid(varietyUid);
    }

    private final void setUserGradeScale(String stringParams) {
        if (stringParams != null) {
            GradingLevelScaleConvertor.INSTANCE.cacheScaleType(stringParams);
            this.gradingDetailFragment.reInjectJs();
        }
    }
}

package com.glority.android.picturexx.js.method;

import com.glority.android.cmsui2.entity.GradeItem;
import com.glority.android.cmsui2.util.GradingLevelScaleConvertor;
import com.glority.android.picturexx.view.dialog.GradeLevelDialog;
import com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.widget.webview.AbsJsMethod;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.entity.MethodInvoke;
import com.glority.base.widget.webview.entity.MethodResponse;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecognizeDetailJsMethod.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/js/method/RecognizeDetailJsMethod;", "Lcom/glority/base/widget/webview/AbsJsMethod;", "recognizeCmsDetailFragment", "Lcom/glority/android/picturexx/view/recognize/RecognizeCmsDetailFragment;", "activity", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", Args.pageName, "", "<init>", "(Lcom/glority/android/picturexx/view/recognize/RecognizeCmsDetailFragment;Lcom/glority/android/ui/base/RuntimePermissionActivity;Ljava/lang/String;)V", "availableApi", "", "invoke", "", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "showGradePicker", "grade", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class RecognizeDetailJsMethod extends AbsJsMethod {
    public static final int $stable = 8;
    private final RecognizeCmsDetailFragment recognizeCmsDetailFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecognizeDetailJsMethod(RecognizeCmsDetailFragment recognizeCmsDetailFragment, RuntimePermissionActivity activity, String pageName) {
        super(activity, pageName);
        Intrinsics.checkNotNullParameter(recognizeCmsDetailFragment, "recognizeCmsDetailFragment");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.recognizeCmsDetailFragment = recognizeCmsDetailFragment;
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public Set<String> availableApi() {
        return SetsKt.mutableSetOf("showGradePicker");
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public void invoke(MethodInvoke methodInvoke, JsbWebView.MethodCallback methodCallback) {
        Intrinsics.checkNotNullParameter(methodInvoke, "methodInvoke");
        super.invoke(methodInvoke, methodCallback);
        if (Intrinsics.areEqual(methodInvoke.getMethod(), "showGradePicker")) {
            showGradePicker(methodInvoke.getStringParams("grade"), methodCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showGradePicker(String grade, final JsbWebView.MethodCallback methodCallback) {
        List<? extends GradeItem> list = GradingLevelScaleConvertor.INSTANCE.getTypeLevelMap().get(GradingLevelScaleConvertor.INSTANCE.getDefaultScaleType(AppViewModel.INSTANCE.getInstance().getCountryCode()));
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        GradeLevelDialog.INSTANCE.open(getActivity(), list, grade, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.js.method.RecognizeDetailJsMethod$showGradePicker$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                RecognizeCmsDetailFragment recognizeCmsDetailFragment;
                JsbWebView.MethodCallback methodCallback2 = JsbWebView.MethodCallback.this;
                if (methodCallback2 != null) {
                    methodCallback2.callback(new MethodResponse("success", MapsKt.mapOf(TuplesKt.to("grade", str)), null, null, 12, null));
                }
                recognizeCmsDetailFragment = this.recognizeCmsDetailFragment;
                recognizeCmsDetailFragment.updateGrade(str);
            }
        });
    }
}

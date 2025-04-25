package com.glority.android.picturexx.js.method;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavOptions;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.glority.abtest.utils.AbTestTagManage;
import com.glority.abtest.utils.AbtestUtils;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingVariable;
import com.glority.android.cmsui2.view.child.SingleWheelPickerDialog;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogJsContentBinding;
import com.glority.android.picturexx.business.databinding.LayoutGradeYearSelectorAttentionBinding;
import com.glority.android.picturexx.js.BusinessJsWebviewBottomSheetFragment;
import com.glority.android.picturexx.js.BusinessJsWebviewFragment;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.android.picturexx.view.form.ConsultFragment;
import com.glority.android.picturexx.vm.GradingRecognizeProcess;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.utils.AbTestUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.widget.webview.AbsJsMethod;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.entity.MethodInvoke;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl;
import com.glority.network.util.GZipUtils;
import com.glority.network.util.HttpState;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.GlProgressDialog;
import com.glority.widget.GlTextView;
import com.glority.widget.imagepager.GlNormalImagePagerActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: BaseJsMethod.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016J'\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010\u001cJ9\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0002¢\u0006\u0002\u0010!JL\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u00052\b\u0010$\u001a\u0004\u0018\u00010\u00052\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010&2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010&H\u0002J(\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u00052\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010'0&H\u0002J\u0012\u0010,\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010-\u001a\u00020\u000bH\u0002J)\u0010.\u001a\u00020\u000b2\u0010\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u00100J0\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u00052\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010&2\u0006\u00103\u001a\u000204H\u0002J\u001c\u00105\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u00052\b\u00107\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u00108\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J \u00109\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0002¨\u0006<"}, d2 = {"Lcom/glority/android/picturexx/js/method/BaseJsMethod;", "Lcom/glority/base/widget/webview/AbsJsMethod;", "activity", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", Args.pageName, "", "<init>", "(Lcom/glority/android/ui/base/RuntimePermissionActivity;Ljava/lang/String;)V", "availableApi", "", "invoke", "", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "showToast", TtmlNode.TAG_STYLE, "content", "getABTestingModel", "key", "openCamera", "scene", "showPicker", "index", "", "data", "", "(Ljava/lang/Integer;Ljava/util/List;)V", "alert", Args.title, LogEventArguments.ARG_MESSAGE, "buttons", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "openWebView", "url", "animation", "titleBar", "", "", "extraParams", "reportEvent", "eventName", "params", "decrypt", "appInfo", "imageViewer", Args.imageUrls, "(Ljava/util/List;Ljava/lang/Integer;)V", "routeTo", "id", "closeCurrent", "", "getCMSStaticUrl", "contentType", Args.uid, "useFeature", "abTestingTrackMoreData", "dataKey", "dataValue", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public class BaseJsMethod extends AbsJsMethod {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseJsMethod(RuntimePermissionActivity activity, String pageName) {
        super(activity, pageName);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public Set<String> availableApi() {
        return SetsKt.mutableSetOf("openCamera", "showPicker", "alert", "openWebview", "reportEvent", "decrypt", "appInfo", "imageViewer", "getABTestingModel", "routeTo", "showToast", "getCMSStaticUrl", "useFeature", "abTestingTrackMoreData");
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public void invoke(MethodInvoke methodInvoke, JsbWebView.MethodCallback methodCallback) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(methodInvoke, "methodInvoke");
        super.invoke(methodInvoke, methodCallback);
        String method = methodInvoke.getMethod();
        switch (method.hashCode()) {
            case -2044258483:
                if (method.equals("imageViewer")) {
                    imageViewer(methodInvoke.getStringList("images"), methodInvoke.getIntParams("index"));
                    return;
                }
                return;
            case -1913642710:
                if (method.equals("showToast")) {
                    showToast(methodInvoke.getStringParams(TtmlNode.TAG_STYLE), methodInvoke.getStringParams("content"));
                    return;
                }
                return;
            case -794273169:
                if (method.equals("appInfo")) {
                    appInfo();
                    return;
                }
                return;
            case -270512698:
                if (method.equals("reportEvent")) {
                    reportEvent(methodInvoke.getStringParams("eventName"), methodInvoke.getMapParams("params"));
                    return;
                }
                return;
            case -127175153:
                if (method.equals("openCamera")) {
                    openCamera(methodInvoke.getStringParams("scene"));
                    return;
                }
                return;
            case 92899676:
                if (method.equals("alert")) {
                    String stringParams = methodInvoke.getStringParams(Args.title);
                    Integer intParams = methodInvoke.getIntParams(TtmlNode.TAG_STYLE);
                    String stringParams2 = methodInvoke.getStringParams(LogEventArguments.ARG_MESSAGE);
                    ArrayList stringList = methodInvoke.getStringList("buttons");
                    if (stringList == null) {
                        stringList = new ArrayList();
                    }
                    alert(stringParams, intParams, stringParams2, stringList);
                    return;
                }
                return;
            case 686611947:
                if (method.equals("showPicker")) {
                    showPicker(methodInvoke.getIntParams("index"), methodInvoke.getStringList("data"));
                    return;
                }
                return;
            case 1013634704:
                if (method.equals("getABTestingModel")) {
                    getABTestingModel(methodInvoke.getStringParams("key"));
                    return;
                }
                return;
            case 1027597903:
                if (method.equals("openWebview")) {
                    openWebView(methodInvoke.getStringParams("url"), methodInvoke.getStringParams("animation"), methodInvoke.getMapParams("titleBar"), methodInvoke.getMapParams("extraParams"));
                    return;
                }
                return;
            case 1324254363:
                if (method.equals("abTestingTrackMoreData")) {
                    String stringParams3 = methodInvoke.getStringParams("key");
                    String stringParams4 = methodInvoke.getStringParams("data_key");
                    String stringParams5 = methodInvoke.getStringParams("data_value");
                    String str3 = stringParams3;
                    if (str3 == null || str3.length() == 0 || (str = stringParams4) == null || str.length() == 0 || (str2 = stringParams5) == null || str2.length() == 0) {
                        callbackFailed("key or value is null or empty");
                        return;
                    } else {
                        abTestingTrackMoreData(stringParams3, stringParams4, stringParams5);
                        return;
                    }
                }
                return;
            case 1385647780:
                if (method.equals("routeTo")) {
                    String stringParams6 = methodInvoke.getStringParams("id");
                    if (stringParams6 == null) {
                        stringParams6 = "";
                    }
                    Map<String, Object> mapParams = methodInvoke.getMapParams("extraParams");
                    Boolean booleanParams = methodInvoke.getBooleanParams("closeCurrent");
                    routeTo(stringParams6, mapParams, booleanParams != null ? booleanParams.booleanValue() : false);
                    return;
                }
                return;
            case 1385944910:
                if (method.equals("getCMSStaticUrl")) {
                    getCMSStaticUrl(methodInvoke.getStringParams("contentType"), methodInvoke.getStringParams(Args.uid));
                    return;
                }
                return;
            case 1542543757:
                if (method.equals("decrypt")) {
                    decrypt(methodInvoke.getStringParams("data"));
                    return;
                }
                return;
            case 1694521199:
                if (method.equals("useFeature")) {
                    String stringParams7 = methodInvoke.getStringParams("featureName");
                    String str4 = stringParams7;
                    if (str4 == null || str4.length() == 0) {
                        callbackFailed("featureName is null or empty");
                        return;
                    } else {
                        useFeature(stringParams7);
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    private final void showToast(String style, String content) {
        if (content == null) {
            return;
        }
        if (Intrinsics.areEqual(style, "success")) {
            ToastUtils.showSuccess(content, new Object[0]);
        } else if (Intrinsics.areEqual(style, HttpState.FAIL)) {
            ToastUtils.showError(content, new Object[0]);
        } else {
            ToastUtils.showShort(content, new Object[0]);
        }
    }

    private final void getABTestingModel(String key) {
        String str = key;
        if (str == null || str.length() == 0) {
            callbackFailed("key is null or empty");
            return;
        }
        AbtestingVariable abtestVariable = AbTestUtil.INSTANCE.getAbtestVariable(key);
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("value", abtestVariable != null ? abtestVariable.getVariable() : null);
        pairArr[1] = TuplesKt.to("variableData", abtestVariable != null ? abtestVariable.getVariableData() : null);
        callbackSuccess(MapsKt.mapOf(pairArr));
    }

    public void openCamera(String scene) {
        if (Intrinsics.areEqual(scene, "grade")) {
            CoreActivity.INSTANCE.openGrading(getActivity(), new GradingRecognizeProcess(null, 1, null), getPageName(), (r17 & 8) != 0 ? 2 : 0, (r17 & 16) != 0, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
        } else {
            CoreActivity.INSTANCE.openGrading(getActivity(), new MainRecognizeProcess(), getPageName(), (r17 & 8) != 0 ? 2 : 0, (r17 & 16) != 0, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
        }
    }

    private final void showPicker(Integer index, final List<String> data) {
        View view;
        int intValue = (index == null || index.intValue() == -1) ? 0 : index.intValue();
        if (CoinAbTestUtils.INSTANCE.enableCoinGradingReport()) {
            LayoutGradeYearSelectorAttentionBinding inflate = LayoutGradeYearSelectorAttentionBinding.inflate(LayoutInflater.from(getActivity()));
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            String string = getActivity().getResources().getString(R.string.text_grade_year_selector_attention);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = getActivity().getResources().getString(R.string.text_grade_year_selector_highlights);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String str = string;
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, string2, 0, false, 6, (Object) null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (indexOf$default != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ViewCompat.MEASURED_STATE_MASK), indexOf$default, string2.length() + indexOf$default, 33);
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(SupportMenu.CATEGORY_MASK), 0, 1, 33);
            inflate.tvAttention.setText(spannableStringBuilder);
            view = inflate.getRoot();
        } else {
            view = null;
        }
        View view2 = view;
        List<String> list = data;
        if (list == null || list.isEmpty()) {
            return;
        }
        SingleWheelPickerDialog.INSTANCE.show(getActivity(), data, data.get(intValue), new Function0<Unit>() { // from class: com.glority.android.picturexx.js.method.BaseJsMethod$showPicker$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BaseJsMethod.this.callbackSuccess(MapsKt.mapOf(TuplesKt.to("selected", -1)));
            }
        }, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.js.method.BaseJsMethod$showPicker$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                invoke2(str2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                BaseJsMethod.this.callbackSuccess(MapsKt.mapOf(TuplesKt.to("selected", Integer.valueOf(data.indexOf(it)))));
            }
        }, view2);
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [androidx.appcompat.app.AlertDialog, T] */
    private final void alert(String title, Integer style, String message, List<String> buttons) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        DialogJsContentBinding inflate = DialogJsContentBinding.inflate(getActivity().getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        inflate.titleTv.setText(title);
        if (style != null && style.intValue() == 1) {
            GlTextView et = inflate.et;
            Intrinsics.checkNotNullExpressionValue(et, "et");
            et.setVisibility(0);
            GlTextView textTv = inflate.textTv;
            Intrinsics.checkNotNullExpressionValue(textTv, "textTv");
            textTv.setVisibility(8);
            inflate.et.setText(message);
        } else {
            GlTextView et2 = inflate.et;
            Intrinsics.checkNotNullExpressionValue(et2, "et");
            et2.setVisibility(8);
            GlTextView textTv2 = inflate.textTv;
            Intrinsics.checkNotNullExpressionValue(textTv2, "textTv");
            textTv2.setVisibility(0);
            inflate.textTv.setText(message);
        }
        ImageView closeIv = inflate.closeIv;
        Intrinsics.checkNotNullExpressionValue(closeIv, "closeIv");
        ViewExtensionsKt.setSingleClickListener$default(closeIv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.js.method.BaseJsMethod$alert$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AlertDialog alertDialog = objectRef.element;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                this.callbackSuccess(MapsKt.mapOf(TuplesKt.to(NotificationCompat.CATEGORY_EVENT, "close")));
            }
        }, 1, (Object) null);
        final int i = 0;
        for (Object obj : buttons) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MaterialButton materialButton = new MaterialButton(getActivity());
            materialButton.setText((String) obj);
            MaterialButton materialButton2 = materialButton;
            ViewExtensionsKt.setSingleClickListener$default(materialButton2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.js.method.BaseJsMethod$alert$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    AlertDialog alertDialog = objectRef.element;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    this.callbackSuccess(MapsKt.mapOf(TuplesKt.to(NotificationCompat.CATEGORY_EVENT, "click"), TuplesKt.to("arguments", Integer.valueOf(i))));
                }
            }, 1, (Object) null);
            materialButton.setCornerRadius(getActivity().getResources().getDimensionPixelSize(R.dimen.x44));
            LinearLayout linearLayout = inflate.container;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getActivity().getResources().getDimensionPixelSize(R.dimen.x112));
            layoutParams.topMargin = getActivity().getResources().getDimensionPixelSize(R.dimen.x40);
            layoutParams.leftMargin = getActivity().getResources().getDimensionPixelSize(R.dimen.x48);
            layoutParams.rightMargin = getActivity().getResources().getDimensionPixelSize(R.dimen.x48);
            Unit unit = Unit.INSTANCE;
            linearLayout.addView(materialButton2, layoutParams);
            i = i2;
        }
        objectRef.element = new MaterialAlertDialogBuilder(getActivity()).setView(inflate.getRoot()).setBackground(AppCompatResources.getDrawable(getActivity(), R.drawable.gl_alert_bg)).setCancelable(false).show();
    }

    private final void openWebView(String url, String animation, Map<String, ? extends Object> titleBar, Map<String, ? extends Object> extraParams) {
        if (Intrinsics.areEqual(animation, "popup")) {
            BusinessJsWebviewBottomSheetFragment.Companion companion = BusinessJsWebviewBottomSheetFragment.INSTANCE;
            RuntimePermissionActivity activity = getActivity();
            Object obj = titleBar != null ? titleBar.get(Args.title) : null;
            companion.open(activity, url, obj instanceof String ? (String) obj : null, extraParams);
            return;
        }
        BusinessJsWebviewFragment.Companion companion2 = BusinessJsWebviewFragment.INSTANCE;
        RuntimePermissionActivity activity2 = getActivity();
        Object obj2 = titleBar != null ? titleBar.get(Args.title) : null;
        companion2.open(activity2, url, obj2 instanceof String ? (String) obj2 : null, extraParams);
    }

    private final void reportEvent(String eventName, Map<String, ? extends Object> params) {
        if (eventName == null) {
            return;
        }
        final Bundle bundleOf = BundleKt.bundleOf(new Pair[0]);
        final Function2<String, Object, Unit> function2 = new Function2<String, Object, Unit>() { // from class: com.glority.android.picturexx.js.method.BaseJsMethod$reportEvent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Object obj) {
                invoke2(str, obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String t, Object obj) {
                Intrinsics.checkNotNullParameter(t, "t");
                if (obj instanceof Integer) {
                    bundleOf.putInt(t, ((Number) obj).intValue());
                } else {
                    if (obj instanceof Boolean) {
                        bundleOf.putBoolean(t, ((Boolean) obj).booleanValue());
                        return;
                    }
                    Bundle bundle = bundleOf;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    bundle.putString(t, (String) obj);
                }
            }
        };
        params.forEach(new BiConsumer() { // from class: com.glority.android.picturexx.js.method.BaseJsMethod$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                BaseJsMethod.reportEvent$lambda$2(Function2.this, obj, obj2);
            }
        });
        new LogEventRequest(eventName, bundleOf).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportEvent$lambda$2(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj, obj2);
    }

    private final void decrypt(String data) {
        if (data == null) {
            return;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(...)");
            cipher.init(2, new SecretKeySpec(StringsKt.encodeToByteArray("48d0281l9rQFEhUvmihK965RXsIBw0Zx"), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
            byte[] decode = Base64.decode(data, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            byte[] encode = Base64.encode(GZipUtils.INSTANCE.decompress(cipher.doFinal(decode)), 2);
            Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
            callbackSuccess(MapsKt.mapOf(TuplesKt.to("data", StringsKt.decodeToString(encode))));
        } catch (Throwable th) {
            callbackFailed(th.getMessage());
        }
    }

    private final void appInfo() {
        Object systemService = getActivity().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        callbackSuccess(MapsKt.mapOf(TuplesKt.to("os", "android"), TuplesKt.to(RemoteConfigConstants.RequestFieldKey.APP_VERSION, AppContext.INSTANCE.getConfig("VERSION_NAME")), TuplesKt.to(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, Integer.valueOf(AppViewModel.INSTANCE.getInstance().getLanguageCode().getValue())), TuplesKt.to(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, AppViewModel.INSTANCE.getInstance().getCountryCode()), TuplesKt.to("screenWidth", Integer.valueOf(displayMetrics.widthPixels)), TuplesKt.to("screenHeight", Integer.valueOf(displayMetrics.heightPixels)), TuplesKt.to("pixelRatio", Integer.valueOf(displayMetrics.densityDpi)), TuplesKt.to("vip", Boolean.valueOf(AppViewModel.INSTANCE.isVip())), TuplesKt.to("isTrial", Boolean.valueOf(AppViewModel.INSTANCE.isTrial())), TuplesKt.to(Args.pageName, getPageName())));
    }

    private final void imageViewer(List<String> imageUrls, Integer index) {
        ArrayList arrayList;
        if (imageUrls == null || (arrayList = CollectionsKt.filterNotNull(imageUrls)) == null) {
            arrayList = new ArrayList();
        }
        int intValue = index != null ? index.intValue() : 0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (intValue < 0 || intValue >= arrayList.size()) {
            intValue = 0;
        }
        GlNormalImagePagerActivity.INSTANCE.open(getActivity(), (String[]) arrayList.toArray(new String[0]), intValue);
    }

    private final void routeTo(String id, Map<String, ? extends Object> extraParams, boolean closeCurrent) {
        if (Intrinsics.areEqual(id, "officialseries")) {
            NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.INSTANCE;
            Uri parse = Uri.parse("coin://series/detail?indexListUid=" + (extraParams != null ? extraParams.get(Args.indexListUid) : null) + "&from=" + (extraParams != null ? extraParams.get("from") : null));
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            ActivityKt.findNavController(getActivity(), R.id.fcv).navigate(companion.fromUri(parse).build(), NavOptions.Builder.setPopUpTo$default(new NavOptions.Builder().setEnterAnim(com.glority.base.R.anim.slide_in_right).setExitAnim(com.glority.base.R.anim.slide_out_left).setPopEnterAnim(com.glority.base.R.anim.slide_in_left).setPopExitAnim(com.glority.base.R.anim.slide_out_right), R.id.seriesDetailFragment, true, false, 4, (Object) null).build());
            return;
        }
        if (Intrinsics.areEqual(id, "errorcoin_consult")) {
            ConsultFragment.INSTANCE.open(getActivity(), GlobalLiveBus.INSTANCE.getCurrentRecognizeImageUrl());
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, android.app.Dialog] */
    private final void getCMSStaticUrl(String contentType, String uid) {
        String str = contentType;
        if (str == null || str.length() == 0) {
            callbackFailed("contentType is null or empty");
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CmsStaticUrl staticUrlMessageByCache = CmsRepository.INSTANCE.getStaticUrlMessageByCache(uid, contentType);
        if (staticUrlMessageByCache != null) {
            callbackSuccess(MapsKt.mapOf(TuplesKt.to("lightUrl", staticUrlMessageByCache.getLightUrl()), TuplesKt.to("darkUrl", staticUrlMessageByCache.getDarkUrl())));
        } else {
            objectRef.element = GlProgressDialog.show$default(GlProgressDialog.INSTANCE, (Context) getActivity(), true, (String) null, 0L, 12, (Object) null);
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new BaseJsMethod$getCMSStaticUrl$1(uid, contentType, objectRef, this, null), 3, null);
    }

    private final void useFeature(String key) {
        AbTestTagManage.INSTANCE.addUsedFeature(key);
    }

    private final void abTestingTrackMoreData(String key, String dataKey, String dataValue) {
        AbtestUtils.INSTANCE.setAbtestMoreData(key, dataKey, dataValue);
    }
}

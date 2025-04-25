package com.glority.android.picturexx.js.method;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.picturexx.view.BaseCmsDetailFragment;
import com.glority.android.picturexx.view.dialog.ContentFeedbackDialog;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.widget.webview.AbsJsMethod;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.entity.MethodInvoke;
import com.glority.base.widget.webview.entity.MethodResponse;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsJsMethod.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/glority/android/picturexx/js/method/CmsJsMethod;", "Lcom/glority/base/widget/webview/AbsJsMethod;", "baseCmsDetailFragment", "Lcom/glority/android/picturexx/view/BaseCmsDetailFragment;", "activity", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", Args.pageName, "", "<init>", "(Lcom/glority/android/picturexx/view/BaseCmsDetailFragment;Lcom/glority/android/ui/base/RuntimePermissionActivity;Ljava/lang/String;)V", "availableApi", "", "invoke", "", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "shouldShowReferenceImages", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CmsJsMethod extends AbsJsMethod {
    public static final int $stable = 8;
    private final BaseCmsDetailFragment<?> baseCmsDetailFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmsJsMethod(BaseCmsDetailFragment<?> baseCmsDetailFragment, RuntimePermissionActivity activity, String pageName) {
        super(activity, pageName);
        Intrinsics.checkNotNullParameter(baseCmsDetailFragment, "baseCmsDetailFragment");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.baseCmsDetailFragment = baseCmsDetailFragment;
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public Set<String> availableApi() {
        return SetsKt.mutableSetOf("openFeedback", "setPageData", "addCollection", "seriesCreated", "shouldShowReferenceImages", "showGradePicker", "changeResult");
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public void invoke(MethodInvoke methodInvoke, final JsbWebView.MethodCallback methodCallback) {
        Intrinsics.checkNotNullParameter(methodInvoke, "methodInvoke");
        super.invoke(methodInvoke, methodCallback);
        String method = methodInvoke.getMethod();
        switch (method.hashCode()) {
            case -1998156817:
                if (method.equals("openFeedback")) {
                    Map<String, Object> mapParams = methodInvoke.getMapParams("extraParams");
                    Context context = this.baseCmsDetailFragment.getContext();
                    if (context != null) {
                        ContentFeedbackDialog contentFeedbackDialog = ContentFeedbackDialog.INSTANCE;
                        FragmentManager supportFragmentManager = this.baseCmsDetailFragment.getSupportFragmentManager();
                        Long itemId = this.baseCmsDetailFragment.getItemId();
                        contentFeedbackDialog.openIdentifyDetailFeedbackDialog(context, supportFragmentManager, itemId != null ? itemId.longValue() : 0L, String.valueOf(mapParams.get("from")), String.valueOf(mapParams.get("name")), String.valueOf(mapParams.get("type")), String.valueOf(mapParams.get(LogEventArguments.ARG_STRING_2)), String.valueOf(mapParams.get(LogEventArguments.ARG_STRING_4)), String.valueOf(mapParams.get("value")), String.valueOf(mapParams.get(LogEventArguments.ARG_STRING_5)));
                        return;
                    }
                    return;
                }
                return;
            case -1721274849:
                if (method.equals("addCollection")) {
                    this.baseCmsDetailFragment.clickAddCollection("h5", new Function1<CollectionDetailEditDialogFragment, Unit>() { // from class: com.glority.android.picturexx.js.method.CmsJsMethod$invoke$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CollectionDetailEditDialogFragment collectionDetailEditDialogFragment) {
                            invoke2(collectionDetailEditDialogFragment);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(CollectionDetailEditDialogFragment collectionDetailEditDialogFragment) {
                            if (collectionDetailEditDialogFragment != null) {
                                final JsbWebView.MethodCallback methodCallback2 = JsbWebView.MethodCallback.this;
                                collectionDetailEditDialogFragment.setStatusCallback(new Function1<String, Unit>() { // from class: com.glority.android.picturexx.js.method.CmsJsMethod$invoke$2.1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                        invoke2(str);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(String it) {
                                        JsbWebView.MethodCallback methodCallback3;
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if (!Intrinsics.areEqual(it, "success") || (methodCallback3 = JsbWebView.MethodCallback.this) == null) {
                                            return;
                                        }
                                        methodCallback3.callback(new MethodResponse("success", null, null, null, 12, null));
                                    }
                                });
                            }
                        }
                    });
                    return;
                }
                return;
            case -1446673061:
                if (method.equals("setPageData")) {
                    this.baseCmsDetailFragment.updatePageData(methodInvoke.getStringParams(Args.year), methodInvoke.getStringParams("species_uid"), methodInvoke.getStringParams("variety_uid"));
                    return;
                }
                return;
            case -134724627:
                if (method.equals("changeResult")) {
                    this.baseCmsDetailFragment.onChangeResultClick();
                    return;
                }
                return;
            case 1633891336:
                method.equals("showGradePicker");
                return;
            case 2006398065:
                if (method.equals("seriesCreated")) {
                    this.baseCmsDetailFragment.isSeriesCreated(new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.js.method.CmsJsMethod$invoke$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            JsbWebView.MethodCallback methodCallback2 = JsbWebView.MethodCallback.this;
                            if (methodCallback2 != null) {
                                methodCallback2.callback(new MethodResponse("success", MapsKt.mapOf(TuplesKt.to(LogEvents.customseries_sortbycreate, Boolean.valueOf(z))), null, null, 12, null));
                            }
                        }
                    });
                    return;
                }
                return;
            case 2057315379:
                if (method.equals("shouldShowReferenceImages")) {
                    shouldShowReferenceImages(methodCallback);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void shouldShowReferenceImages(JsbWebView.MethodCallback methodCallback) {
        if (methodCallback != null) {
            methodCallback.callback(new MethodResponse("success", MapsKt.mapOf(TuplesKt.to("shouldShow", Boolean.valueOf(this.baseCmsDetailFragment.getShouldShowReferenceImages()))), null, null, 12, null));
        }
    }
}

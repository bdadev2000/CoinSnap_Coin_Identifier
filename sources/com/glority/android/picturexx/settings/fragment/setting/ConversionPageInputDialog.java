package com.glority.android.picturexx.settings.fragment.setting;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.DialogFragment;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.guide.ConvertPageOpenRequest;
import com.glority.android.core.route.guide.IsVipInHistoryRequest;
import com.glority.android.picturexx.settings.R;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.utils.AbTestUtil;
import com.glority.utils.ui.ToastUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: ConversionPageInputDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0011"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/ConversionPageInputDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityCreated", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "view", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ConversionPageInputDialog extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, R.style.BaseDialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        Window window;
        Window window2;
        Window window3;
        super.onActivityCreated(savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setGravity(17);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return getLayoutInflater().inflate(R.layout.fragment_input_conversion_page, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String config;
        String config2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Button button = (Button) view.findViewById(R.id.btn_ensure);
        final EditText editText = (EditText) view.findViewById(R.id.et_input);
        Button button2 = (Button) view.findViewById(R.id.btn_ab);
        Button button3 = (Button) view.findViewById(R.id.btn_default);
        if (button != null) {
            ViewExtensionsKt.setSingleClickListener$default(button, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.ConversionPageInputDialog$onViewCreated$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                    invoke2(view2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    String obj = editText.getText().toString();
                    if (obj.length() == 0) {
                        ToastUtils.showError("请输入转化页memoId", new Object[0]);
                    } else {
                        new ConvertPageOpenRequest(obj, null, 0, 0, null, 30, null).post();
                        this.dismiss();
                    }
                }
            }, 1, (Object) null);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = AbTestUtil.INSTANCE.getConversionPageId();
        button2.setText("打开ab转化页: " + intRef.element);
        if (button2 != null) {
            ViewExtensionsKt.setSingleClickListener$default(button2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.ConversionPageInputDialog$onViewCreated$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                    invoke2(view2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (Ref.IntRef.this.element == 0) {
                        ToastUtils.showError("转化页memoId错误: " + Ref.IntRef.this.element, new Object[0]);
                    } else {
                        new OpenBillingActivityRequest("start", String.valueOf(Ref.IntRef.this.element), 20).toResult();
                    }
                }
            }, 1, (Object) null);
        }
        if (new IsVipInHistoryRequest().toResult().booleanValue()) {
            config = AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO_VIP_IN_HISTORY");
            config2 = AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO_VIP_IN_HISTORY_INDEX");
        } else {
            config = AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO");
            config2 = AppContext.INSTANCE.getConfig("BUI_DEFAULT_MEMO_INDEX");
        }
        final String str = config + config2;
        button3.setText("打开默认转化页: " + str);
        if (button3 != null) {
            ViewExtensionsKt.setSingleClickListener$default(button3, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.ConversionPageInputDialog$onViewCreated$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                    invoke2(view2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Integer intOrNull = StringsKt.toIntOrNull(str);
                    if (intOrNull != null) {
                        new OpenBillingActivityRequest("start", String.valueOf(intOrNull.intValue()), 20).toResult();
                    }
                }
            }, 1, (Object) null);
        }
    }
}

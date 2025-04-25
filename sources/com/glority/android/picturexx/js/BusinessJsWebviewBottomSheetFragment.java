package com.glority.android.picturexx.js;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogBusinessJsWebviewBinding;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment;
import com.glority.android.xx.constants.Args;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.GlTextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BusinessJsWebviewBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/js/BusinessJsWebviewBottomSheetFragment;", "Lcom/glority/android/ui/base/v2/BaseBottomSheetDialogFragment;", "Lcom/glority/android/picturexx/business/databinding/DialogBusinessJsWebviewBinding;", "<init>", "()V", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onCreateDialog", "Landroid/app/Dialog;", "getLogPageName", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class BusinessJsWebviewBottomSheetFragment extends BaseBottomSheetDialogFragment<DialogBusinessJsWebviewBinding> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    protected void doCreateView(Bundle savedInstanceState) {
        String str;
        GlTextView glTextView = getBinding().title;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(Args.title)) == null) {
            str = "";
        }
        glTextView.setText(str);
        ImageView ivClose = getBinding().ivClose;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtensionsKt.setSingleClickListener$default(ivClose, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.js.BusinessJsWebviewBottomSheetFragment$doCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                BusinessJsWebviewBottomSheetFragment.this.dismiss();
            }
        }, 1, (Object) null);
        BusinessJsWebviewFragment businessJsWebviewFragment = new BusinessJsWebviewFragment();
        businessJsWebviewFragment.setArguments(getArguments());
        businessJsWebviewFragment.setVisibleToolbar(false);
        getChildFragmentManager().beginTransaction().replace(R.id.fcv, businessJsWebviewFragment).commitAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        View view = getRootView();
        Object parent = view != null ? view.getParent() : null;
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior from = BottomSheetBehavior.from((View) parent);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        from.setDraggable(false);
        from.setHideable(true);
        from.setState(3);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (getContext() == null) {
            Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
            Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
            return onCreateDialog;
        }
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext(), R.style.TransparentBottomSheetStyle);
        bottomSheetDialog.setDismissWithAnimation(true);
        return bottomSheetDialog;
    }

    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    protected String getLogPageName() {
        String lowerCase = "BusinessJsWebviewBottomSheetFragment".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    public DialogBusinessJsWebviewBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogBusinessJsWebviewBinding inflate = DialogBusinessJsWebviewBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* compiled from: BusinessJsWebviewBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/js/BusinessJsWebviewBottomSheetFragment$Companion;", "", "<init>", "()V", "open", "", "context", "Landroidx/fragment/app/FragmentActivity;", "url", "", Args.title, "extraParams", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(FragmentActivity context, String url, String title, Map<String, ? extends Object> extraParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Map mutableMap = extraParams != null ? MapsKt.toMutableMap(extraParams) : null;
            Object obj = mutableMap != null ? mutableMap.get(Args.pageName) : null;
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = "";
            }
            if (mutableMap != null) {
                mutableMap.remove(Args.pageName);
            }
            if (mutableMap != null) {
                mutableMap.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, CoinConfigUtils.INSTANCE.getCountryCode());
            }
            Bundle bundleOf = BundleKt.bundleOf(new Pair[0]);
            if (mutableMap != null) {
                for (Map.Entry entry : mutableMap.entrySet()) {
                    if (entry.getValue() instanceof Integer) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                        bundleOf.putInt(str2, ((Integer) value).intValue());
                    } else if (entry.getValue() instanceof Double) {
                        String str3 = (String) entry.getKey();
                        Object value2 = entry.getValue();
                        Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Double");
                        bundleOf.putDouble(str3, ((Double) value2).doubleValue());
                    } else {
                        bundleOf.putString((String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
            }
            try {
                BusinessJsWebviewBottomSheetFragment businessJsWebviewBottomSheetFragment = new BusinessJsWebviewBottomSheetFragment();
                businessJsWebviewBottomSheetFragment.setArguments(BundleKt.bundleOf(TuplesKt.to("url", url), TuplesKt.to(Args.title, title), TuplesKt.to(Args.pageName, str), TuplesKt.to("extraParams", bundleOf)));
                Integer.valueOf(context.getSupportFragmentManager().beginTransaction().add(businessJsWebviewBottomSheetFragment, "onCreateSuccess").commitAllowingStateLoss());
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
    }
}

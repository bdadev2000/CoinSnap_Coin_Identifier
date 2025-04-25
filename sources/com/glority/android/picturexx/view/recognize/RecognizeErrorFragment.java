package com.glority.android.picturexx.view.recognize;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentRecognizeErrorBinding;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.vm.GradingRecognizeProcess;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.android.ui.base.FragmentHelper;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.Constants;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.HandOnBundleUtils;
import com.glority.utils.device.NetworkUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.GlTextView;
import com.glority.widget.imagepager.GlNormalImagePagerActivity;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecognizeErrorFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0015J)\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/RecognizeErrorFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentRecognizeErrorBinding;", "<init>", "()V", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "getLogEvent", "", Args.findCoin, "", "name", "type", "", "(ZLjava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "getLogPageName", "getLayoutId", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class RecognizeErrorFragment extends BaseFragment<FragmentRecognizeErrorBinding> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int requestCode = 12;
    public static final int typeGrading = 1;
    public static final int typeNormal = 2;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        String str;
        OnBackPressedDispatcher onBackPressedDispatcher;
        ImageView ivClose = ((FragmentRecognizeErrorBinding) getBinding()).ivClose;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtensionsKt.setSingleClickListener$default(ivClose, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeErrorFragment$doCreateView$1
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
                FragmentActivity activity = RecognizeErrorFragment.this.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        }, 1, (Object) null);
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.addCallback(this, new OnBackPressedCallback() { // from class: com.glority.android.picturexx.view.recognize.RecognizeErrorFragment$doCreateView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(true);
                }

                @Override // androidx.activity.OnBackPressedCallback
                public void handleOnBackPressed() {
                    setEnabled(false);
                    FragmentActivity activity2 = RecognizeErrorFragment.this.getActivity();
                    if (activity2 != null) {
                        activity2.setResult(-1, new Intent().putExtra("option", "close"));
                    }
                    ViewExtensionsKt.finish(RecognizeErrorFragment.this);
                }
            });
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("name") : null;
        Bundle arguments2 = getArguments();
        boolean z = arguments2 != null ? arguments2.getBoolean(Args.findCoin) : false;
        Bundle arguments3 = getArguments();
        final String string2 = arguments3 != null ? arguments3.getString(Args.imageUrls) : null;
        Bundle arguments4 = getArguments();
        final Integer valueOf = arguments4 != null ? Integer.valueOf(arguments4.getInt("type")) : null;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str = arguments5.getString("from")) == null) {
            str = "";
        }
        final String str2 = str;
        Bundle arguments6 = getArguments();
        boolean z2 = arguments6 != null ? arguments6.getBoolean(Args.requestError) : false;
        final boolean z3 = z;
        final String str3 = string;
        ((FragmentRecognizeErrorBinding) getBinding()).retakeBt.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.recognize.RecognizeErrorFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecognizeErrorFragment.doCreateView$lambda$0(RecognizeErrorFragment.this, z3, str3, valueOf, str2, view);
            }
        });
        Glide.with(((FragmentRecognizeErrorBinding) getBinding()).iv).load(string2).into(((FragmentRecognizeErrorBinding) getBinding()).iv);
        ImageView iv = ((FragmentRecognizeErrorBinding) getBinding()).iv;
        Intrinsics.checkNotNullExpressionValue(iv, "iv");
        ViewExtensionsKt.setSingleClickListener$default(iv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeErrorFragment$doCreateView$4
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
                GlNormalImagePagerActivity.Companion companion = GlNormalImagePagerActivity.INSTANCE;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String str4 = string2;
                if (str4 == null) {
                    str4 = "";
                }
                companion.open(context, (String[]) CollectionsKt.listOf(str4).toArray(new String[0]), 0);
            }
        }, 1, (Object) null);
        if (!z) {
            GlTextView nameTv = ((FragmentRecognizeErrorBinding) getBinding()).nameTv;
            Intrinsics.checkNotNullExpressionValue(nameTv, "nameTv");
            nameTv.setVisibility(8);
            ((FragmentRecognizeErrorBinding) getBinding()).errorTv.setText(R.string.text_no_found);
            ((FragmentRecognizeErrorBinding) getBinding()).contentTv.setText(R.string.identify_empty_unclearly);
        } else if (z2) {
            if (NetworkUtils.isConnected()) {
                GlTextView nameTv2 = ((FragmentRecognizeErrorBinding) getBinding()).nameTv;
                Intrinsics.checkNotNullExpressionValue(nameTv2, "nameTv");
                nameTv2.setVisibility(8);
                ((FragmentRecognizeErrorBinding) getBinding()).contentTv.setText(R.string.error_notavailable);
            } else {
                GlTextView nameTv3 = ((FragmentRecognizeErrorBinding) getBinding()).nameTv;
                Intrinsics.checkNotNullExpressionValue(nameTv3, "nameTv");
                nameTv3.setVisibility(8);
                ((FragmentRecognizeErrorBinding) getBinding()).errorTv.setText(R.string.error_network_title);
                ((FragmentRecognizeErrorBinding) getBinding()).contentTv.setText(R.string.error_network_content);
            }
            ((FragmentRecognizeErrorBinding) getBinding()).retakeBt.setText(R.string.error_network_btn);
        } else {
            String str4 = string;
            if (str4 == null || str4.length() == 0) {
                GlTextView nameTv4 = ((FragmentRecognizeErrorBinding) getBinding()).nameTv;
                Intrinsics.checkNotNullExpressionValue(nameTv4, "nameTv");
                nameTv4.setVisibility(8);
            } else {
                GlTextView nameTv5 = ((FragmentRecognizeErrorBinding) getBinding()).nameTv;
                Intrinsics.checkNotNullExpressionValue(nameTv5, "nameTv");
                nameTv5.setVisibility(0);
                ((FragmentRecognizeErrorBinding) getBinding()).nameTv.setText(str4);
            }
            ((FragmentRecognizeErrorBinding) getBinding()).errorTv.setText(R.string.grading_not_support);
            ((FragmentRecognizeErrorBinding) getBinding()).contentTv.setText(R.string.grading_not_support_describe);
        }
        logEvent(getLogEvent(z, string, valueOf) + "_open", BundleKt.bundleOf(TuplesKt.to("from", str2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$0(RecognizeErrorFragment this$0, boolean z, String str, Integer num, String from, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(from, "$from");
        this$0.logEvent(this$0.getLogEvent(z, str, num) + "retake_click", BundleKt.bundleOf(TuplesKt.to("from", from)));
        if (num != null && num.intValue() == 1) {
            CoreActivity.Companion companion = CoreActivity.INSTANCE;
            FragmentActivity requireActivity = this$0.requireActivity();
            Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
            companion.openGrading((RuntimePermissionActivity) requireActivity, new GradingRecognizeProcess(null, 1, null), Constants.error_retake, (r17 & 8) != 0 ? 2 : 0, (r17 & 16) != 0, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : HandOnBundleUtils.INSTANCE.getHandOnBundleFromBundle(this$0));
        } else {
            CoreActivity.Companion companion2 = CoreActivity.INSTANCE;
            FragmentActivity requireActivity2 = this$0.requireActivity();
            Intrinsics.checkNotNull(requireActivity2, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
            companion2.start((RuntimePermissionActivity) requireActivity2, new MainRecognizeProcess(), (r17 & 4) != 0 ? 1 : 2, (r17 & 8) != 0 ? false : true, Constants.error_retake, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : HandOnBundleUtils.INSTANCE.getHandOnBundleFromBundle(this$0));
        }
        ViewExtensionsKt.finish(this$0);
    }

    private final String getLogEvent(boolean findCoin, String name, Integer type) {
        String str;
        if (type != null && type.intValue() == 1) {
            str = "grade_";
        } else {
            str = "result_";
        }
        if (!findCoin) {
            return str + "noresult";
        }
        String str2 = name;
        if (str2 == null || str2.length() == 0) {
            return str + "noname";
        }
        return str + "notsupported";
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "recognizeerror";
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_recognize_error;
    }

    /* compiled from: RecognizeErrorFragment.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015JB\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/RecognizeErrorFragment$Companion;", "", "<init>", "()V", "typeGrading", "", "typeNormal", "requestCode", "open", "", "context", "Landroidx/fragment/app/Fragment;", Args.requestError, "", "name", "", Args.findCoin, "image", "type", "from", HandOnBundleUtils.KEY, "Landroid/os/Bundle;", "Landroid/content/Context;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Fragment context, boolean requestError, String name, boolean findCoin, String image, int type, String from, Bundle handOnBundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(from, "from");
            try {
                FragmentHelper.Builder.launch$default(ContainerActivity.INSTANCE.open(RecognizeErrorFragment.class).put("name", name).put(Args.requestError, requestError).put(Args.findCoin, findCoin).put(Args.imageUrls, image).put("type", type).put("from", from).put(HandOnBundleUtils.KEY, handOnBundle), context, (Integer) 12, (ActivityOptionsCompat) null, 4, (Object) null);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }

        public final void open(Context context, String name, boolean findCoin, String image, int type, String from, Bundle handOnBundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(from, "from");
            try {
                ContainerActivity.INSTANCE.open(RecognizeErrorFragment.class).put("name", name).put(Args.requestError, false).put(Args.findCoin, findCoin).put(Args.imageUrls, image).put("type", type).put("from", from).put(HandOnBundleUtils.KEY, handOnBundle).launch(context);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
    }
}

package com.glority.android.picturexx.settings.fragment.setting;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBinding;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.share.ShareUtil;
import com.glority.utils.app.ResUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AboutFragment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020 H\u0016J\b\u0010'\u001a\u00020(H\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015¨\u0006*"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/AboutFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Landroidx/viewbinding/ViewBinding;", "<init>", "()V", "getLayoutId", "", "clContactEmail", "Landroid/view/View;", "getClContactEmail", "()Landroid/view/View;", "setClContactEmail", "(Landroid/view/View;)V", "navi_bar", "getNavi_bar", "setNavi_bar", "email", "Landroid/widget/TextView;", "getEmail", "()Landroid/widget/TextView;", "setEmail", "(Landroid/widget/TextView;)V", "tv_version", "getTv_version", "setTv_version", "aboutInfo", "getAboutInfo", "setAboutInfo", "aboutDesc", "getAboutDesc", "setAboutDesc", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initToolbar", "initListener", "initView", "onDestroy", "getLogPageName", "", "Companion", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class AboutFragment extends BaseFragment<ViewBinding> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public TextView aboutDesc;
    public TextView aboutInfo;
    public View clContactEmail;
    public TextView email;
    public View navi_bar;
    public TextView tv_version;

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_about;
    }

    public final View getClContactEmail() {
        View view = this.clContactEmail;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clContactEmail");
        return null;
    }

    public final void setClContactEmail(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.clContactEmail = view;
    }

    public final View getNavi_bar() {
        View view = this.navi_bar;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navi_bar");
        return null;
    }

    public final void setNavi_bar(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.navi_bar = view;
    }

    public final TextView getEmail() {
        TextView textView = this.email;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("email");
        return null;
    }

    public final void setEmail(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.email = textView;
    }

    public final TextView getTv_version() {
        TextView textView = this.tv_version;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tv_version");
        return null;
    }

    public final void setTv_version(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv_version = textView;
    }

    public final TextView getAboutInfo() {
        TextView textView = this.aboutInfo;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aboutInfo");
        return null;
    }

    public final void setAboutInfo(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.aboutInfo = textView;
    }

    public final TextView getAboutDesc() {
        TextView textView = this.aboutDesc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aboutDesc");
        return null;
    }

    public final void setAboutDesc(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.aboutDesc = textView;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.About_Us, null, 2, null);
        setClContactEmail(requireView().findViewById(R.id.cl_contact_email));
        setNavi_bar(requireView().findViewById(R.id.navi_bar));
        setEmail((TextView) requireView().findViewById(R.id.email));
        setTv_version((TextView) requireView().findViewById(R.id.tv_version));
        setAboutInfo((TextView) requireView().findViewById(R.id.about_info));
        setAboutDesc((TextView) requireView().findViewById(R.id.about_desc));
        setClContactEmail(requireView().findViewById(R.id.cl_contact_email));
        initToolbar();
        initView();
        initListener();
    }

    private final void initToolbar() {
        View findViewById = getNavi_bar().findViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        Toolbar toolbar = (Toolbar) findViewById;
        toolbar.setTitle(R.string.setting_app_info);
        toolbar.setNavigationIcon(R.drawable.arrow_back_black);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.AboutFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutFragment.initToolbar$lambda$0(AboutFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolbar$lambda$0(AboutFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    private final void initListener() {
        ViewExtensionsKt.setSingleClickListener(getClContactEmail(), 600L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.AboutFragment$initListener$1
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
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(AboutFragment.this, SettingsLogEvents.About_Us_Email, null, 2, null);
                ShareUtil shareUtil = ShareUtil.INSTANCE;
                FragmentActivity activity = AboutFragment.this.getActivity();
                if (activity == null) {
                    return;
                }
                shareUtil.sendEmail(activity);
            }
        });
    }

    private final void initView() {
        getEmail().setText(AppContext.INSTANCE.getConfig("contactEmail"));
        getTv_version().setText(ResUtils.getString(R.string.app_name) + " v" + AppContext.INSTANCE.getConfig("VERSION_NAME"));
        String string = ResUtils.getString(R.string.about_us_text_tip);
        String string2 = ResUtils.getString(R.string.about_us_text_content, ResUtils.getString(R.string.app_name));
        Intrinsics.checkNotNull(string);
        String str = string;
        if (str.length() > 0 && !Intrinsics.areEqual(string, "about_us_text_tip")) {
            getAboutInfo().setText(str);
        }
        Intrinsics.checkNotNull(string2);
        String str2 = string2;
        if (str2.length() <= 0 || Intrinsics.areEqual(string2, "about_us_text_content")) {
            return;
        }
        getAboutDesc().setText(str2);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.About_Us_Close, null, 2, null);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "about";
    }

    /* compiled from: AboutFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/AboutFragment$Companion;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ContainerActivity.INSTANCE.open(AboutFragment.class).launch(context);
        }
    }
}

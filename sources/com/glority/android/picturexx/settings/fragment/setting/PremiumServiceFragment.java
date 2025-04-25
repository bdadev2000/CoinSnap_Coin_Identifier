package com.glority.android.picturexx.settings.fragment.setting;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.databinding.FragmentPremuimServiceBinding;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PremiumServiceFragment.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/PremiumServiceFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/settings/databinding/FragmentPremuimServiceBinding;", "<init>", "()V", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "getLogPageName", "", "Companion", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class PremiumServiceFragment extends BaseFragment<FragmentPremuimServiceBinding> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentPremuimServiceBinding access$getBinding(PremiumServiceFragment premiumServiceFragment) {
        return (FragmentPremuimServiceBinding) premiumServiceFragment.getBinding();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_premuim_service;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        AppViewModel.INSTANCE.getInstance().getVipInfo().observe(this, new PremiumServiceFragment$sam$androidx_lifecycle_Observer$0(new PremiumServiceFragment$doCreateView$1(this)));
        ((FragmentPremuimServiceBinding) getBinding()).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.PremiumServiceFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PremiumServiceFragment.doCreateView$lambda$0(PremiumServiceFragment.this, view);
            }
        });
        ((FragmentPremuimServiceBinding) getBinding()).layoutToolbar.toolbar.setTitle(R.string.premium_center_text_premium_privileges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$0(PremiumServiceFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewExtensionsKt.finish(this$0);
    }

    /* compiled from: PremiumServiceFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/PremiumServiceFragment$Companion;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ContainerActivity.INSTANCE.open(PremiumServiceFragment.class).launch(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return "premiumservice";
    }
}

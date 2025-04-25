package com.glority.android.picturexx.settings.fragment.account;

import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.databinding.FragmentAccountBinding;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountFragment.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\rH\u0014¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/account/AccountFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/settings/databinding/FragmentAccountBinding;", "<init>", "()V", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initListener", "getLogPageName", "", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class AccountFragment extends BaseFragment<FragmentAccountBinding> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$3(View view) {
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_account;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initListener();
        AppViewModel.INSTANCE.getInstance().getVipInfo().observe(this, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.AccountFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AccountFragment.doCreateView$lambda$1(AccountFragment.this, (VipInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void doCreateView$lambda$1(AccountFragment this$0, VipInfo vipInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
        if (value != null) {
            ((FragmentAccountBinding) this$0.getBinding()).tvNick.setText(value.getNickname());
            ((FragmentAccountBinding) this$0.getBinding()).tvAccountName.setText(value.getEmail());
            ((FragmentAccountBinding) this$0.getBinding()).userPortrait.vBackground.setVisibility((vipInfo == null || !vipInfo.getIsVip()) ? 4 : 0);
            Glide.with(this$0).load(value.getAvatarUrl()).centerCrop().circleCrop().into(((FragmentAccountBinding) this$0.getBinding()).userPortrait.ivAvatar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        ((FragmentAccountBinding) getBinding()).btnBack.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.account.AccountFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountFragment.initListener$lambda$2(AccountFragment.this, view);
            }
        });
        ((FragmentAccountBinding) getBinding()).tvLogout.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.account.AccountFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountFragment.initListener$lambda$3(view);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1<OnBackPressedCallback, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.AccountFragment$initListener$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
                invoke2(onBackPressedCallback);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OnBackPressedCallback addCallback) {
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                ViewExtensionsKt.finish(AccountFragment.this);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$2(AccountFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "account";
    }
}

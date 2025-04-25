package com.glority.android.picturexx.settings.fragment.account;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.databinding.FragmentResetPasswordBinding;
import com.glority.android.picturexx.settings.databinding.LayoutCheckEmailBinding;
import com.glority.android.picturexx.settings.databinding.LayoutConfirmPasswordBinding;
import com.glority.android.picturexx.settings.databinding.LayoutResetPasswordBinding;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.picturexx.settings.vm.AccountViewModel;
import com.glority.android.picturexx.settings.vm.ResetPasswordViewModel;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.data.DefaultResponseHandler;
import com.glority.base.utils.data.ResponseUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.CheckVerifyCodeMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.GetVerifyCodeMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.ResetPasswordAndLoginMessage;
import com.glority.network.model.Resource;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ResetPasswordFragment.kt */
@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000*\u0001\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0014\u001a\u00020\nH\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/account/ResetPasswordFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/settings/databinding/FragmentResetPasswordBinding;", "<init>", "()V", "accountViewModel", "Lcom/glority/android/picturexx/settings/vm/AccountViewModel;", "vm", "Lcom/glority/android/picturexx/settings/vm/ResetPasswordViewModel;", "seconds", "", "timerRunnable", "com/glority/android/picturexx/settings/fragment/account/ResetPasswordFragment.<no name provided>", "Lcom/glority/android/picturexx/settings/fragment/account/ResetPasswordFragment$timerRunnable$1;", "layoutResetPasswordBinding", "Lcom/glority/android/picturexx/settings/databinding/LayoutResetPasswordBinding;", "layoutCheckEmailBinding", "Lcom/glority/android/picturexx/settings/databinding/LayoutCheckEmailBinding;", "layoutConfirmPasswordBinding", "Lcom/glority/android/picturexx/settings/databinding/LayoutConfirmPasswordBinding;", "getLayoutId", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "addSubscriptions", "initPager", "initListener", "setVerifyCodeSentHint", "onDestroy", "getLogPageName", "", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ResetPasswordFragment extends BaseFragment<FragmentResetPasswordBinding> {
    private AccountViewModel accountViewModel;
    private LayoutCheckEmailBinding layoutCheckEmailBinding;
    private LayoutConfirmPasswordBinding layoutConfirmPasswordBinding;
    private LayoutResetPasswordBinding layoutResetPasswordBinding;
    private int seconds;
    private final ResetPasswordFragment$timerRunnable$1 timerRunnable = new Runnable() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$timerRunnable$1
        @Override // java.lang.Runnable
        public void run() {
            int i;
            LayoutCheckEmailBinding layoutCheckEmailBinding;
            int i2;
            LayoutCheckEmailBinding layoutCheckEmailBinding2;
            int i3;
            int i4;
            String str;
            LayoutCheckEmailBinding layoutCheckEmailBinding3;
            int i5;
            int i6;
            i = ResetPasswordFragment.this.seconds;
            if (i > 0) {
                i6 = ResetPasswordFragment.this.seconds;
                ResetPasswordFragment.this.seconds = i6 - 1;
                View view = ResetPasswordFragment.this.getRootView();
                if (view != null) {
                    view.postDelayed(this, 1000L);
                }
            }
            layoutCheckEmailBinding = ResetPasswordFragment.this.layoutCheckEmailBinding;
            LayoutCheckEmailBinding layoutCheckEmailBinding4 = null;
            if (layoutCheckEmailBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutCheckEmailBinding");
                layoutCheckEmailBinding = null;
            }
            TextView textView = layoutCheckEmailBinding.tvSend;
            i2 = ResetPasswordFragment.this.seconds;
            textView.setEnabled(i2 == 0);
            layoutCheckEmailBinding2 = ResetPasswordFragment.this.layoutCheckEmailBinding;
            if (layoutCheckEmailBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutCheckEmailBinding");
                layoutCheckEmailBinding2 = null;
            }
            TextView textView2 = layoutCheckEmailBinding2.tvSend;
            i3 = ResetPasswordFragment.this.seconds;
            if (i3 == 0) {
                str = ResUtils.getString(R.string.reset_pwd_text_resend);
            } else {
                String string = ResUtils.getString(R.string.reset_pwd_text_resend);
                i4 = ResetPasswordFragment.this.seconds;
                str = string + " " + i4 + "s";
            }
            textView2.setText(str);
            layoutCheckEmailBinding3 = ResetPasswordFragment.this.layoutCheckEmailBinding;
            if (layoutCheckEmailBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutCheckEmailBinding");
            } else {
                layoutCheckEmailBinding4 = layoutCheckEmailBinding3;
            }
            TextView textView3 = layoutCheckEmailBinding4.tvSend;
            Context context = ResetPasswordFragment.this.getContext();
            if (context == null) {
                return;
            }
            i5 = ResetPasswordFragment.this.seconds;
            textView3.setTextColor(ContextCompat.getColor(context, i5 == 0 ? R.color.Theme : R.color.Grey7E8389));
        }
    };
    private ResetPasswordViewModel vm;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentResetPasswordBinding access$getBinding(ResetPasswordFragment resetPasswordFragment) {
        return (FragmentResetPasswordBinding) resetPasswordFragment.getBinding();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_reset_password;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        this.accountViewModel = (AccountViewModel) getSharedViewModel(AccountViewModel.class);
        this.vm = (ResetPasswordViewModel) getViewModel(ResetPasswordViewModel.class);
        addSubscriptions();
        initPager();
        initListener();
    }

    private final void addSubscriptions() {
        ResetPasswordViewModel resetPasswordViewModel = this.vm;
        ResetPasswordViewModel resetPasswordViewModel2 = null;
        if (resetPasswordViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            resetPasswordViewModel = null;
        }
        ResetPasswordFragment resetPasswordFragment = this;
        resetPasswordViewModel.getEmail().observe(resetPasswordFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ResetPasswordFragment.addSubscriptions$lambda$0(ResetPasswordFragment.this, (String) obj);
            }
        });
        ResetPasswordViewModel resetPasswordViewModel3 = this.vm;
        if (resetPasswordViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            resetPasswordViewModel3 = null;
        }
        resetPasswordViewModel3.m7814getVerifyCode().observe(resetPasswordFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ResetPasswordFragment.addSubscriptions$lambda$1(ResetPasswordFragment.this, (String) obj);
            }
        });
        final Function2<String, String, Unit> function2 = new Function2<String, String, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$addSubscriptions$passwordConfirmWatcher$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                invoke2(str, str2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str, String str2) {
                LayoutConfirmPasswordBinding layoutConfirmPasswordBinding;
                LayoutConfirmPasswordBinding layoutConfirmPasswordBinding2;
                LayoutConfirmPasswordBinding layoutConfirmPasswordBinding3;
                String str3;
                LayoutConfirmPasswordBinding layoutConfirmPasswordBinding4;
                LayoutConfirmPasswordBinding layoutConfirmPasswordBinding5;
                layoutConfirmPasswordBinding = ResetPasswordFragment.this.layoutConfirmPasswordBinding;
                if (layoutConfirmPasswordBinding != null) {
                    String str4 = str;
                    LayoutConfirmPasswordBinding layoutConfirmPasswordBinding6 = null;
                    if (str4 == null || str4.length() == 0 || (str3 = str2) == null || str3.length() == 0) {
                        layoutConfirmPasswordBinding2 = ResetPasswordFragment.this.layoutConfirmPasswordBinding;
                        if (layoutConfirmPasswordBinding2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutConfirmPasswordBinding");
                            layoutConfirmPasswordBinding2 = null;
                        }
                        layoutConfirmPasswordBinding2.btChangePassword.setAlpha(0.3f);
                        layoutConfirmPasswordBinding3 = ResetPasswordFragment.this.layoutConfirmPasswordBinding;
                        if (layoutConfirmPasswordBinding3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutConfirmPasswordBinding");
                        } else {
                            layoutConfirmPasswordBinding6 = layoutConfirmPasswordBinding3;
                        }
                        layoutConfirmPasswordBinding6.btChangePassword.setClickable(false);
                        return;
                    }
                    layoutConfirmPasswordBinding4 = ResetPasswordFragment.this.layoutConfirmPasswordBinding;
                    if (layoutConfirmPasswordBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutConfirmPasswordBinding");
                        layoutConfirmPasswordBinding4 = null;
                    }
                    layoutConfirmPasswordBinding4.btChangePassword.setAlpha(1.0f);
                    layoutConfirmPasswordBinding5 = ResetPasswordFragment.this.layoutConfirmPasswordBinding;
                    if (layoutConfirmPasswordBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutConfirmPasswordBinding");
                    } else {
                        layoutConfirmPasswordBinding6 = layoutConfirmPasswordBinding5;
                    }
                    layoutConfirmPasswordBinding6.btChangePassword.setClickable(true);
                }
            }
        };
        ResetPasswordViewModel resetPasswordViewModel4 = this.vm;
        if (resetPasswordViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            resetPasswordViewModel4 = null;
        }
        resetPasswordViewModel4.getPassword().observe(resetPasswordFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ResetPasswordFragment.addSubscriptions$lambda$2(ResetPasswordFragment.this, function2, (String) obj);
            }
        });
        ResetPasswordViewModel resetPasswordViewModel5 = this.vm;
        if (resetPasswordViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            resetPasswordViewModel5 = null;
        }
        resetPasswordViewModel5.getPasswordConfirm().observe(resetPasswordFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ResetPasswordFragment.addSubscriptions$lambda$3(ResetPasswordFragment.this, function2, (String) obj);
            }
        });
        ResetPasswordViewModel resetPasswordViewModel6 = this.vm;
        if (resetPasswordViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            resetPasswordViewModel6 = null;
        }
        resetPasswordViewModel6.getObservable(GetVerifyCodeMessage.class).observe(resetPasswordFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$$ExternalSyntheticLambda4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ResetPasswordFragment.addSubscriptions$lambda$4(ResetPasswordFragment.this, (Resource) obj);
            }
        });
        ResetPasswordViewModel resetPasswordViewModel7 = this.vm;
        if (resetPasswordViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            resetPasswordViewModel7 = null;
        }
        resetPasswordViewModel7.getObservable(CheckVerifyCodeMessage.class).observe(resetPasswordFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$$ExternalSyntheticLambda5
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ResetPasswordFragment.addSubscriptions$lambda$5(ResetPasswordFragment.this, (Resource) obj);
            }
        });
        ResetPasswordViewModel resetPasswordViewModel8 = this.vm;
        if (resetPasswordViewModel8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        } else {
            resetPasswordViewModel2 = resetPasswordViewModel8;
        }
        resetPasswordViewModel2.getObservable(ResetPasswordAndLoginMessage.class).observe(resetPasswordFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ResetPasswordFragment.addSubscriptions$lambda$6(ResetPasswordFragment.this, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$0(ResetPasswordFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LayoutResetPasswordBinding layoutResetPasswordBinding = this$0.layoutResetPasswordBinding;
        if (layoutResetPasswordBinding != null) {
            LayoutResetPasswordBinding layoutResetPasswordBinding2 = null;
            if (layoutResetPasswordBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResetPasswordBinding");
                layoutResetPasswordBinding = null;
            }
            layoutResetPasswordBinding.textInputResetPwdEmail.setError(null);
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                LayoutResetPasswordBinding layoutResetPasswordBinding3 = this$0.layoutResetPasswordBinding;
                if (layoutResetPasswordBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResetPasswordBinding");
                    layoutResetPasswordBinding3 = null;
                }
                layoutResetPasswordBinding3.btContinue.setAlpha(0.3f);
                LayoutResetPasswordBinding layoutResetPasswordBinding4 = this$0.layoutResetPasswordBinding;
                if (layoutResetPasswordBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResetPasswordBinding");
                } else {
                    layoutResetPasswordBinding2 = layoutResetPasswordBinding4;
                }
                layoutResetPasswordBinding2.btContinue.setClickable(false);
                return;
            }
            LayoutResetPasswordBinding layoutResetPasswordBinding5 = this$0.layoutResetPasswordBinding;
            if (layoutResetPasswordBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResetPasswordBinding");
                layoutResetPasswordBinding5 = null;
            }
            layoutResetPasswordBinding5.btContinue.setAlpha(1.0f);
            LayoutResetPasswordBinding layoutResetPasswordBinding6 = this$0.layoutResetPasswordBinding;
            if (layoutResetPasswordBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResetPasswordBinding");
            } else {
                layoutResetPasswordBinding2 = layoutResetPasswordBinding6;
            }
            layoutResetPasswordBinding2.btContinue.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$1(ResetPasswordFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LayoutCheckEmailBinding layoutCheckEmailBinding = this$0.layoutCheckEmailBinding;
        if (layoutCheckEmailBinding != null) {
            LayoutCheckEmailBinding layoutCheckEmailBinding2 = null;
            if (layoutCheckEmailBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutCheckEmailBinding");
                layoutCheckEmailBinding = null;
            }
            layoutCheckEmailBinding.textInputResetPwdVerifyCode.setError(null);
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                LayoutCheckEmailBinding layoutCheckEmailBinding3 = this$0.layoutCheckEmailBinding;
                if (layoutCheckEmailBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutCheckEmailBinding");
                    layoutCheckEmailBinding3 = null;
                }
                layoutCheckEmailBinding3.btVerify.setAlpha(0.3f);
                LayoutCheckEmailBinding layoutCheckEmailBinding4 = this$0.layoutCheckEmailBinding;
                if (layoutCheckEmailBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutCheckEmailBinding");
                } else {
                    layoutCheckEmailBinding2 = layoutCheckEmailBinding4;
                }
                layoutCheckEmailBinding2.btVerify.setClickable(false);
                return;
            }
            LayoutCheckEmailBinding layoutCheckEmailBinding5 = this$0.layoutCheckEmailBinding;
            if (layoutCheckEmailBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutCheckEmailBinding");
                layoutCheckEmailBinding5 = null;
            }
            layoutCheckEmailBinding5.btVerify.setAlpha(1.0f);
            LayoutCheckEmailBinding layoutCheckEmailBinding6 = this$0.layoutCheckEmailBinding;
            if (layoutCheckEmailBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutCheckEmailBinding");
            } else {
                layoutCheckEmailBinding2 = layoutCheckEmailBinding6;
            }
            layoutCheckEmailBinding2.btVerify.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$2(ResetPasswordFragment this$0, Function2 passwordConfirmWatcher, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(passwordConfirmWatcher, "$passwordConfirmWatcher");
        LayoutConfirmPasswordBinding layoutConfirmPasswordBinding = this$0.layoutConfirmPasswordBinding;
        if (layoutConfirmPasswordBinding != null) {
            ResetPasswordViewModel resetPasswordViewModel = null;
            if (layoutConfirmPasswordBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutConfirmPasswordBinding");
                layoutConfirmPasswordBinding = null;
            }
            layoutConfirmPasswordBinding.textInputResetPassword.setError(null);
            LayoutConfirmPasswordBinding layoutConfirmPasswordBinding2 = this$0.layoutConfirmPasswordBinding;
            if (layoutConfirmPasswordBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutConfirmPasswordBinding");
                layoutConfirmPasswordBinding2 = null;
            }
            layoutConfirmPasswordBinding2.textInputPasswordConfirm.setError(null);
            ResetPasswordViewModel resetPasswordViewModel2 = this$0.vm;
            if (resetPasswordViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                resetPasswordViewModel2 = null;
            }
            String value = resetPasswordViewModel2.getPassword().getValue();
            ResetPasswordViewModel resetPasswordViewModel3 = this$0.vm;
            if (resetPasswordViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            } else {
                resetPasswordViewModel = resetPasswordViewModel3;
            }
            passwordConfirmWatcher.invoke(value, resetPasswordViewModel.getPasswordConfirm().getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$3(ResetPasswordFragment this$0, Function2 passwordConfirmWatcher, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(passwordConfirmWatcher, "$passwordConfirmWatcher");
        LayoutConfirmPasswordBinding layoutConfirmPasswordBinding = this$0.layoutConfirmPasswordBinding;
        if (layoutConfirmPasswordBinding != null) {
            ResetPasswordViewModel resetPasswordViewModel = null;
            if (layoutConfirmPasswordBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutConfirmPasswordBinding");
                layoutConfirmPasswordBinding = null;
            }
            layoutConfirmPasswordBinding.textInputResetPassword.setError(null);
            LayoutConfirmPasswordBinding layoutConfirmPasswordBinding2 = this$0.layoutConfirmPasswordBinding;
            if (layoutConfirmPasswordBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutConfirmPasswordBinding");
                layoutConfirmPasswordBinding2 = null;
            }
            layoutConfirmPasswordBinding2.textInputPasswordConfirm.setError(null);
            ResetPasswordViewModel resetPasswordViewModel2 = this$0.vm;
            if (resetPasswordViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                resetPasswordViewModel2 = null;
            }
            String value = resetPasswordViewModel2.getPassword().getValue();
            ResetPasswordViewModel resetPasswordViewModel3 = this$0.vm;
            if (resetPasswordViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            } else {
                resetPasswordViewModel = resetPasswordViewModel3;
            }
            passwordConfirmWatcher.invoke(value, resetPasswordViewModel.getPasswordConfirm().getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$4(final ResetPasswordFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<GetVerifyCodeMessage>() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$addSubscriptions$5$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(GetVerifyCodeMessage data) {
                ResetPasswordFragment$timerRunnable$1 resetPasswordFragment$timerRunnable$1;
                ResetPasswordFragment$timerRunnable$1 resetPasswordFragment$timerRunnable$12;
                super.success((ResetPasswordFragment$addSubscriptions$5$1) data);
                ResetPasswordFragment.this.hideProgress();
                LogUtils.d("GetVerifyCodeMessage Requested Successfully");
                ResetPasswordFragment.access$getBinding(ResetPasswordFragment.this).vp.setCurrentItem(1);
                View view = ResetPasswordFragment.this.getRootView();
                if (view != null) {
                    resetPasswordFragment$timerRunnable$12 = ResetPasswordFragment.this.timerRunnable;
                    view.removeCallbacks(resetPasswordFragment$timerRunnable$12);
                }
                ResetPasswordFragment.this.seconds = 60;
                View view2 = ResetPasswordFragment.this.getRootView();
                if (view2 != null) {
                    resetPasswordFragment$timerRunnable$1 = ResetPasswordFragment.this.timerRunnable;
                    view2.post(resetPasswordFragment$timerRunnable$1);
                }
                ResetPasswordFragment.this.setVerifyCodeSentHint();
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(ResetPasswordFragment.this, SettingsLogEvents.Forgot_Password_Email_Success, null, 2, null);
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                LayoutResetPasswordBinding layoutResetPasswordBinding;
                super.error(e);
                ResetPasswordFragment.this.hideProgress();
                if (e != null) {
                    e.printStackTrace();
                }
                Object[] objArr = new Object[2];
                objArr[0] = "GetVerifyCodeMessage Requested Failure!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                layoutResetPasswordBinding = ResetPasswordFragment.this.layoutResetPasswordBinding;
                if (layoutResetPasswordBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResetPasswordBinding");
                    layoutResetPasswordBinding = null;
                }
                layoutResetPasswordBinding.textInputResetPwdEmail.setError(" ");
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(ResetPasswordFragment.this, SettingsLogEvents.Forgot_Password_Email_Failure, null, 2, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$5(final ResetPasswordFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<CheckVerifyCodeMessage>() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$addSubscriptions$6$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(CheckVerifyCodeMessage data) {
                super.success((ResetPasswordFragment$addSubscriptions$6$1) data);
                LogUtils.d("CheckVerifyCodeMessage Requested Successfully!");
                ResetPasswordFragment.this.hideProgress();
                ResetPasswordFragment.access$getBinding(ResetPasswordFragment.this).vp.setCurrentItem(2);
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(ResetPasswordFragment.this, SettingsLogEvents.Forgot_Password_Verify_Success, null, 2, null);
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                LayoutCheckEmailBinding layoutCheckEmailBinding;
                super.error(e);
                Object[] objArr = new Object[2];
                objArr[0] = "CheckVerifyCodeMessage Requested Failed!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                ResetPasswordFragment.this.hideProgress();
                layoutCheckEmailBinding = ResetPasswordFragment.this.layoutCheckEmailBinding;
                if (layoutCheckEmailBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutCheckEmailBinding");
                    layoutCheckEmailBinding = null;
                }
                layoutCheckEmailBinding.textInputResetPwdVerifyCode.setError(ResUtils.getString(R.string.text_empty_verify_code_content));
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(ResetPasswordFragment.this, SettingsLogEvents.Forgot_Password_Verify_Failure, null, 2, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$6(final ResetPasswordFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<ResetPasswordAndLoginMessage>() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$addSubscriptions$7$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(ResetPasswordAndLoginMessage data) {
                AccountViewModel accountViewModel;
                super.success((ResetPasswordFragment$addSubscriptions$7$1) data);
                if (data == null) {
                    return;
                }
                LogUtils.d("ResetPasswordAndLoginMessage Requested Successfully!");
                AppViewModel.INSTANCE.getInstance().updateUserAndToken(data.getUser(), data.getAccessToken(), data.getUserAdditionalData());
                accountViewModel = ResetPasswordFragment.this.accountViewModel;
                if (accountViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                    accountViewModel = null;
                }
                accountViewModel.getVipCard();
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(ResetPasswordFragment.this, SettingsLogEvents.Forgot_Password_Change_Success, null, 2, null);
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                super.error(e);
                LogUtils.e("ResetPasswordAndLoginMessage Requested Failure!");
                ResetPasswordFragment.this.hideProgress();
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(ResetPasswordFragment.this, SettingsLogEvents.Forgot_Password_Change_Failure, null, 2, null);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initPager() {
        ((FragmentResetPasswordBinding) getBinding()).vp.setNoScroll(true);
        ((FragmentResetPasswordBinding) getBinding()).vp.setAdapter(new ResetPasswordFragment$initPager$1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        ((FragmentResetPasswordBinding) getBinding()).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResetPasswordFragment.initListener$lambda$7(ResetPasswordFragment.this, view);
            }
        });
        ((FragmentResetPasswordBinding) getBinding()).vp.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$initListener$2
            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                String str;
                View childAt = ResetPasswordFragment.access$getBinding(ResetPasswordFragment.this).vp.getChildAt(position);
                if (childAt != null) {
                    childAt.requestFocus();
                }
                ResetPasswordFragment resetPasswordFragment = ResetPasswordFragment.this;
                if (position == 0) {
                    str = SettingsLogEvents.Forgot_Password_Email_Open;
                } else if (position == 1) {
                    str = SettingsLogEvents.Forgot_Password_Verify_Open;
                } else if (position == 2) {
                    str = SettingsLogEvents.Forgot_Password_Change_Open;
                } else {
                    str = "";
                }
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(resetPasswordFragment, str, null, 2, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initListener$lambda$7(ResetPasswordFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, SettingsLogEvents.Forgot_Password_Back, null, 2, null);
        if (((FragmentResetPasswordBinding) this$0.getBinding()).vp.getCurrentItem() == 0) {
            ViewExtensionsKt.navigateUp(this$0);
        } else {
            ((FragmentResetPasswordBinding) this$0.getBinding()).vp.setCurrentItem(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVerifyCodeSentHint() {
        ResetPasswordViewModel resetPasswordViewModel = this.vm;
        LayoutCheckEmailBinding layoutCheckEmailBinding = null;
        if (resetPasswordViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            resetPasswordViewModel = null;
        }
        String value = resetPasswordViewModel.getEmail().getValue();
        if (value == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ResUtils.getString(R.string.reset_pwd_text_send_code_hint, value));
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, value, 0, false, 6, (Object) null);
        Context context = getContext();
        if (context == null) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.Theme)), indexOf$default, value.length() + indexOf$default, 17);
        LayoutCheckEmailBinding layoutCheckEmailBinding2 = this.layoutCheckEmailBinding;
        if (layoutCheckEmailBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutCheckEmailBinding");
        } else {
            layoutCheckEmailBinding = layoutCheckEmailBinding2;
        }
        layoutCheckEmailBinding.tvDescription.setText(spannableStringBuilder2);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        hideProgress();
        super.onDestroy();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        String lowerCase = "ResetPassword".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}

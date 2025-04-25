package com.glority.android.picturexx.settings.fragment.account;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.PagerAdapter;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.databinding.LayoutCheckEmailBinding;
import com.glority.android.picturexx.settings.databinding.LayoutConfirmPasswordBinding;
import com.glority.android.picturexx.settings.databinding.LayoutResetPasswordBinding;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.picturexx.settings.vm.AccountViewModel;
import com.glority.android.picturexx.settings.vm.ResetPasswordViewModel;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.utils.app.ResUtils;
import com.glority.utils.data.RegexUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResetPasswordFragment.kt */
@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"com/glority/android/picturexx/settings/fragment/account/ResetPasswordFragment$initPager$1", "Landroidx/viewpager/widget/PagerAdapter;", "isViewFromObject", "", "view", "Landroid/view/View;", "obj", "", "getCount", "", "destroyItem", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "position", "instantiateItem", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ResetPasswordFragment$initPager$1 extends PagerAdapter {
    final /* synthetic */ ResetPasswordFragment this$0;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResetPasswordFragment$initPager$1(ResetPasswordFragment resetPasswordFragment) {
        this.this$0 = resetPasswordFragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(obj, "obj");
        return Intrinsics.areEqual(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup container, int position, Object obj) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(obj, "obj");
        container.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup container, int position) {
        AccountViewModel accountViewModel;
        ResetPasswordViewModel resetPasswordViewModel;
        View root;
        ResetPasswordViewModel resetPasswordViewModel2;
        ResetPasswordViewModel resetPasswordViewModel3;
        ResetPasswordViewModel resetPasswordViewModel4;
        Intrinsics.checkNotNullParameter(container, "container");
        ResetPasswordViewModel resetPasswordViewModel5 = null;
        if (position == 0) {
            ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(this.this$0.getContext()), R.layout.layout_reset_password, container, true);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            final LayoutResetPasswordBinding layoutResetPasswordBinding = (LayoutResetPasswordBinding) inflate;
            this.this$0.layoutResetPasswordBinding = layoutResetPasswordBinding;
            TextInputEditText textInputEditText = layoutResetPasswordBinding.etEmail;
            accountViewModel = this.this$0.accountViewModel;
            if (accountViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                accountViewModel = null;
            }
            textInputEditText.setText(accountViewModel.getEmail());
            TextInputEditText textInputEditText2 = layoutResetPasswordBinding.etEmail;
            final ResetPasswordFragment resetPasswordFragment = this.this$0;
            textInputEditText2.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$initPager$1$instantiateItem$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable p0) {
                    ResetPasswordViewModel resetPasswordViewModel6;
                    resetPasswordViewModel6 = ResetPasswordFragment.this.vm;
                    if (resetPasswordViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        resetPasswordViewModel6 = null;
                    }
                    resetPasswordViewModel6.getEmail().setValue(String.valueOf(layoutResetPasswordBinding.etEmail.getText()));
                }
            });
            Button button = layoutResetPasswordBinding.btContinue;
            final ResetPasswordFragment resetPasswordFragment2 = this.this$0;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$initPager$1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResetPasswordFragment$initPager$1.instantiateItem$lambda$0(ResetPasswordFragment.this, layoutResetPasswordBinding, view);
                }
            });
            resetPasswordViewModel = this.this$0.vm;
            if (resetPasswordViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            } else {
                resetPasswordViewModel5 = resetPasswordViewModel;
            }
            resetPasswordViewModel5.getEmail().setValue("");
            root = layoutResetPasswordBinding.getRoot();
        } else if (position == 1) {
            ViewDataBinding inflate2 = DataBindingUtil.inflate(LayoutInflater.from(this.this$0.getContext()), R.layout.layout_check_email, container, true);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            final LayoutCheckEmailBinding layoutCheckEmailBinding = (LayoutCheckEmailBinding) inflate2;
            this.this$0.layoutCheckEmailBinding = layoutCheckEmailBinding;
            TextView tvSend = layoutCheckEmailBinding.tvSend;
            Intrinsics.checkNotNullExpressionValue(tvSend, "tvSend");
            final ResetPasswordFragment resetPasswordFragment3 = this.this$0;
            ViewExtensionsKt.setSingleClickListener(tvSend, 600L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$initPager$1$instantiateItem$3
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
                    ResetPasswordViewModel resetPasswordViewModel6;
                    Intrinsics.checkNotNullParameter(it, "it");
                    BaseFragment.logEvent$default(ResetPasswordFragment.this, SettingsLogEvents.Forgot_Password_Verify_Resend, null, 2, null);
                    resetPasswordViewModel6 = ResetPasswordFragment.this.vm;
                    if (resetPasswordViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        resetPasswordViewModel6 = null;
                    }
                    resetPasswordViewModel6.getVerifyCode();
                    BaseFragment.showProgress$default(ResetPasswordFragment.this, null, false, 3, null);
                }
            });
            TextInputEditText textInputEditText3 = layoutCheckEmailBinding.etCode;
            final ResetPasswordFragment resetPasswordFragment4 = this.this$0;
            textInputEditText3.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$initPager$1$instantiateItem$4
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable p0) {
                    ResetPasswordViewModel resetPasswordViewModel6;
                    resetPasswordViewModel6 = ResetPasswordFragment.this.vm;
                    if (resetPasswordViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        resetPasswordViewModel6 = null;
                    }
                    resetPasswordViewModel6.m7814getVerifyCode().setValue(String.valueOf(layoutCheckEmailBinding.etCode.getText()));
                }
            });
            Button btVerify = layoutCheckEmailBinding.btVerify;
            Intrinsics.checkNotNullExpressionValue(btVerify, "btVerify");
            final ResetPasswordFragment resetPasswordFragment5 = this.this$0;
            ViewExtensionsKt.setSingleClickListener(btVerify, 600L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$initPager$1$instantiateItem$5
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
                    ResetPasswordViewModel resetPasswordViewModel6;
                    ResetPasswordViewModel resetPasswordViewModel7;
                    Intrinsics.checkNotNullParameter(it, "it");
                    ResetPasswordViewModel resetPasswordViewModel8 = null;
                    BaseFragment.logEvent$default(ResetPasswordFragment.this, SettingsLogEvents.Forgot_Password_Verify_Verify, null, 2, null);
                    String valueOf = String.valueOf(layoutCheckEmailBinding.etCode.getText());
                    resetPasswordViewModel6 = ResetPasswordFragment.this.vm;
                    if (resetPasswordViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        resetPasswordViewModel6 = null;
                    }
                    resetPasswordViewModel6.m7814getVerifyCode().setValue(valueOf);
                    if (valueOf.length() == 0) {
                        return;
                    }
                    BaseFragment.showProgress$default(ResetPasswordFragment.this, null, false, 3, null);
                    resetPasswordViewModel7 = ResetPasswordFragment.this.vm;
                    if (resetPasswordViewModel7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                    } else {
                        resetPasswordViewModel8 = resetPasswordViewModel7;
                    }
                    resetPasswordViewModel8.checkVerifyCode(valueOf);
                }
            });
            resetPasswordViewModel2 = this.this$0.vm;
            if (resetPasswordViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            } else {
                resetPasswordViewModel5 = resetPasswordViewModel2;
            }
            resetPasswordViewModel5.m7814getVerifyCode().setValue("");
            root = layoutCheckEmailBinding.getRoot();
        } else {
            ViewDataBinding inflate3 = DataBindingUtil.inflate(LayoutInflater.from(this.this$0.getContext()), R.layout.layout_confirm_password, container, true);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
            final LayoutConfirmPasswordBinding layoutConfirmPasswordBinding = (LayoutConfirmPasswordBinding) inflate3;
            this.this$0.layoutConfirmPasswordBinding = layoutConfirmPasswordBinding;
            layoutConfirmPasswordBinding.etPassword.setText("");
            layoutConfirmPasswordBinding.etConfirm.setText("");
            TextInputEditText textInputEditText4 = layoutConfirmPasswordBinding.etPassword;
            final ResetPasswordFragment resetPasswordFragment6 = this.this$0;
            textInputEditText4.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$initPager$1$instantiateItem$6
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable p0) {
                    ResetPasswordViewModel resetPasswordViewModel6;
                    resetPasswordViewModel6 = ResetPasswordFragment.this.vm;
                    if (resetPasswordViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        resetPasswordViewModel6 = null;
                    }
                    resetPasswordViewModel6.getPassword().setValue(String.valueOf(layoutConfirmPasswordBinding.etPassword.getText()));
                }
            });
            TextInputEditText textInputEditText5 = layoutConfirmPasswordBinding.etConfirm;
            final ResetPasswordFragment resetPasswordFragment7 = this.this$0;
            textInputEditText5.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$initPager$1$instantiateItem$7
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable p0) {
                    ResetPasswordViewModel resetPasswordViewModel6;
                    resetPasswordViewModel6 = ResetPasswordFragment.this.vm;
                    if (resetPasswordViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        resetPasswordViewModel6 = null;
                    }
                    resetPasswordViewModel6.getPasswordConfirm().setValue(String.valueOf(layoutConfirmPasswordBinding.etPassword.getText()));
                }
            });
            Button btChangePassword = layoutConfirmPasswordBinding.btChangePassword;
            Intrinsics.checkNotNullExpressionValue(btChangePassword, "btChangePassword");
            final ResetPasswordFragment resetPasswordFragment8 = this.this$0;
            ViewExtensionsKt.setSingleClickListener(btChangePassword, 600L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.ResetPasswordFragment$initPager$1$instantiateItem$8
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
                    AccountViewModel accountViewModel2;
                    ResetPasswordViewModel resetPasswordViewModel6;
                    ResetPasswordViewModel resetPasswordViewModel7;
                    ResetPasswordViewModel resetPasswordViewModel8;
                    ResetPasswordViewModel resetPasswordViewModel9;
                    ResetPasswordViewModel resetPasswordViewModel10;
                    Intrinsics.checkNotNullParameter(it, "it");
                    BaseFragment.logEvent$default(ResetPasswordFragment.this, SettingsLogEvents.Forgot_Password_Change_Change_Password, null, 2, null);
                    String valueOf = String.valueOf(layoutConfirmPasswordBinding.etPassword.getText());
                    String valueOf2 = String.valueOf(layoutConfirmPasswordBinding.etConfirm.getText());
                    if (valueOf.length() == 0) {
                        layoutConfirmPasswordBinding.textInputResetPassword.setError(ResUtils.getString(R.string.text_empty_password_content));
                        return;
                    }
                    if (valueOf.length() < 6) {
                        layoutConfirmPasswordBinding.textInputResetPassword.setError(ResUtils.getString(R.string.text_invalid_password_content));
                        return;
                    }
                    if (Intrinsics.areEqual(valueOf, valueOf2)) {
                        accountViewModel2 = ResetPasswordFragment.this.accountViewModel;
                        if (accountViewModel2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                            accountViewModel2 = null;
                        }
                        accountViewModel2.setPassword(valueOf);
                        resetPasswordViewModel6 = ResetPasswordFragment.this.vm;
                        if (resetPasswordViewModel6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("vm");
                            resetPasswordViewModel6 = null;
                        }
                        resetPasswordViewModel6.getPassword().setValue(valueOf);
                        resetPasswordViewModel7 = ResetPasswordFragment.this.vm;
                        if (resetPasswordViewModel7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("vm");
                            resetPasswordViewModel7 = null;
                        }
                        resetPasswordViewModel8 = ResetPasswordFragment.this.vm;
                        if (resetPasswordViewModel8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("vm");
                            resetPasswordViewModel8 = null;
                        }
                        String value = resetPasswordViewModel8.getEmail().getValue();
                        if (value == null) {
                            value = "";
                        }
                        resetPasswordViewModel9 = ResetPasswordFragment.this.vm;
                        if (resetPasswordViewModel9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("vm");
                            resetPasswordViewModel9 = null;
                        }
                        String value2 = resetPasswordViewModel9.m7814getVerifyCode().getValue();
                        if (value2 == null) {
                            value2 = "";
                        }
                        resetPasswordViewModel10 = ResetPasswordFragment.this.vm;
                        if (resetPasswordViewModel10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("vm");
                            resetPasswordViewModel10 = null;
                        }
                        String value3 = resetPasswordViewModel10.getPassword().getValue();
                        resetPasswordViewModel7.resetUserPassWord(value, value2, value3 != null ? value3 : "");
                        BaseFragment.showProgress$default(ResetPasswordFragment.this, null, false, 3, null);
                        return;
                    }
                    layoutConfirmPasswordBinding.textInputPasswordConfirm.setError(ResUtils.getString(R.string.text_different_password_content));
                }
            });
            resetPasswordViewModel3 = this.this$0.vm;
            if (resetPasswordViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                resetPasswordViewModel3 = null;
            }
            resetPasswordViewModel3.getPassword().setValue("");
            resetPasswordViewModel4 = this.this$0.vm;
            if (resetPasswordViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            } else {
                resetPasswordViewModel5 = resetPasswordViewModel4;
            }
            resetPasswordViewModel5.getPasswordConfirm().setValue("");
            root = layoutConfirmPasswordBinding.getRoot();
        }
        Intrinsics.checkNotNull(root);
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void instantiateItem$lambda$0(ResetPasswordFragment this$0, LayoutResetPasswordBinding binding, View view) {
        AccountViewModel accountViewModel;
        ResetPasswordViewModel resetPasswordViewModel;
        ResetPasswordViewModel resetPasswordViewModel2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        ResetPasswordFragment resetPasswordFragment = this$0;
        BaseFragment.logEvent$default(resetPasswordFragment, SettingsLogEvents.Forgot_Password_Email_Continue, null, 2, null);
        String valueOf = String.valueOf(binding.etEmail.getText());
        if (RegexUtils.isEmail(valueOf)) {
            accountViewModel = this$0.accountViewModel;
            if (accountViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                accountViewModel = null;
            }
            accountViewModel.setEmail(valueOf);
            resetPasswordViewModel = this$0.vm;
            if (resetPasswordViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                resetPasswordViewModel = null;
            }
            resetPasswordViewModel.getEmail().setValue(valueOf);
            resetPasswordViewModel2 = this$0.vm;
            if (resetPasswordViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                resetPasswordViewModel2 = null;
            }
            resetPasswordViewModel2.getVerifyCode();
            BaseFragment.showProgress$default(resetPasswordFragment, null, false, 3, null);
            return;
        }
        binding.textInputResetPwdEmail.setError(ResUtils.getString(R.string.text_invalid_email_address_content));
    }
}

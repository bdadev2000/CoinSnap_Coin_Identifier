package com.glority.android.picturexx.settings.fragment.account;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.databinding.FragmentSignUpBinding;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.picturexx.settings.vm.AccountViewModel;
import com.glority.android.picturexx.settings.vm.SignUpViewModel;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.routers.OpenAccountActivityRequest;
import com.glority.base.utils.PolicyViewUtil;
import com.glority.base.utils.data.ResponseUtil;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginOrCreateMessage;
import com.glority.network.model.Resource;
import com.glority.utils.app.ResUtils;
import com.glority.utils.data.RegexUtils;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SignUpFragment.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\u001c\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/account/SignUpFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/settings/databinding/FragmentSignUpBinding;", "<init>", "()V", "accountViewModel", "Lcom/glority/android/picturexx/settings/vm/AccountViewModel;", "vm", "Lcom/glority/android/picturexx/settings/vm/SignUpViewModel;", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "addSubscriptions", "initListener", "inputWatcher", "email", "", HintConstants.AUTOFILL_HINT_PASSWORD, "onDestroy", "getLogPageName", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SignUpFragment extends BaseFragment<FragmentSignUpBinding> {
    private AccountViewModel accountViewModel;
    private SignUpViewModel vm;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentSignUpBinding access$getBinding(SignUpFragment signUpFragment) {
        return (FragmentSignUpBinding) signUpFragment.getBinding();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_sign_up;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.Signup_Page, null, 2, null);
        this.accountViewModel = (AccountViewModel) getSharedViewModel(AccountViewModel.class);
        this.vm = (SignUpViewModel) getViewModel(SignUpViewModel.class);
        initView();
        addSubscriptions();
        initListener();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        TextInputEditText textInputEditText = ((FragmentSignUpBinding) getBinding()).etEmail;
        AccountViewModel accountViewModel = this.accountViewModel;
        AccountViewModel accountViewModel2 = null;
        if (accountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            accountViewModel = null;
        }
        textInputEditText.setText(accountViewModel.getEmail());
        SignUpViewModel signUpViewModel = this.vm;
        if (signUpViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            signUpViewModel = null;
        }
        MutableLiveData<String> email = signUpViewModel.getEmail();
        AccountViewModel accountViewModel3 = this.accountViewModel;
        if (accountViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
        } else {
            accountViewModel2 = accountViewModel3;
        }
        email.setValue(accountViewModel2.getEmail());
        String string = ResUtils.getString(R.string.login_text_terms);
        String string2 = ResUtils.getString(R.string.login_text_policy);
        String string3 = ResUtils.getString(R.string.login_text_private_policy_desc, ResUtils.getString(R.string.app_name), string, string2);
        TextView textView = ((FragmentSignUpBinding) getBinding()).tvPrivacyPolicy;
        PolicyViewUtil policyViewUtil = PolicyViewUtil.INSTANCE;
        Intrinsics.checkNotNull(string3);
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNull(string2);
        textView.setText(policyViewUtil.setSSB(string3, string, string2));
        ((FragmentSignUpBinding) getBinding()).tvPrivacyPolicy.setMovementMethod(LinkMovementMethod.getInstance());
        String string4 = ResUtils.getString(R.string.login_text_to_login_desc);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string4 + " " + ResUtils.getString(R.string.setting_text_sign_in));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ResUtils.getColor(R.color.Theme)), string4.length(), spannableStringBuilder.length(), 33);
        ((FragmentSignUpBinding) getBinding()).tvLogin.setText(spannableStringBuilder);
    }

    private final void addSubscriptions() {
        SignUpViewModel signUpViewModel = this.vm;
        SignUpViewModel signUpViewModel2 = null;
        if (signUpViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            signUpViewModel = null;
        }
        SignUpFragment signUpFragment = this;
        signUpViewModel.getEmail().observe(signUpFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.SignUpFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SignUpFragment.addSubscriptions$lambda$0(SignUpFragment.this, (String) obj);
            }
        });
        SignUpViewModel signUpViewModel3 = this.vm;
        if (signUpViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            signUpViewModel3 = null;
        }
        signUpViewModel3.getPassword().observe(signUpFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.SignUpFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SignUpFragment.addSubscriptions$lambda$1(SignUpFragment.this, (String) obj);
            }
        });
        SignUpViewModel signUpViewModel4 = this.vm;
        if (signUpViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        } else {
            signUpViewModel2 = signUpViewModel4;
        }
        signUpViewModel2.getObservable(LoginOrCreateMessage.class).observe(signUpFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.SignUpFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SignUpFragment.addSubscriptions$lambda$2(SignUpFragment.this, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$0(SignUpFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SignUpViewModel signUpViewModel = this$0.vm;
        if (signUpViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            signUpViewModel = null;
        }
        this$0.inputWatcher(str, signUpViewModel.getPassword().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$1(SignUpFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SignUpViewModel signUpViewModel = this$0.vm;
        if (signUpViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            signUpViewModel = null;
        }
        this$0.inputWatcher(signUpViewModel.getEmail().getValue(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$2(SignUpFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new SignUpFragment$addSubscriptions$3$1(this$0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        ImageView ivBack = ((FragmentSignUpBinding) getBinding()).ivBack;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        ViewExtensionsKt.setSingleClickListener$default(ivBack, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.SignUpFragment$initListener$1
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
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SignUpFragment.this, SettingsLogEvents.Signup_Back, null, 2, null);
                ViewExtensionsKt.navigateUp(SignUpFragment.this);
            }
        }, 1, (Object) null);
        TextView tvLogin = ((FragmentSignUpBinding) getBinding()).tvLogin;
        Intrinsics.checkNotNullExpressionValue(tvLogin, "tvLogin");
        ViewExtensionsKt.setSingleClickListener$default(tvLogin, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.SignUpFragment$initListener$2
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
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SignUpFragment.this, SettingsLogEvents.Signup_Signin, null, 2, null);
                new OpenAccountActivityRequest(null, null, 3, null).post();
                FragmentActivity activity = SignUpFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }, 1, (Object) null);
        Button btSignup = ((FragmentSignUpBinding) getBinding()).btSignup;
        Intrinsics.checkNotNullExpressionValue(btSignup, "btSignup");
        ViewExtensionsKt.setSingleClickListener$default(btSignup, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.SignUpFragment$initListener$3
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
                SignUpViewModel signUpViewModel;
                SignUpViewModel signUpViewModel2;
                Intrinsics.checkNotNullParameter(it, "it");
                SignUpViewModel signUpViewModel3 = null;
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SignUpFragment.this, SettingsLogEvents.Signup_Button_Signup, null, 2, null);
                String valueOf = String.valueOf(SignUpFragment.access$getBinding(SignUpFragment.this).etEmail.getText());
                if (RegexUtils.isEmail(valueOf)) {
                    signUpViewModel = SignUpFragment.this.vm;
                    if (signUpViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        signUpViewModel = null;
                    }
                    signUpViewModel.getEmail().setValue(valueOf);
                    String valueOf2 = String.valueOf(SignUpFragment.access$getBinding(SignUpFragment.this).etPassword.getText());
                    if (valueOf2.length() == 0) {
                        SignUpFragment.access$getBinding(SignUpFragment.this).textLayoutPassword.setError(ResUtils.getString(R.string.text_empty_password_content));
                        return;
                    }
                    if (valueOf2.length() < 6) {
                        SignUpFragment.access$getBinding(SignUpFragment.this).textLayoutPassword.setError(ResUtils.getString(R.string.text_invalid_password_content));
                        return;
                    }
                    com.glority.android.ui.base.v2.BaseFragment.showProgress$default(SignUpFragment.this, null, false, 3, null);
                    signUpViewModel2 = SignUpFragment.this.vm;
                    if (signUpViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                    } else {
                        signUpViewModel3 = signUpViewModel2;
                    }
                    signUpViewModel3.signUpWithEmail(String.valueOf(SignUpFragment.access$getBinding(SignUpFragment.this).etEmail.getText()), String.valueOf(SignUpFragment.access$getBinding(SignUpFragment.this).etPassword.getText()));
                    return;
                }
                SignUpFragment.access$getBinding(SignUpFragment.this).textLayoutEmail.setError(ResUtils.getString(R.string.text_invalid_email_address_content));
            }
        }, 1, (Object) null);
        ((FragmentSignUpBinding) getBinding()).etEmail.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.settings.fragment.account.SignUpFragment$initListener$4
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable p0) {
                SignUpViewModel signUpViewModel;
                signUpViewModel = SignUpFragment.this.vm;
                if (signUpViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    signUpViewModel = null;
                }
                signUpViewModel.getEmail().setValue(String.valueOf(SignUpFragment.access$getBinding(SignUpFragment.this).etEmail.getText()));
            }
        });
        ((FragmentSignUpBinding) getBinding()).etPassword.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.settings.fragment.account.SignUpFragment$initListener$5
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable p0) {
                SignUpViewModel signUpViewModel;
                signUpViewModel = SignUpFragment.this.vm;
                if (signUpViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    signUpViewModel = null;
                }
                signUpViewModel.getPassword().setValue(String.valueOf(SignUpFragment.access$getBinding(SignUpFragment.this).etPassword.getText()));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void inputWatcher(String email, String password) {
        String str;
        ((FragmentSignUpBinding) getBinding()).textLayoutEmail.setError(null);
        ((FragmentSignUpBinding) getBinding()).textLayoutPassword.setError(null);
        String str2 = email;
        if (str2 != null && str2.length() != 0 && (str = password) != null && str.length() != 0 && password.length() >= 6) {
            ((FragmentSignUpBinding) getBinding()).btSignup.setClickable(true);
            ((FragmentSignUpBinding) getBinding()).btSignup.setAlpha(1.0f);
        } else {
            ((FragmentSignUpBinding) getBinding()).btSignup.setClickable(false);
            ((FragmentSignUpBinding) getBinding()).btSignup.setAlpha(0.3f);
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        hideProgress();
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.Signup_Page_Close, null, 2, null);
        super.onDestroy();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "signup";
    }
}

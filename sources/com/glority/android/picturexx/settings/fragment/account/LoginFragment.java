package com.glority.android.picturexx.settings.fragment.account;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.settings.AccountActivity;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.databinding.FragmentLoginBinding;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.picturexx.settings.utils.GoogleLoginUtil;
import com.glority.android.picturexx.settings.vm.AccountViewModel;
import com.glority.android.picturexx.settings.vm.LoginViewModel;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.PolicyViewUtil;
import com.glority.base.utils.data.DefaultResponseHandler;
import com.glority.base.utils.data.ResponseUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.ErrorCodes;
import com.glority.component.generatedAPI.kotlinAPI.enums.LoginType;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginOrCreateMessage;
import com.glority.network.exception.NetworkException;
import com.glority.network.model.Resource;
import com.glority.utils.app.ResUtils;
import com.glority.utils.data.RegexUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u001c\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/account/LoginFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/settings/databinding/FragmentLoginBinding;", "<init>", "()V", "accountViewModel", "Lcom/glority/android/picturexx/settings/vm/AccountViewModel;", "vm", "Lcom/glority/android/picturexx/settings/vm/LoginViewModel;", "isGoogleLogin", "", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "initListener", "addSubscriptions", "inputWatcher", "email", "", HintConstants.AUTOFILL_HINT_PASSWORD, "handleLoginError", "e", "", "onDestroy", "getLogPageName", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class LoginFragment extends BaseFragment<FragmentLoginBinding> {
    private AccountViewModel accountViewModel;
    private boolean isGoogleLogin;
    private LoginViewModel vm;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentLoginBinding access$getBinding(LoginFragment loginFragment) {
        return (FragmentLoginBinding) loginFragment.getBinding();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        FragmentActivity activity;
        Intent intent;
        LoginFragment loginFragment = this;
        LoginViewModel loginViewModel = null;
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(loginFragment, SettingsLogEvents.Login_Page, null, 2, null);
        this.accountViewModel = (AccountViewModel) getSharedViewModel(AccountViewModel.class);
        this.vm = (LoginViewModel) getViewModel(LoginViewModel.class);
        initView();
        initListener();
        addSubscriptions();
        if (!AppViewModel.INSTANCE.getInstance().isUserGuest() && (activity = getActivity()) != null && (intent = activity.getIntent()) != null && !intent.getBooleanExtra(AccountActivity.tagForceShowLogin, false)) {
            ViewExtensionsKt.navigate$default(this, R.id.account_fragment, null, null, null, 14, null);
        }
        AccountViewModel accountViewModel = this.accountViewModel;
        if (accountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            accountViewModel = null;
        }
        if (accountViewModel.getIsPasswordReset()) {
            com.glority.android.ui.base.v2.BaseFragment.showProgress$default(loginFragment, null, false, 3, null);
            LoginViewModel loginViewModel2 = this.vm;
            if (loginViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                loginViewModel2 = null;
            }
            LoginInfo loginInfo = new LoginInfo(0, 1, null);
            AccountViewModel accountViewModel2 = this.accountViewModel;
            if (accountViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                accountViewModel2 = null;
            }
            loginInfo.setLoginKey(accountViewModel2.getEmail());
            AccountViewModel accountViewModel3 = this.accountViewModel;
            if (accountViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                accountViewModel3 = null;
            }
            loginInfo.setLoginPassword(accountViewModel3.getPassword());
            loginInfo.setLoginType(LoginType.EMAIL);
            loginViewModel2.setLoginInfo(loginInfo);
            LoginViewModel loginViewModel3 = this.vm;
            if (loginViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                loginViewModel3 = null;
            }
            LoginViewModel loginViewModel4 = this.vm;
            if (loginViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            } else {
                loginViewModel = loginViewModel4;
            }
            loginViewModel3.loginWithEmail(loginViewModel.getLoginInfo());
        }
        ((FragmentLoginBinding) getBinding()).etEmail.setText("");
        ((FragmentLoginBinding) getBinding()).etPassword.setText("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("enableGoogleLogin"), "true")) {
            ((FragmentLoginBinding) getBinding()).llThirdPartyLogin.setVisibility(0);
        } else {
            ((FragmentLoginBinding) getBinding()).llThirdPartyLogin.setVisibility(8);
        }
        ((FragmentLoginBinding) getBinding()).textInputLayoutPassword.setEndIconDrawable(R.drawable.pwd_eye_selector);
        TextInputEditText textInputEditText = ((FragmentLoginBinding) getBinding()).etEmail;
        AccountViewModel accountViewModel = this.accountViewModel;
        AccountViewModel accountViewModel2 = null;
        if (accountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
            accountViewModel = null;
        }
        textInputEditText.setText(accountViewModel.getEmail());
        TextInputEditText textInputEditText2 = ((FragmentLoginBinding) getBinding()).etPassword;
        AccountViewModel accountViewModel3 = this.accountViewModel;
        if (accountViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
        } else {
            accountViewModel2 = accountViewModel3;
        }
        textInputEditText2.setText(accountViewModel2.getPassword());
        String string = ResUtils.getString(R.string.login_text_terms);
        String string2 = ResUtils.getString(R.string.login_text_policy);
        String string3 = ResUtils.getString(R.string.login_text_private_policy_desc, ResUtils.getString(R.string.app_name), string, string2);
        TextView textView = ((FragmentLoginBinding) getBinding()).tvPrivacyPolicy;
        PolicyViewUtil policyViewUtil = PolicyViewUtil.INSTANCE;
        Intrinsics.checkNotNull(string3);
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNull(string2);
        textView.setText(policyViewUtil.setSSB(string3, string, string2));
        ((FragmentLoginBinding) getBinding()).tvPrivacyPolicy.setMovementMethod(LinkMovementMethod.getInstance());
        String string4 = ResUtils.getString(R.string.login_text_to_signup_desc);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string4 + " " + ResUtils.getString(R.string.login_text_sign_up));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ResUtils.getColor(R.color.Theme)), string4.length(), spannableStringBuilder.length(), 33);
        ((FragmentLoginBinding) getBinding()).tvSignUp.setText(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        ((FragmentLoginBinding) getBinding()).etEmail.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$initListener$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable p0) {
                LoginViewModel loginViewModel;
                loginViewModel = LoginFragment.this.vm;
                if (loginViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    loginViewModel = null;
                }
                loginViewModel.getEmail().setValue(String.valueOf(LoginFragment.access$getBinding(LoginFragment.this).etEmail.getText()));
            }
        });
        ((FragmentLoginBinding) getBinding()).etPassword.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$initListener$2
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable p0) {
                LoginViewModel loginViewModel;
                loginViewModel = LoginFragment.this.vm;
                if (loginViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    loginViewModel = null;
                }
                loginViewModel.getPassword().setValue(String.valueOf(LoginFragment.access$getBinding(LoginFragment.this).etPassword.getText()));
            }
        });
        ((FragmentLoginBinding) getBinding()).tvSignUp.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginFragment.initListener$lambda$1(LoginFragment.this, view);
            }
        });
        ((FragmentLoginBinding) getBinding()).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginFragment.initListener$lambda$2(LoginFragment.this, view);
            }
        });
        Button btLogin = ((FragmentLoginBinding) getBinding()).btLogin;
        Intrinsics.checkNotNullExpressionValue(btLogin, "btLogin");
        ViewExtensionsKt.setSingleClickListener(btLogin, 600L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$initListener$5
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
                AccountViewModel accountViewModel;
                LoginViewModel loginViewModel;
                LoginViewModel loginViewModel2;
                LoginViewModel loginViewModel3;
                Intrinsics.checkNotNullParameter(it, "it");
                LoginViewModel loginViewModel4 = null;
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(LoginFragment.this, SettingsLogEvents.Login_Button_Login, null, 2, null);
                LoginFragment.this.isGoogleLogin = false;
                String valueOf = String.valueOf(LoginFragment.access$getBinding(LoginFragment.this).etEmail.getText());
                String valueOf2 = String.valueOf(LoginFragment.access$getBinding(LoginFragment.this).etPassword.getText());
                if (!RegexUtils.isEmail(valueOf)) {
                    LoginFragment.access$getBinding(LoginFragment.this).textInputLayoutEmail.setError(ResUtils.getString(R.string.text_invalid_email_address_content));
                    return;
                }
                if (valueOf2.length() == 0) {
                    LoginFragment.access$getBinding(LoginFragment.this).textInputLayoutPassword.setError(ResUtils.getString(R.string.text_empty_password_content));
                    return;
                }
                if (valueOf2.length() < 6) {
                    LoginFragment.access$getBinding(LoginFragment.this).textInputLayoutPassword.setError(ResUtils.getString(R.string.text_invalid_password_content));
                    return;
                }
                com.glority.android.ui.base.v2.BaseFragment.showProgress$default(LoginFragment.this, null, false, 3, null);
                accountViewModel = LoginFragment.this.accountViewModel;
                if (accountViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                    accountViewModel = null;
                }
                accountViewModel.setEmail(valueOf);
                loginViewModel = LoginFragment.this.vm;
                if (loginViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    loginViewModel = null;
                }
                LoginInfo loginInfo = new LoginInfo(0, 1, null);
                loginInfo.setLoginKey(valueOf);
                loginInfo.setLoginPassword(valueOf2);
                loginInfo.setLoginType(LoginType.EMAIL);
                loginViewModel.setLoginInfo(loginInfo);
                loginViewModel2 = LoginFragment.this.vm;
                if (loginViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    loginViewModel2 = null;
                }
                loginViewModel3 = LoginFragment.this.vm;
                if (loginViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                } else {
                    loginViewModel4 = loginViewModel3;
                }
                loginViewModel2.loginWithEmail(loginViewModel4.getLoginInfo());
            }
        });
        ((FragmentLoginBinding) getBinding()).tvForgot.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginFragment.initListener$lambda$3(LoginFragment.this, view);
            }
        });
        LinearLayout llContinueWithTitle = ((FragmentLoginBinding) getBinding()).llContinueWithTitle;
        Intrinsics.checkNotNullExpressionValue(llContinueWithTitle, "llContinueWithTitle");
        ViewExtensionsKt.setSingleClickListener$default(llContinueWithTitle, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$initListener$7
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
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(LoginFragment.this, SettingsLogEvents.Login_Continue_With, null, 2, null);
                if (LoginFragment.access$getBinding(LoginFragment.this).llLoginWithGoogle.getVisibility() == 0) {
                    LoginFragment.access$getBinding(LoginFragment.this).llLoginWithGoogle.setVisibility(8);
                    LoginFragment.access$getBinding(LoginFragment.this).ivThirdPartyLoginArrow.setRotation(180.0f);
                } else if (LoginFragment.access$getBinding(LoginFragment.this).llLoginWithGoogle.getVisibility() == 8) {
                    LoginFragment.access$getBinding(LoginFragment.this).llLoginWithGoogle.setVisibility(0);
                    LoginFragment.access$getBinding(LoginFragment.this).ivThirdPartyLoginArrow.setRotation(0.0f);
                }
            }
        }, 1, (Object) null);
        LinearLayout llLoginWithGoogle = ((FragmentLoginBinding) getBinding()).llLoginWithGoogle;
        Intrinsics.checkNotNullExpressionValue(llLoginWithGoogle, "llLoginWithGoogle");
        ViewExtensionsKt.setSingleClickListener$default(llLoginWithGoogle, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$initListener$8
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
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(LoginFragment.this, SettingsLogEvents.Login_Third_Party_Login, null, 2, null);
                LoginFragment.this.isGoogleLogin = true;
                com.glority.android.ui.base.v2.BaseFragment.showProgress$default(LoginFragment.this, null, false, 3, null);
                GoogleLoginUtil googleLoginUtil = GoogleLoginUtil.INSTANCE;
                LoginFragment loginFragment = LoginFragment.this;
                final LoginFragment loginFragment2 = LoginFragment.this;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$initListener$8.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        LoginViewModel loginViewModel;
                        GoogleSignInAccount googleSignInAccount = GoogleLoginUtil.INSTANCE.getGoogleSignInAccount(LoginFragment.this.getContext());
                        LoginViewModel loginViewModel2 = null;
                        if ((googleSignInAccount != null ? googleSignInAccount.getId() : null) != null) {
                            loginViewModel = LoginFragment.this.vm;
                            if (loginViewModel == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("vm");
                            } else {
                                loginViewModel2 = loginViewModel;
                            }
                            loginViewModel2.loginWithGoogleAccount(googleSignInAccount);
                            return;
                        }
                        ToastUtils.showShort(R.string.text_login_fail);
                        LoginFragment.this.hideProgress();
                    }
                };
                final LoginFragment loginFragment3 = LoginFragment.this;
                googleLoginUtil.signIn(loginFragment, function0, new Function0<Unit>() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$initListener$8.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        LoginFragment.this.hideProgress();
                        ToastUtils.showShort(R.string.text_login_fail);
                    }
                });
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$1(LoginFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, SettingsLogEvents.Login_Sign_Up, null, 2, null);
        ViewExtensionsKt.navigate$default(this$0, R.id.sign_up_fragment, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$2(LoginFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, SettingsLogEvents.Login_Button_Back, null, 2, null);
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$3(LoginFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, SettingsLogEvents.Login_Forget_Password, null, 2, null);
        ViewExtensionsKt.navigate$default(this$0, R.id.reset_password_fragment, null, null, null, 14, null);
    }

    private final void addSubscriptions() {
        LoginViewModel loginViewModel = this.vm;
        LoginViewModel loginViewModel2 = null;
        if (loginViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            loginViewModel = null;
        }
        LoginFragment loginFragment = this;
        loginViewModel.getEmail().observe(loginFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                LoginFragment.addSubscriptions$lambda$4(LoginFragment.this, (String) obj);
            }
        });
        LoginViewModel loginViewModel3 = this.vm;
        if (loginViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            loginViewModel3 = null;
        }
        loginViewModel3.getPassword().observe(loginFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                LoginFragment.addSubscriptions$lambda$5(LoginFragment.this, (String) obj);
            }
        });
        LoginViewModel loginViewModel4 = this.vm;
        if (loginViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        } else {
            loginViewModel2 = loginViewModel4;
        }
        loginViewModel2.getObservable(LoginOrCreateMessage.class).observe(loginFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                LoginFragment.addSubscriptions$lambda$6(LoginFragment.this, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addSubscriptions$lambda$4(LoginFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.inputWatcher(str, String.valueOf(((FragmentLoginBinding) this$0.getBinding()).etPassword.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addSubscriptions$lambda$5(LoginFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.inputWatcher(String.valueOf(((FragmentLoginBinding) this$0.getBinding()).etEmail.getText()), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptions$lambda$6(final LoginFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<LoginOrCreateMessage>() { // from class: com.glority.android.picturexx.settings.fragment.account.LoginFragment$addSubscriptions$3$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(LoginOrCreateMessage data) {
                LoginViewModel loginViewModel;
                AccountViewModel accountViewModel;
                super.success((LoginFragment$addSubscriptions$3$1) data);
                LogUtils.d("LoginOrCreateMessage Requested Successfully!");
                if (data == null) {
                    return;
                }
                AppViewModel.INSTANCE.getInstance().updateUserAndToken(data.getUser(), data.getAccessToken(), data.getUserAdditionalData());
                AppViewModel companion = AppViewModel.INSTANCE.getInstance();
                loginViewModel = LoginFragment.this.vm;
                if (loginViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    loginViewModel = null;
                }
                companion.updateLoginInfo(loginViewModel.getLoginInfo());
                accountViewModel = LoginFragment.this.accountViewModel;
                if (accountViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accountViewModel");
                    accountViewModel = null;
                }
                accountViewModel.getVipCard();
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(LoginFragment.this, SettingsLogEvents.Login_Success, null, 2, null);
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                super.error(e);
                Object[] objArr = new Object[2];
                objArr[0] = "LoginOrCreateMessage Requested Failure!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                LoginFragment.this.handleLoginError(e);
                LoginFragment.this.hideProgress();
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(LoginFragment.this, SettingsLogEvents.Login_Failure, null, 2, null);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void inputWatcher(String email, String password) {
        String str;
        ((FragmentLoginBinding) getBinding()).textInputLayoutEmail.setError(null);
        ((FragmentLoginBinding) getBinding()).textInputLayoutPassword.setError(null);
        String str2 = email;
        if (str2 == null || str2.length() == 0 || (str = password) == null || str.length() == 0 || password.length() < 6) {
            ((FragmentLoginBinding) getBinding()).btLogin.setAlpha(0.3f);
            ((FragmentLoginBinding) getBinding()).btLogin.setClickable(false);
        } else {
            ((FragmentLoginBinding) getBinding()).btLogin.setAlpha(1.0f);
            ((FragmentLoginBinding) getBinding()).btLogin.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void handleLoginError(Throwable e) {
        if (e == null) {
            return;
        }
        if (this.isGoogleLogin) {
            ToastUtils.showShort(R.string.text_login_fail);
            return;
        }
        if (e instanceof NetworkException) {
            NetworkException networkException = (NetworkException) e;
            LogUtils.d("Log in Error Code: " + networkException.getCode());
            int code = networkException.getCode();
            if (code == ErrorCodes.USER_EMAIL_FORMAT_ERROR.getValue()) {
                ((FragmentLoginBinding) getBinding()).textInputLayoutEmail.setError(ResUtils.getString(R.string.text_invalid_email_address_title));
                return;
            } else if (code == ErrorCodes.USER_PASSWORD_ERROR.getValue()) {
                ((FragmentLoginBinding) getBinding()).textInputLayoutEmail.setError(" ");
                ((FragmentLoginBinding) getBinding()).textInputLayoutPassword.setError(ResUtils.getString(R.string.text_incorrect_email_password));
                return;
            } else {
                ((FragmentLoginBinding) getBinding()).textInputLayoutEmail.setError(" ");
                ((FragmentLoginBinding) getBinding()).textInputLayoutPassword.setError(ResUtils.getString(R.string.text_failed));
                return;
            }
        }
        ToastUtils.showShort(R.string.error_text_internal_error);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        hideProgress();
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.Login_Page_Close, null, 2, null);
        super.onDestroy();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return FirebaseAnalytics.Event.LOGIN;
    }
}

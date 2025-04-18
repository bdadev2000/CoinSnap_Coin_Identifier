package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.j;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

/* loaded from: classes3.dex */
public class LoginFragment extends Fragment {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String EXTRA_REQUEST = "request";

    @NotNull
    private static final String NULL_CALLING_PKG_ERROR_MSG = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";

    @NotNull
    public static final String REQUEST_KEY = "com.facebook.LoginFragment:Request";

    @NotNull
    public static final String RESULT_KEY = "com.facebook.LoginFragment:Result";

    @NotNull
    private static final String SAVED_LOGIN_CLIENT = "loginClient";

    @NotNull
    private static final String TAG = "LoginFragment";

    @Nullable
    private String callingPackage;
    private ActivityResultLauncher<Intent> launcher;
    private LoginClient loginClient;
    private View progressBar;

    @Nullable
    private LoginClient.Request request;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    private final l getLoginMethodHandlerCallback(FragmentActivity fragmentActivity) {
        return new LoginFragment$getLoginMethodHandlerCallback$1(this, fragmentActivity);
    }

    public final void hideSpinner() {
        View view = this.progressBar;
        if (view == null) {
            p0.a.B0("progressBar");
            throw null;
        }
        view.setVisibility(8);
        onSpinnerHidden();
    }

    private final void initializeCallingPackage(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.callingPackage = callingActivity.getPackageName();
    }

    /* renamed from: onCreate$lambda-0 */
    public static final void m566onCreate$lambda0(LoginFragment loginFragment, LoginClient.Result result) {
        p0.a.s(loginFragment, "this$0");
        p0.a.s(result, "outcome");
        loginFragment.onLoginClientCompleted(result);
    }

    /* renamed from: onCreate$lambda-1 */
    public static final void m567onCreate$lambda1(l lVar, ActivityResult activityResult) {
        p0.a.s(lVar, "$tmp0");
        lVar.invoke(activityResult);
    }

    private final void onLoginClientCompleted(LoginClient.Result result) {
        this.request = null;
        int i2 = result.code == LoginClient.Result.Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESULT_KEY, result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        FragmentActivity activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i2, intent);
        activity.finish();
    }

    public final void showSpinner() {
        View view = this.progressBar;
        if (view == null) {
            p0.a.B0("progressBar");
            throw null;
        }
        view.setVisibility(0);
        onSpinnerShown();
    }

    @NotNull
    public LoginClient createLoginClient() {
        return new LoginClient(this);
    }

    @NotNull
    public final ActivityResultLauncher<Intent> getLauncher() {
        ActivityResultLauncher<Intent> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            return activityResultLauncher;
        }
        p0.a.B0("launcher");
        throw null;
    }

    @LayoutRes
    public int getLayoutResId() {
        return com.facebook.common.R.layout.com_facebook_login_fragment;
    }

    @NotNull
    public final LoginClient getLoginClient() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        p0.a.B0(SAVED_LOGIN_CLIENT);
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        getLoginClient().onActivityResult(i2, i3, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        LoginClient loginClient = bundle == null ? null : (LoginClient) bundle.getParcelable(SAVED_LOGIN_CLIENT);
        if (loginClient != null) {
            loginClient.setFragment(this);
        } else {
            loginClient = createLoginClient();
        }
        this.loginClient = loginClient;
        getLoginClient().setOnCompletedListener(new j(this, 6));
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        initializeCallingPackage(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra(REQUEST_KEY)) != null) {
            this.request = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new Object(), new com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.manager.a(getLoginMethodHandlerCallback(activity)));
        p0.a.r(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.launcher = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        p0.a.s(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(getLayoutResId(), viewGroup, false);
        View findViewById = inflate.findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar);
        p0.a.r(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.progressBar = findViewById;
        getLoginClient().setBackgroundProcessingListener(new LoginClient.BackgroundProcessingListener() { // from class: com.facebook.login.LoginFragment$onCreateView$1
            @Override // com.facebook.login.LoginClient.BackgroundProcessingListener
            public void onBackgroundProcessingStarted() {
                LoginFragment.this.showSpinner();
            }

            @Override // com.facebook.login.LoginClient.BackgroundProcessingListener
            public void onBackgroundProcessingStopped() {
                LoginFragment.this.hideSpinner();
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getLoginClient().cancelCurrentHandler();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View findViewById = view == null ? null : view.findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.callingPackage != null) {
            getLoginClient().startOrContinueAuth(this.request);
            return;
        }
        Log.e(TAG, NULL_CALLING_PKG_ERROR_MSG);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        p0.a.s(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(SAVED_LOGIN_CLIENT, getLoginClient());
    }

    public void onSpinnerHidden() {
    }

    public void onSpinnerShown() {
    }
}

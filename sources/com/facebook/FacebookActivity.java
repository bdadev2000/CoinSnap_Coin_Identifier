package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.logging.dumpsys.EndToEndDumper;
import com.facebook.login.LoginFragment;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class FacebookActivity extends FragmentActivity {

    @NotNull
    private static final String FRAGMENT_TAG = "SingleFragment";

    @NotNull
    public static final String PASS_THROUGH_CANCEL_ACTION = "PassThrough";

    @Nullable
    private Fragment currentFragment;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final String TAG = FacebookActivity.class.getName();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    private final void handlePassThroughError() {
        Intent intent = getIntent();
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        p0.a.r(intent, "requestIntent");
        FacebookException exceptionFromErrorData = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getMethodArgumentsFromIntent(intent));
        Intent intent2 = getIntent();
        p0.a.r(intent2, SDKConstants.PARAM_INTENT);
        setResult(0, NativeProtocol.createProtocolResultIntent(intent2, null, exceptionFromErrorData));
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(BuildConfig.LIBRARY_PACKAGE_NAME, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void dump(@NotNull String str, @Nullable FileDescriptor fileDescriptor, @NotNull PrintWriter printWriter, @Nullable String[] strArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(str, "prefix");
            p0.a.s(printWriter, "writer");
            EndToEndDumper companion = EndToEndDumper.Companion.getInstance();
            if (p0.a.g(companion == null ? null : Boolean.valueOf(companion.maybeDump(str, printWriter, strArr)), Boolean.TRUE)) {
                return;
            }
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Nullable
    public final Fragment getCurrentFragment() {
        return this.currentFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.internal.FacebookDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment] */
    @NotNull
    public Fragment getFragment() {
        LoginFragment loginFragment;
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        p0.a.r(supportFragmentManager, "supportFragmentManager");
        Fragment D = supportFragmentManager.D(FRAGMENT_TAG);
        if (D != null) {
            return D;
        }
        if (p0.a.g(FacebookDialogFragment.TAG, intent.getAction())) {
            ?? facebookDialogFragment = new FacebookDialogFragment();
            facebookDialogFragment.setRetainInstance(true);
            facebookDialogFragment.show(supportFragmentManager, FRAGMENT_TAG);
            loginFragment = facebookDialogFragment;
        } else {
            LoginFragment loginFragment2 = new LoginFragment();
            loginFragment2.setRetainInstance(true);
            FragmentTransaction d = supportFragmentManager.d();
            d.f(com.facebook.common.R.id.com_facebook_fragment_container, loginFragment2, FRAGMENT_TAG, 1);
            d.c();
            loginFragment = loginFragment2;
        }
        return loginFragment;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        p0.a.s(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.currentFragment;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!FacebookSdk.isInitialized()) {
            Utility utility = Utility.INSTANCE;
            Utility.logd(TAG, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            p0.a.r(applicationContext, "applicationContext");
            FacebookSdk.sdkInitialize(applicationContext);
        }
        setContentView(com.facebook.common.R.layout.com_facebook_activity_layout);
        if (p0.a.g(PASS_THROUGH_CANCEL_ACTION, intent.getAction())) {
            handlePassThroughError();
        } else {
            this.currentFragment = getFragment();
        }
    }
}

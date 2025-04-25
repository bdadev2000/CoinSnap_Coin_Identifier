package com.glority.android.picturexx.settings.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.glority.base.config.ConfigConstants;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.presenter.IResultManager;
import com.glority.network.util.HttpState;
import com.glority.utils.stability.LogUtils;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoogleLoginUtil.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/glority/android/picturexx/settings/utils/GoogleLoginUtil;", "", "<init>", "()V", "signIn", "", "fragment", "Lcom/glority/base/fragment/BaseFragment;", "success", "Lkotlin/Function0;", HttpState.FAIL, "getGoogleSignInAccount", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "context", "Landroid/content/Context;", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class GoogleLoginUtil {
    public static final GoogleLoginUtil INSTANCE = new GoogleLoginUtil();

    private GoogleLoginUtil() {
    }

    public final void signIn(BaseFragment<?> fragment, final Function0<Unit> success, final Function0<Unit> fail) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        if (getGoogleSignInAccount(fragment != null ? fragment.getContext() : null) != null) {
            success.invoke();
            return;
        }
        GoogleSignInOptions build = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(ConfigConstants.INSTANCE.getGOOGLE_WEB_CLIENT_ID()).requestEmail().build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        Intent signInIntent = GoogleSignIn.getClient((Activity) activity, build).getSignInIntent();
        Intrinsics.checkNotNullExpressionValue(signInIntent, "getSignInIntent(...)");
        fragment.requestResult(signInIntent, 22, new IResultManager.OnResultListener() { // from class: com.glority.android.picturexx.settings.utils.GoogleLoginUtil$signIn$1
            @Override // com.glority.base.presenter.IResultManager.OnResultListener
            public void onResult(int resultCode, Intent data) {
                Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(data);
                Intrinsics.checkNotNullExpressionValue(signedInAccountFromIntent, "getSignedInAccountFromIntent(...)");
                try {
                    signedInAccountFromIntent.getResult(ApiException.class);
                    success.invoke();
                } catch (ApiException e) {
                    LogUtils.w("signInResult:failed code=" + e.getStatusCode());
                    fail.invoke();
                }
            }
        });
    }

    public final GoogleSignInAccount getGoogleSignInAccount(Context context) {
        if (context == null) {
            return null;
        }
        return GoogleSignIn.getLastSignedInAccount(context);
    }
}

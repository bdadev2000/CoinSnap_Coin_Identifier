package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import b1.f0;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.ContextSwitchDialog;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.facebook.gamingservices.model.ContextSwitchContent;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ContextSwitchDialog extends FacebookDialogBase<ContextSwitchContent, Result> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GamingContextSwitch.toRequestCode();

    @Nullable
    private FacebookCallback<Result> callback;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class FacebookAppHandler extends FacebookDialogBase<ContextSwitchContent, Result>.ModeHandler {
        final /* synthetic */ ContextSwitchDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookAppHandler(ContextSwitchDialog contextSwitchDialog) {
            super(contextSwitchDialog);
            p0.a.s(contextSwitchDialog, "this$0");
            this.this$0 = contextSwitchDialog;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(@NotNull ContextSwitchContent contextSwitchContent, boolean z2) {
            p0.a.s(contextSwitchContent, "content");
            Activity activityContext = this.this$0.getActivityContext();
            PackageManager packageManager = activityContext == null ? null : activityContext.getPackageManager();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            boolean z3 = (packageManager == null ? null : intent.resolveActivity(packageManager)) != null;
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            return z3 && ((currentAccessToken != null ? currentAccessToken.getGraphDomain() : null) != null && p0.a.g(FacebookSdk.GAMING, currentAccessToken.getGraphDomain()));
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        @NotNull
        public AppCall createAppCall(@NotNull ContextSwitchContent contextSwitchContent) {
            p0.a.s(contextSwitchContent, "content");
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Bundle c2 = androidx.compose.foundation.text.input.a.c(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, "CONTEXT_SWITCH");
            if (currentAccessToken != null) {
                c2.putString("game_id", currentAccessToken.getApplicationId());
            } else {
                c2.putString("game_id", FacebookSdk.getApplicationId());
            }
            if (contextSwitchContent.getContextID() != null) {
                c2.putString("context_token_id", contextSwitchContent.getContextID());
            }
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            NativeProtocol.setupProtocolRequestIntent(intent, createBaseAppCall.getCallId().toString(), "", NativeProtocol.getLatestKnownVersion(), c2);
            createBaseAppCall.setRequestIntent(intent);
            return createBaseAppCall;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Result {

        @Nullable
        private String contextID;

        public Result(@NotNull String str) {
            p0.a.s(str, "contextID");
            this.contextID = str;
        }

        @Nullable
        public final String getContextID() {
            return this.contextID;
        }

        public final void setContextID(@Nullable String str) {
            this.contextID = str;
        }

        public Result(@NotNull GraphResponse graphResponse) {
            JSONObject optJSONObject;
            p0.a.s(graphResponse, "response");
            try {
                JSONObject jSONObject = graphResponse.getJSONObject();
                if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    setContextID(optJSONObject.getString("id"));
                }
            } catch (JSONException unused) {
                this.contextID = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class WebHandler extends FacebookDialogBase<ContextSwitchContent, Result>.ModeHandler {
        final /* synthetic */ ContextSwitchDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebHandler(ContextSwitchDialog contextSwitchDialog) {
            super(contextSwitchDialog);
            p0.a.s(contextSwitchDialog, "this$0");
            this.this$0 = contextSwitchDialog;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(@NotNull ContextSwitchContent contextSwitchContent, boolean z2) {
            p0.a.s(contextSwitchContent, "content");
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        @NotNull
        public AppCall createAppCall(@NotNull ContextSwitchContent contextSwitchContent) {
            p0.a.s(contextSwitchContent, "content");
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            Bundle bundle = new Bundle();
            bundle.putString(SDKConstants.PARAM_CONTEXT_CONTEXT_ID, contextSwitchContent.getContextID());
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            if (currentAccessToken != null) {
                bundle.putString("dialog_access_token", currentAccessToken.getToken());
            }
            DialogPresenter.setupAppCallForWebDialog(createBaseAppCall, "context", bundle);
            return createBaseAppCall;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextSwitchDialog(@NotNull Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
        p0.a.s(activity, "activity");
    }

    /* renamed from: registerCallbackImpl$lambda-3 */
    public static final boolean m509registerCallbackImpl$lambda3(ContextSwitchDialog contextSwitchDialog, ResultProcessor resultProcessor, int i2, Intent intent) {
        p0.a.s(contextSwitchDialog, "this$0");
        p0.a.s(resultProcessor, "$resultProcessor");
        ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
        return ShareInternalUtility.handleActivityResult(contextSwitchDialog.getRequestCode(), i2, intent, resultProcessor);
    }

    private final void showForCloud(ContextSwitchContent contextSwitchContent) {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to open ContextSwitchContent with an invalid access token");
        }
        j jVar = new j(this, 5);
        String contextID = contextSwitchContent.getContextID();
        if (contextID == null) {
            FacebookCallback<Result> facebookCallback = this.callback;
            if (facebookCallback == null) {
                return;
            }
            facebookCallback.onError(new FacebookException("Required string contextID not provided."));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", contextID);
            DaemonRequest.executeAsync(getActivityContext(), jSONObject, jVar, SDKMessageEnum.CONTEXT_SWITCH);
        } catch (JSONException unused) {
            FacebookCallback<Result> facebookCallback2 = this.callback;
            if (facebookCallback2 == null) {
                return;
            }
            facebookCallback2.onError(new FacebookException("Couldn't prepare Context Switch Dialog"));
        }
    }

    /* renamed from: showForCloud$lambda-2 */
    public static final void m510showForCloud$lambda2(ContextSwitchDialog contextSwitchDialog, GraphResponse graphResponse) {
        b0 b0Var;
        p0.a.s(contextSwitchDialog, "this$0");
        FacebookCallback<Result> facebookCallback = contextSwitchDialog.callback;
        if (facebookCallback == null) {
            return;
        }
        FacebookRequestError error = graphResponse.getError();
        if (error == null) {
            b0Var = null;
        } else {
            facebookCallback.onError(new FacebookException(error.getErrorMessage()));
            b0Var = b0.f30125a;
        }
        if (b0Var == null) {
            facebookCallback.onSuccess(new Result(graphResponse));
        }
    }

    @Override // com.facebook.internal.FacebookDialogBase
    @NotNull
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), null, 2, null);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    @NotNull
    public List<FacebookDialogBase<ContextSwitchContent, Result>.ModeHandler> getOrderedModeHandlers() {
        return f0.v(new FacebookAppHandler(this), new WebHandler(this));
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(@NotNull CallbackManagerImpl callbackManagerImpl, @NotNull FacebookCallback<Result> facebookCallback) {
        p0.a.s(callbackManagerImpl, "callbackManager");
        p0.a.s(facebookCallback, "callback");
        this.callback = facebookCallback;
        callbackManagerImpl.registerCallback(getRequestCode(), new a(this, new ResultProcessor(facebookCallback) { // from class: com.facebook.gamingservices.ContextSwitchDialog$registerCallbackImpl$resultProcessor$1
            final /* synthetic */ FacebookCallback<ContextSwitchDialog.Result> $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(facebookCallback);
                this.$callback = facebookCallback;
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(@NotNull AppCall appCall, @Nullable Bundle bundle) {
                p0.a.s(appCall, "appCall");
                if (bundle == null) {
                    onCancel(appCall);
                    return;
                }
                if (bundle.getString("error_message") != null) {
                    this.$callback.onError(new FacebookException(bundle.getString("error_message")));
                    return;
                }
                String string = bundle.getString("id");
                String string2 = bundle.getString(SDKConstants.PARAM_CONTEXT_CONTEXT_ID);
                if (string != null) {
                    GamingContext.Companion.setCurrentGamingContext(new GamingContext(string));
                    this.$callback.onSuccess(new ContextSwitchDialog.Result(string));
                } else if (string2 != null) {
                    GamingContext.Companion.setCurrentGamingContext(new GamingContext(string2));
                    this.$callback.onSuccess(new ContextSwitchDialog.Result(string2));
                }
                this.$callback.onError(new FacebookException(bundle.getString("Invalid response received from server.")));
            }
        }, 2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextSwitchDialog(@NotNull Fragment fragment) {
        this(new FragmentWrapper(fragment));
        p0.a.s(fragment, "fragment");
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public boolean canShow(@NotNull ContextSwitchContent contextSwitchContent) {
        p0.a.s(contextSwitchContent, "content");
        return CloudGameLoginHandler.isRunningInCloud() || new FacebookAppHandler(this).canShow(contextSwitchContent, true) || new WebHandler(this).canShow(contextSwitchContent, true);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(@NotNull ContextSwitchContent contextSwitchContent, @NotNull Object obj) {
        p0.a.s(contextSwitchContent, "content");
        p0.a.s(obj, "mode");
        if (CloudGameLoginHandler.isRunningInCloud()) {
            showForCloud(contextSwitchContent);
        } else {
            super.showImpl((ContextSwitchDialog) contextSwitchContent, obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextSwitchDialog(@NotNull android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
        p0.a.s(fragment, "fragment");
    }

    private ContextSwitchDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }
}

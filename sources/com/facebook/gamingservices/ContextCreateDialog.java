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
import com.facebook.gamingservices.ContextCreateDialog;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.facebook.gamingservices.model.ContextCreateContent;
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

/* loaded from: classes.dex */
public final class ContextCreateDialog extends FacebookDialogBase<ContextCreateContent, Result> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GamingContextCreate.toRequestCode();

    @Nullable
    private FacebookCallback<Result> callback;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class FacebookAppHandler extends FacebookDialogBase<ContextCreateContent, Result>.ModeHandler {
        final /* synthetic */ ContextCreateDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookAppHandler(ContextCreateDialog contextCreateDialog) {
            super(contextCreateDialog);
            p0.a.s(contextCreateDialog, "this$0");
            this.this$0 = contextCreateDialog;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(@NotNull ContextCreateContent contextCreateContent, boolean z2) {
            p0.a.s(contextCreateContent, "content");
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
        public AppCall createAppCall(@NotNull ContextCreateContent contextCreateContent) {
            p0.a.s(contextCreateContent, "content");
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Bundle c2 = androidx.compose.foundation.text.input.a.c(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, "CONTEXT_CREATE");
            if (currentAccessToken != null) {
                c2.putString("game_id", currentAccessToken.getApplicationId());
            } else {
                c2.putString("game_id", FacebookSdk.getApplicationId());
            }
            if (contextCreateContent.getSuggestedPlayerID() != null) {
                c2.putString("player_id", contextCreateContent.getSuggestedPlayerID());
            }
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            NativeProtocol.setupProtocolRequestIntent(intent, createBaseAppCall.getCallId().toString(), "", NativeProtocol.getLatestKnownVersion(), c2);
            createBaseAppCall.setRequestIntent(intent);
            return createBaseAppCall;
        }
    }

    /* loaded from: classes.dex */
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

    /* loaded from: classes.dex */
    public final class WebHandler extends FacebookDialogBase<ContextCreateContent, Result>.ModeHandler {
        final /* synthetic */ ContextCreateDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebHandler(ContextCreateDialog contextCreateDialog) {
            super(contextCreateDialog);
            p0.a.s(contextCreateDialog, "this$0");
            this.this$0 = contextCreateDialog;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(@NotNull ContextCreateContent contextCreateContent, boolean z2) {
            p0.a.s(contextCreateContent, "content");
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        @NotNull
        public AppCall createAppCall(@NotNull ContextCreateContent contextCreateContent) {
            p0.a.s(contextCreateContent, "content");
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            Bundle bundle = new Bundle();
            bundle.putString("player_id", contextCreateContent.getSuggestedPlayerID());
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            if (currentAccessToken != null) {
                bundle.putString("dialog_access_token", currentAccessToken.getToken());
            }
            DialogPresenter.setupAppCallForWebDialog(createBaseAppCall, "context", bundle);
            return createBaseAppCall;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextCreateDialog(@NotNull Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
        p0.a.s(activity, "activity");
    }

    /* renamed from: registerCallbackImpl$lambda-3 */
    public static final boolean m507registerCallbackImpl$lambda3(ContextCreateDialog contextCreateDialog, ResultProcessor resultProcessor, int i2, Intent intent) {
        p0.a.s(contextCreateDialog, "this$0");
        p0.a.s(resultProcessor, "$resultProcessor");
        ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
        return ShareInternalUtility.handleActivityResult(contextCreateDialog.getRequestCode(), i2, intent, resultProcessor);
    }

    private final void showForCloud(ContextCreateContent contextCreateContent) {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to open ContextCreateContent with an invalid access token");
        }
        j jVar = new j(this, 4);
        JSONObject jSONObject = new JSONObject();
        try {
            if (contextCreateContent.getSuggestedPlayerID() != null) {
                jSONObject.put("id", contextCreateContent.getSuggestedPlayerID());
            }
            DaemonRequest.executeAsync(getActivityContext(), jSONObject, jVar, SDKMessageEnum.CONTEXT_CREATE);
        } catch (JSONException unused) {
            FacebookCallback<Result> facebookCallback = this.callback;
            if (facebookCallback == null) {
                return;
            }
            facebookCallback.onError(new FacebookException("Couldn't prepare Context Create Dialog"));
        }
    }

    /* renamed from: showForCloud$lambda-2 */
    public static final void m508showForCloud$lambda2(ContextCreateDialog contextCreateDialog, GraphResponse graphResponse) {
        b0 b0Var;
        p0.a.s(contextCreateDialog, "this$0");
        FacebookCallback<Result> facebookCallback = contextCreateDialog.callback;
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
    public List<FacebookDialogBase<ContextCreateContent, Result>.ModeHandler> getOrderedModeHandlers() {
        return f0.v(new FacebookAppHandler(this), new WebHandler(this));
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(@NotNull CallbackManagerImpl callbackManagerImpl, @NotNull FacebookCallback<Result> facebookCallback) {
        p0.a.s(callbackManagerImpl, "callbackManager");
        p0.a.s(facebookCallback, "callback");
        this.callback = facebookCallback;
        callbackManagerImpl.registerCallback(getRequestCode(), new a(this, new ResultProcessor(facebookCallback) { // from class: com.facebook.gamingservices.ContextCreateDialog$registerCallbackImpl$resultProcessor$1
            final /* synthetic */ FacebookCallback<ContextCreateDialog.Result> $callback;

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
                    this.$callback.onSuccess(new ContextCreateDialog.Result(string));
                } else if (string2 != null) {
                    GamingContext.Companion.setCurrentGamingContext(new GamingContext(string2));
                    this.$callback.onSuccess(new ContextCreateDialog.Result(string2));
                }
                this.$callback.onError(new FacebookException(bundle.getString("Invalid response received from server.")));
            }
        }, 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextCreateDialog(@NotNull Fragment fragment) {
        this(new FragmentWrapper(fragment));
        p0.a.s(fragment, "fragment");
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public boolean canShow(@NotNull ContextCreateContent contextCreateContent) {
        p0.a.s(contextCreateContent, "content");
        return CloudGameLoginHandler.isRunningInCloud() || new FacebookAppHandler(this).canShow(contextCreateContent, true) || new WebHandler(this).canShow(contextCreateContent, true);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(@NotNull ContextCreateContent contextCreateContent, @NotNull Object obj) {
        p0.a.s(contextCreateContent, "content");
        p0.a.s(obj, "mode");
        if (CloudGameLoginHandler.isRunningInCloud()) {
            showForCloud(contextCreateContent);
        } else {
            super.showImpl((ContextCreateDialog) contextCreateContent, obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextCreateDialog(@NotNull android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
        p0.a.s(fragment, "fragment");
    }

    private ContextCreateDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }
}

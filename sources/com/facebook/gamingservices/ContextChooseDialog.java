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
import com.facebook.gamingservices.ContextChooseDialog;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.facebook.gamingservices.model.ContextChooseContent;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import d0.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ContextChooseDialog extends FacebookDialogBase<ContextChooseContent, Result> {

    @NotNull
    private static final String CONTEXT_CHOOSE_DIALOG = "context_choose";

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GamingContextChoose.toRequestCode();

    @Nullable
    private FacebookCallback<Result> callback;

    /* loaded from: classes2.dex */
    public final class ChromeCustomTabHandler extends FacebookDialogBase<ContextChooseContent, Result>.ModeHandler {
        final /* synthetic */ ContextChooseDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChromeCustomTabHandler(ContextChooseDialog contextChooseDialog) {
            super(contextChooseDialog);
            p0.a.s(contextChooseDialog, "this$0");
            this.this$0 = contextChooseDialog;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(@NotNull ContextChooseContent contextChooseContent, boolean z2) {
            p0.a.s(contextChooseContent, "content");
            return CustomTabUtils.getChromePackage() != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        @NotNull
        public AppCall createAppCall(@NotNull ContextChooseContent contextChooseContent) {
            p0.a.s(contextChooseContent, "content");
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = new Bundle();
            String applicationId = currentAccessToken == null ? null : currentAccessToken.getApplicationId();
            if (applicationId == null) {
                applicationId = FacebookSdk.getApplicationId();
            }
            bundle.putString("app_id", applicationId);
            if (contextChooseContent.getMinSize() != null) {
                bundle3.putString("min_size", contextChooseContent.getMinSize().toString());
            }
            if (contextChooseContent.getMaxSize() != null) {
                bundle3.putString("max_size", contextChooseContent.getMaxSize().toString());
            }
            if (contextChooseContent.getFilters() != null) {
                bundle3.putString("filters", new JSONArray((Collection) contextChooseContent.getFilters()).toString());
            }
            bundle2.putString("filters", bundle3.toString());
            bundle.putString("payload", bundle2.toString());
            bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, CustomTabUtils.getDefaultRedirectURI());
            DialogPresenter.setupAppCallForCustomTabDialog(createBaseAppCall, ContextChooseDialog.CONTEXT_CHOOSE_DIALOG, bundle);
            return createBaseAppCall;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class FacebookAppHandler extends FacebookDialogBase<ContextChooseContent, Result>.ModeHandler {
        final /* synthetic */ ContextChooseDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookAppHandler(ContextChooseDialog contextChooseDialog) {
            super(contextChooseDialog);
            p0.a.s(contextChooseDialog, "this$0");
            this.this$0 = contextChooseDialog;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(@NotNull ContextChooseContent contextChooseContent, boolean z2) {
            p0.a.s(contextChooseContent, "content");
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
        public AppCall createAppCall(@NotNull ContextChooseContent contextChooseContent) {
            p0.a.s(contextChooseContent, "content");
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Bundle c2 = androidx.compose.foundation.text.input.a.c(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, "CONTEXT_CHOOSE");
            if (currentAccessToken != null) {
                c2.putString("game_id", currentAccessToken.getApplicationId());
            } else {
                c2.putString("game_id", FacebookSdk.getApplicationId());
            }
            if (contextChooseContent.getMinSize() != null) {
                c2.putString("min_thread_size", contextChooseContent.getMinSize().toString());
            }
            if (contextChooseContent.getMaxSize() != null) {
                c2.putString("max_thread_size", contextChooseContent.getMaxSize().toString());
            }
            if (contextChooseContent.getFilters() != null) {
                c2.putString("filters", new JSONArray((Collection) contextChooseContent.getFilters()).toString());
            }
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            NativeProtocol.setupProtocolRequestIntent(intent, createBaseAppCall.getCallId().toString(), "", NativeProtocol.getLatestKnownVersion(), c2);
            createBaseAppCall.setRequestIntent(intent);
            return createBaseAppCall;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextChooseDialog(@NotNull Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
        p0.a.s(activity, "activity");
    }

    public static /* synthetic */ void b(ContextChooseDialog contextChooseDialog, GraphResponse graphResponse) {
        m506showForCloud$lambda2(contextChooseDialog, graphResponse);
    }

    /* renamed from: registerCallbackImpl$lambda-4 */
    public static final boolean m505registerCallbackImpl$lambda4(ContextChooseDialog contextChooseDialog, ContextChooseDialog$registerCallbackImpl$resultProcessor$1 contextChooseDialog$registerCallbackImpl$resultProcessor$1, int i2, Intent intent) {
        p0.a.s(contextChooseDialog, "this$0");
        p0.a.s(contextChooseDialog$registerCallbackImpl$resultProcessor$1, "$resultProcessor");
        ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
        return ShareInternalUtility.handleActivityResult(contextChooseDialog.getRequestCode(), i2, intent, contextChooseDialog$registerCallbackImpl$resultProcessor$1);
    }

    private final void showForCloud(ContextChooseContent contextChooseContent) {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to open ContextChooseContent with an invalid access token");
        }
        j jVar = new j(this, 3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("filters", contextChooseContent.getFilters());
            jSONObject.put(SDKConstants.PARAM_CONTEXT_MIN_SIZE, contextChooseContent.getMinSize());
            List<String> filters = contextChooseContent.getFilters();
            if (filters != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = filters.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("filters", jSONArray);
            }
            DaemonRequest.executeAsync(getActivityContext(), jSONObject, jVar, SDKMessageEnum.CONTEXT_CHOOSE);
        } catch (JSONException unused) {
            FacebookCallback<Result> facebookCallback = this.callback;
            if (facebookCallback == null) {
                return;
            }
            facebookCallback.onError(new FacebookException("Couldn't prepare Context Choose Dialog"));
        }
    }

    /* renamed from: showForCloud$lambda-2 */
    public static final void m506showForCloud$lambda2(ContextChooseDialog contextChooseDialog, GraphResponse graphResponse) {
        b0 b0Var;
        p0.a.s(contextChooseDialog, "this$0");
        FacebookCallback<Result> facebookCallback = contextChooseDialog.callback;
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
        return new AppCall(getRequestCode(), null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    @NotNull
    public List<FacebookDialogBase<ContextChooseContent, Result>.ModeHandler> getOrderedModeHandlers() {
        return f0.v(new FacebookAppHandler(this), new ChromeCustomTabHandler(this));
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(@NotNull CallbackManagerImpl callbackManagerImpl, @NotNull FacebookCallback<Result> facebookCallback) {
        p0.a.s(callbackManagerImpl, "callbackManager");
        p0.a.s(facebookCallback, "callback");
        this.callback = facebookCallback;
        callbackManagerImpl.registerCallback(getRequestCode(), new a(this, new ResultProcessor(facebookCallback) { // from class: com.facebook.gamingservices.ContextChooseDialog$registerCallbackImpl$resultProcessor$1
            final /* synthetic */ FacebookCallback<ContextChooseDialog.Result> $callback;

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
                if (string != null) {
                    GamingContext.Companion.setCurrentGamingContext(new GamingContext(string));
                    this.$callback.onSuccess(new ContextChooseDialog.Result(bundle));
                }
                this.$callback.onError(new FacebookException(bundle.getString("Invalid response received from server.")));
            }
        }, 0));
    }

    /* loaded from: classes2.dex */
    public static final class Result {

        @Nullable
        private String contextID;

        public Result(@NotNull Bundle bundle) {
            p0.a.s(bundle, "results");
            this.contextID = bundle.getString("id");
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextChooseDialog(@NotNull Fragment fragment) {
        this(new FragmentWrapper(fragment));
        p0.a.s(fragment, "fragment");
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public boolean canShow(@NotNull ContextChooseContent contextChooseContent) {
        p0.a.s(contextChooseContent, "content");
        return CloudGameLoginHandler.isRunningInCloud() || new FacebookAppHandler(this).canShow(contextChooseContent, true) || new ChromeCustomTabHandler(this).canShow(contextChooseContent, true);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(@NotNull ContextChooseContent contextChooseContent, @NotNull Object obj) {
        p0.a.s(contextChooseContent, "content");
        p0.a.s(obj, "mode");
        if (CloudGameLoginHandler.isRunningInCloud()) {
            showForCloud(contextChooseContent);
        } else {
            super.showImpl((ContextChooseDialog) contextChooseContent, obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextChooseDialog(@NotNull android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
        p0.a.s(fragment, "fragment");
    }

    private ContextChooseDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }
}

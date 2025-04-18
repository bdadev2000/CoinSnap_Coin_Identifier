package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import b1.f0;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.TournamentJoinDialog;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.TournamentJoinDialogURIBuilder;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@AutoHandleExceptions
/* loaded from: classes.dex */
public final class TournamentJoinDialog extends FacebookDialogBase<String, Result> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.TournamentJoinDialog.toRequestCode();

    @NotNull
    private static final String JOIN_TOURNAMENT_ACCESS_TOKEN_KEY = "access_token";

    @NotNull
    private static final String JOIN_TOURNAMENT_ACTION = "com.facebook.games.gaming_services.DEEPLINK";

    @NotNull
    private static final String JOIN_TOURNAMENT_CONTENT_TYPE = "text/plain";

    @NotNull
    private static final String JOIN_TOURNAMENT_DIALOG = "join_tournament";

    @NotNull
    private static final String JOIN_TOURNAMENT_ERROR_MESSAGE_KEY = "error_message";

    @Nullable
    private String payload;

    @Nullable
    private Number requestID;

    @Nullable
    private String tournamentID;

    /* loaded from: classes.dex */
    public final class ChromeCustomTabHandler extends FacebookDialogBase<String, Result>.ModeHandler {
        final /* synthetic */ TournamentJoinDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChromeCustomTabHandler(TournamentJoinDialog tournamentJoinDialog) {
            super(tournamentJoinDialog);
            p0.a.s(tournamentJoinDialog, "this$0");
            this.this$0 = tournamentJoinDialog;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(@Nullable String str, boolean z2) {
            return CustomTabUtils.getChromePackage() != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        @NotNull
        public AppCall createAppCall(@Nullable String str) {
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            String applicationId = currentAccessToken == null ? null : currentAccessToken.getApplicationId();
            if (applicationId == null) {
                applicationId = FacebookSdk.getApplicationId();
            }
            bundle.putString("app_id", applicationId);
            bundle.putString("payload", bundle2.toString());
            if (currentAccessToken != null) {
                currentAccessToken.getToken();
            }
            bundle.putString("access_token", currentAccessToken != null ? currentAccessToken.getToken() : null);
            bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, CustomTabUtils.getDefaultRedirectURI());
            DialogPresenter.setupAppCallForCustomTabDialog(createBaseAppCall, TournamentJoinDialog.JOIN_TOURNAMENT_DIALOG, bundle);
            return createBaseAppCall;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class FacebookAppHandler extends FacebookDialogBase<String, Result>.ModeHandler {
        final /* synthetic */ TournamentJoinDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookAppHandler(TournamentJoinDialog tournamentJoinDialog) {
            super(tournamentJoinDialog);
            p0.a.s(tournamentJoinDialog, "this$0");
            this.this$0 = tournamentJoinDialog;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(@Nullable String str, boolean z2) {
            PackageManager packageManager = FacebookSdk.getApplicationContext().getPackageManager();
            p0.a.r(packageManager, "FacebookSdk.getApplicationContext().packageManager");
            Intent intent = new Intent(TournamentJoinDialog.JOIN_TOURNAMENT_ACTION);
            intent.setType(TournamentJoinDialog.JOIN_TOURNAMENT_CONTENT_TYPE);
            return intent.resolveActivity(packageManager) != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        @NotNull
        public AppCall createAppCall(@Nullable String str) {
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            Intent intent = new Intent(TournamentJoinDialog.JOIN_TOURNAMENT_ACTION);
            intent.setType(TournamentJoinDialog.JOIN_TOURNAMENT_CONTENT_TYPE);
            if (currentAccessToken != null && !currentAccessToken.isExpired()) {
                if (currentAccessToken.getGraphDomain() != null && !p0.a.g(FacebookSdk.GAMING, currentAccessToken.getGraphDomain())) {
                    throw new FacebookException("Attempted to present TournamentJoinDialog while user is not gaming logged in");
                }
                Bundle bundle$facebook_gamingservices_release = TournamentJoinDialogURIBuilder.INSTANCE.bundle$facebook_gamingservices_release(currentAccessToken.getApplicationId(), this.this$0.tournamentID, this.this$0.payload);
                NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
                NativeProtocol.setupProtocolRequestIntent(intent, createBaseAppCall.getCallId().toString(), "", NativeProtocol.PROTOCOL_VERSION_20210906, bundle$facebook_gamingservices_release);
                createBaseAppCall.setRequestIntent(intent);
                return createBaseAppCall;
            }
            throw new FacebookException("Attempted to present TournamentJoinDialog with an invalid access token");
        }
    }

    /* loaded from: classes.dex */
    public static final class Result {

        @Nullable
        private String payload;

        @Nullable
        private String requestID;

        @Nullable
        private String tournamentID;

        public Result(@NotNull Bundle bundle) {
            p0.a.s(bundle, "results");
            if (bundle.getString("request") != null) {
                this.requestID = bundle.getString("request");
            }
            this.tournamentID = bundle.getString(SDKConstants.PARAM_TOURNAMENTS_ID);
            this.payload = bundle.getString("payload");
        }

        @Nullable
        public final String getPayload() {
            return this.payload;
        }

        @Nullable
        public final String getRequestID() {
            return this.requestID;
        }

        @Nullable
        public final String getTournamentID() {
            return this.tournamentID;
        }

        public final void setPayload(@Nullable String str) {
            this.payload = str;
        }

        public final void setRequestID(@Nullable String str) {
            this.requestID = str;
        }

        public final void setTournamentID(@Nullable String str) {
            this.tournamentID = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TournamentJoinDialog(@NotNull Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
        p0.a.s(activity, "activity");
    }

    /* renamed from: registerCallbackImpl$lambda-0 */
    public static final boolean m512registerCallbackImpl$lambda0(TournamentJoinDialog tournamentJoinDialog, ResultProcessor resultProcessor, int i2, Intent intent) {
        p0.a.s(tournamentJoinDialog, "this$0");
        p0.a.s(resultProcessor, "$resultProcessor");
        ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
        return ShareInternalUtility.handleActivityResult(tournamentJoinDialog.getRequestCode(), i2, intent, resultProcessor);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    @NotNull
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), null, 2, null);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    @NotNull
    public List<FacebookDialogBase<String, Result>.ModeHandler> getOrderedModeHandlers() {
        return f0.v(new FacebookAppHandler(this), new ChromeCustomTabHandler(this));
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(@NotNull CallbackManagerImpl callbackManagerImpl, @NotNull FacebookCallback<Result> facebookCallback) {
        p0.a.s(callbackManagerImpl, "callbackManager");
        p0.a.s(facebookCallback, "callback");
        callbackManagerImpl.registerCallback(getRequestCode(), new a(this, new ResultProcessor(facebookCallback) { // from class: com.facebook.gamingservices.TournamentJoinDialog$registerCallbackImpl$resultProcessor$1
            final /* synthetic */ FacebookCallback<TournamentJoinDialog.Result> $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(facebookCallback);
                this.$callback = facebookCallback;
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(@NotNull AppCall appCall, @Nullable Bundle bundle) {
                p0.a.s(appCall, "appCall");
                if (bundle != null) {
                    if (bundle.getString("error_message") != null) {
                        this.$callback.onError(new FacebookException(bundle.getString("error_message")));
                        return;
                    } else if (bundle.getString("payload") != null) {
                        this.$callback.onSuccess(new TournamentJoinDialog.Result(bundle));
                        return;
                    }
                }
                onCancel(appCall);
            }
        }, 3));
    }

    public final void show(@Nullable String str, @Nullable String str2) {
        this.tournamentID = str;
        this.payload = str2;
        super.showImpl((TournamentJoinDialog) str, FacebookDialogBase.BASE_AUTOMATIC_MODE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TournamentJoinDialog(@NotNull Fragment fragment) {
        this(new FragmentWrapper(fragment));
        p0.a.s(fragment, "fragment");
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public boolean canShow(@Nullable String str) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            return false;
        }
        if (new FacebookAppHandler(this).canShow(str, true)) {
            return true;
        }
        return new ChromeCustomTabHandler(this).canShow(str, true);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(@Nullable String str, @NotNull Object obj) {
        p0.a.s(obj, "mode");
        if (CloudGameLoginHandler.isRunningInCloud()) {
            return;
        }
        super.showImpl((TournamentJoinDialog) str, obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TournamentJoinDialog(@NotNull android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
        p0.a.s(fragment, "fragment");
    }

    private TournamentJoinDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }
}

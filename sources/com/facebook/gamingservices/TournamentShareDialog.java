package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.TournamentShareDialog;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@AutoHandleExceptions
/* loaded from: classes2.dex */
public final class TournamentShareDialog extends FacebookDialogBase<TournamentConfig, Result> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int defaultRequestCode = CallbackManagerImpl.RequestCodeOffset.TournamentShareDialog.toRequestCode();

    @Nullable
    private Number score;

    @Nullable
    private Tournament tournament;

    /* loaded from: classes2.dex */
    public final class AppSwitchHandler extends FacebookDialogBase<TournamentConfig, Result>.ModeHandler {
        final /* synthetic */ TournamentShareDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppSwitchHandler(TournamentShareDialog tournamentShareDialog) {
            super(tournamentShareDialog);
            p0.a.s(tournamentShareDialog, "this$0");
            this.this$0 = tournamentShareDialog;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(@Nullable TournamentConfig tournamentConfig, boolean z2) {
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        @NotNull
        public AppCall createAppCall(@Nullable TournamentConfig tournamentConfig) {
            Uri uriForUpdating$facebook_gamingservices_release;
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            if (currentAccessToken != null && !currentAccessToken.isExpired()) {
                if (currentAccessToken.getGraphDomain() != null && !p0.a.g(FacebookSdk.GAMING, currentAccessToken.getGraphDomain())) {
                    throw new FacebookException("Attempted to share tournament without without gaming login");
                }
                Number score = this.this$0.getScore();
                if (score != null) {
                    if (tournamentConfig != null) {
                        uriForUpdating$facebook_gamingservices_release = TournamentShareDialogURIBuilder.INSTANCE.uriForCreating$facebook_gamingservices_release(tournamentConfig, score, currentAccessToken.getApplicationId());
                    } else {
                        Tournament tournament = this.this$0.getTournament();
                        uriForUpdating$facebook_gamingservices_release = tournament == null ? null : TournamentShareDialogURIBuilder.INSTANCE.uriForUpdating$facebook_gamingservices_release(tournament.identifier, score, currentAccessToken.getApplicationId());
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", uriForUpdating$facebook_gamingservices_release);
                    TournamentShareDialog tournamentShareDialog = this.this$0;
                    TournamentShareDialog.safedk_FacebookDialogBase_startActivityForResult_8bc1142a9b49c8d7dd9e77376bcd65e1(tournamentShareDialog, intent, tournamentShareDialog.getRequestCode());
                    return createBaseAppCall;
                }
                throw new FacebookException("Attempted to share tournament without a score");
            }
            throw new FacebookException("Attempted to share tournament with an invalid access token");
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
    public final class FacebookAppHandler extends FacebookDialogBase<TournamentConfig, Result>.ModeHandler {
        final /* synthetic */ TournamentShareDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookAppHandler(TournamentShareDialog tournamentShareDialog) {
            super(tournamentShareDialog);
            p0.a.s(tournamentShareDialog, "this$0");
            this.this$0 = tournamentShareDialog;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(@Nullable TournamentConfig tournamentConfig, boolean z2) {
            PackageManager packageManager = FacebookSdk.getApplicationContext().getPackageManager();
            p0.a.r(packageManager, "getApplicationContext().packageManager");
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            return intent.resolveActivity(packageManager) != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        @NotNull
        public AppCall createAppCall(@Nullable TournamentConfig tournamentConfig) {
            Bundle bundleForUpdating$facebook_gamingservices_release;
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            AppCall createBaseAppCall = this.this$0.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            if (currentAccessToken != null && !currentAccessToken.isExpired()) {
                if (currentAccessToken.getGraphDomain() != null && !p0.a.g(FacebookSdk.GAMING, currentAccessToken.getGraphDomain())) {
                    throw new FacebookException("Attempted to share tournament while user is not gaming logged in");
                }
                String applicationId = currentAccessToken.getApplicationId();
                Number score = this.this$0.getScore();
                if (score != null) {
                    if (tournamentConfig != null) {
                        bundleForUpdating$facebook_gamingservices_release = TournamentShareDialogURIBuilder.INSTANCE.bundleForCreating$facebook_gamingservices_release(tournamentConfig, score, applicationId);
                    } else {
                        Tournament tournament = this.this$0.getTournament();
                        bundleForUpdating$facebook_gamingservices_release = tournament == null ? null : TournamentShareDialogURIBuilder.INSTANCE.bundleForUpdating$facebook_gamingservices_release(tournament.identifier, score, applicationId);
                    }
                    NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
                    NativeProtocol.setupProtocolRequestIntent(intent, createBaseAppCall.getCallId().toString(), "", NativeProtocol.PROTOCOL_VERSION_20210906, bundleForUpdating$facebook_gamingservices_release);
                    createBaseAppCall.setRequestIntent(intent);
                    return createBaseAppCall;
                }
                throw new FacebookException("Attempted to share tournament without a score");
            }
            throw new FacebookException("Attempted to share tournament with an invalid access token");
        }
    }

    /* loaded from: classes2.dex */
    public static final class Result {

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
        }

        @Nullable
        public final String getRequestID() {
            return this.requestID;
        }

        @Nullable
        public final String getTournamentID() {
            return this.tournamentID;
        }

        public final void setRequestID(@Nullable String str) {
            this.requestID = str;
        }

        public final void setTournamentID(@Nullable String str) {
            this.tournamentID = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TournamentShareDialog(@NotNull Activity activity) {
        super(activity, defaultRequestCode);
        p0.a.s(activity, "activity");
    }

    /* renamed from: registerCallbackImpl$lambda-0 */
    public static final boolean m513registerCallbackImpl$lambda0(TournamentShareDialog tournamentShareDialog, ResultProcessor resultProcessor, int i2, Intent intent) {
        p0.a.s(tournamentShareDialog, "this$0");
        ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
        return ShareInternalUtility.handleActivityResult(tournamentShareDialog.getRequestCode(), i2, intent, resultProcessor);
    }

    public static void safedk_FacebookDialogBase_startActivityForResult_8bc1142a9b49c8d7dd9e77376bcd65e1(FacebookDialogBase p02, Intent p12, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/facebook/internal/FacebookDialogBase;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.facebook.BuildConfig.LIBRARY_PACKAGE_NAME);
        p02.startActivityForResult(p12, p2);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    @NotNull
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), null, 2, null);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    @NotNull
    public List<FacebookDialogBase<TournamentConfig, Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FacebookAppHandler(this));
        arrayList.add(new AppSwitchHandler(this));
        return arrayList;
    }

    @Nullable
    public final Number getScore() {
        return this.score;
    }

    @Nullable
    public final Tournament getTournament() {
        return this.tournament;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(@NotNull CallbackManagerImpl callbackManagerImpl, @NotNull FacebookCallback<Result> facebookCallback) {
        p0.a.s(callbackManagerImpl, "callbackManager");
        p0.a.s(facebookCallback, "callback");
        callbackManagerImpl.registerCallback(getRequestCode(), new a(this, new ResultProcessor(facebookCallback) { // from class: com.facebook.gamingservices.TournamentShareDialog$registerCallbackImpl$resultProcessor$1
            final /* synthetic */ FacebookCallback<TournamentShareDialog.Result> $callback;

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
                    } else if (bundle.getString(SDKConstants.PARAM_TOURNAMENTS_ID) != null) {
                        this.$callback.onSuccess(new TournamentShareDialog.Result(bundle));
                        return;
                    }
                }
                onCancel(appCall);
            }
        }, 4));
    }

    public final void setScore(@Nullable Number number) {
        this.score = number;
    }

    public final void setTournament(@Nullable Tournament tournament) {
        this.tournament = tournament;
    }

    public final void show(@NotNull Number number, @NotNull TournamentConfig tournamentConfig) {
        p0.a.s(number, "score");
        p0.a.s(tournamentConfig, "newTournamentConfig");
        this.score = number;
        showImpl(tournamentConfig, FacebookDialogBase.BASE_AUTOMATIC_MODE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TournamentShareDialog(@NotNull Fragment fragment) {
        this(new FragmentWrapper(fragment));
        p0.a.s(fragment, "fragment");
    }

    public final void show(@NotNull Number number, @NotNull Tournament tournament) {
        p0.a.s(number, "score");
        p0.a.s(tournament, "tournament");
        this.score = number;
        this.tournament = tournament;
        showImpl((TournamentConfig) null, FacebookDialogBase.BASE_AUTOMATIC_MODE);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(@Nullable TournamentConfig tournamentConfig, @NotNull Object obj) {
        p0.a.s(obj, "mode");
        if (CloudGameLoginHandler.isRunningInCloud()) {
            return;
        }
        super.showImpl((TournamentShareDialog) tournamentConfig, obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TournamentShareDialog(@NotNull android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
        p0.a.s(fragment, "fragment");
    }

    private TournamentShareDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, defaultRequestCode);
    }
}

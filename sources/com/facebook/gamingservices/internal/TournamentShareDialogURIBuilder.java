package com.facebook.gamingservices.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.gamingservices.TournamentConfig;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.time.Instant;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public final class TournamentShareDialogURIBuilder {

    @NotNull
    public static final TournamentShareDialogURIBuilder INSTANCE = new TournamentShareDialogURIBuilder();

    @NotNull
    public static final String authority = "fb.gg";

    @NotNull
    public static final String me = "me";

    @NotNull
    public static final String scheme = "https";

    @NotNull
    public static final String tournament = "instant_tournament";

    private TournamentShareDialogURIBuilder() {
    }

    @NotNull
    public final Bundle bundleForCreating$facebook_gamingservices_release(@NotNull TournamentConfig tournamentConfig, @NotNull Number number, @NotNull String str) {
        a.s(tournamentConfig, "config");
        a.s(number, "score");
        a.s(str, SDKConstants.PARAM_APP_ID);
        Bundle bundle = new Bundle();
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, SDKConstants.PARAM_TOURNAMENTS);
        bundle.putString("app_id", str);
        bundle.putString("score", number.toString());
        TournamentSortOrder sortOrder = tournamentConfig.getSortOrder();
        if (sortOrder != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_SORT_ORDER, sortOrder.toString());
        }
        TournamentScoreType scoreType = tournamentConfig.getScoreType();
        if (scoreType != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_SCORE_FORMAT, scoreType.toString());
        }
        String title = tournamentConfig.getTitle();
        if (title != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_TITLE, title);
        }
        String payload = tournamentConfig.getPayload();
        if (payload != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD, payload);
        }
        Instant endTime = tournamentConfig.getEndTime();
        if (endTime != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_END_TIME, String.valueOf((int) endTime.getEpochSecond()));
        }
        return bundle;
    }

    @NotNull
    public final Bundle bundleForUpdating$facebook_gamingservices_release(@NotNull String str, @NotNull Number number, @NotNull String str2) {
        a.s(str, "tournamentID");
        a.s(number, "score");
        a.s(str2, SDKConstants.PARAM_APP_ID);
        Bundle bundle = new Bundle();
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, SDKConstants.PARAM_TOURNAMENTS);
        bundle.putString("app_id", str2);
        bundle.putString("score", number.toString());
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_ID, str);
        return bundle;
    }

    @NotNull
    public final Uri uriForCreating$facebook_gamingservices_release(@NotNull TournamentConfig tournamentConfig, @NotNull Number number, @NotNull String str) {
        a.s(tournamentConfig, "config");
        a.s(number, "score");
        a.s(str, SDKConstants.PARAM_APP_ID);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(scheme).authority("fb.gg").appendPath(me).appendPath(tournament).appendPath(str).appendQueryParameter("score", number.toString());
        Instant endTime = tournamentConfig.getEndTime();
        if (endTime != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_END_TIME, endTime.toString());
        }
        TournamentSortOrder sortOrder = tournamentConfig.getSortOrder();
        if (sortOrder != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SORT_ORDER, sortOrder.toString());
        }
        TournamentScoreType scoreType = tournamentConfig.getScoreType();
        if (scoreType != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SCORE_FORMAT, scoreType.toString());
        }
        String title = tournamentConfig.getTitle();
        if (title != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_TITLE, title);
        }
        String payload = tournamentConfig.getPayload();
        if (payload != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD, payload);
        }
        Uri build = appendQueryParameter.build();
        a.r(build, "builder.build()");
        return build;
    }

    @NotNull
    public final Uri uriForUpdating$facebook_gamingservices_release(@NotNull String str, @NotNull Number number, @NotNull String str2) {
        a.s(str, "tournamentID");
        a.s(number, "score");
        a.s(str2, SDKConstants.PARAM_APP_ID);
        Uri build = new Uri.Builder().scheme(scheme).authority("fb.gg").appendPath(me).appendPath(tournament).appendPath(str2).appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_ID, str).appendQueryParameter("score", number.toString()).build();
        a.r(build, "Builder()\n        .scheme(scheme)\n        .authority(authority)\n        .appendPath(me)\n        .appendPath(tournament)\n        .appendPath(appID)\n        .appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_ID, tournamentID)\n        .appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SCORE, score.toString())\n        .build()");
        return build;
    }
}

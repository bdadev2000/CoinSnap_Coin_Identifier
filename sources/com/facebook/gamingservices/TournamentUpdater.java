package com.facebook.gamingservices;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.bolts.TaskCompletionSource;
import com.facebook.internal.ServerProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class TournamentUpdater {
    /* renamed from: update$lambda-0 */
    public static final void m514update$lambda0(TaskCompletionSource taskCompletionSource, GraphResponse graphResponse) {
        p0.a.s(taskCompletionSource, "$task");
        p0.a.s(graphResponse, "response");
        if (graphResponse.getError() != null) {
            FacebookRequestError error = graphResponse.getError();
            if ((error == null ? null : error.getException()) == null) {
                taskCompletionSource.setError(new GraphAPIException("Graph API Error"));
                return;
            } else {
                FacebookRequestError error2 = graphResponse.getError();
                taskCompletionSource.setError(error2 != null ? error2.getException() : null);
                return;
            }
        }
        JSONObject jSONObject = graphResponse.getJSONObject();
        String optString = jSONObject != null ? jSONObject.optString("success") : null;
        if (optString == null || optString.length() == 0) {
            taskCompletionSource.setError(new GraphAPIException("Graph API Error"));
        } else {
            taskCompletionSource.setResult(Boolean.valueOf(optString.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)));
        }
    }

    @Nullable
    public final TaskCompletionSource<Boolean> update(@NotNull Tournament tournament, @NotNull Number number) {
        p0.a.s(tournament, "tournament");
        p0.a.s(number, "score");
        return update(tournament.identifier, number);
    }

    @Nullable
    public final TaskCompletionSource<Boolean> update(@NotNull String str, @NotNull Number number) {
        p0.a.s(str, "identifier");
        p0.a.s(number, "score");
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        if (currentAccessToken != null && !currentAccessToken.isExpired()) {
            if (currentAccessToken.getGraphDomain() != null && p0.a.g(FacebookSdk.GAMING, currentAccessToken.getGraphDomain())) {
                TaskCompletionSource<Boolean> taskCompletionSource = new TaskCompletionSource<>();
                String z02 = p0.a.z0("/update_score", str);
                Bundle bundle = new Bundle();
                bundle.putInt("score", number.intValue());
                new GraphRequest(currentAccessToken, z02, bundle, HttpMethod.POST, new b(taskCompletionSource, 1), null, 32, null).executeAsync();
                return taskCompletionSource;
            }
            throw new FacebookException("User is not using gaming login");
        }
        throw new FacebookException("Attempted to fetch tournament with an invalid access token");
    }
}

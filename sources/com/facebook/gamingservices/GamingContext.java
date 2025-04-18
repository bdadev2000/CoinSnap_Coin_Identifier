package com.facebook.gamingservices;

import android.support.v4.media.d;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class GamingContext {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_TIMEOUT = 5;

    @Nullable
    private static GamingContext currentContext;

    @NotNull
    private final String contextID;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @Nullable
        public final GamingContext getCurrentGamingContext() {
            JSONObject jSONObject;
            if (!CloudGameLoginHandler.isRunningInCloud()) {
                return GamingContext.currentContext;
            }
            GraphResponse executeAndWait = DaemonRequest.executeAndWait(FacebookSdk.getApplicationContext(), null, SDKMessageEnum.CONTEXT_GET_ID, 5);
            String string = (executeAndWait == null || (jSONObject = executeAndWait.getJSONObject()) == null) ? null : jSONObject.getString("id");
            if (string == null) {
                return null;
            }
            return new GamingContext(string);
        }

        public final void setCurrentGamingContext(@NotNull GamingContext gamingContext) {
            p0.a.s(gamingContext, "ctx");
            if (CloudGameLoginHandler.isRunningInCloud()) {
                return;
            }
            GamingContext.currentContext = gamingContext;
        }
    }

    public GamingContext(@NotNull String str) {
        p0.a.s(str, "contextID");
        this.contextID = str;
    }

    public static /* synthetic */ GamingContext copy$default(GamingContext gamingContext, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gamingContext.contextID;
        }
        return gamingContext.copy(str);
    }

    @Nullable
    public static final GamingContext getCurrentGamingContext() {
        return Companion.getCurrentGamingContext();
    }

    public static final void setCurrentGamingContext(@NotNull GamingContext gamingContext) {
        Companion.setCurrentGamingContext(gamingContext);
    }

    @NotNull
    public final String component1() {
        return this.contextID;
    }

    @NotNull
    public final GamingContext copy(@NotNull String str) {
        p0.a.s(str, "contextID");
        return new GamingContext(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GamingContext) && p0.a.g(this.contextID, ((GamingContext) obj).contextID);
    }

    @NotNull
    public final String getContextID() {
        return this.contextID;
    }

    public int hashCode() {
        return this.contextID.hashCode();
    }

    @NotNull
    public String toString() {
        return d.q(new StringBuilder("GamingContext(contextID="), this.contextID, ')');
    }
}

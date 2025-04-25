package com.glority.component.generatedAPI.kotlinAPI.user;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetUserMessage.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\b\b\u0086\b\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020 0\u001cH\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\"H\u0016J\b\u0010'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0*H\u0016¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010-\u001a\u00020\u0005H\u0016J\t\u0010.\u001a\u00020\u0005HÂ\u0003J\u0013\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u00100\u001a\u00020\u001dHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u00062"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/GetUserMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "unused", "", "<init>", "(I)V", "user", "Lcom/glority/component/generatedAPI/kotlinAPI/user/User;", "getUser", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/User;", "setUser", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/User;)V", "userAdditionalData", "Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;", "getUserAdditionalData", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;", "setUserAdditionalData", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class GetUserMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int unused;
    public User user;
    public UserAdditionalData userAdditionalData;

    public GetUserMessage() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    public final GetUserMessage copy(int unused) {
        return new GetUserMessage(unused);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean forceHttps() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean mustAuth() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean needAuth() {
        return true;
    }

    public String toString() {
        return "GetUserMessage(unused=" + this.unused + ")";
    }

    public /* synthetic */ GetUserMessage(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ GetUserMessage copy$default(GetUserMessage getUserMessage, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getUserMessage.unused;
        }
        return getUserMessage.copy(i);
    }

    public GetUserMessage(int i) {
        this.unused = i;
    }

    public final User getUser() {
        User user = this.user;
        if (user != null) {
            return user;
        }
        Intrinsics.throwUninitializedPropertyAccessException("user");
        return null;
    }

    public final void setUser(User user) {
        Intrinsics.checkNotNullParameter(user, "<set-?>");
        this.user = user;
    }

    public final UserAdditionalData getUserAdditionalData() {
        UserAdditionalData userAdditionalData = this.userAdditionalData;
        if (userAdditionalData != null) {
            return userAdditionalData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAdditionalData");
        return null;
    }

    public final void setUserAdditionalData(UserAdditionalData userAdditionalData) {
        Intrinsics.checkNotNullParameter(userAdditionalData, "<set-?>");
        this.userAdditionalData = userAdditionalData;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("user") && !obj.isNull("user")) {
            Object obj2 = obj.get("user");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            setUser(new User((JSONObject) obj2));
            if (obj.has("user_additional_data") && !obj.isNull("user_additional_data")) {
                Object obj3 = obj.get("user_additional_data");
                if ((obj3 instanceof JSONArray) && ((JSONArray) obj3).length() == 0) {
                    obj3 = new JSONObject();
                }
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                setUserAdditionalData(new UserAdditionalData((JSONObject) obj3));
                this._response_at = new Date();
                return;
            }
            throw new ParameterCheckFailException("user_additional_data is missing in api GetUser");
        }
        throw new ParameterCheckFailException("user is missing in api GetUser");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        return other != null && (other instanceof GetUserMessage);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String api() {
        return INSTANCE.getApi();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String[] methods() {
        return new String[]{LogEvents.exportemptyalert_close_click_type_get};
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof GetUserMessage)) {
            return false;
        }
        GetUserMessage getUserMessage = (GetUserMessage) other;
        return Intrinsics.areEqual(getUser(), getUserMessage.getUser()) && Intrinsics.areEqual(getUserAdditionalData(), getUserMessage.getUserAdditionalData());
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + getUser().hashCode()) * 31) + getUserAdditionalData().hashCode();
    }

    /* compiled from: GetUserMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/GetUserMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/user/get";
        }
    }
}

package com.glority.component.generatedAPI.kotlinAPI.user;

import androidx.autofill.HintConstants;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.enums.Gender;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: UpdateMessage.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u00019B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020$0#H\u0016J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070#H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010$H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020'H\u0016J\b\u0010+\u001a\u00020'H\u0016J\b\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016J\u0013\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050/H\u0016¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u00102\u001a\u000203H\u0016J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÄ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÄ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÄ\u0003J-\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000f¨\u0006:"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/UpdateMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "nickname", "", "avatar", "Ljava/io/File;", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;", "<init>", "(Ljava/lang/String;Ljava/io/File;Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;)V", "getNickname", "()Ljava/lang/String;", "setNickname", "(Ljava/lang/String;)V", "getAvatar", "()Ljava/io/File;", "setAvatar", "(Ljava/io/File;)V", "getGender", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;", "setGender", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;)V", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class UpdateMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private File avatar;
    private String avatarUrl;
    private Gender gender;
    private String nickname;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component2, reason: from getter */
    protected final File getAvatar() {
        return this.avatar;
    }

    /* renamed from: component3, reason: from getter */
    protected final Gender getGender() {
        return this.gender;
    }

    public final UpdateMessage copy(String nickname, File avatar, Gender gender) {
        return new UpdateMessage(nickname, avatar, gender);
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
        return "UpdateMessage(nickname=" + this.nickname + ", avatar=" + this.avatar + ", gender=" + this.gender + ")";
    }

    public static /* synthetic */ UpdateMessage copy$default(UpdateMessage updateMessage, String str, File file, Gender gender, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateMessage.nickname;
        }
        if ((i & 2) != 0) {
            file = updateMessage.avatar;
        }
        if ((i & 4) != 0) {
            gender = updateMessage.gender;
        }
        return updateMessage.copy(str, file, gender);
    }

    protected final String getNickname() {
        return this.nickname;
    }

    protected final void setNickname(String str) {
        this.nickname = str;
    }

    protected final File getAvatar() {
        return this.avatar;
    }

    protected final void setAvatar(File file) {
        this.avatar = file;
    }

    protected final Gender getGender() {
        return this.gender;
    }

    protected final void setGender(Gender gender) {
        this.gender = gender;
    }

    public UpdateMessage(String str, File file, Gender gender) {
        this.nickname = str;
        this.avatar = file;
        this.gender = gender;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("avatar_url") && !obj.isNull("avatar_url")) {
            this.avatarUrl = obj.getString("avatar_url");
        } else {
            this.avatarUrl = null;
        }
        this._response_at = new Date();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        String str = this.nickname;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("nickname", str);
        }
        Gender gender = this.gender;
        if (gender != null) {
            Intrinsics.checkNotNull(gender);
            hashMap.put(HintConstants.AUTOFILL_HINT_GENDER, Integer.valueOf(gender.getValue()));
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        HashMap hashMap = new HashMap();
        File file = this.avatar;
        if (file != null) {
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof UpdateMessage)) {
            return false;
        }
        UpdateMessage updateMessage = (UpdateMessage) other;
        return Intrinsics.areEqual(this.nickname, updateMessage.nickname) && Intrinsics.areEqual(this.avatar, updateMessage.avatar) && this.gender == updateMessage.gender;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String api() {
        return INSTANCE.getApi();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String[] methods() {
        return new String[]{"post"};
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof UpdateMessage)) {
            return false;
        }
        UpdateMessage updateMessage = (UpdateMessage) other;
        return Intrinsics.areEqual(this.nickname, updateMessage.nickname) && Intrinsics.areEqual(this.avatar, updateMessage.avatar) && this.gender == updateMessage.gender && Intrinsics.areEqual(this.avatarUrl, updateMessage.avatarUrl);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.nickname;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        File file = this.avatar;
        int hashCode3 = (hashCode2 + (file != null ? file.hashCode() : 0)) * 31;
        Gender gender = this.gender;
        int hashCode4 = (hashCode3 + (gender != null ? gender.hashCode() : 0)) * 31;
        String str2 = this.avatarUrl;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    /* compiled from: UpdateMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/UpdateMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/user/update";
        }
    }
}

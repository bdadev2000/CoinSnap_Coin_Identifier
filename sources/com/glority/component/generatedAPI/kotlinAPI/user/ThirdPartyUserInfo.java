package com.glority.component.generatedAPI.kotlinAPI.user;

import androidx.autofill.HintConstants;
import com.glority.android.core.definition.APIModelBase;
import com.glority.component.generatedAPI.kotlinAPI.enums.Gender;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ThirdPartyUserInfo.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e2\u0006\u0010 \u001a\u00020!J\u0016\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001eH\u0016J\u0013\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0014J\t\u0010)\u001a\u00020\u0005HÂ\u0003J\u0013\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006-"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/ThirdPartyUserInfo;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "nickname", "", "getNickname", "()Ljava/lang/String;", "setNickname", "(Ljava/lang/String;)V", "avatarUrl", "getAvatarUrl", "setAvatarUrl", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;", "getGender", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;", "setGender", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;)V", "email", "getEmail", "setEmail", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class ThirdPartyUserInfo extends APIModelBase<ThirdPartyUserInfo> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 1;
    private String avatarUrl;
    private String email;
    private Gender gender;
    private String nickname;
    private int unused;

    public ThirdPartyUserInfo() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final ThirdPartyUserInfo copy(int unused) {
        return new ThirdPartyUserInfo(unused);
    }

    public String toString() {
        return "ThirdPartyUserInfo(unused=" + this.unused + ")";
    }

    public ThirdPartyUserInfo(int i) {
        this.unused = i;
    }

    public /* synthetic */ ThirdPartyUserInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ ThirdPartyUserInfo copy$default(ThirdPartyUserInfo thirdPartyUserInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = thirdPartyUserInfo.unused;
        }
        return thirdPartyUserInfo.copy(i);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final void setGender(Gender gender) {
        this.gender = gender;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThirdPartyUserInfo(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("nickname") && !obj.isNull("nickname")) {
            this.nickname = obj.getString("nickname");
        } else {
            this.nickname = null;
        }
        if (obj.has("avatar_url") && !obj.isNull("avatar_url")) {
            this.avatarUrl = obj.getString("avatar_url");
        } else {
            this.avatarUrl = null;
        }
        if (obj.has(HintConstants.AUTOFILL_HINT_GENDER) && !obj.isNull(HintConstants.AUTOFILL_HINT_GENDER)) {
            this.gender = Gender.INSTANCE.fromValue(obj.getInt(HintConstants.AUTOFILL_HINT_GENDER));
        } else {
            this.gender = null;
        }
        if (obj.has("email") && !obj.isNull("email")) {
            this.email = obj.getString("email");
        } else {
            this.email = null;
        }
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.nickname;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("nickname", str);
        } else if (keepNull) {
            hashMap.put("nickname", null);
        }
        String str2 = this.avatarUrl;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("avatar_url", str2);
        } else if (keepNull) {
            hashMap.put("avatar_url", null);
        }
        Gender gender = this.gender;
        if (gender != null) {
            Intrinsics.checkNotNull(gender);
            hashMap.put(HintConstants.AUTOFILL_HINT_GENDER, Integer.valueOf(gender.getValue()));
        } else if (keepNull) {
            hashMap.put(HintConstants.AUTOFILL_HINT_GENDER, null);
        }
        String str3 = this.email;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("email", str3);
        } else if (keepNull) {
            hashMap.put("email", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof ThirdPartyUserInfo)) {
            return false;
        }
        ThirdPartyUserInfo thirdPartyUserInfo = (ThirdPartyUserInfo) other;
        return Intrinsics.areEqual(this.nickname, thirdPartyUserInfo.nickname) && Intrinsics.areEqual(this.avatarUrl, thirdPartyUserInfo.avatarUrl) && this.gender == thirdPartyUserInfo.gender && Intrinsics.areEqual(this.email, thirdPartyUserInfo.email);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.nickname;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.avatarUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Gender gender = this.gender;
        int hashCode4 = (hashCode3 + (gender != null ? gender.hashCode() : 0)) * 31;
        String str3 = this.email;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        ThirdPartyUserInfo thirdPartyUserInfo = new ThirdPartyUserInfo(0, 1, null);
        cloneTo(thirdPartyUserInfo);
        return thirdPartyUserInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.user.ThirdPartyUserInfo");
        ThirdPartyUserInfo thirdPartyUserInfo = (ThirdPartyUserInfo) o;
        super.cloneTo(thirdPartyUserInfo);
        String str = this.nickname;
        thirdPartyUserInfo.nickname = str != null ? cloneField(str) : null;
        String str2 = this.avatarUrl;
        thirdPartyUserInfo.avatarUrl = str2 != null ? cloneField(str2) : null;
        Enum r0 = this.gender;
        thirdPartyUserInfo.gender = r0 != null ? (Gender) cloneField(r0) : null;
        String str3 = this.email;
        thirdPartyUserInfo.email = str3 != null ? cloneField(str3) : null;
    }

    /* compiled from: ThirdPartyUserInfo.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/ThirdPartyUserInfo$Companion;", "", "<init>", "()V", "serialVersionUID", "", "getThirdPartyUserInfoJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/user/ThirdPartyUserInfo;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getThirdPartyUserInfoJsonArrayMap(List<ThirdPartyUserInfo> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ThirdPartyUserInfo) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}

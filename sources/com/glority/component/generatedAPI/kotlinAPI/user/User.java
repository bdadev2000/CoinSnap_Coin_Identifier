package com.glority.component.generatedAPI.kotlinAPI.user;

import androidx.autofill.HintConstants;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.enums.Gender;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: User.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001OB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010>0=2\u0006\u0010D\u001a\u00020-J\u0016\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010>0=H\u0016J\u0013\u0010E\u001a\u00020-2\b\u0010F\u001a\u0004\u0018\u00010>H\u0096\u0002J\b\u0010G\u001a\u00020\u0005H\u0016J\b\u0010H\u001a\u00020>H\u0016J\u0012\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010>H\u0014J\t\u0010L\u001a\u00020\u0005HÂ\u0003J\u0013\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010N\u001a\u00020\u0012HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001a\u0010&\u001a\u00020'X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u001a\u00105\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0007R\u001c\u00109\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0014\"\u0004\b;\u0010\u0016R*\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010>\u0018\u00010=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006P"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/User;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "userId", "", "getUserId", "()J", "setUserId", "(J)V", "uuid", "", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "nickname", "getNickname", "setNickname", "avatarUrl", "getAvatarUrl", "setAvatarUrl", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;", "getGender", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;", "setGender", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/Gender;)V", "email", "getEmail", "setEmail", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "guestUser", "", "getGuestUser", "()Z", "setGuestUser", "(Z)V", "vip", "getVip", "setVip", "expertConsultationCount", "getExpertConsultationCount", "()I", "setExpertConsultationCount", "appInitVersion", "getAppInitVersion", "setAppInitVersion", "properties", "", "", "getProperties", "()Ljava/util/Map;", "setProperties", "(Ljava/util/Map;)V", "getJsonMap", "keepNull", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class User extends APIModelBase<User> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 1;
    private String appInitVersion;
    private String avatarUrl;
    public Date createdAt;
    private String email;
    private int expertConsultationCount;
    private Gender gender;
    private boolean guestUser;
    private String nickname;
    private Map<String, ? extends Object> properties;
    private int unused;
    private long userId;
    public String uuid;
    private boolean vip;

    public User() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final User copy(int unused) {
        return new User(unused);
    }

    public String toString() {
        return "User(unused=" + this.unused + ")";
    }

    public User(int i) {
        this.unused = i;
    }

    public /* synthetic */ User(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ User copy$default(User user, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = user.unused;
        }
        return user.copy(i);
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final String getUuid() {
        String str = this.uuid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uuid");
        return null;
    }

    public final void setUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
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

    public final Date getCreatedAt() {
        Date date = this.createdAt;
        if (date != null) {
            return date;
        }
        Intrinsics.throwUninitializedPropertyAccessException("createdAt");
        return null;
    }

    public final void setCreatedAt(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.createdAt = date;
    }

    public final boolean getGuestUser() {
        return this.guestUser;
    }

    public final void setGuestUser(boolean z) {
        this.guestUser = z;
    }

    public final boolean getVip() {
        return this.vip;
    }

    public final void setVip(boolean z) {
        this.vip = z;
    }

    public final int getExpertConsultationCount() {
        return this.expertConsultationCount;
    }

    public final void setExpertConsultationCount(int i) {
        this.expertConsultationCount = i;
    }

    public final String getAppInitVersion() {
        return this.appInitVersion;
    }

    public final void setAppInitVersion(String str) {
        this.appInitVersion = str;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public final void setProperties(Map<String, ? extends Object> map) {
        this.properties = map;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public User(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("user_id") && !obj.isNull("user_id")) {
            this.userId = obj.getLong("user_id");
            if (obj.has("uuid") && !obj.isNull("uuid")) {
                setUuid(obj.getString("uuid"));
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
                if (obj.has("created_at") && !obj.isNull("created_at")) {
                    setCreatedAt(new Date(obj.getLong("created_at") * 1000));
                    if (obj.has("guest_user") && !obj.isNull("guest_user")) {
                        this.guestUser = parseBoolean(obj, "guest_user").booleanValue();
                        if (obj.has("vip") && !obj.isNull("vip")) {
                            this.vip = parseBoolean(obj, "vip").booleanValue();
                            if (obj.has("expert_consultation_count") && !obj.isNull("expert_consultation_count")) {
                                this.expertConsultationCount = obj.getInt("expert_consultation_count");
                                if (obj.has("app_init_version") && !obj.isNull("app_init_version")) {
                                    this.appInitVersion = obj.getString("app_init_version");
                                } else {
                                    this.appInitVersion = null;
                                }
                                if (obj.has("properties") && !obj.isNull("properties")) {
                                    Object obj2 = obj.get("properties");
                                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                                        obj2 = new JSONObject();
                                    }
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                                    this.properties = jsonObjectToMap((JSONObject) obj2);
                                    return;
                                }
                                this.properties = null;
                                return;
                            }
                            throw new ParameterCheckFailException("expertConsultationCount is missing in model User");
                        }
                        throw new ParameterCheckFailException("vip is missing in model User");
                    }
                    throw new ParameterCheckFailException("guestUser is missing in model User");
                }
                throw new ParameterCheckFailException("createdAt is missing in model User");
            }
            throw new ParameterCheckFailException("uuid is missing in model User");
        }
        throw new ParameterCheckFailException("userId is missing in model User");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", Long.valueOf(this.userId));
        hashMap.put("uuid", getUuid());
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
        hashMap.put("created_at", Long.valueOf(getCreatedAt().getTime() / 1000));
        hashMap.put("guest_user", Integer.valueOf(this.guestUser ? 1 : 0));
        hashMap.put("vip", Integer.valueOf(this.vip ? 1 : 0));
        hashMap.put("expert_consultation_count", Integer.valueOf(this.expertConsultationCount));
        String str4 = this.appInitVersion;
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            hashMap.put("app_init_version", str4);
        } else if (keepNull) {
            hashMap.put("app_init_version", null);
        }
        Map<String, ? extends Object> map = this.properties;
        if (map != null) {
            Intrinsics.checkNotNull(map);
            hashMap.put("properties", map);
        } else if (keepNull) {
            hashMap.put("properties", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return this.userId == user.userId && Intrinsics.areEqual(getUuid(), user.getUuid()) && Intrinsics.areEqual(this.nickname, user.nickname) && Intrinsics.areEqual(this.avatarUrl, user.avatarUrl) && this.gender == user.gender && Intrinsics.areEqual(this.email, user.email) && Intrinsics.areEqual(getCreatedAt(), user.getCreatedAt()) && this.guestUser == user.guestUser && this.vip == user.vip && this.expertConsultationCount == user.expertConsultationCount && Intrinsics.areEqual(this.appInitVersion, user.appInitVersion) && Intrinsics.areEqual(this.properties, user.properties);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + Long.hashCode(this.userId)) * 31) + getUuid().hashCode()) * 31;
        String str = this.nickname;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.avatarUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Gender gender = this.gender;
        int hashCode4 = (hashCode3 + (gender != null ? gender.hashCode() : 0)) * 31;
        String str3 = this.email;
        int hashCode5 = (((((((((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + getCreatedAt().hashCode()) * 31) + Boolean.hashCode(this.guestUser)) * 31) + Boolean.hashCode(this.vip)) * 31) + Integer.hashCode(this.expertConsultationCount)) * 31;
        String str4 = this.appInitVersion;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map = this.properties;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        User user = new User(0, 1, null);
        cloneTo(user);
        return user;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.user.User");
        User user = (User) o;
        super.cloneTo(user);
        user.userId = cloneField(Long.valueOf(this.userId)).longValue();
        user.setUuid(cloneField(getUuid()));
        String str = this.nickname;
        user.nickname = str != null ? cloneField(str) : null;
        String str2 = this.avatarUrl;
        user.avatarUrl = str2 != null ? cloneField(str2) : null;
        Enum r0 = this.gender;
        user.gender = r0 != null ? (Gender) cloneField(r0) : null;
        String str3 = this.email;
        user.email = str3 != null ? cloneField(str3) : null;
        user.setCreatedAt(cloneField(getCreatedAt()));
        user.guestUser = cloneField(Boolean.valueOf(this.guestUser)).booleanValue();
        user.vip = cloneField(Boolean.valueOf(this.vip)).booleanValue();
        user.expertConsultationCount = cloneField(Integer.valueOf(this.expertConsultationCount)).intValue();
        String str4 = this.appInitVersion;
        user.appInitVersion = str4 != null ? cloneField(str4) : null;
        Map<String, Object> map = this.properties;
        user.properties = map != null ? cloneField(map) : null;
    }

    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/User$Companion;", "", "<init>", "()V", "serialVersionUID", "", "getUserJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/user/User;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getUserJsonArrayMap(List<User> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((User) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}

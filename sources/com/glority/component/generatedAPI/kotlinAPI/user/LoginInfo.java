package com.glority.component.generatedAPI.kotlinAPI.user;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.enums.LoginType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: LoginInfo.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\"0!2\u0006\u0010#\u001a\u00020$J\u0016\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\"0!H\u0016J\u0013\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\"H\u0014J\t\u0010,\u001a\u00020\u0005HÂ\u0003J\u0013\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010.\u001a\u00020\u0012HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "loginType", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LoginType;", "getLoginType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LoginType;", "setLoginType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LoginType;)V", "loginKey", "", "getLoginKey", "()Ljava/lang/String;", "setLoginKey", "(Ljava/lang/String;)V", "loginPassword", "getLoginPassword", "setLoginPassword", "thirdPartyUserInfo", "Lcom/glority/component/generatedAPI/kotlinAPI/user/ThirdPartyUserInfo;", "getThirdPartyUserInfo", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/ThirdPartyUserInfo;", "setThirdPartyUserInfo", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/ThirdPartyUserInfo;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class LoginInfo extends APIModelBase<LoginInfo> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 1;
    public String loginKey;
    private String loginPassword;
    public LoginType loginType;
    private ThirdPartyUserInfo thirdPartyUserInfo;
    private int unused;

    public LoginInfo() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final LoginInfo copy(int unused) {
        return new LoginInfo(unused);
    }

    public String toString() {
        return "LoginInfo(unused=" + this.unused + ")";
    }

    public LoginInfo(int i) {
        this.unused = i;
    }

    public /* synthetic */ LoginInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ LoginInfo copy$default(LoginInfo loginInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = loginInfo.unused;
        }
        return loginInfo.copy(i);
    }

    public final LoginType getLoginType() {
        LoginType loginType = this.loginType;
        if (loginType != null) {
            return loginType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginType");
        return null;
    }

    public final void setLoginType(LoginType loginType) {
        Intrinsics.checkNotNullParameter(loginType, "<set-?>");
        this.loginType = loginType;
    }

    public final String getLoginKey() {
        String str = this.loginKey;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginKey");
        return null;
    }

    public final void setLoginKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loginKey = str;
    }

    public final String getLoginPassword() {
        return this.loginPassword;
    }

    public final void setLoginPassword(String str) {
        this.loginPassword = str;
    }

    public final ThirdPartyUserInfo getThirdPartyUserInfo() {
        return this.thirdPartyUserInfo;
    }

    public final void setThirdPartyUserInfo(ThirdPartyUserInfo thirdPartyUserInfo) {
        this.thirdPartyUserInfo = thirdPartyUserInfo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginInfo(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("login_type") && !obj.isNull("login_type")) {
            setLoginType(LoginType.INSTANCE.fromValue(obj.getInt("login_type")));
            if (obj.has("login_key") && !obj.isNull("login_key")) {
                setLoginKey(obj.getString("login_key"));
                if (obj.has("login_password") && !obj.isNull("login_password")) {
                    this.loginPassword = obj.getString("login_password");
                } else {
                    this.loginPassword = null;
                }
                if (obj.has("third_party_user_info") && !obj.isNull("third_party_user_info")) {
                    Object obj2 = obj.get("third_party_user_info");
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    this.thirdPartyUserInfo = new ThirdPartyUserInfo((JSONObject) obj2);
                    return;
                }
                this.thirdPartyUserInfo = null;
                return;
            }
            throw new ParameterCheckFailException("loginKey is missing in model LoginInfo");
        }
        throw new ParameterCheckFailException("loginType is missing in model LoginInfo");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("login_type", Integer.valueOf(getLoginType().getValue()));
        hashMap.put("login_key", getLoginKey());
        String str = this.loginPassword;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("login_password", str);
        } else if (keepNull) {
            hashMap.put("login_password", null);
        }
        ThirdPartyUserInfo thirdPartyUserInfo = this.thirdPartyUserInfo;
        if (thirdPartyUserInfo != null) {
            Intrinsics.checkNotNull(thirdPartyUserInfo);
            hashMap.put("third_party_user_info", thirdPartyUserInfo.getJsonMap());
        } else if (keepNull) {
            hashMap.put("third_party_user_info", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof LoginInfo)) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) other;
        return getLoginType() == loginInfo.getLoginType() && Intrinsics.areEqual(getLoginKey(), loginInfo.getLoginKey()) && Intrinsics.areEqual(this.loginPassword, loginInfo.loginPassword) && Intrinsics.areEqual(this.thirdPartyUserInfo, loginInfo.thirdPartyUserInfo);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + getLoginType().hashCode()) * 31) + getLoginKey().hashCode()) * 31;
        String str = this.loginPassword;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ThirdPartyUserInfo thirdPartyUserInfo = this.thirdPartyUserInfo;
        return hashCode2 + (thirdPartyUserInfo != null ? thirdPartyUserInfo.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        LoginInfo loginInfo = new LoginInfo(0, 1, null);
        cloneTo(loginInfo);
        return loginInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.user.LoginInfo");
        LoginInfo loginInfo = (LoginInfo) o;
        super.cloneTo(loginInfo);
        loginInfo.setLoginType((LoginType) cloneField(getLoginType()));
        loginInfo.setLoginKey(cloneField(getLoginKey()));
        String str = this.loginPassword;
        loginInfo.loginPassword = str != null ? cloneField(str) : null;
        APIModelBase aPIModelBase = this.thirdPartyUserInfo;
        loginInfo.thirdPartyUserInfo = aPIModelBase != null ? (ThirdPartyUserInfo) cloneField(aPIModelBase) : null;
    }

    /* compiled from: LoginInfo.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo$Companion;", "", "<init>", "()V", "serialVersionUID", "", "getLoginInfoJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LoginInfo;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getLoginInfoJsonArrayMap(List<LoginInfo> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((LoginInfo) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}

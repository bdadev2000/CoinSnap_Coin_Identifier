package com.glority.component.generatedAPI.kotlinAPI.user;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
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

/* compiled from: UserAdditionalData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001+B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001d2\u0006\u0010 \u001a\u00020\fJ\u0016\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001dH\u0016J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u001fH\u0016J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u001fH\u0014J\t\u0010(\u001a\u00020\u0005HÂ\u0003J\u0013\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010*\u001a\u00020\u001eHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "existUser", "", "getExistUser", "()Z", "setExistUser", "(Z)V", "todayUser", "getTodayUser", "setTodayUser", "isVipInHistory", "setVipInHistory", "emailNotificationEnabled", "getEmailNotificationEnabled", "()Ljava/lang/Boolean;", "setEmailNotificationEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getJsonMap", "", "", "", "keepNull", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class UserAdditionalData extends APIModelBase<UserAdditionalData> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Boolean emailNotificationEnabled;
    private boolean existUser;
    private boolean isVipInHistory;
    private boolean todayUser;
    private int unused;

    public UserAdditionalData() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final UserAdditionalData copy(int unused) {
        return new UserAdditionalData(unused);
    }

    public String toString() {
        return "UserAdditionalData(unused=" + this.unused + ")";
    }

    public UserAdditionalData(int i) {
        this.unused = i;
    }

    public /* synthetic */ UserAdditionalData(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ UserAdditionalData copy$default(UserAdditionalData userAdditionalData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userAdditionalData.unused;
        }
        return userAdditionalData.copy(i);
    }

    public final boolean getExistUser() {
        return this.existUser;
    }

    public final void setExistUser(boolean z) {
        this.existUser = z;
    }

    public final boolean getTodayUser() {
        return this.todayUser;
    }

    public final void setTodayUser(boolean z) {
        this.todayUser = z;
    }

    /* renamed from: isVipInHistory, reason: from getter */
    public final boolean getIsVipInHistory() {
        return this.isVipInHistory;
    }

    public final void setVipInHistory(boolean z) {
        this.isVipInHistory = z;
    }

    public final Boolean getEmailNotificationEnabled() {
        return this.emailNotificationEnabled;
    }

    public final void setEmailNotificationEnabled(Boolean bool) {
        this.emailNotificationEnabled = bool;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserAdditionalData(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("exist_user") && !obj.isNull("exist_user")) {
            this.existUser = parseBoolean(obj, "exist_user").booleanValue();
            if (obj.has("today_user") && !obj.isNull("today_user")) {
                this.todayUser = parseBoolean(obj, "today_user").booleanValue();
                if (obj.has("is_vip_in_history") && !obj.isNull("is_vip_in_history")) {
                    this.isVipInHistory = parseBoolean(obj, "is_vip_in_history").booleanValue();
                    if (obj.has("email_notification_enabled") && !obj.isNull("email_notification_enabled")) {
                        this.emailNotificationEnabled = parseBoolean(obj, "email_notification_enabled");
                        return;
                    } else {
                        this.emailNotificationEnabled = null;
                        return;
                    }
                }
                throw new ParameterCheckFailException("isVipInHistory is missing in model UserAdditionalData");
            }
            throw new ParameterCheckFailException("todayUser is missing in model UserAdditionalData");
        }
        throw new ParameterCheckFailException("existUser is missing in model UserAdditionalData");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("exist_user", Integer.valueOf(this.existUser ? 1 : 0));
        hashMap.put("today_user", Integer.valueOf(this.todayUser ? 1 : 0));
        hashMap.put("is_vip_in_history", Integer.valueOf(this.isVipInHistory ? 1 : 0));
        Boolean bool = this.emailNotificationEnabled;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            hashMap.put("email_notification_enabled", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        } else if (keepNull) {
            hashMap.put("email_notification_enabled", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof UserAdditionalData)) {
            return false;
        }
        UserAdditionalData userAdditionalData = (UserAdditionalData) other;
        return this.existUser == userAdditionalData.existUser && this.todayUser == userAdditionalData.todayUser && this.isVipInHistory == userAdditionalData.isVipInHistory && Intrinsics.areEqual(this.emailNotificationEnabled, userAdditionalData.emailNotificationEnabled);
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + Boolean.hashCode(this.existUser)) * 31) + Boolean.hashCode(this.todayUser)) * 31) + Boolean.hashCode(this.isVipInHistory)) * 31;
        Boolean bool = this.emailNotificationEnabled;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        UserAdditionalData userAdditionalData = new UserAdditionalData(0, 1, null);
        cloneTo(userAdditionalData);
        return userAdditionalData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.user.UserAdditionalData");
        UserAdditionalData userAdditionalData = (UserAdditionalData) o;
        super.cloneTo(userAdditionalData);
        userAdditionalData.existUser = cloneField(Boolean.valueOf(this.existUser)).booleanValue();
        userAdditionalData.todayUser = cloneField(Boolean.valueOf(this.todayUser)).booleanValue();
        userAdditionalData.isVipInHistory = cloneField(Boolean.valueOf(this.isVipInHistory)).booleanValue();
        Boolean bool = this.emailNotificationEnabled;
        userAdditionalData.emailNotificationEnabled = bool != null ? cloneField(bool) : null;
    }

    /* compiled from: UserAdditionalData.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData$Companion;", "", "<init>", "()V", "getUserAdditionalDataJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/user/UserAdditionalData;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getUserAdditionalDataJsonArrayMap(List<UserAdditionalData> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UserAdditionalData) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}

package com.glority.component.generatedAPI.kotlinAPI.vip;

import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.enums.VipLevel;
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
import org.json.JSONObject;

/* compiled from: VipInfo.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001;B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00100\u001a\u00020\u0012J\u0016\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010/0.H\u0016J\u0013\u00101\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00103\u001a\u00020\u0005H\u0016J\b\u00104\u001a\u00020/H\u0016J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010/H\u0014J\t\u00108\u001a\u00020\u0005HÂ\u0003J\u0013\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010:\u001a\u00020\u001fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)¨\u0006<"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/vip/VipInfo;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "userId", "", "getUserId", "()J", "setUserId", "(J)V", "isVip", "", "()Z", "setVip", "(Z)V", "isTrial", "setTrial", "vipLevel", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/VipLevel;", "getVipLevel", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/VipLevel;", "setVipLevel", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/VipLevel;)V", LogEventArguments.ARG_SKU, "", "getSku", "()Ljava/lang/String;", "setSku", "(Ljava/lang/String;)V", "startAt", "Ljava/util/Date;", "getStartAt", "()Ljava/util/Date;", "setStartAt", "(Ljava/util/Date;)V", "expiredAt", "getExpiredAt", "setExpiredAt", "getJsonMap", "", "", "keepNull", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class VipInfo extends APIModelBase<VipInfo> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Date expiredAt;
    private boolean isTrial;
    private boolean isVip;
    private String sku;
    private Date startAt;
    private int unused;
    private long userId;
    public VipLevel vipLevel;

    public VipInfo() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final VipInfo copy(int unused) {
        return new VipInfo(unused);
    }

    public String toString() {
        return "VipInfo(unused=" + this.unused + ")";
    }

    public VipInfo(int i) {
        this.unused = i;
    }

    public /* synthetic */ VipInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ VipInfo copy$default(VipInfo vipInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = vipInfo.unused;
        }
        return vipInfo.copy(i);
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    /* renamed from: isVip, reason: from getter */
    public final boolean getIsVip() {
        return this.isVip;
    }

    public final void setVip(boolean z) {
        this.isVip = z;
    }

    /* renamed from: isTrial, reason: from getter */
    public final boolean getIsTrial() {
        return this.isTrial;
    }

    public final void setTrial(boolean z) {
        this.isTrial = z;
    }

    public final VipLevel getVipLevel() {
        VipLevel vipLevel = this.vipLevel;
        if (vipLevel != null) {
            return vipLevel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vipLevel");
        return null;
    }

    public final void setVipLevel(VipLevel vipLevel) {
        Intrinsics.checkNotNullParameter(vipLevel, "<set-?>");
        this.vipLevel = vipLevel;
    }

    public final String getSku() {
        return this.sku;
    }

    public final void setSku(String str) {
        this.sku = str;
    }

    public final Date getStartAt() {
        return this.startAt;
    }

    public final void setStartAt(Date date) {
        this.startAt = date;
    }

    public final Date getExpiredAt() {
        return this.expiredAt;
    }

    public final void setExpiredAt(Date date) {
        this.expiredAt = date;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VipInfo(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("user_id") && !obj.isNull("user_id")) {
            this.userId = obj.getLong("user_id");
            if (obj.has("is_vip") && !obj.isNull("is_vip")) {
                this.isVip = parseBoolean(obj, "is_vip").booleanValue();
                if (obj.has("is_trial") && !obj.isNull("is_trial")) {
                    this.isTrial = parseBoolean(obj, "is_trial").booleanValue();
                    if (obj.has("vip_level") && !obj.isNull("vip_level")) {
                        setVipLevel(VipLevel.INSTANCE.fromValue(obj.getInt("vip_level")));
                        if (obj.has(LogEventArguments.ARG_SKU) && !obj.isNull(LogEventArguments.ARG_SKU)) {
                            this.sku = obj.getString(LogEventArguments.ARG_SKU);
                        } else {
                            this.sku = null;
                        }
                        if (obj.has("start_at") && !obj.isNull("start_at")) {
                            this.startAt = new Date(obj.getLong("start_at") * 1000);
                        } else {
                            this.startAt = null;
                        }
                        if (obj.has("expired_at") && !obj.isNull("expired_at")) {
                            this.expiredAt = new Date(obj.getLong("expired_at") * 1000);
                            return;
                        } else {
                            this.expiredAt = null;
                            return;
                        }
                    }
                    throw new ParameterCheckFailException("vipLevel is missing in model VipInfo");
                }
                throw new ParameterCheckFailException("isTrial is missing in model VipInfo");
            }
            throw new ParameterCheckFailException("isVip is missing in model VipInfo");
        }
        throw new ParameterCheckFailException("userId is missing in model VipInfo");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", Long.valueOf(this.userId));
        hashMap.put("is_vip", Integer.valueOf(this.isVip ? 1 : 0));
        hashMap.put("is_trial", Integer.valueOf(this.isTrial ? 1 : 0));
        hashMap.put("vip_level", Integer.valueOf(getVipLevel().getValue()));
        String str = this.sku;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put(LogEventArguments.ARG_SKU, str);
        } else if (keepNull) {
            hashMap.put(LogEventArguments.ARG_SKU, null);
        }
        Date date = this.startAt;
        if (date != null) {
            Intrinsics.checkNotNull(date);
            hashMap.put("start_at", Long.valueOf(date.getTime() / 1000));
        } else if (keepNull) {
            hashMap.put("start_at", null);
        }
        Date date2 = this.expiredAt;
        if (date2 != null) {
            Intrinsics.checkNotNull(date2);
            hashMap.put("expired_at", Long.valueOf(date2.getTime() / 1000));
        } else if (keepNull) {
            hashMap.put("expired_at", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof VipInfo)) {
            return false;
        }
        VipInfo vipInfo = (VipInfo) other;
        return this.userId == vipInfo.userId && this.isVip == vipInfo.isVip && this.isTrial == vipInfo.isTrial && getVipLevel() == vipInfo.getVipLevel() && Intrinsics.areEqual(this.sku, vipInfo.sku) && Intrinsics.areEqual(this.startAt, vipInfo.startAt) && Intrinsics.areEqual(this.expiredAt, vipInfo.expiredAt);
    }

    public int hashCode() {
        int hashCode = ((((((((getClass().hashCode() * 31) + Long.hashCode(this.userId)) * 31) + Boolean.hashCode(this.isVip)) * 31) + Boolean.hashCode(this.isTrial)) * 31) + getVipLevel().hashCode()) * 31;
        String str = this.sku;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Date date = this.startAt;
        int hashCode3 = (hashCode2 + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.expiredAt;
        return hashCode3 + (date2 != null ? date2.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        VipInfo vipInfo = new VipInfo(0, 1, null);
        cloneTo(vipInfo);
        return vipInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo");
        VipInfo vipInfo = (VipInfo) o;
        super.cloneTo(vipInfo);
        vipInfo.userId = cloneField(Long.valueOf(this.userId)).longValue();
        vipInfo.isVip = cloneField(Boolean.valueOf(this.isVip)).booleanValue();
        vipInfo.isTrial = cloneField(Boolean.valueOf(this.isTrial)).booleanValue();
        vipInfo.setVipLevel((VipLevel) cloneField(getVipLevel()));
        String str = this.sku;
        vipInfo.sku = str != null ? cloneField(str) : null;
        Date date = this.startAt;
        vipInfo.startAt = date != null ? cloneField(date) : null;
        Date date2 = this.expiredAt;
        vipInfo.expiredAt = date2 != null ? cloneField(date2) : null;
    }

    /* compiled from: VipInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/vip/VipInfo$Companion;", "", "<init>", "()V", "getVipInfoJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/VipInfo;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getVipInfoJsonArrayMap(List<VipInfo> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VipInfo) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}

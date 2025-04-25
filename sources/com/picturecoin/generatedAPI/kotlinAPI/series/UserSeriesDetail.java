package com.picturecoin.generatedAPI.kotlinAPI.series;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
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

/* compiled from: UserSeriesDetail.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\"0!2\u0006\u0010#\u001a\u00020$J\u0016\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\"0!H\u0016J\u0013\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\"H\u0014J\t\u0010,\u001a\u00020\u0005HÂ\u0003J\u0013\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010.\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0007R\u001a\u0010\u001a\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010¨\u00060"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesDetail;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.uid, "", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", Args.genusUid, "getGenusUid", "setGenusUid", "name", "getName", "setName", "isCollected", "()I", "setCollected", Args.subjectSideUrl, "getSubjectSideUrl", "setSubjectSideUrl", "denominationUrl", "getDenominationUrl", "setDenominationUrl", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class UserSeriesDetail extends APIModelBase<UserSeriesDetail> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String denominationUrl;
    public String genusUid;
    private int isCollected;
    public String name;
    public String subjectSideUrl;
    public String uid;
    private int unused;

    public UserSeriesDetail() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final UserSeriesDetail copy(int unused) {
        return new UserSeriesDetail(unused);
    }

    public String toString() {
        return "UserSeriesDetail(unused=" + this.unused + ")";
    }

    public UserSeriesDetail(int i) {
        this.unused = i;
    }

    public /* synthetic */ UserSeriesDetail(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ UserSeriesDetail copy$default(UserSeriesDetail userSeriesDetail, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userSeriesDetail.unused;
        }
        return userSeriesDetail.copy(i);
    }

    public final String getUid() {
        String str = this.uid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.uid);
        return null;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final String getGenusUid() {
        String str = this.genusUid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.genusUid);
        return null;
    }

    public final void setGenusUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.genusUid = str;
    }

    public final String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("name");
        return null;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    /* renamed from: isCollected, reason: from getter */
    public final int getIsCollected() {
        return this.isCollected;
    }

    public final void setCollected(int i) {
        this.isCollected = i;
    }

    public final String getSubjectSideUrl() {
        String str = this.subjectSideUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.subjectSideUrl);
        return null;
    }

    public final void setSubjectSideUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subjectSideUrl = str;
    }

    public final String getDenominationUrl() {
        String str = this.denominationUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("denominationUrl");
        return null;
    }

    public final void setDenominationUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.denominationUrl = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserSeriesDetail(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(Args.uid) && !obj.isNull(Args.uid)) {
            setUid(obj.getString(Args.uid));
            if (obj.has("genus_uid") && !obj.isNull("genus_uid")) {
                setGenusUid(obj.getString("genus_uid"));
                if (obj.has("name") && !obj.isNull("name")) {
                    setName(obj.getString("name"));
                    if (obj.has("is_collected") && !obj.isNull("is_collected")) {
                        this.isCollected = obj.getInt("is_collected");
                        if (obj.has("subject_side_url") && !obj.isNull("subject_side_url")) {
                            setSubjectSideUrl(obj.getString("subject_side_url"));
                            if (obj.has("denomination_url") && !obj.isNull("denomination_url")) {
                                setDenominationUrl(obj.getString("denomination_url"));
                                return;
                            }
                            throw new ParameterCheckFailException("denominationUrl is missing in model UserSeriesDetail");
                        }
                        throw new ParameterCheckFailException("subjectSideUrl is missing in model UserSeriesDetail");
                    }
                    throw new ParameterCheckFailException("isCollected is missing in model UserSeriesDetail");
                }
                throw new ParameterCheckFailException("name is missing in model UserSeriesDetail");
            }
            throw new ParameterCheckFailException("genusUid is missing in model UserSeriesDetail");
        }
        throw new ParameterCheckFailException("uid is missing in model UserSeriesDetail");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.uid, getUid());
        hashMap.put("genus_uid", getGenusUid());
        hashMap.put("name", getName());
        hashMap.put("is_collected", Integer.valueOf(this.isCollected));
        hashMap.put("subject_side_url", getSubjectSideUrl());
        hashMap.put("denomination_url", getDenominationUrl());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof UserSeriesDetail)) {
            return false;
        }
        UserSeriesDetail userSeriesDetail = (UserSeriesDetail) other;
        return Intrinsics.areEqual(getUid(), userSeriesDetail.getUid()) && Intrinsics.areEqual(getGenusUid(), userSeriesDetail.getGenusUid()) && Intrinsics.areEqual(getName(), userSeriesDetail.getName()) && this.isCollected == userSeriesDetail.isCollected && Intrinsics.areEqual(getSubjectSideUrl(), userSeriesDetail.getSubjectSideUrl()) && Intrinsics.areEqual(getDenominationUrl(), userSeriesDetail.getDenominationUrl());
    }

    public int hashCode() {
        return (((((((((((getClass().hashCode() * 31) + getUid().hashCode()) * 31) + getGenusUid().hashCode()) * 31) + getName().hashCode()) * 31) + Integer.hashCode(this.isCollected)) * 31) + getSubjectSideUrl().hashCode()) * 31) + getDenominationUrl().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        UserSeriesDetail userSeriesDetail = new UserSeriesDetail(0, 1, null);
        cloneTo(userSeriesDetail);
        return userSeriesDetail;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.series.UserSeriesDetail");
        UserSeriesDetail userSeriesDetail = (UserSeriesDetail) o;
        super.cloneTo(userSeriesDetail);
        userSeriesDetail.setUid(cloneField(getUid()));
        userSeriesDetail.setGenusUid(cloneField(getGenusUid()));
        userSeriesDetail.setName(cloneField(getName()));
        userSeriesDetail.isCollected = cloneField(Integer.valueOf(this.isCollected)).intValue();
        userSeriesDetail.setSubjectSideUrl(cloneField(getSubjectSideUrl()));
        userSeriesDetail.setDenominationUrl(cloneField(getDenominationUrl()));
    }

    /* compiled from: UserSeriesDetail.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesDetail$Companion;", "", "<init>", "()V", "getUserSeriesDetailJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesDetail;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getUserSeriesDetailJsonArrayMap(List<UserSeriesDetail> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UserSeriesDetail) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}

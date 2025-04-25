package com.picturecoin.generatedAPI.kotlinAPI.cmsconsumer;

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

/* compiled from: CoinInfo.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bH\u0016J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001cH\u0014J\t\u0010&\u001a\u00020\u0005HÂ\u0003J\u0013\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010(\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/cmsconsumer/CoinInfo;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.uid, "", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "mainImageUrl", "getMainImageUrl", "setMainImageUrl", "commonName", "getCommonName", "setCommonName", Args.indexListUid, "getIndexListUid", "setIndexListUid", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class CoinInfo extends APIModelBase<CoinInfo> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String commonName;
    private String indexListUid;
    public String mainImageUrl;
    public String uid;
    private int unused;

    public CoinInfo() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final CoinInfo copy(int unused) {
        return new CoinInfo(unused);
    }

    public String toString() {
        return "CoinInfo(unused=" + this.unused + ")";
    }

    public CoinInfo(int i) {
        this.unused = i;
    }

    public /* synthetic */ CoinInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ CoinInfo copy$default(CoinInfo coinInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = coinInfo.unused;
        }
        return coinInfo.copy(i);
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

    public final String getMainImageUrl() {
        String str = this.mainImageUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainImageUrl");
        return null;
    }

    public final void setMainImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mainImageUrl = str;
    }

    public final String getCommonName() {
        String str = this.commonName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("commonName");
        return null;
    }

    public final void setCommonName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.commonName = str;
    }

    public final String getIndexListUid() {
        return this.indexListUid;
    }

    public final void setIndexListUid(String str) {
        this.indexListUid = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoinInfo(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(Args.uid) && !obj.isNull(Args.uid)) {
            setUid(obj.getString(Args.uid));
            if (obj.has("main_image_url") && !obj.isNull("main_image_url")) {
                setMainImageUrl(obj.getString("main_image_url"));
                if (obj.has("common_name") && !obj.isNull("common_name")) {
                    setCommonName(obj.getString("common_name"));
                    if (obj.has("index_list_uid") && !obj.isNull("index_list_uid")) {
                        this.indexListUid = obj.getString("index_list_uid");
                        return;
                    } else {
                        this.indexListUid = null;
                        return;
                    }
                }
                throw new ParameterCheckFailException("commonName is missing in model CoinInfo");
            }
            throw new ParameterCheckFailException("mainImageUrl is missing in model CoinInfo");
        }
        throw new ParameterCheckFailException("uid is missing in model CoinInfo");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.uid, getUid());
        hashMap.put("main_image_url", getMainImageUrl());
        hashMap.put("common_name", getCommonName());
        String str = this.indexListUid;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("index_list_uid", str);
        } else if (keepNull) {
            hashMap.put("index_list_uid", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CoinInfo)) {
            return false;
        }
        CoinInfo coinInfo = (CoinInfo) other;
        return Intrinsics.areEqual(getUid(), coinInfo.getUid()) && Intrinsics.areEqual(getMainImageUrl(), coinInfo.getMainImageUrl()) && Intrinsics.areEqual(getCommonName(), coinInfo.getCommonName()) && Intrinsics.areEqual(this.indexListUid, coinInfo.indexListUid);
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + getUid().hashCode()) * 31) + getMainImageUrl().hashCode()) * 31) + getCommonName().hashCode()) * 31;
        String str = this.indexListUid;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CoinInfo coinInfo = new CoinInfo(0, 1, null);
        cloneTo(coinInfo);
        return coinInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.cmsconsumer.CoinInfo");
        CoinInfo coinInfo = (CoinInfo) o;
        super.cloneTo(coinInfo);
        coinInfo.setUid(cloneField(getUid()));
        coinInfo.setMainImageUrl(cloneField(getMainImageUrl()));
        coinInfo.setCommonName(cloneField(getCommonName()));
        String str = this.indexListUid;
        coinInfo.indexListUid = str != null ? cloneField(str) : null;
    }

    /* compiled from: CoinInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/cmsconsumer/CoinInfo$Companion;", "", "<init>", "()V", "getCoinInfoJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/cmsconsumer/CoinInfo;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCoinInfoJsonArrayMap(List<CoinInfo> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CoinInfo) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}

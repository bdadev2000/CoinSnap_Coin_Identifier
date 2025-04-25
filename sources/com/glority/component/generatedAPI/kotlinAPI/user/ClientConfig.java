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
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ClientConfig.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00013B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0006\u0010'\u001a\u00020(J\u0016\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0016J\u0013\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020&H\u0016J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010&H\u0014J\t\u00100\u001a\u00020\u0005HÂ\u0003J\u0013\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u00102\u001a\u00020\u0016HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0007R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "autoUpdate", "Lcom/glority/component/generatedAPI/kotlinAPI/user/AutoUpdate;", "getAutoUpdate", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/AutoUpdate;", "setAutoUpdate", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/AutoUpdate;)V", "expertDefaultCount", "getExpertDefaultCount", "()I", "setExpertDefaultCount", "shareAppUrl", "", "getShareAppUrl", "()Ljava/lang/String;", "setShareAppUrl", "(Ljava/lang/String;)V", "timestamp", "getTimestamp", "setTimestamp", "legalConfig", "Lcom/glority/component/generatedAPI/kotlinAPI/user/LegalConfig;", "getLegalConfig", "()Lcom/glority/component/generatedAPI/kotlinAPI/user/LegalConfig;", "setLegalConfig", "(Lcom/glority/component/generatedAPI/kotlinAPI/user/LegalConfig;)V", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class ClientConfig extends APIModelBase<ClientConfig> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 1;
    public AutoUpdate autoUpdate;
    private int expertDefaultCount;
    public LegalConfig legalConfig;
    private String shareAppUrl;
    private int timestamp;
    private int unused;

    public ClientConfig() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final ClientConfig copy(int unused) {
        return new ClientConfig(unused);
    }

    public String toString() {
        return "ClientConfig(unused=" + this.unused + ")";
    }

    public ClientConfig(int i) {
        this.unused = i;
    }

    public /* synthetic */ ClientConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ ClientConfig copy$default(ClientConfig clientConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = clientConfig.unused;
        }
        return clientConfig.copy(i);
    }

    public final AutoUpdate getAutoUpdate() {
        AutoUpdate autoUpdate = this.autoUpdate;
        if (autoUpdate != null) {
            return autoUpdate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("autoUpdate");
        return null;
    }

    public final void setAutoUpdate(AutoUpdate autoUpdate) {
        Intrinsics.checkNotNullParameter(autoUpdate, "<set-?>");
        this.autoUpdate = autoUpdate;
    }

    public final int getExpertDefaultCount() {
        return this.expertDefaultCount;
    }

    public final void setExpertDefaultCount(int i) {
        this.expertDefaultCount = i;
    }

    public final String getShareAppUrl() {
        return this.shareAppUrl;
    }

    public final void setShareAppUrl(String str) {
        this.shareAppUrl = str;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(int i) {
        this.timestamp = i;
    }

    public final LegalConfig getLegalConfig() {
        LegalConfig legalConfig = this.legalConfig;
        if (legalConfig != null) {
            return legalConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("legalConfig");
        return null;
    }

    public final void setLegalConfig(LegalConfig legalConfig) {
        Intrinsics.checkNotNullParameter(legalConfig, "<set-?>");
        this.legalConfig = legalConfig;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientConfig(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("auto_update") && !obj.isNull("auto_update")) {
            Object obj2 = obj.get("auto_update");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            setAutoUpdate(new AutoUpdate((JSONObject) obj2));
            if (obj.has("expert_default_count") && !obj.isNull("expert_default_count")) {
                this.expertDefaultCount = obj.getInt("expert_default_count");
                if (obj.has("share_app_url") && !obj.isNull("share_app_url")) {
                    this.shareAppUrl = obj.getString("share_app_url");
                } else {
                    this.shareAppUrl = null;
                }
                if (obj.has("timestamp") && !obj.isNull("timestamp")) {
                    this.timestamp = obj.getInt("timestamp");
                    if (obj.has("legal_config") && !obj.isNull("legal_config")) {
                        Object obj3 = obj.get("legal_config");
                        if ((obj3 instanceof JSONArray) && ((JSONArray) obj3).length() == 0) {
                            obj3 = new JSONObject();
                        }
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                        setLegalConfig(new LegalConfig((JSONObject) obj3));
                        return;
                    }
                    throw new ParameterCheckFailException("legalConfig is missing in model ClientConfig");
                }
                throw new ParameterCheckFailException("timestamp is missing in model ClientConfig");
            }
            throw new ParameterCheckFailException("expertDefaultCount is missing in model ClientConfig");
        }
        throw new ParameterCheckFailException("autoUpdate is missing in model ClientConfig");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("auto_update", getAutoUpdate().getJsonMap());
        hashMap.put("expert_default_count", Integer.valueOf(this.expertDefaultCount));
        String str = this.shareAppUrl;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("share_app_url", str);
        } else if (keepNull) {
            hashMap.put("share_app_url", null);
        }
        hashMap.put("timestamp", Integer.valueOf(this.timestamp));
        hashMap.put("legal_config", getLegalConfig().getJsonMap());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof ClientConfig)) {
            return false;
        }
        ClientConfig clientConfig = (ClientConfig) other;
        return Intrinsics.areEqual(getAutoUpdate(), clientConfig.getAutoUpdate()) && this.expertDefaultCount == clientConfig.expertDefaultCount && Intrinsics.areEqual(this.shareAppUrl, clientConfig.shareAppUrl) && this.timestamp == clientConfig.timestamp && Intrinsics.areEqual(getLegalConfig(), clientConfig.getLegalConfig());
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + getAutoUpdate().hashCode()) * 31) + Integer.hashCode(this.expertDefaultCount)) * 31;
        String str = this.shareAppUrl;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.timestamp)) * 31) + getLegalConfig().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        ClientConfig clientConfig = new ClientConfig(0, 1, null);
        cloneTo(clientConfig);
        return clientConfig;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.user.ClientConfig");
        ClientConfig clientConfig = (ClientConfig) o;
        super.cloneTo(clientConfig);
        clientConfig.setAutoUpdate((AutoUpdate) cloneField(getAutoUpdate()));
        clientConfig.expertDefaultCount = cloneField(Integer.valueOf(this.expertDefaultCount)).intValue();
        String str = this.shareAppUrl;
        clientConfig.shareAppUrl = str != null ? cloneField(str) : null;
        clientConfig.timestamp = cloneField(Integer.valueOf(this.timestamp)).intValue();
        clientConfig.setLegalConfig((LegalConfig) cloneField(getLegalConfig()));
    }

    /* compiled from: ClientConfig.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig$Companion;", "", "<init>", "()V", "serialVersionUID", "", "getClientConfigJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/user/ClientConfig;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getClientConfigJsonArrayMap(List<ClientConfig> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ClientConfig) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}

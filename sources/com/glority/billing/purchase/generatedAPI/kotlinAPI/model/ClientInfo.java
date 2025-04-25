package com.glority.billing.purchase.generatedAPI.kotlinAPI.model;

import com.glority.android.core.definition.APIModelBase;
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

/* compiled from: ClientInfo.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0016J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0014J\t\u0010 \u001a\u00020\u0005HÂ\u0003J\u0013\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\"\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006$"}, d2 = {"Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/model/ClientInfo;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "firebaseAppInstanceId", "", "getFirebaseAppInstanceId", "()Ljava/lang/String;", "setFirebaseAppInstanceId", "(Ljava/lang/String;)V", "firebaseSessionId", "getFirebaseSessionId", "setFirebaseSessionId", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class ClientInfo extends APIModelBase<ClientInfo> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String firebaseAppInstanceId;
    private String firebaseSessionId;
    private int unused;

    public ClientInfo() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final ClientInfo copy(int unused) {
        return new ClientInfo(unused);
    }

    public String toString() {
        return "ClientInfo(unused=" + this.unused + ")";
    }

    public ClientInfo(int i) {
        this.unused = i;
    }

    public /* synthetic */ ClientInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ ClientInfo copy$default(ClientInfo clientInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = clientInfo.unused;
        }
        return clientInfo.copy(i);
    }

    public final String getFirebaseAppInstanceId() {
        return this.firebaseAppInstanceId;
    }

    public final void setFirebaseAppInstanceId(String str) {
        this.firebaseAppInstanceId = str;
    }

    public final String getFirebaseSessionId() {
        return this.firebaseSessionId;
    }

    public final void setFirebaseSessionId(String str) {
        this.firebaseSessionId = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientInfo(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("firebase_app_instance_id") && !obj.isNull("firebase_app_instance_id")) {
            this.firebaseAppInstanceId = obj.getString("firebase_app_instance_id");
        } else {
            this.firebaseAppInstanceId = null;
        }
        if (obj.has("firebase_session_id") && !obj.isNull("firebase_session_id")) {
            this.firebaseSessionId = obj.getString("firebase_session_id");
        } else {
            this.firebaseSessionId = null;
        }
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.firebaseAppInstanceId;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("firebase_app_instance_id", str);
        } else if (keepNull) {
            hashMap.put("firebase_app_instance_id", null);
        }
        String str2 = this.firebaseSessionId;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("firebase_session_id", str2);
        } else if (keepNull) {
            hashMap.put("firebase_session_id", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) other;
        return Intrinsics.areEqual(this.firebaseAppInstanceId, clientInfo.firebaseAppInstanceId) && Intrinsics.areEqual(this.firebaseSessionId, clientInfo.firebaseSessionId);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.firebaseAppInstanceId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.firebaseSessionId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        ClientInfo clientInfo = new ClientInfo(0, 1, null);
        cloneTo(clientInfo);
        return clientInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.billing.purchase.generatedAPI.kotlinAPI.model.ClientInfo");
        ClientInfo clientInfo = (ClientInfo) o;
        super.cloneTo(clientInfo);
        String str = this.firebaseAppInstanceId;
        clientInfo.firebaseAppInstanceId = str != null ? cloneField(str) : null;
        String str2 = this.firebaseSessionId;
        clientInfo.firebaseSessionId = str2 != null ? cloneField(str2) : null;
    }

    /* compiled from: ClientInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/model/ClientInfo$Companion;", "", "<init>", "()V", "getClientInfoJsonArrayMap", "", "", "", "array", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/model/ClientInfo;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getClientInfoJsonArrayMap(List<ClientInfo> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ClientInfo) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}

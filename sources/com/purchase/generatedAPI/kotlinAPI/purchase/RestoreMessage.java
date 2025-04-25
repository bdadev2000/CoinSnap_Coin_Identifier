package com.purchase.generatedAPI.kotlinAPI.purchase;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.PaymentType;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.RestorePolicy;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RestoreMessage.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0016J\u0014\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020*0)H\u0016J\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020,0)H\u0016J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010*H\u0016J\b\u00100\u001a\u00020\tH\u0016J\b\u00101\u001a\u00020.H\u0016J\b\u00102\u001a\u00020.H\u0016J\b\u00103\u001a\u00020.H\u0016J\b\u00104\u001a\u00020.H\u0016J\u0013\u00105\u001a\b\u0012\u0004\u0012\u00020\t06H\u0016¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u00109\u001a\u00020:H\u0016J\t\u0010;\u001a\u00020\u0005HÄ\u0003J\t\u0010<\u001a\u00020\u0007HÄ\u0003J\t\u0010=\u001a\u00020\tHÄ\u0003J\t\u0010>\u001a\u00020\u000bHÄ\u0003J1\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010@\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019¨\u0006B"}, d2 = {"Lcom/purchase/generatedAPI/kotlinAPI/purchase/RestoreMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "paymentType", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/PaymentType;", "deviceType", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "receiptData", "", "restorePolicy", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/RestorePolicy;", "<init>", "(Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/PaymentType;Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;Ljava/lang/String;Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/RestorePolicy;)V", "getPaymentType", "()Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/PaymentType;", "setPaymentType", "(Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/PaymentType;)V", "getDeviceType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "setDeviceType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;)V", "getReceiptData", "()Ljava/lang/String;", "setReceiptData", "(Ljava/lang/String;)V", "getRestorePolicy", "()Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/RestorePolicy;", "setRestorePolicy", "(Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/RestorePolicy;)V", "appData", "getAppData", "setAppData", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "component4", "copy", "toString", "Companion", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class RestoreMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String appData;
    private DeviceType deviceType;
    private PaymentType paymentType;
    private String receiptData;
    private RestorePolicy restorePolicy;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final PaymentType getPaymentType() {
        return this.paymentType;
    }

    /* renamed from: component2, reason: from getter */
    protected final DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getReceiptData() {
        return this.receiptData;
    }

    /* renamed from: component4, reason: from getter */
    protected final RestorePolicy getRestorePolicy() {
        return this.restorePolicy;
    }

    public final RestoreMessage copy(PaymentType paymentType, DeviceType deviceType, String receiptData, RestorePolicy restorePolicy) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(receiptData, "receiptData");
        Intrinsics.checkNotNullParameter(restorePolicy, "restorePolicy");
        return new RestoreMessage(paymentType, deviceType, receiptData, restorePolicy);
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
        return "RestoreMessage(paymentType=" + this.paymentType + ", deviceType=" + this.deviceType + ", receiptData=" + this.receiptData + ", restorePolicy=" + this.restorePolicy + ")";
    }

    public static /* synthetic */ RestoreMessage copy$default(RestoreMessage restoreMessage, PaymentType paymentType, DeviceType deviceType, String str, RestorePolicy restorePolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentType = restoreMessage.paymentType;
        }
        if ((i & 2) != 0) {
            deviceType = restoreMessage.deviceType;
        }
        if ((i & 4) != 0) {
            str = restoreMessage.receiptData;
        }
        if ((i & 8) != 0) {
            restorePolicy = restoreMessage.restorePolicy;
        }
        return restoreMessage.copy(paymentType, deviceType, str, restorePolicy);
    }

    protected final PaymentType getPaymentType() {
        return this.paymentType;
    }

    protected final void setPaymentType(PaymentType paymentType) {
        Intrinsics.checkNotNullParameter(paymentType, "<set-?>");
        this.paymentType = paymentType;
    }

    protected final DeviceType getDeviceType() {
        return this.deviceType;
    }

    protected final void setDeviceType(DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "<set-?>");
        this.deviceType = deviceType;
    }

    protected final String getReceiptData() {
        return this.receiptData;
    }

    protected final void setReceiptData(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.receiptData = str;
    }

    protected final RestorePolicy getRestorePolicy() {
        return this.restorePolicy;
    }

    protected final void setRestorePolicy(RestorePolicy restorePolicy) {
        Intrinsics.checkNotNullParameter(restorePolicy, "<set-?>");
        this.restorePolicy = restorePolicy;
    }

    public RestoreMessage(PaymentType paymentType, DeviceType deviceType, String receiptData, RestorePolicy restorePolicy) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(receiptData, "receiptData");
        Intrinsics.checkNotNullParameter(restorePolicy, "restorePolicy");
        this.paymentType = paymentType;
        this.deviceType = deviceType;
        this.receiptData = receiptData;
        this.restorePolicy = restorePolicy;
    }

    public final String getAppData() {
        String str = this.appData;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appData");
        return null;
    }

    public final void setAppData(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appData = str;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("app_data") && !obj.isNull("app_data")) {
            setAppData(obj.getString("app_data"));
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("app_data is missing in api Restore");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put(FirebaseAnalytics.Param.PAYMENT_TYPE, Integer.valueOf(this.paymentType.getValue()));
        hashMap.put("device_type", Integer.valueOf(this.deviceType.getValue()));
        hashMap.put("receipt_data", this.receiptData);
        hashMap.put("restore_policy", Integer.valueOf(this.restorePolicy.getValue()));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof RestoreMessage)) {
            return false;
        }
        RestoreMessage restoreMessage = (RestoreMessage) other;
        return this.paymentType == restoreMessage.paymentType && this.deviceType == restoreMessage.deviceType && Intrinsics.areEqual(this.receiptData, restoreMessage.receiptData) && this.restorePolicy == restoreMessage.restorePolicy;
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
        if (other == null || !(other instanceof RestoreMessage)) {
            return false;
        }
        RestoreMessage restoreMessage = (RestoreMessage) other;
        return this.paymentType == restoreMessage.paymentType && this.deviceType == restoreMessage.deviceType && Intrinsics.areEqual(this.receiptData, restoreMessage.receiptData) && this.restorePolicy == restoreMessage.restorePolicy && Intrinsics.areEqual(getAppData(), restoreMessage.getAppData());
    }

    public int hashCode() {
        return (((((((((getClass().hashCode() * 31) + this.paymentType.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.receiptData.hashCode()) * 31) + this.restorePolicy.hashCode()) * 31) + getAppData().hashCode();
    }

    /* compiled from: RestoreMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/purchase/generatedAPI/kotlinAPI/purchase/RestoreMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/purchase/restore";
        }
    }
}

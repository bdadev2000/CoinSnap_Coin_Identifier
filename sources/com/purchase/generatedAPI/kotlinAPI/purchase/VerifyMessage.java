package com.purchase.generatedAPI.kotlinAPI.purchase;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.PaymentType;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.model.ClientInfo;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.purchase.generatedAPI.kotlinAPI.model.Price;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: VerifyMessage.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u000e\b\u0086\b\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RBC\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u000206H\u0016J\u0014\u00107\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020908H\u0016J\u0014\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020;08H\u0016J\u0012\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u000109H\u0016J\b\u0010?\u001a\u00020\tH\u0016J\b\u0010@\u001a\u00020=H\u0016J\b\u0010A\u001a\u00020=H\u0016J\b\u0010B\u001a\u00020=H\u0016J\b\u0010C\u001a\u00020=H\u0016J\u0013\u0010D\u001a\b\u0012\u0004\u0012\u00020\t0EH\u0016¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010H\u001a\u00020\rH\u0016J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010M\u001a\u00020\rHÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0010HÆ\u0003JS\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\t\u0010Q\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001e¨\u0006S"}, d2 = {"Lcom/purchase/generatedAPI/kotlinAPI/purchase/VerifyMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "paymentType", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/PaymentType;", "deviceType", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", LogEventArguments.ARG_SKU, "", "price", "Lcom/purchase/generatedAPI/kotlinAPI/model/Price;", FirebaseAnalytics.Param.QUANTITY, "", "receiptData", "clientInfo", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/model/ClientInfo;", "<init>", "(Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/PaymentType;Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;Ljava/lang/String;Lcom/purchase/generatedAPI/kotlinAPI/model/Price;ILjava/lang/String;Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/model/ClientInfo;)V", "getPaymentType", "()Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/PaymentType;", "setPaymentType", "(Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/PaymentType;)V", "getDeviceType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "setDeviceType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;)V", "getSku", "()Ljava/lang/String;", "setSku", "(Ljava/lang/String;)V", "getPrice", "()Lcom/purchase/generatedAPI/kotlinAPI/model/Price;", "setPrice", "(Lcom/purchase/generatedAPI/kotlinAPI/model/Price;)V", "getQuantity", "()I", "setQuantity", "(I)V", "getReceiptData", "setReceiptData", "getClientInfo", "()Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/model/ClientInfo;", "setClientInfo", "(Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/model/ClientInfo;)V", "appData", "getAppData", "setAppData", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "toString", "Companion", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class VerifyMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String appData;
    private ClientInfo clientInfo;
    private DeviceType deviceType;
    private PaymentType paymentType;
    private Price price;
    private int quantity;
    private String receiptData;
    private String sku;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    /* renamed from: component2, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component4, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReceiptData() {
        return this.receiptData;
    }

    /* renamed from: component7, reason: from getter */
    public final ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public final VerifyMessage copy(PaymentType paymentType, DeviceType deviceType, String sku, Price price, int quantity, String receiptData, ClientInfo clientInfo) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(receiptData, "receiptData");
        return new VerifyMessage(paymentType, deviceType, sku, price, quantity, receiptData, clientInfo);
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
        return "VerifyMessage(paymentType=" + this.paymentType + ", deviceType=" + this.deviceType + ", sku=" + this.sku + ", price=" + this.price + ", quantity=" + this.quantity + ", receiptData=" + this.receiptData + ", clientInfo=" + this.clientInfo + ")";
    }

    public static /* synthetic */ VerifyMessage copy$default(VerifyMessage verifyMessage, PaymentType paymentType, DeviceType deviceType, String str, Price price, int i, String str2, ClientInfo clientInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            paymentType = verifyMessage.paymentType;
        }
        if ((i2 & 2) != 0) {
            deviceType = verifyMessage.deviceType;
        }
        DeviceType deviceType2 = deviceType;
        if ((i2 & 4) != 0) {
            str = verifyMessage.sku;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            price = verifyMessage.price;
        }
        Price price2 = price;
        if ((i2 & 16) != 0) {
            i = verifyMessage.quantity;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str2 = verifyMessage.receiptData;
        }
        String str4 = str2;
        if ((i2 & 64) != 0) {
            clientInfo = verifyMessage.clientInfo;
        }
        return verifyMessage.copy(paymentType, deviceType2, str3, price2, i3, str4, clientInfo);
    }

    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    public final void setPaymentType(PaymentType paymentType) {
        Intrinsics.checkNotNullParameter(paymentType, "<set-?>");
        this.paymentType = paymentType;
    }

    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final void setDeviceType(DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "<set-?>");
        this.deviceType = deviceType;
    }

    public final String getSku() {
        return this.sku;
    }

    public final void setSku(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final void setPrice(Price price) {
        this.price = price;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final void setQuantity(int i) {
        this.quantity = i;
    }

    public final String getReceiptData() {
        return this.receiptData;
    }

    public final void setReceiptData(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.receiptData = str;
    }

    public final ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public final void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public VerifyMessage(PaymentType paymentType, DeviceType deviceType, String sku, Price price, int i, String receiptData, ClientInfo clientInfo) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(receiptData, "receiptData");
        this.paymentType = paymentType;
        this.deviceType = deviceType;
        this.sku = sku;
        this.price = price;
        this.quantity = i;
        this.receiptData = receiptData;
        this.clientInfo = clientInfo;
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
        throw new ParameterCheckFailException("app_data is missing in api Verify");
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
        hashMap.put(LogEventArguments.ARG_SKU, this.sku);
        Price price = this.price;
        if (price != null) {
            Intrinsics.checkNotNull(price);
            hashMap.put("price", price.getJsonMap());
        }
        hashMap.put(FirebaseAnalytics.Param.QUANTITY, Integer.valueOf(this.quantity));
        hashMap.put("receipt_data", this.receiptData);
        ClientInfo clientInfo = this.clientInfo;
        if (clientInfo != null) {
            Intrinsics.checkNotNull(clientInfo);
            hashMap.put("client_info", clientInfo.getJsonMap());
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof VerifyMessage)) {
            return false;
        }
        VerifyMessage verifyMessage = (VerifyMessage) other;
        return this.paymentType == verifyMessage.paymentType && this.deviceType == verifyMessage.deviceType && Intrinsics.areEqual(this.sku, verifyMessage.sku) && Intrinsics.areEqual(this.price, verifyMessage.price) && this.quantity == verifyMessage.quantity && Intrinsics.areEqual(this.receiptData, verifyMessage.receiptData) && Intrinsics.areEqual(this.clientInfo, verifyMessage.clientInfo);
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
        if (other == null || !(other instanceof VerifyMessage)) {
            return false;
        }
        VerifyMessage verifyMessage = (VerifyMessage) other;
        return this.paymentType == verifyMessage.paymentType && this.deviceType == verifyMessage.deviceType && Intrinsics.areEqual(this.sku, verifyMessage.sku) && Intrinsics.areEqual(this.price, verifyMessage.price) && this.quantity == verifyMessage.quantity && Intrinsics.areEqual(this.receiptData, verifyMessage.receiptData) && Intrinsics.areEqual(this.clientInfo, verifyMessage.clientInfo) && Intrinsics.areEqual(getAppData(), verifyMessage.getAppData());
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + this.paymentType.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.sku.hashCode()) * 31;
        Price price = this.price;
        int hashCode2 = (((((hashCode + (price != null ? price.hashCode() : 0)) * 31) + Integer.hashCode(this.quantity)) * 31) + this.receiptData.hashCode()) * 31;
        ClientInfo clientInfo = this.clientInfo;
        return ((hashCode2 + (clientInfo != null ? clientInfo.hashCode() : 0)) * 31) + getAppData().hashCode();
    }

    /* compiled from: VerifyMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/purchase/generatedAPI/kotlinAPI/purchase/VerifyMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/purchase/verify";
        }
    }
}

package com.glority.android.core.jsbridge;

import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: Message.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/glority/android/core/jsbridge/Message;", "", "()V", "callbackId", "", "getCallbackId", "()Ljava/lang/String;", "setCallbackId", "(Ljava/lang/String;)V", "data", "getData", "setData", "handlerName", "getHandlerName", "setHandlerName", "responseData", "getResponseData", "setResponseData", "responseId", "getResponseId", "setResponseId", "toJson", "Companion", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class Message {
    private String callbackId;
    private String data;
    private String handlerName;
    private String responseData = "";
    private String responseId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String CALLBACK_ID_STR = "callbackId";
    private static final String RESPONSE_ID_STR = "responseId";
    private static final String RESPONSE_DATA_STR = "responseData";
    private static final String DATA_STR = "data";
    private static final String HANDLER_NAME_STR = "handlerName";

    public final String getCallbackId() {
        return this.callbackId;
    }

    public final void setCallbackId(String str) {
        this.callbackId = str;
    }

    public final String getResponseId() {
        return this.responseId;
    }

    public final void setResponseId(String str) {
        this.responseId = str;
    }

    public final String getResponseData() {
        return this.responseData;
    }

    public final void setResponseData(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.responseData = str;
    }

    public final String getData() {
        return this.data;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final String getHandlerName() {
        return this.handlerName;
    }

    public final void setHandlerName(String str) {
        this.handlerName = str;
    }

    public final String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CALLBACK_ID_STR, this.callbackId);
            jSONObject.put(DATA_STR, this.data);
            jSONObject.put(HANDLER_NAME_STR, this.handlerName);
            String str = this.responseData;
            if (TextUtils.isEmpty(str)) {
                jSONObject.put(RESPONSE_DATA_STR, str);
            } else {
                jSONObject.put(RESPONSE_DATA_STR, new JSONTokener(str).nextValue());
            }
            jSONObject.put(RESPONSE_DATA_STR, this.responseData);
            jSONObject.put(RESPONSE_ID_STR, this.responseId);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* compiled from: Message.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/glority/android/core/jsbridge/Message$Companion;", "", "()V", "CALLBACK_ID_STR", "", "DATA_STR", "HANDLER_NAME_STR", "RESPONSE_DATA_STR", "RESPONSE_ID_STR", "toArrayList", "", "Lcom/glority/android/core/jsbridge/Message;", "jsonStr", "toObject", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Message toObject(String jsonStr) {
            String str;
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            Message message = new Message();
            try {
                JSONObject jSONObject = new JSONObject(jsonStr);
                message.setHandlerName(jSONObject.has(Message.HANDLER_NAME_STR) ? jSONObject.getString(Message.HANDLER_NAME_STR) : null);
                message.setCallbackId(jSONObject.has(Message.CALLBACK_ID_STR) ? jSONObject.getString(Message.CALLBACK_ID_STR) : null);
                if (jSONObject.has(Message.RESPONSE_DATA_STR)) {
                    str = jSONObject.getString(Message.RESPONSE_DATA_STR);
                    Intrinsics.checkNotNullExpressionValue(str, "jsonObject.getString(RESPONSE_DATA_STR)");
                } else {
                    str = "";
                }
                message.setResponseData(str);
                message.setResponseId(jSONObject.has(Message.RESPONSE_ID_STR) ? jSONObject.getString(Message.RESPONSE_ID_STR) : null);
                message.setData(jSONObject.has(Message.DATA_STR) ? jSONObject.getString(Message.DATA_STR) : null);
                return message;
            } catch (JSONException e) {
                e.printStackTrace();
                return message;
            }
        }

        public final List<Message> toArrayList(String jsonStr) {
            String str;
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(jsonStr);
                int length = jSONArray.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        Message message = new Message();
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        message.setHandlerName(jSONObject.has(Message.HANDLER_NAME_STR) ? jSONObject.getString(Message.HANDLER_NAME_STR) : null);
                        message.setCallbackId(jSONObject.has(Message.CALLBACK_ID_STR) ? jSONObject.getString(Message.CALLBACK_ID_STR) : null);
                        if (jSONObject.has(Message.RESPONSE_DATA_STR)) {
                            str = jSONObject.getString(Message.RESPONSE_DATA_STR);
                            Intrinsics.checkNotNullExpressionValue(str, "jsonObject.getString(RESPONSE_DATA_STR)");
                        } else {
                            str = "";
                        }
                        message.setResponseData(str);
                        message.setResponseId(jSONObject.has(Message.RESPONSE_ID_STR) ? jSONObject.getString(Message.RESPONSE_ID_STR) : null);
                        message.setData(jSONObject.has(Message.DATA_STR) ? jSONObject.getString(Message.DATA_STR) : null);
                        arrayList.add(message);
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return arrayList;
        }
    }
}

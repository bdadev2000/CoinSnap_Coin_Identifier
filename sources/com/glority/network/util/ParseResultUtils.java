package com.glority.network.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.xx.constants.LogEvents;
import com.glority.network.exception.APIException;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ParseResultUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u0004\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/network/util/ParseResultUtils;", "", "()V", "parseResult", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/core/definition/APIDefinition;", LogEvents.result, "", LogEventArguments.ARG_MESSAGE, "parseResult$fwk_network_release", "(Ljava/lang/String;Lcom/glority/android/core/definition/APIDefinition;)V", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class ParseResultUtils {
    public static final ParseResultUtils INSTANCE = new ParseResultUtils();

    private ParseResultUtils() {
    }

    public final <T extends APIDefinition> void parseResult$fwk_network_release(String result, T message) throws Exception {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(message, "message");
        JSONObject jSONObject2 = new JSONObject(result);
        if (jSONObject2.getInt(LogEvents.result) != 1) {
            throw new APIException(message.getClass().getSimpleName(), jSONObject2.getString(LogEventArguments.ARG_MESSAGE), jSONObject2.getInt(LogEvents.result));
        }
        Object obj = jSONObject2.get("response");
        if (obj instanceof String) {
            jSONObject = new JSONObject((String) obj);
            LogUtils.json(jSONObject.toString());
        } else if ((obj instanceof JSONArray) && ((JSONArray) obj).length() == 0) {
            jSONObject = new JSONObject();
        } else if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else {
            throw new JSONException("Invalid json response");
        }
        message.updateWithJson(jSONObject);
    }
}

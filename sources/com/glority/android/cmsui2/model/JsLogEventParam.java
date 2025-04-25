package com.glority.android.cmsui2.model;

import android.os.Bundle;
import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.utils.stability.LogUtils;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsLogEventParam.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/glority/android/cmsui2/model/JsLogEventParam;", "Lcom/glority/android/cmsui2/model/JsBaseParam;", "<init>", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "parameters", "Landroid/os/Bundle;", "getParameters", "()Landroid/os/Bundle;", "setParameters", "(Landroid/os/Bundle;)V", "update", "obj", "Lorg/json/JSONObject;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class JsLogEventParam extends JsBaseParam {
    private String eventName;
    private Bundle parameters = LogEventArgumentsKt.logEventBundleOf(new Pair[0]);

    @Override // com.glority.android.cmsui2.model.JsBaseParam
    public Object clone() {
        return super.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final void setEventName(String str) {
        this.eventName = str;
    }

    public final Bundle getParameters() {
        return this.parameters;
    }

    public final void setParameters(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.parameters = bundle;
    }

    public final JsLogEventParam update(JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.eventName = obj.has("eventName") ? obj.optString("eventName") : null;
        if (obj.has("parameters")) {
            Object opt = obj.opt("parameters");
            String str = opt instanceof String ? (String) opt : null;
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        LogEventArgumentsKt.logEventBundleAdd(this.parameters, TuplesKt.to(next, jSONObject.get(next)));
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        }
        setRawJson(obj.toString());
        return this;
    }
}

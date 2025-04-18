package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wXo implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene YFl;

    public wXo(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.YFl = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i10) {
        Ne.YFl(1, this.YFl, i10);
        return com.bytedance.sdk.component.utils.YFl.YFl(jSONObject);
    }
}

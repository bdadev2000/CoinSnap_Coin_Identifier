package com.glority.android.core.definition;

import java.io.File;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface APIDefinition extends Serializable {
    String api();

    boolean binaryResponse();

    boolean forceHttps();

    Map<String, File> getFiles();

    Map<String, Object> getParams();

    String[] methods();

    boolean mustAuth();

    boolean needAuth();

    boolean requestEquals(Object obj);

    void updateWithBinary(byte[] bArr) throws Exception;

    void updateWithJson(JSONObject jSONObject) throws Exception;
}

package com.applovin.impl;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes.dex */
abstract class i3 {
    private static String a(String str) {
        return str.replace(SignatureVisitor.EXTENDS, SignatureVisitor.SUPER).replace('/', '_');
    }

    private static String b(String str) {
        return str.replace(SignatureVisitor.SUPER, SignatureVisitor.EXTENDS).replace('_', '/');
    }

    public static byte[] a(byte[] bArr) {
        return xp.f27962a >= 27 ? bArr : xp.c(a(xp.a(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (xp.f27962a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(xp.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (i2 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                sb.append("{\"k\":\"");
                sb.append(b(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return xp.c(sb.toString());
        } catch (JSONException e) {
            pc.a("ClearKeyUtil", "Failed to adjust response data: " + xp.a(bArr), e);
            return bArr;
        }
    }
}

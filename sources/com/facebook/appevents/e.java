package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final HashSet f10931h;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f10932b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10933c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10934d;

    /* renamed from: f, reason: collision with root package name */
    public final String f10935f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10936g;

    static {
        new com.facebook.b(13, 0);
        f10931h = new HashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(java.lang.String r9, java.lang.String r10, java.lang.Double r11, android.os.Bundle r12, boolean r13, boolean r14, java.util.UUID r15) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.e.<init>(java.lang.String, java.lang.String, java.lang.Double, android.os.Bundle, boolean, boolean, java.util.UUID):void");
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.f10932b.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return new d(jSONObject, this.f10936g, this.f10933c, this.f10934d);
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        JSONObject jSONObject = this.f10932b;
        return com.applovin.impl.mediation.ads.e.h(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.f10933c), jSONObject.toString()}, 3, "\"%s\", implicit: %b, json: %s", "java.lang.String.format(format, *args)");
    }

    public e(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f10932b = jSONObject;
        this.f10933c = z10;
        String optString = jSONObject.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f10935f = optString;
        this.f10936g = str2;
        this.f10934d = z11;
    }
}

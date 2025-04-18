package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class VastProperties {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f12139b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12140c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f12141d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.a = z10;
        this.f12139b = f10;
        this.f12140c = z11;
        this.f12141d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.a);
            if (this.a) {
                jSONObject.put("skipOffset", this.f12139b);
            }
            jSONObject.put("autoPlay", this.f12140c);
            jSONObject.put("position", this.f12141d);
        } catch (JSONException e2) {
            d.a("VastProperties: JSON error", e2);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f12141d;
    }

    public Float getSkipOffset() {
        return this.f12139b;
    }

    public boolean isAutoPlay() {
        return this.f12140c;
    }

    public boolean isSkippable() {
        return this.a;
    }
}

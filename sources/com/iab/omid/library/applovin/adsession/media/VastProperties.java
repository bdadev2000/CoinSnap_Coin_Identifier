package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14398a;
    private final Float b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14399c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f14400d;

    private VastProperties(boolean z8, Float f9, boolean z9, Position position) {
        this.f14398a = z8;
        this.b = f9;
        this.f14399c = z9;
        this.f14400d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z8, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z8, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f9, boolean z8, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f9), z8, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f14398a);
            if (this.f14398a) {
                jSONObject.put("skipOffset", this.b);
            }
            jSONObject.put("autoPlay", this.f14399c);
            jSONObject.put("position", this.f14400d);
        } catch (JSONException e4) {
            d.a("VastProperties: JSON error", e4);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f14400d;
    }

    public Float getSkipOffset() {
        return this.b;
    }

    public boolean isAutoPlay() {
        return this.f14399c;
    }

    public boolean isSkippable() {
        return this.f14398a;
    }
}

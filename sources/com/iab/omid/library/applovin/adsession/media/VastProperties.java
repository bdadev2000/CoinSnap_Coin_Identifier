package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28940a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f28941b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28942c;
    private final Position d;

    private VastProperties(boolean z2, Float f2, boolean z3, Position position) {
        this.f28940a = z2;
        this.f28941b = f2;
        this.f28942c = z3;
        this.d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z2, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z2, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f2, boolean z2, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f2), z2, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f28940a);
            if (this.f28940a) {
                jSONObject.put("skipOffset", this.f28941b);
            }
            jSONObject.put("autoPlay", this.f28942c);
            jSONObject.put("position", this.d);
        } catch (JSONException e) {
            d.a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.d;
    }

    public Float getSkipOffset() {
        return this.f28941b;
    }

    public boolean isAutoPlay() {
        return this.f28942c;
    }

    public boolean isSkippable() {
        return this.f28940a;
    }
}

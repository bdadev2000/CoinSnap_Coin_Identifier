package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinExtras;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public class ea {

    /* renamed from: a, reason: collision with root package name */
    private final Map f23670a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f23671b;

    public ea(Map map, com.applovin.impl.sdk.j jVar) {
        this.f23670a = map == null ? Collections.emptyMap() : map;
        this.f23671b = jVar;
    }

    public Drawable a() {
        Object obj = this.f23670a.get(AppLovinExtras.Keys.KEY_WATERMARK);
        if (!a(obj)) {
            this.f23671b.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23671b.J().b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] decode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.j.l().getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.f23671b.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23671b.J().a("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }

    public boolean c() {
        return a(this.f23670a.get(AppLovinExtras.Keys.KEY_WATERMARK));
    }

    private boolean a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}

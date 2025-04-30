package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinExtras;
import java.util.Map;

/* loaded from: classes.dex */
public class ca {

    /* renamed from: a, reason: collision with root package name */
    private final Map f7062a;
    private final com.applovin.impl.sdk.k b;

    public ca(Map map, com.applovin.impl.sdk.k kVar) {
        this.f7062a = map;
        this.b = kVar;
    }

    public Drawable a() {
        Object obj = this.f7062a.get(AppLovinExtras.Keys.KEY_WATERMARK);
        if (!a(obj)) {
            this.b.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.b.L().b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] decode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.k.k().getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.b.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.b.L().a("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }

    public boolean c() {
        return a(this.f7062a.get(AppLovinExtras.Keys.KEY_WATERMARK));
    }

    private boolean a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}

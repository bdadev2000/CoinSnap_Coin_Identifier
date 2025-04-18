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
    private final Map a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4079b;

    public ca(Map map, com.applovin.impl.sdk.k kVar) {
        this.a = map;
        this.f4079b = kVar;
    }

    public Drawable a() {
        Object obj = this.a.get(AppLovinExtras.Keys.KEY_WATERMARK);
        if (!a(obj)) {
            this.f4079b.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f4079b.L().b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] decode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.k.k().getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th2) {
            this.f4079b.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f4079b.L().a("GoogleWatermarkGenerator", "Failed to render watermark", th2);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }

    public boolean c() {
        return a(this.a.get(AppLovinExtras.Keys.KEY_WATERMARK));
    }

    private boolean a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}

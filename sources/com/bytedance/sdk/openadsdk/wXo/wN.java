package com.bytedance.sdk.openadsdk.wXo;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN implements AlY {
    private AlY Sg;
    Handler YFl = null;

    public wN(AlY alY) {
        this.Sg = alY;
    }

    private Context qsH() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            return (Application) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.wXo.AlY
    public Handler AlY() {
        AlY alY = this.Sg;
        if (alY != null && alY.DSW() != null) {
            return this.Sg.AlY();
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.YFl = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.wXo.AlY
    public Map<String, String> DSW() {
        AlY alY = this.Sg;
        if (alY != null && alY.DSW() != null) {
            return this.Sg.DSW();
        }
        return new HashMap();
    }

    @Override // com.bytedance.sdk.openadsdk.wXo.AlY
    public Context Sg() {
        AlY alY = this.Sg;
        if (alY != null && alY.Sg() != null) {
            return this.Sg.Sg();
        }
        return qsH();
    }

    @Override // com.bytedance.sdk.openadsdk.wXo.AlY
    public ExecutorService YFl() {
        AlY alY = this.Sg;
        if (alY != null && alY.YFl() != null) {
            return this.Sg.YFl();
        }
        return Executors.newCachedThreadPool();
    }

    @Override // com.bytedance.sdk.openadsdk.wXo.AlY
    public String tN() {
        AlY alY = this.Sg;
        if (alY != null && !TextUtils.isEmpty(alY.tN())) {
            return this.Sg.tN();
        }
        return AbstractJsonLexerKt.NULL;
    }

    @Override // com.bytedance.sdk.openadsdk.wXo.AlY
    public JSONObject vc() {
        AlY alY = this.Sg;
        if (alY != null) {
            return alY.vc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.wXo.AlY
    public String wN() {
        AlY alY = this.Sg;
        if (alY != null) {
            return alY.wN();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.wXo.AlY
    public JSONObject YFl(JSONObject jSONObject) {
        AlY alY = this.Sg;
        return alY != null ? alY.YFl(jSONObject) : jSONObject;
    }
}

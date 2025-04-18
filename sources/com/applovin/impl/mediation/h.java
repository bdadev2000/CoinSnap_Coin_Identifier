package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.applovin.impl.de;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.w4;
import com.vungle.ads.a1;
import com.vungle.ads.internal.y0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6219c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6220d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6222g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6223h;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f6218b = i10;
        this.f6219c = obj;
        this.f6220d = obj2;
        this.f6221f = obj3;
        this.f6222g = obj4;
        this.f6223h = obj5;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.lang.String] */
    @Override // java.lang.Runnable
    public final void run() {
        BufferedReader bufferedReader;
        int i10 = this.f6218b;
        Object obj = this.f6223h;
        Object obj2 = this.f6222g;
        Object obj3 = this.f6221f;
        Object obj4 = this.f6220d;
        Object obj5 = this.f6219c;
        switch (i10) {
            case 0:
                MediationServiceImpl.a((MediationServiceImpl) obj5, (de) obj4, (g) obj3, (Activity) obj2, (a.InterfaceC0023a) obj);
                return;
            case 1:
                w4.f((w4) obj5, (View) obj4, (FrameLayout) obj3, (ViewTreeObserver) obj2, (ViewTreeObserver.OnGlobalLayoutListener) obj);
                return;
            case 2:
                URL openIdKeyUrl = (URL) obj5;
                Ref.ObjectRef result = (Ref.ObjectRef) obj4;
                String kid = (String) obj3;
                ReentrantLock lock = (ReentrantLock) obj2;
                Condition condition = (Condition) obj;
                Intrinsics.checkNotNullParameter(openIdKeyUrl, "$openIdKeyUrl");
                Intrinsics.checkNotNullParameter(result, "$result");
                Intrinsics.checkNotNullParameter(kid, "$kid");
                Intrinsics.checkNotNullParameter(lock, "$lock");
                URLConnection openConnection = openIdKeyUrl.openConnection();
                if (openConnection != null) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    try {
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            Intrinsics.checkNotNullExpressionValue(inputStream, "connection.inputStream");
                            Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                            if (inputStreamReader instanceof BufferedReader) {
                                bufferedReader = (BufferedReader) inputStreamReader;
                            } else {
                                bufferedReader = new BufferedReader(inputStreamReader, 8192);
                            }
                            String readText = TextStreamsKt.readText(bufferedReader);
                            httpURLConnection.getInputStream().close();
                            result.element = new JSONObject(readText).optString(kid);
                            httpURLConnection.disconnect();
                            lock.lock();
                            try {
                                condition.signal();
                                Unit unit = Unit.INSTANCE;
                            } finally {
                            }
                        } catch (Throwable th2) {
                            httpURLConnection.disconnect();
                            lock.lock();
                            try {
                                condition.signal();
                                Unit unit2 = Unit.INSTANCE;
                                throw th2;
                            } finally {
                            }
                        }
                    } catch (Exception e2) {
                        String name = p6.a.class.getName();
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "Error getting public key";
                        }
                        Log.d(name, message);
                        httpURLConnection.disconnect();
                        lock.lock();
                        try {
                            condition.signal();
                            Unit unit3 = Unit.INSTANCE;
                        } finally {
                        }
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            case 3:
                com.vungle.ads.s.m116logError$lambda2((com.vungle.ads.internal.protos.g) obj5, (String) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            default:
                y0.c((Context) obj5, (String) obj4, (y0) obj3, (a1) obj2, (Lazy) obj);
                return;
        }
    }
}

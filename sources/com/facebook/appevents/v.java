package com.facebook.appevents;

import android.content.SharedPreferences;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10976b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10977c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10978d;

    public /* synthetic */ v(String str, String str2, int i10) {
        this.f10976b = i10;
        this.f10977c = str;
        this.f10978d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10976b;
        String buttonText = this.f10978d;
        String queriedEvent = this.f10977c;
        switch (i10) {
            case 0:
                if (!m6.a.b(w.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(queriedEvent, "$key");
                        Intrinsics.checkNotNullParameter(buttonText, "$value");
                        if (!w.f10980c.get()) {
                            w.a.b();
                        }
                        SharedPreferences sharedPreferences = w.f10979b;
                        if (sharedPreferences != null) {
                            sharedPreferences.edit().putString(queriedEvent, buttonText).apply();
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                            throw null;
                        }
                    } catch (Throwable th2) {
                        m6.a.a(w.class, th2);
                        return;
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(queriedEvent, "$queriedEvent");
                Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
                HashSet hashSet = g6.f.f18223g;
                com.facebook.c.E(queriedEvent, buttonText, new float[0]);
                return;
        }
    }
}

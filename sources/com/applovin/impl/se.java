package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* loaded from: classes.dex */
public class se {

    /* renamed from: a, reason: collision with root package name */
    private a f11186a;
    private String b;

    /* loaded from: classes.dex */
    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    private se(a aVar, String str) {
        this.f11186a = aVar;
        this.b = str;
    }

    public a a() {
        return this.f11186a;
    }

    public String b() {
        return this.b;
    }

    public static se a(be beVar) {
        String Q8 = beVar.Q();
        if (TextUtils.isEmpty(Q8)) {
            return null;
        }
        return new se(a.AD, Q8);
    }

    public static se a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new se(a.AD_FORMAT, label);
    }

    public static se a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new se(a.AD_UNIT_ID, str);
    }
}

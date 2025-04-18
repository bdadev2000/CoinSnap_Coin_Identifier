package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* loaded from: classes3.dex */
public class xe {

    /* renamed from: a, reason: collision with root package name */
    private a f27905a;

    /* renamed from: b, reason: collision with root package name */
    private String f27906b;

    /* loaded from: classes3.dex */
    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    private xe(a aVar, String str) {
        this.f27905a = aVar;
        this.f27906b = str;
    }

    public a a() {
        return this.f27905a;
    }

    public String b() {
        return this.f27906b;
    }

    public static xe a(ge geVar) {
        String S = geVar.S();
        if (TextUtils.isEmpty(S)) {
            return null;
        }
        return new xe(a.AD, S);
    }

    public static xe a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new xe(a.AD_FORMAT, label);
    }

    public static xe a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new xe(a.AD_UNIT_ID, str);
    }
}

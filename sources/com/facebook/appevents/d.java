package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 20160803001L;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13474c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13475d;

    /* renamed from: f, reason: collision with root package name */
    public final String f13476f;

    public d(String str, String str2, boolean z8, boolean z9) {
        this.b = str;
        this.f13474c = z8;
        this.f13475d = z9;
        this.f13476f = str2;
    }

    private final Object readResolve() throws JSONException, ObjectStreamException {
        return new e(this.b, this.f13476f, this.f13474c, this.f13475d);
    }
}

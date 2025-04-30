package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class a implements Serializable {
    private static final long serialVersionUID = -2488473066578201069L;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13470c;

    public a(String str, String str2) {
        this.b = str;
        this.f13470c = str2;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new b(this.b, this.f13470c);
    }
}

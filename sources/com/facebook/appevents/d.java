package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 20160803001L;

    /* renamed from: b, reason: collision with root package name */
    public final String f10927b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10928c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10929d;

    /* renamed from: f, reason: collision with root package name */
    public final String f10930f;

    public d(String jsonString, String str, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        this.f10927b = jsonString;
        this.f10928c = z10;
        this.f10929d = z11;
        this.f10930f = str;
    }

    private final Object readResolve() throws JSONException, ObjectStreamException {
        return new e(this.f10927b, this.f10928c, this.f10929d, this.f10930f);
    }
}

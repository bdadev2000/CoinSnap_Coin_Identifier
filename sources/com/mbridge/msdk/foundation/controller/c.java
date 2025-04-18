package com.mbridge.msdk.foundation.controller;

import com.mbridge.msdk.foundation.controller.a;

/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f13049f;

    private c() {
    }

    public static c m() {
        if (f13049f == null) {
            synchronized (c.class) {
                if (f13049f == null) {
                    f13049f = new c();
                }
            }
        }
        return f13049f;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    public final void a(a.InterfaceC0168a interfaceC0168a) {
    }
}

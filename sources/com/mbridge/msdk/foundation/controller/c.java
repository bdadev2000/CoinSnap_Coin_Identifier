package com.mbridge.msdk.foundation.controller;

import com.mbridge.msdk.foundation.controller.a;

/* loaded from: classes3.dex */
public class c extends a {

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f15406f;

    private c() {
    }

    public static c m() {
        if (f15406f == null) {
            synchronized (c.class) {
                try {
                    if (f15406f == null) {
                        f15406f = new c();
                    }
                } finally {
                }
            }
        }
        return f15406f;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    public final void a(a.InterfaceC0156a interfaceC0156a) {
    }
}

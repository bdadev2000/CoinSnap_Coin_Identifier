package com.mbridge.msdk.dycreator.b;

import a4.j;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class a {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private String f12658b;

    public a(b bVar) {
        if (bVar != null) {
            this.a = bVar.a();
            this.f12658b = bVar.b();
        }
    }

    public final String toString() {
        return j.i(new StringBuilder("DyError{errorCode="), this.a, AbstractJsonLexerKt.END_OBJ);
    }

    public a(int i10, String str) {
        this.a = i10;
        this.f12658b = str;
    }
}

package vc;

import com.google.gson.reflect.TypeToken;
import java.util.Date;

/* loaded from: classes3.dex */
public final class e implements com.google.gson.d0 {
    @Override // com.google.gson.d0
    public final com.google.gson.c0 a(com.google.gson.n nVar, TypeToken typeToken) {
        if (typeToken.a == Date.class) {
            return new h();
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}

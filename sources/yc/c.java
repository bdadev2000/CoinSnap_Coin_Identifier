package yc;

import com.google.gson.c0;
import com.google.gson.d0;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.sql.Time;

/* loaded from: classes3.dex */
public final class c implements d0 {
    @Override // com.google.gson.d0
    public final c0 a(n nVar, TypeToken typeToken) {
        if (typeToken.a == Time.class) {
            return new d(0);
        }
        return null;
    }
}

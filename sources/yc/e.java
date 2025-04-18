package yc;

import com.google.gson.c0;
import com.google.gson.d0;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes3.dex */
public final class e implements d0 {
    @Override // com.google.gson.d0
    public final c0 a(n nVar, TypeToken typeToken) {
        if (typeToken.a == Timestamp.class) {
            nVar.getClass();
            return new f(nVar.c(new TypeToken(Date.class)));
        }
        return null;
    }
}

package k4;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class t implements q {

    /* renamed from: b, reason: collision with root package name */
    public final Map f20261b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f20262c;

    public t(Map map) {
        this.f20261b = Collections.unmodifiableMap(map);
    }

    @Override // k4.q
    public final Map a() {
        if (this.f20262c == null) {
            synchronized (this) {
                if (this.f20262c == null) {
                    this.f20262c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f20262c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f20261b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = ((s) list.get(i10)).a;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    if (i10 != list.size() - 1) {
                        sb2.append(AbstractJsonLexerKt.COMMA);
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(entry.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f20261b.equals(((t) obj).f20261b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20261b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f20261b + AbstractJsonLexerKt.END_OBJ;
    }
}

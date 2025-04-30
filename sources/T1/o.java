package T1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class o implements l {
    public final Map b = Collections.unmodifiableMap(m.f2983a);

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f2985c;

    @Override // T1.l
    public final Map a() {
        if (this.f2985c == null) {
            synchronized (this) {
                try {
                    if (this.f2985c == null) {
                        this.f2985c = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.f2985c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                String str = ((n) list.get(i9)).f2984a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i9 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.b.equals(((o) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.b + '}';
    }
}

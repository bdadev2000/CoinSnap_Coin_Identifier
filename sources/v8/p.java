package v8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicLong f26222b = new AtomicLong();
    public final Map a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(long j3, m9.p pVar, long j10) {
        this(Collections.emptyMap());
        Uri uri = pVar.a;
    }

    public p(Map map) {
        this.a = map;
    }
}

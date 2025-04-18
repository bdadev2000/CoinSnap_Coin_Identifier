package a1;

import b1.f0;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f62b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f63c;
    public static final c d;

    /* renamed from: f, reason: collision with root package name */
    public static final c f64f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f65g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f66h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c[] f67i;

    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f68a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f62b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f63c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f64f = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f65g = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        f66h = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f67i = cVarArr;
        f0.l(cVarArr);
    }

    public c(String str, int i2, TimeUnit timeUnit) {
        this.f68a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f67i.clone();
    }
}
